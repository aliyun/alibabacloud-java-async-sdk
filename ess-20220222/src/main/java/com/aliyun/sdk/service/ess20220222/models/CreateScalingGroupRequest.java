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
 * {@link CreateScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingGroupRequest</p>
 */
public class CreateScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
    private java.util.List<AlbServerGroups> albServerGroups;

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
    private java.util.List<DBInstances> DBInstances;

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
    private java.util.List<String> healthCheckTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("LifecycleHooks")
    private java.util.List<LifecycleHooks> lifecycleHooks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerConfigs")
    private java.util.List<LoadBalancerConfigs> loadBalancerConfigs;

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
    private java.util.List<String> removalPolicies;

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
    private java.util.List<ServerGroups> serverGroups;

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
    @com.aliyun.core.annotation.NameInMap("SyncAlarmRuleToCms")
    private Boolean syncAlarmRuleToCms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroups")
    private java.util.List<VServerGroups> vServerGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneShiftPolicy")
    private ZoneShiftPolicy zoneShiftPolicy;

    private CreateScalingGroupRequest(Builder builder) {
        super(builder);
        this.albServerGroups = builder.albServerGroups;
        this.allocationStrategy = builder.allocationStrategy;
        this.autoRebalance = builder.autoRebalance;
        this.azBalance = builder.azBalance;
        this.balanceMode = builder.balanceMode;
        this.capacityOptions = builder.capacityOptions;
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
        this.stopInstanceTimeout = builder.stopInstanceTimeout;
        this.syncAlarmRuleToCms = builder.syncAlarmRuleToCms;
        this.tags = builder.tags;
        this.vServerGroups = builder.vServerGroups;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchIds = builder.vSwitchIds;
        this.zoneShiftPolicy = builder.zoneShiftPolicy;
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
    public java.util.List<AlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
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
    public java.util.List<DBInstances> getDBInstances() {
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
    public java.util.List<String> getHealthCheckTypes() {
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
     * @return lifecycleHooks
     */
    public java.util.List<LifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    /**
     * @return loadBalancerConfigs
     */
    public java.util.List<LoadBalancerConfigs> getLoadBalancerConfigs() {
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
    public java.util.List<String> getRemovalPolicies() {
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
    public java.util.List<ServerGroups> getServerGroups() {
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
     * @return stopInstanceTimeout
     */
    public Integer getStopInstanceTimeout() {
        return this.stopInstanceTimeout;
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
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vServerGroups
     */
    public java.util.List<VServerGroups> getVServerGroups() {
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
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return zoneShiftPolicy
     */
    public ZoneShiftPolicy getZoneShiftPolicy() {
        return this.zoneShiftPolicy;
    }

    public static final class Builder extends Request.Builder<CreateScalingGroupRequest, Builder> {
        private java.util.List<AlbServerGroups> albServerGroups; 
        private String allocationStrategy; 
        private Boolean autoRebalance; 
        private Boolean azBalance; 
        private String balanceMode; 
        private CapacityOptions capacityOptions; 
        private String clientToken; 
        private Boolean compensateWithOnDemand; 
        private String containerGroupId; 
        private String customPolicyARN; 
        private String DBInstanceIds; 
        private java.util.List<DBInstances> DBInstances; 
        private Integer defaultCooldown; 
        private Integer desiredCapacity; 
        private Boolean groupDeletionProtection; 
        private String groupType; 
        private String healthCheckType; 
        private java.util.List<String> healthCheckTypes; 
        private String instanceId; 
        private String launchTemplateId; 
        private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides; 
        private String launchTemplateVersion; 
        private java.util.List<LifecycleHooks> lifecycleHooks; 
        private java.util.List<LoadBalancerConfigs> loadBalancerConfigs; 
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
        private java.util.List<String> removalPolicies; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String scalingGroupName; 
        private String scalingPolicy; 
        private java.util.List<ServerGroups> serverGroups; 
        private String spotAllocationStrategy; 
        private Integer spotInstancePools; 
        private Boolean spotInstanceRemedy; 
        private Integer stopInstanceTimeout; 
        private Boolean syncAlarmRuleToCms; 
        private java.util.List<Tags> tags; 
        private java.util.List<VServerGroups> vServerGroups; 
        private String vSwitchId; 
        private java.util.List<String> vSwitchIds; 
        private ZoneShiftPolicy zoneShiftPolicy; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingGroupRequest request) {
            super(request);
            this.albServerGroups = request.albServerGroups;
            this.allocationStrategy = request.allocationStrategy;
            this.autoRebalance = request.autoRebalance;
            this.azBalance = request.azBalance;
            this.balanceMode = request.balanceMode;
            this.capacityOptions = request.capacityOptions;
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
            this.stopInstanceTimeout = request.stopInstanceTimeout;
            this.syncAlarmRuleToCms = request.syncAlarmRuleToCms;
            this.tags = request.tags;
            this.vServerGroups = request.vServerGroups;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchIds = request.vSwitchIds;
            this.zoneShiftPolicy = request.zoneShiftPolicy;
        } 

        /**
         * <p>The collection of information about the ALB server groups.</p>
         */
        public Builder albServerGroups(java.util.List<AlbServerGroups> albServerGroups) {
            this.putQueryParameter("AlbServerGroups", albServerGroups);
            this.albServerGroups = albServerGroups;
            return this;
        }

        /**
         * <p>The capacity allocation policy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution policy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit price per vCPU of the instance types in ascending order.</li>
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
         * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for the zone-balanced scaling group. Valid values:</p>
         * <ul>
         * <li>false: Does not enable automatic balancing for the scaling group.</li>
         * <li>true: Enables automatic balancing for the scaling group. The scaling group automatically detects the capacity across zones. When the capacity is unbalanced across zones, the scaling group proactively scales out or in to rebalance the capacity across zones.</li>
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
         * <blockquote>
         * <p>If the MultiAZPolicy parameter is set to COMPOSABLE and the AzBalance parameter is set to true, the effect is the same as when the MultiAZPolicy parameter is set to BALANCE.</p>
         * </blockquote>
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
         * <li><p>BalancedBestEffort: When resource creation fails in a zone, the system falls back to other zones to ensure best-effort delivery of resources.</p>
         * </li>
         * <li><p>BalancedOnly: When resource creation fails in a zone, the system does not fall back to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
         * <ul>
         * <li>true: allows the creation.</li>
         * <li>false: does not allow the creation.</li>
         * </ul>
         * <p>Default value: true.</p>
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
         * <p>The ECI instance ID, which is the container group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-uf6fonnghi50u374****</p>
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * <p>The ARN of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy configured in RemovalPolicies is CustomPolicy.</p>
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
         * <p>The IDs of the ApsaraDB RDS instances. The value can be a JSON array that contains multiple ApsaraDB RDS instance IDs. Separate multiple IDs with commas (,). </p>
         * <p>&lt;props=&quot;china&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;The maximum number of ApsaraDB RDS instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of ApsaraDB RDS instances that can be associated with a scaling group</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-bp142f86de0t7****&quot;, &quot;rm-bp18l1z42ar4o****&quot;, &quot;rm-bp1lqr97h4aqk****&quot;]</p>
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }

        /**
         * <p>The list of databases associated with the scaling group.</p>
         */
        public Builder DBInstances(java.util.List<DBInstances> DBInstances) {
            this.putQueryParameter("DBInstances", DBInstances);
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>The cooldown time after a scaling activity (adding or removing instances) is completed. Valid values: 0 to 86400. Unit: seconds.</p>
         * <p>During the cooldown time, the scaling group does not execute other scaling activities. This parameter takes effect only for scaling activities triggered by CloudMonitor event-triggered tasks.  </p>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * <p>The expected number of instances in the scaling group. The scaling group automatically maintains the number of instances at the expected number. The value cannot be greater than MaxSize or less than MinSize.</p>
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
         * <p>Specifies whether to enable deletion protection for the scaling group. Valid values:</p>
         * <ul>
         * <li>true: enables deletion protection for the scaling group. In this case, the scaling group cannot be deleted.</li>
         * <li>false: disables deletion protection for the scaling group.</li>
         * </ul>
         * <p>Default value: false.</p>
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
         * <p>The type of instances managed by the scaling group. Valid values:</p>
         * <ul>
         * <li><p>ECS: the scaling group manages ECS instances.</p>
         * </li>
         * <li><p>ECI: the scaling group manages ECI instances.</p>
         * </li>
         * </ul>
         * <p>Default value: ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The health check type of the scaling group. Valid values:</p>
         * <ul>
         * <li>NONE: disables health checks.</li>
         * <li>ECS: performs health checks on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
         * <li>LOAD_BALANCER: determines the health status of instances based on the health check results of the load balancer. CLB is not supported.</li>
         * </ul>
         * <p>Default value: ECS.</p>
         * <blockquote>
         * <p>If you want to enable both instance health checks and load balancer health checks, use the <code>HealthCheckTypes</code> parameter.</p>
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
         * <p>You can set multiple values for this parameter to enable multiple health check options. If the HealthCheckType parameter is specified, this parameter is ignored.</p>
         * </blockquote>
         */
        public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
            this.putQueryParameter("HealthCheckTypes", healthCheckTypes);
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }

        /**
         * <p>The ID of the instance. When you create a scaling group, Auto Scaling obtains the required configuration information from the specified instance and automatically creates a scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>i-28wt4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the launch template. This parameter is used to specify the launch template from which the scaling group obtains launch configurations.</p>
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
         * <p>The version of the launch template. Valid values:</p>
         * <ul>
         * <li><p>A specific version number.</p>
         * </li>
         * <li><p>Default: always uses the default version of the launch template.</p>
         * </li>
         * <li><p>Latest: always uses the latest version of the launch template.</p>
         * </li>
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
         * <p>The list of lifecycle hook information.</p>
         */
        public Builder lifecycleHooks(java.util.List<LifecycleHooks> lifecycleHooks) {
            this.putQueryParameter("LifecycleHooks", lifecycleHooks);
            this.lifecycleHooks = lifecycleHooks;
            return this;
        }

        /**
         * <p>The list of load balancing configurations.</p>
         */
        public Builder loadBalancerConfigs(java.util.List<LoadBalancerConfigs> loadBalancerConfigs) {
            this.putQueryParameter("LoadBalancerConfigs", loadBalancerConfigs);
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }

        /**
         * <p>The IDs of the Classic Load Balancer (CLB) instances. The value can be a JSON array that contains multiple CLB instance IDs. Separate multiple IDs with commas (,).</p>
         * <p>&lt;props=&quot;china&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;The maximum number of CLB instances that can be associated with a scaling group depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of load balancing instances that can be associated with a scaling group</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;lb-bp1u7etiogg38yvwz****&quot;, &quot;lb-bp168cqrux9ai9l7f****&quot;, &quot;lb-bp1jv3m9zvj22ufxp****&quot;]</p>
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
         * <p>Valid values: [86400, Integer.maxValue].</p>
         * <p>Default value: null.</p>
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
         * <p>The maximum number of instances in the scaling group. If the number of instances in the scaling group is greater than the value of MaxSize, Auto Scaling automatically removes instances. </p>
         * <p>&lt;props=&quot;china&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a> to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;The value range of MaxSize depends on your Auto Scaling usage. Go to Quota Center to check the quota for the <strong>maximum number of instances in a scaling group</strong>.</p>
         * <p>If the quota for the <strong>maximum number of instances in a scaling group</strong> is 2000, the value range of MaxSize is 0 to 2000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>The minimum number of instances in the scaling group. If the number of instances in the scaling group is less than the value of MinSize, Auto Scaling automatically creates instances. </p>
         * <blockquote>
         * <p>The value of MinSize must be less than or equal to the value of MaxSize.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * <p>The multi-zone scaling policy for ECS instances in the scaling group. Valid values: </p>
         * <ul>
         * <li><p>PRIORITY: the vSwitches specified by VSwitchIds are prioritized. Auto Scaling preferentially attempts to scale ECS instances in the zone where the highest-priority vSwitch resides. If the scaling fails, Auto Scaling automatically attempts to scale instances in the zone of the next highest-priority vSwitch.  </p>
         * </li>
         * <li><p>COST_OPTIMIZED: during scale-out, Auto Scaling attempts to create ECS instances in ascending order of vCPU unit price. During scale-in, Auto Scaling attempts to remove ECS instances in descending order of vCPU unit price. If the scaling configuration settings specify multiple instance types that use the preemptible billing method, spot instances are preferentially created. You can use the CompensateWithOnDemand parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory or other reasons. </p>
         * <blockquote>
         * <p>COST_OPTIMIZED takes effect only when the scaling configuration settings specify multiple instance types or use spot instances. </p>
         * </blockquote>
         * </li>
         * <li><p>BALANCE: evenly distributes ECS instances across the zones specified for the scaling group. If the instances are unevenly allocated across zones due to insufficient inventory or other reasons, you can invoke the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstance</a> operation to balance the resources.</p>
         * <blockquote>
         * <p>If the <code>MultiAZPolicy</code> parameter is set to <code>BALANCE</code>, the effect is the same as when the <code>MultiAZPolicy</code> parameter is set to <code>COMPOSABLE</code> and the <code>AzBalance</code> parameter is set to <code>true</code>. </p>
         * </blockquote>
         * </li>
         * <li><p>COMPOSABLE: a combined policy that allows you to combine the preceding multi-zone scaling policies for ECS instances based on your needs. You can also specify additional parameters to control the capacity of the scaling group in a more fine-grained manner.</p>
         * </li>
         * </ul>
         * <p>Default value: PRIORITY.</p>
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
         * <p>The percentage of pay-as-you-go instances in the excess instances after the scaling group meets the minimum number of pay-as-you-go instances (OnDemandBaseCapacity). Valid values: 0 to 100.</p>
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
         * <p>The region ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The filtering policy for the instance removal policy. Valid values:</p>
         * <ul>
         * <li>OldestInstance: removes the ECS instances that were added to the scaling group at the earliest point in time.</li>
         * <li>NewestInstance: removes the ECS instances that were added to the scaling group at the latest point in time.</li>
         * <li>OldestScalingConfiguration: removes the ECS instances that were created based on the earliest scaling configuration.</li>
         * <li>CustomPolicy: removes ECS instances based on a custom scale-in policy function.</li>
         * </ul>
         * <p>The scaling configuration mentioned in OldestScalingConfiguration refers to the instance configuration source in the scaling group, including scaling configurations and launch templates. CustomPolicy can only be set as the first removal policy. If you specify CustomPolicy, you must also specify the CustomPolicyARN parameter.</p>
         * <blockquote>
         * <p>The removal of ECS instances from a scaling group is also affected by the multi-zone scaling policy (MultiAZPolicy) of the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/254822.html">Configure a combined policy for removing instances</a>.</p>
         * </blockquote>
         */
        public Builder removalPolicies(java.util.List<String> removalPolicies) {
            this.putQueryParameter("RemovalPolicies", removalPolicies);
            this.removalPolicies = removalPolicies;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the newly created scaling group belongs.</p>
         * <blockquote>
         * <p>Assigns the newly created scaling group to the specified resource group. If you do not specify this parameter, the scaling group belongs to the default resource group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-123******</p>
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
         * <p>The name of the scaling group. The name must be unique within a region.</p>
         * <p>It must be 2 to 64 characters in length. It must start with a digit, a letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
         * <p>Default value: the value of ScalingGroupId.</p>
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
         * <p>The reclaim mode of the scaling group. Valid values: </p>
         * <ul>
         * <li>recycle: sets the reclaim mode of the scaling group to shutdown and reclaim mode.  </li>
         * <li>release: sets the reclaim mode of the scaling group to release mode.</li>
         * <li>forcerelease: sets the reclaim mode of the scaling group to force release mode.<blockquote>
         * <p>If you select forcerelease, the system forcibly releases instances in the <code>Running</code> state during scale-down activities. Forcibly releasing an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * <li>forcerecycle: sets the reclaim mode of the scaling group to force shutdown and reclaim mode.<blockquote>
         * <p>If you select forcerecycle, the system forcibly shuts down instances in the <code>Running</code> state during scale-down activities. Forcibly shutting down an instance is equivalent to a power-off operation, which erases temporary data in the memory and storage of the instance. The data cannot be recovered. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>The ScalingPolicy parameter specifies the reclaim mode of the scaling group, but the specific action taken when an instance is removed from the scaling group is determined by the RemovePolicy parameter of RemoveInstances. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
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
         * <p>The collection of information about the server groups.</p>
         * <blockquote>
         * <p>You cannot configure the same server group settings in both AlbServerGroups and ServerGroups at the same time.</p>
         * </blockquote>
         */
        public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
            this.putQueryParameter("ServerGroups", serverGroups);
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * <p>The spot capacity distribution policy. You can use this parameter to separately specify the distribution policy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit price per vCPU of the instance types in ascending order.</li>
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
         * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest cost. Valid values: 1 to 10.</p>
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
         * <p>Specifies whether to enable the Auto Scaling policy to supplement spot instances. After this feature is enabled, when a system message indicating that a spot instance is to be reclaimed is received, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
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
         * <p>The timeout period for waiting for an ECS instance to be stopped during the scale-in process. Unit: seconds.
         * Valid values: 30 to 240.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only in the scale-in process when ScalingPolicy is set to release.  </li>
         * <li>If this parameter is specified, the system waits for a maximum of the StopInstanceTimeout period for the instance to be stopped. After the timeout period elapses, the scale-in process continues regardless of whether the instance is stopped.  </li>
         * <li>If this parameter is not specified, the system waits for a long time for the instance to be stopped. The scale-in process continues only after the instance is stopped. If the instance fails to be stopped, the scale-in process is rolled back and the scale-in fails.</li>
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
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder syncAlarmRuleToCms(Boolean syncAlarmRuleToCms) {
            this.putQueryParameter("SyncAlarmRuleToCms", syncAlarmRuleToCms);
            this.syncAlarmRuleToCms = syncAlarmRuleToCms;
            return this;
        }

        /**
         * <p>The collection of tag information for the scaling group.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The collection of information about the virtual server groups associated with the scaling group.</p>
         */
        public Builder vServerGroups(java.util.List<VServerGroups> vServerGroups) {
            this.putQueryParameter("VServerGroups", vServerGroups);
            this.vServerGroups = vServerGroups;
            return this;
        }

        /**
         * <p>The ID of the vSwitch. After this parameter is specified, the network type of the scaling group is VPC.</p>
         * <blockquote>
         * <p>If neither VSwitchId nor VSwitchIds is specified for the scaling group, the network type of the scaling group is classic network by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14zolna43z266bq****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The IDs of one or more vSwitches. If you use the VSwitchIds parameter, the VSwitchId parameter is ignored. After this parameter is specified, the network type of the scaling group is VPC.</p>
         * <p>When you specify multiple vSwitches:</p>
         * <ul>
         * <li><p>The vSwitches must belong to the same VPC.</p>
         * </li>
         * <li><p>The vSwitches can belong to different zones.</p>
         * </li>
         * <li><p>The vSwitches are prioritized in ascending order of numbers. 1 indicates the highest priority. If instances cannot be created in the zone of a higher-priority vSwitch, the system automatically selects the next highest-priority vSwitch to create instances.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If neither VSwitchId nor VSwitchIds is specified for the scaling group, the network type of the scaling group is classic network by default.</p>
         * </blockquote>
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
        public CreateScalingGroupRequest build() {
            return new CreateScalingGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AlbServerGroups model) {
                this.albServerGroupId = model.albServerGroupId;
                this.port = model.port;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the ALB server group.</p>
             * <p>A scaling group supports a limited number of associated ALB server groups. To view or manually apply for a quota increase, go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ddwb0y0g6y9bjm****</p>
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * <p>The port number used by the instance after Auto Scaling adds the instance to the ALB server group. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the ALB server group. A higher weight specifies that more requests are distributed to the instance. If the weight is 0, the instance does not receive requests. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
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
             * <p>Specifies whether to allow the system to automatically attempt to create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed.</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. When the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
             * <p>When the MultiAZPolicy parameter is set to COMPOSABLE, the default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances in the excess instances after the scaling group meets the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
             * <p>When the MultiAZPolicy parameter is set to COMPOSABLE, the default value is 100.</p>
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
             * <li><p>PricePerUnit: Compares prices based on the price per unit of capacity.</p>
             * <p>The capacity of an instance in the scaling group is equal to the weight set for the instance type. The default weight is 1, which means one ECS instance occupies a capacity of 1.</p>
             * </li>
             * <li><p>PricePerVCpu: Compares prices based on the price per vCPU.</p>
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
             * <p>Specifies whether to attempt to use spot instances to replace pay-as-you-go capacity when CompensateWithOnDemand is enabled and the proportion of pay-as-you-go instances exceeds the OnDemandPercentageAboveBaseCapacity value. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this parameter attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term existence of pay-as-you-go instances. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(DBInstances model) {
                this.attachMode = model.attachMode;
                this.DBInstanceId = model.DBInstanceId;
                this.type = model.type;
            } 

            /**
             * <p>The association mode between the scaling group and the database. Valid values:</p>
             * <ul>
             * <li>SecurityIp: Modifies the IP whitelist mode by automatically adding scaled-out instances to the IP whitelist of the database. Only ApsaraDB RDS databases are supported.</li>
             * <li>SecurityGroup: Uses the security group mode by adding the security group of the scaling configuration to the security group whitelist of the database to allow instances in the security group to access the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SecurityIp</p>
             */
            public Builder attachMode(String attachMode) {
                this.attachMode = attachMode;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5eqju85s45mu0***</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li>RDS</li>
             * <li>Redis</li>
             * <li>MongoDB</li>
             * </ul>
             * <p>Default value: RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
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
             * <p>If you want the scaling group to scale based on the capacity of the instance type, specify both this parameter and LaunchTemplateOverrides.WeightedCapacity.</p>
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
             * <p>This parameter is used to specify the maximum price for the overridden instance type (namely, <code>LaunchTemplateOverride.InstanceType</code>) in the launch template.</p>
             * <blockquote>
             * <p>This parameter takes effect only when the <code>LaunchTemplateId</code> parameter is specified.</p>
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
             * <p>If you want the scaling group to scale based on the capacity of the instance type, specify this parameter after you specify LaunchTemplateOverrides.InstanceType.</p>
             * <p>This parameter is used to specify the weight of the instance type, which indicates the capacity represented by a single instance of the instance type in the scaling group. A larger weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
             * <p>Because performance metrics such as the number of vCPUs and memory size vary among instance types, you can configure different weights for different instance types based on your needs.</p>
             * <p>Example:</p>
             * <ul>
             * <li><p>Current capacity: 0.</p>
             * </li>
             * <li><p>Expected capacity: 6.</p>
             * </li>
             * <li><p>Capacity of the ecs.c5.xlarge instance type: 4.</p>
             * </li>
             * </ul>
             * <p>To meet the expected capacity, the scaling group scales out two ecs.c5.xlarge instances for you.</p>
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
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(LifecycleHooks model) {
                this.defaultResult = model.defaultResult;
                this.heartbeatTimeout = model.heartbeatTimeout;
                this.lifecycleHookName = model.lifecycleHookName;
                this.lifecycleTransition = model.lifecycleTransition;
                this.notificationArn = model.notificationArn;
                this.notificationMetadata = model.notificationMetadata;
            } 

            /**
             * <p>The action to be performed after the wait state ends. Valid values:</p>
             * <ul>
             * <li><p>CONTINUE: continues the response to the scale-out activity or continues the response to the scale-down activity.</p>
             * </li>
             * <li><p>ABANDON: directly releases the instances created by the scale-out activity or directly removes the instances in the scale-down activity from the scaling group.</p>
             * </li>
             * </ul>
             * <p>When a scale-down activity (SCALE_IN) occurs in the scaling group and triggers multiple lifecycle hooks, if the wait state triggered by a lifecycle hook whose DefaultResult is ABANDON ends, the other corresponding wait states end in advance. In other cases, the next action is subject to the next action of the last wait state that ends.</p>
             * <p>Default value: CONTINUE.</p>
             * 
             * <strong>example:</strong>
             * <p>CONTINUE</p>
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * <p>The wait time set by the lifecycle hook for the scaling group activity. After the wait state times out, the next action is performed. Valid values: 30 to 21600. Unit: seconds.</p>
             * <p>After you create a lifecycle hook, you can call RecordLifecycleActionHeartbeat to extend the wait time of the instance, or call CompleteLifecycleAction to end the wait state of the scaling activity in advance.</p>
             * <p>Default value: 600.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * <p>The name of the lifecycle hook. The name cannot be modified after it is specified. If you do not specify this parameter, the default value is the same as the lifecycle hook ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lifecyclehook****</p>
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * <p>The type of scaling activity to which the lifecycle hook applies. Valid values:</p>
             * <ul>
             * <li><p>SCALE_OUT: scale-out activities of the scaling group.</p>
             * </li>
             * <li><p>SCALE_IN: scale-down activities of the scaling group.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you specify a lifecycle hook for the scaling group, this parameter is required, and other related parameters are optional.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * <p>The identifier of the notification recipient for the lifecycle hook. Simple Message Queue (formerly MNS) queues or topics are supported. The parameter value format is acs:ess:{region}:{account-id}:{resource-relative-id}.</p>
             * <ul>
             * <li><p>region: the region where the scaling group resides.</p>
             * </li>
             * <li><p>account-id: the Alibaba Cloud account ID.</p>
             * </li>
             * </ul>
             * <p>Examples:</p>
             * <ul>
             * <li><p>Simple Message Queue (formerly MNS) queue: acs:ess:{region}:{account-id}:queue/{queuename}.</p>
             * </li>
             * <li><p>Simple Message Queue (formerly MNS) topic: acs:ess:{region}:{account-id}:topic/{topicname}.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>acs:ess:cn-hangzhou:1111111111:queue/queue2</p>
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * <p>The fixed string information for the wait state of the scaling activity. The value cannot exceed 4,096 characters in length. Each time Auto Scaling pushes a message to the notification recipient, it also sends the predefined value of the NotificationMetadata parameter to help you manage and mark different types of notification information. The NotificationMetadata parameter takes effect only when you also specify the NotificationArn parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(LoadBalancerConfigs model) {
                this.loadBalancerId = model.loadBalancerId;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zen1olhfg9yw3f4q****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the CLB server group. A higher weight specifies that more requests are distributed to the instance. If the weight is 0, the instance does not receive requests. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(ServerGroups model) {
                this.port = model.port;
                this.serverGroupId = model.serverGroupId;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The port number used by the instance after Auto Scaling adds the instance to the server group. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-5yc3bd9lfyh*****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The type of the server group. Valid values:</p>
             * <ul>
             * <li>ALB: Application Load Balancer (ALB).</li>
             * <li>NLB: Network Load Balancer (NLB).</li>
             * <li>GWLB: Gateway Load Balancer (GWLB).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the server group. Valid values: 0 to 100.</p>
             * <p>A higher weight specifies that more access requests are allocated to the instance. If the weight is 0, the instance does not receive access requests.</p>
             * <blockquote>
             * <p>This parameter is required for ALB and NLB. You cannot configure this parameter for GWLB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.propagate = model.propagate;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>Department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Specifies whether the tag is a propagatable tag. Valid values:</p>
             * <ul>
             * <li>true: tags on the scaling group are propagated only to newly created instances, not to existing instances in the scaling group.</li>
             * <li>false: tags on the scaling group are not propagated to instances.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

            /**
             * <p>The tag value of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>Finance</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(VServerGroupAttributes model) {
                this.port = model.port;
                this.vServerGroupId = model.vServerGroupId;
                this.weight = model.weight;
            } 

            /**
             * <p>The port number used by the instance after Auto Scaling adds the instance to the virtual server group. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the virtual server group.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-bp1443g77****</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the virtual server group. A higher weight indicates that more access requests are allocated to the instance. If the weight is 0, the instance does not receive access requests. Valid values: 0 to 100.</p>
             * <p>Default value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
     */
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupAttributes")
        private java.util.List<VServerGroupAttributes> vServerGroupAttributes;

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
        public java.util.List<VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List<VServerGroupAttributes> vServerGroupAttributes; 

            private Builder() {
            } 

            private Builder(VServerGroups model) {
                this.loadBalancerId = model.loadBalancerId;
                this.vServerGroupAttributes = model.vServerGroupAttributes;
            } 

            /**
             * <p>The ID of the Classic Load Balancer (CLB) instance to which the virtual server group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1u7etiogg38yvwz****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The attributes of the backend server group.</p>
             */
            public Builder vServerGroupAttributes(java.util.List<VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateScalingGroupRequest</p>
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
             * <li>ReplaceUnhealthy: Replaces unhealthy instances in all zones normally. </li>
             * <li>IgnoreUnhealthy: Does not replace unhealthy instances in impaired zones. Healthy zones are not affected.</li>
             * </ul>
             * <p>Default value: ReplaceUnhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>ReplaceUnhealthy</p>
             */
            public Builder impairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
                this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
                return this;
            }

            /**
             * <p>Blocks scale-in triggered by specified types of scaling rules. The blocking scope applies to all zones under the scaling group, not just the impaired zones. This prevents false scale-in caused by fake improvements in monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
             * <ul>
             * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
             * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
             * <li>None: Does not block.</li>
             * </ul>
             * <p>Default value: None.</p>
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
             * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
             * <li>false: Scale-out is not restricted by zone and can create instances in any zone of the scaling group.</li>
             * </ul>
             * <p>Default value: false.</p>
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
