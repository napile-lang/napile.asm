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

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Stepan Koltsov
 */
public class FqName extends FqNameBase
{

	public static final FqName ROOT = new FqName("");

	@NotNull
	protected final org.napile.asm.resolve.name.FqNameUnsafe fqName;

	// cache
	protected transient FqName parent;


	public FqName(@NotNull String fqName)
	{
		this.fqName = new org.napile.asm.resolve.name.FqNameUnsafe(fqName, this);
	}

	public FqName(@NotNull org.napile.asm.resolve.name.FqNameUnsafe fqName)
	{
		this.fqName = fqName;

		validateFqName();
	}

	protected FqName(@NotNull org.napile.asm.resolve.name.FqNameUnsafe fqName, FqName parent)
	{
		this.fqName = fqName;
		this.parent = parent;

		validateFqName();
	}


	protected void validateFqName()
	{
		if(!isValidAfterUnsafeCheck(fqName.getFqName()))
		{
			throw new IllegalArgumentException("incorrect fq name: " + fqName);
		}
	}

	private static boolean isValidAfterUnsafeCheck(@NotNull String qualifiedName)
	{
		// TODO: There's a valid name with escape char ``
		return qualifiedName.indexOf('<') < 0;
	}

	public static boolean isValid(@Nullable String qualifiedName)
	{
		return qualifiedName != null &&
				org.napile.asm.resolve.name.FqNameUnsafe.isValid(qualifiedName) &&
				isValidAfterUnsafeCheck(qualifiedName);
	}

	@NotNull
	public String getFqName()
	{
		return fqName.getFqName();
	}

	@NotNull
	public org.napile.asm.resolve.name.FqNameUnsafe toUnsafe()
	{
		return fqName;
	}

	public boolean isRoot()
	{
		return fqName.isRoot();
	}

	@NotNull
	public FqName parent()
	{
		if(parent != null)
		{
			return parent;
		}

		if(isRoot())
		{
			throw new IllegalStateException("root");
		}

		parent = new FqName(fqName.parent());

		return parent;
	}

	@NotNull
	public FqName child(@NotNull Name name)
	{
		return new FqName(fqName.child(name), this);
	}

	@NotNull
	public Name shortName()
	{
		return fqName.shortName();
	}

	@NotNull
	public Name shortNameOrSpecial()
	{
		return fqName.shortNameOrSpecial();
	}

	@NotNull
	public List<FqName> path()
	{
		final List<FqName> path = new ArrayList<FqName>();
		path.add(ROOT);
		fqName.walk(new org.napile.asm.resolve.name.FqNameUnsafe.WalkCallback()
		{
			@Override
			public void segment(@NotNull Name shortName, @NotNull org.napile.asm.resolve.name.FqNameUnsafe fqName)
			{
				// TODO: do not validate
				path.add(new FqName(fqName));
			}
		});
		return path;
	}

	@NotNull
	public List<Name> pathSegments()
	{
		return fqName.pathSegments();
	}

	public boolean firstSegmentIs(@NotNull Name segment)
	{
		return fqName.firstSegmentIs(segment);
	}

	public boolean lastSegmentIs(@NotNull Name segment)
	{
		return fqName.lastSegmentIs(segment);
	}

	@NotNull
	public static FqName topLevel(@NotNull Name shortName)
	{
		return new FqName(org.napile.asm.resolve.name.FqNameUnsafe.topLevel(shortName));
	}
}
