// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoProvisioningGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoProvisioningGroupRequest</p>
 */
public class ModifyAutoProvisioningGroupRequest extends Request {
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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AutoProvisioningGroupId")
    private String autoProvisioningGroupId;

    @Query
    @NameInMap("DefaultTargetCapacityType")
    private String defaultTargetCapacityType;

    @Query
    @NameInMap("TerminateInstancesWithExpiration")
    private Boolean terminateInstancesWithExpiration;

    @Query
    @NameInMap("MaxSpotPrice")
    private Float maxSpotPrice;

    @Query
    @NameInMap("TotalTargetCapacity")
    private String totalTargetCapacity;

    @Query
    @NameInMap("PayAsYouGoTargetCapacity")
    private String payAsYouGoTargetCapacity;

    @Query
    @NameInMap("SpotTargetCapacity")
    private String spotTargetCapacity;

    @Query
    @NameInMap("AutoProvisioningGroupName")
    private String autoProvisioningGroupName;

    @Query
    @NameInMap("ExcessCapacityTerminationPolicy")
    private String excessCapacityTerminationPolicy;

    private ModifyAutoProvisioningGroupRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerAccount = builder.ownerAccount;
        this.launchTemplateConfig = builder.launchTemplateConfig;
        this.regionId = builder.regionId;
        this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
        this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
        this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
        this.maxSpotPrice = builder.maxSpotPrice;
        this.totalTargetCapacity = builder.totalTargetCapacity;
        this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
        this.spotTargetCapacity = builder.spotTargetCapacity;
        this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
        this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoProvisioningGroupId
     */
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    /**
     * @return defaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * @return terminateInstancesWithExpiration
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    /**
     * @return maxSpotPrice
     */
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    /**
     * @return totalTargetCapacity
     */
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    /**
     * @return payAsYouGoTargetCapacity
     */
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    /**
     * @return spotTargetCapacity
     */
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    /**
     * @return autoProvisioningGroupName
     */
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    /**
     * @return excessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyAutoProvisioningGroupRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ownerAccount; 
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 
        private String regionId; 
        private String autoProvisioningGroupId; 
        private String defaultTargetCapacityType; 
        private Boolean terminateInstancesWithExpiration; 
        private Float maxSpotPrice; 
        private String totalTargetCapacity; 
        private String payAsYouGoTargetCapacity; 
        private String spotTargetCapacity; 
        private String autoProvisioningGroupName; 
        private String excessCapacityTerminationPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoProvisioningGroupRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ownerAccount = request.ownerAccount;
            this.launchTemplateConfig = request.launchTemplateConfig;
            this.regionId = request.regionId;
            this.autoProvisioningGroupId = request.autoProvisioningGroupId;
            this.defaultTargetCapacityType = request.defaultTargetCapacityType;
            this.terminateInstancesWithExpiration = request.terminateInstancesWithExpiration;
            this.maxSpotPrice = request.maxSpotPrice;
            this.totalTargetCapacity = request.totalTargetCapacity;
            this.payAsYouGoTargetCapacity = request.payAsYouGoTargetCapacity;
            this.spotTargetCapacity = request.spotTargetCapacity;
            this.autoProvisioningGroupName = request.autoProvisioningGroupName;
            this.excessCapacityTerminationPolicy = request.excessCapacityTerminationPolicy;
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
         * The ID of the region where the auto provisioning Group is located. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the auto provisioning group.
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * If the sum of PayAsYouGoTargetCapacity and SpotTargetCapacity is less than TotalTargetCapacity, the billing method of the difference capacity is specified. Valid values:
         * <p>
         * 
         * -PayAsYouGo: pay-as-you-go instance
         * -Spot: preemptible instance
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * Specifies whether to release instances in the auto provisioning group upon expiration. Valid values:
         * <p>
         * 
         * -true: Releases instances in the group.
         * -false: only instances in the group are removed from the auto provisioning group.
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * The highest price for preemptible instances in the auto provisioning group.
         * <p>
         * 
         * > When MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice are set at the same time, the lowest value prevail. LaunchTemplateConfig.N.MaxPrice is set when you create an auto provisioning group and cannot be modified.
         */
        public Builder maxSpotPrice(Float maxSpotPrice) {
            this.putQueryParameter("MaxSpotPrice", maxSpotPrice);
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }

        /**
         * The total capacity of the auto provisioning group. Value range: positive integer
         * <p>
         * 
         * The total capacity must be greater than or equal to the sum of the PayAsYouGoTargetCapacity (target capacity of the specified pay-as-you-go instance) and SpotTargetCapacity (target capacity of the specified preemptible instance).
         */
        public Builder totalTargetCapacity(String totalTargetCapacity) {
            this.putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * The target capacity of pay-as-you-go instances in the auto provisioning group. Value range: parameter values smaller than TotalTargetCapacity.
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * The target capacity of preemptible instances in the auto provisioning group. Value range: parameter values smaller than TotalTargetCapacity.
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
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
         * Whether to release the scale-in instance when the real-time capacity of the auto provisioning group exceeds the target capacity and the scale-in is triggered. Valid values:
         * <p>
         * 
         * -termination: releases the scaled-In instance.
         * -no-termination: only the scaled-in instances are removed from the auto provisioning group.
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        @Override
        public ModifyAutoProvisioningGroupRequest build() {
            return new ModifyAutoProvisioningGroupRequest(this);
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
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 扩展启动模板中，抢占式实例的价格上限。
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * 扩展启动模板的优先级，取值为0时优先级最高。取值范围：大于0
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
             * 您可以根据指定实例规格的计算力和集群单节点最低计算力得出权重值。假设单节点最低计算力为8 vCPU、60 GiB，则：
             * 
             * - 8 vCPU、60 GiB的实例规格权重可以设置为1
             * - 16 vCPU、120 GiB的实例规格权重可以设置为2
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
