/*
 * Copyright 2010-2012 napile.org
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

package org.napile.asm.tree.members.types.constructors;

import org.jetbrains.annotations.NotNull;
import org.napile.asm.resolve.name.Name;
import org.napile.asm.tree.members.NodeVisitor;
import org.napile.asm.util.convertors.NameValueConverter;
import org.napile.java2napile.runtime.vm.ToNapileClass;
import org.napile.java2napile.runtime.vm.ToNapileVariable;

/**
 * @author VISTALL
 * @date 15:20/20.09.12
 */
@ToNapileClass("napile.asm.members.typeConstructor.AsmTypeParameterType")
public class TypeParameterValueTypeNode implements TypeConstructorNode
{
	@ToNapileVariable(converter = NameValueConverter.class)
	@NotNull
	public final Name name;

	public TypeParameterValueTypeNode(@NotNull Name name)
	{
		this.name = name;
	}

	@Override
	public <T, R> R accept(@NotNull NodeVisitor<T, R> visitor, T arg)
	{
		return visitor.visitTypeParameterValueTypeNode(this, arg);
	}

	@Override
	public boolean equals(Object o)
	{
		return !(o == null || o.getClass() != TypeParameterValueTypeNode.class) && toString().equals(o.toString());
	}

	@Override
	public String toString()
	{
		return ":" + name + ":";
	}
}
