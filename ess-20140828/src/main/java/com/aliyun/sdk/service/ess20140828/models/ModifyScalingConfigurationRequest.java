// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingConfigurationRequest</p>
 */
public class ModifyScalingConfigurationRequest extends Request {
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
    @NameInMap("Affinity")
    private String affinity;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @Query
    @NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("ImageFamily")
    private String imageFamily;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstancePatternInfo")
    private java.util.List < InstancePatternInfo> instancePatternInfo;

    @Query
    @NameInMap("InstanceTypeOverride")
    private java.util.List < InstanceTypeOverride> instanceTypeOverride;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("IoOptimized")
    private String ioOptimized;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("LoadBalancerWeight")
    private Integer loadBalancerWeight;

    @Query
    @NameInMap("Memory")
    private Integer memory;

    @Query
    @NameInMap("Override")
    private Boolean override;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingConfigurationId")
    @Validation(required = true)
    private String scalingConfigurationId;

    @Query
    @NameInMap("ScalingConfigurationName")
    private String scalingConfigurationName;

    @Query
    @NameInMap("SchedulerOptions")
    private java.util.Map < String, ? > schedulerOptions;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("SpotDuration")
    private Integer spotDuration;

    @Query
    @NameInMap("SpotInterruptionBehavior")
    private String spotInterruptionBehavior;

