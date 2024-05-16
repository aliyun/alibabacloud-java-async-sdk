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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the ECS instances.
         */
        public Builder scalingInstances(java.util.List < ScalingInstances> scalingInstances) {
            this.scalingInstances = scalingInstances;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalSpotCount.
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
             * The time when the ECS instance was added to the scaling group. The value is accurate to seconds.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The time when the ECS instance was added to the scaling group. The value is accurate to minutes.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates how the ECS instance is created. Valid values:
             * <p>
             * 
             * *   AutoCreated: Auto Scaling automatically creates ECS instances based on the instance configuration source.
             * *   Attached: You manually add independent ECS instances to the scaling group.
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * Indicates whether the scaling group is allowed to manage the instance lifecycle when you manually add the instance. If the scaling group is allowed to manage the instance lifecycle, Auto Scaling can release the instance when the instance is automatically removed from the scaling group. This rule does not apply to instances that are manually removed from the scaling group. Valid values:
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
             * The health status of the ECS instance in the scaling group. If the ECS instance does not run as expected, Auto Scaling considers the ECS instance unhealthy. Valid values:
             * <p>
             * 
             * *   Healthy
             * *   Unhealthy
             * 
             * Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases automatically created instances among the unhealthy instances.
             * 
             * Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.
             * 
             * >  Make sure that you have sufficient balance within your Alibaba Cloud account. If you have overdue payments within your Alibaba Cloud account, pay-as-you-go and preemptible instances are stopped or even released. For information about how the states of ECS instances change when you have overdue payments within your Alibaba Cloud account, see [Overdue payments](~~170589~~).
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The ID of the ECS instance
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
             * The lifecycle state of the ECS instance. Valid values:
             * <p>
             * 
             * *   InService: The ECS instance is added to the scaling group and provides services as expected.
             * *   Pending: The ECS instance is being added to the scaling group. During this process, Auto Scaling adds the ECS instance to the backend server groups of the associated SLB instance and adds the private IP address of the ECS instance to the IP address whitelist of the associated ApsaraDB RDS instance.
             * *   Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a lifecycle hook that applies to scale-outs is created for the scaling group, the ECS instance enters the Pending:Wait state. The ECS instance is added to the scaling group only after the lifecycle hook times out.
             * *   Protected: The ECS instance is being protected. The ECS instance can provide services as expected. However, Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.
             * *   Standby: The ECS instance is on standby. The ECS instance is out of service and the weight of the ECS instance as a backend server is set to zero. Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.
             * *   Stopped: The ECS instance is stopped. The ECS instance is stopped and cannot provide services.
             * *   Removing: The ECS instance is being removed from the scaling group. During this process, Auto Scaling removes the ECS instance from the backend server groups of the associated SLB instance and removes the IP address of the ECS instance from the IP address whitelist of the associated ApsaraDB RDS instance.
             * *   Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a lifecycle hook that applies to scale-ins is created for the scaling group, the ECS instance enters the Removing:Wait state. The ECS instance is removed from the scaling group only after the lifecycle hook times out.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The weight of the ECS instance as a backend server.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * The private IP address of the ECS instance in the scaling group.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the scaling activity during which the ECS instance is added to the scaling group.
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
             * The identifier of the ECS instance in the scaling group. The identifier of an ECS instance or elastic container instance matches the ID of the ECS instance or elastic container instance.
             */
            public Builder scalingInstanceId(String scalingInstanceId) {
                this.scalingInstanceId = scalingInstanceId;
                return this;
            }

            /**
             * The bidding policy for the preemptible instance. Valid values:
             * <p>
             * 
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The warmup state of the ECS instance. Valid values:
             * <p>
             * 
             * *   NoNeedWarmup: The instance does not need to be warmed up.
             * *   WaitingForInstanceWarmup: The instance is being warmed up.
             * *   InstanceWarmupFinish: The instance is warmed up.
             */
            public Builder warmupState(String warmupState) {
                this.warmupState = warmupState;
                return this;
            }

            /**
             * The weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A greater weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * The zone ID of the ECS instance.
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
