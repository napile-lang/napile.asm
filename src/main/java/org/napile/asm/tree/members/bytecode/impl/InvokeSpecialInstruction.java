package org.napile.asm.tree.members.bytecode.impl;

import org.jetbrains.annotations.NotNull;
import org.napile.asm.tree.members.bytecode.Instruction;
import org.napile.asm.tree.members.bytecode.InstructionVisitor;
import org.napile.asm.tree.members.bytecode.MethodRef;

/**
 * @author VISTALL
 * @date 13:43/02.09.12
 */
public class InvokeSpecialInstruction implements Instruction
{
	@NotNull
	public final MethodRef methodRef;

	public InvokeSpecialInstruction(@NotNull MethodRef methodRef)
	{
		this.methodRef = methodRef;
	}

	@Override
	public <T> void accept(InstructionVisitor<T> visitor, T a2)
	{
		visitor.visitInvokeSpecial(this, a2);
	}
}