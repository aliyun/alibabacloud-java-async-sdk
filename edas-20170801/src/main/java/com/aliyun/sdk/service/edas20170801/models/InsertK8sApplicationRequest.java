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
 * {@link InsertK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>InsertK8sApplicationRequest</p>
 */
public class InsertK8sApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private String annotations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private String appConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppTemplateName")
    private String appTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationDescription")
    private String applicationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildPackId")
    private String buildPackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigMountDescs")
    private String configMountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerRegistryId")
    private String containerRegistryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CsClusterId")
    private String csClusterId;

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
    @com.aliyun.core.annotation.NameInMap("EnableAsm")
    private Boolean enableAsm;

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
    @com.aliyun.core.annotation.NameInMap("FeatureConfig")
    private String featureConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImagePlatforms")
    private String imagePlatforms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitContainers")
    private String initContainers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetSlbId")
    private String internetSlbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetSlbPort")
    private Integer internetSlbPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetSlbProtocol")
    private String internetSlbProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetTargetPort")
    private Integer internetTargetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetSlbId")
    private String intranetSlbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetSlbPort")
    private Integer intranetSlbPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetSlbProtocol")
    private String intranetSlbProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetTargetPort")
    private Integer intranetTargetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMultilingualApp")
    private Boolean isMultilingualApp;

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
    @com.aliyun.core.annotation.NameInMap("LimitCpu")
    private Integer limitCpu;

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
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVolume")
    private String localVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

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
    @com.aliyun.core.annotation.NameInMap("MountDescs")
    private String mountDescs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NasId")
    private String nasId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageUrl")
    private String packageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersion")
    private String packageVersion;

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
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsCpu")
    private Integer requestsCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsEphemeralStorage")
    private Integer requestsEphemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsMem")
    private Integer requestsMem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestsmCpu")
    private Integer requestsmCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceConfigs")
    private String serviceConfigs;

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
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

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
    @com.aliyun.core.annotation.NameInMap("WebContainer")
    private String webContainer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebContainerConfig")
    private String webContainerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadType")
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
         * <p>The application configuration when the application template is used. Set this parameter to a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder appConfig(String appConfig) {
            this.putQueryParameter("AppConfig", appConfig);
            this.appConfig = appConfig;
            return this;
        }

        /**
         * <p>The name of the application. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 36 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-test</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The name of the template used to create the application. If you specify an application template when you create an application, the application template and the AppConfig parameter are used to configure the application. Other configurations are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>app-template001</p>
         */
        public Builder appTemplateName(String appTemplateName) {
            this.putQueryParameter("AppTemplateName", appTemplateName);
            this.appTemplateName = appTemplateName;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Application in the production environment</p>
         */
        public Builder applicationDescription(String applicationDescription) {
            this.putQueryParameter("ApplicationDescription", applicationDescription);
            this.applicationDescription = applicationDescription;
            return this;
        }

        /**
         * <p>The version of <code>EDAS Container</code>. The value of this parameter conflicts with that of the <code>EdasContainerVersion</code> parameter. We recommend that you use the <code>EdasContainerVersion</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder buildPackId(String buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * <p>The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/154995.html">ListCluster</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c9cd****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The application startup command. If you specify this parameter, the value of this parameter will replace the startup command in the image.</p>
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
         * <p>The arguments in the command. The parameter value is a JSON array of strings. An example is <code>[{&quot;argument&quot;:&quot;-c&quot;},{&quot;argument&quot;:&quot;test&quot;}]</code>, where <code>-c</code> and <code>test</code> are two arguments that can be set.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;argument&quot;:&quot;-lh&quot;}]</p>
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
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
         * <p>The ID of the repository used to build the image repository. If this parameter is left empty, the default repository provided by EDAS is used. Only the default repository provided by EDAS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Leave empty</p>
         */
        public Builder containerRegistryId(String containerRegistryId) {
            this.putQueryParameter("ContainerRegistryId", containerRegistryId);
            this.containerRegistryId = containerRegistryId;
            return this;
        }

        /**
         * <p>The ID of the cluster. This parameter is required only when you create the application in a cluster that has not been imported.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdefg</p>
         */
        public Builder csClusterId(String csClusterId) {
            this.putQueryParameter("CsClusterId", csClusterId);
            this.csClusterId = csClusterId;
            return this;
        }

        /**
         * <p>The custom affinity.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
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
         * <p>The custom tolerances.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder customTolerations(String customTolerations) {
            this.putQueryParameter("CustomTolerations", customTolerations);
            this.customTolerations = customTolerations;
            return this;
        }

        /**
         * <p>Specifies whether to distribute application instances across nodes. Value <code>true</code> indicates that application instances are distributed across nodes. Other values indicate that application instances are not distributed across nodes.</p>
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
         * <p>Specifies whether to distribute application instances across zones. Value <code>true</code> indicates that application instances are distributed across zones. Other values indicate that application instances are not distributed across zones.</p>
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
         * <p>The version of <code>EDAS Container</code> on which the deployment package of the application depends.</p>
         * <blockquote>
         * <p>This parameter is unavailable if you deploy applications by using images.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable access to Application High Availability Service (AHAS). Valid values:</p>
         * <ul>
         * <li>true: enables access to AHAS.</li>
         * <li>false: does not enable access to AHAS.</li>
         * </ul>
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
         * <p>Specifies whether to activate Alibaba Cloud Service Mesh (ASM). Set this parameter to true only when you create the application in a cluster that has not been imported and you need to use ASM.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAsm(Boolean enableAsm) {
            this.putQueryParameter("EnableAsm", enableAsm);
            this.enableAsm = enableAsm;
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
         * <p>The following parameters are included in the configuration:</p>
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
         * <p>The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, or Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
         * <p><code>{&quot;name&quot;:&quot;x&quot;, &quot;value&quot;: &quot;y&quot;}</code></p>
         * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
         * <p><code>{ &quot;name&quot;: &quot;x2&quot;, &quot;valueFrom&quot;: { &quot;configMapKeyRef&quot;: { &quot;name&quot;: &quot;my-config&quot;, &quot;key&quot;: &quot;y2&quot; } } }</code></p>
         * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
         * <p><code>{ &quot;name&quot;: &quot;x3&quot;, &quot;valueFrom&quot;: { &quot;secretKeyRef&quot;: { &quot;name&quot;: &quot;my-secret&quot;, &quot;key&quot;: &quot;y3&quot; } } }</code></p>
         * <blockquote>
         * <p> If you want to cancel this configuration, set this parameter to an empty JSON array in the format of &quot;[]&quot;.</p>
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
         * FeatureConfig.
         */
        public Builder featureConfig(String featureConfig) {
            this.putQueryParameter("FeatureConfig", featureConfig);
            this.featureConfig = featureConfig;
            return this;
        }

        /**
         * <p>Mirror the target platform architecture, which is effective when deployed using war or jar. Enter an example:</p>
         * <ul>
         * <li>Specify x86 64 architecture: Linux/amd64</li>
         * <li>Specify ARM 64 architecture: Linux/arm64</li>
         * <li>Specify the construction of dual architecture images: Linux/amd64, Linux/arm64</li>
         * <li>Do not input: default schema</li>
         * </ul>
         */
        public Builder imagePlatforms(String imagePlatforms) {
            this.putQueryParameter("ImagePlatforms", imagePlatforms);
            this.imagePlatforms = imagePlatforms;
            return this;
        }

        /**
         * <p>The URL of the image. This parameter is required if you set the <code>PackageType</code> parameter to <code>Image</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-beijing.aliyuncs.com/<strong><strong>_test/</strong></strong>-cons****:1.0</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Set the initialization container for the application Pod. Support setting the format YAML for container configuration, which is the value of Init container YAML configured with base64 encoding.</p>
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
         * <p>The ID of the Internet-facing SLB instance. If you do not specify this parameter, EDAS automatically purchases a new SLB instance for you.</p>
         * 
         * <strong>example:</strong>
         * <p>a3d4********</p>
         */
        public Builder internetSlbId(String internetSlbId) {
            this.putQueryParameter("InternetSlbId", internetSlbId);
            this.internetSlbId = internetSlbId;
            return this;
        }

        /**
         * <p>The frontend port of the Internet-facing SLB instance. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder internetSlbPort(Integer internetSlbPort) {
            this.putQueryParameter("InternetSlbPort", internetSlbPort);
            this.internetSlbPort = internetSlbPort;
            return this;
        }

        /**
         * <p>The protocol used by the Internet-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder internetSlbProtocol(String internetSlbProtocol) {
            this.putQueryParameter("InternetSlbProtocol", internetSlbProtocol);
            this.internetSlbProtocol = internetSlbProtocol;
            return this;
        }

        /**
         * <p>The backend port of the internal-facing SLB instance. This port also serves as the service port of the application. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder internetTargetPort(Integer internetTargetPort) {
            this.putQueryParameter("InternetTargetPort", internetTargetPort);
            this.internetTargetPort = internetTargetPort;
            return this;
        }

        /**
         * <p>The ID of the internal-facing SLB instance. If you do not specify this parameter, Enterprise Distributed Application Service (EDAS) automatically purchases a new SLB instance for you.</p>
         * 
         * <strong>example:</strong>
         * <p>ae93********</p>
         */
        public Builder intranetSlbId(String intranetSlbId) {
            this.putQueryParameter("IntranetSlbId", intranetSlbId);
            this.intranetSlbId = intranetSlbId;
            return this;
        }

        /**
         * <p>The frontend port of the internal-facing SLB instance. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder intranetSlbPort(Integer intranetSlbPort) {
            this.putQueryParameter("IntranetSlbPort", intranetSlbPort);
            this.intranetSlbPort = intranetSlbPort;
            return this;
        }

        /**
         * <p>The protocol used by the internal-facing SLB instance. Valid values: TCP, HTTP, and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder intranetSlbProtocol(String intranetSlbProtocol) {
            this.putQueryParameter("IntranetSlbProtocol", intranetSlbProtocol);
            this.intranetSlbProtocol = intranetSlbProtocol;
            return this;
        }

        /**
         * <p>The backend port of the internal-facing Server Load Balancer (SLB) instance. This port also serves as the service port of the application. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder intranetTargetPort(Integer intranetTargetPort) {
            this.putQueryParameter("IntranetTargetPort", intranetTargetPort);
            this.intranetTargetPort = intranetTargetPort;
            return this;
        }

        /**
         * <p>Specifies whether the application is a multi-language application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isMultilingualApp(Boolean isMultilingualApp) {
            this.putQueryParameter("IsMultilingualApp", isMultilingualApp);
            this.isMultilingualApp = isMultilingualApp;
            return this;
        }

        /**
         * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. Valid values: Open JDK 7 and Open JDK 8. This parameter is unavailable if you deploy applications by using images.</p>
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
         * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Appropriate parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>. The following parameters are included in the configuration:</p>
         * <ul>
         * <li>InitialHeapSize: the initial size of the heap memory.</li>
         * <li>MaxHeapSize: the maximum size of the heap memory.</li>
         * <li>CustomParams: the custom parameters, such as JVM -D parameters.</li>
         * <li>Other parameters: You can view the JSON structure submitted by the frontend.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InitialHeapSize&quot;:{&quot;original&quot;:512,&quot;startup&quot;:&quot;-Xms512m&quot;},&quot;MaxHeapSize&quot;:{&quot;original&quot;:1024,&quot;startup&quot;:&quot;-Xmx1024m&quot;},&quot;CustomParams&quot;:{&quot;original&quot;:&quot;-Dcustom.property.sample=false&quot;,&quot;startup&quot;:&quot;-Dcustom.property.sample=false&quot;}}</p>
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
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: cores. If the LimitmCpu parameter is specified, you can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder limitCpu(Integer limitCpu) {
            this.putQueryParameter("LimitCpu", limitCpu);
            this.limitCpu = limitCpu;
            return this;
        }

        /**
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
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
         * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than that of RequestsMem.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder limitMem(Integer limitMem) {
            this.putQueryParameter("LimitMem", limitMem);
            this.limitMem = limitMem;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. Value 0 indicates that no limit is set on CPU cores.</p>
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
         * <p>The configuration for the liveness check on the container. Example: <code>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.</p>
         * <p>If you want to cancel this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
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
         * <p>The ID of the EDAS namespace. This parameter is required for a non-default namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen:beta****</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the graceful rolling deployment mode and ensure that the service is registered before the readiness check. Valid values:</p>
         * <ul>
         * <li><p>true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service is registered, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</p>
         * <p>**</p>
         * <p><strong>Note</strong>If you set both the <code>LosslessRuleRelated</code> parameter and this parameter to <code>true</code>, the operation checks whether the service prefetching is complete.</p>
         * </li>
         * <li><p>false: does not check whether the service is registered.</p>
         * </li>
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
         * <p>The number of prefetching curves. Valid values: 0 to 20. The default value is 2, which is suitable for common prefetching scenarios. This value indicates that the received traffic of the provider during prefetching is displayed as a quadratic curve.</p>
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
         * <p>Specifies whether to enable the graceful rolling deployment mode and ensure that the service prefetching is complete before the readiness check. Valid values:</p>
         * <ul>
         * <li>true: provides port 55199 and the /health path for the health check in a non-intrusive manner. When the service prefetching is complete, the system returns HTTP 200 status code. Otherwise, the system returns HTTP 500 status code.</li>
         * <li>false: does not check whether the service prefetching is complete.</li>
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
         * <p>The description of the NAS mounting configuration. Set this parameter to a serialized JSON string. Example: <code>[{&quot;nasPath&quot;: &quot;/k8s&quot;,&quot;mountPath&quot;: &quot;/mnt&quot;},{&quot;nasPath&quot;: &quot;/files&quot;,&quot;mountPath&quot;: &quot;/app/files&quot;}\]</code>. The <code>nasPath</code> parameter specifies the file storage path, and the <code>mountPath</code> parameter specifies the path to mount the file system to the container where the application is running.</p>
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
         * <p>The namespace of the Kubernetes cluster. This parameter specifies the Kubernetes namespace in which your application is deployed. By default, the default namespace is used.</p>
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
         * <p>The ID of the Network Attached Storage (NAS) file system that you want to mount to the application. If you do not specify this parameter but specify the MountDescs parameter, a NAS file system is automatically purchased and mounted to the vSwitch in the VPC.</p>
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
         * <p>The type of the deployment package. Valid values: FatJar, WAR, and Image.</p>
         * 
         * <strong>example:</strong>
         * <p>WAR</p>
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
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
         * <p>The post-start script. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\]}}</code>.</p>
         * <p>If you want to cancel this configuration, leave this parameter empty by setting it to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
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
         * <p>The pre-stop script. Example: <code>{&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</code>.</p>
         * <p>If you want to cancel this configuration, leave this parameter empty by setting it to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
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
         * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
         * <ul>
         * <li><p>pvcName: the name of the PVC volume. Make sure that the PVC volume is an existing volume and is in the Bound state.</p>
         * </li>
         * <li><p>mountPaths: the directory to which you want to mount the PVC volume. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
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
         * <p>The configuration for the readiness check on the container. If the check fails, the traffic that passes through the Kubernetes Service is not transmitted to the container. Example: `{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}\]}}`.``</p>
         * <p>If you want to cancel this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
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
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>ced********</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is created. Unit: cores. Value 0 indicates that no limit is set on CPU cores. If the RequestsmCpu parameter is specified, the value of the RequestsmCpu parameter is used. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder requestsCpu(Integer requestsCpu) {
            this.putQueryParameter("RequestsCpu", requestsCpu);
            this.requestsCpu = requestsCpu;
            return this;
        }

        /**
         * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
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
         * <p>The maximum size of memory allowed for each application instance when the application is created. Unit: MB. Value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>461</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.</p>
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
         * <p>The name of the credential that is used to pull the images specified by the user. You must configure the Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>edas-app-01-image-secret</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The configurations of services in a Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;: &quot;test-svc-create&quot;,&quot;serviceType&quot;:&quot;ClusterIP&quot;,&quot;portMappings&quot;:[{&quot;servicePort&quot;: {&quot;targetPort&quot;:8080,&quot;port&quot;:80,&quot;protocol&quot;:&quot;TCP&quot;}}]}]</p>
         */
        public Builder serviceConfigs(String serviceConfigs) {
            this.putQueryParameter("ServiceConfigs", serviceConfigs);
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        /**
         * <p>Set up a Sidecar container for the application Pod. Support setting the format YAML for container configuration, which is the value of Sidecar container YAML configured with base64 encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;yamlEncoded&quot;:&quot;Y29tbWFuZDoKICAtIHRhaWwKICAtICctZicKICAtIC9kZXYvbnVsbAppbWFnZTogJ2J1c3lib3g6bGF0ZXN0JwpuYW1lOiBidXN5Ym94Cg==&quot;}]</p>
         */
        public Builder sidecars(String sidecars) {
            this.putQueryParameter("Sidecars", sidecars);
            this.sidecars = sidecars;
            return this;
        }

        /**
         * <p>The Logstore configuration. To delete this configuration, leave the parameter value empty by entering <code>&quot;&quot;</code> or <code>&quot;{}&quot;</code>.</p>
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
         * <li><p>LogDir: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (*) are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
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
         * <p>The startup probe can be used to detect the viability of slow start containers, avoiding them from being killed before startup. The format is as follows: {&quot;FailureThreshold&quot;: 3, &quot;initialDelaySeconds&quot;: 5, &quot;SuccessThreshold&quot;: 1, &quot;timeoutSeconds&quot;: 1, &quot;https Get&quot;: {&quot;path&quot;: &quot;/consumer&quot;, &quot;port&quot;: 8080, &quot;scheme&quot;: &quot;HTTP&quot;, &quot;https Headers&quot;: [{&quot;name&quot;: &quot;test&quot;, &quot;value&quot;: &quot;testvalue&quot;}]}.</p>
         * <p>If set to &quot;&quot; or {}, it means delete, and if not set, it means ignore.</p>
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
         * <p>The storage type of the NAS file system.</p>
         * <ul>
         * <li>Valid values for General-purpose NAS file systems: Capacity and Performance.</li>
         * <li>Valid values for Extreme NAS file systems: Standard and Advance.</li>
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
         * <p>Set the grace stop timeout for the application. Unit: seconds.</p>
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
         * <p>The timeout period of the change process. Valid values: 1 to 1800. Unit: seconds. If you do not specify this Unidentifiedparameter, the default value 1800 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
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
         * <p>When using custom JDK runtime, it is necessary to configure the basic image address. The address needs to be publicly accessible, and the EDAS server will pull the image to build the application image.</p>
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
         * <p>The configuration of the Tomcat container. If you want to cancel this configuration, set this parameter to &quot;&quot; or &quot;{}&quot;. The following parameters are included in the configuration:</p>
         * <ul>
         * <li><p>useDefaultConfig: specifies whether to use the default configuration. Value true indicates that the default configuration is used. Value false indicates that the custom configuration is used. If the default configuration is used, the following parameters do not take effect:</p>
         * </li>
         * <li><p>contextInputType: the type of the access path for the application. Valid values:</p>
         * <ul>
         * <li>war: The access path is the name of the WAR package. You do not need to specify a custom path.</li>
         * <li>root: The access path for the application is <code>/</code>. You do not need to specify a custom path.</li>
         * <li>custom: If you select this option, you must specify a custom path for the contextPath parameter.</li>
         * </ul>
         * </li>
         * <li><p>contextPath: the custom access path for the application. This parameter is required only when you set the contextInputType parameter to custom.</p>
         * </li>
         * <li><p>httpPort: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is less than 1024. Enter a value that ranges from 1024 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
         * </li>
         * <li><p>maxThreads: the maximum number of connections in the connection pool. Default value: 400.</p>
         * <p>**</p>
         * <p><strong>Note</strong>This parameter significantly affects application performance. We recommend that you consult with technical support before you set this parameter.</p>
         * </li>
         * <li><p>uriEncoding: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312. If you do not specify this parameter, the default value ISO-8859-1 is used.</p>
         * </li>
         * <li><p>useBodyEncoding: specifies whether to use the encoding scheme specified in the request body for URI query parameters.</p>
         * </li>
         * <li><p>useAdvancedServerXml: specifies whether to use advanced configurations to customize the server.xml file. If the preceding parameter types and specific parameters cannot meet your requirements, you can use advanced configurations to customize the server.xml file of Tomcat.</p>
         * </li>
         * <li><p>serverXml: the content of the server.xml file customized by using advanced configurations. This parameter takes effect only when you set the useAdvancedServerXml parameter to true.</p>
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

        /**
         * <p>The type of Workload when creating an application is currently only supported for the Deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
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
