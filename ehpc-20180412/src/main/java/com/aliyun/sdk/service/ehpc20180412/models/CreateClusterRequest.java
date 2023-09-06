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
    @NameInMap("AddOns")
    private java.util.List < AddOns> addOns;

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
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

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
    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @Query
    @NameInMap("OsTag")
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
    @NameInMap("WithoutNas")
    private Boolean withoutNas;

    @Query
    @NameInMap("ZoneId")
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
    public java.util.List < AddOns> getAddOns() {
        return this.addOns;
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
        private java.util.List < AddOns> addOns; 
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
         * The type of the domain account service. Valid values:
         * <p>
         * 
         * *   nis
         * *   ldap
         * 
         * Default value: nis.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * The custom component service.
         */
        public Builder addOns(java.util.List < AddOns> addOns) {
            this.putQueryParameter("AddOns", addOns);
            this.addOns = addOns;
            return this;
        }

        /**
         * The information of the NAS file system.
         */
        public Builder additionalVolumes(java.util.List < AdditionalVolumes> additionalVolumes) {
            this.putQueryParameter("AdditionalVolumes", additionalVolumes);
            this.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * The application information.
         */
        public Builder application(java.util.List < Application> application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The version of the E-HPC client. By default, the parameter is set to the latest version number.
         * <p>
         * 
         * You can call the [ListCurrentClientVersion](~~87223~~) operation to query the latest version of the E-HPC client.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The version of the E-HPC cluster.
         * <p>
         * 
         * Default value: 1.0.
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * Specifies whether to enable hyper-threading for the compute node. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: true.
         */
        public Builder computeEnableHt(Boolean computeEnableHt) {
            this.putQueryParameter("ComputeEnableHt", computeEnableHt);
            this.computeEnableHt = computeEnableHt;
            return this;
        }

        /**
         * The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * The bidding method of the compute nodes. Valid values:
         * <p>
         * 
         * *   NoSpot: The compute nodes are pay-as-you-go instances.
         * *   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * The mode in which the E-HPC cluster is deployed. Valid values:
         * <p>
         * 
         * *   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.
         * *   Simple: A management node, which consists of an account node and a scheduling node, is deployed, while a logon node and multiple compute nodes are separately deployed.
         * *   Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.
         * 
         * Default value: Standard.
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * The ID of the deployment set in which to deploy the instance. You can obtain the deployment set ID by calling the [DescribeDeploymentSets](~~91313~~) operation. Only the deployment sets that use low latency policy are supported.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The domain name of the on-premises E-HPC cluster.
         * <p>
         * 
         * This parameter takes effect only when the AccountType parameter is set to Idap.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The billing method of the nodes. Valid values:
         * <p>
         * 
         * *   PostPaid: pay-as-you-go.
         * *   PrePaid: subscription.
         * 
         * If you set the parameter to PrePaid, auto-renewal is enabled by default.
         */
        public Builder ecsChargeType(String ecsChargeType) {
            this.putQueryParameter("EcsChargeType", ecsChargeType);
            this.ecsChargeType = ecsChargeType;
            return this;
        }

        /**
         * The version of E-HPC. By default, the parameter is set to the latest version number.
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * Specifies whether to enable the high availability feature. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * > If high availability is enabled, a primary management node and a secondary management node are used.
         */
        public Builder haEnable(Boolean haEnable) {
            this.putQueryParameter("HaEnable", haEnable);
            this.haEnable = haEnable;
            return this;
        }

        /**
         * The image IDs.
         * <p>
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the images that are supported by E-HPC.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   system: public image
         * *   self: custom image
         * *   others: shared image
         * 
         * Default value: system.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.
         */
        public Builder inputFileUrl(String inputFileUrl) {
            this.putQueryParameter("InputFileUrl", inputFileUrl);
            this.inputFileUrl = inputFileUrl;
            return this;
        }

        /**
         * Specifies whether to enable auto scaling. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder isComputeEss(Boolean isComputeEss) {
            this.putQueryParameter("IsComputeEss", isComputeEss);
            this.isComputeEss = isComputeEss;
            return this;
        }

        /**
         * The queue to which the compute nodes are added.
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * > For more information, see [Create an SSH key pair](~~51793~~).
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The name of the E-HPC cluster. The name must be 2 to 64 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The communication model of the ENI. Valid values:
         * <p>
         * 
         * *   Standard: The TCP communication mode is used.
         * *   HighPerformance: uses the remote direct memory access (RDMA) communication mode with the Elastic RDMA Interface (ERI) enabled.
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * The operating system tag of the image.
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        /**
         * The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. Special characters include:
         * <p>
         * 
         * `( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ‘ < > , . ? /`
         * 
         * You must specify either Password or KeyPairName. If both are specified, the Password parameter prevails.
         * 
         * > We recommend that you use HTTPS to call the API operation to prevent password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The duration of the subscription. The unit of the duration is specified by the `PeriodUnit` parameter.
         * <p>
         * 
         * *   Valid values if PriceUnit is set to Year: 1, 2, and 3.
         * *   Valid values if PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
         * *   Valid value if PriceUnit is set to Hour: 1.
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   Year
         * *   Month
         * *   Hour
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.
         * <p>
         * 
         * The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.
         * 
         * *   pluginMod: the plug-in mode. The following modes are supported:
         * 
         *     *   oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.
         *     *   image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.
         * 
         * *   pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.
         * 
         * *   pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.
         */
        public Builder plugin(String plugin) {
            this.putQueryParameter("Plugin", plugin);
            this.plugin = plugin;
            return this;
        }

        /**
         * The information of the post-installation script.
         */
        public Builder postInstallScript(java.util.List < PostInstallScript> postInstallScript) {
            this.putQueryParameter("PostInstallScript", postInstallScript);
            this.postInstallScript = postInstallScript;
            return this;
        }

        /**
         * The node of the RAM role.
         */
        public Builder ramNodeTypes(java.util.List < String > ramNodeTypes) {
            this.putQueryParameter("RamNodeTypes", ramNodeTypes);
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }

        /**
         * The name of the Resource Access Management (RAM) role.
         * <p>
         * 
         * You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The remote directory to which the NAS file system is mounted.
         */
        public Builder remoteDirectory(String remoteDirectory) {
            this.putQueryParameter("RemoteDirectory", remoteDirectory);
            this.remoteDirectory = remoteDirectory;
            return this;
        }

        /**
         * Specifies whether to enable Virtual Network Computing (VNC). Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder remoteVisEnable(String remoteVisEnable) {
            this.putQueryParameter("RemoteVisEnable", remoteVisEnable);
            this.remoteVisEnable = remoteVisEnable;
            return this;
        }

        /**
         * The resource group ID.
         * <p>
         * 
         * You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The Super Computing Cluster (SCC) instance ID.
         * <p>
         * 
         * If you specify the parameter, the SCC instance is moved to a new SCC cluster.
         */
        public Builder sccClusterId(String sccClusterId) {
            this.putQueryParameter("SccClusterId", sccClusterId);
            this.sccClusterId = sccClusterId;
            return this;
        }

        /**
         * The type of the scheduler. Valid values:
         * <p>
         * 
         * *   pbs
         * *   slurm
         * *   opengridscheduler
         * *   deadline
         * 
         * Default value: pbs.
         */
        public Builder schedulerType(String schedulerType) {
            this.putQueryParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        /**
         * The ID of the security group to which the E-HPC cluster belongs.
         * <p>
         * 
         * You can call the [DescribeSecurityGroups](~~25556~~) operation to query available security groups in the current region.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * The performance level of the ESSD to be used as the system disk. Default value: PL1. Valid values:
         * <p>
         * 
         * *   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.
         * *   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.
         * *   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.
         * *   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.
         * 
         * Default value: PL1.
         * 
         * For more information, see [ESSDs](~~122389~~).
         */
        public Builder systemDiskLevel(String systemDiskLevel) {
            this.putQueryParameter("SystemDiskLevel", systemDiskLevel);
            this.systemDiskLevel = systemDiskLevel;
            return this;
        }

        /**
         * The system disk size. Unit: GB.
         * <p>
         * 
         * Valid values: 40 to 500.
         * 
         * Default value: 40.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * The type of the system disk. Valid values:
         * <p>
         * 
         * *   cloud_efficiency: ultra disk
         * *   cloud_ssd: standard SSD
         * *   cloud_essd: enhanced SSD (ESSD)
         * *   cloud: basic disk. Disks of this type are retired.
         * 
         * Default value: cloud_ssd.
         */
        public Builder systemDiskType(String systemDiskType) {
            this.putQueryParameter("SystemDiskType", systemDiskType);
            this.systemDiskType = systemDiskType;
            return this;
        }

        /**
         * The array of the tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The vSwitch ID. E-HPC supports only VPC networks.
         * <p>
         * 
         * You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the NAS file system. If you leave the parameter empty, a Performance NAS file system is created by default.
         * <p>
         * 
         * You can call the [ListFileSystemWithMountTargets](~~204364~~) operation to query available mount targets.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        /**
         * The mount options of the NFS file system that you want to mount by running the mount command.
         * <p>
         * 
         * For more information, see [Mount an NFS file system on a Linux ECS instance](https://www.alibabacloud.com/help/en/nas/latest/mount-an-nfs-file-system-on-a-linux-ecs-instance#section-jyi-hyd-hbr).
         */
        public Builder volumeMountOption(String volumeMountOption) {
            this.putQueryParameter("VolumeMountOption", volumeMountOption);
            this.volumeMountOption = volumeMountOption;
            return this;
        }

        /**
         * The mount target of the NAS file system. The mount target is of the VPC type. Take note of the following information:
         * <p>
         * 
         * *   If the VolumeId parameter is not specified, you can leave the VolumeMountpoint parameter empty. In this case, a mount target is created by default.
         * *   When the VolumeId parameter is specified, the VolumeMountpoint parameter is required. You can call the [ListFileSystemWithMountTargets](~~204364~~) operation to query available mount targets.
         */
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.putQueryParameter("VolumeMountpoint", volumeMountpoint);
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }

        /**
         * The type of the protocol that is used by the NAS file system. Valid values:
         * <p>
         * 
         * *   NFS
         * *   SMB
         * 
         * Default value: NFS.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        /**
         * The type of the shared storage. Set the value to `nas`, which indicates NAS file system.
         */
        public Builder volumeType(String volumeType) {
            this.putQueryParameter("VolumeType", volumeType);
            this.volumeType = volumeType;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.
         * <p>
         * 
         * You can call the [DescribeVpcs](~~35739~~) operation to query available VPCs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Specifies whether not to install the agent.
         * <p>
         * 
         * *   true: does not install the agent.
         * *   false: installs the agent.
         * 
         * Default value: false.
         */
        public Builder withoutAgent(Boolean withoutAgent) {
            this.putQueryParameter("WithoutAgent", withoutAgent);
            this.withoutAgent = withoutAgent;
            return this;
        }

        /**
         * Specifies whether the logon node uses an elastic IP address (EIP). Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder withoutElasticIp(Boolean withoutElasticIp) {
            this.putQueryParameter("WithoutElasticIp", withoutElasticIp);
            this.withoutElasticIp = withoutElasticIp;
            return this;
        }

        /**
         * Indicates whether to use NAS as a shared storage. Valid values:
         * <p>
         * 
         * *   true: does not use NAS.
         * *   false: use NAS.
         * 
         * Default value: false.
         */
        public Builder withoutNas(Boolean withoutNas) {
            this.putQueryParameter("WithoutNas", withoutNas);
            this.withoutNas = withoutNas;
            return this;
        }

        /**
         * The ID of the zone in which the resource resides.
         * <p>
         * 
         * You can call the [ListRegions](~~188593~~) and [DescribeZones](~~25610~~) operations to query the IDs of the zones where E-HPC is supported.
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
        private Integer count;

        @NameInMap("InstanceType")
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
             * The number of compute nodes in the cluster. Valid values: 0 to 99.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the compute nodes.
             * <p>
             * 
             * You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.
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
        private Integer count;

        @NameInMap("InstanceType")
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
             * The number of the logon nodes. Valid value: 1.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the logon nodes.
             * <p>
             * 
             * You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.
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
             * The number of the management nodes. Valid values: 1 and 2.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The instance type of the management nodes.
             * <p>
             * 
             * You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.
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
    public static class AddOns extends TeaModel {
        @NameInMap("ConfigFile")
        private String configFile;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DefaultStart")
        private Boolean defaultStart;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Float port;

        @NameInMap("Version")
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

            /**
             * The path to the configuration file.
             */
            public Builder configFile(String configFile) {
                this.configFile = configFile;
                return this;
            }

            /**
             * The type of the database engine. Valid values: Mysql, and null.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * Indicates whether to auto-start the custom component. Valid values: true and false.
             */
            public Builder defaultStart(Boolean defaultStart) {
                this.defaultStart = defaultStart;
                return this;
            }

            /**
             * The deployment mode. Valid values: local and ecs.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The component name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The access port of the custom component.
             */
            public Builder port(Float port) {
                this.port = port;
                return this;
            }

            /**
             * The version number of the component.
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
             * The type of the nodes to which the NAS file system is attached.
             * <p>
             * 
             * Valid values of N in AdditionalVolumes.N.Roles: 1 to 10
             * 
             * Valid values of N in Roles.N.Name: 0 to 8.
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
             * The queue of the nodes to which the NAS file system is attached.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * The local directory on which the NAS file system is mounted.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * The type of the E-HPC cluster. Set the value to PublicCloud.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The remote directory to which the NAS file system is mounted.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The node information to which the NAS file system is attached.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * The ID of the NAS file system.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * The mount options of the NAS file system.
             * <p>
             * 
             * You can specify 1 to 10 vCPUs.
             */
            public Builder volumeMountOption(String volumeMountOption) {
                this.volumeMountOption = volumeMountOption;
                return this;
            }

            /**
             * The mount target of the NAS file system.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The type of the protocol that is used by the NAS file system. Valid value:
             * <p>
             * 
             * *   NFS
             * *   SMB
             * 
             * Valid values of N: 1 to 10.
             * 
             * Default value: NFS.
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * The type of the additional shared storage. Only NAS file systems are supported.
             * <p>
             * 
             * Valid values of N: 1 to 10.
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
             * The tag of the software.
             * <p>
             * 
             * Valid values of N: 0 to 100.
             * 
             * You can call the [ListSoftwares](~~87216~~) operation to query the tag of the software.
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
             * The parameter that is used to run the script after the cluster is created.
             * <p>
             * 
             * Valid values of N: 0 to 16.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * The URL that is used to download the script after the E-HPC cluster is created.
             * <p>
             * 
             * Valid values of N: 0 to 16
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
