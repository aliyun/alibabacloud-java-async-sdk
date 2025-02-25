// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployK8sApplicationRequest</p>
 */
public class DeployK8sApplicationRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Args")
    private String args;

    @Query
    @NameInMap("BatchTimeout")
    private Integer batchTimeout;

    @Query
    @NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @Query
    @NameInMap("BuildPackId")
    private String buildPackId;

    @Query
    @NameInMap("CanaryRuleId")
    private String canaryRuleId;

    @Query
    @NameInMap("ChangeOrderDesc")
    private String changeOrderDesc;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @Query
    @NameInMap("CpuLimit")
    private Integer cpuLimit;

    @Query
    @NameInMap("CpuRequest")
    private Integer cpuRequest;

    @Query
    @NameInMap("CustomAffinity")
    private String customAffinity;

    @Query
    @NameInMap("CustomAgentVersion")
    private String customAgentVersion;

    @Query
    @NameInMap("CustomTolerations")
    private String customTolerations;

    @Query
    @NameInMap("DeployAcrossNodes")
    private String deployAcrossNodes;

    @Query
    @NameInMap("DeployAcrossZones")
    private String deployAcrossZones;

    @Query
    @NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @Query
    @NameInMap("EmptyDirs")
    private String emptyDirs;

    @Query
    @NameInMap("EnableAhas")
    private Boolean enableAhas;

    @Query
    @NameInMap("EnableEmptyPushReject")
    private Boolean enableEmptyPushReject;

    @Query
    @NameInMap("EnableLosslessRule")
    private Boolean enableLosslessRule;

    @Query
    @NameInMap("EnvFroms")
    private String envFroms;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("Image")
    private String image;

    @Query
    @NameInMap("ImagePlatforms")
    private String imagePlatforms;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("InitContainers")
    private String initContainers;

    @Query
    @NameInMap("JDK")
    private String JDK;

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
    @NameInMap("Liveness")
    private String liveness;

    @Query
    @NameInMap("LocalVolume")
    private String localVolume;

    @Query
    @NameInMap("LosslessRuleAligned")
    private Boolean losslessRuleAligned;

    @Query
    @NameInMap("LosslessRuleDelayTime")
    private Integer losslessRuleDelayTime;

    @Query
    @NameInMap("LosslessRuleFuncType")
    private Integer losslessRuleFuncType;

    @Query
    @NameInMap("LosslessRuleRelated")
    private Boolean losslessRuleRelated;

    @Query
    @NameInMap("LosslessRuleWarmupTime")
    private Integer losslessRuleWarmupTime;

    @Query
    @NameInMap("McpuLimit")
    private Integer mcpuLimit;

    @Query
    @NameInMap("McpuRequest")
    private Integer mcpuRequest;

    @Query
    @NameInMap("MemoryLimit")
    private Integer memoryLimit;

    @Query
    @NameInMap("MemoryRequest")
    private Integer memoryRequest;

    @Query
    @NameInMap("MountDescs")
    private String mountDescs;

    @Query
    @NameInMap("NasId")
    private String nasId;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PackageVersion")
    private String packageVersion;

    @Query
    @NameInMap("PackageVersionId")
    private String packageVersionId;

    @Query
    @NameInMap("PostStart")
    private String postStart;

    @Query
    @NameInMap("PreStop")
    private String preStop;

    @Query
    @NameInMap("PvcMountDescs")
    private String pvcMountDescs;

    @Query
    @NameInMap("Readiness")
    private String readiness;

    @Query
    @NameInMap("Replicas")
    private Integer replicas;

    @Query
    @NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @Query
    @NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @Query
    @NameInMap("Sidecars")
    private String sidecars;

    @Query
    @NameInMap("SlsConfigs")
    private String slsConfigs;

    @Query
    @NameInMap("Startup")
    private String startup;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("TerminateGracePeriod")
    private Integer terminateGracePeriod;

    @Query
    @NameInMap("TrafficControlStrategy")
    private String trafficControlStrategy;

    @Query
    @NameInMap("UpdateStrategy")
    private String updateStrategy;

    @Query
    @NameInMap("UriEncoding")
    private String uriEncoding;

    @Query
    @NameInMap("UseBodyEncoding")
    private Boolean useBodyEncoding;

    @Query
    @NameInMap("UserBaseImageUrl")
    private String userBaseImageUrl;

    @Query
    @NameInMap("VolumesStr")
    private String volumesStr;

    @Query
    @NameInMap("WebContainer")
    private String webContainer;

    @Query
    @NameInMap("WebContainerConfig")
    private String webContainerConfig;

    private DeployK8sApplicationRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.appId = builder.appId;
        this.args = builder.args;
        this.batchTimeout = builder.batchTimeout;
        this.batchWaitTime = builder.batchWaitTime;
        this.buildPackId = builder.buildPackId;
        this.canaryRuleId = builder.canaryRuleId;
        this.changeOrderDesc = builder.changeOrderDesc;
        this.command = builder.command;
        this.configMountDescs = builder.configMountDescs;
        this.cpuLimit = builder.cpuLimit;
        this.cpuRequest = builder.cpuRequest;
        this.customAffinity = builder.customAffinity;
        this.customAgentVersion = builder.customAgentVersion;
        this.customTolerations = builder.customTolerations;
        this.deployAcrossNodes = builder.deployAcrossNodes;
        this.deployAcrossZones = builder.deployAcrossZones;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.emptyDirs = builder.emptyDirs;
        this.enableAhas = builder.enableAhas;
        this.enableEmptyPushReject = builder.enableEmptyPushReject;
        this.enableLosslessRule = builder.enableLosslessRule;
        this.envFroms = builder.envFroms;
        this.envs = builder.envs;
        this.image = builder.image;
        this.imagePlatforms = builder.imagePlatforms;
        this.imageTag = builder.imageTag;
        this.initContainers = builder.initContainers;
        this.JDK = builder.JDK;
        this.javaStartUpConfig = builder.javaStartUpConfig;
        this.labels = builder.labels;
        this.limitEphemeralStorage = builder.limitEphemeralStorage;
        this.liveness = builder.liveness;
        this.localVolume = builder.localVolume;
        this.losslessRuleAligned = builder.losslessRuleAligned;
        this.losslessRuleDelayTime = builder.losslessRuleDelayTime;
        this.losslessRuleFuncType = builder.losslessRuleFuncType;
        this.losslessRuleRelated = builder.losslessRuleRelated;
        this.losslessRuleWarmupTime = builder.losslessRuleWarmupTime;
        this.mcpuLimit = builder.mcpuLimit;
        this.mcpuRequest = builder.mcpuRequest;
        this.memoryLimit = builder.memoryLimit;
        this.memoryRequest = builder.memoryRequest;
        this.mountDescs = builder.mountDescs;
        this.nasId = builder.nasId;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.packageVersionId = builder.packageVersionId;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.pvcMountDescs = builder.pvcMountDescs;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.requestsEphemeralStorage = builder.requestsEphemeralStorage;
        this.runtimeClassName = builder.runtimeClassName;
        this.sidecars = builder.sidecars;
        this.slsConfigs = builder.slsConfigs;
        this.startup = builder.startup;
        this.storageType = builder.storageType;
        this.terminateGracePeriod = builder.terminateGracePeriod;
        this.trafficControlStrategy = builder.trafficControlStrategy;
        this.updateStrategy = builder.updateStrategy;
        this.uriEncoding = builder.uriEncoding;
        this.useBodyEncoding = builder.useBodyEncoding;
        this.userBaseImageUrl = builder.userBaseImageUrl;
        this.volumesStr = builder.volumesStr;
        this.webContainer = builder.webContainer;
        this.webContainerConfig = builder.webContainerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployK8sApplicationRequest create() {
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
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return batchTimeout
     */
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    /**
     * @return batchWaitTime
     */
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    /**
     * @return buildPackId
     */
    public String getBuildPackId() {
        return this.buildPackId;
    }

    /**
     * @return canaryRuleId
     */
    public String getCanaryRuleId() {
        return this.canaryRuleId;
    }

    /**
     * @return changeOrderDesc
     */
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return configMountDescs
     */
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    /**
     * @return cpuLimit
     */
    public Integer getCpuLimit() {
        return this.cpuLimit;
    }

    /**
     * @return cpuRequest
     */
    public Integer getCpuRequest() {
        return this.cpuRequest;
    }

    /**
     * @return customAffinity
     */
    public String getCustomAffinity() {
        return this.customAffinity;
    }

    /**
     * @return customAgentVersion
     */
    public String getCustomAgentVersion() {
        return this.customAgentVersion;
    }

    /**
     * @return customTolerations
     */
    public String getCustomTolerations() {
        return this.customTolerations;
    }

    /**
     * @return deployAcrossNodes
     */
    public String getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    /**
     * @return deployAcrossZones
     */
    public String getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    /**
     * @return edasContainerVersion
     */
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    /**
     * @return emptyDirs
     */
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    /**
     * @return enableAhas
     */
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    /**
     * @return enableEmptyPushReject
     */
    public Boolean getEnableEmptyPushReject() {
        return this.enableEmptyPushReject;
    }

    /**
     * @return enableLosslessRule
     */
    public Boolean getEnableLosslessRule() {
        return this.enableLosslessRule;
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
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imagePlatforms
     */
    public String getImagePlatforms() {
        return this.imagePlatforms;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return initContainers
     */
    public String getInitContainers() {
        return this.initContainers;
    }

    /**
     * @return JDK
     */
    public String getJDK() {
        return this.JDK;
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
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return localVolume
     */
    public String getLocalVolume() {
        return this.localVolume;
    }

    /**
     * @return losslessRuleAligned
     */
    public Boolean getLosslessRuleAligned() {
        return this.losslessRuleAligned;
    }

    /**
     * @return losslessRuleDelayTime
     */
    public Integer getLosslessRuleDelayTime() {
        return this.losslessRuleDelayTime;
    }

    /**
     * @return losslessRuleFuncType
     */
    public Integer getLosslessRuleFuncType() {
        return this.losslessRuleFuncType;
    }

    /**
     * @return losslessRuleRelated
     */
    public Boolean getLosslessRuleRelated() {
        return this.losslessRuleRelated;
    }

    /**
     * @return losslessRuleWarmupTime
     */
    public Integer getLosslessRuleWarmupTime() {
        return this.losslessRuleWarmupTime;
    }

    /**
     * @return mcpuLimit
     */
    public Integer getMcpuLimit() {
        return this.mcpuLimit;
    }

    /**
     * @return mcpuRequest
     */
    public Integer getMcpuRequest() {
        return this.mcpuRequest;
    }

    /**
     * @return memoryLimit
     */
    public Integer getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * @return memoryRequest
     */
    public Integer getMemoryRequest() {
        return this.memoryRequest;
    }

    /**
     * @return mountDescs
     */
    public String getMountDescs() {
        return this.mountDescs;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return packageVersion
     */
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @return packageVersionId
     */
    public String getPackageVersionId() {
        return this.packageVersionId;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return pvcMountDescs
     */
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    /**
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
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
     * @return runtimeClassName
     */
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    /**
     * @return sidecars
     */
    public String getSidecars() {
        return this.sidecars;
    }

    /**
     * @return slsConfigs
     */
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    /**
     * @return startup
     */
    public String getStartup() {
        return this.startup;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return terminateGracePeriod
     */
    public Integer getTerminateGracePeriod() {
        return this.terminateGracePeriod;
    }

    /**
     * @return trafficControlStrategy
     */
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

    /**
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    /**
     * @return uriEncoding
     */
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    /**
     * @return useBodyEncoding
     */
    public Boolean getUseBodyEncoding() {
        return this.useBodyEncoding;
    }

    /**
     * @return userBaseImageUrl
     */
    public String getUserBaseImageUrl() {
        return this.userBaseImageUrl;
    }

    /**
     * @return volumesStr
     */
    public String getVolumesStr() {
        return this.volumesStr;
    }

    /**
     * @return webContainer
     */
    public String getWebContainer() {
        return this.webContainer;
    }

    /**
     * @return webContainerConfig
     */
    public String getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public static final class Builder extends Request.Builder<DeployK8sApplicationRequest, Builder> {
        private String annotations; 
        private String appId; 
        private String args; 
        private Integer batchTimeout; 
        private Integer batchWaitTime; 
        private String buildPackId; 
        private String canaryRuleId; 
        private String changeOrderDesc; 
        private String command; 
        private String configMountDescs; 
        private Integer cpuLimit; 
        private Integer cpuRequest; 
        private String customAffinity; 
        private String customAgentVersion; 
        private String customTolerations; 
        private String deployAcrossNodes; 
        private String deployAcrossZones; 
        private String edasContainerVersion; 
        private String emptyDirs; 
        private Boolean enableAhas; 
        private Boolean enableEmptyPushReject; 
        private Boolean enableLosslessRule; 
        private String envFroms; 
        private String envs; 
        private String image; 
        private String imagePlatforms; 
        private String imageTag; 
        private String initContainers; 
        private String JDK; 
        private String javaStartUpConfig; 
        private String labels; 
        private Integer limitEphemeralStorage; 
        private String liveness; 
        private String localVolume; 
        private Boolean losslessRuleAligned; 
        private Integer losslessRuleDelayTime; 
        private Integer losslessRuleFuncType; 
        private Boolean losslessRuleRelated; 
        private Integer losslessRuleWarmupTime; 
        private Integer mcpuLimit; 
        private Integer mcpuRequest; 
        private Integer memoryLimit; 
        private Integer memoryRequest; 
        private String mountDescs; 
        private String nasId; 
        private String packageUrl; 
        private String packageVersion; 
        private String packageVersionId; 
        private String postStart; 
        private String preStop; 
        private String pvcMountDescs; 
        private String readiness; 
        private Integer replicas; 
        private Integer requestsEphemeralStorage; 
        private String runtimeClassName; 
        private String sidecars; 
        private String slsConfigs; 
        private String startup; 
        private String storageType; 
        private Integer terminateGracePeriod; 
        private String trafficControlStrategy; 
        private String updateStrategy; 
        private String uriEncoding; 
        private Boolean useBodyEncoding; 
        private String userBaseImageUrl; 
        private String volumesStr; 
        private String webContainer; 
        private String webContainerConfig; 

        private Builder() {
            super();
        } 

        private Builder(DeployK8sApplicationRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.appId = request.appId;
            this.args = request.args;
            this.batchTimeout = request.batchTimeout;
            this.batchWaitTime = request.batchWaitTime;
            this.buildPackId = request.buildPackId;
            this.canaryRuleId = request.canaryRuleId;
            this.changeOrderDesc = request.changeOrderDesc;
            this.command = request.command;
            this.configMountDescs = request.configMountDescs;
            this.cpuLimit = request.cpuLimit;
            this.cpuRequest = request.cpuRequest;
            this.customAffinity = request.customAffinity;
            this.customAgentVersion = request.customAgentVersion;
            this.customTolerations = request.customTolerations;
            this.deployAcrossNodes = request.deployAcrossNodes;
            this.deployAcrossZones = request.deployAcrossZones;
            this.edasContainerVersion = request.edasContainerVersion;
            this.emptyDirs = request.emptyDirs;
            this.enableAhas = request.enableAhas;
            this.enableEmptyPushReject = request.enableEmptyPushReject;
            this.enableLosslessRule = request.enableLosslessRule;
            this.envFroms = request.envFroms;
            this.envs = request.envs;
            this.image = request.image;
            this.imagePlatforms = request.imagePlatforms;
            this.imageTag = request.imageTag;
            this.initContainers = request.initContainers;
            this.JDK = request.JDK;
            this.javaStartUpConfig = request.javaStartUpConfig;
            this.labels = request.labels;
            this.limitEphemeralStorage = request.limitEphemeralStorage;
            this.liveness = request.liveness;
            this.localVolume = request.localVolume;
            this.losslessRuleAligned = request.losslessRuleAligned;
            this.losslessRuleDelayTime = request.losslessRuleDelayTime;
            this.losslessRuleFuncType = request.losslessRuleFuncType;
            this.losslessRuleRelated = request.losslessRuleRelated;
            this.losslessRuleWarmupTime = request.losslessRuleWarmupTime;
            this.mcpuLimit = request.mcpuLimit;
            this.mcpuRequest = request.mcpuRequest;
            this.memoryLimit = request.memoryLimit;
            this.memoryRequest = request.memoryRequest;
            this.mountDescs = request.mountDescs;
            this.nasId = request.nasId;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.packageVersionId = request.packageVersionId;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.pvcMountDescs = request.pvcMountDescs;
            this.readiness = request.readiness;
            this.replicas = request.replicas;
            this.requestsEphemeralStorage = request.requestsEphemeralStorage;
            this.runtimeClassName = request.runtimeClassName;
            this.sidecars = request.sidecars;
            this.slsConfigs = request.slsConfigs;
            this.startup = request.startup;
            this.storageType = request.storageType;
            this.terminateGracePeriod = request.terminateGracePeriod;
            this.trafficControlStrategy = request.trafficControlStrategy;
            this.updateStrategy = request.updateStrategy;
            this.uriEncoding = request.uriEncoding;
            this.useBodyEncoding = request.useBodyEncoding;
            this.userBaseImageUrl = request.userBaseImageUrl;
            this.volumesStr = request.volumesStr;
            this.webContainer = request.webContainer;
            this.webContainerConfig = request.webContainerConfig;
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
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The argument array in the container start-up command. Set this parameter to a JSON array in the format of `\["args1","args2"\]`, where each key is set to a string. If you want to cancel this configuration, set this parameter to an empty JSON array in the format of `"\[\]"`.
         */
        public Builder args(String args) {
            this.putQueryParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * The timeout period for an at-a-time release. Unit: seconds.
         */
        public Builder batchTimeout(Integer batchTimeout) {
            this.putQueryParameter("BatchTimeout", batchTimeout);
            this.batchTimeout = batchTimeout;
            return this;
        }

        /**
         * The minimum time interval for the phased release of pods. For more information, see [minReadySeconds](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds).
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * The build package number of EDAS Container.
         * <p>
         * 
         * *   You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.
         * *   Set the parameter if you need to update the EDAS Container version of the application during the deployment.
         * 
         * You can query the build package number by using one of the following methods:
         * 
         * *   Call the ListBuildPack operation. For more information, see [ListBuildPack](~~423222~~).
         * *   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](~~92614~~) topic. For example, `59` indicates `EDAS Container 3.5.8`.
         */
        public Builder buildPackId(String buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * CanaryRuleId.
         */
        public Builder canaryRuleId(String canaryRuleId) {
            this.putQueryParameter("CanaryRuleId", canaryRuleId);
            this.canaryRuleId = canaryRuleId;
            return this;
        }

        /**
         * The description of the change process.
         */
        public Builder changeOrderDesc(String changeOrderDesc) {
            this.putQueryParameter("ChangeOrderDesc", changeOrderDesc);
            this.changeOrderDesc = changeOrderDesc;
            return this;
        }

        /**
         * The commands that you run to start the container.
         * <p>
         * 
         * > If you want to cancel this configuration, set this parameter to an empty string in the format of `""`.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
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
         * The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.
         */
        public Builder cpuLimit(Integer cpuLimit) {
            this.putQueryParameter("CpuLimit", cpuLimit);
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. Value 0 indicates that no limit is set on CPU cores.
         * <p>
         * 
         * > You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.
         */
        public Builder cpuRequest(Integer cpuRequest) {
            this.putQueryParameter("CpuRequest", cpuRequest);
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * The affinity configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.
         */
        public Builder customAffinity(String customAffinity) {
            this.putQueryParameter("CustomAffinity", customAffinity);
            this.customAffinity = customAffinity;
            return this;
        }

        /**
         * CustomAgentVersion.
         */
        public Builder customAgentVersion(String customAgentVersion) {
            this.putQueryParameter("CustomAgentVersion", customAgentVersion);
            this.customAgentVersion = customAgentVersion;
            return this;
        }

        /**
         * The scheduling tolerance configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.
         */
        public Builder customTolerations(String customTolerations) {
            this.putQueryParameter("CustomTolerations", customTolerations);
            this.customTolerations = customTolerations;
            return this;
        }

        /**
         * Specifies whether to distribute application instances to multiple nodes. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.
         */
        public Builder deployAcrossNodes(String deployAcrossNodes) {
            this.putQueryParameter("DeployAcrossNodes", deployAcrossNodes);
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }

        /**
         * Specifies whether to distribute application instances across zones. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.
         */
        public Builder deployAcrossZones(String deployAcrossZones) {
            this.putQueryParameter("DeployAcrossZones", deployAcrossZones);
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }

        /**
         * The version of EDAS Container on which the deployment package of the application depends. This parameter is applicable to High-Speed Service Framework (HSF) applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:
         * <p>
         * 
         * *   mountPath: The mount path in the container. This parameter is required.
         * *   readOnly: (Optional) The mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.
         * *   subPathExpr: (Optional) The regular expression that is used to match the subdirectory.
         */
        public Builder emptyDirs(String emptyDirs) {
            this.putQueryParameter("EmptyDirs", emptyDirs);
            this.emptyDirs = emptyDirs;
            return this;
        }

        /**
         * Specifies whether to enable access to Application High Availability Service (AHAS).
         */
        public Builder enableAhas(Boolean enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
            return this;
        }

        /**
         * Specifies whether to enable the empty list protection feature. Valid values:
         * <p>
         * 
         * *   true: enables the empty list protection feature.
         * *   false: disables the empty list protection feature.
         */
        public Builder enableEmptyPushReject(Boolean enableEmptyPushReject) {
            this.putQueryParameter("EnableEmptyPushReject", enableEmptyPushReject);
            this.enableEmptyPushReject = enableEmptyPushReject;
            return this;
        }

        /**
         * Specifies whether to enable graceful start rules. Valid values:
         * <p>
         * 
         * *   true: enables graceful start rules.
         * *   false: disables graceful start rules.
         */
        public Builder enableLosslessRule(Boolean enableLosslessRule) {
            this.putQueryParameter("EnableLosslessRule", enableLosslessRule);
            this.enableLosslessRule = enableLosslessRule;
            return this;
        }

        /**
         * The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.
         * <p>
         * 
         * This parameter contains the following parameters:
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
         * The environment variables that are used to deploy the application. Set this parameter to a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:
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
         * >  If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of "\[]".
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * The absolute URL of the image. This parameter setting overwrites the setting of the ImageTag parameter.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * ImagePlatforms.
         */
        public Builder imagePlatforms(String imagePlatforms) {
            this.putQueryParameter("ImagePlatforms", imagePlatforms);
            this.imagePlatforms = imagePlatforms;
            return this;
        }

        /**
         * The tag of the image.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * InitContainers.
         */
        public Builder initContainers(String initContainers) {
            this.putQueryParameter("InitContainers", initContainers);
            this.initContainers = initContainers;
            return this;
        }

        /**
         * The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Open JDK 7 and Open JDK 8 are supported. This parameter is unavailable if you deploy applications by using images.
         */
        public Builder JDK(String JDK) {
            this.putQueryParameter("JDK", JDK);
            this.JDK = JDK;
            return this;
        }

        /**
         * The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`.
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
         * The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.
         */
        public Builder limitEphemeralStorage(Integer limitEphemeralStorage) {
            this.putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage);
            this.limitEphemeralStorage = limitEphemeralStorage;
            return this;
        }

        /**
         * The configuration for the liveness check on the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * The configurations that are used when the host files are mounted to the container on which the application is running. Example: `\[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt","mountPath":"/app/storage"}\]`. The nodePath parameter specifies the host path, the mountPath parameter specifies the path within the container, and the type parameter specifies the mounting type.
         */
        public Builder localVolume(String localVolume) {
            this.putQueryParameter("LocalVolume", localVolume);
            this.localVolume = localVolume;
            return this;
        }

        /**
         * Specifies whether to enable Graceful Rolling Release and configure Complete Service Registration before Readiness Probing. Valid values:
         * <p>
         * 
         * *   true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.
         * 
         * > If you set both the LosslessRuleRelated parameter and this parameter to true, the operation checks whether the service prefetching is complete.
         * 
         * *   false: If you turn off the switch, the system does not provide a port to check whether the service is registered.
         */
        public Builder losslessRuleAligned(Boolean losslessRuleAligned) {
            this.putQueryParameter("LosslessRuleAligned", losslessRuleAligned);
            this.losslessRuleAligned = losslessRuleAligned;
            return this;
        }

        /**
         * The delay of service registration. Valid values: 0 to 86400. Unit: seconds.
         */
        public Builder losslessRuleDelayTime(Integer losslessRuleDelayTime) {
            this.putQueryParameter("LosslessRuleDelayTime", losslessRuleDelayTime);
            this.losslessRuleDelayTime = losslessRuleDelayTime;
            return this;
        }

        /**
         * The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic amount of the provider during prefetching is displayed as a quadratic curve.
         */
        public Builder losslessRuleFuncType(Integer losslessRuleFuncType) {
            this.putQueryParameter("LosslessRuleFuncType", losslessRuleFuncType);
            this.losslessRuleFuncType = losslessRuleFuncType;
            return this;
        }

        /**
         * Specifies whether to enable Graceful Rolling Release and configure Complete Service Prefetching before Readiness Probing. Valid values:
         * <p>
         * 
         * *   true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.
         * *   false: If you turn off the switch, the system does not provide a port to check whether service prefetching is complete.
         */
        public Builder losslessRuleRelated(Boolean losslessRuleRelated) {
            this.putQueryParameter("LosslessRuleRelated", losslessRuleRelated);
            this.losslessRuleRelated = losslessRuleRelated;
            return this;
        }

        /**
         * The service prefetching duration. Valid values: 0 to 86400. Unit: seconds.
         */
        public Builder losslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
            this.putQueryParameter("LosslessRuleWarmupTime", losslessRuleWarmupTime);
            this.losslessRuleWarmupTime = losslessRuleWarmupTime;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed. Unit: cores. Value 0 indicates that no limit is set on CPU cores.
         */
        public Builder mcpuLimit(Integer mcpuLimit) {
            this.putQueryParameter("McpuLimit", mcpuLimit);
            this.mcpuLimit = mcpuLimit;
            return this;
        }

        /**
         * The minimum number of CPU cores required. Unit: cores. Value 0 indicates that no limit is set on CPU cores.
         * <p>
         * 
         * > You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.
         */
        public Builder mcpuRequest(Integer mcpuRequest) {
            this.putQueryParameter("McpuRequest", mcpuRequest);
            this.mcpuRequest = mcpuRequest;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.
         */
        public Builder memoryLimit(Integer memoryLimit) {
            this.putQueryParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.
         * <p>
         * 
         * > You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.
         */
        public Builder memoryRequest(Integer memoryRequest) {
            this.putQueryParameter("MemoryRequest", memoryRequest);
            this.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: `\[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}\]`. The nasPath parameter specifies the file storage path, and the mountPath parameter specifies the path to mount the file system to the container in which the application is running.
         */
        public Builder mountDescs(String mountDescs) {
            this.putQueryParameter("MountDescs", mountDescs);
            this.mountDescs = mountDescs;
            return this;
        }

        /**
         * The ID of the Apsara File Storage NAS (NAS) file system mounted to the container in which the application is running. The NAS file system must be in the same region as the cluster. The NAS file system must have an available mount target, or have a mount target on the vSwitch in the virtual private cloud (VPC) in which the application resides. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.
         * <p>
         * 
         * > The version of EDAS SDK for Java or Python must be V2.44.0 or later.
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * The version of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application. You must specify a version.
         * <p>
         * 
         * > The version of EDAS SDK for Java or Python must be V2.44.0 or later.
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * The version ID of the deployment package.
         */
        public Builder packageVersionId(String packageVersionId) {
            this.putQueryParameter("PackageVersionId", packageVersionId);
            this.packageVersionId = packageVersionId;
            return this;
        }

        /**
         * The post-start script. Example: `{"exec":{"command":\["cat","/etc/group"\]}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * The pre-stop script. Example: `{"tcpSocket":{"host":"", "port":8080}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
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
         *     *   readOnly: the mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.
         */
        public Builder pvcMountDescs(String pvcMountDescs) {
            this.putQueryParameter("PvcMountDescs", pvcMountDescs);
            this.pvcMountDescs = pvcMountDescs;
            return this;
        }

        /**
         * The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes service is not transmitted to the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": \[{"name": "test","value": "testvalue"}\]}}`. If you want to cancel this configuration, set this parameter to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * The number of application instances. The minimum value is 0.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.
         */
        public Builder requestsEphemeralStorage(Integer requestsEphemeralStorage) {
            this.putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage);
            this.requestsEphemeralStorage = requestsEphemeralStorage;
            return this;
        }

        /**
         * The type of the container runtime. Valid values:
         * <p>
         * 
         * *   runc: standard container runtime
         * *   runv: sandboxed container runtime
         * 
         * This parameter is applicable only to clusters that use sandboxed containers.
         */
        public Builder runtimeClassName(String runtimeClassName) {
            this.putQueryParameter("RuntimeClassName", runtimeClassName);
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        /**
         * Sidecars.
         */
        public Builder sidecars(String sidecars) {
            this.putQueryParameter("Sidecars", sidecars);
            this.sidecars = sidecars;
            return this;
        }

        /**
         * The Logstore configuration. If you want to cancel this configuration, leave the parameter value empty by entering `""` or `"{}"`.
         * <p>
         * 
         * *   The following parameters are included in the configuration:
         * 
         *     *   type: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.
         * 
         *     *   logstore: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:
         * 
         *         *   The name can contain only lowercase letters, digits, hyphens (-), and underscores (\_).
         *         *   The name must start and end with a lowercase letter or a digit.
         *         *   The name must be 3 to 63 characters in length. If you leave this parameter empty, the system automatically generates a name.
         * 
         *     *   logDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * Startup.
         */
        public Builder startup(String startup) {
            this.putQueryParameter("Startup", startup);
            this.startup = startup;
            return this;
        }

        /**
         * The storage type of the NAS file system.
         * <p>
         * 
         * *   Valid values for General-purpose NAS file systems: Capacity and Performance.
         * *   Valid values for Extreme NAS file systems: standard and advance.
         * 
         * You can set this parameter only to Performance.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * TerminateGracePeriod.
         */
        public Builder terminateGracePeriod(Integer terminateGracePeriod) {
            this.putQueryParameter("TerminateGracePeriod", terminateGracePeriod);
            this.terminateGracePeriod = terminateGracePeriod;
            return this;
        }

        /**
         * The traffic adjustment policy for a canary release.
         */
        public Builder trafficControlStrategy(String trafficControlStrategy) {
            this.putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
            this.trafficControlStrategy = trafficControlStrategy;
            return this;
        }

        /**
         * The phased release policy.
         * <p>
         * 
         * *   Example 1: One instance for a canary release + Two subsequent batches + Automatic batching + 1-minute batch interval.
         * 
         * `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`
         * 
         * *   Example 2: One instance for a canary release + Two subsequent batches + Manual batching.
         * 
         * `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`
         * 
         * *   Example 3: Two batches + Automatic batching + 0-minute batch interval.
         * 
         * `{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.
         * <p>
         * 
         * > If you do not specify this parameter in the application configurations, the default URI encoding scheme in the Tomcat container is applied.
         */
        public Builder uriEncoding(String uriEncoding) {
            this.putQueryParameter("UriEncoding", uriEncoding);
            this.uriEncoding = uriEncoding;
            return this;
        }

        /**
         * Specifies whether to use the encoding scheme specified in the request body for URI query parameters.
         * <p>
         * 
         * > If this parameter is not specified in application configuration, the default value false is applied.
         */
        public Builder useBodyEncoding(Boolean useBodyEncoding) {
            this.putQueryParameter("UseBodyEncoding", useBodyEncoding);
            this.useBodyEncoding = useBodyEncoding;
            return this;
        }

        /**
         * UserBaseImageUrl.
         */
        public Builder userBaseImageUrl(String userBaseImageUrl) {
            this.putQueryParameter("UserBaseImageUrl", userBaseImageUrl);
            this.userBaseImageUrl = userBaseImageUrl;
            return this;
        }

        /**
         * The data volume.
         */
        public Builder volumesStr(String volumesStr) {
            this.putQueryParameter("VolumesStr", volumesStr);
            this.volumesStr = volumesStr;
            return this;
        }

        /**
         * The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        /**
         * The Tomcat container configuration. If you want to cancel this configuration, set this parameter to `""` or `"{}"`. The following parameters are included in the configuration:
         * <p>
         * 
         * *   useDefaultConfig: specifies whether to use the default configuration. Value true indicates to use the default configuration. Value false indicates to use the custom configuration. If the default configuration is used, the following parameters do not take effect.
         * 
         * *   contextInputType: the type of the access path for the application. Valid values:
         * 
         *     *   war: The access path for the application is the name of the WAR package. You do not need to specify a custom path.
         *     *   root: The access path for the application is /. You do not need to specify a custom path.
         *     *   custom: If you select this option, you must specify a custom path for the contextPath parameter.
         * 
         * *   contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.
         * 
         * *   httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.
         * 
         * *   maxThreads: the maximum number of connections in the connection pool. Default value: 400.
         * 
         *     **
         * 
         *     **Note**This parameter greatly affects the application performance. We recommend that you set this parameter under professional guidance.
         * 
         * *   uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.
         * 
         * *   useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.
         * 
         * *   useAdvancedServerXml: specifies whether to use advanced configurations to customize the `server.xml` file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the `server.xml` file of Tomcat.
         * 
         * *   serverXml: the content of the `server.xml` file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.
         */
        public Builder webContainerConfig(String webContainerConfig) {
            this.putQueryParameter("WebContainerConfig", webContainerConfig);
            this.webContainerConfig = webContainerConfig;
            return this;
        }

        @Override
        public DeployK8sApplicationRequest build() {
            return new DeployK8sApplicationRequest(this);
        } 

    } 

}
