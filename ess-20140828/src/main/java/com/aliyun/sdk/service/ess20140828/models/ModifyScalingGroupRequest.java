// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingGroupRequest</p>
 */
public class ModifyScalingGroupRequest extends Request {
    @NameInMap("RemovalPolicy")
    private java.util.List < String > removalPolicy;

    @Query
    @NameInMap("ActiveScalingConfigurationId")
    private String activeScalingConfigurationId;

    @Query
    @NameInMap("CompensateWithOnDemand")
    private Boolean compensateWithOnDemand;

    @Query
    @NameInMap("DefaultCooldown")
    @Validation(maximum = 86400)
    private Integer defaultCooldown;

    @Query
    @NameInMap("DesiredCapacity")
    private Integer desiredCapacity;

    @Query
    @NameInMap("GroupDeletionProtection")
    private Boolean groupDeletionProtection;

    @Query
    @NameInMap("HealthCheckType")
    private String healthCheckType;

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
    @NameInMap("MaxSize")
    private Integer maxSize;

    @Query
    @NameInMap("MinSize")
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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("ScalingGroupName")
    private String scalingGroupName;

    @Query
    @NameInMap("SpotInstancePools")
    private Integer spotInstancePools;

    @Query
    @NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @Query
    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    private ModifyScalingGroupRequest(Builder builder) {
        super(builder);
        this.removalPolicy = builder.removalPolicy;
        this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
        this.compensateWithOnDemand = builder.compensateWithOnDemand;
        this.defaultCooldown = builder.defaultCooldown;
        this.desiredCapacity = builder.desiredCapacity;
        this.groupDeletionProtection = builder.groupDeletionProtection;
        this.healthCheckType = builder.healthCheckType;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateOverride = builder.launchTemplateOverride;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.multiAZPolicy = builder.multiAZPolicy;
        this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingGroupName = builder.scalingGroupName;
        this.spotInstancePools = builder.spotInstancePools;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
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
     * @return removalPolicy
     */
    public java.util.List < String > getRemovalPolicy() {
        return this.removalPolicy;
    }

    /**
     * @return activeScalingConfigurationId
     */
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    /**
     * @return compensateWithOnDemand
     */
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
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
     * @return healthCheckType
     */
    public String getHealthCheckType() {
        return this.healthCheckType;
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
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<ModifyScalingGroupRequest, Builder> {
        private java.util.List < String > removalPolicy; 
        private String activeScalingConfigurationId; 
        private Boolean compensateWithOnDemand; 
        private Integer defaultCooldown; 
        private Integer desiredCapacity; 
        private Boolean groupDeletionProtection; 
        private String healthCheckType; 
        private String launchTemplateId; 
        private java.util.List < LaunchTemplateOverride> launchTemplateOverride; 
        private String launchTemplateVersion; 
        private Integer maxSize; 
        private Integer minSize; 
        private String multiAZPolicy; 
        private Integer onDemandBaseCapacity; 
        private Integer onDemandPercentageAboveBaseCapacity; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 
        private String scalingGroupName; 
        private Integer spotInstancePools; 
        private Boolean spotInstanceRemedy; 
        private java.util.List < String > vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingGroupRequest response) {
            super(response);
            this.removalPolicy = response.removalPolicy;
            this.activeScalingConfigurationId = response.activeScalingConfigurationId;
            this.compensateWithOnDemand = response.compensateWithOnDemand;
            this.defaultCooldown = response.defaultCooldown;
            this.desiredCapacity = response.desiredCapacity;
            this.groupDeletionProtection = response.groupDeletionProtection;
            this.healthCheckType = response.healthCheckType;
            this.launchTemplateId = response.launchTemplateId;
            this.launchTemplateOverride = response.launchTemplateOverride;
            this.launchTemplateVersion = response.launchTemplateVersion;
            this.maxSize = response.maxSize;
            this.minSize = response.minSize;
            this.multiAZPolicy = response.multiAZPolicy;
            this.onDemandBaseCapacity = response.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = response.onDemandPercentageAboveBaseCapacity;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingGroupId = response.scalingGroupId;
            this.scalingGroupName = response.scalingGroupName;
            this.spotInstancePools = response.spotInstancePools;
            this.spotInstanceRemedy = response.spotInstanceRemedy;
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
         * ActiveScalingConfigurationId.
         */
        public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
            this.putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
            this.activeScalingConfigurationId = activeScalingConfigurationId;
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
         * HealthCheckType.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
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
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public ModifyScalingGroupRequest build() {
            return new ModifyScalingGroupRequest(this);
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
}
