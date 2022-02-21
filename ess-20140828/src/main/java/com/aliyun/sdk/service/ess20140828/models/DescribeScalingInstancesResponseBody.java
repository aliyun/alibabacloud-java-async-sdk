// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingInstancesResponseBody</p>
 */
public class DescribeScalingInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingInstances")
    private ScalingInstances scalingInstances;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TotalSpotCount")
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
    public ScalingInstances getScalingInstances() {
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
        private ScalingInstances scalingInstances; 
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
         * ScalingInstances.
         */
        public Builder scalingInstances(ScalingInstances scalingInstances) {
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

    public static class ScalingInstance extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CreationType")
        private String creationType;

        @NameInMap("Entrusted")
        private Boolean entrusted;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("LifecycleState")
        private String lifecycleState;

        @NameInMap("LoadBalancerWeight")
        private Integer loadBalancerWeight;

        @NameInMap("ScalingActivityId")
        private String scalingActivityId;

        @NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("WarmupState")
        private String warmupState;

        @NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        @NameInMap("ZoneId")
        private String zoneId;

        private ScalingInstance(Builder builder) {
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
            this.scalingActivityId = builder.scalingActivityId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingGroupId = builder.scalingGroupId;
            this.spotStrategy = builder.spotStrategy;
            this.warmupState = builder.warmupState;
            this.weightedCapacity = builder.weightedCapacity;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingInstance create() {
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
            private String scalingActivityId; 
            private String scalingConfigurationId; 
            private String scalingGroupId; 
            private String spotStrategy; 
            private String warmupState; 
            private Integer weightedCapacity; 
            private String zoneId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CreationType.
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * Entrusted.
             */
            public Builder entrusted(Boolean entrusted) {
                this.entrusted = entrusted;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateVersion.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * LifecycleState.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * LoadBalancerWeight.
             */
            public Builder loadBalancerWeight(Integer loadBalancerWeight) {
                this.loadBalancerWeight = loadBalancerWeight;
                return this;
            }

            /**
             * ScalingActivityId.
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * ScalingConfigurationId.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * WarmupState.
             */
            public Builder warmupState(String warmupState) {
                this.warmupState = warmupState;
                return this;
            }

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ScalingInstance build() {
                return new ScalingInstance(this);
            } 

        } 

    }
    public static class ScalingInstances extends TeaModel {
        @NameInMap("ScalingInstance")
        private java.util.List < ScalingInstance> scalingInstance;

        private ScalingInstances(Builder builder) {
            this.scalingInstance = builder.scalingInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingInstances create() {
            return builder().build();
        }

        /**
         * @return scalingInstance
         */
        public java.util.List < ScalingInstance> getScalingInstance() {
            return this.scalingInstance;
        }

        public static final class Builder {
            private java.util.List < ScalingInstance> scalingInstance; 

            /**
             * ScalingInstance.
             */
            public Builder scalingInstance(java.util.List < ScalingInstance> scalingInstance) {
                this.scalingInstance = scalingInstance;
                return this;
            }

            public ScalingInstances build() {
                return new ScalingInstances(this);
            } 

        } 

    }
}
