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

package org.napile.asm.lib;

import org.napile.asm.resolve.name.FqName;
import org.napile.asm.resolve.name.Name;

/**
 * @author VISTALL
 * @date 12:26/25.08.12
 */
public interface NapileAnnotationPackage
{
	FqName PACKAGE = new FqName("napile.annotation");

	FqName ANNOTATION = PACKAGE.child(Name.identifier("Annotation"));

	FqName REPEATABLE = PACKAGE.child(Name.identifier("Repeatable"));

	FqName DEPRECATED = PACKAGE.child(Name.identifier("Deprecated"));

	FqName VAR_ARGS = PACKAGE.child(Name.identifier("VarArgs"));

	FqName EXTENSION = PACKAGE.child(Name.identifier("Extension"));

	FqName IMMUTABLE = PACKAGE.child(Name.identifier("Immutable"));

	FqName IMMUTABLE_TARGET = PACKAGE.child(Name.identifier("ImmutableTarget"));

	FqName INHERIT_IMMUTABLE = PACKAGE.child(Name.identifier("InheritImmutable"));
}
