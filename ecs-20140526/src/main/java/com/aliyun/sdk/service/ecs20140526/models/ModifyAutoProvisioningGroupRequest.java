// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoProvisioningGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoProvisioningGroupRequest</p>
 */
public class ModifyAutoProvisioningGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupId")
    private String autoProvisioningGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcessCapacityTerminationPolicy")
    private String excessCapacityTerminationPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateConfig")
    private java.util.List < LaunchTemplateConfig> launchTemplateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSpotPrice")
    private Float maxSpotPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayAsYouGoTargetCapacity")
    private String payAsYouGoTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotTargetCapacity")
    private String spotTargetCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminateInstancesWithExpiration")
    private Boolean terminateInstancesWithExpiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTargetCapacity")
    private String totalTargetCapacity;

    private ModifyAutoProvisioningGroupRequest(Builder builder) {
        super(builder);
        this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
        this.launchTemplateConfig = builder.launchTemplateConfig;
        this.maxSpotPrice = builder.maxSpotPrice;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotTargetCapacity = builder.spotTargetCapacity;
        this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
        this.totalTargetCapacity = builder.totalTargetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoProvisioningGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoProvisioningGroupId
     */
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    /**
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * @return excessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    /**
     * @return launchTemplateConfig
     */
    public java.util.List < LaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    /**
     * @return maxSpotPrice
     */
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
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
     * @return spotTargetCapacity
     */
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
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

    public static final class Builder extends Request.Builder<ModifyAutoProvisioningGroupRequest, Builder> {
        private String autoProvisioningGroupId; 
        private String autoProvisioningGroupName; 
        private String defaultTargetCapacityType; 
        private String excessCapacityTerminationPolicy; 
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 
        private Float maxSpotPrice; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payAsYouGoTargetCapacity; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spotTargetCapacity; 
        private Boolean terminateInstancesWithExpiration; 
        private String totalTargetCapacity; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoProvisioningGroupRequest request) {
            super(request);
            this.autoProvisioningGroupId = request.autoProvisioningGroupId;
            this.autoProvisioningGroupName = request.autoProvisioningGroupName;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.excessCapacityTerminationPolicy = request.excessCapacityTerminationPolicy;
            this.launchTemplateConfig = request.launchTemplateConfig;
            this.maxSpotPrice = request.maxSpotPrice;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payAsYouGoTargetCapacity = request.payAsYouGoTargetCapacity;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotTargetCapacity = request.spotTargetCapacity;
            this.terminateInstancesWithExpiration = request.terminateInstancesWithExpiration;
            this.totalTargetCapacity = request.totalTargetCapacity;
        } 

        /**
         * The auto-provisioning group ID.
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * The name of the auto-provisioning group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://.[ It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).](http://https://。、（:）、（\_）（-）。)
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * The type of supplemental instances. When the sum of the PayAsYouGoTargetCapacity and SpotTargetCapacity values is smaller than the TotalTargetCapacity value, the auto-provisioning group creates instances of the specified type to meet the target capacity. Valid values:
         * <p>
         * 
         * *   PayAsYouGo: pay-as-you-go instances
         * *   Spot: preemptible instances
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * Specifies whether to release the removed instances when the real-time capacity of the auto-provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:
         * <p>
         * 
         * *   termination: releases the removed instances.
         * *   no-termination: removes the instances from the auto-provisioning group but does not release them.
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
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
         * The maximum price of preemptible instances in the auto-provisioning group.
         * <p>
         * 
         * > When both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the smaller one of the two parameter values is used. The LaunchTemplateConfig.N.MaxPrice parameter is specified when the auto-provisioning group is created, and cannot be modified.
         */
        public Builder maxSpotPrice(Float maxSpotPrice) {
            this.putQueryParameter("MaxSpotPrice", maxSpotPrice);
            this.maxSpotPrice = maxSpotPrice;
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
         * The target capacity of pay-as-you-go instances in the auto-provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * The region ID of the auto-provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The target capacity of preemptible instances in the auto-provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * Specifies whether to release instances that are located in the auto-provisioning group after the group expires. Valid values:
         * <p>
         * 
         * *   true: releases instances that are located in the auto-provisioning group.
         * *   false: removes instances from the auto-provisioning group but does not release them.
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * The total target capacity of the auto-provisioning group. The value must be a positive integer.
         * <p>
         * 
         * The total target capacity of the auto-provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter as well as the target capacity of preemptible instances specified by the SpotTargetCapacity parameter.
         */
        public Builder totalTargetCapacity(String totalTargetCapacity) {
            this.putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        @Override
        public ModifyAutoProvisioningGroupRequest build() {
            return new ModifyAutoProvisioningGroupRequest(this);
        } 

    } 

    public static class LaunchTemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Double maxPrice;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Double weightedCapacity;

        private LaunchTemplateConfig(Builder builder) {
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
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
            private String instanceType; 
            private Double maxPrice; 
            private Integer priority; 
            private String vSwitchId; 
            private Double weightedCapacity; 

            /**
             * The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see [Instance families](~~25378~~).
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum price of preemptible instances in extended configuration N.
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The priority of extended configuration N. A value of 0 indicates the highest priority. The value must be greater than 0.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the vSwitch in extended configuration N. The zone of the instances created from the extended configuration is determined by the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The weight of the instance type specified in the extended configuration. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.
             * <p>
             * 
             * The weight is calculated based on the computing power of the instance type and the minimum computing power of a single instance in the cluster that can created by the auto-provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.
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
}
