// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>InsertK8sApplicationRequest</p>
 */
public class InsertK8sApplicationRequest extends Request {
    @Query
    @NameInMap("Annotations")
    private String annotations;

    @Query
    @NameInMap("AppConfig")
    private String appConfig;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AppTemplateName")
    private String appTemplateName;

    @Query
    @NameInMap("ApplicationDescription")
    private String applicationDescription;

    @Query
    @NameInMap("BuildPackId")
    private String buildPackId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("CommandArgs")
    private String commandArgs;

    @Query
    @NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @Query
    @NameInMap("ContainerRegistryId")
    private String containerRegistryId;

    @Query
    @NameInMap("CsClusterId")
    private String csClusterId;

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
    @NameInMap("EnableAsm")
    private Boolean enableAsm;

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
    @NameInMap("FeatureConfig")
    private String featureConfig;

    @Query
    @NameInMap("ImagePlatforms")
    private String imagePlatforms;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("InitContainers")
    private String initContainers;

    @Query
    @NameInMap("InternetSlbId")
    private String internetSlbId;

    @Query
    @NameInMap("InternetSlbPort")
    private Integer internetSlbPort;

    @Query
    @NameInMap("InternetSlbProtocol")
    private String internetSlbProtocol;

    @Query
    @NameInMap("InternetTargetPort")
    private Integer internetTargetPort;

    @Query
    @NameInMap("IntranetSlbId")
    private String intranetSlbId;

    @Query
    @NameInMap("IntranetSlbPort")
    private Integer intranetSlbPort;

    @Query
    @NameInMap("IntranetSlbProtocol")
    private String intranetSlbProtocol;

    @Query
    @NameInMap("IntranetTargetPort")
    private Integer intranetTargetPort;

    @Query
    @NameInMap("IsMultilingualApp")
    private Boolean isMultilingualApp;

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
    @NameInMap("LimitCpu")
    private Integer limitCpu;

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
    @NameInMap("Liveness")
    private String liveness;

    @Query
    @NameInMap("LocalVolume")
    private String localVolume;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

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
    @NameInMap("MountDescs")
    private String mountDescs;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("NasId")
    private String nasId;

    @Query
    @NameInMap("PackageType")
    private String packageType;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PackageVersion")
    private String packageVersion;

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
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("RequestsCpu")
    private Integer requestsCpu;

    @Query
    @NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @Query
    @NameInMap("RequestsMem")
    private Integer requestsMem;

    @Query
    @NameInMap("RequestsmCpu")
    private Integer requestsmCpu;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @Query
    @NameInMap("SecretName")
    private String secretName;

    @Query
    @NameInMap("ServiceConfigs")
    private String serviceConfigs;

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
    @NameInMap("Timeout")
    private Integer timeout;

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
    @NameInMap("WebContainer")
    private String webContainer;

    @Query
    @NameInMap("WebContainerConfig")
    private String webContainerConfig;

    @Query
    @NameInMap("WorkloadType")
    private String workloadType;

