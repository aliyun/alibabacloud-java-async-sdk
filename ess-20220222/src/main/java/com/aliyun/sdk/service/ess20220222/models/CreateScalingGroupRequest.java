// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingGroupRequest</p>
 */
public class CreateScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
    private java.util.List < AlbServerGroups> albServerGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
    private String allocationStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AzBalance")
    private Boolean azBalance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
    private Boolean compensateWithOnDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    private String containerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPolicyARN")
    private String customPolicyARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
    private String DBInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    private java.util.List < DBInstances> DBInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
    private Integer defaultCooldown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDeletionProtection")
    private Boolean groupDeletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTypes")
    private java.util.List < String > healthCheckTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateOverrides")
    private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifecycleHooks")
    private java.util.List < LifecycleHooks> lifecycleHooks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerConfigs")
    private java.util.List < LoadBalancerConfigs> loadBalancerConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private String loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxInstanceLifetime")
    private Integer maxInstanceLifetime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSize")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemovalPolicies")
    private java.util.List < String > removalPolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
    private String scalingGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
    private String scalingPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroups")
    private java.util.List < ServerGroups> serverGroups;

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
    @com.aliyun.core.annotation.NameInMap("SyncAlarmRuleToCms")
    private Boolean syncAlarmRuleToCms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroups")
    private java.util.List < VServerGroups> vServerGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    private CreateScalingGroupRequest(Builder builder) {
        super(builder);
        this.albServerGroups = builder.albServerGroups;
        this.allocationStrategy = builder.allocationStrategy;
        this.azBalance = builder.azBalance;
        this.clientToken = builder.clientToken;
        this.compensateWithOnDemand = builder.compensateWithOnDemand;
        this.containerGroupId = builder.containerGroupId;
        this.customPolicyARN = builder.customPolicyARN;
        this.DBInstanceIds = builder.DBInstanceIds;
        this.DBInstances = builder.DBInstances;
        this.defaultCooldown = builder.defaultCooldown;
        this.desiredCapacity = builder.desiredCapacity;
        this.groupDeletionProtection = builder.groupDeletionProtection;
        this.groupType = builder.groupType;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckTypes = builder.healthCheckTypes;
        this.instanceId = builder.instanceId;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateOverrides = builder.launchTemplateOverrides;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.lifecycleHooks = builder.lifecycleHooks;
        this.loadBalancerConfigs = builder.loadBalancerConfigs;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxInstanceLifetime = builder.maxInstanceLifetime;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.multiAZPolicy = builder.multiAZPolicy;
        this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removalPolicies = builder.removalPolicies;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupName = builder.scalingGroupName;
        this.scalingPolicy = builder.scalingPolicy;
        this.serverGroups = builder.serverGroups;
        this.spotAllocationStrategy = builder.spotAllocationStrategy;
        this.spotInstancePools = builder.spotInstancePools;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.syncAlarmRuleToCms = builder.syncAlarmRuleToCms;
        this.tags = builder.tags;
        this.vServerGroups = builder.vServerGroups;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return albServerGroups
     */
    public java.util.List < AlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return compensateWithOnDemand
     */
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return customPolicyARN
     */
    public String getCustomPolicyARN() {
        return this.customPolicyARN;
    }

    /**
     * @return DBInstanceIds
     */
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    /**
     * @return DBInstances
     */
    public java.util.List < DBInstances> getDBInstances() {
        return this.DBInstances;
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
     * @return groupDeletionProtection
     */
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
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
    public java.util.List < String > getHealthCheckTypes() {
        return this.healthCheckTypes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
    public java.util.List < LaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return lifecycleHooks
     */
    public java.util.List < LifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    /**
     * @return loadBalancerConfigs
     */
    public java.util.List < LoadBalancerConfigs> getLoadBalancerConfigs() {
        return this.loadBalancerConfigs;
    }

    /**
     * @return loadBalancerIds
     */
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removalPolicies
     */
    public java.util.List < String > getRemovalPolicies() {
        return this.removalPolicies;
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
     * @return serverGroups
     */
    public java.util.List < ServerGroups> getServerGroups() {
        return this.serverGroups;
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
     * @return syncAlarmRuleToCms
     */
    public Boolean getSyncAlarmRuleToCms() {
        return this.syncAlarmRuleToCms;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vServerGroups
     */
    public java.util.List < VServerGroups> getVServerGroups() {
        return this.vServerGroups;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<CreateScalingGroupRequest, Builder> {
        private java.util.List < AlbServerGroups> albServerGroups; 
        private String allocationStrategy; 
        private Boolean azBalance; 
        private String clientToken; 
        private Boolean compensateWithOnDemand; 
        private String containerGroupId; 
        private String customPolicyARN; 
        private String DBInstanceIds; 
        private java.util.List < DBInstances> DBInstances; 
        private Integer defaultCooldown; 
        private Integer desiredCapacity; 
        private Boolean groupDeletionProtection; 
        private String groupType; 
        private String healthCheckType; 
        private java.util.List < String > healthCheckTypes; 
        private String instanceId; 
        private String launchTemplateId; 
        private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides; 
        private String launchTemplateVersion; 
        private java.util.List < LifecycleHooks> lifecycleHooks; 
        private java.util.List < LoadBalancerConfigs> loadBalancerConfigs; 
        private String loadBalancerIds; 
        private Integer maxInstanceLifetime; 
        private Integer maxSize; 
        private Integer minSize; 
        private String multiAZPolicy; 
        private Integer onDemandBaseCapacity; 
        private Integer onDemandPercentageAboveBaseCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < String > removalPolicies; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String scalingGroupName; 
        private String scalingPolicy; 
        private java.util.List < ServerGroups> serverGroups; 
        private String spotAllocationStrategy; 
        private Integer spotInstancePools; 
        private Boolean spotInstanceRemedy; 
        private Boolean syncAlarmRuleToCms; 
        private java.util.List < Tags> tags; 
        private java.util.List < VServerGroups> vServerGroups; 
        private String vSwitchId; 
        private java.util.List < String > vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingGroupRequest request) {
            super(request);
            this.albServerGroups = request.albServerGroups;
            this.allocationStrategy = request.allocationStrategy;
            this.azBalance = request.azBalance;
            this.clientToken = request.clientToken;
            this.compensateWithOnDemand = request.compensateWithOnDemand;
            this.containerGroupId = request.containerGroupId;
            this.customPolicyARN = request.customPolicyARN;
            this.DBInstanceIds = request.DBInstanceIds;
            this.DBInstances = request.DBInstances;
            this.defaultCooldown = request.defaultCooldown;
            this.desiredCapacity = request.desiredCapacity;
            this.groupDeletionProtection = request.groupDeletionProtection;
            this.groupType = request.groupType;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckTypes = request.healthCheckTypes;
            this.instanceId = request.instanceId;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateOverrides = request.launchTemplateOverrides;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.lifecycleHooks = request.lifecycleHooks;
            this.loadBalancerConfigs = request.loadBalancerConfigs;
            this.loadBalancerIds = request.loadBalancerIds;
            this.maxInstanceLifetime = request.maxInstanceLifetime;
            this.maxSize = request.maxSize;
            this.minSize = request.minSize;
            this.multiAZPolicy = request.multiAZPolicy;
            this.onDemandBaseCapacity = request.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = request.onDemandPercentageAboveBaseCapacity;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removalPolicies = request.removalPolicies;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupName = request.scalingGroupName;
            this.scalingPolicy = request.scalingPolicy;
            this.serverGroups = request.serverGroups;
            this.spotAllocationStrategy = request.spotAllocationStrategy;
            this.spotInstancePools = request.spotInstancePools;
            this.spotInstanceRemedy = request.spotInstanceRemedy;
            this.syncAlarmRuleToCms = request.syncAlarmRuleToCms;
            this.tags = request.tags;
            this.vServerGroups = request.vServerGroups;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchIds = request.vSwitchIds;
        } 

        /**
         * The Application Load Balancer (ALB) server groups.
         */
        public Builder albServerGroups(java.util.List < AlbServerGroups> albServerGroups) {
            this.putQueryParameter("AlbServerGroups", albServerGroups);
            this.albServerGroups = albServerGroups;
            return this;
        }

        /**
         * The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances. This parameter takes effect only when you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:
         * <p>
         * 
         * *   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of instances.
         * *   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.
         * 
         * Default value: priority.
         */
        public Builder allocationStrategy(String allocationStrategy) {
            this.putQueryParameter("AllocationStrategy", allocationStrategy);
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * Specifies whether to evenly distribute instances in the scaling group across multiple zones. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >  If you set `MultiAZPolicy` to `COMPOSABLE` and enable `AzBalance` to `true`, this setting has an equivalent effect to setting `MultiAZPolicy` to `BALANCE`.
         * 
         * Default value: false.
         */
        public Builder azBalance(Boolean azBalance) {
            this.putQueryParameter("AzBalance", azBalance);
            this.azBalance = azBalance;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to automatically create pay-as-you-go instances to meet the requirement on the number of ECS instances when the expected capacity of preemptible instances cannot be provided due to reasons such as cost-related issues and insufficient resources. This parameter is available only if you set the MultiAZPolicy parameter to COST_OPTIMIZED. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: true.
         */
        public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.putQueryParameter("CompensateWithOnDemand", compensateWithOnDemand);
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }

        /**
         * The ID of the elastic container instance.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the custom scale-in policy (Function). This parameter is available only if you specify CustomPolicy as the first step to remove instances.
         */
        public Builder customPolicyARN(String customPolicyARN) {
            this.putQueryParameter("CustomPolicyARN", customPolicyARN);
            this.customPolicyARN = customPolicyARN;
            return this;
        }

        /**
         * The IDs of the ApsaraDB RDS instances that you want to associate with the scaling group. The value can be a JSON array that contains multiple ApsaraDB RDS instance IDs. Separate multiple IDs with commas (,).
         * <p>
         * 
         * You can associate only a limited number of ApsaraDB RDS instances with a scaling group. Go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the maximum number of ApsaraDB RDS instances that you can associate with a scaling group.
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }

        /**
         * The databases that you want to attach to the scaling group.
         */
        public Builder DBInstances(java.util.List < DBInstances> DBInstances) {
            this.putQueryParameter("DBInstances", DBInstances);
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * The cooldown period of the scaling group after a scaling activity is complete in the scaling group. Valid values: 0 to 86400. Unit: seconds.
         * <p>
         * 
         * During the cooldown period, Auto Scaling does not execute scaling activities that are triggered by CloudMonitor event-triggered tasks.
         * 
         * Default value: 300.
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the specified expected number of ECS instances. The DesiredCapacity value cannot be greater than the MaxSize value or less than the MinSize value.
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection for the scaling group. Valid values:
         * <p>
         * 
         * *   true: enables deletion protection for the scaling group. This way, the scaling group cannot be deleted.
         * *   false: disables deletion protection for the scaling group.
         * 
         * Default value: false.
         */
        public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
            this.putQueryParameter("GroupDeletionProtection", groupDeletionProtection);
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }

        /**
         * The type of the instances that are managed by the scaling group. Valid values:
         * <p>
         * 
         * *   ECS: ECS instances.
         * *   ECI: elastic container instances.
         * 
         * Default value: ECS.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The health check mode of the scaling group. Valid values:
         * <p>
         * 
         * *   NONE: Auto Scaling does not check the health status of instances.
         * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
         * *   ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.
         * *   LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.
         * 
         * Default value: ECS.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * The health check modes of the scaling group. Valid values:
         * <p>
         * 
         * *   NONE: Auto Scaling does not check the health status of instances.
         * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
         * *   ECI: Auto Scaling checks the health status of elastic container instances in the scaling group.
         * *   LOAD_BALANCER: Auto Scaling checks the health status of instances based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.
         * 
         * >  HealthCheckTypes has the same effect as `HealthCheckType`. You can select one of them to specify based on your business requirements. If you specify `HealthCheckType`, `HealthCheckTypes` is ignored. HealthCheckTypes is optional.
         * 
         * Default value: ECS.
         */
        public Builder healthCheckTypes(java.util.List < String > healthCheckTypes) {
            this.putQueryParameter("HealthCheckTypes", healthCheckTypes);
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }

        /**
         * The ID of the ECS instance. When you create a scaling group, you can specify an existing ECS instance. Auto Scaling obtains the configurations of the ECS instance and automatically creates a scaling configuration from the obtained configurations.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the launch template that provides instance configurations for Auto Scaling to create instances.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * Details of the instance types that you specify by using the Extended Configurations feature of the launch template.
         */
        public Builder launchTemplateOverrides(java.util.List < LaunchTemplateOverrides> launchTemplateOverrides) {
            this.putQueryParameter("LaunchTemplateOverrides", launchTemplateOverrides);
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }

        /**
         * The version number of the launch template. Valid values:
         * <p>
         * 
         * *   A fixed template version number.
         * *   Default: the default template version.
         * *   Latest: the latest template version.
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The lifecycle hooks.
         */
        public Builder lifecycleHooks(java.util.List < LifecycleHooks> lifecycleHooks) {
            this.putQueryParameter("LifecycleHooks", lifecycleHooks);
            this.lifecycleHooks = lifecycleHooks;
            return this;
        }

        /**
         * The load balancer configurations.
         */
        public Builder loadBalancerConfigs(java.util.List < LoadBalancerConfigs> loadBalancerConfigs) {
            this.putQueryParameter("LoadBalancerConfigs", loadBalancerConfigs);
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }

        /**
         * The IDs of the CLB instances that you want to associate with the scaling group. The value can be a JSON array that contains multiple CLB instance IDs. Separate multiple IDs with commas (,).
         * <p>
         * 
         * You can associate only a limited number of CLB instances with a scaling group. Go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check the maximum number of CLB instances that you can associate with a scaling group.
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * The maximum life span of an instance in the scaling group. Unit: seconds.
         * <p>
         * 
         * Valid values: 86400 to the value of the Integer.maxValue parameter.
         * 
         * Default value: null.
         */
        public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
            this.putQueryParameter("MaxInstanceLifetime", maxInstanceLifetime);
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        /**
         * The maximum number of instances that can be contained in the scaling group. When the total number of ECS instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances from the scaling group until the total number equals the maximum number.
         * <p>
         * 
         * The value range of MaxSize is directly correlated with the degree of dependency your business has on Auto Scaling. You can go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas) to check **the maximum number of instances that a single scaling group can contain.**
         * 
         * If **a single scaling group can contain up to 2,000 ECS instances**, the value range of MaxSize is 0 to 2,000.
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * The minimum number of instances that must be contained in the scaling group. When the total number of ECS instances in the scaling group is less than the value of MinSize, Auto Scaling automatically creates ECS instances in the scaling group until the total number reaches the minimum number.
         * <p>
         * 
         * >  The value of MinSize must be less than or equal to the value of MaxSize.
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * The scaling policy for ECS instances in the multi-zone scaling group. Valid values:
         * <p>
         * 
         * *   PRIORITY: scale ECS instances based on the priority of the vSwitches specified by VSwitchIds. Auto Scaling preferentially scales instances in the zone where the vSwitch of the highest priority resides. If the scaling fails, Auto Scaling scales instances in the zone where the vSwitch of the next highest priority resides.
         * 
         * *   COST_OPTIMIZED: create ECS instances that have the lowest unit price of vCPUs during scale-out events and removes ECS instances that have the highest unit price of vCPUs during scale-in events. If you specify preemptible instance types in your scaling configuration, Auto Scaling will preferentially create preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances in the case that preemptible instances cannot be created due to limited stock.
         * 
         *     **
         * 
         *     **Note** The COST_OPTIMIZED setting takes effect only when your scaling configuration contains multiple instance types or specifically contains preemptible instance types.
         * 
         * *   BALANCE: evenly distribute ECS instances across the zones that are specified for the scaling group. If ECS instances are unevenly distributed across the specified zones due to insufficient inventory, you can call the [RebalanceInstance](~~71516~~) operation to evenly distribute the instances across the zones.
         * 
         *     **
         * 
         *     **Note** When you set `MultiAZPolicy` to `BALANCE`, this setting has an equivalent effect to setting `MultiAZPolicy` to `COMPOSABLE` and enabling `AzBalance` to `true`.
         * 
         * *   COMPOSABLE: combine the preceding policies into a custom scaling policy based on your business requirements. Alternatively, you can specify custom parameters to finely control the capacity of the scaling group.
         * 
         * Default value: PRIORITY.
         */
        public Builder multiAZPolicy(String multiAZPolicy) {
            this.putQueryParameter("MultiAZPolicy", multiAZPolicy);
            this.multiAZPolicy = multiAZPolicy;
            return this;
        }

        /**
         * The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.
         */
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.putQueryParameter("OnDemandBaseCapacity", onDemandBaseCapacity);
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.
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
         * The region ID of the scaling group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance removal policies. Valid values:
         * <p>
         * 
         * *   OldestInstance: removes ECS instances that are added at the earliest point in time to the scaling group.
         * *   NewestInstance: removes ECS instances that are most recently added to the scaling group.
         * *   OldestScalingConfiguration: removes ECS instances that are created based on the earliest scaling configuration.
         * *   CustomPolicy: removes ECS instances based on the custom scale-in policy (Function).
         * 
         * The scaling configuration source specified by the OldestScalingConfiguration setting can be a scaling configuration or a launch template. The CustomPolicy setting takes effect only if you specify it as the first step to remove instances. If you specify CustomPolicy, you must also specify the CustomPolicyARN parameter.
         * 
         * > The removal of ECS instances from a scaling group is also affected by the value of the MultiAZPolicy parameter. For more information, see the [Configure a combination policy for removing instances](~~254822~~) topic.
         */
        public Builder removalPolicies(java.util.List < String > removalPolicies) {
            this.putQueryParameter("RemovalPolicies", removalPolicies);
            this.removalPolicies = removalPolicies;
            return this;
        }

        /**
         * The ID of the resource group to which you want to add the scaling group.
         * <p>
         * 
         * > If you specify this parameter, new scaling groups are added to the specified resource group. If you do not specify this parameter, new scaling groups are added to the default resource group.
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
         * The name of the scaling group. The name of each scaling group must be unique in a region.
         * <p>
         * 
         * The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.
         * 
         * If you do not specify this parameter, the value of the ScalingGroupId parameter is used.
         */
        public Builder scalingGroupName(String scalingGroupName) {
            this.putQueryParameter("ScalingGroupName", scalingGroupName);
            this.scalingGroupName = scalingGroupName;
            return this;
        }

        /**
         * The reclaim mode of the scaling group. Valid values:
         * <p>
         * 
         * *   recycle: the economical mode
         * 
         * *   release: the release mode
         * 
         * *   forcerelease: the forced release mode
         * 
         *     **
         * 
         *     **Note** If you set the value to forcerelease, Auto Scaling will forcibly release the ECS instances that are in the `Running` state during the scale-out events. Forced release equates to an immediate power-off, resulting in the irreversible deletion of all ephemeral data stored on the instance. Once executed, this action cannot be undone and the lost data cannot be recovered. Exercise caution when you select this option.
         * 
         * *   forcerecycle: the forced recycle mode
         * 
         *     **
         * 
         *     **Note** If you set the value to forcerecycle, Auto Scaling will forcibly shut down the ECS instances that are in the `Running` state during the scale-out events. Forced recycle equates to an immediate power-off, resulting in the irreversible deletion of all ephemeral data stored on the instance. Once executed, this action cannot be undone and the lost data cannot be recovered. Exercise caution when you select this option.
         * 
         * ScalingPolicy specifies the reclaim mode of the scaling group. RemovePolicy of the RemoveInstances operation specifies the specific instance removal action. For more information, see [RemoveInstances](~~25955~~).
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * The server groups.
         * <p>
         * 
         * >  You cannot use AlbServerGroups and ServerGroups to specify the same server group.
         */
        public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
            this.putQueryParameter("ServerGroups", serverGroups);
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter takes effect only if you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:
         * <p>
         * 
         * *   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of preemptible instances.
         * *   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.
         * 
         * Default value: priority.
         */
        public Builder spotAllocationStrategy(String spotAllocationStrategy) {
            this.putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }

        /**
         * The number of available instance types. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest cost in the scaling group. Valid values: 1 to 10.
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            this.putQueryParameter("SpotInstancePools", spotInstancePools);
            this.spotInstancePools = spotInstancePools;
            return this;
        }

        /**
         * Specifies whether to supplement preemptible instances. If you set this parameter to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives a system message which indicates that the preemptible instance is to be reclaimed.
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy);
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * > This parameter is unavailable.
         */
        public Builder syncAlarmRuleToCms(Boolean syncAlarmRuleToCms) {
            this.putQueryParameter("SyncAlarmRuleToCms", syncAlarmRuleToCms);
            this.syncAlarmRuleToCms = syncAlarmRuleToCms;
            return this;
        }

        /**
         * The tags that you want to add to the scaling group.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The backend vServer group that you want to associate with the scaling group.
         */
        public Builder vServerGroups(java.util.List < VServerGroups> vServerGroups) {
            this.putQueryParameter("VServerGroups", vServerGroups);
            this.vServerGroups = vServerGroups;
            return this;
        }

        /**
         * The ID of the vSwitch. If you specify the VSwitchId parameter, the network type of the scaling group is VPC.
         * <p>
         * 
         * > If you do not specify the VSwitchId or VSwitchIds parameter, the network type of the scaling group is classic network.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The IDs of the vSwitches. If you specify VSwitchIds, VSwitchId is ignored. If you specify VSwitchIds, the network type of the scaling group is VPC.
         * <p>
         * 
         * If you specify multiple vSwitches, take note of the following items:
         * 
         * *   The vSwitches must belong to the same VPC.
         * *   The vSwitches can belong to different zones.
         * *   vSwitches are sorted in ascending order based on their priorities. The first vSwitch has the highest priority. If Auto Scaling fails to create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling attempts to create ECS instances in the zone where the vSwitch of the next highest priority resides.
         * 
         * >  If you do not specify VSwitchId or VSwitchIds for your scaling group, the network type of the scaling group is classic network.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public CreateScalingGroupRequest build() {
            return new CreateScalingGroupRequest(this);
        } 

    } 

    public static class AlbServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private AlbServerGroups(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroups create() {
            return builder().build();
        }

        /**
         * @return albServerGroupId
         */
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String albServerGroupId; 
            private Integer port; 
            private Integer weight; 

            /**
             * The ID of the ALB server group.
             * <p>
             * 
             * You can attach only a limited number of ALB server groups to a scaling group. To view the predefined quota limit or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * The port number used by each ECS instance as a backend server in the ALB server group. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the ALB server group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachMode")
        private String attachMode;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DBInstances(Builder builder) {
            this.attachMode = builder.attachMode;
            this.DBInstanceId = builder.DBInstanceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return attachMode
         */
        public String getAttachMode() {
            return this.attachMode;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String attachMode; 
            private String DBInstanceId; 
            private String type; 

            /**
             * The mode in which you want to attach the database to the scaling group. Valid values:
             * <p>
             * 
             * *   SecurityIp: the mode in which Auto Scaling automatically adds the private IP addresses of ECS instances to the IP address whitelist of the database during scale-out events. You can set the value to SecurityIp only if you set Type to RDS.
             * *   SecurityGroup: the mode in which Auto Scaling adds the security group of the applied scaling configuration to the security group whitelist of the database. This setting allows ECS instances created from the scaling configuration to access the database.
             */
            public Builder attachMode(String attachMode) {
                this.attachMode = attachMode;
                return this;
            }

            /**
             * The database ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The database type. Valid values:
             * <p>
             * 
             * *   RDS
             * *   Redis
             * *   MongoDB
             * 
             * Default value: RDS.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
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
             * The instance type that you want to use to override the instance type that is specified in the launch template.
             * <p>
             * 
             * If you want to scale instances based on the weighted capacities of the instances, you must specify both the InstanceType and WeightedCapacity parameters.
             * 
             * > This parameter is available only if you specify the LaunchTemplateId parameter.
             * 
             * You can use the InstanceType parameter to specify only instance types that are available for purchase.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum bid price of the instance type that is specified by the `InstanceType` parameter. You can specify 1 to 10 instance types by using the Extended Configurations feature of the launch template.
             * <p>
             * 
             * > This parameter is available only if you specify the `LaunchTemplateId` parameter.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The weight of the instance type. The weight specifies the capacity of an instance of the specified instance type in the scaling group. If you want to scale instances based on the weighted capacities of the instances, you must specify the WeightedCapacity parameter after you specify the InstanceType parameter.
             * <p>
             * 
             * A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.
             * 
             * Performance metrics, such as the number of vCPUs and the memory size of each instance type, may vary. You can specify different weights for different instance types based on your business requirements.
             * 
             * Example:
             * 
             * *   Current capacity: 0
             * *   Expected capacity: 6
             * *   Capacity of ecs.c5.xlarge: 4
             * 
             * To meet the expected capacity requirement, Auto Scaling must create and add two ecs.c5.xlarge instances.
             * 
             * > The capacity of the scaling group cannot exceed the sum of the maximum number of instances that is specified by the MaxSize parameter and the maximum weight of the instance types.
             * 
             * Valid values of the WeightedCapacity parameter: 1 to 500.
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
    public static class LifecycleHooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultResult")
        private String defaultResult;

        @com.aliyun.core.annotation.NameInMap("HeartbeatTimeout")
        private Integer heartbeatTimeout;

        @com.aliyun.core.annotation.NameInMap("LifecycleHookName")
        private String lifecycleHookName;

        @com.aliyun.core.annotation.NameInMap("LifecycleTransition")
        private String lifecycleTransition;

        @com.aliyun.core.annotation.NameInMap("NotificationArn")
        private String notificationArn;

        @com.aliyun.core.annotation.NameInMap("NotificationMetadata")
        private String notificationMetadata;

        private LifecycleHooks(Builder builder) {
            this.defaultResult = builder.defaultResult;
            this.heartbeatTimeout = builder.heartbeatTimeout;
            this.lifecycleHookName = builder.lifecycleHookName;
            this.lifecycleTransition = builder.lifecycleTransition;
            this.notificationArn = builder.notificationArn;
            this.notificationMetadata = builder.notificationMetadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecycleHooks create() {
            return builder().build();
        }

        /**
         * @return defaultResult
         */
        public String getDefaultResult() {
            return this.defaultResult;
        }

        /**
         * @return heartbeatTimeout
         */
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        /**
         * @return lifecycleHookName
         */
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        /**
         * @return lifecycleTransition
         */
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        /**
         * @return notificationArn
         */
        public String getNotificationArn() {
            return this.notificationArn;
        }

        /**
         * @return notificationMetadata
         */
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        public static final class Builder {
            private String defaultResult; 
            private Integer heartbeatTimeout; 
            private String lifecycleHookName; 
            private String lifecycleTransition; 
            private String notificationArn; 
            private String notificationMetadata; 

            /**
             * The action that Auto Scaling performs when the lifecycle hook times out. Valid values:
             * <p>
             * 
             * *   CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.
             * *   ABANDON: Auto Scaling releases ECS instances that are created during scale-out events, or removes ECS instances from the scaling group during scale-in events.
             * 
             * If multiple lifecycle hooks in the scaling group are triggered during scale-in events, and you set DefaultResult to ABANDON for one of the lifecycle hooks, Auto Scaling immediately performs the action after the lifecycle hook whose DefaultResult is set to ABANDON times out. In this case, other lifecycle hooks time out ahead of schedule. In other cases, Auto Scaling performs the action only after all lifecycle hooks time out. The action that Auto Scaling performs is determined by the value of DefaultResult that you specify for the lifecycle hook that most recently times out.
             * 
             * Default value: CONTINUE.
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action that is specified by DefaultResult. Valid values: 30 to 21600. Unit: seconds.
             * <p>
             * 
             * After you create a lifecycle hook, you can call the RecordLifecycleActionHeartbeat operation to extend the timeout period of the lifecycle hook. You can also call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of scheduled.
             * 
             * Default value: 600.
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * The name of the lifecycle hook. After you specify this parameter, you cannot change the name of the lifecycle hook. If you do not specify this parameter, the name of the lifecycle hook is the same as the ID of the lifecycle hook.
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * The type of the scaling activity to which you want to apply the lifecycle hook. Valid values:
             * <p>
             * 
             * *   SCALE_OUT
             * *   SCALE_IN
             * 
             * >  If you specify lifecycle hooks for the scaling group, you must specify LifecycleTransition. Other parameters are optional.
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * The identifier of the notification recipient party when the lifecycle hook takes effect. You can specify a Message Service (MNS) topic or queue as the notification recipient party. Specify the value in the acs:ess:{region}:{account-id}:{resource-relative-id} format.
             * <p>
             * 
             * *   region: the region ID of the scaling group
             * *   account-id: the ID of your Alibaba Cloud account.
             * 
             * Examples:
             * 
             * *   MNS queue: acs:ess:{region}:{account-id}:queue/{queuename}
             * *   MNS topic: acs:ess:{region}:{account-id}:topic/{topicname}
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * The fixed string that you want to include in a notification. When a lifecycle hook takes effect, Auto Scaling sends a notification. The fixed string can contain up to 4,096 characters in length. When Auto Scaling sends a notification to the recipient party, it includes predefined notification metadata into the notification. This helps in managing and labeling notifications of different categories. notificationmetadata takes effect only if you specify notificationarn.
             */
            public Builder notificationMetadata(String notificationMetadata) {
                this.notificationMetadata = notificationMetadata;
                return this;
            }

            public LifecycleHooks build() {
                return new LifecycleHooks(this);
            } 

        } 

    }
    public static class LoadBalancerConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private LoadBalancerConfigs(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerConfigs create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer weight; 

            /**
             * The ID of the CLB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The weight of each ECS instance as a backend server in the CLB backend server group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public LoadBalancerConfigs build() {
                return new LoadBalancerConfigs(this);
            } 

        } 

    }
    public static class ServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private ServerGroups(Builder builder) {
            this.port = builder.port;
            this.serverGroupId = builder.serverGroupId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroups create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String serverGroupId; 
            private String type; 
            private Integer weight; 

            /**
             * The port number used by each ECS instance as backend server in the vServer group. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The type of the server group. Valid values:
             * <p>
             * 
             * *   ALB
             * *   NLB
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of each ECS instance as a backend server in the server group. Valid values: 0 to 100.
             * <p>
             * 
             * If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServerGroups build() {
                return new ServerGroups(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Propagate")
        private Boolean propagate;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.propagate = builder.propagate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return propagate
         */
        public Boolean getPropagate() {
            return this.propagate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Boolean propagate; 
            private String value; 

            /**
             * The tag key that you want to add to the scaling group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Specifies whether to propagate the tag that you want to add to the scaling group. Valid values:
             * <p>
             * 
             * *   true: propagates the tag to only instances that are newly created.
             * *   false: does not propagate the tag to any instances.
             * 
             * Default value: false.
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

            /**
             * The tag value that you want to add to the scaling group.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VServerGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttributes(Builder builder) {
            this.port = builder.port;
            this.vServerGroupId = builder.vServerGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String vServerGroupId; 
            private Integer weight; 

            /**
             * The port number used by each ECS instance as a backend server in the vServer group. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the vServer group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * The weight of each ECS instance as a backend server in the vServer group. If you increase the weight for an ECS instance, the number of requests that are forwarded to the ECS instance also increases. If you set the weight for an ECS instance to 0, no requests are forwarded to the ECS instance. Valid values: 0 to 100.
             * <p>
             * 
             * Default value: 50.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VServerGroupAttributes build() {
                return new VServerGroupAttributes(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupAttributes")
        private java.util.List < VServerGroupAttributes> vServerGroupAttributes;

        private VServerGroups(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.vServerGroupAttributes = builder.vServerGroupAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return vServerGroupAttributes
         */
        public java.util.List < VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttributes> vServerGroupAttributes; 

            /**
             * The ID of the CLB instance to which the backend vServer group belongs.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The attributes of the backend vServer group.
             */
            public Builder vServerGroupAttributes(java.util.List < VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
}
