package org.napile.asm.tree.members.bytecode.impl;

import org.jetbrains.annotations.NotNull;
import org.napile.asm.tree.members.bytecode.Instruction;
import org.napile.asm.tree.members.bytecode.InstructionVisitor;

/**
 * @author VISTALL
 * @date 16:51/27.09.12
 */
public class JumpInstruction implements Instruction
{
	public final int value;

	public JumpInstruction(int value)
	{
		this.value = value;
	}

	@NotNull
	@Override
	public <T, R> R accept(InstructionVisitor<T, R> visitor, T a2)
	{
		return visitor.visitJumpInstruction(this, a2);
	}
}