    private InsertK8sApplicationRequest(Builder builder) {
        super(builder);
        this.annotations = builder.annotations;
        this.appConfig = builder.appConfig;
        this.appName = builder.appName;
        this.appTemplateName = builder.appTemplateName;
        this.applicationDescription = builder.applicationDescription;
        this.buildPackId = builder.buildPackId;
        this.clusterId = builder.clusterId;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMountDescs = builder.configMountDescs;
        this.containerRegistryId = builder.containerRegistryId;
        this.csClusterId = builder.csClusterId;
        this.customAffinity = builder.customAffinity;
        this.customAgentVersion = builder.customAgentVersion;
        this.customTolerations = builder.customTolerations;
        this.deployAcrossNodes = builder.deployAcrossNodes;
        this.deployAcrossZones = builder.deployAcrossZones;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.emptyDirs = builder.emptyDirs;
        this.enableAhas = builder.enableAhas;
        this.enableAsm = builder.enableAsm;
        this.enableEmptyPushReject = builder.enableEmptyPushReject;
        this.enableLosslessRule = builder.enableLosslessRule;
        this.envFroms = builder.envFroms;
        this.envs = builder.envs;
        this.featureConfig = builder.featureConfig;
        this.imagePlatforms = builder.imagePlatforms;
        this.imageUrl = builder.imageUrl;
        this.initContainers = builder.initContainers;
        this.internetSlbId = builder.internetSlbId;
        this.internetSlbPort = builder.internetSlbPort;
        this.internetSlbProtocol = builder.internetSlbProtocol;
        this.internetTargetPort = builder.internetTargetPort;
        this.intranetSlbId = builder.intranetSlbId;
        this.intranetSlbPort = builder.intranetSlbPort;
        this.intranetSlbProtocol = builder.intranetSlbProtocol;
        this.intranetTargetPort = builder.intranetTargetPort;
        this.isMultilingualApp = builder.isMultilingualApp;
        this.JDK = builder.JDK;
        this.javaStartUpConfig = builder.javaStartUpConfig;
        this.labels = builder.labels;
        this.limitCpu = builder.limitCpu;
        this.limitEphemeralStorage = builder.limitEphemeralStorage;
        this.limitMem = builder.limitMem;
        this.limitmCpu = builder.limitmCpu;
        this.liveness = builder.liveness;
        this.localVolume = builder.localVolume;
        this.logicalRegionId = builder.logicalRegionId;
        this.losslessRuleAligned = builder.losslessRuleAligned;
        this.losslessRuleDelayTime = builder.losslessRuleDelayTime;
        this.losslessRuleFuncType = builder.losslessRuleFuncType;
        this.losslessRuleRelated = builder.losslessRuleRelated;
        this.losslessRuleWarmupTime = builder.losslessRuleWarmupTime;
        this.mountDescs = builder.mountDescs;
        this.namespace = builder.namespace;
        this.nasId = builder.nasId;
        this.packageType = builder.packageType;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.pvcMountDescs = builder.pvcMountDescs;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.repoId = builder.repoId;
        this.requestsCpu = builder.requestsCpu;
        this.requestsEphemeralStorage = builder.requestsEphemeralStorage;
        this.requestsMem = builder.requestsMem;
        this.requestsmCpu = builder.requestsmCpu;
        this.resourceGroupId = builder.resourceGroupId;
        this.runtimeClassName = builder.runtimeClassName;
        this.secretName = builder.secretName;
        this.serviceConfigs = builder.serviceConfigs;
        this.sidecars = builder.sidecars;
        this.slsConfigs = builder.slsConfigs;
        this.startup = builder.startup;
        this.storageType = builder.storageType;
        this.terminateGracePeriod = builder.terminateGracePeriod;
        this.timeout = builder.timeout;
        this.uriEncoding = builder.uriEncoding;
        this.useBodyEncoding = builder.useBodyEncoding;
        this.userBaseImageUrl = builder.userBaseImageUrl;
        this.webContainer = builder.webContainer;
        this.webContainerConfig = builder.webContainerConfig;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertK8sApplicationRequest create() {
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
     * @return appConfig
     */
    public String getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appTemplateName
     */
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    /**
     * @return applicationDescription
     */
    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * @return buildPackId
     */
    public String getBuildPackId() {
        return this.buildPackId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMountDescs
     */
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    /**
     * @return containerRegistryId
     */
    public String getContainerRegistryId() {
        return this.containerRegistryId;
    }

    /**
     * @return csClusterId
     */
    public String getCsClusterId() {
        return this.csClusterId;
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
     * @return enableAsm
     */
    public Boolean getEnableAsm() {
        return this.enableAsm;
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
     * @return featureConfig
     */
    public String getFeatureConfig() {
        return this.featureConfig;
    }

    /**
     * @return imagePlatforms
     */
    public String getImagePlatforms() {
        return this.imagePlatforms;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return initContainers
     */
    public String getInitContainers() {
        return this.initContainers;
    }

    /**
     * @return internetSlbId
     */
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    /**
     * @return internetSlbPort
     */
    public Integer getInternetSlbPort() {
        return this.internetSlbPort;
    }

    /**
     * @return internetSlbProtocol
     */
    public String getInternetSlbProtocol() {
        return this.internetSlbProtocol;
    }

    /**
     * @return internetTargetPort
     */
    public Integer getInternetTargetPort() {
        return this.internetTargetPort;
    }

    /**
     * @return intranetSlbId
     */
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

    /**
     * @return intranetSlbPort
     */
    public Integer getIntranetSlbPort() {
        return this.intranetSlbPort;
    }

    /**
     * @return intranetSlbProtocol
     */
    public String getIntranetSlbProtocol() {
        return this.intranetSlbProtocol;
    }

    /**
     * @return intranetTargetPort
     */
    public Integer getIntranetTargetPort() {
        return this.intranetTargetPort;
    }

    /**
     * @return isMultilingualApp
     */
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
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
     * @return limitCpu
     */
    public Integer getLimitCpu() {
        return this.limitCpu;
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
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
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
     * @return mountDescs
     */
    public String getMountDescs() {
        return this.mountDescs;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return requestsCpu
     */
    public Integer getRequestsCpu() {
        return this.requestsCpu;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runtimeClassName
     */
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return serviceConfigs
     */
    public String getServiceConfigs() {
        return this.serviceConfigs;
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
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

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder extends Request.Builder<InsertK8sApplicationRequest, Builder> {
        private String annotations; 
        private String appConfig; 
        private String appName; 
        private String appTemplateName; 
        private String applicationDescription; 
        private String buildPackId; 
        private String clusterId; 
        private String command; 
        private String commandArgs; 
        private String configMountDescs; 
        private String containerRegistryId; 
        private String csClusterId; 
        private String customAffinity; 
        private String customAgentVersion; 
        private String customTolerations; 
        private String deployAcrossNodes; 
        private String deployAcrossZones; 
        private String edasContainerVersion; 
        private String emptyDirs; 
        private Boolean enableAhas; 
        private Boolean enableAsm; 
        private Boolean enableEmptyPushReject; 
        private Boolean enableLosslessRule; 
        private String envFroms; 
        private String envs; 
        private String featureConfig; 
        private String imagePlatforms; 
        private String imageUrl; 
        private String initContainers; 
        private String internetSlbId; 
        private Integer internetSlbPort; 
        private String internetSlbProtocol; 
        private Integer internetTargetPort; 
        private String intranetSlbId; 
        private Integer intranetSlbPort; 
        private String intranetSlbProtocol; 
        private Integer intranetTargetPort; 
        private Boolean isMultilingualApp; 
        private String JDK; 
        private String javaStartUpConfig; 
        private String labels; 
        private Integer limitCpu; 
        private Integer limitEphemeralStorage; 
        private Integer limitMem; 
        private Integer limitmCpu; 
        private String liveness; 
        private String localVolume; 
        private String logicalRegionId; 
        private Boolean losslessRuleAligned; 
        private Integer losslessRuleDelayTime; 
        private Integer losslessRuleFuncType; 
        private Boolean losslessRuleRelated; 
        private Integer losslessRuleWarmupTime; 
        private String mountDescs; 
        private String namespace; 
        private String nasId; 
        private String packageType; 
        private String packageUrl; 
        private String packageVersion; 
        private String postStart; 
        private String preStop; 
        private String pvcMountDescs; 
        private String readiness; 
        private Integer replicas; 
        private String repoId; 
        private Integer requestsCpu; 
        private Integer requestsEphemeralStorage; 
        private Integer requestsMem; 
        private Integer requestsmCpu; 
        private String resourceGroupId; 
        private String runtimeClassName; 
        private String secretName; 
        private String serviceConfigs; 
        private String sidecars; 
        private String slsConfigs; 
        private String startup; 
        private String storageType; 
        private Integer terminateGracePeriod; 
        private Integer timeout; 
        private String uriEncoding; 
        private Boolean useBodyEncoding; 
        private String userBaseImageUrl; 
        private String webContainer; 
        private String webContainerConfig; 
        private String workloadType; 

        private Builder() {
            super();
        } 

        private Builder(InsertK8sApplicationRequest request) {
            super(request);
            this.annotations = request.annotations;
            this.appConfig = request.appConfig;
            this.appName = request.appName;
            this.appTemplateName = request.appTemplateName;
            this.applicationDescription = request.applicationDescription;
            this.buildPackId = request.buildPackId;
            this.clusterId = request.clusterId;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.configMountDescs = request.configMountDescs;
            this.containerRegistryId = request.containerRegistryId;
            this.csClusterId = request.csClusterId;
            this.customAffinity = request.customAffinity;
            this.customAgentVersion = request.customAgentVersion;
            this.customTolerations = request.customTolerations;
            this.deployAcrossNodes = request.deployAcrossNodes;
            this.deployAcrossZones = request.deployAcrossZones;
            this.edasContainerVersion = request.edasContainerVersion;
            this.emptyDirs = request.emptyDirs;
            this.enableAhas = request.enableAhas;
            this.enableAsm = request.enableAsm;
            this.enableEmptyPushReject = request.enableEmptyPushReject;
            this.enableLosslessRule = request.enableLosslessRule;
            this.envFroms = request.envFroms;
            this.envs = request.envs;
            this.featureConfig = request.featureConfig;
            this.imagePlatforms = request.imagePlatforms;
            this.imageUrl = request.imageUrl;
            this.initContainers = request.initContainers;
            this.internetSlbId = request.internetSlbId;
            this.internetSlbPort = request.internetSlbPort;
            this.internetSlbProtocol = request.internetSlbProtocol;
            this.internetTargetPort = request.internetTargetPort;
            this.intranetSlbId = request.intranetSlbId;
            this.intranetSlbPort = request.intranetSlbPort;
            this.intranetSlbProtocol = request.intranetSlbProtocol;
            this.intranetTargetPort = request.intranetTargetPort;
            this.isMultilingualApp = request.isMultilingualApp;
            this.JDK = request.JDK;
            this.javaStartUpConfig = request.javaStartUpConfig;
            this.labels = request.labels;
            this.limitCpu = request.limitCpu;
            this.limitEphemeralStorage = request.limitEphemeralStorage;
            this.limitMem = request.limitMem;
            this.limitmCpu = request.limitmCpu;
            this.liveness = request.liveness;
            this.localVolume = request.localVolume;
            this.logicalRegionId = request.logicalRegionId;
            this.losslessRuleAligned = request.losslessRuleAligned;
            this.losslessRuleDelayTime = request.losslessRuleDelayTime;
            this.losslessRuleFuncType = request.losslessRuleFuncType;
            this.losslessRuleRelated = request.losslessRuleRelated;
            this.losslessRuleWarmupTime = request.losslessRuleWarmupTime;
            this.mountDescs = request.mountDescs;
            this.namespace = request.namespace;
            this.nasId = request.nasId;
            this.packageType = request.packageType;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.pvcMountDescs = request.pvcMountDescs;
            this.readiness = request.readiness;
            this.replicas = request.replicas;
            this.repoId = request.repoId;
            this.requestsCpu = request.requestsCpu;
            this.requestsEphemeralStorage = request.requestsEphemeralStorage;
            this.requestsMem = request.requestsMem;
            this.requestsmCpu = request.requestsmCpu;
            this.resourceGroupId = request.resourceGroupId;
            this.runtimeClassName = request.runtimeClassName;
            this.secretName = request.secretName;
            this.serviceConfigs = request.serviceConfigs;
            this.sidecars = request.sidecars;
            this.slsConfigs = request.slsConfigs;
            this.startup = request.startup;
            this.storageType = request.storageType;
            this.terminateGracePeriod = request.terminateGracePeriod;
            this.timeout = request.timeout;
            this.uriEncoding = request.uriEncoding;
            this.useBodyEncoding = request.useBodyEncoding;
            this.userBaseImageUrl = request.userBaseImageUrl;
            this.webContainer = request.webContainer;
            this.webContainerConfig = request.webContainerConfig;
            this.workloadType = request.workloadType;
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
         * The application configuration when the application template is used. Set this parameter to a JSON array.
         */
        public Builder appConfig(String appConfig) {
            this.putQueryParameter("AppConfig", appConfig);
            this.appConfig = appConfig;
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
         * The name of the template used to create the application. If you specify an application template when you create an application, the application template and the AppConfig parameter are used to configure the application. Other configurations are ignored.
         */
        public Builder appTemplateName(String appTemplateName) {
            this.putQueryParameter("AppTemplateName", appTemplateName);
            this.appTemplateName = appTemplateName;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder applicationDescription(String applicationDescription) {
            this.putQueryParameter("ApplicationDescription", applicationDescription);
            this.applicationDescription = applicationDescription;
            return this;
        }

        /**
         * The version of `EDAS Container`. The value of this parameter conflicts with that of the `EdasContainerVersion` parameter. We recommend that you use the `EdasContainerVersion` parameter.
         */
        public Builder buildPackId(String buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](~~154995~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The application startup command. If you specify this parameter, the value of this parameter will replace the startup command in the image.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * The arguments in the command. The parameter value is a JSON array of strings. An example is `[{"argument":"-c"},{"argument":"test"}]`, where `-c` and `test` are two arguments that can be set.
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
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
         * The ID of the repository used to build the image repository. If this parameter is left empty, the default repository provided by EDAS is used. Only the default repository provided by EDAS is supported.
         */
        public Builder containerRegistryId(String containerRegistryId) {
            this.putQueryParameter("ContainerRegistryId", containerRegistryId);
            this.containerRegistryId = containerRegistryId;
            return this;
        }

        /**
         * The ID of the cluster. This parameter is required only when you create the application in a cluster that has not been imported.
         */
        public Builder csClusterId(String csClusterId) {
            this.putQueryParameter("CsClusterId", csClusterId);
            this.csClusterId = csClusterId;
            return this;
        }

        /**
         * The custom affinity.
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
         * The custom tolerances.
         */
        public Builder customTolerations(String customTolerations) {
            this.putQueryParameter("CustomTolerations", customTolerations);
            this.customTolerations = customTolerations;
            return this;
        }

        /**
         * Specifies whether to distribute application instances across nodes. Value `true` indicates that application instances are distributed across nodes. Other values indicate that application instances are not distributed across nodes.
         */
        public Builder deployAcrossNodes(String deployAcrossNodes) {
            this.putQueryParameter("DeployAcrossNodes", deployAcrossNodes);
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }

        /**
         * Specifies whether to distribute application instances across zones. Value `true` indicates that application instances are distributed across zones. Other values indicate that application instances are not distributed across zones.
         */
        public Builder deployAcrossZones(String deployAcrossZones) {
            this.putQueryParameter("DeployAcrossZones", deployAcrossZones);
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }

        /**
         * The version of `EDAS Container` on which the deployment package of the application depends.
         * <p>
         * 
         * > This parameter is unavailable if you deploy applications by using images.
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
         * Specifies whether to enable access to Application High Availability Service (AHAS). Valid values:
         * <p>
         * 
         * *   true: enables access to AHAS.
         * *   false: does not enable access to AHAS.
         */
        public Builder enableAhas(Boolean enableAhas) {
            this.putQueryParameter("EnableAhas", enableAhas);
            this.enableAhas = enableAhas;
            return this;
        }

        /**
         * Specifies whether to activate Alibaba Cloud Service Mesh (ASM). Set this parameter to true only when you create the application in a cluster that has not been imported and you need to use ASM.
         */
        public Builder enableAsm(Boolean enableAsm) {
            this.putQueryParameter("EnableAsm", enableAsm);
            this.enableAsm = enableAsm;
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
         * The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, or Kubernetes Secret environment variables. Specify regular environment variables in the following format:
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
         * >  If you want to cancel this configuration, set this parameter to an empty JSON array in the format of "\[]".
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * FeatureConfig.
         */
        public Builder featureConfig(String featureConfig) {
            this.putQueryParameter("FeatureConfig", featureConfig);
            this.featureConfig = featureConfig;
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
         * The URL of the image. This parameter is required if you set the `PackageType` parameter to `Image`.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
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
         * The ID of the Internet-facing SLB instance. If you do not specify this parameter, EDAS automatically purchases a new SLB instance for you.
         */
        public Builder internetSlbId(String internetSlbId) {
            this.putQueryParameter("InternetSlbId", internetSlbId);
            this.internetSlbId = internetSlbId;
            return this;
        }

        /**
         * The frontend port of the Internet-facing SLB instance. Valid values: 1 to 65535.
         */
        public Builder internetSlbPort(Integer internetSlbPort) {
            this.putQueryParameter("InternetSlbPort", internetSlbPort);
            this.internetSlbPort = internetSlbPort;
            return this;
        }

        /**
         * The protocol used by the Internet-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.
         */
        public Builder internetSlbProtocol(String internetSlbProtocol) {
            this.putQueryParameter("InternetSlbProtocol", internetSlbProtocol);
            this.internetSlbProtocol = internetSlbProtocol;
            return this;
        }

        /**
         * The backend port of the internal-facing SLB instance. This port also serves as the service port of the application. Valid values: 1 to 65535.
         */
        public Builder internetTargetPort(Integer internetTargetPort) {
            this.putQueryParameter("InternetTargetPort", internetTargetPort);
            this.internetTargetPort = internetTargetPort;
            return this;
        }

        /**
         * The ID of the internal-facing SLB instance. If you do not specify this parameter, Enterprise Distributed Application Service (EDAS) automatically purchases a new SLB instance for you.
         */
        public Builder intranetSlbId(String intranetSlbId) {
            this.putQueryParameter("IntranetSlbId", intranetSlbId);
            this.intranetSlbId = intranetSlbId;
            return this;
        }

        /**
         * The frontend port of the internal-facing SLB instance. Valid values: 1 to 65535.
         */
        public Builder intranetSlbPort(Integer intranetSlbPort) {
            this.putQueryParameter("IntranetSlbPort", intranetSlbPort);
            this.intranetSlbPort = intranetSlbPort;
            return this;
        }

        /**
         * The protocol used by the internal-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.
         */
        public Builder intranetSlbProtocol(String intranetSlbProtocol) {
            this.putQueryParameter("IntranetSlbProtocol", intranetSlbProtocol);
            this.intranetSlbProtocol = intranetSlbProtocol;
            return this;
        }

        /**
         * The backend port of the internal-facing Server Load Balancer (SLB) instance. This port also serves as the service port of the application. Valid values: 1 to 65535.
         */
        public Builder intranetTargetPort(Integer intranetTargetPort) {
            this.putQueryParameter("IntranetTargetPort", intranetTargetPort);
            this.intranetTargetPort = intranetTargetPort;
            return this;
        }

        /**
         * Specifies whether the application is a multi-language application.
         */
        public Builder isMultilingualApp(Boolean isMultilingualApp) {
            this.putQueryParameter("IsMultilingualApp", isMultilingualApp);
            this.isMultilingualApp = isMultilingualApp;
            return this;
        }

        /**
         * The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Valid values: Open JDK 7 and Open JDK 8. This parameter is unavailable if you deploy applications by using images.
         */
        public Builder JDK(String JDK) {
            this.putQueryParameter("JDK", JDK);
            this.JDK = JDK;
            return this;
        }

        /**
         * The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Appropriate parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`. The following parameters are included in the configuration:
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
         * The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. If the LimitmCpu parameter is specified, you can ignore this parameter.
         */
        public Builder limitCpu(Integer limitCpu) {
            this.putQueryParameter("LimitCpu", limitCpu);
            this.limitCpu = limitCpu;
            return this;
        }

        /**
         * The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.
         */
        public Builder limitEphemeralStorage(Integer limitEphemeralStorage) {
            this.putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage);
            this.limitEphemeralStorage = limitEphemeralStorage;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than that of RequestsMem.
         */
        public Builder limitMem(Integer limitMem) {
            this.putQueryParameter("LimitMem", limitMem);
            this.limitMem = limitMem;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. Value 0 indicates that no limit is set on CPU cores.
         */
        public Builder limitmCpu(Integer limitmCpu) {
            this.putQueryParameter("LimitmCpu", limitmCpu);
            this.limitmCpu = limitmCpu;
            return this;
        }

        /**
         * The configuration for the liveness check on the container. Example: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080}}`.
         * <p>
         * 
         * If you want to cancel this configuration, leave the parameter value empty by entering `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
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
         * The ID of the EDAS namespace. This parameter is required for a non-default namespace.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * Specifies whether to enable the graceful rolling deployment mode and ensure that the service is registered before the readiness check. Valid values:
         * <p>
         * 
         * *   true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.
         * 
         *     **
         * 
         *     **Note**If you set both the `LosslessRuleRelated` parameter and this parameter to `true`, the operation checks whether the service prefetching is complete.
         * 
         * *   false: does not check whether the service is registered.
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
         * The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic of the provider during prefetching is displayed as a quadratic curve.
         */
        public Builder losslessRuleFuncType(Integer losslessRuleFuncType) {
            this.putQueryParameter("LosslessRuleFuncType", losslessRuleFuncType);
            this.losslessRuleFuncType = losslessRuleFuncType;
            return this;
        }

        /**
         * Specifies whether to enable the graceful rolling deployment mode and ensure that the service prefetching is complete before the readiness check. Valid values:
         * <p>
         * 
         * *   true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.
         * *   false: does not check whether the service prefetching is complete.
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
         * The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: `\[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}\]`. The `nasPath` parameter specifies the file storage path, and the `mountPath` parameter specifies the path to mount the file system to the container where the application is running.
         */
        public Builder mountDescs(String mountDescs) {
            this.putQueryParameter("MountDescs", mountDescs);
            this.mountDescs = mountDescs;
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
         * The ID of the Network Attached Storage (NAS) file system that you want to mount to the application. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * The type of the deployment package. Valid values: FatJar, WAR, and Image.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
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
         * The post-start script. Example: `{"exec":{"command":\["cat","/etc/group"\]}}`.
         * <p>
         * 
         * If you want to cancel this configuration, leave this parameter empty by setting it to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * The pre-stop script. Example: `{"tcpSocket":{"host":"", "port":8080}}`.
         * <p>
         * 
         * If you want to cancel this configuration, leave this parameter empty by setting it to `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) volume to a directory in an elastic container instance. The following parameters are included in the configuration:
         * <p>
         * 
         * *   pvcName: the name of the PVC volume. Make sure that the PVC volume is an existing volume and is in the Bound state.
         * 
         * *   mountPaths: the directory to which you want to mount the PVC volume. You can configure multiple directories. You can set the following two parameters for each mount directory:
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
         * The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes Service is not transmitted to the container. Example: \`{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": \\[{"name": "test","value": "testvalue"}\\]}}\`.``
         * <p>
         * 
         * If you want to cancel this configuration, leave the parameter value empty by entering `""` or `{}`. If you do not specify this parameter, this configuration is ignored.
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
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
         * The ID of the image repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The maximum number of CPU cores allowed for each application instance when the application is created. Unit: cores. Value 0 indicates that no limit is set on CPU cores. If the RequestsmCpu parameter is specified, the value of the RequestsmCpu parameter is used. You can ignore this parameter.
         */
        public Builder requestsCpu(Integer requestsCpu) {
            this.putQueryParameter("RequestsCpu", requestsCpu);
            this.requestsCpu = requestsCpu;
            return this;
        }

        /**
         * The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.
         */
        public Builder requestsEphemeralStorage(Integer requestsEphemeralStorage) {
            this.putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage);
            this.requestsEphemeralStorage = requestsEphemeralStorage;
            return this;
        }

        /**
         * The maximum size of memory allowed for each application instance when the application is created. Unit: MB. Value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.
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

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.
         */
        public Builder runtimeClassName(String runtimeClassName) {
            this.putQueryParameter("RuntimeClassName", runtimeClassName);
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        /**
         * The name of the credential that is used to pull the images specified by the user. You must configure the Secret.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The configurations of services in a Kubernetes cluster.
         */
        public Builder serviceConfigs(String serviceConfigs) {
            this.putQueryParameter("ServiceConfigs", serviceConfigs);
            this.serviceConfigs = serviceConfigs;
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
         * The Logstore configuration. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`.
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
         *     *   LogDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.
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
         * *   Valid values for Extreme NAS file systems: Standard and Advance.
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
         * The timeout period of the change process. Valid values: 1 to 1800. Unit: seconds. If you do not specify this Unidentifiedparameter, the default value 1800 is used.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
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
         * The version of the Tomcat container on which the deployment package of the application depends. This parameter is applicable to Spring Cloud and Dubbo applications that you deploy by using WAR packages. This parameter is unavailable if you deploy applications by using images.
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        /**
         * The configuration of the Tomcat container. If you want to cancel this configuration, set this parameter to "" or "{}". The following parameters are included in the configuration:
         * <p>
         * 
         * *   useDefaultConfig: specifies whether to use the default configuration. Value true indicates that the default configuration is used. Value false indicates that the custom configuration is used. If the default configuration is used, the following parameters do not take effect:
         * 
         * *   contextInputType: the type of the access path for the application. Valid values:
         * 
         *     *   war: The access path is the name of the WAR package. You do not need to specify a custom path.
         *     *   root: The access path for the application is `/`. You do not need to specify a custom path.
         *     *   custom: If you select this option, you must specify a custom path for the contextPath parameter.
         * 
         * *   contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.
         * 
         * *   httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1024 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.
         * 
         * *   maxThreads: the maximum number of connections in the connection pool. Default value: 400.
         * 
         *     **
         * 
         *     **Note**This parameter significantly affects application performance. We recommend that you consult with technical support before you set this parameter.
         * 
         * *   uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.
         * 
         * *   useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.
         * 
         * *   useAdvancedServerXml: specifies whether to use advanced configurations to customize the server.xml file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the server.xml file of Tomcat.
         * 
         * *   serverXml: the content of the server.xml file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.
         */
        public Builder webContainerConfig(String webContainerConfig) {
            this.putQueryParameter("WebContainerConfig", webContainerConfig);
            this.webContainerConfig = webContainerConfig;
            return this;
        }

        /**
         * WorkloadType.
         */
        public Builder workloadType(String workloadType) {
            this.putQueryParameter("WorkloadType", workloadType);
            this.workloadType = workloadType;
            return this;
        }

        @Override
        public InsertK8sApplicationRequest build() {
            return new InsertK8sApplicationRequest(this);
        } 

    } 

}
