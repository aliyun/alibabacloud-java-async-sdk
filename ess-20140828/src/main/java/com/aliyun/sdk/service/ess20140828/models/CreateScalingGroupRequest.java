// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingGroupRequest</p>
 */
public class CreateScalingGroupRequest extends Request {
    @NameInMap("RemovalPolicy")
    private java.util.List < String > removalPolicy;

    @Query
    @NameInMap("AlbServerGroup")
    private java.util.List < AlbServerGroup> albServerGroup;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CompensateWithOnDemand")
    private Boolean compensateWithOnDemand;

    @Query
    @NameInMap("ContainerGroupId")
    private String containerGroupId;

    @Query
    @NameInMap("DBInstanceIds")
    private String DBInstanceIds;

    @Query
    @NameInMap("DefaultCooldown")
    private Integer defaultCooldown;

    @Query
    @NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @Query
    @NameInMap("GroupDeletionProtection")
    private Boolean groupDeletionProtection;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("HealthCheckType")
    private String healthCheckType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateOverride")
    private java.util.List < LaunchTemplateOverride> launchTemplateOverride;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private String launchTemplateVersion;

    @Query
    @NameInMap("LifecycleHook")
    private java.util.List < LifecycleHook> lifecycleHook;

    @Query
    @NameInMap("LoadBalancerIds")
    private String loadBalancerIds;

    @Query
    @NameInMap("MaxSize")
    @Validation(required = true)
    private Integer maxSize;

    @Query
    @NameInMap("MinSize")
    @Validation(required = true)
    private Integer minSize;

    @Query
    @NameInMap("MultiAZPolicy")
    private String multiAZPolicy;

    @Query
    @NameInMap("OnDemandBaseCapacity")
    private Integer onDemandBaseCapacity;

    @Query
    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    private Integer onDemandPercentageAboveBaseCapacity;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupName")
    private String scalingGroupName;

    @Query
    @NameInMap("ScalingPolicy")
    private String scalingPolicy;

    @Query
    @NameInMap("SpotInstancePools")
    private Integer spotInstancePools;

