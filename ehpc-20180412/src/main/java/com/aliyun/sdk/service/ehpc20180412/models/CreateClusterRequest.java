// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsOrder")
    private EcsOrder ecsOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddOns")
    private java.util.List<AddOns> addOns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalVolumes")
    private java.util.List<AdditionalVolumes> additionalVolumes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Application")
    private java.util.List<Application> application;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterVersion")
    private String clusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeEnableHt")
    private Boolean computeEnableHt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsChargeType")
    private String ecsChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EhpcVersion")
    private String ehpcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaEnable")
    private Boolean haEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFileUrl")
    private String inputFileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsComputeEss")
    private Boolean isComputeEss;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobQueue")
    private String jobQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsTag")
    private String osTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plugin")
    private String plugin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostInstallScript")
    private java.util.List<PostInstallScript> postInstallScript;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamNodeTypes")
    private java.util.List<String> ramNodeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
    private String remoteDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteVisEnable")
    private String remoteVisEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SccClusterId")
    private String sccClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerType")
    private String schedulerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskLevel")
    private String systemDiskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskType")
    private String systemDiskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
    private String volumeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeMountOption")
    private String volumeMountOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
    private String volumeMountpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
    private String volumeProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeType")
    private String volumeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutAgent")
    private Boolean withoutAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutElasticIp")
    private Boolean withoutElasticIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutNas")
    private Boolean withoutNas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.ecsOrder = builder.ecsOrder;
        this.accountType = builder.accountType;
        this.addOns = builder.addOns;
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
        this.deploymentSetId = builder.deploymentSetId;
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
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
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
        this.withoutNas = builder.withoutNas;
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
     * @return addOns
     */
    public java.util.List<AddOns> getAddOns() {
        return this.addOns;
    }

    /**
     * @return additionalVolumes
     */
    public java.util.List<AdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    /**
     * @return application
     */
    public java.util.List<Application> getApplication() {
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
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
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
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
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
    public java.util.List<PostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
    }

    /**
     * @return ramNodeTypes
     */
    public java.util.List<String> getRamNodeTypes() {
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
    public java.util.List<Tag> getTag() {
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
     * @return withoutNas
     */
    public Boolean getWithoutNas() {
        return this.withoutNas;
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
        private java.util.List<AddOns> addOns; 
        private java.util.List<AdditionalVolumes> additionalVolumes; 
        private java.util.List<Application> application; 
        private String autoRenew; 
        private Integer autoRenewPeriod; 
        private String clientToken; 
        private String clientVersion; 
        private String clusterVersion; 
        private Boolean computeEnableHt; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private String deployMode; 
        private String deploymentSetId; 
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
        private String networkInterfaceTrafficMode; 
        private String osTag; 
        private String password; 
        private Integer period; 
        private String periodUnit; 
        private String plugin; 
        private java.util.List<PostInstallScript> postInstallScript; 
        private java.util.List<String> ramNodeTypes; 
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
        private java.util.List<Tag> tag; 
        private String vSwitchId; 
        private String volumeId; 
        private String volumeMountOption; 
        private String volumeMountpoint; 
        private String volumeProtocol; 
        private String volumeType; 
        private String vpcId; 
        private Boolean withoutAgent; 
        private Boolean withoutElasticIp; 
        private Boolean withoutNas; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.ecsOrder = request.ecsOrder;
            this.accountType = request.accountType;
            this.addOns = request.addOns;
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
            this.deploymentSetId = request.deploymentSetId;
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
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
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
            this.withoutNas = request.withoutNas;
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
         * <p>The type of the domain account service. Valid values:</p>
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * <p>Default value: nis.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The custom component service.</p>
         */
        public Builder addOns(java.util.List<AddOns> addOns) {
            this.putQueryParameter("AddOns", addOns);
            this.addOns = addOns;
            return this;
        }

        /**
         * <p>The information of the NAS file system.</p>
         */
        public Builder additionalVolumes(java.util.List<AdditionalVolumes> additionalVolumes) {
            this.putQueryParameter("AdditionalVolumes", additionalVolumes);
            this.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * <p>The application information.</p>
         */
        public Builder application(java.util.List<Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The version of the E-HPC client. By default, the parameter is set to the latest version number.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> operation to query the latest version of the E-HPC client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.64</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The version of the E-HPC cluster.</p>
         * <p>Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable hyper-threading for the compute node. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * <p>The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.034</p>
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * <p>The bidding method of the compute nodes. Valid values:</p>
         * <ul>
         * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
         * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * <p>The mode in which the E-HPC cluster is deployed. Valid values:</p>
         * <ul>
         * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Simple: A management node, which consists of an account node and a scheduling node, is deployed, while a logon node and multiple compute nodes are separately deployed.</li>
         * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * <p>The ID of the deployment set in which to deploy the instance. You can obtain the deployment set ID by calling the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation. Only the deployment sets that use low latency policy are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4pzq****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The domain name of the on-premises E-HPC cluster.</p>
         * <p>This parameter takes effect only when the AccountType parameter is set to Idap.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The billing method of the nodes. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * <p>If you set the parameter to PrePaid, auto-renewal is enabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * <p>The version of E-HPC. By default, the parameter is set to the latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable the high availability feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>If high availability is enabled, a primary management node and a secondary management node are used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder haEnable(Boolean haEnable) {
            this.putQueryParameter("HaEnable", haEnable);
            this.haEnable = haEnable;
            return this;
        }

        /**
         * <p>The image IDs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the images that are supported by E-HPC.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_02_64_20G_alibase_20170818****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * </ul>
         * <p>Default value: system.</p>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.</p>
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto scaling. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isComputeEss(Boolean isComputeEss) {
            this.putQueryParameter("IsComputeEss", isComputeEss);
            this.isComputeEss = isComputeEss;
            return this;
        }

        /**
         * <p>The queue to which the compute nodes are added.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/51793.html">Create an SSH key pair</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The name of the E-HPC cluster. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The communication model of the ENI. Valid values:</p>
         * <ul>
         * <li>Standard: The TCP communication mode is used.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with the Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * <p>The operating system tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * <p>The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
         * <p><code>( ) ~ ! @ # $ % ^ &amp; * - + = | { } [ ] : ; ‘ &lt; &gt; , . ? /</code></p>
         * <p>You must specify either Password or KeyPairName. If both are specified, the Password parameter prevails.</p>
         * <blockquote>
         * <p>We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The duration of the subscription. The unit of the duration is specified by the <code>PeriodUnit</code> parameter.</p>
         * <ul>
         * <li>Valid values if PriceUnit is set to Year: 1, 2, and 3.</li>
         * <li>Valid values if PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>Valid value if PriceUnit is set to Hour: 1.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * <li>Hour</li>
         * </ul>
         * <p>Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
         * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
         * <ul>
         * <li><p>pluginMod: the plug-in mode. The following modes are supported:</p>
         * <ul>
         * <li>oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.</li>
         * <li>image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.</li>
         * </ul>
         * </li>
         * <li><p>pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.</p>
         * </li>
         * <li><p>pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pluginMod&quot;: &quot;oss&quot;,&quot;pluginLocalPath&quot;: &quot;/opt/plugin&quot;,&quot;pluginOssPath&quot;: &quot;<a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz%22%7D">https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz&quot;}</a></p>
         */
        public Builder plugin(String plugin) {
            this.putQueryParameter("Plugin", plugin);
            this.plugin = plugin;
            return this;
        }

        /**
         * <p>The information of the post-installation script.</p>
         */
        public Builder postInstallScript(java.util.List<PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * <p>The node of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder ramNodeTypes(java.util.List<String> ramNodeTypes) {
            this.putQueryParameter("RamNodeTypes", ramNodeTypes);
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }

        /**
         * <p>The name of the Resource Access Management (RAM) role.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created.</p>
         * 
         * <strong>example:</strong>
         * <p>testRamRoleName</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The remote directory to which the NAS file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>NasMountpoint:/RemoteDirectory</p>
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * <p>Specifies whether to enable Virtual Network Computing (VNC). Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder remoteVisEnable(String remoteVisEnable) {
            this.putQueryParameter("RemoteVisEnable", remoteVisEnable);
            this.remoteVisEnable = remoteVisEnable;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Super Computing Cluster (SCC) instance ID.</p>
         * <p>If you specify the parameter, the SCC instance is moved to a new SCC cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>00b648b****</p>
         */
        public Builder sccClusterId(String sccClusterId) {
            this.putQueryParameter("SccClusterId", sccClusterId);
            this.sccClusterId = sccClusterId;
            return this;
        }

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * <p>Default value: pbs.</p>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * <p>The ID of the security group to which the E-HPC cluster belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to query available security groups in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp13n61xsydodfyg****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-SecurityGroup</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * <p>The performance level of the ESSD to be used as the system disk. Default value: PL1. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * <p>The system disk size. Unit: GB.</p>
         * <p>Valid values: 40 to 500.</p>
         * <p>Default value: 40.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The type of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud: basic disk. Disks of this type are retired.</li>
         * </ul>
         * <p>Default value: cloud_ssd.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * <p>The array of the tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID. E-HPC supports only VPC networks.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query available vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1lfcjbfb099rrjn****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the NAS file system. If you leave the parameter empty, a Performance NAS file system is created by default.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204364.html">ListFileSystemWithMountTargets</a> operation to query available mount targets.</p>
         * 
         * <strong>example:</strong>
         * <p>008b64****</p>
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * <p>The mount options of the NFS file system that you want to mount by running the mount command.</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/nas/latest/mount-an-nfs-file-system-on-a-linux-ecs-instance#section-jyi-hyd-hbr">Mount an NFS file system on a Linux ECS instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>-t nfs -o vers=4</p>
         */
        public Builder volumeMountOption(String volumeMountOption) {
            this.putQueryParameter("VolumeMountOption", volumeMountOption);
            this.volumeMountOption = volumeMountOption;
            return this;
        }

        /**
         * <p>The mount target of the NAS file system. The mount target is of the VPC type. Take note of the following information:</p>
         * <ul>
         * <li>If the VolumeId parameter is not specified, you can leave the VolumeMountpoint parameter empty. In this case, a mount target is created by default.</li>
         * <li>When the VolumeId parameter is specified, the VolumeMountpoint parameter is required. You can call the <a href="https://help.aliyun.com/document_detail/204364.html">ListFileSystemWithMountTargets</a> operation to query available mount targets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>008b648bcb-s****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * <p>The type of the protocol that is used by the NAS file system. Valid values:</p>
         * <ul>
         * <li>NFS</li>
         * <li>SMB</li>
         * </ul>
         * <p>Default value: NFS.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * <p>The type of the shared storage. Set the value to <code>nas</code>, which indicates NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>nas</p>
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query available VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-b3f3edefefeep0760yju****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Specifies whether not to install the agent.</p>
         * <ul>
         * <li>true: does not install the agent.</li>
         * <li>false: installs the agent.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withoutAgent(Boolean withoutAgent) {
            this.putQueryParameter("WithoutAgent", withoutAgent);
            this.withoutAgent = withoutAgent;
            return this;
        }

        /**
         * <p>Specifies whether the logon node uses an elastic IP address (EIP). Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withoutElasticIp(Boolean withoutElasticIp) {
            this.putQueryParameter("WithoutElasticIp", withoutElasticIp);
            this.withoutElasticIp = withoutElasticIp;
            return this;
        }

        /**
         * <p>Indicates whether to use NAS as a shared storage. Valid values:</p>
         * <ul>
         * <li>true: does not use NAS.</li>
         * <li>false: use NAS.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withoutNas(Boolean withoutNas) {
            this.putQueryParameter("WithoutNas", withoutNas);
            this.withoutNas = withoutNas;
            return this;
        }

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> and <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operations to query the IDs of the zones where E-HPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Compute model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of compute nodes in the cluster. Valid values: 0 to 99.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the compute nodes.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Login extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Login model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of the logon nodes. Valid value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the logon nodes.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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

            private Builder() {
            } 

            private Builder(Manager model) {
                this.count = model.count;
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The number of the management nodes. Valid values: 1 and 2.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The instance type of the management nodes.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class EcsOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compute")
        @com.aliyun.core.annotation.Validation(required = true)
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("Login")
        @com.aliyun.core.annotation.Validation(required = true)
        private Login login;

        @com.aliyun.core.annotation.NameInMap("Manager")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(EcsOrder model) {
                this.compute = model.compute;
                this.login = model.login;
                this.manager = model.manager;
            } 

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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class AddOns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFile")
        private String configFile;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DefaultStart")
        private Boolean defaultStart;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Float port;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AddOns(Builder builder) {
            this.configFile = builder.configFile;
            this.DBType = builder.DBType;
            this.defaultStart = builder.defaultStart;
            this.deployMode = builder.deployMode;
            this.name = builder.name;
            this.port = builder.port;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddOns create() {
            return builder().build();
        }

        /**
         * @return configFile
         */
        public String getConfigFile() {
            return this.configFile;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return defaultStart
         */
        public Boolean getDefaultStart() {
            return this.defaultStart;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Float getPort() {
            return this.port;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String configFile; 
            private String DBType; 
            private Boolean defaultStart; 
            private String deployMode; 
            private String name; 
            private Float port; 
            private String version; 

            private Builder() {
            } 

            private Builder(AddOns model) {
                this.configFile = model.configFile;
                this.DBType = model.DBType;
                this.defaultStart = model.defaultStart;
                this.deployMode = model.deployMode;
                this.name = model.name;
                this.port = model.port;
                this.version = model.version;
            } 

            /**
             * <p>The path to the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/addon/cromwell/cromwell.conf</p>
             */
            public Builder configFile(String configFile) {
                this.configFile = configFile;
                return this;
            }

            /**
             * <p>The type of the database engine. Valid values: Mysql, and null.</p>
             * 
             * <strong>example:</strong>
             * <p>Mysql</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>Indicates whether to auto-start the custom component. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultStart(Boolean defaultStart) {
                this.defaultStart = defaultStart;
                return this;
            }

            /**
             * <p>The deployment mode. Valid values: local and ecs.</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>cromwell</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The access port of the custom component.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder port(Float port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The version number of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AddOns build() {
                return new AddOns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Roles model) {
                this.name = model.name;
            } 

            /**
             * <p>The type of the nodes to which the NAS file system is attached.</p>
             * <p>Valid values of N in AdditionalVolumes.N.Roles: 1 to 10</p>
             * <p>Valid values of N in Roles.N.Name: 0 to 8.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Compute&quot;]</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class AdditionalVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LocalDirectory")
        private String localDirectory;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private String volumeId;

        @com.aliyun.core.annotation.NameInMap("VolumeMountOption")
        private String volumeMountOption;

        @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
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
        public java.util.List<Roles> getRoles() {
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
            private java.util.List<Roles> roles; 
            private String volumeId; 
            private String volumeMountOption; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            private Builder() {
            } 

            private Builder(AdditionalVolumes model) {
                this.jobQueue = model.jobQueue;
                this.localDirectory = model.localDirectory;
                this.location = model.location;
                this.remoteDirectory = model.remoteDirectory;
                this.roles = model.roles;
                this.volumeId = model.volumeId;
                this.volumeMountOption = model.volumeMountOption;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
            } 

            /**
             * <p>The queue of the nodes to which the NAS file system is attached.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The local directory on which the NAS file system is mounted.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>/ff</p>
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * <p>The type of the E-HPC cluster. Set the value to PublicCloud.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>PublicCloud</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The remote directory to which the NAS file system is mounted.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The node information to which the NAS file system is attached.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The ID of the NAS file system.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>extreme-00b88****</p>
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * <p>The mount options of the NAS file system.</p>
             * <p>You can specify 1 to 10 vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>-t nfs -o vers=4.0</p>
             */
            public Builder volumeMountOption(String volumeMountOption) {
                this.volumeMountOption = volumeMountOption;
                return this;
            }

            /**
             * <p>The mount target of the NAS file system.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>0088****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The type of the protocol that is used by the NAS file system. Valid value:</p>
             * <ul>
             * <li>NFS</li>
             * <li>SMB</li>
             * </ul>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>Default value: NFS.</p>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * <p>The type of the additional shared storage. Only NAS file systems are supported.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>nas</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.tag = model.tag;
            } 

            /**
             * <p>The tag of the software.</p>
             * <p>Valid values of N: 0 to 100.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/87216.html">ListSoftwares</a> operation to query the tag of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenMPI_11.1</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class PostInstallScript extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(PostInstallScript model) {
                this.args = model.args;
                this.url = model.url;
            } 

            /**
             * <p>The parameter that is used to run the script after the cluster is created.</p>
             * <p>Valid values of N: 0 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>bashfile.sh</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the script after the E-HPC cluster is created.</p>
             * <p>Valid values of N: 0 to 16</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/job.sh</p>
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
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
