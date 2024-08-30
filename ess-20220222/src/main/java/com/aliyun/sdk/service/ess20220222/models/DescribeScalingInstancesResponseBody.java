// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < ScalingInstances> scalingInstances;

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
    public java.util.List < ScalingInstances> getScalingInstances() {
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
        private java.util.List < ScalingInstances> scalingInstances; 
        private Integer totalCount; 
        private Integer totalSpotCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ECS instances.
         */
        public Builder scalingInstances(java.util.List < ScalingInstances> scalingInstances) {
            this.scalingInstances = scalingInstances;
            return this;
        }

        /**
         * The total number of ECS instances in the scaling group.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The total number of preemptible instances that run as expected in the scaling group.
         */
        public Builder totalSpotCount(Integer totalSpotCount) {
            this.totalSpotCount = totalSpotCount;
            return this;
        }

        public DescribeScalingInstancesResponseBody build() {
            return new DescribeScalingInstancesResponseBody(this);
        } 

    } 

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

            /**
             * The time when the ECS instances were added to the scaling group. The value is accurate to the second.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The time when the ECS instances were added to the scaling group. The value is accurate to the minute.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The instance creation method. Valid values:
             * <p>
             * 
             * *   AutoCreated: The ECS instances are created by Auto Scaling based on the instance configuration source.
             * *   Attached: The ECS instances are manually added to the scaling group.
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * Indicates whether the scaling group is allowed to manage the instance lifecycles when ECS instances are manually added. If the scaling group is allowed to manage the instance lifecycles, Auto Scaling can release the ECS instances when the instances are automatically removed from the scaling group. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder entrusted(Boolean entrusted) {
                this.entrusted = entrusted;
                return this;
            }

            /**
             * The health status of the ECS instance in the scaling group. If an ECS instance is not in the Running state, the instance is considered unhealthy. Valid values:
             * <p>
             * 
             * *   Healthy
             * *   Unhealthy
             * 
             * Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.
             * 
             * Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the lifecycles of the instances. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.
             * 
             * >  Make sure that you have sufficient balance within your Alibaba Cloud account. If your Alibaba Cloud account has an overdue payment, all pay-as-you-go ECS instances, including preemptible instances, may be stopped or even released. For information about how the status of ECS instances changes when you have an overdue payment in your Alibaba Cloud account, see [Overdue payments](~~170589~~).
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the launch template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The version number of the launch template.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * The lifecycle status of the ECS instance in the scaling group. Valid values:
             * <p>
             * 
             * *   InService: The ECS instance is added to the scaling group and provides services as expected.
             * *   Pending: The ECS instance is being added to the scaling group. When an ECS instance is being added to the scaling group, Auto Scaling also adds the instance to the backend server groups of the attached load balancers and adds the private IP address of the instance to the IP address whitelists of the attached ApsaraDB RDS instances.
             * *   Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a scale-out lifecycle hook is in effect, the ECS instance remains in the Pending:Wait state until the timeout period for the lifecycle hook expires.
             * *   Protected: The ECS instance is protected. Protected ECS instances can continue to provide services as expected, but Auto Scaling does not manage the lifecycles of the ECS instances. You must manually manage the lifecycles of the ECS instances.
             * *   Standby: The ECS instance is on standby. Standby ECS instances do not provide services as expected, and the weights of the ECS instances as backend servers are reset to zero. Auto Scaling does not manage the lifecycles of the ECS instances. Therefore, you must manually manage the lifecycles of the ECS instances.
             * *   Stopped: The ECS instance is stopped. Stopped ECS instances no longer provide services.
             * *   Removing: The ECS instance is being removed from the scaling group. When an ECS instance is being removed from the scaling group, Auto Scaling also removes the instance from the backend server groups of the attached load balancers and removes the private IP address of the instance from the IP address whitelists of the attached ApsaraDB RDS instances.
             * *   Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a scale-in lifecycle hook is in effect, the ECS instance remains in the Removing:Wait state until the timeout period for the lifecycle hook expires.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The weight of each ECS instance as a backend server.
             * <p>
             * 
             * >  This parameter is deprecated and is not recommended.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * The private IP address of the ECS instance.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the scaling activity during which the ECS instances were added to the scaling group.
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * The ID of the scaling configuration.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The ID of the ECS instance or elastic container instance.
             */
            public Builder scalingInstanceId(String scalingInstanceId) {
                this.scalingInstanceId = scalingInstanceId;
                return this;
            }

            /**
             * The bidding policy for the preemptible instances. Valid values:
             * <p>
             * 
             * *   SpotWithPriceLimit: The instances are preemptible instances that have a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bidding price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The warm-up status of the ECS instances. Valid values:
             * <p>
             * 
             * *   NoNeedWarmup: The ECS instances do not need to undergo a warm-up process.
             * *   WaitingForInstanceWarmup: The ECS instances are undergoing the warm-up process.
             * *   InstanceWarmupFinish: The warm-up process for the ECS instances is complete.
             */
            public Builder warmupState(String warmupState) {
                this.warmupState = warmupState;
                return this;
            }

            /**
             * The weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the instance type are required to meet the expected capacity requirement.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * The zone ID of the ECS instances.
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
