/*
 * Copyright 2010-2013 napile.org
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

package org.napile.asm.util.convertors;

import java.util.List;

import org.napile.asm.tree.members.AnnotationNode;
import org.napile.java2napile.runtime.vm.ValueConverter;

/**
 * @author VISTALL
 * @date 16:47/09.02.13
 */
public class ListAnnotationToArrayAnnotationValueConverter implements ValueConverter<List<AnnotationNode>>
{
	@Override
	public Object convert(List<AnnotationNode> another)
	{
		return another.toArray(new AnnotationNode[another.size()]);
	}
}
