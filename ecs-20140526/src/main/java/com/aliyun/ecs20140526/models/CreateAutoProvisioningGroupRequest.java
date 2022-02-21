// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoProvisioningGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoProvisioningGroupRequest</p>
 */
public class CreateAutoProvisioningGroupRequest extends Request {
    @NameInMap("LaunchConfiguration")
    private LaunchConfiguration launchConfiguration;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("LaunchTemplateConfig")
    private java.util.List < LaunchTemplateConfig> launchTemplateConfig;

    @Query
    @NameInMap("SystemDiskConfig")
    private java.util.List < SystemDiskConfig> systemDiskConfig;

    @Query
    @NameInMap("DataDiskConfig")
    private java.util.List < DataDiskConfig> dataDiskConfig;

    @Query
    @NameInMap("SpotInstanceInterruptionBehavior")
    private String spotInstanceInterruptionBehavior;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @Query
    @NameInMap("MaxSpotPrice")
    private Float maxSpotPrice;

    @Query
    @NameInMap("SpotTargetCapacity")
    private String spotTargetCapacity;

    @Query
    @NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("SpotAllocationStrategy")
    private String spotAllocationStrategy;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("TerminateInstancesWithExpiration")
    private Boolean terminateInstancesWithExpiration;

    @Query
    @NameInMap("ValidUntil")
    private String validUntil;

    @Query
    @NameInMap("ExcessCapacityTerminationPolicy")
    private String excessCapacityTerminationPolicy;

    @Query
    @NameInMap("SpotInstancePoolsToUseCount")
    private Integer spotInstancePoolsToUseCount;

    @Query
    @NameInMap("MinTargetCapacity")
    private String minTargetCapacity;

    @Query
    @NameInMap("PayAsYouGoTargetCapacity")
    private String payAsYouGoTargetCapacity;

    @Query
    @NameInMap("ValidFrom")
    private String validFrom;

    @Query
    @NameInMap("TotalTargetCapacity")
    private String totalTargetCapacity;

    @Query
    @NameInMap("PayAsYouGoAllocationStrategy")
    private String payAsYouGoAllocationStrategy;

    @Query
    @NameInMap("TerminateInstances")
    private Boolean terminateInstances;

    @Query
    @NameInMap("AutoProvisioningGroupType")
    private String autoProvisioningGroupType;

