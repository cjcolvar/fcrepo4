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

package org.fcrepo.kernel.identifiers;

/**
 * A simple {@link InternalIdentifierConverter} that adds or subtracts a
 * prefix.
 *
 * @author ajs6f
 * @date Apr 1, 2014
 */
public class PrefixingConverter extends InternalIdentifierConverter {

    private String prefix;

    /*
     * (non-Javadoc)
     * @see
     * org.fcrepo.kernel.identifiers.InternalIdentifierConverter#doForward(
     * java.lang.String)
     */
    @Override
    protected String doForward(final String a) {
        return getPrefix() + a;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.fcrepo.kernel.identifiers.InternalIdentifierConverter#doBackward
     * (java.lang.String)
     */
    @Override
    protected String doBackward(final String b) {
        return b.substring(getPrefix().length());
    }

    /**
     * @param p the prefix to use
     */
    public void setPrefix(final String p) {
        this.prefix = p;
    }


    /**
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

}