    @Query
    @NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VServerGroup")
    private java.util.List < VServerGroup> VServerGroup;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    private CreateScalingGroupRequest(Builder builder) {
        super(builder);
        this.removalPolicy = builder.removalPolicy;
        this.albServerGroup = builder.albServerGroup;
        this.clientToken = builder.clientToken;
        this.compensateWithOnDemand = builder.compensateWithOnDemand;
        this.containerGroupId = builder.containerGroupId;
        this.DBInstanceIds = builder.DBInstanceIds;
        this.defaultCooldown = builder.defaultCooldown;
        this.desiredCapacity = builder.desiredCapacity;
        this.groupDeletionProtection = builder.groupDeletionProtection;
        this.groupType = builder.groupType;
        this.healthCheckType = builder.healthCheckType;
        this.instanceId = builder.instanceId;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateOverride = builder.launchTemplateOverride;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.lifecycleHook = builder.lifecycleHook;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.multiAZPolicy = builder.multiAZPolicy;
        this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupName = builder.scalingGroupName;
        this.scalingPolicy = builder.scalingPolicy;
        this.spotInstancePools = builder.spotInstancePools;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.tag = builder.tag;
        this.VServerGroup = builder.VServerGroup;
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
     * @return removalPolicy
     */
    public java.util.List < String > getRemovalPolicy() {
        return this.removalPolicy;
    }

    /**
     * @return albServerGroup
     */
    public java.util.List < AlbServerGroup> getAlbServerGroup() {
        return this.albServerGroup;
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
     * @return DBInstanceIds
     */
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
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
     * @return launchTemplateOverride
     */
    public java.util.List < LaunchTemplateOverride> getLaunchTemplateOverride() {
        return this.launchTemplateOverride;
    }

    /**
     * @return launchTemplateVersion
     */
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return lifecycleHook
     */
    public java.util.List < LifecycleHook> getLifecycleHook() {
        return this.lifecycleHook;
    }

    /**
     * @return loadBalancerIds
     */
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return VServerGroup
     */
    public java.util.List < VServerGroup> getVServerGroup() {
        return this.VServerGroup;
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
        private java.util.List < String > removalPolicy; 
        private java.util.List < AlbServerGroup> albServerGroup; 
        private String clientToken; 
        private Boolean compensateWithOnDemand; 
        private String containerGroupId; 
        private String DBInstanceIds; 
        private Integer defaultCooldown; 
        private Integer desiredCapacity; 
        private Boolean groupDeletionProtection; 
        private String groupType; 
        private String healthCheckType; 
        private String instanceId; 
        private String launchTemplateId; 
        private java.util.List < LaunchTemplateOverride> launchTemplateOverride; 
        private String launchTemplateVersion; 
        private java.util.List < LifecycleHook> lifecycleHook; 
        private String loadBalancerIds; 
        private Integer maxSize; 
        private Integer minSize; 
        private String multiAZPolicy; 
        private Integer onDemandBaseCapacity; 
        private Integer onDemandPercentageAboveBaseCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupName; 
        private String scalingPolicy; 
        private Integer spotInstancePools; 
        private Boolean spotInstanceRemedy; 
        private java.util.List < Tag> tag; 
        private java.util.List < VServerGroup> VServerGroup; 
        private String vSwitchId; 
        private java.util.List < String > vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingGroupRequest response) {
            super(response);
            this.removalPolicy = response.removalPolicy;
            this.albServerGroup = response.albServerGroup;
            this.clientToken = response.clientToken;
            this.compensateWithOnDemand = response.compensateWithOnDemand;
            this.containerGroupId = response.containerGroupId;
            this.DBInstanceIds = response.DBInstanceIds;
            this.defaultCooldown = response.defaultCooldown;
            this.desiredCapacity = response.desiredCapacity;
            this.groupDeletionProtection = response.groupDeletionProtection;
            this.groupType = response.groupType;
            this.healthCheckType = response.healthCheckType;
            this.instanceId = response.instanceId;
            this.launchTemplateId = response.launchTemplateId;
            this.launchTemplateOverride = response.launchTemplateOverride;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.lifecycleHook = response.lifecycleHook;
            this.loadBalancerIds = response.loadBalancerIds;
            this.maxSize = response.maxSize;
            this.minSize = response.minSize;
            this.multiAZPolicy = response.multiAZPolicy;
            this.onDemandBaseCapacity = response.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = response.onDemandPercentageAboveBaseCapacity;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupName = response.scalingGroupName;
            this.scalingPolicy = response.scalingPolicy;
            this.spotInstancePools = response.spotInstancePools;
            this.spotInstanceRemedy = response.spotInstanceRemedy;
            this.tag = response.tag;
            this.VServerGroup = response.VServerGroup;
            this.vSwitchId = response.vSwitchId;
            this.vSwitchIds = response.vSwitchIds;
        } 

        /**
         * RemovalPolicy.
         */
        public Builder removalPolicy(java.util.List < String > removalPolicy) {
            this.removalPolicy = removalPolicy;
            return this;
        }

        /**
         * AlbServerGroup.
         */
        public Builder albServerGroup(java.util.List < AlbServerGroup> albServerGroup) {
            this.putQueryParameter("AlbServerGroup", albServerGroup);
            this.albServerGroup = albServerGroup;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CompensateWithOnDemand.
         */
        public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.putQueryParameter("CompensateWithOnDemand", compensateWithOnDemand);
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }

        /**
         * ContainerGroupId.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.putQueryParameter("ContainerGroupId", containerGroupId);
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * DBInstanceIds.
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }

        /**
         * DefaultCooldown.
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.putQueryParameter("DefaultCooldown", defaultCooldown);
            this.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * DesiredCapacity.
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.putQueryParameter("DesiredCapacity", desiredCapacity);
            this.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * GroupDeletionProtection.
         */
        public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
            this.putQueryParameter("GroupDeletionProtection", groupDeletionProtection);
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * HealthCheckType.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LaunchTemplateId.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * LaunchTemplateOverride.
         */
        public Builder launchTemplateOverride(java.util.List < LaunchTemplateOverride> launchTemplateOverride) {
            this.putQueryParameter("LaunchTemplateOverride", launchTemplateOverride);
            this.launchTemplateOverride = launchTemplateOverride;
            return this;
        }

        /**
         * LaunchTemplateVersion.
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * LifecycleHook.
         */
        public Builder lifecycleHook(java.util.List < LifecycleHook> lifecycleHook) {
            this.putQueryParameter("LifecycleHook", lifecycleHook);
            this.lifecycleHook = lifecycleHook;
            return this;
        }

        /**
         * LoadBalancerIds.
         */
        public Builder loadBalancerIds(String loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * MaxSize.
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * MinSize.
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * MultiAZPolicy.
         */
        public Builder multiAZPolicy(String multiAZPolicy) {
            this.putQueryParameter("MultiAZPolicy", multiAZPolicy);
            this.multiAZPolicy = multiAZPolicy;
            return this;
        }

        /**
         * OnDemandBaseCapacity.
         */
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.putQueryParameter("OnDemandBaseCapacity", onDemandBaseCapacity);
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * OnDemandPercentageAboveBaseCapacity.
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ScalingGroupName.
         */
        public Builder scalingGroupName(String scalingGroupName) {
            this.putQueryParameter("ScalingGroupName", scalingGroupName);
            this.scalingGroupName = scalingGroupName;
            return this;
        }

        /**
         * ScalingPolicy.
         */
        public Builder scalingPolicy(String scalingPolicy) {
            this.putQueryParameter("ScalingPolicy", scalingPolicy);
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        /**
         * SpotInstancePools.
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            this.putQueryParameter("SpotInstancePools", spotInstancePools);
            this.spotInstancePools = spotInstancePools;
            return this;
        }

        /**
         * SpotInstanceRemedy.
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy);
            this.spotInstanceRemedy = spotInstanceRemedy;
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
         * VServerGroup.
         */
        public Builder VServerGroup(java.util.List < VServerGroup> VServerGroup) {
            this.putQueryParameter("VServerGroup", VServerGroup);
            this.VServerGroup = VServerGroup;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VSwitchIds.
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

    public static class AlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Weight")
        private Integer weight;

        private AlbServerGroup(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroup create() {
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
             * AlbServerGroupId.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroup build() {
                return new AlbServerGroup(this);
            } 

        } 

    }
    public static class LaunchTemplateOverride extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverride(Builder builder) {
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverride create() {
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

            public LaunchTemplateOverride build() {
                return new LaunchTemplateOverride(this);
            } 

        } 

    }
    public static class LifecycleHook extends TeaModel {
        @NameInMap("DefaultResult")
        private String defaultResult;

        @NameInMap("HeartbeatTimeout")
        private Integer heartbeatTimeout;

        @NameInMap("LifecycleHookName")
        private String lifecycleHookName;

        @NameInMap("LifecycleTransition")
        private String lifecycleTransition;

        @NameInMap("NotificationArn")
        private String notificationArn;

        @NameInMap("NotificationMetadata")
        private String notificationMetadata;

        private LifecycleHook(Builder builder) {
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

        public static LifecycleHook create() {
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
             * DefaultResult.
             */
            public Builder defaultResult(String defaultResult) {
                this.defaultResult = defaultResult;
                return this;
            }

            /**
             * HeartbeatTimeout.
             */
            public Builder heartbeatTimeout(Integer heartbeatTimeout) {
                this.heartbeatTimeout = heartbeatTimeout;
                return this;
            }

            /**
             * LifecycleHookName.
             */
            public Builder lifecycleHookName(String lifecycleHookName) {
                this.lifecycleHookName = lifecycleHookName;
                return this;
            }

            /**
             * LifecycleTransition.
             */
            public Builder lifecycleTransition(String lifecycleTransition) {
                this.lifecycleTransition = lifecycleTransition;
                return this;
            }

            /**
             * NotificationArn.
             */
            public Builder notificationArn(String notificationArn) {
                this.notificationArn = notificationArn;
                return this;
            }

            /**
             * NotificationMetadata.
             */
            public Builder notificationMetadata(String notificationMetadata) {
                this.notificationMetadata = notificationMetadata;
                return this;
            }

            public LifecycleHook build() {
                return new LifecycleHook(this);
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class VServerGroupAttribute extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        @NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttribute(Builder builder) {
            this.port = builder.port;
            this.VServerGroupId = builder.VServerGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String VServerGroupId; 
            private Integer weight; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VServerGroupAttribute build() {
                return new VServerGroupAttribute(this);
            } 

        } 

    }
    public static class VServerGroup extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("VServerGroupAttribute")
        private java.util.List < VServerGroupAttribute> VServerGroupAttribute;

        private VServerGroup(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.VServerGroupAttribute = builder.VServerGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroup create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return VServerGroupAttribute
         */
        public java.util.List < VServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttribute> VServerGroupAttribute; 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * VServerGroupAttribute.
             */
            public Builder VServerGroupAttribute(java.util.List < VServerGroupAttribute> VServerGroupAttribute) {
                this.VServerGroupAttribute = VServerGroupAttribute;
                return this;
            }

            public VServerGroup build() {
                return new VServerGroup(this);
            } 

        } 

    }
}
