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

package org.napile.asm.resolve.name;

import org.jetbrains.annotations.NotNull;

/**
 * @author Stepan Koltsov
 */
public abstract class FqNameBase
{

	protected FqNameBase()
	{
		if(!(this instanceof FqName || this instanceof org.napile.asm.resolve.name.FqNameUnsafe))
		{
			throw new AssertionError("do not use this class directly");
		}
	}

	@NotNull
	protected abstract String getFqName();

	@NotNull
	private org.napile.asm.resolve.name.FqNameUnsafe toFqNameUnsafe()
	{
		if(this instanceof FqName)
		{
			return ((FqName) this).toUnsafe();
		}
		else if(this instanceof org.napile.asm.resolve.name.FqNameUnsafe)
		{
			return ((org.napile.asm.resolve.name.FqNameUnsafe) this);
		}
		else
		{
			throw new AssertionError();
		}
	}

	public final boolean equalsTo(@NotNull FqName that)
	{
		return equalsTo(that.toUnsafe());
	}

	public final boolean equalsTo(@NotNull org.napile.asm.resolve.name.FqNameUnsafe that)
	{
		return toFqNameUnsafe().equals(that);
	}

	public final boolean equalsTo(@NotNull String that)
	{
		return getFqName().equals(that);
	}

	@Override
	public String toString()
	{
		return getFqName();
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(!(o instanceof FqNameBase))
			return false;

		return getFqName().equals(((FqNameBase) o).getFqName());
	}

	@Override
	public int hashCode()
	{
		return getFqName().hashCode();
	}
}
