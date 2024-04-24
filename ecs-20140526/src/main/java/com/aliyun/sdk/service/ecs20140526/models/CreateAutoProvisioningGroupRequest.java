// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
    @NameInMap("LaunchConfiguration")
    private LaunchConfiguration launchConfiguration;

    @Query
    @NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @Query
    @NameInMap("AutoProvisioningGroupType")
    private String autoProvisioningGroupType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataDiskConfig")
    private java.util.List < DataDiskConfig> dataDiskConfig;

    @Query
    @NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExcessCapacityTerminationPolicy")
    private String excessCapacityTerminationPolicy;

    @Query
    @NameInMap("HibernationOptionsConfigured")
    private Boolean hibernationOptionsConfigured;

    @Query
    @NameInMap("LaunchTemplateConfig")
    private java.util.List < LaunchTemplateConfig> launchTemplateConfig;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @Query
    @NameInMap("MaxSpotPrice")
    private Float maxSpotPrice;

    @Query
    @NameInMap("MinTargetCapacity")
    private String minTargetCapacity;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayAsYouGoAllocationStrategy")
    private String payAsYouGoAllocationStrategy;

    @Query
    @NameInMap("PayAsYouGoTargetCapacity")
    private String payAsYouGoTargetCapacity;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SpotAllocationStrategy")
    private String spotAllocationStrategy;

    @Query
    @NameInMap("SpotInstanceInterruptionBehavior")
    private String spotInstanceInterruptionBehavior;

    @Query
    @NameInMap("SpotInstancePoolsToUseCount")
    private Integer spotInstancePoolsToUseCount;

    @Query
    @NameInMap("SpotTargetCapacity")
    private String spotTargetCapacity;

    @Query
    @NameInMap("SystemDiskConfig")
    private java.util.List < SystemDiskConfig> systemDiskConfig;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TerminateInstances")
    private Boolean terminateInstances;

    @Query
    @NameInMap("TerminateInstancesWithExpiration")
    private Boolean terminateInstancesWithExpiration;

    @Query
    @NameInMap("TotalTargetCapacity")
    @Validation(required = true)
    private String totalTargetCapacity;

    @Query
    @NameInMap("ValidFrom")
    private String validFrom;

    @Query
    @NameInMap("ValidUntil")
    private String validUntil;

    private CreateAutoProvisioningGroupRequest(Builder builder) {
        super(builder);
        this.launchConfiguration = builder.launchConfiguration;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.autoProvisioningGroupType = builder.autoProvisioningGroupType;
        this.clientToken = builder.clientToken;
        this.dataDiskConfig = builder.dataDiskConfig;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.description = builder.description;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
        this.hibernationOptionsConfigured = builder.hibernationOptionsConfigured;
        this.launchTemplateConfig = builder.launchTemplateConfig;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxSpotPrice = builder.maxSpotPrice;
        this.minTargetCapacity = builder.minTargetCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payAsYouGoAllocationStrategy = builder.payAsYouGoAllocationStrategy;
        this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotAllocationStrategy = builder.spotAllocationStrategy;
        this.spotInstanceInterruptionBehavior = builder.spotInstanceInterruptionBehavior;
        this.spotInstancePoolsToUseCount = builder.spotInstancePoolsToUseCount;
        this.spotTargetCapacity = builder.spotTargetCapacity;
        this.systemDiskConfig = builder.systemDiskConfig;
        this.tag = builder.tag;
        this.terminateInstances = builder.terminateInstances;
        this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
        this.totalTargetCapacity = builder.totalTargetCapacity;
        this.validFrom = builder.validFrom;
        this.validUntil = builder.validUntil;
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
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return autoProvisioningGroupType
     */
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataDiskConfig
     */
    public java.util.List < DataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return excessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * @return hibernationOptionsConfigured
     */
    public Boolean getHibernationOptionsConfigured() {
        return this.hibernationOptionsConfigured;
    }

    /**
     * @return launchTemplateConfig
     */
    public java.util.List < LaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return maxSpotPrice
     */
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    /**
     * @return minTargetCapacity
     */
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
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
     * @return payAsYouGoAllocationStrategy
     */
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    /**
     * @return payAsYouGoTargetCapacity
     */
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
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
     * @return spotAllocationStrategy
     */
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * @return spotInstanceInterruptionBehavior
     */
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    /**
     * @return spotInstancePoolsToUseCount
     */
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    /**
     * @return spotTargetCapacity
     */
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    /**
     * @return systemDiskConfig
     */
    public java.util.List < SystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return terminateInstances
     */
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * @return terminateInstancesWithExpiration
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * @return totalTargetCapacity
     */
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * @return validFrom
     */
    public String getValidFrom() {
        return this.validFrom;
    }

    /**
     * @return validUntil
     */
    public String getValidUntil() {
        return this.validUntil;
    }

    public static final class Builder extends Request.Builder<CreateAutoProvisioningGroupRequest, Builder> {
        private LaunchConfiguration launchConfiguration; 
        private String autoProvisioningGroupName; 
        private String autoProvisioningGroupType; 
        private String clientToken; 
        private java.util.List < DataDiskConfig> dataDiskConfig; 
        private String defaultTargetCapacityType; 
        private String description; 
        private String excessCapacityTerminationPolicy; 
        private Boolean hibernationOptionsConfigured; 
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 
        private String launchTemplateId; 
        private String launchTemplateVersion; 
        private Float maxSpotPrice; 
        private String minTargetCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payAsYouGoAllocationStrategy; 
        private String payAsYouGoTargetCapacity; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spotAllocationStrategy; 
        private String spotInstanceInterruptionBehavior; 
        private Integer spotInstancePoolsToUseCount; 
        private String spotTargetCapacity; 
        private java.util.List < SystemDiskConfig> systemDiskConfig; 
        private java.util.List < Tag> tag; 
        private Boolean terminateInstances; 
        private Boolean terminateInstancesWithExpiration; 
        private String totalTargetCapacity; 
        private String validFrom; 
        private String validUntil; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoProvisioningGroupRequest request) {
            super(request);
            this.launchConfiguration = request.launchConfiguration;
            this.autoProvisioningGroupName = request.autoProvisioningGroupName;
            this.autoProvisioningGroupType = request.autoProvisioningGroupType;
            this.clientToken = request.clientToken;
            this.dataDiskConfig = request.dataDiskConfig;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.description = request.description;
            this.excessCapacityTerminationPolicy = request.excessCapacityTerminationPolicy;
            this.hibernationOptionsConfigured = request.hibernationOptionsConfigured;
            this.launchTemplateConfig = request.launchTemplateConfig;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.maxSpotPrice = request.maxSpotPrice;
            this.minTargetCapacity = request.minTargetCapacity;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payAsYouGoAllocationStrategy = request.payAsYouGoAllocationStrategy;
            this.payAsYouGoTargetCapacity = request.payAsYouGoTargetCapacity;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotAllocationStrategy = request.spotAllocationStrategy;
            this.spotInstanceInterruptionBehavior = request.spotInstanceInterruptionBehavior;
            this.spotInstancePoolsToUseCount = request.spotInstancePoolsToUseCount;
            this.spotTargetCapacity = request.spotTargetCapacity;
            this.systemDiskConfig = request.systemDiskConfig;
            this.tag = request.tag;
            this.terminateInstances = request.terminateInstances;
            this.terminateInstancesWithExpiration = request.terminateInstancesWithExpiration;
            this.totalTargetCapacity = request.totalTargetCapacity;
            this.validFrom = request.validFrom;
            this.validUntil = request.validUntil;
        } 

        /**
         * LaunchConfiguration.
         */
        public Builder launchConfiguration(LaunchConfiguration launchConfiguration) {
            this.putQueryParameter("LaunchConfiguration", launchConfiguration);
            this.launchConfiguration = launchConfiguration;
            return this;
        }

        /**
         * The name of the auto provisioning group. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * The delivery type of the auto provisioning group. Valid values:
         * <p>
         * 
         * *   request: one-time asynchronous delivery. When the auto provisioning group is started, it attempts to asynchronously deliver an instance cluster that meets the target capacity only once. The group does not retry the operation regardless of whether all the instances are delivered.
         * *   instant: one-time synchronous delivery. When the auto provisioning group is started, it attempts to synchronously deliver an instance cluster that meets the target capacity only once. The list of delivered instances and the causes of delivery failures are returned in the response.
         * *   maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver an instance cluster that meets the target capacity, and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.
         * 
         * Default value: maintain.
         */
        public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
            this.putQueryParameter("AutoProvisioningGroupType", autoProvisioningGroupType);
            this.autoProvisioningGroupType = autoProvisioningGroupType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The information of data disks on the instance.
         */
        public Builder dataDiskConfig(java.util.List < DataDiskConfig> dataDiskConfig) {
            this.putQueryParameter("DataDiskConfig", dataDiskConfig);
            this.dataDiskConfig = dataDiskConfig;
            return this;
        }

        /**
         * The type of supplemental instances. When the sum of the `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` values is smaller than the `TotalTargetCapacity` value, the auto provisioning group creates instances of the specified type to meet the total target capacity. Valid values:
         * <p>
         * 
         * *   PayAsYouGo: pay-as-you-go instances
         * *   Spot: preemptible instances.
         * 
         * Default value: Spot.
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
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
         * Specifies whether to release scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:
         * <p>
         * 
         * *   termination: releases the scaled-in instances in the auto provisioning group.
         * *   no-termination: removes the scaled-in instances from the auto provisioning group but does not release them.
         * 
         * Default value: no-termination.
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * >This parameter is in invitational preview and is not publicly available.
         */
        public Builder hibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
            this.putQueryParameter("HibernationOptionsConfigured", hibernationOptionsConfigured);
            this.hibernationOptionsConfigured = hibernationOptionsConfigured;
            return this;
        }

        /**
         * The extended configurations of the launch template.
         */
        public Builder launchTemplateConfig(java.util.List < LaunchTemplateConfig> launchTemplateConfig) {
            this.putQueryParameter("LaunchTemplateConfig", launchTemplateConfig);
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * The ID of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplates](~~73759~~) operation to query available launch templates. When both LaunchTemplateId and `LaunchConfiguration.*` parameters are specified, LaunchTemplateId takes precedence.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * The version of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplateVersions](~~73761~~) operation to query the versions of available launch templates.
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
         * The maximum price of preemptible instances in the auto provisioning group.
         * <p>
         * 
         * >  When both `MaxSpotPrice` and `LaunchTemplateConfig.N.MaxPrice` are specified, the smaller one of the two parameter values is used.
         */
        public Builder maxSpotPrice(Float maxSpotPrice) {
            this.putQueryParameter("MaxSpotPrice", maxSpotPrice);
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }

        /**
         * The minimum target capacity of the auto provisioning group. The value must be a positive integer. When you specify this parameter, take note of the following items:
         * <p>
         * 
         * - This parameter takes effect only when `AutoProvisioningGroupType` is set to instant. 
         * - If the number of instances that can be created in the current region is smaller than the value of this parameter, the operation cannot be called and no instances are created. 
         * - If the number of instances that can be created in the current region is greater than the value of this parameter, instances can be created based on the specified parameters.
         */
        public Builder minTargetCapacity(String minTargetCapacity) {
            this.putQueryParameter("MinTargetCapacity", minTargetCapacity);
            this.minTargetCapacity = minTargetCapacity;
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
         * The policy for creating pay-as-you-go instances. Valid values:
         * <p>
         * 
         * *   lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.
         * *   prioritized: priority-based policy. The auto provisioning group creates instances based on the priority specified by `LaunchTemplateConfig.N.Priority`.
         * 
         * Default value: lowest-price.
         */
        public Builder payAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
            this.putQueryParameter("PayAsYouGoAllocationStrategy", payAsYouGoAllocationStrategy);
            this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
            return this;
        }

        /**
         * The target capacity of pay-as-you-go instances in the auto provisioning group. The value must be less than or equal to the `TotalTargetCapacity` value.
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * The ID of the region in which to create the auto provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the auto provisioning group.
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The policy for creating preemptible instances. Valid values:
         * <p>
         * 
         * *   lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.
         * *   diversified: balanced distribution policy. The auto provisioning group creates instances in zones that are specified in extended configurations and then evenly distributes the instances across the zones.
         * *   capacity-optimized: capacity-optimized distribution policy. The auto provisioning group creates instances of the optimal instance types across the optimal zones based on resource availability.
         * 
         * Default value: lowest-price.
         */
        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            this.putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * The operation to be performed on the preemptible instance when it is interrupted. Valid values:
         * <p>
         * 
         * *   stop: stops the preemptible instance.
         * *   terminate: releases the preemptible instance.
         * 
         * Default value: terminate.
         */
        public Builder spotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
            this.putQueryParameter("SpotInstanceInterruptionBehavior", spotInstanceInterruptionBehavior);
            this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
            return this;
        }

        /**
         * The number of preemptible instances of the lowest-priced instance type to be created by the auto provisioning group. This parameter takes effect when `SpotAllocationStrategy` is set to `lowest-price`.
         * <p>
         * 
         * The value must be smaller than the N value specified in `LaunchTemplateConfig.N`.
         */
        public Builder spotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
            this.putQueryParameter("SpotInstancePoolsToUseCount", spotInstancePoolsToUseCount);
            this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
            return this;
        }

        /**
         * The target capacity of preemptible instances in the auto provisioning group. The value must be less than or equal to the `TotalTargetCapacity` value.
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * The information of system disks on the instance.
         */
        public Builder systemDiskConfig(java.util.List < SystemDiskConfig> systemDiskConfig) {
            this.putQueryParameter("SystemDiskConfig", systemDiskConfig);
            this.systemDiskConfig = systemDiskConfig;
            return this;
        }

        /**
         * The tags to add to the auto provisioning group.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to release instances in the auto provisioning group when the auto provisioning group is deleted. Valid values:
         * <p>
         * 
         * *   true: releases the instances.
         * *   false: retains the instances.
         * 
         * Default value: false.
         */
        public Builder terminateInstances(Boolean terminateInstances) {
            this.putQueryParameter("TerminateInstances", terminateInstances);
            this.terminateInstances = terminateInstances;
            return this;
        }

        /**
         * Specifies whether to release instances in the auto provisioning group when the group expires. Valid values:
         * <p>
         * 
         * *   true: releases the instances.
         * *   false: only removes the instances from the auto provisioning group but does not release them.
         * 
         * Default value: false.
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * The total target capacity of the auto provisioning group. The value must be a positive integer.
         * <p>
         * 
         * The total target capacity of the auto provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by `PayAsYouGoTargetCapacity` and the target capacity of preemptible instances specified by `SpotTargetCapacity`.
         */
        public Builder totalTargetCapacity(String totalTargetCapacity) {
            this.putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * The time at which to start the auto provisioning group. The period of time between this point in time and the point in time specified by `ValidUntil` is the validity period of the auto provisioning group.
         * <p>
         * 
         * Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * By default, an auto provisioning group is started immediately after it is created.
         */
        public Builder validFrom(String validFrom) {
            this.putQueryParameter("ValidFrom", validFrom);
            this.validFrom = validFrom;
            return this;
        }

        /**
         * The time at which the auto provisioning group expires. The period of time between this point in time and the point in time specified by `ValidFrom` is the validity period of the auto provisioning group.
         * <p>
         * 
         * Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * Default value: 2099-12-31T23:59:59Z.
         */
        public Builder validUntil(String validUntil) {
            this.putQueryParameter("ValidUntil", validUntil);
            this.validUntil = validUntil;
            return this;
        }

        @Override
        public CreateAutoProvisioningGroupRequest build() {
            return new CreateAutoProvisioningGroupRequest(this);
        } 

    } 

    public static class Arn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        private Long assumeRoleFor;

        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("Rolearn")
        private String rolearn;

        private Arn(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleType = builder.roleType;
            this.rolearn = builder.rolearn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Arn create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
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

        public static final class Builder {
            private Long assumeRoleFor; 
            private String roleType; 
            private String rolearn; 

            /**
             * This parameter is not publicly available.
             */
            public Builder assumeRoleFor(Long assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder rolearn(String rolearn) {
                this.rolearn = rolearn;
                return this;
            }

            public Arn build() {
                return new Arn(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
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
        private Boolean encrypted;

        @NameInMap("KmsKeyId")
        private String kmsKeyId;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.description = builder.description;
            this.device = builder.device;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.kmsKeyId = builder.kmsKeyId;
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
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
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
            private String category; 
            private Boolean deleteWithInstance; 
            private String description; 
            private String device; 
            private String diskName; 
            private Boolean encrypted; 
            private String kmsKeyId; 
            private String performanceLevel; 
            private Integer size; 
            private String snapshotId; 

            /**
             * The category of data disk N. Valid values of N: 1 to 16. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             * 
             * For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Specifies whether to release data disk N when the instance to which the data disk is attached is released. Valid values:
             * <p>
             * 
             * *   true: releases data disk N when the instance is released.
             * *   false: does not release data disk N when the instance is released.
             * 
             * Default value: true.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The mount point of data disk N. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The name of data disk N. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
             * <p>
             * 
             * This parameter is empty by default.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Specifies whether to encrypt data disk N. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key to use for data disk N. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * The performance level of the enhanced SSD (ESSD) to use as data disk N. The value of N in this parameter must be the same as the value of N in `LaunchConfiguration.DataDisk.N.Category`. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * For information about ESSD performance levels, see [ESSDs](~~122389~~).
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:
             * <p>
             * 
             * *   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
             * 
             * *   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
             * 
             * *   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_essd: depend on the `LaunchConfiguration.DataDisk.N.PerformanceLevel` value.
             * 
             *     *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.
             *     *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
             *     *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
             *     *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
             * 
             * *   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud: 5 to 2000.
             * 
             * >  The value of this parameter must be greater than or equal to the size of the snapshot specified by `LaunchConfiguration.DataDisk.N.SnapshotId`.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.
             * <p>
             * 
             * After this parameter is specified, `LaunchConfiguration.DataDisk.N.Size` is ignored. The size of data disk N is the same as that of the snapshot specified by this parameter. Use snapshots created on or after July 15, 2013. Otherwise, an error is returned and your request is rejected.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
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
    public static class SystemDisk extends TeaModel {
        @NameInMap("EncryptAlgorithm")
        private String encryptAlgorithm;

        @NameInMap("Encrypted")
        private String encrypted;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        private SystemDisk(Builder builder) {
            this.encryptAlgorithm = builder.encryptAlgorithm;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
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
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public static final class Builder {
            private String encryptAlgorithm; 
            private String encrypted; 
            private String KMSKeyId; 

            /**
             * The algorithm to use to encrypt the system disk. Valid values:
             * <p>
             * 
             * *   aes-256
             * *   sm4-128
             * 
             * Default value: aes-256.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder encryptAlgorithm(String encryptAlgorithm) {
                this.encryptAlgorithm = encryptAlgorithm;
                return this;
            }

            /**
             * Specifies whether to encrypt system disk N. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the KMS key to use for the system disk.
             * <p>
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class LaunchConfigurationTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private LaunchConfigurationTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchConfigurationTag create() {
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
             * The key of the tag. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LaunchConfigurationTag build() {
                return new LaunchConfigurationTag(this);
            } 

        } 

    }
    public static class LaunchConfiguration extends TeaModel {
        @NameInMap("Arn")
        private java.util.List < Arn> arn;

        @NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @NameInMap("CreditSpecification")
        private String creditSpecification;

        @NameInMap("DataDisk")
        private java.util.List < DataDisk> dataDisk;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HostNames")
        private java.util.List < String > hostNames;

        @NameInMap("ImageFamily")
        private String imageFamily;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("InternetMaxBandwidthIn")
        private Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("IoOptimized")
        private String ioOptimized;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("Password")
        private String password;

        @NameInMap("PasswordInherit")
        private Boolean passwordInherit;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskDescription")
        private String systemDiskDescription;

        @NameInMap("SystemDiskName")
        private String systemDiskName;

        @NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Tag")
        private java.util.List < LaunchConfigurationTag> tag;

        @NameInMap("UserData")
        private String userData;

        private LaunchConfiguration(Builder builder) {
            this.arn = builder.arn;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.creditSpecification = builder.creditSpecification;
            this.dataDisk = builder.dataDisk;
            this.deploymentSetId = builder.deploymentSetId;
            this.hostName = builder.hostName;
            this.hostNames = builder.hostNames;
            this.imageFamily = builder.imageFamily;
            this.imageId = builder.imageId;
            this.instanceDescription = builder.instanceDescription;
            this.instanceName = builder.instanceName;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.keyPairName = builder.keyPairName;
            this.password = builder.password;
            this.passwordInherit = builder.passwordInherit;
            this.ramRoleName = builder.ramRoleName;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.systemDisk = builder.systemDisk;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskDescription = builder.systemDiskDescription;
            this.systemDiskName = builder.systemDiskName;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
            this.tag = builder.tag;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchConfiguration create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public java.util.List < Arn> getArn() {
            return this.arn;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
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
         * @return hostNames
         */
        public java.util.List < String > getHostNames() {
            return this.hostNames;
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
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
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
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
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
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
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
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskDescription
         */
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        /**
         * @return systemDiskName
         */
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tag
         */
        public java.util.List < LaunchConfigurationTag> getTag() {
            return this.tag;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private java.util.List < Arn> arn; 
            private String autoReleaseTime; 
            private String creditSpecification; 
            private java.util.List < DataDisk> dataDisk; 
            private String deploymentSetId; 
            private String hostName; 
            private java.util.List < String > hostNames; 
            private String imageFamily; 
            private String imageId; 
            private String instanceDescription; 
            private String instanceName; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthIn; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private String keyPairName; 
            private String password; 
            private Boolean passwordInherit; 
            private String ramRoleName; 
            private String resourceGroupId; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private SystemDisk systemDisk; 
            private String systemDiskCategory; 
            private String systemDiskDescription; 
            private String systemDiskName; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 
            private java.util.List < LaunchConfigurationTag> tag; 
            private String userData; 

            /**
             * This parameter is unavailable for public use.
             */
            public Builder arn(java.util.List < Arn> arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The automatic release time of the pay-as-you-go instance. Specify the time in the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in Coordinated Universal Time (UTC).
             * <p>
             * 
             * *   If the value of `ss` is not `00`, the start time is automatically rounded down to the nearest minute based on the value of `mm`.
             * *   The specified time must be at least 30 minutes later than the current time.
             * *   The specified time can be at most three years later than the current time.
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * The performance mode of the burstable instance. Valid values:
             * <p>
             * 
             * *   Standard: the standard mode. For more information, see the "Standard mode" section in the [Overview of burstable instances](~~59977~~) topic.
             * *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in the [Overview of burstable instances](~~59977~~) topic.
             * 
             * This parameter is empty by default.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder creditSpecification(String creditSpecification) {
                this.creditSpecification = creditSpecification;
                return this;
            }

            /**
             * The cloud disks in the extended configurations of the launch template.
             */
            public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
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
             * The instance hostname. Take note of the following items:
             * <p>
             * 
             * *   The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-).
             * *   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
             * *   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
             * *   You cannot specify both `LaunchConfiguration.HostName` and `LaunchConfiguration.HostNames.N`. Otherwise, an error is returned.
             * *   When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances. Take note of the following items:
             * <p>
             * 
             * - This parameter takes effect only when `AutoProvisioningGroupType` is set to instant. 
             * - The value of N indicates the number of instances. Valid values of N: 1 to 1000. The value of N must be the same as the TotalTargetCapacity value. 
             * - The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). 
             * - For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. The hostname can contain letters, digits, and hyphens (-). 
             * - For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). 
             * - You cannot specify both `LaunchConfiguration.HostName` and `LaunchConfiguration.HostNames.N`. Otherwise, an error is returned. 
             * - When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder hostNames(java.util.List < String > hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `aliyun` or `acs:`. The name cannot contain `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * The ID of the image to be used to create the instance. You can call the [DescribeImages](~~25534~~) operation to query available image resources. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The instance description. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with `http://` or `https://`. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The instance name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
             * <p>
             * 
             * The default value of this parameter is the `InstanceId` value.
             * 
             * When you batch create instances, you can batch configure sequential names for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The billing method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth
             * *   PayByTraffic: pay-by-traffic
             * 
             * >  When the pay-by-traffic billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidth instead of guaranteed performance specifications. When demands outstrip resource supplies, the maximum bandwidths may be limited. If you want guaranteed bandwidth for your instance, use the pay-by-bandwidth billing method.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * *   When the maximum outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.
             * *   When the maximum outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of `LaunchConfiguration.InternetMaxBandwidthOut`, and the default value is the value of `LaunchConfiguration.InternetMaxBandwidthOut`.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
             * <p>
             * 
             * Default value: 0.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Specifies whether the instance is I/O optimized. Valid values:
             * <p>
             * 
             * *   none: The instance is not I/O optimized.
             * *   optimized: The instance is I/O optimized.
             * 
             * For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * The key pair name.
             * <p>
             * 
             * *   For Windows instances, this parameter is ignored. This parameter is empty by default.
             * *   By default, password-based logon is disabled for Linux instances.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * The instance password. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password can contain the following special characters:
             * <p>
             * 
             * ``( ) ` ~ ! @ # $ % ^ & * - _ + = | { }  ``: ; \" < > , . ? /``  For Windows instances, the password cannot start with a forward slash (/). When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence. `
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Specifies whether to use the password preset in the image. Valid values:
             * <p>
             * 
             * *   true: uses the password preset in the image.
             * *   false: does not use the password preset in the image.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder passwordInherit(Boolean passwordInherit) {
                this.passwordInherit = passwordInherit;
                return this;
            }

            /**
             * The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the resource group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Specifies whether to enable security hardening. Valid values:
             * <p>
             * 
             * *   Active: enables security hardening. This value is applicable only to public images.
             * *   Deactive: disables security hardening. This value is applicable to all image types.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * The ID of the security group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups to which the new ECS instances belong.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The information of the system disk on the instance. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * The category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: enhanced SSD (ESSD)
             * *   cloud: basic disk
             * 
             * For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with `http://` or `https://`.
             * <p>
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDiskDescription(String systemDiskDescription) {
                this.systemDiskDescription = systemDiskDescription;
                return this;
            }

            /**
             * The name of the system disk. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
             * <p>
             * 
             * This parameter is empty by default.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDiskName(String systemDiskName) {
                this.systemDiskName = systemDiskName;
                return this;
            }

            /**
             * The performance level of the ESSD to be used as the system disk. Valid values:
             * <p>
             * 
             * *   PL0 (default): A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * For more information about ESSD performance levels, see [ESSDs](~~122389~~).
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The size of the system disk. Valid values: 20 to 500. Unit: GiB. The value must be at least 20 and greater than or equal to the size of the image specified by LaunchConfiguration.ImageId.
             * <p>
             * 
             * Default value: 40 or the size of the image specified by LaunchConfiguration.ImageId, whichever is greater.
             * 
             * When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The tag in the extended configurations of the launch template.
             */
            public Builder tag(java.util.List < LaunchConfigurationTag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The instance user data. The user data must be encoded in Base64. The raw data can be up to 16 KB in size. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public LaunchConfiguration build() {
                return new LaunchConfiguration(this);
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
             * The category of data disk N. You can use this parameter to specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:
             * <p>
             * 
             * - cloud_efficiency: ultra disk
             * - cloud_ssd: standard SSD
             * - cloud_essd: ESSD
             * - cloud: basic disk
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
    public static class LaunchTemplateConfig extends TeaModel {
        @NameInMap("Architectures")
        private java.util.List < String > architectures;

        @NameInMap("BurstablePerformance")
        private String burstablePerformance;

        @NameInMap("Cores")
        private java.util.List < Integer > cores;

        @NameInMap("ExcludedInstanceTypes")
        private java.util.List < String > excludedInstanceTypes;

        @NameInMap("InstanceFamilyLevel")
        private String instanceFamilyLevel;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaxPrice")
        private Double maxPrice;

        @NameInMap("MaxQuantity")
        private Integer maxQuantity;

        @NameInMap("Memories")
        private java.util.List < Float > memories;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("WeightedCapacity")
        private Double weightedCapacity;

        private LaunchTemplateConfig(Builder builder) {
            this.architectures = builder.architectures;
            this.burstablePerformance = builder.burstablePerformance;
            this.cores = builder.cores;
            this.excludedInstanceTypes = builder.excludedInstanceTypes;
            this.instanceFamilyLevel = builder.instanceFamilyLevel;
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
            this.maxQuantity = builder.maxQuantity;
            this.memories = builder.memories;
            this.priority = builder.priority;
            this.vSwitchId = builder.vSwitchId;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfig create() {
            return builder().build();
        }

        /**
         * @return architectures
         */
        public java.util.List < String > getArchitectures() {
            return this.architectures;
        }

        /**
         * @return burstablePerformance
         */
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        /**
         * @return cores
         */
        public java.util.List < Integer > getCores() {
            return this.cores;
        }

        /**
         * @return excludedInstanceTypes
         */
        public java.util.List < String > getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        /**
         * @return instanceFamilyLevel
         */
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxPrice
         */
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return maxQuantity
         */
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        /**
         * @return memories
         */
        public java.util.List < Float > getMemories() {
            return this.memories;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return weightedCapacity
         */
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private java.util.List < String > architectures; 
            private String burstablePerformance; 
            private java.util.List < Integer > cores; 
            private java.util.List < String > excludedInstanceTypes; 
            private String instanceFamilyLevel; 
            private String instanceType; 
            private Double maxPrice; 
            private Integer maxQuantity; 
            private java.util.List < Float > memories; 
            private Integer priority; 
            private String vSwitchId; 
            private Double weightedCapacity; 

            /**
             * The architectures of the instance types.
             */
            public Builder architectures(java.util.List < String > architectures) {
                this.architectures = architectures;
                return this;
            }

            /**
             * Specifies whether to include burstable instance types. Valid values:
             * <p>
             * 
             * *   Exclude: does not include burstable instance types.
             * *   Include: includes burstable instance types.
             * *   Required: includes only burstable instance types.
             * 
             * Default value: Include.
             */
            public Builder burstablePerformance(String burstablePerformance) {
                this.burstablePerformance = burstablePerformance;
                return this;
            }

            /**
             * The number of vCPU cores of the instance type.
             */
            public Builder cores(java.util.List < Integer > cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The instance types that you want to exclude.
             */
            public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
                this.excludedInstanceTypes = excludedInstanceTypes;
                return this;
            }

            /**
             * The instance family level of the instance type in extended configuration N. This parameter is used to filter instance types. Valid values:
             * <p>
             * 
             * *   EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not provide stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).
             * *   EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for scenarios that require high stability. For more information, see the [Overview of instance families](~~25378~~) topic.
             * *   CreditEntryLevel: credit entry level (burstable instance types). CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [Overview of burstable instances](~~59977~~).
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder instanceFamilyLevel(String instanceFamilyLevel) {
                this.instanceFamilyLevel = instanceFamilyLevel;
                return this;
            }

            /**
             * The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see [Instance families](~~25378~~).
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum price of preemptible instances in extended configuration N.
             * <p>
             * 
             * >  If you specify one or more other `LaunchTemplateConfig.N.*` parameters, you must also specify `LaunchTemplateConfig.N.MaxPrice`.
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder maxQuantity(Integer maxQuantity) {
                this.maxQuantity = maxQuantity;
                return this;
            }

            /**
             * The memory sizes of the instance type.
             */
            public Builder memories(java.util.List < Float > memories) {
                this.memories = memories;
                return this;
            }

            /**
             * The priority of extended configuration N. A value of 0 indicates the highest priority. Valid values: 0 to ∞.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configuration is determined by the vSwitch.
             * <p>
             * 
             * >  If you specify one or more other `LaunchTemplateConfig.N.*` parameters, you must also specify `LaunchTemplateConfig.N.VSwitchId`.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The weight of the instance type in extended configuration N. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.
             * <p>
             * 
             * The weight is calculated based on the computing power of the specified instance type and the minimum computing power of a single instance in the cluster to be created by the auto provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.
             * 
             * *   For an instance type with 8 vCPUs and 60 GiB of memory, you can set the weight to 1.
             * *   For an instance type with 16 vCPUs and 120 GiB of memory, you can set the weight to 2.
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
             * The category of the system disk. You can specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:
             * <p>
             * 
             * - cloud_efficiency: ultra disk.
             * - cloud_ssd: standard SSD.
             * - cloud_essd: ESSD
             * - cloud: basic disk.
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
             * The key of tag N to add to the auto provisioning group.
             * <p>
             * 
             * Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the auto provisioning group.
             * <p>
             * 
             * Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.
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
