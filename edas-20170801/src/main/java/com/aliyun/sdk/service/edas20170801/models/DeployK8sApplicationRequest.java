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
    @com.aliyun.core.annotation.NameInMap("SecurityContext")
    private String securityContext;

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
        this.securityContext = builder.securityContext;
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
     * @return securityContext
     */
    public String getSecurityContext() {
        return this.securityContext;
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
        private String securityContext; 
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
            this.securityContext = request.securityContext;
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
         * <p>The annotations for the application pod.</p>
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
         * <p>The application ID. Obtain the ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
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
         * <p>The arguments for the container startup command. The value must be a JSON array of strings, such as <code>[&quot;Argument 1&quot;, &quot;Argument 2&quot;]</code>. To clear the arguments, set the parameter to an empty JSON array <code>&quot;[]&quot;</code>.</p>
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
         * <p>The timeout period for a single batch release. Unit: seconds.</p>
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
         * <p>The minimum interval for a phased release of pods. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#min-ready-seconds">minReadySeconds</a>.</p>
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
         * <p>The build package number for EDAS Container:</p>
         * <ul>
         * <li><p>If you do not need to change the EDAS Container version during deployment, you can leave this parameter unset.</p>
         * </li>
         * <li><p>To update the EDAS Container version of the target application during this deployment, you must set this parameter.</p>
         * </li>
         * </ul>
         * <p>You can obtain the number in two ways:</p>
         * <ul>
         * <li><p>Call the ListBuildPack operation to query the list of container versions. For more information, see <a href="https://help.aliyun.com/document_detail/423222.html">ListBuildPack</a>.</p>
         * </li>
         * <li><p>Obtain it from the <strong>Build Package Number</strong> column in the <a href="https://help.aliyun.com/document_detail/92614.html">Version guide</a> table. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</p>
         * </li>
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
         * <p>The ID of the canary release rule policy.</p>
         * 
         * <strong>example:</strong>
         * <p>a8daf22e-****-968c7ff2ea34</p>
         */
        public Builder canaryRuleId(String canaryRuleId) {
            this.putQueryParameter("CanaryRuleId", canaryRuleId);
            this.canaryRuleId = canaryRuleId;
            return this;
        }

        /**
         * <p>The description of the change record.</p>
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
         * <p>The container startup command.</p>
         * <blockquote>
         * <p>To clear this configuration, set the parameter to an empty string <code>&quot;&quot;</code>.</p>
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
         * <p>Configures Kubernetes ConfigMap and Secret mounts. This lets you mount a ConfigMap or Secret to a specified container directory. The parameters for \<code>ConfigMountDescs\\</code> are as follows:</p>
         * <ul>
         * <li><p>\<code>name\\</code>: The name of the ConfigMap or Secret.</p>
         * </li>
         * <li><p>\<code>type\\</code>: The configuration type. \<code>ConfigMap\\</code> and \<code>Secret\\</code> are supported.</p>
         * </li>
         * <li><p>\<code>mountPath\\</code>: The mount path. An absolute path in the container that starts with a forward slash (/).</p>
         * </li>
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
         * <p>The CPU limit for the application instance during runtime. Unit: cores. A value of 0 means no limit.</p>
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
         * <p>The CPU quota to request for the application instance during runtime. Setting this parameter is recommended.
         * Unit: cores. A value of 0 means no limit.</p>
         * <blockquote>
         * <p>If you set this parameter, also set the CpuLimit parameter. The value of CpuRequest must be less than or equal to the value of CpuLimit.</p>
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
         * <p>The pod affinity configuration. This takes effect only when both \<code>DeployAcrossNodes\\</code> and \<code>DeployAcrossZones\\</code> are \<code>false\\</code>.</p>
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
         * <p>Sets the version of the custom Application Real-Time Monitoring Service (ARMS) agent to mount to the application.</p>
         * <blockquote>
         * <p>This feature is available only to whitelisted users. To use this feature, submit a ticket to be added to the whitelist.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3.1.4</p>
         */
        public Builder customAgentVersion(String customAgentVersion) {
            this.putQueryParameter("CustomAgentVersion", customAgentVersion);
            this.customAgentVersion = customAgentVersion;
            return this;
        }

        /**
         * <p>The pod scheduling toleration configuration. This takes effect only when both \<code>DeployAcrossNodes\\</code> and \<code>DeployAcrossZones\\</code> are \<code>false\\</code>.</p>
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
         * <p>Specifies whether to distribute application instances across multiple nodes. \<code>true\\</code> indicates yes, and other values indicate no.</p>
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
         * <p>Specifies whether to distribute application instances across multiple zones. \<code>true\\</code> indicates yes, and other values indicate no.</p>
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
         * <p>The EDAS Container version on which the deployment package depends. This parameter applies to HSF applications deployed using WAR packages. It is not supported for image-based deployments.</p>
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
         * <p>Configures Kubernetes \<code>emptyDir\\</code> mounts. This lets you mount an \<code>emptyDir\\</code> volume to a specified container directory. The parameters for \<code>EmptyDirs\\</code> are as follows:</p>
         * <ul>
         * <li><p>\<code>mountPath\\</code>: The container mount path. This is required.</p>
         * </li>
         * <li><p>\<code>readOnly\\</code>: Specifies whether the volume is read-only. Optional. \<code>true\\</code> for read-only, \<code>false\\</code> for read-write. The default is \<code>false\\</code>.</p>
         * </li>
         * <li><p>\<code>subPathExpr\\</code>: The subdirectory expression. Optional.</p>
         * </li>
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
         * <p>Specifies whether to connect to Application High Availability Service (AHAS).</p>
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
         * <p>Specifies whether to enable empty push protection:</p>
         * <ul>
         * <li><p>\<code>true\\</code>: Enable empty push protection.</p>
         * </li>
         * <li><p>\<code>false\\</code>: Do not enable empty push protection.</p>
         * </li>
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
         * <p>Specifies whether to enable the graceful start rule:</p>
         * <ul>
         * <li><p>\<code>true\\</code>: Enable the graceful start rule.</p>
         * </li>
         * <li><p>\<code>false\\</code>: Do not enable the graceful start rule.</p>
         * </li>
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
         * <p>Configures environment variables of the Kubernetes \<code>EnvFrom\\</code> type. This mounts a specified ConfigMap or Secret to a directory. Each key corresponds to a file in the directory, and the file content is the value of the key.</p>
         * <p>The parameters for \<code>EnvFroms\\</code> are as follows.</p>
         * <ul>
         * <li><p>\<code>configMapRef\\</code>: A reference to a ConfigMap. This field includes the following parameter:</p>
         * <ul>
         * <li>\<code>name\\</code>: The name of the ConfigMap.</li>
         * </ul>
         * </li>
         * <li><p>\<code>secretRef\\</code>: A reference to a Secret. This field includes the following parameter:</p>
         * <ul>
         * <li>\<code>name\\</code>: The name of the Secret.</li>
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
         * <p>The environment variables for the deployment. The value must be a JSON array of objects. Three types of environment variables are supported: regular, Kubernetes ConfigMap, and Kubernetes Secret. The format for a regular environment variable is as follows:</p>
         * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
         * <p>A ConfigMap environment variable injects the value of a specified key from a ConfigMap into the container\&quot;s environment variables. The format is as follows:</p>
         * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
         * <p>A Secret environment variable injects the value of a specified key from a Secret into the container\&quot;s environment variables. The format is as follows:</p>
         * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
         * <blockquote>
         * <p>To clear this configuration, set the parameter to an empty JSON array \<code>[]\\</code>.</p>
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
         * <p>The full URL of the image. This parameter overwrites the ImageTag parameter.</p>
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The target platform architecture for the image. This is valid when deploying with a WAR or JAR file. Examples:</p>
         * <ul>
         * <li><p>To specify the x86-64 architecture: \<code>linux/amd64\\</code></p>
         * </li>
         * <li><p>To specify the ARM 64 architecture: \<code>linux/arm64\\</code></p>
         * </li>
         * <li><p>To build a dual-architecture image: \<code>linux/amd64,linux/arm64\\</code></p>
         * </li>
         * <li><p>If you do not enter a value, the default architecture is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux/arm64,linux/amd64</p>
         */
        public Builder imagePlatforms(String imagePlatforms) {
            this.putQueryParameter("ImagePlatforms", imagePlatforms);
            this.imagePlatforms = imagePlatforms;
            return this;
        }

        /**
         * <p>The image tag.</p>
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
         * <p>Sets an init container for the application pod. The container configuration is in YAML format. The value is the base64-encoded YAML configuration of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;yamlEncoded&quot;: &quot;Y29tbWFuZDoKICAtIHNsZWVwCiAgLSAnNjAnCmltYWdlOiAnYnVzeWJveDpsYXRlc3QnCm5hbWU6IGluaXQtYnVzeWJveAo=&quot;
         *       }
         * ]</p>
         */
        public Builder initContainers(String initContainers) {
            this.putQueryParameter("InitContainers", initContainers);
            this.initContainers = initContainers;
            return this;
        }

        /**
         * <p>The JDK version on which the deployment package depends. Valid values: Open JDK 7, Open JDK 8, or Custom OpenJDK. This parameter is not supported for image-based deployments. If you use Custom OpenJDK, you must also configure the \<code>UserBaseImageUrl\\</code> field.</p>
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
         * <p>The Java startup parameters. You can configure memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom settings. Correctly configuring these parameters helps reduce GC overhead, shorten server response time, and improve throughput. The parameter is a JSON string. \<code>original\\</code> is the configuration value, and \<code>startup\\</code> is the startup parameter. The system automatically concatenates all \<code>startup\\</code> values as the Java startup parameters for the application. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration.</p>
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
         * <p>The labels for the application pod.</p>
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
         * <p>The upper limit of the temporary storage resource requirement. Unit: GB. A value of 0 means no limit.</p>
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
         * <p>The liveness probe for the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>. To delete this configuration, set the parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
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
         * <p>The configuration for mounting a host file to a container. Example: <code>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/localfiles&quot;,&quot;mountPath&quot;:&quot;/app/files&quot;},{&quot;type&quot;:&quot;Directory&quot;,&quot;nodePath&quot;:&quot;/mnt&quot;,&quot;mountPath&quot;:&quot;/app/storage&quot;}]</code>. In this example, \<code>nodePath\\</code> is the host path, \<code>mountPath\\</code> is the path in the container, and \<code>type\\</code> is the mount type.</p>
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
         * <p>Specifies whether to enable the graceful rolling deployment mode to complete service registration before the readiness probe succeeds:</p>
         * <ul>
         * <li>\<code>true\\</code>: This switch provides a health check for the application on port 55199 and the \<code>/health\\</code> path without intrusion. When service registration is complete, the interface returns 200. Otherwise, it returns 500.</li>
         * </ul>
         * <blockquote>
         * <p>If \<code>LosslessRuleRelated\\</code> is also set to \<code>true\\</code>, this interface checks whether service prefetch is complete.</p>
         * </blockquote>
         * <ul>
         * <li>\<code>false\\</code>: Does not provide an interface for the application to check if service registration is complete.</li>
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
         * <p>The service registration latency. Unit: seconds. The value ranges from 0 to 86400.</p>
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
         * <p>The service prefetch curve. The value ranges from 0 to 20. The default is 2, which is suitable for general prefetch scenarios. This indicates that the traffic receiving curve of the service provider follows a quadratic curve during the prefetch period.</p>
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
         * <p>Specifies whether to enable the graceful rolling deployment mode to complete service prefetch before the readiness probe succeeds:</p>
         * <ul>
         * <li><p>\<code>true\\</code>: This switch provides a health check for the application on port 55199 and the \<code>/health\\</code> path without intrusion. When service prefetch is complete, the interface returns 200. Otherwise, it returns 500.</p>
         * </li>
         * <li><p>\<code>false\\</code>: Does not provide an interface for the application to check if service prefetch is complete.</p>
         * </li>
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
         * <p>The service prefetch duration. Unit: seconds. The value ranges from 0 to 86400.</p>
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
         * <p>The maximum CPU that can be used. Unit: cores. A value of 0 means no limit.</p>
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
         * <p>The minimum CPU resource requirement. Unit: cores. A value of 0 means no limit.</p>
         * <blockquote>
         * <p>If you set this parameter, you must also set the \<code>CpuLimit\\</code> parameter. The value must be less than or equal to the value of \<code>CpuLimit\\</code>.</p>
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
         * <p>The memory limit for the application instance during runtime. Unit: MB. A value of 0 means no limit.</p>
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
         * <p>The memory quota to request for the application instance during runtime. Setting this parameter is recommended. Unit: MB. A value of 0 means no request.</p>
         * <blockquote>
         * <p>If you set this parameter, also set the MemoryLimit parameter. The value of MemoryRequest must be less than or equal to the value of MemoryLimit.</p>
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
         * <p>The mount configurations, which are a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}]</code>. In this example, \<code>nasPath\\</code> is the file storage path and \<code>mountPath\\</code> is the path in the container to which the file system is mounted.</p>
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
         * <p>The ID of the Apsara File Storage NAS (NAS) file system to mount. The NAS file system must be in the same region as the cluster. It must have an available mount target quota, or its mount target must be on a vSwitch in the VPC. If you do not set this parameter but the \<code>mountDescs\\</code> field exists, a NAS file system is automatically purchased and mounted to a vSwitch in the VPC by default.</p>
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
         * <p>The URL of the deployment package. Configure this parameter for applications deployed using a FatJar or WAR package.</p>
         * <blockquote>
         * <p>The Java or Python SDK for EDAS POP API must be version 2.44.0 or later.</p>
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
         * <p>The version number of the deployment package. This parameter is required for WAR and FatJar packages. You can define the meaning of the version number.</p>
         * <blockquote>
         * <p>The Java or Python SDK for EDAS POP API must be version 2.44.0 or later.</p>
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
         * <p>The ID of the deployment package version.</p>
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
         * <p>The script to execute after the container starts. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code>. To delete this configuration, set the parameter to <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;exec&quot;:{
         *         &quot;command&quot;:[
         *             &quot;ls&quot;,
         *             &quot;/&quot;
         *         ]
         *     }
         * }</p>
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The script to execute before stopping the container. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.
         * To delete this configuration, set the parameter to <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;exec&quot;:{
         *         &quot;command&quot;:[
         *             &quot;ls&quot;,
         *             &quot;/&quot;
         *         ]
         *     }
         * }</p>
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * <p>Configures Kubernetes PersistentVolumeClaim (PVC) mounts. This lets you mount a Kubernetes PVC volume to a specified container directory. The parameters for \<code>PvcMountDescs\\</code> are as follows:</p>
         * <ul>
         * <li><p>\<code>pvcName\\</code>: The name of the PVC volume. The PVC volume must already exist and be in the Bound state.</p>
         * </li>
         * <li><p>\<code>mountPaths\\</code>: A list of mount directories. You can configure multiple mount directories. Each mount directory supports the following two parameters:</p>
         * <ul>
         * <li><p>\<code>mountPath\\</code>: The mount path. An absolute path in the container that starts with a forward slash (/).</p>
         * </li>
         * <li><p>\<code>readOnly\\</code>: The mount mode. \<code>true\\</code> for read-only, \<code>false\\</code> for read-write. The default is \<code>false\\</code>.</p>
         * </li>
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
         * <p>The readiness probe for the container. If the probe fails, traffic from the Kubernetes service is not routed to the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}</code>. To delete this configuration, set the parameter to <code>&quot;&quot;</code> or <code>{}</code>. If you do not set this parameter, the configuration is ignored.</p>
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
         * <p>The minimum temporary storage resource requirement. Unit: GB. A value of 0 means no limit.</p>
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
         * <p>The container runtime type:</p>
         * <ul>
         * <li><p>\<code>runc\\</code>: regular container runtime.</p>
         * </li>
         * <li><p>\<code>runv\\</code>: sandboxed container.</p>
         * </li>
         * </ul>
         * <p>This parameter applies only to clusters that use sandboxed containers.</p>
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
         * <p>Sets the \<code>SecurityContext\\</code> property for the application pod container. The value is the base64-encoded YAML configuration of the \<code>SecurityContext\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;yamlEncoded&quot;:&quot;cnVuQXNVc2VyOiAwCnJ1bkFzR3JvdXA6IDA=&quot;}</p>
         */
        public Builder securityContext(String securityContext) {
            this.putQueryParameter("SecurityContext", securityContext);
            this.securityContext = securityContext;
            return this;
        }

        /**
         * <p>Sets a sidecar container for the application pod. The container configuration is in YAML format. The value is the base64-encoded YAML configuration of the sidecar container.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;yamlEncoded&quot;: &quot;Y29tbWFuZDoKICAtIHRhaWwKICAtICctZicKICAtIC9kZXYvbnVsbAppbWFnZTogJ2J1c3lib3g6bGF0ZXN0JwpuYW1lOiBidXN5Ym94Cg==&quot;
         *       }
         * ]</p>
         */
        public Builder sidecars(String sidecars) {
            this.putQueryParameter("Sidecars", sidecars);
            this.sidecars = sidecars;
            return this;
        }

        /**
         * <p>The Logstore configuration. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration:</p>
         * <ul>
         * <li><p>\<code>Configs\\</code>:</p>
         * <ul>
         * <li><p>\<code>type\\</code>: The collection type. \<code>file\\</code> for file type, \<code>stdout\\</code> for standard output type.</p>
         * </li>
         * <li><p>\<code>Logstore\\</code>: The name of the Logstore. Make sure the Logstore name is unique within the same cluster. The name must follow these rules:</p>
         * <ul>
         * <li><p>It can only contain lowercase letters, numbers, hyphens (-), and underscores (_).</p>
         * </li>
         * <li><p>It must start and end with a lowercase letter or a number.</p>
         * </li>
         * <li><p>The name must be 3 to 63 characters long. If left empty, the system generates a name automatically.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>\<code>LogDir\\</code>: If the type is standard output, the collection path is \<code>stdout.log\\</code>. If the type is file, this is the path of the file to collect. Wildcards are supported. The collection path must match the regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
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
         * <p>The startup probe can be used to perform liveness checks on slow-starting containers to prevent them from being killed before they are up and running. Example: {&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}]}}.</p>
         * <p>To delete this configuration, set the parameter to &quot;&quot; or {}. If you do not set this parameter, the configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
         */
        public Builder startup(String startup) {
            this.putQueryParameter("Startup", startup);
            this.startup = startup;
            return this;
        }

        /**
         * <p>The storage type of the NAS file system. Valid values:</p>
         * <ul>
         * <li><p>General-purpose NAS: \<code>Capacity\\</code> and \<code>Performance\\</code></p>
         * </li>
         * <li><p>Extreme NAS: \<code>standard\\</code> and \<code>advance\\</code></p>
         * </li>
         * </ul>
         * <p>Currently, only the \<code>Performance\\</code> type is supported.</p>
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
         * <p>The graceful stop timeout period for the application. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder terminateGracePeriod(Integer terminateGracePeriod) {
            this.putQueryParameter("TerminateGracePeriod", terminateGracePeriod);
            this.terminateGracePeriod = terminateGracePeriod;
            return this;
        }

        /**
         * <p>The traffic control policy for phased release.</p>
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
         * <li><p>Example 1: Phased release with one canary instance, followed by two batches, automatic batching, and a 1-minute interval.
         * <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Example 2: Phased release with one canary instance, followed by two batches and manual batching.
         * <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Example 3: Phased release in two batches, with automatic batching and a 0-minute interval.
         * <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
         * </li>
         * </ul>
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
         * <p>The URI encoding format. Supported formats: ISO-8859-1, GBK, GB2312, and UTF-8.</p>
         * <blockquote>
         * <p>If you do not set this parameter in the application configuration, the default Tomcat value is used.</p>
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
         * <p>Specifies whether to enable \<code>useBodyEncodingForURI\\</code>.</p>
         * <blockquote>
         * <p>If you do not set this parameter in the application configuration, the default value \<code>false\\</code> is used.</p>
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
         * <p>When using a custom JDK runtime, you must configure the base image address. This address must be publicly accessible. The EDAS server pulls this image to build the application image.</p>
         * 
         * <strong>example:</strong>
         * <p>openjdk:8u302</p>
         */
        public Builder userBaseImageUrl(String userBaseImageUrl) {
            this.putQueryParameter("UserBaseImageUrl", userBaseImageUrl);
            this.userBaseImageUrl = userBaseImageUrl;
            return this;
        }

        /**
         * <p>The data volumes.</p>
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
         * <p>The Tomcat version on which the deployment package depends. This parameter applies to Spring Cloud and Dubbo applications deployed using WAR packages. It is not supported for image-based deployments.</p>
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
         * <p>The Tomcat container configuration. Set to <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code> to delete the configuration:</p>
         * <ul>
         * <li><p>\<code>useDefaultConfig\\</code>: Specifies whether to use a custom configuration. If \<code>true\\</code>, the custom configuration is not used. If \<code>false\\</code>, the custom configuration is used. If you do not use a custom configuration, the following parameter settings do not take effect.</p>
         * </li>
         * <li><p>\<code>contextInputType\\</code>: The access path of the application.</p>
         * <ul>
         * <li><p>\<code>war\\</code>: You do not need to enter a custom path. The access path is the name of the WAR package.</p>
         * </li>
         * <li><p>\<code>root\\</code>: You do not need to enter a custom path. The access path is \<code>/\\</code>.</p>
         * </li>
         * <li><p>\<code>custom\\</code>: You need to enter a custom path in the \<code>contextPath\\</code> parameter below.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>\<code>contextPath\\</code>: The custom path. This parameter is required only when \<code>contextInputType\\</code> is set to \<code>custom\\</code>.</p>
         * </li>
         * <li><p>\<code>httpPort\\</code>: The port number. The valid range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with administrator permissions, specify a port number greater than 1024. If you do not configure this, the default port is 8080.</p>
         * </li>
         * <li><p>\<code>maxThreads\\</code>: The size of the connection pool. The default value is 400.</p>
         * <blockquote>
         * <p>This configuration greatly affects application performance. Configure it under professional guidance.</p>
         * </blockquote>
         * </li>
         * <li><p>\<code>uriEncoding\\</code>: The encoding format for Tomcat. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not set this, the default is ISO-8859-1.</p>
         * </li>
         * <li><p>\<code>useBodyEncoding\\</code>: Specifies whether to use BodyEncoding for URLs.</p>
         * </li>
         * <li><p>\<code>useAdvancedServerXml\\</code>: Specifies whether to use advanced configuration to customize the \<code>server.xml\\</code> file. If the preceding parameter types and values do not meet your needs, you can use the advanced settings to directly edit the Tomcat \<code>Server.xml\\</code> file.</p>
         * </li>
         * <li><p>\<code>serverXml\\</code>: The content of the custom \<code>server.xml\\</code> text file in the advanced configuration. This takes effect when \<code>useAdvancedServerXml\\</code> is \<code>true\\</code>.</p>
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
