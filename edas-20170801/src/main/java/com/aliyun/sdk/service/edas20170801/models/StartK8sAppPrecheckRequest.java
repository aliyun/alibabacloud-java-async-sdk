// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartK8sAppPrecheckRequest} extends {@link RequestModel}
 *
 * <p>StartK8sAppPrecheckRequest</p>
 */
public class StartK8sAppPrecheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentIds")
    private String componentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmptyDirs")
    private String emptyDirs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvFroms")
    private String envFroms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JavaStartUpConfig")
    private String javaStartUpConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitEphemeralStorage")
    private Integer limitEphemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitMem")
    private Integer limitMem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitmCpu")
    private Integer limitmCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVolume")
    private String localVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PvcMountDescs")
    private String pvcMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsMem")
    private Integer requestsMem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsmCpu")
    private Integer requestsmCpu;

    private StartK8sAppPrecheckRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.componentIds = builder.componentIds;
        this.configMountDescs = builder.configMountDescs;
        this.emptyDirs = builder.emptyDirs;
        this.envFroms = builder.envFroms;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.javaStartUpConfig = builder.javaStartUpConfig;
        this.labels = builder.labels;
        this.limitEphemeralStorage = builder.limitEphemeralStorage;
        this.limitMem = builder.limitMem;
        this.limitmCpu = builder.limitmCpu;
        this.localVolume = builder.localVolume;
        this.namespace = builder.namespace;
        this.packageUrl = builder.packageUrl;
        this.pvcMountDescs = builder.pvcMountDescs;
        this.regionId = builder.regionId;
        this.replicas = builder.replicas;
        this.requestsEphemeralStorage = builder.requestsEphemeralStorage;
        this.requestsMem = builder.requestsMem;
        this.requestsmCpu = builder.requestsmCpu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartK8sAppPrecheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentIds
     */
    public String getComponentIds() {
        return this.componentIds;
    }

    /**
     * @return configMountDescs
     */
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    /**
     * @return emptyDirs
     */
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    /**
     * @return envFroms
     */
    public String getEnvFroms() {
        return this.envFroms;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return javaStartUpConfig
     */
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return limitEphemeralStorage
     */
    public Integer getLimitEphemeralStorage() {
        return this.limitEphemeralStorage;
    }

    /**
     * @return limitMem
     */
    public Integer getLimitMem() {
        return this.limitMem;
    }

    /**
     * @return limitmCpu
     */
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    /**
     * @return localVolume
     */
    public String getLocalVolume() {
        return this.localVolume;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return pvcMountDescs
     */
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return requestsEphemeralStorage
     */
    public Integer getRequestsEphemeralStorage() {
        return this.requestsEphemeralStorage;
    }

    /**
     * @return requestsMem
     */
    public Integer getRequestsMem() {
        return this.requestsMem;
    }

    /**
     * @return requestsmCpu
     */
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

    public static final class Builder extends Request.Builder<StartK8sAppPrecheckRequest, Builder> {
        private String annotations; 
        private String appId; 
        private String appName; 
        private String clusterId; 
        private String componentIds; 
        private String configMountDescs; 
        private String emptyDirs; 
        private String envFroms; 
        private String envs; 
        private String imageUrl; 
        private String javaStartUpConfig; 
        private String labels; 
        private Integer limitEphemeralStorage; 
        private Integer limitMem; 
        private Integer limitmCpu; 
        private String localVolume; 
        private String namespace; 
        private String packageUrl; 
        private String pvcMountDescs; 
        private String regionId; 
        private Integer replicas; 
        private Integer requestsEphemeralStorage; 
        private Integer requestsMem; 
        private Integer requestsmCpu; 

        private Builder() {
            super();
        } 

        private Builder(StartK8sAppPrecheckRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.appId = request.appId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.componentIds = request.componentIds;
            this.configMountDescs = request.configMountDescs;
            this.emptyDirs = request.emptyDirs;
            this.envFroms = request.envFroms;
            this.envs = request.envs;
            this.imageUrl = request.imageUrl;
            this.javaStartUpConfig = request.javaStartUpConfig;
            this.labels = request.labels;
            this.limitEphemeralStorage = request.limitEphemeralStorage;
            this.limitMem = request.limitMem;
            this.limitmCpu = request.limitmCpu;
            this.localVolume = request.localVolume;
            this.namespace = request.namespace;
            this.packageUrl = request.packageUrl;
            this.pvcMountDescs = request.pvcMountDescs;
            this.regionId = request.regionId;
            this.replicas = request.replicas;
            this.requestsEphemeralStorage = request.requestsEphemeralStorage;
            this.requestsMem = request.requestsMem;
            this.requestsmCpu = request.requestsmCpu;
        } 

        /**
         * <p>The annotation of an application pod.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;annotation-name-1&quot;:&quot;annotation-value-1&quot;,&quot;annotation-name-2&quot;:&quot;annotation-value-2&quot;}</p>
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>af58edcf-f7eb-<strong><strong>-</strong></strong>-db4e425f****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the application. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 36 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testapp</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong></p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the application component. You can call the ListComponents operation to query application components. This parameter must be specified when the application runs in Apache Tomcat or in a standard Java application runtime environment. The Apache Tomcat application runtime environment is applicable to Dubbo applications that are deployed by using WAR packages. A standard Java application runtime environment is applicable to Spring Boot or Spring Cloud applications that are deployed by using JAR packages.</p>
         * <p>Valid values for regular application component IDs:</p>
         * <ul>
         * <li>4: Apache Tomcat 7.0.91</li>
         * <li>5: OpenJDK 1.8.x</li>
         * <li>6: OpenJDK 1.7.x</li>
         * <li>7: Apache Tomcat 8.5.42</li>
         * </ul>
         * <p>This parameter is available only for Java SDK 2.57.3 or later, or Python SDK 2.57.3 or later. Assume that you use an SDK that is not provided by Enterprise Distributed Application Service (EDAS), such as aliyun-python-sdk-core, aliyun-java-sdk-core, and Alibaba Cloud CLI. In this case, you can directly specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * <p>The configuration for mounting a Kubernetes ConfigMap or Secret to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
         * <ul>
         * <li>name: the name of the Kubernetes ConfigMap or Secret.</li>
         * <li>type: the type of the API object that you want to mount. You can mount a Kubernetes ConfigMap or Secret.</li>
         * <li>mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;nginx-config&quot;,&quot;type&quot;:&quot;ConfigMap&quot;,&quot;mountPath&quot;:&quot;/etc/nginx&quot;},{&quot;name&quot;:&quot;tls-secret&quot;,&quot;type&quot;:&quot;secret&quot;,&quot;mountPath&quot;:&quot;/etc/ssh&quot;}]</p>
         */
        public Builder configMountDescs(String configMountDescs) {
            this.putQueryParameter("ConfigMountDescs", configMountDescs);
            this.configMountDescs = configMountDescs;
            return this;
        }

        /**
         * <p>The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
         * <ul>
         * <li>mountPath: The mount path in the container. This parameter is required.</li>
         * <li>readOnly: (Optional) The mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.</li>
         * <li>subPathExpr: (Optional) The regular expression that is used to match the subdirectory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/app-log&quot;,&quot;subPathExpr&quot;:&quot;$(POD_IP)&quot;},{&quot;readOnly&quot;:true,&quot;mountPath&quot;:&quot;/etc/nginx&quot;}]</p>
         */
        public Builder emptyDirs(String emptyDirs) {
            this.putQueryParameter("EmptyDirs", emptyDirs);
            this.emptyDirs = emptyDirs;
            return this;
        }

        /**
         * <p>The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.</p>
         * <p>The following parameters are included in the configuration of the EnvFroms parameter:</p>
         * <ul>
         * <li><p>configMapRef: the ConfigMap that is referenced. The following parameter is included:</p>
         * <p>name: the name of the ConfigMap.</p>
         * </li>
         * <li><p>secretRef: the Secret that is referenced. The following parameter is included:</p>
         * <p>name: the name of the Secret.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;appname&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;appconf&quot;,&quot;key&quot;:&quot;name&quot;}}}]</p>
         */
        public Builder envFroms(String envFroms) {
            this.putQueryParameter("EnvFroms", envFroms);
            this.envFroms = envFroms;
            return this;
        }

        /**
         * <p>The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
         * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
         * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
         * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
         * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
         * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
         * <blockquote>
         * <p>If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of &quot;[]&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;x1&quot;,&quot;value&quot;:&quot;y1&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;valueFrom&quot;:{&quot;configMapKeyRef&quot;:{&quot;name&quot;:&quot;my-config&quot;,&quot;key&quot;:&quot;y2&quot;}}},{&quot;name&quot;:&quot;x3&quot;,&quot;valueFrom&quot;:{&quot;secretKeyRef&quot;:{&quot;name&quot;:&quot;my-secret&quot;,&quot;key&quot;:&quot;y3&quot;}}}]</p>
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/mw/testapp:latest</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>. The following parameters are included in the configuration:</p>
         * <ul>
         * <li>InitialHeapSize: the initial size of the heap memory.</li>
         * <li>MaxHeapSize: the maximum size of the heap memory.</li>
         * <li>CustomParams: the custom parameters, such as JVM -D parameters.</li>
         * <li>Other parameters: You can view the JSON structure submitted by the frontend.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InitialHeapSize&quot;:{&quot;original&quot;:512,&quot;startup&quot;:&quot;-Xms512m&quot;},&quot;MaxHeapSize&quot;:{&quot;original&quot;:1024,&quot;startup&quot;:&quot;-Xmx1024m&quot;}}</p>
         */
        public Builder javaStartUpConfig(String javaStartUpConfig) {
            this.putQueryParameter("JavaStartUpConfig", javaStartUpConfig);
            this.javaStartUpConfig = javaStartUpConfig;
            return this;
        }

        /**
         * <p>The label of an application pod.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;label-name-1&quot;:&quot;label-value-1&quot;,&quot;label-name-2&quot;:&quot;label-value-2&quot;}</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder limitEphemeralStorage(Integer limitEphemeralStorage) {
            this.putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage);
            this.limitEphemeralStorage = limitEphemeralStorage;
            return this;
        }

        /**
         * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than or equal to that of RequestsMem.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder limitMem(Integer limitMem) {
            this.putQueryParameter("LimitMem", limitMem);
            this.limitMem = limitMem;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. The value 0 indicates that no limit is set on CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder limitmCpu(Integer limitmCpu) {
            this.putQueryParameter("LimitmCpu", limitmCpu);
            this.limitmCpu = limitmCpu;
            return this;
        }

        /**
         * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}\]</code>. Description:</p>
         * <ul>
         * <li><code>nodePath</code>: the host path.</li>
         * <li><code>mountPath</code>: the path in the container.</li>
         * <li><code>type</code>: the mounting type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</p>
         */
        public Builder localVolume(String localVolume) {
            this.putQueryParameter("LocalVolume", localVolume);
            this.localVolume = localVolume;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster. This parameter specifies the Kubernetes namespace in which your application is deployed. By default, the default namespace is used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The URL of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
         * <ul>
         * <li><p>pvcName: the name of the PVC. Make sure that the volume exists and is in the Bound state.</p>
         * </li>
         * <li><p>mountPaths: the directory to which you want to mount the PVC. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
         * <ul>
         * <li>mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</li>
         * <li>readOnly: the mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;pvcName&quot;:&quot;nas-pvc-1&quot;,&quot;mountPaths&quot;:[{&quot;mountPath&quot;:&quot;/usr/share/nginx/data&quot;},{&quot;mountPath&quot;:&quot;/usr/share/nginx/html&quot;,&quot;readOnly&quot;:true}]}]</p>
         */
        public Builder pvcMountDescs(String pvcMountDescs) {
            this.putQueryParameter("PvcMountDescs", pvcMountDescs);
            this.pvcMountDescs = pvcMountDescs;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder requestsEphemeralStorage(Integer requestsEphemeralStorage) {
            this.putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage);
            this.requestsEphemeralStorage = requestsEphemeralStorage;
            return this;
        }

        /**
         * <p>The maximum size of memory allowed for each application instance when the application is created. Unit: MB. The value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder requestsMem(Integer requestsMem) {
            this.putQueryParameter("RequestsMem", requestsMem);
            this.requestsMem = requestsMem;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is created. Unit: millicores.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder requestsmCpu(Integer requestsmCpu) {
            this.putQueryParameter("RequestsmCpu", requestsmCpu);
            this.requestsmCpu = requestsmCpu;
            return this;
        }

        @Override
        public StartK8sAppPrecheckRequest build() {
            return new StartK8sAppPrecheckRequest(this);
        } 

    } 

}
