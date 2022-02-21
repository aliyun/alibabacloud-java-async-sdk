// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @NameInMap("HibernationOptions")
    private HibernationOptions hibernationOptions;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("NodeControllerId")
    private String nodeControllerId;

    @Query
    @NameInMap("HttpPutResponseHopLimit")
    private Integer httpPutResponseHopLimit;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("Arn")
    private java.util.List < Arn> arn;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("VlanId")
    private String vlanId;

    @Query
    @NameInMap("InnerIpAddress")
    private String innerIpAddress;

    @Query
    @NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("StorageSetId")
    private String storageSetId;

    @Query
    @NameInMap("StorageSetPartitionNumber")
    private Integer storageSetPartitionNumber;

    @Query
    @NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("UseAdditionalService")
    private Boolean useAdditionalService;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("DeploymentSetGroupNo")
    private Integer deploymentSetGroupNo;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("HttpTokens")
    private String httpTokens;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.hibernationOptions = builder.hibernationOptions;
        this.systemDisk = builder.systemDisk;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.nodeControllerId = builder.nodeControllerId;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.dataDisk = builder.dataDisk;
        this.arn = builder.arn;
        this.tag = builder.tag;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.deploymentSetId = builder.deploymentSetId;
        this.vlanId = builder.vlanId;
        this.innerIpAddress = builder.innerIpAddress;
        this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
        this.ramRoleName = builder.ramRoleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.hpcClusterId = builder.hpcClusterId;
        this.creditSpecification = builder.creditSpecification;
        this.storageSetId = builder.storageSetId;
        this.storageSetPartitionNumber = builder.storageSetPartitionNumber;
        this.httpEndpoint = builder.httpEndpoint;
        this.ioOptimized = builder.ioOptimized;
        this.password = builder.password;
        this.spotDuration = builder.spotDuration;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.tenancy = builder.tenancy;
        this.clusterId = builder.clusterId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.securityGroupId = builder.securityGroupId;
        this.autoRenew = builder.autoRenew;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
        this.passwordInherit = builder.passwordInherit;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.useAdditionalService = builder.useAdditionalService;
        this.privateIpAddress = builder.privateIpAddress;
        this.vSwitchId = builder.vSwitchId;
        this.imageFamily = builder.imageFamily;
        this.keyPairName = builder.keyPairName;
        this.deploymentSetGroupNo = builder.deploymentSetGroupNo;
        this.deletionProtection = builder.deletionProtection;
        this.userData = builder.userData;
        this.internetChargeType = builder.internetChargeType;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.imageId = builder.imageId;
        this.periodUnit = builder.periodUnit;
        this.instanceName = builder.instanceName;
        this.httpTokens = builder.httpTokens;
        this.description = builder.description;
        this.instanceChargeType = builder.instanceChargeType;
        this.hostName = builder.hostName;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.period = builder.period;
        this.affinity = builder.affinity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hibernationOptions
     */
    public HibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return nodeControllerId
     */
    public String getNodeControllerId() {
        return this.nodeControllerId;
    }

    /**
     * @return httpPutResponseHopLimit
     */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return arn
     */
    public java.util.List < Arn> getArn() {
        return this.arn;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return vlanId
     */
    public String getVlanId() {
        return this.vlanId;
    }

    /**
     * @return innerIpAddress
     */
    public String getInnerIpAddress() {
        return this.innerIpAddress;
    }

    /**
     * @return spotInterruptionBehavior
     */
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return storageSetPartitionNumber
     */
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return useAdditionalService
     */
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return deploymentSetGroupNo
     */
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private HibernationOptions hibernationOptions; 
        private SystemDisk systemDisk; 
        private PrivatePoolOptions privatePoolOptions; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String nodeControllerId; 
        private Integer httpPutResponseHopLimit; 
        private java.util.List < DataDisk> dataDisk; 
        private java.util.List < Arn> arn; 
        private java.util.List < Tag> tag; 
        private String instanceType; 
        private String regionId; 
        private String deploymentSetId; 
        private String vlanId; 
        private String innerIpAddress; 
        private String spotInterruptionBehavior; 
        private String ramRoleName; 
        private String resourceGroupId; 
        private String hpcClusterId; 
        private String creditSpecification; 
        private String storageSetId; 
        private Integer storageSetPartitionNumber; 
        private String httpEndpoint; 
        private String ioOptimized; 
        private String password; 
        private Integer spotDuration; 
        private String clientToken; 
        private Boolean dryRun; 
        private String tenancy; 
        private String clusterId; 
        private String dedicatedHostId; 
        private Integer internetMaxBandwidthIn; 
        private String securityGroupId; 
        private Boolean autoRenew; 
        private String spotStrategy; 
        private String zoneId; 
        private Boolean passwordInherit; 
        private Integer internetMaxBandwidthOut; 
        private Integer autoRenewPeriod; 
        private Boolean useAdditionalService; 
        private String privateIpAddress; 
        private String vSwitchId; 
        private String imageFamily; 
        private String keyPairName; 
        private Integer deploymentSetGroupNo; 
        private Boolean deletionProtection; 
        private String userData; 
        private String internetChargeType; 
        private Float spotPriceLimit; 
        private String imageId; 
        private String periodUnit; 
        private String instanceName; 
        private String httpTokens; 
        private String description; 
        private String instanceChargeType; 
        private String hostName; 
        private String securityEnhancementStrategy; 
        private Integer period; 
        private String affinity; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.hibernationOptions = response.hibernationOptions;
            this.systemDisk = response.systemDisk;
            this.privatePoolOptions = response.privatePoolOptions;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.nodeControllerId = response.nodeControllerId;
            this.httpPutResponseHopLimit = response.httpPutResponseHopLimit;
            this.dataDisk = response.dataDisk;
            this.arn = response.arn;
            this.tag = response.tag;
            this.instanceType = response.instanceType;
            this.regionId = response.regionId;
            this.deploymentSetId = response.deploymentSetId;
            this.vlanId = response.vlanId;
            this.innerIpAddress = response.innerIpAddress;
            this.spotInterruptionBehavior = response.spotInterruptionBehavior;
            this.ramRoleName = response.ramRoleName;
            this.resourceGroupId = response.resourceGroupId;
            this.hpcClusterId = response.hpcClusterId;
            this.creditSpecification = response.creditSpecification;
            this.storageSetId = response.storageSetId;
            this.storageSetPartitionNumber = response.storageSetPartitionNumber;
            this.httpEndpoint = response.httpEndpoint;
            this.ioOptimized = response.ioOptimized;
            this.password = response.password;
            this.spotDuration = response.spotDuration;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.tenancy = response.tenancy;
            this.clusterId = response.clusterId;
            this.dedicatedHostId = response.dedicatedHostId;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
            this.securityGroupId = response.securityGroupId;
            this.autoRenew = response.autoRenew;
            this.spotStrategy = response.spotStrategy;
            this.zoneId = response.zoneId;
            this.passwordInherit = response.passwordInherit;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.autoRenewPeriod = response.autoRenewPeriod;
            this.useAdditionalService = response.useAdditionalService;
            this.privateIpAddress = response.privateIpAddress;
            this.vSwitchId = response.vSwitchId;
            this.imageFamily = response.imageFamily;
            this.keyPairName = response.keyPairName;
            this.deploymentSetGroupNo = response.deploymentSetGroupNo;
            this.deletionProtection = response.deletionProtection;
            this.userData = response.userData;
            this.internetChargeType = response.internetChargeType;
            this.spotPriceLimit = response.spotPriceLimit;
            this.imageId = response.imageId;
            this.periodUnit = response.periodUnit;
            this.instanceName = response.instanceName;
            this.httpTokens = response.httpTokens;
            this.description = response.description;
            this.instanceChargeType = response.instanceChargeType;
            this.hostName = response.hostName;
            this.securityEnhancementStrategy = response.securityEnhancementStrategy;
            this.period = response.period;
            this.affinity = response.affinity;
        } 

        /**
         * HibernationOptions.
         */
        public Builder hibernationOptions(HibernationOptions hibernationOptions) {
            this.hibernationOptions = hibernationOptions;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * NodeControllerId.
         */
        public Builder nodeControllerId(String nodeControllerId) {
            this.putQueryParameter("NodeControllerId", nodeControllerId);
            this.nodeControllerId = nodeControllerId;
            return this;
        }

        /**
         * HttpPutResponseHopLimit.
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * Arn.
         */
        public Builder arn(java.util.List < Arn> arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the instance.
         * <p>
         * 
         * -Product selection: see [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, for more information about how to select an instance type, see [select configuration](~~ 58291 ~~).
         * -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the deployment set.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vlanId(String vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        /**
         * The internal IP address of the instance.
         */
        public Builder innerIpAddress(String innerIpAddress) {
            this.putQueryParameter("InnerIpAddress", innerIpAddress);
            this.innerIpAddress = innerIpAddress;
            return this;
        }

        /**
         * The interrupt mode of the preemptible instance. You can only release instances Terminate by default.
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * The name of the instance RAM role. You can use the RAM API [ListRoles](~~ 28713 ~~) to query the created instance RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the HPC cluster to which the instance belongs.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * Modify the running mode of a burstable instance. Valid values:
         * <p>
         * 
         * -Standard: Standard mode. For more information about instance performance, see performance constraint mode in [What is burstable instance](~~ 59977 ~~).
         * -Unlimited: Unlimited Mode. For more information about instance performance, see Unlimited mode in [What is burstable instance](~~ 59977 ~~).
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * The ID of the storage set.
         */
        public Builder storageSetId(String storageSetId) {
            this.putQueryParameter("StorageSetId", storageSetId);
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * The maximum number of partitions in a bucket. Valid values: 2 or more.
         */
        public Builder storageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber);
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }

        /**
         * Specifies whether to enable the access channel for instance metadata. Valid values:
         * <p>
         * -enabled: enabled.
         * -disabled: disabled.
         * 
         * The default value is enabled.
         * > For more information about instance metadata, see [instance metadata Overview](~~ 49122 ~~).
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized. Valid values:
         * <p>
         * 
         * -none: Non-I/O optimized.
         * -optimized:I/O optimized.
         * 
         * The default value of the [phased-out instance type](~~ 55263 ~~) instance is none.
         * 
         * The default value of other instance types is optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The password of the instance. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
         * 
         * Note:
         * 
         * -If you specify Password parameters, we recommend that you send requests over HTTPS to avoid Password leakage.
         * -Windows instance cannot start with a forward slash (/).
         * -Some operating system instances do not support password configuration, only key pairs can be configured. For example, Others Linux and Fedora CoreOS.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The retention period of a preemptible instance. Unit: hours. Valid values: 0 to 6.
         * <p>
         * 
         * -The retention period is 2 to 6 and is being invited for testing. If you want to activate the service, submit a ticket.
         * -If the value is 0, the mode is not protected.
         * 
         * Default value: 1.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request and does not create an instance. Check items include required parameters, request format, business restrictions, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * -false (default): Sends a normal request and directly creates an instance after passing the check.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Specifies whether to create an instance on a dedicated host. Valid values:
         * <p>
         * 
         * -default: creates an instance on a non-dedicated host.
         * 
         * -host: creates an instance on a dedicated host. If you do not specify "DedicatedHostId", Alibaba Cloud automatically selects a dedicated host to deploy the instance.
         * 
         * default value: default.
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * The ID of the cluster to which the instance belongs.
         * <p>
         * 
         * > This parameter will be deprecated soon. To improve compatibility, try to use other parameters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to create an ECS instance on a dedicated host.
         * <p>
         * 
         * <props = "china"> You can use [DescribeDedicatedHosts](~~ 134242 ~~) to query the ID List of dedicated hosts. </props>
         * 
         * <props = "intl"> You can use [DescribeDedicatedHosts](~~ 134242 ~~) to query the ID List of dedicated hosts. </props>
         * 
         * Preemptible instances cannot be created on dedicated hosts. When the "DedicatedHostId" parameter is specified, the "spotstratege" and "spotpricelime" settings in the request are automatically ignored.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * -1 to 10 when the purchased network bandwidth is less than or equal to 10 Mbit/s. Default value: 10.
         * -When the purchased network bandwidth is greater than 10 Mbit/s: 1 to "InternetMaxBandwidthOut". The default value is "InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * The ID of the security group to which the new instance belongs. Instances in the same security group can access each other.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether to enable automatic renewal. This parameter takes effect only when the value of "InstanceChargeType" is "PrePaid. Valid values:
         * <p>
         * 
         * -true: auto renewal.
         * -false: the instance is not automatically renewed.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The preemptible policy of the instance. This parameter takes effect only when the value of "InstanceChargeType" is "PostPaid. Valid values:
         * <p>
         * 
         * -NoSpot (default): a pay-as-you-go instance.
         * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
         * -SpotAsPriceGo: The system automatically bids based on the actual market price.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The ID of the zone to which the instance belongs. For more information, see [DescribeZones](~~ 25610 ~~) for a list of zones.
         * <p>
         * 
         * > If you specify the "VSwitchId" parameter, the specified "ZoneId" parameter must be consistent with the zone where the vSwitch is located. If you do not specify the "ZoneId" parameter, the system automatically selects the zone where the specified vSwitch is located.
         * 
         * Default value: NULL. The system automatically selects this parameter.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Specifies whether to use the default password of the image. When you use this parameter, the Password parameter must be empty, and you must ensure that the Password has been set for the image you are using.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
         * <p>
         * 
         * Default value: 0.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * The duration of each automatic renewal. This parameter is required when the AutoRenew parameter is set to True.
         * <p>
         * 
         * <props = "china"> when the PeriodUnit is Week, the value range of the AutoRenewPeriod is {"1", "2", "3"}. </props>
         * 
         * When the PeriodUnit is Month, the value range of the AutoRenewPeriod is {"1", "2", "3", "6", "12"}.
         * 
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * Specifies whether to use the virtual machine system configurations provided by Alibaba Cloud (Windows:NTP and KMS;Linux:NTP and YUM).
         */
        public Builder useAdditionalService(Boolean useAdditionalService) {
            this.putQueryParameter("UseAdditionalService", useAdditionalService);
            this.useAdditionalService = useAdditionalService;
            return this;
        }

        /**
         * The private IP address of the instance. The IP address must be the idle address of the CIDR block of the vSwitch (VSwitchId).
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * If you want to create a VPC instance, you must specify the vSwitch ID. You can call [DescribeVSwitches](~~ 35748 ~~) to query the information about the created vSwitch.
         * <p>
         * 
         * > If you specify the "VSwitchId" parameter, the specified "ZoneId" parameter must be consistent with the zone where the vSwitch is located. If you do not specify the "ZoneId" parameter, the system automatically selects the zone where the specified vSwitch is located.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the Image family. You can set this parameter to obtain the latest available custom images in the current image family to create an instance.
         * <p>
         * -If "ImageId" is set, this parameter cannot be set.
         * -If "ImageId" is not set, this parameter can be set.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * -Windows the instance. Ignore this parameter. The default value is null. Even if this parameter is specified, only the "Password" content is executed.
         * -The password logon method for Linux instances is initialized to disable. To improve instance security, we strongly recommend that you use the key pair connection method.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * If you set the high availability policy (AvailabilityGroup) for a deployment set, you can use this parameter to specify the group number of the instance in the deployment set. Valid values: 1 to 7.
         */
        public Builder deploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }

        /**
         * The release protection property of the instance, which specifies whether to release the instance through the console or API([DeleteInstance](~~ 25507 ~~)).
         * <p>
         * 
         * -true: enable instance release protection.
         * -false: disables instance release protection.
         * 
         * > This attribute applies only to pay-as-you-go instances and can only restrict manual release operations. This attribute does not take effect for system release operations.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The user data of the instance must be encoded in Base64. the maximum size of the raw data is 16kB.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The billing method of the network. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic (default): Pay by traffic.
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * Set the maximum hourly price for an instance. Support maximum 3 decimals, parameter "spotstrategy" value for "spotwithpricelimit" when take effect.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The ID of the image file. To use Alibaba Cloud marketplace images, you can view "ImageId" on the Alibaba Cloud Marketplace image vendor details page ". When you do not pass specified "imagefamily" selection mirror Family latest available custom mirror, this parameter is required.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Buy resources length. Valid values:
         * <p>
         * 
         * <props="china">
         * -Week.
         * -Month.
         * 
         * </props>
         * 
         * <props="intl">
         * -Month.
         * 
         * </props>
         * 
         * <props="partner">
         * -Month.
         * 
         * </props>
         * 
         * The default value is Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. Can contain numbers, half-width a colon (:), underscore (_), half-width period (.) or dash (-). If this parameter is not specified, the default is instance ID.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Specifies whether to use the enhanced mode (IMDSv2) when accessing instance metadata. Valid values:
         * <p>
         * -optional: not mandatory.
         * -required: force use. Set the value rear, normal mode cannot access instance metadata.
         * 
         * Default value: optional.
         * > about access instance metadata mode, please see [instance metadata access mode](~~ 150575 ~~).
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Instance description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         * <p>
         * 
         * The default value is null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * -PrePaid: subscription. If you select this type of payment method, make sure that your account supports balance payment and credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
         * -PostPaid (default): quantity pay.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The hostname of the ECS instance.
         * <p>
         * 
         * -Half-width period (.) or dashes (-) can"t as first and last character, more can"t continuous use.
         * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
         * -Other types of instances (such as Linux): The name must be 2 to 64 characters in length and can contain multiple periods (.), A period can contain letters, digits, and hyphens (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Specifies whether to enable security hardening. Valid values:
         * <p>
         * 
         * -Active: enable security reinforcement, only to system mirror effect.
         * -Deactive: not enabled security reinforcement, to all mirror type effect.
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * Buy resources length, unit by "periodunit" specified. When the parameter "instancechargetype" value for "prepaid" when entry into force and required value. Once specified "dedicatedhostid", the value range cannot exceed proprietary the host when the subscription is long. Valid values:
         * <p>
         * 
         * <props="china">
         * -PeriodUnit = Week When Period value: {"1", "2", "3", "4"}.
         * -PeriodUnit = Month when Period value: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         * 
         * </props>
         * 
         * <props="intl">
         * -PeriodUnit = Month when Period value: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         * 
         * </props>
         * 
         * <props="partner">
         * -PeriodUnit = Month when Period value: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
         * 
         * </props>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Indicates whether the DDH instance is associated with the DDH. Valid values:
         * <p>
         * 
         * -default: instance does not with proprietary host associated. Enabled save shutdown mode instance, after downtime again started, ruo yuan proprietary host insufficient resources available, the instance is placed in automatic deployment of the resource pool other proprietary on host.
         * 
         * -host: instance with proprietary host associated. Enabled save shutdown mode instance, after downtime again started, still place original proprietary on host. ruo yuan proprietary host insufficient resources available, the instance restart failed.
         * 
         * default value: default.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class HibernationOptions extends TeaModel {
        @NameInMap("Configured")
        private Boolean configured;

        private HibernationOptions(Builder builder) {
            this.configured = builder.configured;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HibernationOptions create() {
            return builder().build();
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        public static final class Builder {
            private Boolean configured; 

            /**
             * Configured.
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            public HibernationOptions build() {
                return new HibernationOptions(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Category")
        private String category;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Description")
        private String description;

        private SystemDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.size = builder.size;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String diskName; 
            private String category; 
            private Integer size; 
            private String description; 

            /**
             * When you create an ESSD as a system disk, set the performance level of the disk. Valid values:
             * <p>
             * 
             * -PL0: The maximum random read/write IOPS per disk is 10,000.
             * -PL1 (default): The maximum random read/write IOPS per disk is 50,000.
             * -PL2: The maximum random read/write IOPS per disk is 100,000.
             * -PL3: The maximum random read/write IOPS per disk is 1 million.
             * 
             * For more information about how to select an ESSD performance level, see [ESSD cloud disk](~~ 122389 ~~).
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * System disk name. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
             * <p>
             * 
             * The default value is null.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * -cloud_essd:ESSD. You can set the performance level of the ESSD by calling the "SystemDisk.PerformanceLevel" parameter.
             * -cloud_efficiency: Ultra disk.
             * -cloud_ssd:SSD cloud disk.
             * -cloud: basic cloud disk.
             * 
             * For phased-out instance types and non-I/O optimized instances, the default value is cloud. Otherwise, the default value is cloud_efficiency.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB. Valid values: 20 to 500.
             * <p>
             * 
             * The value of this parameter must be greater than or equal to max{20, ImageSize}.
             * 
             * Default value: max{40, ImageSize}.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * System disk description. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
             * <p>
             * 
             * The default value is null.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("Id")
        private String id;

        private PrivatePoolOptions(Builder builder) {
            this.matchCriteria = builder.matchCriteria;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String matchCriteria; 
            private String id; 

            /**
             * The capacity of the private pool that the instance starts. After the elastic protection service or the capacity reservation service takes effect, the private pool capacity is generated for you to select when the instance is started. Valid values:
             * <p>
             * 
             * -Open: Open mode. The capacity of the open private pool is automatically matched. If the capacity of the private pool does not meet the conditions, use the public pool resources to start. In this mode, you do not need to set the "PrivatePoolOptions.Id" parameter.
             * -Target: specifies the mode. Start an instance with the specified private pool capacity. If the private pool capacity is unavailable, the instance fails to start. The private pool ID must be specified in this mode, that is, the "PrivatePoolOptions.Id" parameter is required.
             * -None: the mode is not used. No private pool capacity is used when the instance is started.
             * 
             * The default value is None.
             * 
             * In any of the following scenarios, the private pool capacity option can only be set to "None" or no value.
             * -Create a preemptible instance.
             * -Create an ECS instance of the classic network type.
             * -Create an ECS instance on a DDH.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * Private pool ID. The elastic security services ID or capacity reservation service ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Description")
        private String description;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("StorageClusterId")
        private String storageClusterId;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.size = builder.size;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.KMSKeyId = builder.KMSKeyId;
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.storageClusterId = builder.storageClusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return encryptAlgorithm
         */
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return storageClusterId
         */
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String description; 
            private String snapshotId; 
            private Integer size; 
            private String device; 
            private String diskName; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String KMSKeyId; 
            private String encryptAlgorithm; 
            private Boolean encrypted; 
            private String storageClusterId; 

            /**
             * 创建ESSD云盘作为数据盘使用时，设置云盘的性能等级。N的取值必须和`DataDisk.N.Category=cloud_essd`中的N保持一致。取值范围：
             * <p>
             * 
             * - PL0：单盘最高随机读写IOPS 1万。
             * - PL1（默认）：单盘最高随机读写IOPS 5万。
             * - PL2：单盘最高随机读写IOPS 10万。
             * - PL3：单盘最高随机读写IOPS 100万。
             * 
             * 有关如何选择ESSD性能等级，请参见[ESSD云盘](~~122389~~)。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 数据盘描述。长度为2~256个英文或中文字符，不能以`http://`或`https://`开头。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建数据盘n使用的快照。N的取值范围为1~16。
             * <p>
             * 
             * - 指定参数`DataDisk.N.SnapshotId`后，参数`DataDisk.N.Size`会被忽略，实际创建的云盘大小为指定的快照的大小。
             * 
             * - 不能使用早于2013年7月15日（含）创建的快照，请求会报错被拒绝。
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * 第n个数据盘的容量大小，n的取值范围为1~16，内存单位为GiB。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：20~32768。
             * -   cloud_ssd：20~32768。
             * -   cloud_essd：20~32768。
             * -   cloud：5~2000。
             * 
             * 该参数的取值必须大于等于参数`SnapshotId`指定的快照的大小。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 挂载点。
             * <p>
             * 
             * > 该参数即将停止使用，为提高代码兼容性，建议您尽量不要使用该参数。
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 数据盘名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以`http://`或`https://`开头。可以包含数字、半角冒号（:）、下划线（_）或者短划线（-）。
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * 数据盘N的云盘种类。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：高效云盘。
             * -   cloud_ssd：SSD云盘。
             * -   cloud_essd：ESSD云盘。
             * -   cloud：普通云盘。
             * 
             * I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 数据盘是否随实例释放。
             * <p>
             * 
             * 默认值为true。
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * 云盘使用的KMS密钥ID。
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * EncryptAlgorithm.
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * 数据盘N是否加密。
             * <p>
             * 
             * 默认值为false。
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * 专属块存储集群ID。如果您在创建ECS实例时，需要使用专属块存储集群中的云盘资源作为数据盘，请设置该参数。
             */
            public Builder storageClusterId(String storageClusterId) {
                this.storageClusterId = storageClusterId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class Arn extends TeaModel {
        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
        private String rolearn;

        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        private Arn(Builder builder) {
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
            this.assumeRoleFor = builder.assumeRoleFor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return rolearn
         */
        public String getRolearn() {
            return this.rolearn;
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public static final class Builder {
            private String roleType; 
            private String rolearn; 
            private Long assumeRoleFor; 

            /**
             * RoleType.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * Rolearn.
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            /**
             * AssumeRoleFor.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
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
             * 标签键。
             * <p>
             * 
             * > 为提高兼容性，建议您尽量使用Tag.N.Key参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例、云盘和主网卡的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`acs:`开头，不能包含`http://`或者`https://`。
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
