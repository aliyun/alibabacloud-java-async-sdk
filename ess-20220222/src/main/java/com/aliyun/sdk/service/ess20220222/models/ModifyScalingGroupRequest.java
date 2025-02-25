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
    @com.aliyun.core.annotation.NameInMap("AzBalance")
    private Boolean azBalance;

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

    private ModifyScalingGroupRequest(Builder builder) {
        super(builder);
        this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
        this.allocationStrategy = builder.allocationStrategy;
        this.azBalance = builder.azBalance;
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
     * @return azBalance
     */
    public Boolean getAzBalance() {
        return this.azBalance;
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

    public static final class Builder extends Request.Builder<ModifyScalingGroupRequest, Builder> {
        private String activeScalingConfigurationId; 
        private String allocationStrategy; 
        private Boolean azBalance; 
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

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingGroupRequest request) {
            super(request);
            this.activeScalingConfigurationId = request.activeScalingConfigurationId;
            this.allocationStrategy = request.allocationStrategy;
            this.azBalance = request.azBalance;
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
         * <p>The allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances at the same time. This parameter takes effect only when you set the MultiAZPolicy parameter to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</li>
         * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</li>
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
         * <p>Specifies whether to evenly distribute instances in the scaling group across zones. This parameter takes effect only when you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The capacity options.</p>
         */
        public Builder capacityOptions(CapacityOptions capacityOptions) {
            this.putQueryParameter("CapacityOptions", capacityOptions);
            this.capacityOptions = capacityOptions;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirements on the number of ECS instances in the scaling group when the number of preemptible instances cannot be reached due to reasons such as cost-related issues and insufficient resources. This parameter takes effect only if you set <code>MultiAZPolicy</code> in the <code>CreateScalingGroup</code> operation to <code>COST_OPTIMIZED</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The ARN of the custom scaling policy (Function). This parameter takes effect only when you specify CustomPolicy as the first step of the instance removal policy.</p>
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
         * <p>The cooldown period of the scaling group. This parameter is available only if you set ScalingRuleType to SimpleScalingRule. Valid values: 0 to 86400. Unit: seconds.</p>
         * <p>During the cooldown period, Auto Scaling does not execute scaling activities that are triggered by CloudMonitor event-triggered tasks.</p>
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
         * <p>The expected number of ECS instances or elastic container instances in the scaling group. Auto Scaling maintains the expected number of ECS instances or elastic container instances in the scaling group. Make sure that you adhere to the following rule when specifying this parameter: Value of MaxSize ≥ Value of DesiredCapacity ≥ Value of MinSize</p>
         * <blockquote>
         * <p> If you re-enable the Expected Number of Instances feature, you must specify a value for <code>DesiredCapacity</code> again.</p>
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
         * DisableDesiredCapacity.
         */
        public Builder disableDesiredCapacity(Boolean disableDesiredCapacity) {
            this.putQueryParameter("DisableDesiredCapacity", disableDesiredCapacity);
            this.disableDesiredCapacity = disableDesiredCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
         * <ul>
         * <li>true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.</li>
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
         * <li>NONE: Auto Scaling does not check the health status of instances.</li>
         * <li>ECS: Auto Scaling checks the health status of instances in the scaling group. If you want to enable instance health check, you can set the value to ECS, regardless of whether the scaling group is of ECS type or Elastic Container Instance type.</li>
         * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB) instances are not supported as the health check basis for instances in the scaling group. Default value: ECS.</li>
         * </ul>
         * <blockquote>
         * <p> If you want to enable instance health check and load balancer health check at the same time, we recommend that you specify <code>HealthCheckTypes</code>.</p>
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
         * <p>The health check mode of the scaling group.</p>
         * <blockquote>
         * <p> You can specify multiple values for this parameter to enable multiple health check options at the same time. If you specify HealthCheckType, this parameter is ignored.</p>
         * </blockquote>
         */
        public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
            this.putQueryParameter("HealthCheckTypes", healthCheckTypes);
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }

        /**
         * <p>The ID of the launch template that is used by Auto Scaling to create instances.</p>
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
         * <p>Details of the instance types that are specified in the extended configurations of the launch template.</p>
         */
        public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
            this.putQueryParameter("LaunchTemplateOverrides", launchTemplateOverrides);
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }

        /**
         * <p>The version number of the launch template. Valid values:</p>
         * <ul>
         * <li>A fixed template version number.</li>
         * <li>Default: The default template version is always used.</li>
         * <li>Latest: The latest template version is always used.</li>
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
         * <p>The maximum life span of the instance in the scaling group. Unit: seconds.</p>
         * <p>Valid values: 86400 to Integer.maxValue. ``You can also set this parameter to 0. A value of 0 indicates that the instance has an unlimited life span in the scaling group.</p>
         * <p>Default value: null.</p>
         * <blockquote>
         * <p>You cannot specify this parameter for scaling groups that manage elastic container instances or scaling groups whose ScalingPolicy is set to recycle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
            this.putQueryParameter("MaxInstanceLifetime", maxInstanceLifetime);
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        /**
         * <p>The maximum number of ECS instances or elastic container instances that can be contained in the scaling group. If the total number of instances in the scaling group is greater than the value of MaxSize, Auto Scaling proactively removes the surplus instances from the scaling group to restore the total number to match the maximum limit.</p>
         * <p>The value range of MaxSize is directly correlated with the degree of dependency your business has on Auto Scaling. You can go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check <strong>the maximum number of instances that a single scaling group can contain.</strong></p>
         * <p>For example, if a scaling group can contain up to <strong>2,000</strong> instances, the value range of MaxSize is 0 to 2000.</p>
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
         * <p>The minimum number of ECS instances or elastic container instances that must be contained in the scaling group. If the total number of instances in the scaling group is less than the value of MinSize, Auto Scaling proactively adds instances to the scaling group to ensure that the total number aligns with the minimum threshold.</p>
         * <blockquote>
         * <p> The value of MinSize must be less than or equal to the value of MaxSize.</p>
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
         * <p>The scaling policy for the multi-zone scaling group that contains ECS instances. Valid values:</p>
         * <ul>
         * <li>PRIORITY: ECS instances are scaled based on the vSwitch priority. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. Auto Scaling preferentially scales instances in the zone where the vSwitch that has the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch that has the next highest priority resides.</li>
         * <li>COST_OPTIMIZED: During a scale-out activity, Auto Scaling preferentially creates ECS instances of the instance type that has the lowest unit price of vCPU. During a scale-in activity, Auto Scaling preferentially removes ECS instances of the instance types that have the highest unit price of vCPU. Auto Scaling preferentially creates preemptible instances when preemptible instance types are specified in the scaling configuration. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create pay-as-you-go instances when Auto Scaling fails to create preemptible instances.</li>
         * </ul>
         * <blockquote>
         * <p>The <code>COST_OPTIMIZED</code> setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
         * </blockquote>
         * <ul>
         * <li>BALANCE: ECS instances are evenly distributed across zones that are specified in the scaling group. If ECS instances are unevenly distributed among zones due to insufficient resources, you can call the RebalanceInstance operation to evenly distribute the instances among the zones.</li>
         * <li>COMPOSABLE: You can flexibly combine the preceding policies based on your business requirements.</li>
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
         * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
         * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 0.</p>
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
         * <p>The expected percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
         * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 100.</p>
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
         * <p>The policy that is used to remove ECS instances from the scaling group. Valid values:</p>
         * <ul>
         * <li>OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.</li>
         * <li>NewestInstance: removes ECS instances that are most recently added to the scaling group.</li>
         * <li>OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.</li>
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
         * <p>The ID of the scaling group that you want to modify.</p>
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
         * <p>The name of the scaling group. The name of each scaling group must be unique in a region. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
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
         * <p>The reclaim mode of the scaling group. Valid values:</p>
         * <ul>
         * <li><p>recycle: economical mode</p>
         * </li>
         * <li><p>release: release mode</p>
         * </li>
         * <li><p>forcerelease: forced release mode</p>
         * <p>**</p>
         * <p><strong>Note</strong> If you set the value to <code>forcerelease</code>, Auto Scaling forcibly releases instances that are in the <code>Running</code> state during scale-ins. Forced release is equivalent to power outage. If an instance is forcibly released, ephemeral data on the instance will be cleared and cannot be recovered. Exercise caution when you select this option.</p>
         * </li>
         * <li><p>forcerecycle: forced recycle mode</p>
         * <p>**</p>
         * <p><strong>Note</strong> If you set the value to <code>forcerecycle</code>, Auto Scaling forcibly shuts down instances that are in the <code>Running</code> state during scale-ins. Forced shutdown is equivalent to power outage. If an instance is forcibly shut down, ephemeral data on the instance will be cleared and cannot be recovered. Exercise caution when you select this option.</p>
         * </li>
         * </ul>
         * <p>ScalingPolicy specifies only the reclaim mode of the scaling group. RemovePolicy of the RemoveInstances operation specifies the manner how instances are removed from the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
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
         * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only when you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code>. Valid values:</p>
         * <ul>
         * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</li>
         * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</li>
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
         * <p>The number of instance types that you specify. Auto Scaling creates preemptible instances of multiple instance types that are provided at the lowest price. Valid values: 0 to 10.</p>
         * <p>If you set the <code>MultiAZPolicy</code> parameter to <code>COMPOSABLE</code> Policy, the default value is 2.</p>
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
         * <p>Specifies whether to supplement preemptible instances. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message that the preemptible instance is to be reclaimed.</p>
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
         * <p>The period of time that is required by the Elastic Compute Service (ECS) instance to enter the Stopped state during the scale-in process. Unit: seconds. Valid values: 30 to 240.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only if you set ScalingPolicy to release.<br>If you specify this parameter, the system proceeds with the scale-in process only after the period of time specified by StopInstanceTimeout ends. In this case, the scale-in operation continues regardless of whether the ECS instance enters the Stopped state or not.<br>If you do not specify this parameter, the system proceeds with the scale-in process only after the ECS instance enters the Stopped state. If the ECS instance fails to enter the Stopped state, the scale-in process rolls back, and the scale-in operation is considered as failed.</p>
         * </li>
         * <li><p>When you call the ModifyScalingGroup operation, you can set the value to 0. In this case, the system ignores this parameter.</p>
         * </li>
         * </ul>
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
         * <p>The IDs of vSwitches.</p>
         * <p>This parameter takes effect only when the network type of the scaling group is virtual private cloud (VPC). The specified vSwitches and the scaling group must reside in the same VPC.</p>
         * <p>The vSwitches can reside in different zones. The vSwitches are sorted in ascending order. The first vSwitch specified by using the VSwitchIds parameter has the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch that has the next highest priority resides.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
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

            /**
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirements on the number of ECS instances in the scaling group when the number of preemptible instances cannot be reached due to reasons such as cost-related issues and insufficient resources. This parameter takes effect only if you set <code>MultiAZPolicy</code> in the <code>CreateScalingGroup</code> operation to <code>COST_OPTIMIZED</code>. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The minimum number of pay-as-you-go instances that must be contained in the scaling group. When the actual number of pay-as-you-go instances in the scaling group drops below the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
             * <p>If you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>, the default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances is reached. <code>OnDemandBaseCapacity</code> specifies the minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 100</p>
             * <p>If you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>, the default value is 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * PriceComparisonMode.
             */
            public Builder priceComparisonMode(String priceComparisonMode) {
                this.priceComparisonMode = priceComparisonMode;
                return this;
            }

            /**
             * <p>Specifies whether to replace pay-as-you-go ECS instances with preemptible ECS instances. If you specify <code>CompensateWithOnDemand</code>, it may result in a higher percentage of pay-as-you-go instances compared to the value of <code>OnDemandPercentageAboveBaseCapacity</code>. In this scenario, Auto Scaling will try to deploy preemptible ECS instances to replace the surplus pay-as-you-go ECS instances. When <code>CompensateWithOnDemand</code> is specified, Auto Scaling creates pay-as-you-go ECS instances if there are not enough preemptible instance types. To avoid keeping these pay-as-you-go ECS instances for long periods, Auto Scaling tries to replace them with preemptible instances as soon as enough of preemptible instance types become available. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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

            /**
             * <p>The instance type. The instance type that you specify by using the InstanceType parameter overwrites the instance type that is specified in the launch template.</p>
             * <p>If you want Auto Scaling to scale instances in the scaling group based on the instance type weight, you must specify both the InstanceType and WeightedCapacity parameters.</p>
             * <blockquote>
             * <p>This parameter takes effect only after you specify the LaunchTemplateId parameter.</p>
             * </blockquote>
             * <p>You can use the InstanceType parameter to specify only instance types that are available for purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The weight of the instance type. The weight specifies the capacity of a single instance of the specified instance type in the scaling group. If you want Auto Scaling to scale instances in the scaling group based on the weighted capacity of instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.</p>
             * <p>A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
             * <p>Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.</p>
             * <p>Example:</p>
             * <ul>
             * <li>Current capacity: 0</li>
             * <li>Expected capacity: 6</li>
             * <li>Capacity of ecs.c5.xlarge: 4</li>
             * </ul>
             * <p>To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.</p>
             * <blockquote>
             * <p>The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance type.</p>
             * </blockquote>
             * <p>Valid values of the WeightedCapacity parameter: 1 to 500.</p>
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
}
