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
 * @date 23:34/01.09.12
 */
public interface NapileReflectPackage
{
	FqName PACKAGE = new FqName("napile.reflect");

	FqName CLASS = PACKAGE.child(Name.identifier("Class"));

	FqName TYPE = PACKAGE.child(Name.identifier("Type"));

	FqName METHOD = PACKAGE.child(Name.identifier("Method"));

	FqName CONSTRUCTOR = PACKAGE.child(Name.identifier("Constructor"));

	FqName MACRO = PACKAGE.child(Name.identifier("Macro"));

	FqName VARIABLE = PACKAGE.child(Name.identifier("Variable"));

	FqName MODIFIER = PACKAGE.child(Name.identifier("Modifier"));
}
