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

package org.napile.asm.tree.members;

import java.util.ArrayList;
import java.util.List;

import org.napile.asm.util.convertors.ListAnnotationToArrayAnnotationValueConverter;
import org.napile.java2napile.runtime.vm.ToNapileVariable;

/**
 * @author VISTALL
 * @date 0:30/14.08.12
 */
public abstract class AnnotableNode<T extends AnnotableNode<?>> implements Node
{
	@ToNapileVariable(converter = ListAnnotationToArrayAnnotationValueConverter.class)
	public final List<AnnotationNode> annotations = new ArrayList<AnnotationNode>(0);
}
