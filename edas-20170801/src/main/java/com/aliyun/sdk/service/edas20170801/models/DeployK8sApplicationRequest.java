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
 * {@link DeployK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployK8sApplicationRequest</p>
 */
public class DeployK8sApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Args")
    private String args;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchTimeout")
    private Integer batchTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildPackId")
    private String buildPackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanaryRuleId")
    private String canaryRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderDesc")
    private String changeOrderDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuLimit")
    private Integer cpuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuRequest")
    private Integer cpuRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAffinity")
    private String customAffinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentVersion")
    private String customAgentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTolerations")
    private String customTolerations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployAcrossNodes")
    private String deployAcrossNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployAcrossZones")
    private String deployAcrossZones;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmptyDirs")
    private String emptyDirs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAhas")
    private Boolean enableAhas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEmptyPushReject")
    private Boolean enableEmptyPushReject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLosslessRule")
    private Boolean enableLosslessRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvFroms")
    private String envFroms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImagePlatforms")
    private String imagePlatforms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    private String imageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitContainers")
    private String initContainers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JDK")
    private String JDK;

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
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVolume")
    private String localVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LosslessRuleAligned")
    private Boolean losslessRuleAligned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LosslessRuleDelayTime")
    private Integer losslessRuleDelayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LosslessRuleFuncType")
    private Integer losslessRuleFuncType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LosslessRuleRelated")
    private Boolean losslessRuleRelated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LosslessRuleWarmupTime")
    private Integer losslessRuleWarmupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpuLimit")
    private Integer mcpuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpuRequest")
    private Integer mcpuRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryLimit")
    private Integer memoryLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryRequest")
    private Integer memoryRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountDescs")
    private String mountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NasId")
    private String nasId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersion")
    private String packageVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersionId")
    private String packageVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostStart")
    private String postStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreStop")
    private String preStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PvcMountDescs")
    private String pvcMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Readiness")
    private String readiness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Integer replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sidecars")
    private String sidecars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsConfigs")
    private String slsConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Startup")
    private String startup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminateGracePeriod")
    private Integer terminateGracePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlStrategy")
    private String trafficControlStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateStrategy")
    private String updateStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UriEncoding")
    private String uriEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
    private Boolean useBodyEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserBaseImageUrl")
    private String userBaseImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumesStr")
    private String volumesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainer")
    private String webContainer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainerConfig")
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
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e83acea6-****-47e1-96ae-c0e953772cdc</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The argument array in the container start-up command. Set this parameter to a JSON array in the format of <code>[&quot;args1&quot;,&quot;args2&quot;\]</code>, where each key is set to a string. If you want to cancel this configuration, set this parameter to an empty JSON array in the format of <code>&quot;[\]&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;args1&quot;,&quot;args2&quot;]</p>
         */
        public Builder args(String args) {
            this.putQueryParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * <p>The timeout period for an at-a-time release. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder batchTimeout(Integer batchTimeout) {
            this.putQueryParameter("BatchTimeout", batchTimeout);
            this.batchTimeout = batchTimeout;
            return this;
        }

        /**
         * <p>The minimum time interval for the phased release of pods. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds">minReadySeconds</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * <p>The build package number of EDAS Container.</p>
         * <ul>
         * <li>You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</li>
         * <li>Set the parameter if you need to update the EDAS Container version of the application during the deployment.</li>
         * </ul>
         * <p>You can query the build package number by using one of the following methods:</p>
         * <ul>
         * <li>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/423222.html">ListBuildPack</a>.</li>
         * <li>Obtain the value in the <strong>Build package number</strong> column of the <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a> topic. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>59</p>
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
         * <p>The description of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder changeOrderDesc(String changeOrderDesc) {
            this.putQueryParameter("ChangeOrderDesc", changeOrderDesc);
            this.changeOrderDesc = changeOrderDesc;
            return this;
        }

        /**
         * <p>The commands that you run to start the container.</p>
         * <blockquote>
         * <p>If you want to cancel this configuration, set this parameter to an empty string in the format of <code>&quot;&quot;</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ls</p>
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
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
         * <p>[
         *       {
         *             &quot;name&quot;: &quot;nginx-config&quot;,
         *             &quot;type&quot;: &quot;ConfigMap&quot;,
         *             &quot;mountPath&quot;: &quot;/etc/nginx&quot;
         *       },
         *       {
         *             &quot;name&quot;: &quot;tls-secret&quot;,
         *             &quot;type&quot;: &quot;Secret&quot;,
         *             &quot;mountPath&quot;: &quot;/etc/ssh&quot;
         *       }
         * ]</p>
         */
        public Builder configMountDescs(String configMountDescs) {
            this.putQueryParameter("ConfigMountDescs", configMountDescs);
            this.configMountDescs = configMountDescs;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuLimit(Integer cpuLimit) {
            this.putQueryParameter("CpuLimit", cpuLimit);
            this.cpuLimit = cpuLimit;
            return this;
        }

        /**
         * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. Value 0 indicates that no limit is set on CPU cores.</p>
         * <blockquote>
         * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cpuRequest(Integer cpuRequest) {
            this.putQueryParameter("CpuRequest", cpuRequest);
            this.cpuRequest = cpuRequest;
            return this;
        }

        /**
         * <p>The affinity configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nodeAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:{&quot;nodeSelectorTerms&quot;:[{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;beta.kubernetes.io/arch&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;arm64&quot;,&quot;arm32&quot;]}]}]},&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;weight&quot;:5,&quot;preference&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;kubernetes.io/os&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;linux&quot;]}]}}]},&quot;podAffinity&quot;:{&quot;requiredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;kubernetes.io/hostname&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;NotIn&quot;,&quot;values&quot;:[&quot;edas-test-app&quot;]}]}}]},&quot;podAntiAffinity&quot;:{&quot;preferredDuringSchedulingIgnoredDuringExecution&quot;:[{&quot;podAffinityTerm&quot;:{&quot;namespaces&quot;:[&quot;default&quot;],&quot;topologyKey&quot;:&quot;failure-domain.beta.kubernetes.io/zone&quot;,&quot;labelSelector&quot;:{&quot;matchExpressions&quot;:[{&quot;key&quot;:&quot;edas.oam.acname&quot;,&quot;operator&quot;:&quot;In&quot;,&quot;values&quot;:[&quot;edas-test-app-2&quot;]}]}},&quot;weight&quot;:15}]}}</p>
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
         * <p>The scheduling tolerance configuration of the pod. This parameter takes effect only if both the DeployAcrossNodes and DeployAcrossZones parameters are set to false.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;edas-taint-key2&quot;,&quot;operator&quot;:&quot;Exists&quot;,&quot;effect&quot;:&quot;NoExecute&quot;,&quot;tolerationSeconds&quot;:50},{&quot;key&quot;:&quot;edas-taint-key&quot;,&quot;operator&quot;:&quot;Equal&quot;,&quot;value&quot;:&quot;edas-taint-value&quot;,&quot;effect&quot;:&quot;PreferNoSchedule&quot;}]</p>
         */
        public Builder customTolerations(String customTolerations) {
            this.putQueryParameter("CustomTolerations", customTolerations);
            this.customTolerations = customTolerations;
            return this;
        }

        /**
         * <p>Specifies whether to distribute application instances to multiple nodes. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deployAcrossNodes(String deployAcrossNodes) {
            this.putQueryParameter("DeployAcrossNodes", deployAcrossNodes);
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }

        /**
         * <p>Specifies whether to distribute application instances across zones. Value true indicates that application instances are distrubuted across zones. Other values indicate that application instances are not distributed across zones.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deployAcrossZones(String deployAcrossZones) {
            this.putQueryParameter("DeployAcrossZones", deployAcrossZones);
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }

        /**
         * <p>The version of EDAS Container on which the deployment package of the application depends. This parameter is applicable to High-Speed Service Framework (HSF) applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.9</p>
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * <p>The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
         * <ul>
         * <li>mountPath: The mount path in the container. This parameter is required.</li>
         * <li>readOnly: (Optional) The mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</li>
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
         * <p>Specifies whether to enable access to Application High Availability Service (AHAS).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAhas(Boolean enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
            return this;
        }

        /**
         * <p>Specifies whether to enable the empty list protection feature. Valid values:</p>
         * <ul>
         * <li>true: enables the empty list protection feature.</li>
         * <li>false: disables the empty list protection feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableEmptyPushReject(Boolean enableEmptyPushReject) {
            this.putQueryParameter("EnableEmptyPushReject", enableEmptyPushReject);
            this.enableEmptyPushReject = enableEmptyPushReject;
            return this;
        }

        /**
         * <p>Specifies whether to enable graceful start rules. Valid values:</p>
         * <ul>
         * <li>true: enables graceful start rules.</li>
         * <li>false: disables graceful start rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableLosslessRule(Boolean enableLosslessRule) {
            this.putQueryParameter("EnableLosslessRule", enableLosslessRule);
            this.enableLosslessRule = enableLosslessRule;
            return this;
        }

        /**
         * <p>The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.</p>
         * <p>This parameter contains the following parameters:</p>
         * <ul>
         * <li><p>configMapRef: the ConfigMap that is referenced. The following parameter is contained:</p>
         * <ul>
         * <li>name: the name of the ConfigMap.</li>
         * </ul>
         * </li>
         * <li><p>secretRef: the Secret that is referenced. The following parameter is contained:</p>
         * <ul>
         * <li>name: the name of the Secret.</li>
         * </ul>
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
         * <p>The environment variables that are used to deploy the application. Set this parameter to a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
         * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
         * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
         * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
         * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
         * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
         * <blockquote>
         * <p> If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of &quot;[]&quot;.</p>
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
         * <p>The absolute URL of the image. This parameter setting overwrites the setting of the ImageTag parameter.</p>
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The destination image platform. This parameter takes effect only when you deploy applications by using .war or .jar packages.</p>
         * <ul>
         * <li>If you want to specify x86_64, set the value to linux/amd64.</li>
         * <li>If you want to specify ARM64, set the value to linux/arm64.</li>
         * <li>If you want to specify both x86_64 and ARM64, set the value to linux/amd64,linux/arm64.</li>
         * <li>If you leave this parameter empty, the default architecture is used.</li>
         * </ul>
         */
        public Builder imagePlatforms(String imagePlatforms) {
            this.putQueryParameter("ImagePlatforms", imagePlatforms);
            this.imagePlatforms = imagePlatforms;
            return this;
        }

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
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
         * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Open JDK 7 and Open JDK 8 are supported. This parameter is unavailable if you deploy applications by using images.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        public Builder JDK(String JDK) {
            this.putQueryParameter("JDK", JDK);
            this.JDK = JDK;
            return this;
        }

        /**
         * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>.</p>
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
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
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
         * <p>The configuration for the liveness check on the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}\]</code>. The nodePath parameter specifies the host path, the mountPath parameter specifies the path within the container, and the type parameter specifies the mounting type.</p>
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
         * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Registration before Readiness Probing. Valid values:</p>
         * <ul>
         * <li>true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</li>
         * </ul>
         * <blockquote>
         * <p>If you set both the LosslessRuleRelated parameter and this parameter to true, the operation checks whether the service prefetching is complete.</p>
         * </blockquote>
         * <ul>
         * <li>false: If you turn off the switch, the system does not provide a port to check whether the service is registered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder losslessRuleAligned(Boolean losslessRuleAligned) {
            this.putQueryParameter("LosslessRuleAligned", losslessRuleAligned);
            this.losslessRuleAligned = losslessRuleAligned;
            return this;
        }

        /**
         * <p>The delay of service registration. Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder losslessRuleDelayTime(Integer losslessRuleDelayTime) {
            this.putQueryParameter("LosslessRuleDelayTime", losslessRuleDelayTime);
            this.losslessRuleDelayTime = losslessRuleDelayTime;
            return this;
        }

        /**
         * <p>The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic amount of the provider during prefetching is displayed as a quadratic curve.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder losslessRuleFuncType(Integer losslessRuleFuncType) {
            this.putQueryParameter("LosslessRuleFuncType", losslessRuleFuncType);
            this.losslessRuleFuncType = losslessRuleFuncType;
            return this;
        }

        /**
         * <p>Specifies whether to enable Graceful Rolling Release and configure Complete Service Prefetching before Readiness Probing. Valid values:</p>
         * <ul>
         * <li>true: If you turn on the switch, the system uses the /health path and provides port 55199 for the health check. The system does not intrude into the application. When service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</li>
         * <li>false: If you turn off the switch, the system does not provide a port to check whether service prefetching is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder losslessRuleRelated(Boolean losslessRuleRelated) {
            this.putQueryParameter("LosslessRuleRelated", losslessRuleRelated);
            this.losslessRuleRelated = losslessRuleRelated;
            return this;
        }

        /**
         * <p>The service prefetching duration. Valid values: 0 to 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder losslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
            this.putQueryParameter("LosslessRuleWarmupTime", losslessRuleWarmupTime);
            this.losslessRuleWarmupTime = losslessRuleWarmupTime;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mcpuLimit(Integer mcpuLimit) {
            this.putQueryParameter("McpuLimit", mcpuLimit);
            this.mcpuLimit = mcpuLimit;
            return this;
        }

        /**
         * <p>The minimum number of CPU cores required. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
         * <blockquote>
         * <p>You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder mcpuRequest(Integer mcpuRequest) {
            this.putQueryParameter("McpuRequest", mcpuRequest);
            this.mcpuRequest = mcpuRequest;
            return this;
        }

        /**
         * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder memoryLimit(Integer memoryLimit) {
            this.putQueryParameter("MemoryLimit", memoryLimit);
            this.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * <p>The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.</p>
         * <blockquote>
         * <p>You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder memoryRequest(Integer memoryRequest) {
            this.putQueryParameter("MemoryRequest", memoryRequest);
            this.memoryRequest = memoryRequest;
            return this;
        }

        /**
         * <p>The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}\]</code>. The nasPath parameter specifies the file storage path, and the mountPath parameter specifies the path to mount the file system to the container in which the application is running.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</p>
         */
        public Builder mountDescs(String mountDescs) {
            this.putQueryParameter("MountDescs", mountDescs);
            this.mountDescs = mountDescs;
            return this;
        }

        /**
         * <p>The ID of the File Storage NAS (NAS) file system mounted to the container in which the application is running. The NAS file system must be in the same region as the cluster. The NAS file system must have an available mount target, or have a mount target on the vSwitch in the virtual private cloud (VPC) in which the application resides. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>dfs23****</p>
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
         * <blockquote>
         * <p>The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
         * </blockquote>
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
         * <p>The version of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application. You must specify a version.</p>
         * <blockquote>
         * <p>The version of EDAS SDK for Java or Python must be V2.44.0 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20200720</p>
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * <p>The version ID of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2bcc********</p>
         */
        public Builder packageVersionId(String packageVersionId) {
            this.putQueryParameter("PackageVersionId", packageVersionId);
            this.packageVersionId = packageVersionId;
            return this;
        }

        /**
         * <p>The post-start script. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;ls&quot;,&quot;/&quot;]}}&quot;</p>
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The pre-stop script. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;ls&quot;,&quot;/&quot;]}}&quot;</p>
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
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
         * <li>readOnly: the mount mode. Value true indicates the read-only mode. Value false indicates the read and write mode. Default value: false.</li>
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
         * <p>The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes service is not transmitted to the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}\]}}</code>. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</p>
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * <p>The number of application instances. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the ephemeral storage space.</p>
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
         * <p>The type of the container runtime. Valid values:</p>
         * <ul>
         * <li>runc: standard container runtime</li>
         * <li>runv: sandboxed container runtime</li>
         * </ul>
         * <p>This parameter is applicable only to clusters that use sandboxed containers.</p>
         * 
         * <strong>example:</strong>
         * <p>runc</p>
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
         * <p>The Logstore configuration. If you want to cancel this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>.</p>
         * <ul>
         * <li><p>The following parameters are included in the configuration:</p>
         * <ul>
         * <li><p>type: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
         * </li>
         * <li><p>logstore: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
         * <ul>
         * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length. If you leave this parameter empty, the system automatically generates a name.</li>
         * </ul>
         * </li>
         * <li><p>logDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (*) are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logstore&quot;:&quot;thisisanotherfilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/var/log/<em>&quot;},{&quot;logstore&quot;:&quot;&quot;,&quot;type&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;stdout.log&quot;},{&quot;logstore&quot;:&quot;thisisafilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/tmp/log/</em>&quot;}]</p>
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
         * <p>The storage type of the NAS file system.</p>
         * <ul>
         * <li>Valid values for General-purpose NAS file systems: Capacity and Performance.</li>
         * <li>Valid values for Extreme NAS file systems: standard and advance.</li>
         * </ul>
         * <p>You can set this parameter only to Performance.</p>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
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
         * <p>The traffic adjustment policy for a canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;http&quot;:{&quot;rules&quot;:[{&quot;conditionType&quot;:&quot;percent&quot;,&quot;percent&quot;:10}]}}</p>
         */
        public Builder trafficControlStrategy(String trafficControlStrategy) {
            this.putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
            this.trafficControlStrategy = trafficControlStrategy;
            return this;
        }

        /**
         * <p>The phased release policy.</p>
         * <ul>
         * <li>Example 1: One instance for a canary release + Two subsequent batches + Automatic batching + 1-minute batch interval.</li>
         * </ul>
         * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * <ul>
         * <li>Example 2: One instance for a canary release + Two subsequent batches + Manual batching.</li>
         * </ul>
         * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * <ul>
         * <li>Example 3: Two batches + Automatic batching + 0-minute batch interval.</li>
         * </ul>
         * <p><code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * <p>The URI encoding scheme. Valid values: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
         * <blockquote>
         * <p>If you do not specify this parameter in the application configurations, the default URI encoding scheme in the Tomcat container is applied.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GBK</p>
         */
        public Builder uriEncoding(String uriEncoding) {
            this.putQueryParameter("UriEncoding", uriEncoding);
            this.uriEncoding = uriEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
         * <blockquote>
         * <p>If this parameter is not specified in application configuration, the default value false is applied.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The data volume.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder volumesStr(String volumesStr) {
            this.putQueryParameter("VolumesStr", volumesStr);
            this.volumesStr = volumesStr;
            return this;
        }

        /**
         * <p>The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.</p>
         * 
         * <strong>example:</strong>
         * <p>apache-tomcat-7.0.91</p>
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        /**
         * <p>The Tomcat container configuration. If you want to cancel this configuration, set this parameter to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>. The following parameters are included in the configuration:</p>
         * <ul>
         * <li><p>useDefaultConfig: specifies whether to use the default configuration. Value true indicates to use the default configuration. Value false indicates to use the custom configuration. If the default configuration is used, the following parameters do not take effect.</p>
         * </li>
         * <li><p>contextInputType: the type of the access path for the application. Valid values:</p>
         * <ul>
         * <li>war: The access path for the application is the name of the WAR package. You do not need to specify a custom path.</li>
         * <li>root: The access path for the application is /. You do not need to specify a custom path.</li>
         * <li>custom: If you select this option, you must specify a custom path for the contextPath parameter.</li>
         * </ul>
         * </li>
         * <li><p>contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.</p>
         * </li>
         * <li><p>httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
         * </li>
         * <li><p>maxThreads: the maximum number of connections in the connection pool. Default value: 400.</p>
         * <p>**</p>
         * <p><strong>Note</strong>This parameter greatly affects the application performance. We recommend that you set this parameter under professional guidance.</p>
         * </li>
         * <li><p>uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
         * </li>
         * <li><p>useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
         * </li>
         * <li><p>useAdvancedServerXml: specifies whether to use advanced configurations to customize the <code>server.xml</code> file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the <code>server.xml</code> file of Tomcat.</p>
         * </li>
         * <li><p>serverXml: the content of the <code>server.xml</code> file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;useDefaultConfig&quot;:false,&quot;contextInputType&quot;:&quot;custom&quot;,&quot;contextPath&quot;:&quot;hello&quot;,&quot;httpPort&quot;:8088,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;UTF-8&quot;,&quot;useBodyEncoding&quot;:true,&quot;useAdvancedServerXml&quot;:false}</p>
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
