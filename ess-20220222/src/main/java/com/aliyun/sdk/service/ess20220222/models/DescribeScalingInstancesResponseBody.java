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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B13527BF-1FBD-4334-A512-20F5E9D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The collection of ECS instance information.</p>
         */
        public Builder scalingInstances(java.util.List<ScalingInstances> scalingInstances) {
            this.scalingInstances = scalingInstances;
            return this;
        }

        /**
         * <p>The total number of ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of running spot instances in the scaling group.</p>
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

        @com.aliyun.core.annotation.NameInMap("ReplaceStatus")
        private String replaceStatus;

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
            this.replaceStatus = builder.replaceStatus;
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
         * @return replaceStatus
         */
        public String getReplaceStatus() {
            return this.replaceStatus;
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
            private String replaceStatus; 
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
                this.replaceStatus = model.replaceStatus;
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
             * <p>The time when the ECS instance was added to the scaling group. The time is accurate to seconds and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18T03:11:39Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The time when the ECS instance was added to the scaling group. The time is accurate to minutes and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18T03:11Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The creation type of the ECS instance. Valid values: </p>
             * <ul>
             * <li>AutoCreated: The ECS instance is created by Auto Scaling through automatic creation based on the instance configuration source. </li>
             * <li>Attached: The ECS instance is not created by Auto Scaling, but is manually added to the scaling group.</li>
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
             * <p>Specifies whether the instance is managed by the scaling group when it is manually added to the scaling group. A manually added instance in the managed state is released when it is removed from the scaling group, excluding manual removal. Valid values:</p>
             * <ul>
             * <li>true: The instance is managed by the scaling group.</li>
             * <li>false: The instance is not managed by the scaling group.</li>
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
             * <p>The health status of the ECS instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values: </p>
             * <ul>
             * <li>Healthy: The ECS instance is healthy. </li>
             * <li>Unhealthy: The ECS instance is unhealthy.</li>
             * </ul>
             * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and releases ECS instances created through automatic creation.</p>
             * <p>Whether to release manually added ECS instances depends on their managed state. If the instance lifecycle is not managed by the scaling group, the instance is only removed but not released. If the instance lifecycle is managed by the scaling group, the instance is removed and released.</p>
             * <blockquote>
             * <p>Make sure that your account has sufficient active balance. If your account has overdue payments, all pay-as-you-go ECS instances, including pay-as-you-go instances and spot instances, are stopped or even released. For more information about the instance status changes of ECS instances in a scaling group after overdue payments, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
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
             * <p>The ID of the instance launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5e3ofjr1zn1aw7****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The version of the instance launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The lifecycle state of the ECS instance in the scaling group. Valid values:</p>
             * <ul>
             * <li>InService: The ECS instance is added to the scaling group and provides services normally. </li>
             * <li>Pending: The ECS instance is being added to the scaling group. The procedure of adding an ECS instance to a scaling group includes adding the instance to the backend server group of a load balancing instance and adding the IP address of the instance to the access whitelist of an ApsaraDB RDS instance.</li>
             * <li>Pending:Wait: The addition of the ECS instance to the scaling group is suspended. If a lifecycle hook applicable to scale-out activities is created in the scaling group, the ECS instance is suspended when it is added to the scaling group and waits for the hook timeout to end.</li>
             * <li>Protected: The ECS instance provides services normally, but Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
             * <li>Standby: The ECS instance does not provide services, the weight of SLB backend server is set to zero, and Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
             * <li>Stopped: The ECS instance is stopped and does not provide services.</li>
             * <li>Removing: The ECS instance is being removed from the scaling group. The procedure of removing an ECS instance from a scaling group includes removing the instance from the backend server group of a load balancing instance and removing the IP address of the instance from the access whitelist of an ApsaraDB RDS instance. </li>
             * <li>Removing:Wait: The removal of the ECS instance from the scaling group is suspended. If a lifecycle hook applicable to scale-down activities is created in the scaling group, the ECS instance is suspended when it is removed from the scaling group and waits for the hook timeout to end.</li>
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
             * <p>The weight of the SLB backend server.</p>
             * <blockquote>
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. Do not use it.</p>
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
             * <p>The internal IP address of the instance in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1**.2*.1**.2**</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The instance replacement process that the instance is in. Valid values:</p>
             * <ul>
             * <li>Normal: The instance is not in any replacement process.</li>
             * <li>ReBalance: The instance is in the rebalancing replacement process of the scaling group.</li>
             * <li>SpotRemedy: The instance is in the spot instance remedy replacement process.</li>
             * <li>MaxInstanceLifetimeExpire: The instance is in the replacement process due to the expiration of the maximum instance lifetime.</li>
             * <li>InstanceRefresh: The instance is in the instance refresh replacement process.</li>
             * <li>SpotReplaceOnDemand: The instance is in the process of replacing a spot instance with a pay-as-you-go instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReBalance</p>
             */
            public Builder replaceStatus(String replaceStatus) {
                this.replaceStatus = replaceStatus;
                return this;
            }

            /**
             * <p>The ID of the scaling activity when the ECS instance was added to the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asa-bp1c9djwrgxjyk31****</p>
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * <p>The ID of the associated scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-bp1i65jd06v04vdh****</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * <p>The ID of the scaling group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1igpak5ft1flyp****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The instance identity in the scaling group, which corresponds one-to-one with the ID of the ECS instance or elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>asi-j6cj1gcte640ekhb****</p>
             */
            public Builder scalingInstanceId(String scalingInstanceId) {
                this.scalingInstanceId = scalingInstanceId;
                return this;
            }

            /**
             * <p>The bidding policy for the spot instance. Valid values:</p>
             * <ul>
             * <li>SpotWithPriceLimit: The spot instance with a maximum price.</li>
             * <li>SpotAsPriceGo: The system automatically bids based on the current market price.</li>
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
             * <p>The warmup status of the ECS instance. Valid values: </p>
             * <ul>
             * <li>NoNeedWarmup: No warmup is required.</li>
             * <li>WaitingForInstanceWarmup: The instance is waiting for the warmup to complete.</li>
             * <li>InstanceWarmupFinish: The warmup is complete.</li>
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
             * <p>The weight of the instance type, which indicates the capacity of a single instance of the instance type in the scaling group. A greater weight indicates that fewer instances of the instance type are required to meet the expected capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * <p>The ID of the zone to which the ECS instance belongs.</p>
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
