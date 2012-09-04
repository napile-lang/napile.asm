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

package org.napile.asm.tree.members.bytecode;

import org.napile.asm.tree.members.bytecode.impl.*;

/**
 * @author VISTALL
 * @date 22:23/31.08.12
 */
public interface InstructionVisitor<T>
{
	void visitDup(DupInstruction instruction, T a);

	void visitLoad(LoadInstruction instruction, T a);

	void visitStore(StoreInstruction instruction, T a);

	void visitNewObject(NewObjectInstruction instruction, T a);

	void visitNewByte(NewByteInstruction instruction, T a);

	void visitNewShort(NewShortInstruction instruction, T a);

	void visitNewInt(NewIntInstruction instruction, T a);

	void visitNewLong(NewLongInstruction instruction, T a);

	void visitNewFloat(NewFloatInstruction instruction, T a);

	void visitNewDouble(NewDoubleInstruction instruction, T a);

	void visitNewChar(NewCharInstruction instruction, T a);

	void visitNewString(NewStringInstruction instruction, T a);

	void visitReturn(ReturnInstruction instruction, T a);

	void visitInvokeStatic(InvokeStaticInstruction instruction, T a);

	void visitInvokeSpecial(InvokeSpecialInstruction instruction, T a);

	void visitInvokeVirtual(InvokeVirtualInstruction instruction, T a);

	void visitPutToVariable(PutToVariableInstruction instruction, T a);

	void visitPutToStaticVariable(PutToStaticVariableInstruction instruction, T a);
}