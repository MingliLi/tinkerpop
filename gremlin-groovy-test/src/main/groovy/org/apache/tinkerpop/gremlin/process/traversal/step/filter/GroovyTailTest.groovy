/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.process.traversal.step.filter

import org.apache.tinkerpop.gremlin.process.traversal.Traversal
import org.apache.tinkerpop.gremlin.process.traversal.util.ScriptTraversal
import org.apache.tinkerpop.gremlin.structure.Vertex

/**
 * @author Matt Frantz (http://github.com/mhfrantz)
 */
public abstract class GroovyTailTest {

    public static class Traversals extends TailTest {

        @Override
        public Traversal<Vertex, String> get_g_V_valuesXnameX_order_tailXglobal_2X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.values('name').order.tail(global, 2)")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_valuesXnameX_order_tailX2X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.values('name').order.tail(2)")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_valuesXnameX_order_tail() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.values('name').order.tail")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_valuesXnameX_order_tailX7X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.values('name').order.tail(7)")
        }

        @Override
        public Traversal<Vertex, Vertex> get_g_V_repeatXbothX_timesX3X_tailX7X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.repeat(both()).times(3).tail(7)")
        }

        @Override
        public Traversal<Vertex, Long> get_g_V_repeatXin_outX_timesX3X_tailX7X_count() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.repeat(__.in().out()).times(3).tail(7).count()")
        }

        @Override
        public Traversal<Vertex, List<String>> get_g_V_asXaX_out_asXaX_out_asXaX_selectXmixed_aX_byXunfold_valuesXnameX_foldX_tailXlocal_2X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('a').out.as('a').select(mixed,'a').by(unfold().values('name').fold).tail(local, 2)")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_asXaX_out_asXaX_out_asXaX_selectXmixed_aX_byXunfold_valuesXnameX_foldX_tailXlocal_1X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('a').out.as('a').select(mixed,'a').by(unfold().values('name').fold).tail(local, 1)")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_asXaX_out_asXaX_out_asXaX_selectXmixed_aX_byXunfold_valuesXnameX_foldX_tailXlocalX() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('a').out.as('a').select(mixed,'a').by(unfold().values('name').fold).tail(local)")
        }

        @Override
        public Traversal<Vertex, String> get_g_V_asXaX_out_asXaX_out_asXaX_selectXmixed_aX_byXlimitXlocal_0XX_tailXlocal_1X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('a').out.as('a').select(mixed,'a').by(limit(local, 0)).tail(local, 1)")
        }

        @Override
        public Traversal<Vertex, Map<String, String>> get_g_V_asXaX_out_asXbX_out_asXcX_selectXa_b_cX_byXnameX_tailXlocal_2X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('b').out.as('c').select('a','b','c').by('name').tail(local, 2)")
        }

        @Override
        public Traversal<Vertex, Map<String, String>> get_g_V_asXaX_out_asXbX_out_asXcX_selectXa_b_cX_byXnameX_tailXlocal_1X() {
            new ScriptTraversal<>(g, "gremlin-groovy", "g.V.as('a').out.as('b').out.as('c').select('a','b','c').by('name').tail(local, 1)")
        }
    }
}
