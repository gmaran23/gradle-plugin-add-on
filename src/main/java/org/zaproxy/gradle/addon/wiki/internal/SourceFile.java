/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2019 The ZAP Development Team
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
package org.zaproxy.gradle.addon.wiki.internal;

import java.net.URL;

public class SourceFile {

    private final URL path;
    private final String relativePath;

    public SourceFile(URL path, String relativePath) {
        this.path = path;
        this.relativePath = relativePath;
    }

    public URL getPath() {
        return path;
    }

    public String getRelativePath() {
        return relativePath;
    }
}
