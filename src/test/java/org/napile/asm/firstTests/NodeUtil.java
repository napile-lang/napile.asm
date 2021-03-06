/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.napile.asm.firstTests;

import java.util.Arrays;
import java.util.Collections;

import org.napile.asm.AsmConstants;
import org.napile.asm.Modifier;
import org.napile.asm.lib.NapileLangPackage;
import org.napile.asm.resolve.name.Name;
import org.napile.asm.tree.members.ClassNode;
import org.napile.asm.tree.members.CodeInfo;
import org.napile.asm.tree.members.MethodNode;
import org.napile.asm.tree.members.MethodParameterNode;
import org.napile.asm.tree.members.TypeParameterNode;
import org.napile.asm.tree.members.VariableNode;
import org.napile.asm.tree.members.bytecode.Instruction;
import org.napile.asm.tree.members.bytecode.InstructionInCodePosition;
import org.napile.asm.tree.members.bytecode.MethodRef;
import org.napile.asm.tree.members.bytecode.adapter.InstructionAdapter;
import org.napile.asm.tree.members.types.TypeNode;
import org.napile.asm.tree.members.types.constructors.ClassTypeNode;
import org.napile.asm.tree.members.types.constructors.MethodTypeNode;
import org.napile.asm.tree.members.types.constructors.MultiTypeNode;
import org.napile.asm.tree.members.types.constructors.ThisTypeNode;

/**
 * @author VISTALL
 * @date 1:12/14.08.12
 */
public class NodeUtil
{
	static ClassNode createTestClassNode()
	{
		ClassNode classNode = new ClassNode(Modifier.list(Modifier.ABSTRACT), NapileLangPackage.INT).visitSuper(AsmConstants.ANY_TYPE);
		TypeParameterNode typeParameterNode = classNode.visitTypeParameter(Name.identifier("E"));
		typeParameterNode.constructors.add(Arrays.asList(new MethodParameterNode(Modifier.EMPTY, Name.identifier("test"), AsmConstants.INT_TYPE), new MethodParameterNode(Modifier.EMPTY, Name.identifier("test2"), new TypeNode(false, new ClassTypeNode(NapileLangPackage.EXCEPTION)))));
		typeParameterNode.constructors.add(Arrays.asList(new MethodParameterNode(Modifier.EMPTY, Name.identifier("test3"), new TypeNode(true, new ClassTypeNode(NapileLangPackage.EXCEPTION))), new MethodParameterNode(Modifier.EMPTY, Name.identifier("test4"), new TypeNode(false, new ClassTypeNode(NapileLangPackage.STRING)))));

		MethodNode methodNode = new MethodNode(Modifier.list(Modifier.STATIC), Name.identifier("main"), new TypeNode(false, new ThisTypeNode()));
		methodNode.typeParameters.add(new TypeParameterNode(Name.identifier("E")));
		methodNode.parameters.add(new MethodParameterNode(Modifier.list(Modifier.FINAL), Name.identifier("arg"), AsmConstants.ARRAY__STRING__TYPE, "napile.util.ArrayUtil.EMPTY"));

		InstructionAdapter a = new InstructionAdapter();
		setPosition(a.invokeStatic(new MethodRef(NapileLangPackage.ANY.child(Name.identifier("equals")), Collections.<MethodParameterNode>emptyList(), Collections.<TypeNode>emptyList(), AsmConstants.BOOL_TYPE), true));
		methodNode.code = new CodeInfo(a);
		classNode.addMember(methodNode);

		VariableNode variableNode = new VariableNode(Modifier.list(Modifier.NATIVE), Name.identifier("myVar"), AsmConstants.INT_TYPE);
		classNode.addMember(variableNode);

		MethodTypeNode methodTypeNode = new MethodTypeNode();
		methodTypeNode.parameters.add(new MethodParameterNode(Modifier.EMPTY, Name.identifier("p1"), AsmConstants.BOOL_TYPE));

		MethodNode methodNode2 = new MethodNode(Modifier.EMPTY, Name.identifier("methodWithParameter"), new TypeNode(false, methodTypeNode));

		classNode.addMember(methodNode2);


		ClassNode inner = new ClassNode(Modifier.list(), NapileLangPackage.LONG);
		classNode.addMember(inner);

		MultiTypeNode multiTypeNode = new MultiTypeNode();
		multiTypeNode.variables.add(new VariableNode(Modifier.list(Modifier.MUTABLE), Name.identifier("test"), AsmConstants.INT_TYPE));

		MethodNode methodNode3 = new MethodNode(Modifier.EMPTY, Name.identifier("multiMethod"), new TypeNode(false, multiTypeNode));
		inner.addMember(methodNode3);

		return classNode;
	}

	private static void setPosition(Instruction instruction)
	{
		instruction.position = new InstructionInCodePosition("Test.ns", 1, 2);
	}
}