    private CreateAutoProvisioningGroupRequest(Builder builder) {
        super(builder);
        this.launchConfiguration = builder.launchConfiguration;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.launchTemplateConfig = builder.launchTemplateConfig;
        this.systemDiskConfig = builder.systemDiskConfig;
        this.dataDiskConfig = builder.dataDiskConfig;
        this.spotInstanceInterruptionBehavior = builder.spotInstanceInterruptionBehavior;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.maxSpotPrice = builder.maxSpotPrice;
        this.spotTargetCapacity = builder.spotTargetCapacity;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.spotAllocationStrategy = builder.spotAllocationStrategy;
        this.launchTemplateId = builder.launchTemplateId;
        this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
        this.validUntil = builder.validUntil;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
        this.spotInstancePoolsToUseCount = builder.spotInstancePoolsToUseCount;
        this.minTargetCapacity = builder.minTargetCapacity;
        this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
        this.validFrom = builder.validFrom;
        this.totalTargetCapacity = builder.totalTargetCapacity;
        this.payAsYouGoAllocationStrategy = builder.payAsYouGoAllocationStrategy;
        this.terminateInstances = builder.terminateInstances;
        this.autoProvisioningGroupType = builder.autoProvisioningGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoProvisioningGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return launchConfiguration
     */
    public LaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return launchTemplateConfig
     */
    public java.util.List < LaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * @return systemDiskConfig
     */
    public java.util.List < SystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    /**
     * @return dataDiskConfig
     */
    public java.util.List < DataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    /**
     * @return spotInstanceInterruptionBehavior
     */
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return maxSpotPrice
     */
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    /**
     * @return spotTargetCapacity
     */
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return spotAllocationStrategy
     */
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return terminateInstancesWithExpiration
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * @return validUntil
     */
    public String getValidUntil() {
        return this.validUntil;
    }

    /**
     * @return excessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * @return spotInstancePoolsToUseCount
     */
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    /**
     * @return minTargetCapacity
     */
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    /**
     * @return payAsYouGoTargetCapacity
     */
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    /**
     * @return validFrom
     */
    public String getValidFrom() {
        return this.validFrom;
    }

    /**
     * @return totalTargetCapacity
     */
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * @return payAsYouGoAllocationStrategy
     */
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    /**
     * @return terminateInstances
     */
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * @return autoProvisioningGroupType
     */
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    public static final class Builder extends Request.Builder<CreateAutoProvisioningGroupRequest, Builder> {
        private LaunchConfiguration launchConfiguration; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 
        private java.util.List < SystemDiskConfig> systemDiskConfig; 
        private java.util.List < DataDiskConfig> dataDiskConfig; 
        private String spotInstanceInterruptionBehavior; 
        private String regionId; 
        private String resourceGroupId; 
        private String autoProvisioningGroupName; 
        private Float maxSpotPrice; 
        private String spotTargetCapacity; 
        private String defaultTargetCapacityType; 
        private String launchTemplateVersion; 
        private String description; 
        private String clientToken; 
        private String spotAllocationStrategy; 
        private String launchTemplateId; 
        private Boolean terminateInstancesWithExpiration; 
        private String validUntil; 
        private String excessCapacityTerminationPolicy; 
        private Integer spotInstancePoolsToUseCount; 
        private String minTargetCapacity; 
        private String payAsYouGoTargetCapacity; 
        private String validFrom; 
        private String totalTargetCapacity; 
        private String payAsYouGoAllocationStrategy; 
        private Boolean terminateInstances; 
        private String autoProvisioningGroupType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoProvisioningGroupRequest response) {
            super(response);
            this.launchConfiguration = response.launchConfiguration;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerAccount = response.ownerAccount;
            this.launchTemplateConfig = response.launchTemplateConfig;
            this.systemDiskConfig = response.systemDiskConfig;
            this.dataDiskConfig = response.dataDiskConfig;
            this.spotInstanceInterruptionBehavior = response.spotInstanceInterruptionBehavior;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.autoProvisioningGroupName = response.autoProvisioningGroupName;
            this.maxSpotPrice = response.maxSpotPrice;
            this.spotTargetCapacity = response.spotTargetCapacity;
            this.defaultTargetCapacityType = response.defaultTargetCapacityType;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.description = response.description;
            this.clientToken = response.clientToken;
            this.spotAllocationStrategy = response.spotAllocationStrategy;
            this.launchTemplateId = response.launchTemplateId;
            this.terminateInstancesWithExpiration = response.terminateInstancesWithExpiration;
            this.validUntil = response.validUntil;
            this.excessCapacityTerminationPolicy = response.excessCapacityTerminationPolicy;
            this.spotInstancePoolsToUseCount = response.spotInstancePoolsToUseCount;
            this.minTargetCapacity = response.minTargetCapacity;
            this.payAsYouGoTargetCapacity = response.payAsYouGoTargetCapacity;
            this.validFrom = response.validFrom;
            this.totalTargetCapacity = response.totalTargetCapacity;
            this.payAsYouGoAllocationStrategy = response.payAsYouGoAllocationStrategy;
            this.terminateInstances = response.terminateInstances;
            this.autoProvisioningGroupType = response.autoProvisioningGroupType;
        } 

        /**
         * LaunchConfiguration.
         */
        public Builder launchConfiguration(LaunchConfiguration launchConfiguration) {
            this.launchConfiguration = launchConfiguration;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * LaunchTemplateConfig.
         */
        public Builder launchTemplateConfig(java.util.List < LaunchTemplateConfig> launchTemplateConfig) {
            this.putQueryParameter("LaunchTemplateConfig", launchTemplateConfig);
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * SystemDiskConfig.
         */
        public Builder systemDiskConfig(java.util.List < SystemDiskConfig> systemDiskConfig) {
            this.putQueryParameter("SystemDiskConfig", systemDiskConfig);
            this.systemDiskConfig = systemDiskConfig;
            return this;
        }

        /**
         * DataDiskConfig.
         */
        public Builder dataDiskConfig(java.util.List < DataDiskConfig> dataDiskConfig) {
            this.putQueryParameter("DataDiskConfig", dataDiskConfig);
            this.dataDiskConfig = dataDiskConfig;
            return this;
        }

        /**
         * SpotInstanceInterruptionBehavior.
         */
        public Builder spotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
            this.putQueryParameter("SpotInstanceInterruptionBehavior", spotInstanceInterruptionBehavior);
            this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
            return this;
        }

        /**
         * The ID of the region where the auto provisioning Group is located. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list of Alibaba Cloud.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the auto provisioning group belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the auto provisioning group. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * The highest price for preemptible instances in the auto provisioning group.
         * <p>
         * 
         * > When "MaxSpotPrice" and "LaunchTemplateConfig.N.MaxPrice" are set at the same time, the minimum value is used.
         */
        public Builder maxSpotPrice(Float maxSpotPrice) {
            this.putQueryParameter("MaxSpotPrice", maxSpotPrice);
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }

        /**
         * The target capacity of preemptible instances in the auto provisioning group. Value range: parameter value less than "TotalTargetCapacity"
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * If the sum of "PayAsYouGoTargetCapacity" and "SpotTargetCapacity" is smaller than "TotalTargetCapacity", the billing method of the difference capacity is specified. Valid values:
         * <p>
         * 
         * -PayAsYouGo: pay-as-you-go instance
         * -Spot: preemptible instance
         * 
         * Default value: Spot
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * The version of the instance launch template associated with the auto provisioning group. You can call [DescribeLaunchTemplateVersions](~~ 73761 ~~) to query the available instance launch template versions.
         * <p>
         * 
         * Default value: the default version of the launch template.
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The description of the auto provisioning group.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. The ClientToken can contain only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The policy used to create preemptible instances. Valid values:
         * <p>
         * 
         * -lowest-price: the cost optimization policy. Select the instance type with the lowest price.
         * 
         * -diversified: the distribution strategy of the balanced zone. Create instances in the zones specified by the extended launch template and distribute them evenly to each zone.
         * 
         * -capacity-optimized: the capacity optimization distribution policy. Select the optimal instance type and zone based on the inventory.
         * 
         * Default value: lowest-price
         */
        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            this.putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * The ID of the instance launch template associated with the auto provisioning group. You can call [DescribeLaunchTemplates](~~ 73759 ~~) to query available instance launch templates. When both the launch template and the launch configuration ("LaunchConfiguration.* ") are specified, the launch template is preferentially used.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * Specifies whether to release instances in the auto provisioning group upon expiration. Valid values:
         * <p>
         * 
         * -true: Releases instances in the group.
         * -false: only instances in the group are removed from the auto provisioning group.
         * 
         * Default value: false
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * The expiration time of the auto provisioning group. The validity period is determined together with "ValidFrom.
         * <p>
         * 
         * The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         * 
         * Default value: 2099-12-31 T23:59:59Z
         */
        public Builder validUntil(String validUntil) {
            this.putQueryParameter("ValidUntil", validUntil);
            this.validUntil = validUntil;
            return this;
        }

        /**
         * Whether to release the scale-in instance when the real-time capacity of the auto provisioning group exceeds the target capacity and the scale-in is triggered. Valid values:
         * <p>
         * 
         * -termination: releases the scaled-In instance.
         * -no-termination: only the scaled-in instances are removed from the auto provisioning group.
         * 
         * Default value: no-termination
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * This parameter takes effect when "SpotAllocationStrategy" is set to "lowest-price", indicating that the auto provisioning group selects the instance type with the lowest price to create the number of instances.
         * <p>
         * 
         * Valid values: less than N in launchtemplateconfig.
         */
        public Builder spotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
            this.putQueryParameter("SpotInstancePoolsToUseCount", spotInstancePoolsToUseCount);
            this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
            return this;
        }

        /**
         * The minimum capacity of the auto provisioning group. Valid values: positive integer.
         * <p>
         * 
         * After you set this parameter, note that:
         * -This parameter takes effect only when you create an auto provisioning Group of the one-time synchronous delivery type ("AutoProvisioningGroupType = instant").
         * -If the instance inventory in the current region is less than the value of this parameter, the API call fails and no instance is created.
         * -If the instance inventory in the current region is greater than this parameter value, the instance is created based on other parameter values that have been set.
         */
        public Builder minTargetCapacity(String minTargetCapacity) {
            this.putQueryParameter("MinTargetCapacity", minTargetCapacity);
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }

        /**
         * The target capacity of pay-as-you-go instances in the auto provisioning group. Value range: parameter value less than "TotalTargetCapacity"
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * The start time of the auto provisioning group and the "ValidUntil" determine the validity period.
         * <p>
         * 
         * The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
         * 
         * Default value: takes effect immediately
         */
        public Builder validFrom(String validFrom) {
            this.putQueryParameter("ValidFrom", validFrom);
            this.validFrom = validFrom;
            return this;
        }

        /**
         * The total capacity of the auto provisioning group. Value range: positive integer
         * <p>
         * 
         * The total capacity must be greater than or equal to the sum of the values of "PayAsYouGoTargetCapacity" and "SpotTargetCapacity.
         */
        public Builder totalTargetCapacity(String totalTargetCapacity) {
            this.putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * Create quantity pay instance strategy. Valid values:
         * <p>
         * 
         * -lowest-price: the cost optimization policy. Select the instance type with the lowest price.
         * 
         * -prioritized: the priority policy. Create an instance based on the priority set by "LaunchTemplateConfig.N.Priority.
         * 
         * Default value: lowest-price
         */
        public Builder payAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
            this.putQueryParameter("PayAsYouGoAllocationStrategy", payAsYouGoAllocationStrategy);
            this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
            return this;
        }

        /**
         * Specifies whether to release instances in an auto provisioning group. Valid values:
         * <p>
         * 
         * -true: Releases instances in the group.
         * -false: the instances in the group are retained.
         * 
         * Default value: false
         */
        public Builder terminateInstances(Boolean terminateInstances) {
            this.putQueryParameter("TerminateInstances", terminateInstances);
            this.terminateInstances = terminateInstances;
            return this;
        }

        /**
         * The delivery type of the auto provisioning group. Valid values:
         * <p>
         * 
         * -request: one-time asynchronous delivery. The provisioning group delivers the instance cluster asynchronously only at startup and does not retry after scheduling fails.
         * 
         * -instant: one-time synchronous delivery. The provisioning group creates instances synchronously only at startup, and returns the list of successfully created instances and the cause of creation failure in the request response.
         * 
         * -maintain: continuous supply. The provisioning group attempts to deliver the instance cluster at startup and monitors the real-time capacity. If the target capacity is not reached, it attempts to continue creating ECS instances.
         * 
         * Default value: maintain
         */
        public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
            this.putQueryParameter("AutoProvisioningGroupType", autoProvisioningGroupType);
            this.autoProvisioningGroupType = autoProvisioningGroupType;
            return this;
        }

