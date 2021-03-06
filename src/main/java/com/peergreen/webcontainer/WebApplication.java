/**
 * Copyright 2013 Peergreen S.A.S. All rights reserved.
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
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.naming.Context;

import com.peergreen.deployment.Artifact;
import com.peergreen.deployment.facet.archive.Archive;
import com.peergreen.metadata.adapter.AnnotatedClass;

public interface WebApplication {

    Artifact getArtifact();

    String getContextPath();
    void setContextPath(String contextPath);

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
    String getModuleName();
    void setModuleName(String moduleName);
    String getApplicationName();
    void setApplicationName(String applicationName);

    Context getJavaContext();
    void setJavaContext(Context javaContext);

    Context getJavaAppContext();
    void setJavaAppContext(Context javaAppContext);

    Context getJavaModuleContext();
    void setJavaModuleContext(Context javaModuleContext);

    Collection<URL> getExtraTlds();

}
