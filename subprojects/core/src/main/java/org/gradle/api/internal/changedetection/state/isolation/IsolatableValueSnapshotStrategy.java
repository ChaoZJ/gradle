/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.changedetection.state.isolation;

import org.gradle.api.internal.changedetection.state.ValueSnapshot;
import org.gradle.api.internal.changedetection.state.ValueSnapshotStrategy;
import org.gradle.api.internal.changedetection.state.ValueSnapshotter;
import org.gradle.internal.isolation.Isolatable;

/**
 * A strategy for creating {@link ValueSnapshot}s which ensures that they are {@link Isolatable}.
 */
public class IsolatableValueSnapshotStrategy extends ValueSnapshotStrategy {
    public IsolatableValueSnapshotStrategy(ValueSnapshotter snapshotter) {
        super(snapshotter);
    }

    @Override
    public ValueSnapshot snapshot(Object value) {
        return snapshotter.isolatableSnapshot(value);
    }
}