        @Override
        public CreateAutoProvisioningGroupRequest build() {
            return new CreateAutoProvisioningGroupRequest(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("KmsKeyId")
        private String kmsKeyId;

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

        @NameInMap("Encrypted")
        private Boolean encrypted;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.kmsKeyId = builder.kmsKeyId;
            this.description = builder.description;
            this.snapshotId = builder.snapshotId;
            this.size = builder.size;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
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
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
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
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public static final class Builder {
            private String performanceLevel; 
            private String kmsKeyId; 
            private String description; 
            private String snapshotId; 
            private Integer size; 
            private String device; 
            private String diskName; 
            private String category; 
            private Boolean deleteWithInstance; 
            private Boolean encrypted; 

            /**
             * 创建ESSD云盘作为数据盘使用时，设置云盘的性能等级。N的取值必须和`LaunchConfiguration.DataDisk.N.Category`中的N保持一致。取值范围：
             * <p>
             * 
             * - PL0：单盘最高随机读写IOPS 1万
             * - PL1（默认）：单盘最高随机读写IOPS 5万
             * - PL2：单盘最高随机读写IOPS 10万
             * - PL3：单盘最高随机读写IOPS 100万
             * 
             * 有关如何选择ESSD性能等级，请参见[ESSD云盘](~~122389~~)。
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 数据盘对应的KMS密钥ID。同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * 数据盘的描述。长度为2~256个英文或中文字符，不能以`http://`和`https://`开头。同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建数据盘N使用的快照。N的取值范围为1~16。
             * <p>
             * 
             * 指定该参数后，参数`LaunchConfiguration.DataDisk.N.Size`会被忽略，实际创建的云盘大小为指定的快照的大小。不能使用早于2013年7月15日（含）创建的快照，请求会报错被拒绝。
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * 第N个数据盘的容量大小，N的取值范围为1~16，单位为GiB。取值范围：
             * <p>
             * 
             * - cloud_efficiency：20~32768
             * - cloud_ssd：20~32768
             * - cloud_essd：20~32768
             * - cloud：5~2000
             * 
             * > 该参数的取值必须大于等于参数`LaunchConfiguration.DataDisk.N.SnapshotId`指定的快照的大小。
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 数据盘的挂载点。同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 数据盘名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以`http://`和`https://`开头。可以包含数字、半角句号（.）、半角冒号（:）、下划线（_）或者短划线（-）。
             * <p>
             * 
             * 默认值：空
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * 数据盘N的云盘类型。N的取值范围为1~16。取值范围：
             * <p>
             * 
             * - cloud_efficiency：高效云盘
             * - cloud_ssd：SSD云盘
             * - cloud_essd：ESSD云盘
             * - cloud：普通云盘。
             * 
             * 对于I/O优化实例，默认值为cloud_efficiency。对于非I/O优化实例，默认值为cloud。
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 数据盘是否随实例释放。取值范围：
             * <p>
             * - true：数据盘随实例释放。
             * - false：数据盘不随实例释放。
             * 
             * 默认值：true
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * 数据盘N是否加密。取值范围：
             * <p>
             * 
             * - true：加密
             * - false：不加密
             * 
             * 默认值：false
             * 
             * 同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
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
             * 实例的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含`http://`或`https://`。同时指定启动模板与启动配置信息时，优先使用启动模板。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含`http://`或者`https://`。同时指定启动模板与启动配置信息时，优先使用启动模板。
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
    public static class LaunchConfiguration extends TeaModel {
        @NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @NameInMap("CreditSpecification")
        private String creditSpecification;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("HostNames")
        private java.util.List < String > hostNames;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("SystemDiskName")
        private String systemDiskName;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        private LaunchConfiguration(Builder builder) {
            this.dataDisk = builder.dataDisk;
            this.tag = builder.tag;
            this.securityGroupId = builder.securityGroupId;
            this.instanceDescription = builder.instanceDescription;
            this.ramRoleName = builder.ramRoleName;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.systemDiskDescription = builder.systemDiskDescription;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.passwordInherit = builder.passwordInherit;
            this.creditSpecification = builder.creditSpecification;
            this.resourceGroupId = builder.resourceGroupId;
            this.deploymentSetId = builder.deploymentSetId;
            this.instanceName = builder.instanceName;
            this.hostNames = builder.hostNames;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.imageId = builder.imageId;
            this.ioOptimized = builder.ioOptimized;
            this.systemDiskName = builder.systemDiskName;
            this.userData = builder.userData;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.keyPairName = builder.keyPairName;
            this.hostName = builder.hostName;
            this.systemDiskSize = builder.systemDiskSize;
            this.internetChargeType = builder.internetChargeType;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchConfiguration create() {
            return builder().build();
        }

        /**
         * @return dataDisk
         */
        public java.util.List < DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return systemDiskDescription
         */
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return passwordInherit
         */
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        /**
         * @return creditSpecification
         */
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return hostNames
         */
        public java.util.List < String > getHostNames() {
            return this.hostNames;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return systemDiskName
         */
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public static final class Builder {
            private java.util.List < DataDisk> dataDisk; 
            private java.util.List < Tag> tag; 
            private String securityGroupId; 
            private String instanceDescription; 
            private String ramRoleName; 
            private String securityEnhancementStrategy; 
            private String systemDiskDescription; 
            private String systemDiskCategory; 
            private Boolean passwordInherit; 
            private String creditSpecification; 
            private String resourceGroupId; 
            private String deploymentSetId; 
            private String instanceName; 
            private java.util.List < String > hostNames; 
            private Integer internetMaxBandwidthOut; 
            private String imageId; 
            private String ioOptimized; 
            private String systemDiskName; 
            private String userData; 
            private Integer internetMaxBandwidthIn; 
            private String keyPairName; 
            private String hostName; 
            private Integer systemDiskSize; 
            private String internetChargeType; 
            private String systemDiskPerformanceLevel; 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The ID of the security group to which the instance belongs. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The description of the instance. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The name of the instance RAM role. You can use the RAM API [ListRoles](~~ 28713 ~~) to query the created instance RAM role. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * Specifies whether to enable security hardening. Valid values:
             * <p>
             * 
             * -Active: enables security hardening, which takes effect only for public images.
             * -Deactive: does not enable security hardening and takes effect for all image types.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The description of the system disk. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
             * <p>
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * The type of the system disk. Valid values:
             * <p>
             * 
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * -cloud_essd:ESSD
             * -cloud: basic cloud disk
             * 
             * For phased-out instance types and non-I/O optimized instances, the default value is cloud. Otherwise, the default value is cloud_efficiency.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * Specifies whether to use the default password of the image. Valid values:
             * <p>
             * 
             * -true: use
             * -false: Do not use
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * Modify the running mode of a burstable instance. Valid values:
             * <p>
             * 
             * -Standard: Standard mode. For more information about instance performance, see performance constraint mode in [What is burstable instance](~~ 59977 ~~).
             * -Unlimited: Unlimited Mode. For more information about instance performance, see Unlimited mode in [What is burstable instance](~~ 59977 ~~).
             * 
             * Default value: None
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http://" or "https. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The default value is the instanceid" of the instance ".
             * <p>
             * 
             * When you create multiple ECS instances, you can set multiple instance names in batches. For more information, see [batch set ordered instance names or host names](~~ 196048 ~~).
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Specify different host names for one or more instances. Limits:
             * <p>
             * 
             * -This parameter takes effect only when you create an auto provisioning Group of the one-time synchronous delivery type ("AutoProvisioningGroupType = instant").
             * -N indicates the number of instances. Valid values: 1 to 1000. The value must be the same as that of the TotalTargetCapacity parameter.
             * -Periods (.) and hyphens (-) cannot be used as start and end characters, and cannot be used consecutively.
             * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
             * -Other types of instances (such as Linux): The name must be 2 to 64 characters in length and can contain multiple periods (.), half end (.) each segment can contain uppercase and lowercase letters, digits, and hyphens (-).
             * -You cannot set "LaunchConfiguration.HostName" and "LaunchConfiguration.HostNames. **At the same time. Otherwise, an error message is returned.
             * -When you specify both the startup template and startup configuration information, the startup template is used first.
             */
            public Builder hostNames(java.util.List < String > hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
             * <p>
             * 
             * Default value: 0.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The ID of the image. You can call [DescribeImages](~~ 25534 ~~) to query available image resources. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Indicates whether the instance is I/O optimized. Valid values:
             * <p>
             * 
             * -none: Non-I/O optimized
             * -optimized:I/O optimized
             * 
             * The default value of phased-out instance types is none. The default value of other instance types is optimized.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * System disk name. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, periods (.), colons (:), underscores (_), and hyphens (-).
             * <p>
             * 
             * Default value: Null.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * The user data of the instance. It must be encoded in Base64. the maximum size of raw data is 16KB. When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * -When the Internet outbound bandwidth is less than or equal to 10Mbit/s: 1 to 10, the default value is 10.
             * -When the outbound bandwidth of the public network is greater than 10Mbit/s: 1 to "LaunchConfiguration.InternetMaxBandwidthOut". The default value is "LaunchConfiguration.InternetMaxBandwidthOut.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The name of the key pair.
             * <p>
             * 
             * -Windows the instance. Ignore this parameter. The default value is null.
             * -The password logon method for Linux instances is initialized to disable.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The name of the instance. Limits:
             * <p>
             * 
             * -Periods (.) and hyphens (-) cannot be used as start and end characters, and cannot be used consecutively.
             * -Windows instance: the name must be 2 to 15 characters in length and cannot contain periods (.). It can contain uppercase and lowercase letters, digits, and hyphens (-).
             * -Other types of instances (such as Linux): The name must be 2 to 64 characters in length and can contain multiple periods (.), A segment can contain uppercase and lowercase letters, digits, and hyphens (-).
             * -You cannot set "LaunchConfiguration.HostName" and "LaunchConfiguration.HostNames. **At the same time. Otherwise, an error message is returned.
             * -When you specify both the startup template and startup configuration information, the startup template is used first.
             * 
             * 
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * System disk size. The unit is GiB. Valid values: 20 to 500. The value of this parameter must be greater than or equal to max{20, LaunchConfiguration.ImageId image size}.
             * <p>
             * 
             * Default value: max{40. The image size corresponding to the parameter LaunchConfiguration.ImageId}.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The billing method of the network. Valid values:
             * <p>
             * 
             * -PayByBandwidth: pay-by-bandwidth
             * -PayByTraffic: pay by traffic
             * 
             * > The peak inbound and outbound bandwidth in pay-by-traffic mode is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the pay-by-bandwidth billing method.
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * When you create an ESSD as a system disk, set the performance level of the disk. Valid values:
             * <p>
             * 
             * -PL0 (default): The maximum random read/write IOPS per disk is 10,000.
             * -PL1: The maximum random read/write IOPS per disk is 50,000
             * -PL2: The maximum random read/write IOPS per disk is 100,000
             * -PL3: The maximum random read/write IOPS per disk is 1 million
             * 
             * For more information about how to select an ESSD performance level, see [ESSD cloud disk](~~ 122389 ~~).
             * 
             * When you specify both the launch template and the launch configuration, the launch template is used first.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            public LaunchConfiguration build() {
                return new LaunchConfiguration(this);
            } 

        } 

    }
    public static class LaunchTemplateConfig extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("MaxPrice")
        private Double maxPrice;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("WeightedCapacity")
        private Double weightedCapacity;

        private LaunchTemplateConfig(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.maxPrice = builder.maxPrice;
            this.priority = builder.priority;
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfig create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return maxPrice
         */
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
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
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String vSwitchId; 
            private Double maxPrice; 
            private Integer priority; 
            private String instanceType; 
            private Double weightedCapacity; 

            /**
             * 扩展启动模板中，ECS实例加入的虚拟交换机的ID。扩展模板中启动的ECS实例的可用区由虚拟交换机决定。
             * <p>
             * 
             * > 设置了`LaunchTemplateConfig`后，`LaunchTemplateConfig.N.VSwitchId`为必选参数。
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 扩展启动模板中，抢占式实例的价格上限。
             * <p>
             * 
             * > 设置了`LaunchTemplateConfig`后，`LaunchTemplateConfig.N.MaxPrice`为必选参数。
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * 扩展启动模板的优先级，取值为0时优先级最高。取值范围：0 ~ +∞
             * <p>
             * 
             * 
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * 扩展启动模板对应的实例规格，N的取值范围：1~20。取值范围：请参见[实例规格族](~~25378~~)。
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 扩展启动模板中，实例规格的权重。取值越高，单台实例满足计算力需求的能力越大，所需的实例数量越小。取值范围：大于0
             * <p>
             * 
             * 您可以根据指定实例规格的计算力和集群单节点最低计算力得出权重值。假设单节点最低计算力为8 vCPU、60GiB，则：
             * 
             * - 8 vCPU、60GiB的实例规格权重可以设置为1
             * - 16 vCPU、120GiB的实例规格权重可以设置为2
             */
            public Builder weightedCapacity(Double weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateConfig build() {
                return new LaunchTemplateConfig(this);
            } 

        } 

    }
    public static class SystemDiskConfig extends TeaModel {
        @NameInMap("DiskCategory")
        private String diskCategory;

        private SystemDiskConfig(Builder builder) {
            this.diskCategory = builder.diskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskConfig create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public static final class Builder {
            private String diskCategory; 

            /**
             * 实例系统盘类型。您可通过该参数指定多种候选磁盘类型，指定顺序作为各磁盘类型的优先级顺序，当某一种磁盘不可用时，自动更换磁盘类型。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：高效云盘
             * -   cloud_ssd：SSD云盘
             * -   cloud_essd：ESSD云盘
             * -   cloud：普通云盘
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            public SystemDiskConfig build() {
                return new SystemDiskConfig(this);
            } 

        } 

    }
    public static class DataDiskConfig extends TeaModel {
        @NameInMap("DiskCategory")
        private String diskCategory;

        private DataDiskConfig(Builder builder) {
            this.diskCategory = builder.diskCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskConfig create() {
            return builder().build();
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public static final class Builder {
            private String diskCategory; 

            /**
             * 实例数据盘类型。您可通过该参数指定多种候选磁盘类型，指定顺序作为各磁盘类型的优先级顺序，当某一种磁盘不可用时，自动更换磁盘类型。取值范围：
             * <p>
             * 
             * -   cloud_efficiency：高效云盘
             * -   cloud_ssd：SSD云盘
             * -   cloud_essd：ESSD云盘
             * -   cloud：普通云盘
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            public DataDiskConfig build() {
                return new DataDiskConfig(this);
            } 

        } 

    }
}
