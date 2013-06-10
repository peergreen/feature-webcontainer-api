/**
 * Copyright 2013 Peergreen S.A.S.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.peergreen.webcontainer;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;

import com.peergreen.deployment.Artifact;
import com.peergreen.deployment.facet.archive.Archive;
import com.peergreen.injection.AnnotatedClass;

public interface WebApplication {

    Artifact getArtifact();

    String getContextPath();

    URI getURI();

    List<Archive> getLibraries();

    ClassLoader getClassLoader();
    void setClassLoader(ClassLoader classLoader);

    ClassLoader getParentClassLoader();
    void setParentClassLoader(ClassLoader classLoader);

    File getUnpackedDirectory();

    void setUnpackedDirectory(File unpackedDirectory);

    void setAnnotatedClasses(Map<String, AnnotatedClass> annotatedClasses);
    Map<String, AnnotatedClass> getAnnotatedClasses();

    String getArchiveName();
}