    @Query
    @NameInMap("SpotPriceLimit")
    private java.util.List < SpotPriceLimit> spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("SystemDiskCategories")
    private java.util.List < String > systemDiskCategories;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Tenancy")
    private String tenancy;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ModifyScalingConfigurationRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.systemDisk = builder.systemDisk;
        this.affinity = builder.affinity;
        this.cpu = builder.cpu;
        this.creditSpecification = builder.creditSpecification;
        this.dataDisk = builder.dataDisk;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.deploymentSetId = builder.deploymentSetId;
        this.hostName = builder.hostName;
        this.hpcClusterId = builder.hpcClusterId;
        this.imageFamily = builder.imageFamily;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.instancePatternInfo = builder.instancePatternInfo;
        this.instanceTypeOverride = builder.instanceTypeOverride;
        this.instanceTypes = builder.instanceTypes;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.keyPairName = builder.keyPairName;
        this.loadBalancerWeight = builder.loadBalancerWeight;
        this.memory = builder.memory;
        this.override = builder.override;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passwordInherit = builder.passwordInherit;
        this.ramRoleName = builder.ramRoleName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingConfigurationId = builder.scalingConfigurationId;
        this.scalingConfigurationName = builder.scalingConfigurationName;
        this.schedulerOptions = builder.schedulerOptions;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.spotDuration = builder.spotDuration;
        this.spotInterruptionBehavior = builder.spotInterruptionBehavior;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.systemDiskCategories = builder.systemDiskCategories;
        this.tags = builder.tags;
        this.tenancy = builder.tenancy;
        this.userData = builder.userData;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return affinity
     */
    public String getAffinity() {
        return this.affinity;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return imageFamily
     */
    public String getImageFamily() {
        return this.imageFamily;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instancePatternInfo
     */
    public java.util.List < InstancePatternInfo> getInstancePatternInfo() {
        return this.instancePatternInfo;
    }

    /**
     * @return instanceTypeOverride
     */
    public java.util.List < InstanceTypeOverride> getInstanceTypeOverride() {
        return this.instanceTypeOverride;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return loadBalancerWeight
     */
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return override
     */
    public Boolean getOverride() {
        return this.override;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    /**
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    /**
     * @return schedulerOptions
     */
    public java.util.Map < String, ? > getSchedulerOptions() {
        return this.schedulerOptions;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotInterruptionBehavior
     */
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    /**
     * @return spotPriceLimit
     */
    public java.util.List < SpotPriceLimit> getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDiskCategories
     */
    public java.util.List < String > getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return tenancy
     */
    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ModifyScalingConfigurationRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private SystemDisk systemDisk; 
        private String affinity; 
        private Integer cpu; 
        private String creditSpecification; 
        private java.util.List < DataDisk> dataDisk; 
        private String dedicatedHostId; 
        private String deploymentSetId; 
        private String hostName; 
        private String hpcClusterId; 
        private String imageFamily; 
        private String imageId; 
        private String imageName; 
        private String instanceDescription; 
        private String instanceName; 
        private java.util.List < InstancePatternInfo> instancePatternInfo; 
        private java.util.List < InstanceTypeOverride> instanceTypeOverride; 
        private java.util.List < String > instanceTypes; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private Integer ipv6AddressCount; 
        private String keyPairName; 
        private Integer loadBalancerWeight; 
        private Integer memory; 
        private Boolean override; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean passwordInherit; 
        private String ramRoleName; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String scalingConfigurationId; 
        private String scalingConfigurationName; 
        private java.util.Map < String, ? > schedulerOptions; 
        private String securityGroupId; 
        private java.util.List < String > securityGroupIds; 
        private Integer spotDuration; 
        private String spotInterruptionBehavior; 
        private java.util.List < SpotPriceLimit> spotPriceLimit; 
        private String spotStrategy; 
        private java.util.List < String > systemDiskCategories; 
        private String tags; 
        private String tenancy; 
        private String userData; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingConfigurationRequest response) {
            super(response);
            this.privatePoolOptions = response.privatePoolOptions;
            this.systemDisk = response.systemDisk;
            this.affinity = response.affinity;
            this.cpu = response.cpu;
            this.creditSpecification = response.creditSpecification;
            this.dataDisk = response.dataDisk;
            this.dedicatedHostId = response.dedicatedHostId;
            this.deploymentSetId = response.deploymentSetId;
            this.hostName = response.hostName;
            this.hpcClusterId = response.hpcClusterId;
            this.imageFamily = response.imageFamily;
            this.imageId = response.imageId;
            this.imageName = response.imageName;
            this.instanceDescription = response.instanceDescription;
            this.instanceName = response.instanceName;
            this.instancePatternInfo = response.instancePatternInfo;
            this.instanceTypeOverride = response.instanceTypeOverride;
            this.instanceTypes = response.instanceTypes;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.ioOptimized = response.ioOptimized;
            this.ipv6AddressCount = response.ipv6AddressCount;
            this.keyPairName = response.keyPairName;
            this.loadBalancerWeight = response.loadBalancerWeight;
            this.memory = response.memory;
            this.override = response.override;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.passwordInherit = response.passwordInherit;
            this.ramRoleName = response.ramRoleName;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingConfigurationId = response.scalingConfigurationId;
            this.scalingConfigurationName = response.scalingConfigurationName;
            this.schedulerOptions = response.schedulerOptions;
            this.securityGroupId = response.securityGroupId;
            this.securityGroupIds = response.securityGroupIds;
            this.spotDuration = response.spotDuration;
            this.spotInterruptionBehavior = response.spotInterruptionBehavior;
            this.spotPriceLimit = response.spotPriceLimit;
            this.spotStrategy = response.spotStrategy;
            this.systemDiskCategories = response.systemDiskCategories;
            this.tags = response.tags;
            this.tenancy = response.tenancy;
            this.userData = response.userData;
            this.zoneId = response.zoneId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
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
         * Affinity.
         */
        public Builder affinity(String affinity) {
            this.putQueryParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * CreditSpecification.
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
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
         * DedicatedHostId.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.putQueryParameter("DedicatedHostId", dedicatedHostId);
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }

        /**
         * DeploymentSetId.
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * HpcClusterId.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * ImageFamily.
         */
        public Builder imageFamily(String imageFamily) {
            this.putQueryParameter("ImageFamily", imageFamily);
            this.imageFamily = imageFamily;
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
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstancePatternInfo.
         */
        public Builder instancePatternInfo(java.util.List < InstancePatternInfo> instancePatternInfo) {
            this.putQueryParameter("InstancePatternInfo", instancePatternInfo);
            this.instancePatternInfo = instancePatternInfo;
            return this;
        }

        /**
         * InstanceTypeOverride.
         */
        public Builder instanceTypeOverride(java.util.List < InstanceTypeOverride> instanceTypeOverride) {
            this.putQueryParameter("InstanceTypeOverride", instanceTypeOverride);
            this.instanceTypeOverride = instanceTypeOverride;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * IoOptimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * Ipv6AddressCount.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
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
         * LoadBalancerWeight.
         */
        public Builder loadBalancerWeight(Integer loadBalancerWeight) {
            this.putQueryParameter("LoadBalancerWeight", loadBalancerWeight);
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Override.
         */
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PasswordInherit.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingConfigurationId.
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        /**
         * ScalingConfigurationName.
         */
        public Builder scalingConfigurationName(String scalingConfigurationName) {
            this.putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }

        /**
         * SchedulerOptions.
         */
        public Builder schedulerOptions(java.util.Map < String, ? > schedulerOptions) {
            this.putQueryParameter("SchedulerOptions", schedulerOptions);
            this.schedulerOptions = schedulerOptions;
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
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * SpotDuration.
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * SpotInterruptionBehavior.
         */
        public Builder spotInterruptionBehavior(String spotInterruptionBehavior) {
            this.putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SystemDiskCategories.
         */
        public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
            this.putQueryParameter("SystemDiskCategories", systemDiskCategories);
            this.systemDiskCategories = systemDiskCategories;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Tenancy.
         */
        public Builder tenancy(String tenancy) {
            this.putQueryParameter("Tenancy", tenancy);
            this.tenancy = tenancy;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
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
        public ModifyScalingConfigurationRequest build() {
            return new ModifyScalingConfigurationRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String id; 
            private String matchCriteria; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class SystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.category = builder.category;
            this.description = builder.description;
            this.diskName = builder.diskName;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String category; 
            private String description; 
            private String diskName; 
            private String performanceLevel; 
            private Integer size; 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("Category")
        private String category;

        @NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("Description")
        private String description;

        @NameInMap("Device")
        private String device;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.categories = builder.categories;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private java.util.List < String > categories; 
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private String encrypted; 
            private String KMSKeyId; 
            private String performanceLevel; 
            private Integer size; 
            private String snapshotId; 

            /**
             * AutoSnapshotPolicyId.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    public static class InstancePatternInfo extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Memory")
        private Float memory;

        private InstancePatternInfo(Builder builder) {
            this.cores = builder.cores;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.maxPrice = builder.maxPrice;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatternInfo create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cores; 
            private String instanceFamilyLevel; 
            private Float maxPrice; 
            private Float memory; 

            /**
             * Cores.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * InstanceFamilyLevel.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * MaxPrice.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public InstancePatternInfo build() {
                return new InstancePatternInfo(this);
            } 

        } 

    }
    public static class InstanceTypeOverride extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private InstanceTypeOverride(Builder builder) {
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeOverride create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer weightedCapacity; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public InstanceTypeOverride build() {
                return new InstanceTypeOverride(this);
            } 

        } 

    }
    public static class SpotPriceLimit extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("PriceLimit")
        private Float priceLimit;

        private SpotPriceLimit(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimit create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priceLimit
         */
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float priceLimit; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * PriceLimit.
             */
            public Builder priceLimit(Float priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceLimit build() {
                return new SpotPriceLimit(this);
            } 

        } 

    }
}
