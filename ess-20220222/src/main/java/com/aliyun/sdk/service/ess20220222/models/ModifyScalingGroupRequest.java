// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link ModifyScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingGroupRequest</p>
 */
public class ModifyScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
    private String activeScalingConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
    private String allocationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRebalance")
    private Boolean autoRebalance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AzBalance")
    private Boolean azBalance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BalanceMode")
    private String balanceMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CapacityOptions")
    private CapacityOptions capacityOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
    private Boolean compensateWithOnDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPolicyARN")
    private String customPolicyARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
    @com.aliyun.core.annotation.Validation(maximum = 86400)
    private Integer defaultCooldown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableDesiredCapacity")
    private Boolean disableDesiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDeletionProtection")
    private Boolean groupDeletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTypes")
    private java.util.List<String> healthCheckTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateOverrides")
    private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxInstanceLifetime")
    private Integer maxInstanceLifetime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    private Integer maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSize")
    private Integer minSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAZPolicy")
    private String multiAZPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
    private Integer onDemandBaseCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
    private Integer onDemandPercentageAboveBaseCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovalPolicies")
    private java.util.List<String> removalPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
    private String scalingGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
    private String scalingPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotAllocationStrategy")
    private String spotAllocationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInstancePools")
    private Integer spotInstancePools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopInstanceTimeout")
    private Integer stopInstanceTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneShiftPolicy")
    private ZoneShiftPolicy zoneShiftPolicy;

    private ModifyScalingGroupRequest(Builder builder) {
        super(builder);
        this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
        this.allocationStrategy = builder.allocationStrategy;
        this.autoRebalance = builder.autoRebalance;
        this.azBalance = builder.azBalance;
        this.balanceMode = builder.balanceMode;
        this.capacityOptions = builder.capacityOptions;
        this.compensateWithOnDemand = builder.compensateWithOnDemand;
        this.customPolicyARN = builder.customPolicyARN;
        this.defaultCooldown = builder.defaultCooldown;
        this.desiredCapacity = builder.desiredCapacity;
        this.disableDesiredCapacity = builder.disableDesiredCapacity;
        this.groupDeletionProtection = builder.groupDeletionProtection;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckTypes = builder.healthCheckTypes;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateOverrides = builder.launchTemplateOverrides;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxInstanceLifetime = builder.maxInstanceLifetime;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.multiAZPolicy = builder.multiAZPolicy;
        this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.removalPolicies = builder.removalPolicies;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingGroupName = builder.scalingGroupName;
        this.scalingPolicy = builder.scalingPolicy;
        this.spotAllocationStrategy = builder.spotAllocationStrategy;
        this.spotInstancePools = builder.spotInstancePools;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.stopInstanceTimeout = builder.stopInstanceTimeout;
        this.vSwitchIds = builder.vSwitchIds;
        this.zoneShiftPolicy = builder.zoneShiftPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeScalingConfigurationId
     */
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    /**
     * @return allocationStrategy
     */
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * @return autoRebalance
     */
    public Boolean getAutoRebalance() {
        return this.autoRebalance;
    }

    /**
     * @return azBalance
     */
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    /**
     * @return balanceMode
     */
    public String getBalanceMode() {
        return this.balanceMode;
    }

    /**
     * @return capacityOptions
     */
    public CapacityOptions getCapacityOptions() {
        return this.capacityOptions;
    }

    /**
     * @return compensateWithOnDemand
     */
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    /**
     * @return customPolicyARN
     */
    public String getCustomPolicyARN() {
        return this.customPolicyARN;
    }

    /**
     * @return defaultCooldown
     */
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * @return desiredCapacity
     */
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * @return disableDesiredCapacity
     */
    public Boolean getDisableDesiredCapacity() {
        return this.disableDesiredCapacity;
    }

    /**
     * @return groupDeletionProtection
     */
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    /**
     * @return healthCheckType
     */
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * @return healthCheckTypes
     */
    public java.util.List<String> getHealthCheckTypes() {
        return this.healthCheckTypes;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateOverrides
     */
    public java.util.List<LaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return maxInstanceLifetime
     */
    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    /**
     * @return maxSize
     */
    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return minSize
     */
    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * @return multiAZPolicy
     */
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    /**
     * @return onDemandBaseCapacity
     */
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    /**
     * @return onDemandPercentageAboveBaseCapacity
     */
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
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
     * @return removalPolicies
     */
    public java.util.List<String> getRemovalPolicies() {
        return this.removalPolicies;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * @return scalingPolicy
     */
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    /**
     * @return spotAllocationStrategy
     */
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    /**
     * @return spotInstancePools
     */
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    /**
     * @return spotInstanceRemedy
     */
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    /**
     * @return stopInstanceTimeout
     */
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return zoneShiftPolicy
     */
    public ZoneShiftPolicy getZoneShiftPolicy() {
        return this.zoneShiftPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyScalingGroupRequest, Builder> {
        private String activeScalingConfigurationId; 
        private String allocationStrategy; 
        private Boolean autoRebalance; 
        private Boolean azBalance; 
        private String balanceMode; 
        private CapacityOptions capacityOptions; 
        private Boolean compensateWithOnDemand; 
        private String customPolicyARN; 
        private Integer defaultCooldown; 
        private Integer desiredCapacity; 
        private Boolean disableDesiredCapacity; 
        private Boolean groupDeletionProtection; 
        private String healthCheckType; 
        private java.util.List<String> healthCheckTypes; 
        private String launchTemplateId; 
        private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides; 
        private String launchTemplateVersion; 
        private Integer maxInstanceLifetime; 
        private Integer maxSize; 
        private Integer minSize; 
        private String multiAZPolicy; 
        private Integer onDemandBaseCapacity; 
        private Integer onDemandPercentageAboveBaseCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List<String> removalPolicies; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private String scalingGroupName; 
        private String scalingPolicy; 
        private String spotAllocationStrategy; 
        private Integer spotInstancePools; 
        private Boolean spotInstanceRemedy; 
        private Integer stopInstanceTimeout; 
        private java.util.List<String> vSwitchIds; 
        private ZoneShiftPolicy zoneShiftPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingGroupRequest request) {
            super(request);
            this.activeScalingConfigurationId = request.activeScalingConfigurationId;
            this.allocationStrategy = request.allocationStrategy;
            this.autoRebalance = request.autoRebalance;
            this.azBalance = request.azBalance;
            this.balanceMode = request.balanceMode;
            this.capacityOptions = request.capacityOptions;
            this.compensateWithOnDemand = request.compensateWithOnDemand;
            this.customPolicyARN = request.customPolicyARN;
            this.defaultCooldown = request.defaultCooldown;
            this.desiredCapacity = request.desiredCapacity;
            this.disableDesiredCapacity = request.disableDesiredCapacity;
            this.groupDeletionProtection = request.groupDeletionProtection;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckTypes = request.healthCheckTypes;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateOverrides = request.launchTemplateOverrides;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.maxInstanceLifetime = request.maxInstanceLifetime;
            this.maxSize = request.maxSize;
            this.minSize = request.minSize;
            this.multiAZPolicy = request.multiAZPolicy;
            this.onDemandBaseCapacity = request.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = request.onDemandPercentageAboveBaseCapacity;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.removalPolicies = request.removalPolicies;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
            this.scalingGroupName = request.scalingGroupName;
            this.scalingPolicy = request.scalingPolicy;
            this.spotAllocationStrategy = request.spotAllocationStrategy;
            this.spotInstancePools = request.spotInstancePools;
            this.spotInstanceRemedy = request.spotInstanceRemedy;
            this.stopInstanceTimeout = request.stopInstanceTimeout;
            this.vSwitchIds = request.vSwitchIds;
            this.zoneShiftPolicy = request.zoneShiftPolicy;
        } 

        /**
         * <p>The ID of the active scaling configuration in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp17pelvl720x5ub****</p>
         */
        public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
            this.putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }

        /**
         * <p>The capacity allocation policy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution policy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:                              </p>
         * <ul>
         * <li><p>priority: creates instances in the order of the configured instance types.</p>
         * </li>
         * <li><p>lowestPrice: creates instances in ascending order of the vCPU unit price of the instance types.</p>
         * </li>
         * </ul>
         * <p>Default value: priority.</p>
         * 
         * <strong>example:</strong>
         * <p>priority</p>
         */
        public Builder allocationStrategy(String allocationStrategy) {
            this.putQueryParameter("AllocationStrategy", allocationStrategy);
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for a zone-balanced scaling group. Valid values:</p>
         * <ul>
         * <li>false: disables automatic balancing for the scaling group.</li>
         * <li>true: enables automatic balancing for the scaling group. The scaling group automatically detects the capacity across zones. If the capacity is unbalanced across zones, the scaling group proactively scales across zones to rebalance the capacity.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRebalance(Boolean autoRebalance) {
            this.putQueryParameter("AutoRebalance", autoRebalance);
            this.autoRebalance = autoRebalance;
            return this;
        }

        /**
         * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>true: The capacity of the scaling group is evenly distributed across multiple zones.</li>
         * <li>false: The capacity of the scaling group is not evenly distributed across multiple zones.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder azBalance(Boolean azBalance) {
            this.putQueryParameter("AzBalance", azBalance);
            this.azBalance = azBalance;
            return this;
        }

        /**
         * <p>The zone balancing mode. This parameter takes effect only when the zone balancing mode is enabled. Valid values:</p>
         * <ul>
         * <li><p>BalancedBestEffort: If resource creation fails in a zone, the system degrades to other zones to ensure best-effort delivery of resources.</p>
         * </li>
         * <li><p>BalancedOnly: If resource creation fails in a zone, the system does not degrade to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
         * </li>
         * </ul>
         * <p>Default value: BalancedBestEffort.</p>
         * 
         * <strong>example:</strong>
         * <p>BalancedBestEffort</p>
         */
        public Builder balanceMode(String balanceMode) {
            this.putQueryParameter("BalanceMode", balanceMode);
            this.balanceMode = balanceMode;
            return this;
        }

        /**
         * <p>The capacity options.</p>
         */
        public Builder capacityOptions(CapacityOptions capacityOptions) {
            this.putQueryParameter("CapacityOptions", capacityOptions);
            this.capacityOptions = capacityOptions;
            return this;
        }

        /**
         * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances if sufficient spot instances cannot be created due to price or inventory reasons when the MultiAZPolicy parameter of the CreateScalingGroup operation is set to COST_OPTIMIZED. Valid values:</p>
         * <ul>
         * <li><p>true: allows the creation of pay-as-you-go instances.</p>
         * </li>
         * <li><p>false: does not allow the creation of pay-as-you-go instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.putQueryParameter("CompensateWithOnDemand", compensateWithOnDemand);
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy configured in RemovalPolicies is CustomPolicy.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
         */
        public Builder customPolicyARN(String customPolicyARN) {
            this.putQueryParameter("CustomPolicyARN", customPolicyARN);
            this.customPolicyARN = customPolicyARN;
            return this;
        }

        /**
         * <p>The default cooldown time of the scaling group. This parameter applies only to simple scaling rules. Valid values: 0 to 86400. Unit: seconds.</p>
         * <p>During the cooldown time, the scaling group does not execute any other scaling activities. This applies only to scaling activities triggered by CloudMonitor event-triggered tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * <p>The expected number of ECS instances or elastic container instances in the scaling group. The scaling group automatically maintains the number of ECS instances or elastic container instances at the expected number. Valid values: MinSize to MaxSize.</p>
         * <blockquote>
         * <p>If the expected number of instances feature is disabled and then re-enabled, you must reset the DesiredCapacity value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to disable the expected number of instances feature for the scaling group. Valid values:</p>
         * <ul>
         * <li>false: enables the expected number of instances feature.</li>
         * <li>true: disables the expected number of instances feature.</li>
         * </ul>
         * <blockquote>
         * <p>You can change the Settings of this parameter to true (that is, shutdown the expected number of instances feature) only when no scaling activity is in progress in the scaling group. When you shutdown the expected number of instances feature, the current DesiredCapacity property of the scaling group is cleared, but the current number of instances in the scaling group remains unchanged.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDesiredCapacity(Boolean disableDesiredCapacity) {
            this.putQueryParameter("DisableDesiredCapacity", disableDesiredCapacity);
            this.disableDesiredCapacity = disableDesiredCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
         * <ul>
         * <li>true: enables deletion protection for the scaling group. In this case, the scaling group cannot be deleted.</li>
         * <li>false: disables deletion protection for the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
            this.putQueryParameter("GroupDeletionProtection", groupDeletionProtection);
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>NONE: disables health checks.</li>
         * <li>ECS: performs health checks on instances in the scaling group. This value applies to both ECS and elastic container instance scaling groups.</li>
         * <li>LOAD_BALANCER: determines the health status of instances based on the health check results of load balancing. Classic Load Balancer (CLB) is not supported.
         * Default value: ECS.</li>
         * </ul>
         * <blockquote>
         * <p>To enable both instance health checks and load balancer health checks, use the HealthCheckTypes parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * <p>The health check modes of the scaling group.</p>
         * <blockquote>
         * <p>You can use this parameter to specify multiple values to enable multiple health check options. If the HealthCheckType parameter is configured, this parameter is ignored.</p>
         * </blockquote>
         */
        public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
            this.putQueryParameter("HealthCheckTypes", healthCheckTypes);
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }

        /**
         * <p>The ID of the instance launch template, which is used to specify that the scaling group obtains launch configuration information from the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-m5e3ofjr1zn1aw7****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The extended instance type information of the launch template.</p>
         */
        public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
            this.putQueryParameter("LaunchTemplateOverrides", launchTemplateOverrides);
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }

        /**
         * <p>The version of the instance launch template. Valid values:</p>
         * <ul>
         * <li>A specific template version number.</li>
         * <li>Default: always uses the default version of the template.</li>
         * <li>Latest: always uses the latest version of the template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
         * <p>Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the configured value of MaxInstanceLifetime is cleared (that is, MaxInstanceLifetime is not configured).</p>
         * <p>Default value: null.</p>
         * <blockquote>
         * <p>This parameter cannot be configured for scaling groups of the elastic container instance type or scaling groups that have the no fees for stopped instances feature enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
            this.putQueryParameter("MaxInstanceLifetime", maxInstanceLifetime);
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        /**
         * <p>The maximum number of ECS instances or elastic container instances in the scaling group. If the number of ECS instances or elastic container instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances or elastic container instances.</p>
         * <p>&lt;props=&quot;china&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;The value range of MaxSize varies based on the usage of Auto Scaling. Go to the Quota Center to view the quota value for the <strong>maximum number of instances in a single scaling group</strong>.</p>
         * <p>For example, if the quota value for the <strong>maximum number of instances in a single scaling group</strong> is 2000, the value range of MaxSize is 0 to 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>The minimum number of ECS instances or elastic container instances in the scaling group. If the number of ECS instances or elastic container instances in the scaling group is less than the value of MinSize, Auto Scaling initiates the automatic creation of ECS instances or elastic container instances.</p>
         * <blockquote>
         * <p>The value of MinSize must be less than or equal to the value of MaxSize.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p>PRIORITY: scales the scaling group based on the priorities of vSwitches (VSwitchIds.N). Auto Scaling preferentially attempts to scale the scaling group in the zone where the vSwitch with the highest priority resides. If the scaling fails, Auto Scaling automatically attempts to scale the scaling group in the zone where the vSwitch with the next highest priority resides.</p>
         * </li>
         * <li><p>COST_OPTIMIZED: during scale-out, Auto Scaling attempts to create ECS instances in ascending order of vCPU unit price. During scale-in, Auto Scaling attempts to remove ECS instances in descending order of vCPU unit price. If the scaling configuration specifies multiple instance types that use the spot billing method, spot instances are preferentially created. You can use the CompensateWithOnDemand parameter to specify whether Auto Scaling automatically attempts to create pay-as-you-go instances when spot instances cannot be created.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>COST_OPTIMIZED takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
         * </blockquote>
         * <ul>
         * <li><p>BALANCE: evenly allocate ECS instances across the active zones specified for the scaling group. If the instances are unevenly distributed across zones due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</p>
         * </li>
         * <li><p>COMPOSABLE: a composite policy that allows you to combine the preceding scaling policies for ECS instances in a multi-zone scaling group based on your needs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        public Builder multiAZPolicy(String multiAZPolicy) {
            this.putQueryParameter("MultiAZPolicy", multiAZPolicy);
            this.multiAZPolicy = multiAZPolicy;
            return this;
        }

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are preferentially created.</p>
         * <p>Default value: 0 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.putQueryParameter("OnDemandBaseCapacity", onDemandBaseCapacity);
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * <p>Default value: 100 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.putQueryParameter("OnDemandPercentageAboveBaseCapacity", onDemandPercentageAboveBaseCapacity);
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
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
         * <p>The scale-in policy of the scaling group, which specifies the ECS instances to be removed. Valid values:</p>
         * <ul>
         * <li><p>OldestInstance: removes the ECS instances that were added to the scaling group at the earliest point in time.</p>
         * </li>
         * <li><p>NewestInstance: removes the ECS instances that were added to the scaling group at the latest point in time.</p>
         * </li>
         * <li><p>OldestScalingConfiguration: removes the ECS instances that were created by using the earliest scaling configuration.</p>
         * </li>
         * </ul>
         */
        public Builder removalPolicies(java.util.List<String> removalPolicies) {
            this.putQueryParameter("RemovalPolicies", removalPolicies);
            this.removalPolicies = removalPolicies;
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
         * <p>The ID of the scaling group to be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1ffogfdauy0jw0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The name of the scaling group. The name must be unique within a region. The name must be 2 to 64 characters in length and start with a letter, digit, or Chinese character. It can contain digits, underscores (_), hyphens (-), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>scalinggroup****</p>
         */
        public Builder scalingGroupName(String scalingGroupName) {
            this.putQueryParameter("ScalingGroupName", scalingGroupName);
            this.scalingGroupName = scalingGroupName;
            return this;
        }

        /**
         * <p>The revoke pattern of the scaling group. Valid values: </p>
         * <ul>
         * <li><p>recycle: The revoke pattern of the scaling group is shutdown and revoke pattern.  </p>
         * </li>
         * <li><p>release: The revoke pattern of the scaling group is release pattern.</p>
         * </li>
         * <li><p>forcerelease: The revoke pattern of the scaling group is forcible release pattern.</p>
         * <blockquote>
         * <p>If you select forcerelease, the system forcibly releases instances in the Running state during scale-down activities. Forcibly releasing an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * <li><p>forcerecycle: The revoke pattern of the scaling group is forcible shutdown and revoke pattern.</p>
         * <blockquote>
         * <p>If you select forcerecycle, the system forcibly shuts down instances in the Running state during scale-down activities. Forcible shutdown is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>The ScalingPolicy parameter specifies the revoke pattern of the scaling group. However, the specific action when an instance is removed from the scaling group is determined by the RemovePolicy parameter of the RemoveInstances operation. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>recycle</p>
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * <p>The spot capacity distribution policy. You can use this parameter to separately specify the distribution policy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: creates instances in the order of the configured instance types.</li>
         * <li>lowestPrice: creates instances in ascending order of the vCPU unit price of the instance types.</li>
         * </ul>
         * <p>Default value: priority.</p>
         * 
         * <strong>example:</strong>
         * <p>lowestPrice</p>
         */
        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            this.putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest cost. Valid values: 0 to 10.</p>
         * <p>Default value: 2 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            this.putQueryParameter("SpotInstancePools", spotInstancePools);
            this.spotInstancePools = spotInstancePools;
            return this;
        }

        /**
         * <p>Specifies whether to enable the spot instance replenishment feature. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy);
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * <p>The timeout period for waiting for an ECS instance to be successfully stopped during the scale-in flow. Unit: seconds.
         * Valid values: 30 to 240.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only in the scale-in flow when ScalingPolicy is set to the release pattern.  </li>
         * <li>If the Settings of this parameter are configured, the system waits for a maximum of the StopInstanceTimeout period for the instance to be successfully stopped. After the timeout period elapses, the scale-in flow continues regardless of whether the instance is successfully stopped.  </li>
         * <li>If the Settings of this parameter are not configured, the system waits for a long time for the instance to be successfully stopped. The scale-in flow continues only after the instance is successfully stopped. If the instance stop has failed, the scale-in flow will rollback and the scale-in has failed.</li>
         * <li>A value of 0 indicates that the parameter settings of this parameter are canceled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder stopInstanceTimeout(Integer stopInstanceTimeout) {
            this.putQueryParameter("StopInstanceTimeout", stopInstanceTimeout);
            this.stopInstanceTimeout = stopInstanceTimeout;
            return this;
        }

        /**
         * <p>The IDs of one or more vSwitches.</p>
         * <p>This parameter takes effect only when the network type of the scaling group is VPC. The VPC to which the specified vSwitches belong must be the same as the VPC to which the scaling group belongs.</p>
         * <p>The vSwitches can reside in different zones. The priorities of vSwitches are sorted in ascending order of numbers. 1 indicates the highest priority. If ECS instances cannot be created in the zone where the vSwitch with a higher priority resides, the vSwitch with the next highest priority is automatically selected to create ECS instances.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The behavior policy of the scaling group during zone shift.</p>
         */
        public Builder zoneShiftPolicy(ZoneShiftPolicy zoneShiftPolicy) {
            this.putQueryParameter("ZoneShiftPolicy", zoneShiftPolicy);
            this.zoneShiftPolicy = zoneShiftPolicy;
            return this;
        }

        @Override
        public ModifyScalingGroupRequest build() {
            return new ModifyScalingGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingGroupRequest</p>
     */
    public static class CapacityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("PriceComparisonMode")
        private String priceComparisonMode;

        @com.aliyun.core.annotation.NameInMap("SpotAutoReplaceOnDemand")
        private Boolean spotAutoReplaceOnDemand;

        private CapacityOptions(Builder builder) {
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.priceComparisonMode = builder.priceComparisonMode;
            this.spotAutoReplaceOnDemand = builder.spotAutoReplaceOnDemand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityOptions create() {
            return builder().build();
        }

        /**
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        /**
         * @return onDemandBaseCapacity
         */
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        /**
         * @return onDemandPercentageAboveBaseCapacity
         */
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        /**
         * @return priceComparisonMode
         */
        public String getPriceComparisonMode() {
            return this.priceComparisonMode;
        }

        /**
         * @return spotAutoReplaceOnDemand
         */
        public Boolean getSpotAutoReplaceOnDemand() {
            return this.spotAutoReplaceOnDemand;
        }

        public static final class Builder {
            private Boolean compensateWithOnDemand; 
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private String priceComparisonMode; 
            private Boolean spotAutoReplaceOnDemand; 

            private Builder() {
            } 

            private Builder(CapacityOptions model) {
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.onDemandBaseCapacity = model.onDemandBaseCapacity;
                this.onDemandPercentageAboveBaseCapacity = model.onDemandPercentageAboveBaseCapacity;
                this.priceComparisonMode = model.priceComparisonMode;
                this.spotAutoReplaceOnDemand = model.spotAutoReplaceOnDemand;
            } 

            /**
             * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances if sufficient spot instances cannot be created due to price or inventory reasons when the MultiAZPolicy parameter of the CreateScalingGroup operation is set to COST_OPTIMIZED. Valid values:</p>
             * <ul>
             * <li>true: allows the creation of pay-as-you-go instances.</li>
             * <li>false: does not allow the creation of pay-as-you-go instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. If the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
             * <p>Default value: 0 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
             * <p>Default value: 100 when the MultiAZPolicy parameter is set to COMPOSABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The price comparison mode for the cost optimization policy of the scaling group. Valid values:</p>
             * <ul>
             * <li><p>PricePerUnit: compares prices based on the price per unit of capacity.</p>
             * <p>The capacity of an instance in the scaling group equals the weight configured for the instance type. The default weight is 1, which means one ECS instance occupies a capacity of 1.</p>
             * </li>
             * <li><p>PricePerVCpu: compares prices based on the price per vCPU.</p>
             * </li>
             * </ul>
             * <p>Default value: PricePerUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>PricePerUnit</p>
             */
            public Builder priceComparisonMode(String priceComparisonMode) {
                this.priceComparisonMode = priceComparisonMode;
                return this;
            }

            /**
             * <p>Specifies whether to attempt to use spot instances to replace pay-as-you-go capacity when the percentage of pay-as-you-go instances exceeds the OnDemandPercentageAboveBaseCapacity value after CompensateWithOnDemand is enabled. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this feature attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term retention of pay-as-you-go instances. Valid values:</p>
             * <ul>
             * <li>true: allows the replacement.</li>
             * <li>false: does not allow the replacement.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder spotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
                this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
                return this;
            }

            public CapacityOptions build() {
                return new CapacityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingGroupRequest</p>
     */
    public static class LaunchTemplateOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverrides create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float spotPriceLimit; 
            private Integer weightedCapacity; 

            private Builder() {
            } 

            private Builder(LaunchTemplateOverrides model) {
                this.instanceType = model.instanceType;
                this.spotPriceLimit = model.spotPriceLimit;
                this.weightedCapacity = model.weightedCapacity;
            } 

            /**
             * <p>When you need the scaling group to scale based on the instance type capacity, specify both this parameter and LaunchTemplateOverrides.WeightedCapacity.</p>
             * <p>This parameter is used to specify the instance type and overrides the instance type in the launch template.</p>
             * <blockquote>
             * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
             * </blockquote>
             * <p>Valid values of InstanceType: available ECS instance types.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>This parameter is used to specify the maximum hourly price for the instance type that overrides the launch template (that is, LaunchTemplateOverride.N.InstanceType). You can specify N values for this parameter to extend the launch template to support N instance types. Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.025</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>When you need the scaling group to scale based on the instance type capacity, specify this parameter after you specify LaunchTemplateOverrides.InstanceType. The two parameters correspond to each other.</p>
             * <p>This parameter is used to specify the weight of the instance type, which indicates the capacity that a single instance of the instance type represents in the scaling group.</p>
             * <p>A greater weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
             * <p>Because performance metrics such as the number of vCPUs and memory size vary with instance types, you can configure different weights for different instance types based on your needs.</p>
             * <p>Example:</p>
             * <ul>
             * <li><p>Current capacity: 0.</p>
             * </li>
             * <li><p>Expected capacity: 6.</p>
             * </li>
             * <li><p>Capacity of the ecs.c5.xlarge instance type: 4.</p>
             * </li>
             * </ul>
             * <p>To meet the expected capacity, the scaling group scales out two ecs.c5.xlarge instances.</p>
             * <blockquote>
             * <p>During scale-out, the capacity of the scaling group cannot exceed the sum of the maximum capacity (MaxSize) and the maximum weight of the instance type.</p>
             * </blockquote>
             * <p>Valid values of WeightedCapacity: 1 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateOverrides build() {
                return new LaunchTemplateOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyScalingGroupRequest</p>
     */
    public static class ZoneShiftPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImpairedZoneHealthCheckBehavior")
        private String impairedZoneHealthCheckBehavior;

        @com.aliyun.core.annotation.NameInMap("ScaleInBlockedRuleTypes")
        private java.util.List<String> scaleInBlockedRuleTypes;

        @com.aliyun.core.annotation.NameInMap("ScaleOutInHealthyZonesOnly")
        private Boolean scaleOutInHealthyZonesOnly;

        private ZoneShiftPolicy(Builder builder) {
            this.impairedZoneHealthCheckBehavior = builder.impairedZoneHealthCheckBehavior;
            this.scaleInBlockedRuleTypes = builder.scaleInBlockedRuleTypes;
            this.scaleOutInHealthyZonesOnly = builder.scaleOutInHealthyZonesOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneShiftPolicy create() {
            return builder().build();
        }

        /**
         * @return impairedZoneHealthCheckBehavior
         */
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        /**
         * @return scaleInBlockedRuleTypes
         */
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        /**
         * @return scaleOutInHealthyZonesOnly
         */
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

        public static final class Builder {
            private String impairedZoneHealthCheckBehavior; 
            private java.util.List<String> scaleInBlockedRuleTypes; 
            private Boolean scaleOutInHealthyZonesOnly; 

            private Builder() {
            } 

            private Builder(ZoneShiftPolicy model) {
                this.impairedZoneHealthCheckBehavior = model.impairedZoneHealthCheckBehavior;
                this.scaleInBlockedRuleTypes = model.scaleInBlockedRuleTypes;
                this.scaleOutInHealthyZonesOnly = model.scaleOutInHealthyZonesOnly;
            } 

            /**
             * <p>The health check behavior in impaired zones. Valid values: </p>
             * <ul>
             * <li>ReplaceUnhealthy: normally replaces unhealthy instances in all zones. </li>
             * <li>IgnoreUnhealthy: does not replace unhealthy instances in impaired zones. Healthy zones are not affected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReplaceUnhealthy</p>
             */
            public Builder impairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
                this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
                return this;
            }

            /**
             * <p>Blocks scale-in activities triggered by specified types of scaling rules. The blocking scope covers all zones under the scaling group, not just the impaired zones. This prevents false scale-in activities caused by fake improvements in monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
             * <ul>
             * <li>StepScalingRule: blocks scale-in activities triggered by step scaling rules. </li>
             * <li>TargetTrackingScalingRule: blocks scale-in activities triggered by target tracking scaling rules. </li>
             * <li>None: does not block any scale-in activities.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StepScalingRule</p>
             */
            public Builder scaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
                this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
                return this;
            }

            /**
             * <p>Specifies whether scale-out creates instances only in healthy zones during zone shift. Valid values: </p>
             * <ul>
             * <li>true: creates instances only in healthy zones during scale-out and skips impaired zones. </li>
             * <li>false: does not restrict zones, and scale-out can create instances in any zone under the scaling group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
                this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
                return this;
            }

            public ZoneShiftPolicy build() {
                return new ZoneShiftPolicy(this);
            } 

        } 

    }
}
