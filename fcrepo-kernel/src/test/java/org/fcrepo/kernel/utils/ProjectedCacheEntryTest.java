/**
 * Copyright 2013 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fcrepo.kernel.utils;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import javax.jcr.Binary;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class ProjectedCacheEntryTest {

    @Mock
    private Binary mockBinary;

    private ProjectedCacheEntry testObj;

    @Before
    public void setUp() throws Exception {
        initMocks(this);

        testObj = new ProjectedCacheEntry(mockBinary, "some-identifier");
    }

    @Test
    public void testGetExternalIdentifier() {
        final String expected = "/org.modeshape.connector.filesystem.FileSystemConnector:projections:some-identifier";

        assertEquals(expected, testObj.getExternalIdentifier());
    }
}
