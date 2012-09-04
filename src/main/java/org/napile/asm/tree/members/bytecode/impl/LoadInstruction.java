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

package org.napile.asm.tree.members.bytecode.impl;

import org.napile.asm.tree.members.bytecode.Instruction;
import org.napile.asm.tree.members.bytecode.InstructionVisitor;

/**
 * @author VISTALL
 * @date 22:26/31.08.12
 */
public class LoadInstruction implements Instruction
{
	public final int varIndex;

	public LoadInstruction(int varIndex)
	{
		this.varIndex = varIndex;
	}

	@Override
	public <T> void accept(InstructionVisitor<T> visitor, T a2)
	{
		visitor.visitLoad(this, a2);
	}
}