// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private java.util.List<LaunchTemplateConfig> launchTemplateConfig;

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
    public java.util.List<LaunchTemplateConfig> getLaunchTemplateConfig() {
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
        private java.util.List<LaunchTemplateConfig> launchTemplateConfig; 
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
         * <p>The ID of the auto provisioning group.</p>
         * 
         * <strong>example:</strong>
         * <p>apg-bp67acfmxazb4ph****</p>
         */
        public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
            this.putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }

        /**
         * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with http:// or https://. The name can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>apg-test</p>
         */
        public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
            this.putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }

        /**
         * <p>The billing method of the capacity difference when the sum of PayAsYouGoTargetCapacity and SpotTargetCapacity is less than TotalTargetCapacity. Valid values:</p>
         * <ul>
         * <li>PayAsYouGo: pay-as-you-go instance.</li>
         * <li>Spot: spot instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Spot</p>
         */
        public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
            this.putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * <p>Specifies whether to release instances when the real-time capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:</p>
         * <ul>
         * <li>termination: Releases the scaled-in instances.</li>
         * <li>no-termination: Only removes the scaled-in instances from the auto provisioning group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no-termination</p>
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * <p>The extended launch template list.</p>
         */
        public Builder launchTemplateConfig(java.util.List<LaunchTemplateConfig> launchTemplateConfig) {
            this.putQueryParameter("LaunchTemplateConfig", launchTemplateConfig);
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * <p>The maximum price of spot instances in the auto provisioning group.</p>
         * <blockquote>
         * <p>If both MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice are specified, the lower value is used. LaunchTemplateConfig.N.MaxPrice is specified in Settings when the auto provisioning group is created and cannot be modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
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
         * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. Valid values: less than the parameter value of TotalTargetCapacity.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder payAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
            this.putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }

        /**
         * <p>The region ID of the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The target capacity of spot instances in the auto provisioning group. Valid values: less than the parameter value of TotalTargetCapacity.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder spotTargetCapacity(String spotTargetCapacity) {
            this.putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * <p>Specifies whether to release instances in the auto provisioning group when the group expires. Valid values:</p>
         * <ul>
         * <li>true: Releases the instances in the group.</li>
         * <li>false: Only removes the instances from the auto provisioning group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration);
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * <p>The total target capacity of the auto provisioning group. Valid values: positive integers.</p>
         * <p>The total capacity must be greater than or equal to the sum of PayAsYouGoTargetCapacity (the target capacity of pay-as-you-go instances) and SpotTargetCapacity (the target capacity of spot instances).</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
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

    /**
     * 
     * {@link ModifyAutoProvisioningGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoProvisioningGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(LaunchTemplateConfig model) {
                this.instanceType = model.instanceType;
                this.maxPrice = model.maxPrice;
                this.priority = model.priority;
                this.vSwitchId = model.vSwitchId;
                this.weightedCapacity = model.weightedCapacity;
            } 

            /**
             * <p>The instance type specified in the extension launch template. Valid values of N: 1 to 20. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price of the spot instance in the extended launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxPrice(Double maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The priority of the extended launch template. A value of 0 indicates the highest priority. Valid values: greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the ECS instance belongs in the extended launch template. The zone of the ECS instance launched from the extended template is determined by the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-sn5bsitu4lfzgc5o7****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The weight of the instance type specified in the extended launch template. A higher value indicates that a single instance can meet more computing requirements, which means fewer instances are required. Valid values: greater than 0.</p>
             * <p>You can calculate the weight based on the computing power of the specified instance type and the minimum computing power of a single node in the cluster. For example, if the minimum computing power of a single node is 8 vCPUs and 60 GiB:</p>
             * <ul>
             * <li>The weight of an instance type with 8 vCPUs and 60 GiB can be set to 1.</li>
             * <li>The weight of an instance type with 16 vCPUs and 120 GiB can be set to 2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
