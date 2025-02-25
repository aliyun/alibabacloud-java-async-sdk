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
 * {@link EnableScalingGroupRequest} extends {@link RequestModel}
 *
 * <p>EnableScalingGroupRequest</p>
 */
public class EnableScalingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
    private String activeScalingConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

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
    @com.aliyun.core.annotation.NameInMap("LoadBalancerWeights")
    private java.util.List<Integer> loadBalancerWeights;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    private EnableScalingGroupRequest(Builder builder) {
        super(builder);
        this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
        this.instanceIds = builder.instanceIds;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateOverrides = builder.launchTemplateOverrides;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.loadBalancerWeights = builder.loadBalancerWeights;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableScalingGroupRequest create() {
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
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
     * @return loadBalancerWeights
     */
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
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

    public static final class Builder extends Request.Builder<EnableScalingGroupRequest, Builder> {
        private String activeScalingConfigurationId; 
        private java.util.List<String> instanceIds; 
        private String launchTemplateId; 
        private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides; 
        private String launchTemplateVersion; 
        private java.util.List<Integer> loadBalancerWeights; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(EnableScalingGroupRequest request) {
            super(request);
            this.activeScalingConfigurationId = request.activeScalingConfigurationId;
            this.instanceIds = request.instanceIds;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateOverrides = request.launchTemplateOverrides;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.loadBalancerWeights = request.loadBalancerWeights;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The ID of the scaling configuration that you want to enable in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1ffogfdauy0nu5****</p>
         */
        public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
            this.putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances that you want to add to the scaling group after the scaling group is enabled.</p>
         * <p>Before you add ECS instances to the scaling group, make sure that the instances meet the following requirements:</p>
         * <ul>
         * <li>The instances must reside in the same region as the scaling group.</li>
         * <li>The instances must be in the Running state.</li>
         * <li>The instances do not belong to another scaling group.</li>
         * <li>The instances are billed on a subscription or pay-as-you-go basis, or the instances are preemptible instances.</li>
         * <li>If you specify VswitchID for the scaling group, the instances must share the same VPC as the scaling group.</li>
         * <li>If you do not specify VswitchID for the scaling group, the instances must use the classic network.</li>
         * </ul>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The ID of the launch template that is used by Auto Scaling to create ECS instances.</p>
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
         * <p>The information about the instance types that you want to extend in the launch template.</p>
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
         * <p>The weights of ECS instances or elastic container instances as backend servers.</p>
         * <p>Default value: 50.</p>
         */
        public Builder loadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
            this.putQueryParameter("LoadBalancerWeights", loadBalancerWeights);
            this.loadBalancerWeights = loadBalancerWeights;
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
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp14wlu85wrpchm0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public EnableScalingGroupRequest build() {
            return new EnableScalingGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnableScalingGroupRequest} extends {@link TeaModel}
     *
     * <p>EnableScalingGroupRequest</p>
     */
    public static class LaunchTemplateOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
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
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer weightedCapacity; 

            /**
             * <p>The instance type. If you want to scale instances based on instance type weights in the scaling group, you must specify <code>LaunchTemplateOverrides.WeightedCapacity</code> after you specify this parameter.</p>
             * <p>The instance type specified by using this parameter overwrites the instance type of the launch template.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you specify LaunchTemplateId.</p>
             * </blockquote>
             * <p>You can use this parameter to specify any instance types that are available for purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The weight of the instance type. If you want to scale instances based on instance type weights in the scaling group, you must specify this parameter after you specify <code>LaunchTemplateOverrides.InstanceType</code>.</p>
             * <p>The weight specifies the capacity of an instance of the specified instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
             * <p>Performance metrics such as the number of vCPUs and the memory size of each instance type may vary. You can specify different weights for different instance types based on your business requirements.</p>
             * <p>Example:</p>
             * <ul>
             * <li>Current capacity: 0</li>
             * <li>Expected capacity: 6</li>
             * <li>Capacity of ecs.c5.xlarge: 4</li>
             * </ul>
             * <p>To reach the expected capacity, Auto Scaling must scale out two instances of ecs.c5.xlarge.</p>
             * <blockquote>
             * <p> The total capacity of the scaling group is constrained and cannot surpass the combined total of the maximum group size defined by MaxSize and the highest weight assigned to any instance type.</p>
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
}
