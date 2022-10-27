// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("EcsOrder")
    private EcsOrder ecsOrder;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("AdditionalVolumes")
    private java.util.List < AdditionalVolumes> additionalVolumes;

    @Query
    @NameInMap("Application")
    private java.util.List < Application> application;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClientVersion")
    private String clientVersion;

    @Query
    @NameInMap("ClusterVersion")
    private String clusterVersion;

    @Query
    @NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("DeployMode")
    private String deployMode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EcsChargeType")
    private String ecsChargeType;

    @Query
    @NameInMap("EhpcVersion")
    private String ehpcVersion;

    @Query
    @NameInMap("HaEnable")
    private Boolean haEnable;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("InputFileUrl")
    private String inputFileUrl;

    @Query
    @NameInMap("IsComputeEss")
    private Boolean isComputeEss;

    @Query
    @NameInMap("JobQueue")
    private String jobQueue;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OsTag")
    @Validation(required = true)
    private String osTag;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Plugin")
    private String plugin;

    @Query
    @NameInMap("PostInstallScript")
    private java.util.List < PostInstallScript> postInstallScript;

    @Query
    @NameInMap("RamNodeTypes")
    private java.util.List < String > ramNodeTypes;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RemoteDirectory")
    private String remoteDirectory;

    @Query
    @NameInMap("RemoteVisEnable")
    private String remoteVisEnable;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SccClusterId")
    private String sccClusterId;

    @Query
    @NameInMap("SchedulerType")
    private String schedulerType;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @Query
    @NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @Query
    @NameInMap("SystemDiskType")
    private String systemDiskType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VolumeId")
    private String volumeId;

    @Query
    @NameInMap("VolumeMountOption")
    private String volumeMountOption;

    @Query
    @NameInMap("VolumeMountpoint")
    private String volumeMountpoint;

    @Query
    @NameInMap("VolumeProtocol")
    private String volumeProtocol;

    @Query
    @NameInMap("VolumeType")
    private String volumeType;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("WithoutAgent")
    private Boolean withoutAgent;

    @Query
    @NameInMap("WithoutElasticIp")
    private Boolean withoutElasticIp;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.ecsOrder = builder.ecsOrder;
        this.accountType = builder.accountType;
        this.additionalVolumes = builder.additionalVolumes;
        this.application = builder.application;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.clientToken = builder.clientToken;
        this.clientVersion = builder.clientVersion;
        this.clusterVersion = builder.clusterVersion;
        this.computeEnableHt = builder.computeEnableHt;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.deployMode = builder.deployMode;
        this.description = builder.description;
        this.domain = builder.domain;
        this.ecsChargeType = builder.ecsChargeType;
        this.ehpcVersion = builder.ehpcVersion;
        this.haEnable = builder.haEnable;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.inputFileUrl = builder.inputFileUrl;
        this.isComputeEss = builder.isComputeEss;
        this.jobQueue = builder.jobQueue;
        this.keyPairName = builder.keyPairName;
        this.name = builder.name;
        this.osTag = builder.osTag;
        this.password = builder.password;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.plugin = builder.plugin;
        this.postInstallScript = builder.postInstallScript;
        this.ramNodeTypes = builder.ramNodeTypes;
        this.ramRoleName = builder.ramRoleName;
        this.remoteDirectory = builder.remoteDirectory;
        this.remoteVisEnable = builder.remoteVisEnable;
        this.resourceGroupId = builder.resourceGroupId;
        this.sccClusterId = builder.sccClusterId;
        this.schedulerType = builder.schedulerType;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.systemDiskLevel = builder.systemDiskLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.systemDiskType = builder.systemDiskType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.volumeId = builder.volumeId;
        this.volumeMountOption = builder.volumeMountOption;
        this.volumeMountpoint = builder.volumeMountpoint;
        this.volumeProtocol = builder.volumeProtocol;
        this.volumeType = builder.volumeType;
        this.vpcId = builder.vpcId;
        this.withoutAgent = builder.withoutAgent;
        this.withoutElasticIp = builder.withoutElasticIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsOrder
     */
    public EcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return additionalVolumes
     */
    public java.util.List < AdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    /**
     * @return application
     */
    public java.util.List < Application> getApplication() {
        return this.application;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * @return computeEnableHt
     */
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    /**
     * @return computeSpotPriceLimit
     */
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ecsChargeType
     */
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    /**
     * @return haEnable
     */
    public Boolean getHaEnable() {
        return this.haEnable;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return inputFileUrl
     */
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    /**
     * @return isComputeEss
     */
    public Boolean getIsComputeEss() {
        return this.isComputeEss;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return osTag
     */
    public String getOsTag() {
        return this.osTag;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return plugin
     */
    public String getPlugin() {
        return this.plugin;
    }

    /**
     * @return postInstallScript
     */
    public java.util.List < PostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
    }

    /**
     * @return ramNodeTypes
     */
    public java.util.List < String > getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return remoteDirectory
     */
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    /**
     * @return remoteVisEnable
     */
    public String getRemoteVisEnable() {
        return this.remoteVisEnable;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sccClusterId
     */
    public String getSccClusterId() {
        return this.sccClusterId;
    }

    /**
     * @return schedulerType
     */
    public String getSchedulerType() {
        return this.schedulerType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return systemDiskLevel
     */
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return volumeId
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * @return volumeMountOption
     */
    public String getVolumeMountOption() {
        return this.volumeMountOption;
    }

    /**
     * @return volumeMountpoint
     */
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    /**
     * @return volumeProtocol
     */
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    /**
     * @return volumeType
     */
    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return withoutAgent
     */
    public Boolean getWithoutAgent() {
        return this.withoutAgent;
    }

    /**
     * @return withoutElasticIp
     */
    public Boolean getWithoutElasticIp() {
        return this.withoutElasticIp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private EcsOrder ecsOrder; 
        private String accountType; 
        private java.util.List < AdditionalVolumes> additionalVolumes; 
        private java.util.List < Application> application; 
        private String autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clientVersion; 
        private String clusterVersion; 
        private Boolean computeEnableHt; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private String deployMode; 
        private String description; 
        private String domain; 
        private String ecsChargeType; 
        private String ehpcVersion; 
        private Boolean haEnable; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String inputFileUrl; 
        private Boolean isComputeEss; 
        private String jobQueue; 
        private String keyPairName; 
        private String name; 
        private String osTag; 
        private String password; 
        private Integer period; 
        private String periodUnit; 
        private String plugin; 
        private java.util.List < PostInstallScript> postInstallScript; 
        private java.util.List < String > ramNodeTypes; 
        private String ramRoleName; 
        private String remoteDirectory; 
        private String remoteVisEnable; 
        private String resourceGroupId; 
        private String sccClusterId; 
        private String schedulerType; 
        private String securityGroupId; 
        private String securityGroupName; 
        private String systemDiskLevel; 
        private Integer systemDiskSize; 
        private String systemDiskType; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String volumeId; 
        private String volumeMountOption; 
        private String volumeMountpoint; 
        private String volumeProtocol; 
        private String volumeType; 
        private String vpcId; 
        private Boolean withoutAgent; 
        private Boolean withoutElasticIp; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.ecsOrder = request.ecsOrder;
            this.accountType = request.accountType;
            this.additionalVolumes = request.additionalVolumes;
            this.application = request.application;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.clientToken = request.clientToken;
            this.clientVersion = request.clientVersion;
            this.clusterVersion = request.clusterVersion;
            this.computeEnableHt = request.computeEnableHt;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.deployMode = request.deployMode;
            this.description = request.description;
            this.domain = request.domain;
            this.ecsChargeType = request.ecsChargeType;
            this.ehpcVersion = request.ehpcVersion;
            this.haEnable = request.haEnable;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.inputFileUrl = request.inputFileUrl;
            this.isComputeEss = request.isComputeEss;
            this.jobQueue = request.jobQueue;
            this.keyPairName = request.keyPairName;
            this.name = request.name;
            this.osTag = request.osTag;
            this.password = request.password;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.plugin = request.plugin;
            this.postInstallScript = request.postInstallScript;
            this.ramNodeTypes = request.ramNodeTypes;
            this.ramRoleName = request.ramRoleName;
            this.remoteDirectory = request.remoteDirectory;
            this.remoteVisEnable = request.remoteVisEnable;
            this.resourceGroupId = request.resourceGroupId;
            this.sccClusterId = request.sccClusterId;
            this.schedulerType = request.schedulerType;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupName = request.securityGroupName;
            this.systemDiskLevel = request.systemDiskLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.systemDiskType = request.systemDiskType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.volumeId = request.volumeId;
            this.volumeMountOption = request.volumeMountOption;
            this.volumeMountpoint = request.volumeMountpoint;
            this.volumeProtocol = request.volumeProtocol;
            this.volumeType = request.volumeType;
            this.vpcId = request.vpcId;
            this.withoutAgent = request.withoutAgent;
            this.withoutElasticIp = request.withoutElasticIp;
            this.zoneId = request.zoneId;
        } 

        /**
         * EcsOrder.
         */
        public Builder ecsOrder(EcsOrder ecsOrder) {
            this.putQueryParameter("EcsOrder", ecsOrder);
            this.ecsOrder = ecsOrder;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * AdditionalVolumes.
         */
        public Builder additionalVolumes(java.util.List < AdditionalVolumes> additionalVolumes) {
            this.putQueryParameter("AdditionalVolumes", additionalVolumes);
            this.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(java.util.List < Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewPeriod.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ClusterVersion.
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * ComputeEnableHt.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * DeployMode.
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EcsChargeType.
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * EhpcVersion.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * HaEnable.
         */
        public Builder haEnable(Boolean haEnable) {
            this.putQueryParameter("HaEnable", haEnable);
            this.haEnable = haEnable;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * InputFileUrl.
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * IsComputeEss.
         */
        public Builder isComputeEss(Boolean isComputeEss) {
            this.putQueryParameter("IsComputeEss", isComputeEss);
            this.isComputeEss = isComputeEss;
            return this;
        }

        /**
         * JobQueue.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OsTag.
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Plugin.
         */
        public Builder plugin(String plugin) {
            this.putQueryParameter("Plugin", plugin);
            this.plugin = plugin;
            return this;
        }

        /**
         * PostInstallScript.
         */
        public Builder postInstallScript(java.util.List < PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * RamNodeTypes.
         */
        public Builder ramNodeTypes(java.util.List < String > ramNodeTypes) {
            this.putQueryParameter("RamNodeTypes", ramNodeTypes);
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }

        /**
         * RamRoleName.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * RemoteDirectory.
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * RemoteVisEnable.
         */
        public Builder remoteVisEnable(String remoteVisEnable) {
            this.putQueryParameter("RemoteVisEnable", remoteVisEnable);
            this.remoteVisEnable = remoteVisEnable;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SccClusterId.
         */
        public Builder sccClusterId(String sccClusterId) {
            this.putQueryParameter("SccClusterId", sccClusterId);
            this.sccClusterId = sccClusterId;
            return this;
        }

        /**
         * SchedulerType.
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * SystemDiskLevel.
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * SystemDiskType.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * 标签列表，最多包含20个子项
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VolumeId.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * VolumeMountOption.
         */
        public Builder volumeMountOption(String volumeMountOption) {
            this.putQueryParameter("VolumeMountOption", volumeMountOption);
            this.volumeMountOption = volumeMountOption;
            return this;
        }

        /**
         * VolumeMountpoint.
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * VolumeProtocol.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * VolumeType.
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WithoutAgent.
         */
        public Builder withoutAgent(Boolean withoutAgent) {
            this.putQueryParameter("WithoutAgent", withoutAgent);
            this.withoutAgent = withoutAgent;
            return this;
        }

        /**
         * WithoutElasticIp.
         */
        public Builder withoutElasticIp(Boolean withoutElasticIp) {
            this.putQueryParameter("WithoutElasticIp", withoutElasticIp);
            this.withoutElasticIp = withoutElasticIp;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class Compute extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Compute(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    public static class Login extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Login(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Login create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Login build() {
                return new Login(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private Manager(Builder builder) {
            this.count = builder.count;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    public static class EcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        private Compute compute;

        @NameInMap("Login")
        @Validation(required = true)
        private Login login;

        @NameInMap("Manager")
        @Validation(required = true)
        private Manager manager;

        private EcsOrder(Builder builder) {
            this.compute = builder.compute;
            this.login = builder.login;
            this.manager = builder.manager;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsOrder create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return login
         */
        public Login getLogin() {
            return this.login;
        }

        /**
         * @return manager
         */
        public Manager getManager() {
            return this.manager;
        }

        public static final class Builder {
            private Compute compute; 
            private Login login; 
            private Manager manager; 

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Login.
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * Manager.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            public EcsOrder build() {
                return new EcsOrder(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @NameInMap("Name")
        private String name;

        private Roles(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class AdditionalVolumes extends TeaModel {
        @NameInMap("JobQueue")
        private String jobQueue;

        @NameInMap("LocalDirectory")
        private String localDirectory;

        @NameInMap("Location")
        private String location;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("Roles")
        private java.util.List < Roles> roles;

        @NameInMap("VolumeId")
        private String volumeId;

        @NameInMap("VolumeMountOption")
        private String volumeMountOption;

        @NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @NameInMap("VolumeType")
        private String volumeType;

        private AdditionalVolumes(Builder builder) {
            this.jobQueue = builder.jobQueue;
            this.localDirectory = builder.localDirectory;
            this.location = builder.location;
            this.remoteDirectory = builder.remoteDirectory;
            this.roles = builder.roles;
            this.volumeId = builder.volumeId;
            this.volumeMountOption = builder.volumeMountOption;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalVolumes create() {
            return builder().build();
        }

        /**
         * @return jobQueue
         */
        public String getJobQueue() {
            return this.jobQueue;
        }

        /**
         * @return localDirectory
         */
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return remoteDirectory
         */
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        /**
         * @return roles
         */
        public java.util.List < Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return volumeId
         */
        public String getVolumeId() {
            return this.volumeId;
        }

        /**
         * @return volumeMountOption
         */
        public String getVolumeMountOption() {
            return this.volumeMountOption;
        }

        /**
         * @return volumeMountpoint
         */
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        /**
         * @return volumeProtocol
         */
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        /**
         * @return volumeType
         */
        public String getVolumeType() {
            return this.volumeType;
        }

        public static final class Builder {
            private String jobQueue; 
            private String localDirectory; 
            private String location; 
            private String remoteDirectory; 
            private java.util.List < Roles> roles; 
            private String volumeId; 
            private String volumeMountOption; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            /**
             * JobQueue.
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * LocalDirectory.
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * RemoteDirectory.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * VolumeId.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * VolumeMountOption.
             */
            public Builder volumeMountOption(String volumeMountOption) {
                this.volumeMountOption = volumeMountOption;
                return this;
            }

            /**
             * VolumeMountpoint.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * VolumeProtocol.
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * VolumeType.
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            public AdditionalVolumes build() {
                return new AdditionalVolumes(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        private Application(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String tag; 

            /**
             * 标签列表，最多包含20个子项
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class PostInstallScript extends TeaModel {
        @NameInMap("Args")
        private String args;

        @NameInMap("Url")
        private String url;

        private PostInstallScript(Builder builder) {
            this.args = builder.args;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScript create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String args; 
            private String url; 

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PostInstallScript build() {
                return new PostInstallScript(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
