// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartK8sAppPrecheckRequest} extends {@link RequestModel}
 *
 * <p>StartK8sAppPrecheckRequest</p>
 */
public class StartK8sAppPrecheckRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentIds")
    private String componentIds;

    @Query
    @NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @Query
    @NameInMap("EmptyDirs")
    private String emptyDirs;

    @Query
    @NameInMap("EnvFroms")
    private String envFroms;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("JavaStartUpConfig")
    private String javaStartUpConfig;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("LimitEphemeralStorage")
    private Integer limitEphemeralStorage;

    @Query
    @NameInMap("LimitMem")
    private Integer limitMem;

    @Query
    @NameInMap("LimitmCpu")
    private Integer limitmCpu;

    @Query
    @NameInMap("LocalVolume")
    private String localVolume;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PvcMountDescs")
    private String pvcMountDescs;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Replicas")
    private Integer replicas;

    @Query
    @NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @Query
    @NameInMap("RequestsMem")
    private Integer requestsMem;

    @Query
    @NameInMap("RequestsmCpu")
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
         * The annotation of an application pod.
         */
        public Builder annotations(String annotations) {
            this.putQueryParameter("Annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the application. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 36 characters in length.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ComponentIds.
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * The configuration for mounting a Kubernetes ConfigMap or Secret to a directory in an elastic container instance. The following parameters are included in the configuration:
         * <p>
         * 
         * *   name: the name of the Kubernetes ConfigMap or Secret.
         * *   type: the type of the API object that you want to mount. You can mount a Kubernetes ConfigMap or Secret.
         * *   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).
         */
        public Builder configMountDescs(String configMountDescs) {
            this.putQueryParameter("ConfigMountDescs", configMountDescs);
            this.configMountDescs = configMountDescs;
            return this;
        }

        /**
         * The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:
         * <p>
         * 
         * *   mountPath: The mount path in the container. This parameter is required.
         * *   readOnly: (Optional) The mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.
         * *   subPathExpr: (Optional) The regular expression that is used to match the subdirectory.
         */
        public Builder emptyDirs(String emptyDirs) {
            this.putQueryParameter("EmptyDirs", emptyDirs);
            this.emptyDirs = emptyDirs;
            return this;
        }

        /**
         * The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.
         * <p>
         * 
         * The following parameters are included in the configuration:
         * 
         * *   configMapRef: the ConfigMap that is referenced. The following parameter is contained:
         * 
         *     *   name: the name of the ConfigMap.
         * 
         * *   secretRef: the Secret that is referenced. The following parameter is contained:
         * 
         *     *   name: the name of the Secret.
         */
        public Builder envFroms(String envFroms) {
            this.putQueryParameter("EnvFroms", envFroms);
            this.envFroms = envFroms;
            return this;
        }

        /**
         * The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:
         * <p>
         * 
         * `{"name":"x", "value": "y"}`
         * 
         * Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:
         * 
         * `{ "name": "x2", "valueFrom": { "configMapKeyRef": { "name": "my-config", "key": "y2" } } }`
         * 
         * Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:
         * 
         * `{ "name": "x3", "valueFrom": { "secretKeyRef": { "name": "my-secret", "key": "y3" } } }`
         * 
         * > If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of "\[]".
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * The URL of the image.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`. The following parameters are included in the configuration:
         * <p>
         * 
         * *   InitialHeapSize: the initial size of the heap memory.
         * *   MaxHeapSize: the maximum size of the heap memory.
         * *   CustomParams: the custom parameters, such as JVM -D parameters.
         * *   Other parameters: You can view the JSON structure submitted by the frontend.
         */
        public Builder javaStartUpConfig(String javaStartUpConfig) {
            this.putQueryParameter("JavaStartUpConfig", javaStartUpConfig);
            this.javaStartUpConfig = javaStartUpConfig;
            return this;
        }

        /**
         * The label of an application pod.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.
         */
        public Builder limitEphemeralStorage(Integer limitEphemeralStorage) {
            this.putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage);
            this.limitEphemeralStorage = limitEphemeralStorage;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than or equal to that of RequestsMem.
         */
        public Builder limitMem(Integer limitMem) {
            this.putQueryParameter("LimitMem", limitMem);
            this.limitMem = limitMem;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. The value 0 indicates that no limit is set on CPU cores.
         */
        public Builder limitmCpu(Integer limitmCpu) {
            this.putQueryParameter("LimitmCpu", limitmCpu);
            this.limitmCpu = limitmCpu;
            return this;
        }

        /**
         * The configurations that are used when the host files are mounted to the container on which the application is running. Example: `\[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt","mountPath":"/app/storage"}\]`. Description:
         * <p>
         * 
         * *   `nodePath`: the host path.
         * *   `mountPath`: the path in the container.
         * *   `type`: the mounting type.
         */
        public Builder localVolume(String localVolume) {
            this.putQueryParameter("LocalVolume", localVolume);
            this.localVolume = localVolume;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster. This parameter specifies the Kubernetes namespace in which your application is deployed. By default, the default namespace is used.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The URL of the deployment package.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) to a directory in an elastic container instance. The following parameters are included in the configuration:
         * <p>
         * 
         * *   pvcName: the name of the PVC. Make sure that the volume exists and is in the Bound state.
         * 
         * *   mountPaths: the directory to which you want to mount the PVC. You can configure multiple directories. You can set the following two parameters for each mount directory:
         * 
         *     *   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).
         *     *   readOnly: the mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.
         */
        public Builder pvcMountDescs(String pvcMountDescs) {
            this.putQueryParameter("PvcMountDescs", pvcMountDescs);
            this.pvcMountDescs = pvcMountDescs;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of application instances.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.
         */
        public Builder requestsEphemeralStorage(Integer requestsEphemeralStorage) {
            this.putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage);
            this.requestsEphemeralStorage = requestsEphemeralStorage;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is created. Unit: MB. The value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.
         */
        public Builder requestsMem(Integer requestsMem) {
            this.putQueryParameter("RequestsMem", requestsMem);
            this.requestsMem = requestsMem;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed for each application instance when the application is created. Unit: millicores.
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
