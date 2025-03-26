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
 * {@link DescribeScalingInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingInstancesResponseBody</p>
 */
public class DescribeScalingInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingInstances")
    private java.util.List<ScalingInstances> scalingInstances;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalSpotCount")
    private Integer totalSpotCount;

    private DescribeScalingInstancesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingInstances = builder.scalingInstances;
        this.totalCount = builder.totalCount;
        this.totalSpotCount = builder.totalSpotCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingInstances
     */
    public java.util.List<ScalingInstances> getScalingInstances() {
        return this.scalingInstances;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalSpotCount
     */
    public Integer getTotalSpotCount() {
        return this.totalSpotCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ScalingInstances> scalingInstances; 
        private Integer totalCount; 
        private Integer totalSpotCount; 

        private Builder() {
        } 

        private Builder(DescribeScalingInstancesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scalingInstances = model.scalingInstances;
            this.totalCount = model.totalCount;
            this.totalSpotCount = model.totalSpotCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B13527BF-1FBD-4334-A512-20F5E9D3FB4D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ECS instances.</p>
         */
        public Builder scalingInstances(java.util.List<ScalingInstances> scalingInstances) {
            this.scalingInstances = scalingInstances;
            return this;
        }

        /**
         * <p>The total number of ECS instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of preemptible instances that run as expected in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalSpotCount(Integer totalSpotCount) {
            this.totalSpotCount = totalSpotCount;
            return this;
        }

        public DescribeScalingInstancesResponseBody build() {
            return new DescribeScalingInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingInstancesResponseBody</p>
     */
    public static class ScalingInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CreationType")
        private String creationType;

        @com.aliyun.core.annotation.NameInMap("Entrusted")
        private Boolean entrusted;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
        private String scalingActivityId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingInstanceId")
        private String scalingInstanceId;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("WarmupState")
        private String warmupState;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ScalingInstances(Builder builder) {
            this.createdTime = builder.createdTime;
            this.creationTime = builder.creationTime;
            this.creationType = builder.creationType;
            this.entrusted = builder.entrusted;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerWeight = builder.loadBalancerWeight;
            this.privateIpAddress = builder.privateIpAddress;
            this.scalingActivityId = builder.scalingActivityId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingInstanceId = builder.scalingInstanceId;
            this.spotStrategy = builder.spotStrategy;
            this.warmupState = builder.warmupState;
            this.weightedCapacity = builder.weightedCapacity;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingInstances create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return creationType
         */
        public String getCreationType() {
            return this.creationType;
        }

        /**
         * @return entrusted
         */
        public Boolean getEntrusted() {
            return this.entrusted;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
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
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerWeight
         */
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return scalingActivityId
         */
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingInstanceId
         */
        public String getScalingInstanceId() {
            return this.scalingInstanceId;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return warmupState
         */
        public String getWarmupState() {
            return this.warmupState;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createdTime; 
            private String creationTime; 
            private String creationType; 
            private Boolean entrusted; 
            private String healthStatus; 
            private String instanceId; 
            private String launchTemplateId; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private Integer loadBalancerWeight; 
            private String privateIpAddress; 
            private String scalingActivityId; 
            private String scalingConfigurationId; 
            private String scalingGroupId; 
            private String scalingInstanceId; 
            private String spotStrategy; 
            private String warmupState; 
            private Integer weightedCapacity; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ScalingInstances model) {
                this.createdTime = model.createdTime;
                this.creationTime = model.creationTime;
                this.creationType = model.creationType;
                this.entrusted = model.entrusted;
                this.healthStatus = model.healthStatus;
                this.instanceId = model.instanceId;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.lifecycleState = model.lifecycleState;
                this.loadBalancerWeight = model.loadBalancerWeight;
                this.privateIpAddress = model.privateIpAddress;
                this.scalingActivityId = model.scalingActivityId;
                this.scalingConfigurationId = model.scalingConfigurationId;
                this.scalingGroupId = model.scalingGroupId;
                this.scalingInstanceId = model.scalingInstanceId;
                this.spotStrategy = model.spotStrategy;
                this.warmupState = model.warmupState;
                this.weightedCapacity = model.weightedCapacity;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the ECS instances were added to the scaling group. The value is accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18T03:11:39Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The time when the ECS instances were added to the scaling group. The value is accurate to the minute.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18T03:11Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The instance creation method. Valid values:</p>
             * <ul>
             * <li>AutoCreated: The ECS instances are created by Auto Scaling based on the instance configuration source.</li>
             * <li>Attached: The ECS instances are manually added to the scaling group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoCreated</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>Indicates whether the scaling group is allowed to manage the instance lifecycles when ECS instances are manually added. If the scaling group is allowed to manage the instance lifecycles, Auto Scaling can release the ECS instances when the instances are automatically removed from the scaling group. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder entrusted(Boolean entrusted) {
                this.entrusted = entrusted;
                return this;
            }

            /**
             * <p>The health status of the ECS instance in the scaling group. If an ECS instance is not in the Running state, the instance is considered unhealthy. Valid values:</p>
             * <ul>
             * <li>Healthy</li>
             * <li>Unhealthy</li>
             * </ul>
             * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
             * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the lifecycles of the instances. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
             * <blockquote>
             * <p> Make sure that you have sufficient balance within your Alibaba Cloud account. If your Alibaba Cloud account has an overdue payment, all pay-as-you-go ECS instances, including preemptible instances, may be stopped or even released. For information about how the status of ECS instances changes when you have an overdue payment in your Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp109k5j3dum1ce6****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5e3ofjr1zn1aw7****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The version number of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The lifecycle status of the ECS instance in the scaling group. Valid values:</p>
             * <ul>
             * <li>InService: The ECS instance is added to the scaling group and provides services as expected.</li>
             * <li>Pending: The ECS instance is being added to the scaling group. When an ECS instance is being added to the scaling group, Auto Scaling also adds the instance to the backend server groups of the attached load balancers and adds the private IP address of the instance to the IP address whitelists of the attached ApsaraDB RDS instances.</li>
             * <li>Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a scale-out lifecycle hook is in effect, the ECS instance remains in the Pending:Wait state until the timeout period for the lifecycle hook expires.</li>
             * <li>Protected: The ECS instance is protected. Protected ECS instances can continue to provide services as expected, but Auto Scaling does not manage the lifecycles of the ECS instances. You must manually manage the lifecycles of the ECS instances.</li>
             * <li>Standby: The ECS instance is on standby. Standby ECS instances do not provide services as expected, and the weights of the ECS instances as backend servers are reset to zero. Auto Scaling does not manage the lifecycles of the ECS instances. Therefore, you must manually manage the lifecycles of the ECS instances.</li>
             * <li>Stopped: The ECS instance is stopped. Stopped ECS instances no longer provide services.</li>
             * <li>Removing: The ECS instance is being removed from the scaling group. When an ECS instance is being removed from the scaling group, Auto Scaling also removes the instance from the backend server groups of the attached load balancers and removes the private IP address of the instance from the IP address whitelists of the attached ApsaraDB RDS instances.</li>
             * <li>Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a scale-in lifecycle hook is in effect, the ECS instance remains in the Removing:Wait state until the timeout period for the lifecycle hook expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InService</p>
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * <p>The weight of each ECS instance as a backend server.</p>
             * <blockquote>
             * <p> This parameter is deprecated and is not recommended.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1**.2*.1**.2**</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the scaling activity during which the ECS instances were added to the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asa-bp1c9djwrgxjyk31****</p>
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-bp1i65jd06v04vdh****</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1igpak5ft1flyp****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The ID of the ECS instance or elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>asi-j6cj1gcte640ekhb****</p>
             */
            public Builder scalingInstanceId(String scalingInstanceId) {
                this.scalingInstanceId = scalingInstanceId;
                return this;
            }

            /**
             * <p>The bidding policy for the preemptible instances. Valid values:</p>
             * <ul>
             * <li>SpotWithPriceLimit: The instances are preemptible instances that have a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bidding price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SpotWithPriceLimit</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The warm-up status of the ECS instances. Valid values:</p>
             * <ul>
             * <li>NoNeedWarmup: The ECS instances do not need to undergo a warm-up process.</li>
             * <li>WaitingForInstanceWarmup: The ECS instances are undergoing the warm-up process.</li>
             * <li>InstanceWarmupFinish: The warm-up process for the ECS instances is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoNeedWarmup</p>
             */
            public Builder warmupState(String warmupState) {
                this.warmupState = warmupState;
                return this;
            }

            /**
             * <p>The weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the instance type are required to meet the expected capacity requirement.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * <p>The zone ID of the ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ScalingInstances build() {
                return new ScalingInstances(this);
            } 

        } 

    }
}
