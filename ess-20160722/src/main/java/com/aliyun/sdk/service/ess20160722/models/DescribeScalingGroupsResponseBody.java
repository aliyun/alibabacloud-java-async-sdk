// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupsResponseBody</p>
 */
public class DescribeScalingGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroups")
    private ScalingGroups scalingGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingGroups = builder.scalingGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupsResponseBody create() {
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
     * @return scalingGroups
     */
    public ScalingGroups getScalingGroups() {
        return this.scalingGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private ScalingGroups scalingGroups; 
        private Integer totalCount; 

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
         * ScalingGroups.
         */
        public Builder scalingGroups(ScalingGroups scalingGroups) {
            this.scalingGroups = scalingGroups;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingGroupsResponseBody build() {
            return new DescribeScalingGroupsResponseBody(this);
        } 

    } 

    public static class DBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private java.util.List < String > DBInstanceId;

        private DBInstanceIds(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public java.util.List < String > getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > DBInstanceId; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(java.util.List < String > DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    public static class LoadBalancerIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private java.util.List < String > loadBalancerId;

        private LoadBalancerIds(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerIds create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public java.util.List < String > getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private java.util.List < String > loadBalancerId; 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(java.util.List < String > loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancerIds build() {
                return new LoadBalancerIds(this);
            } 

        } 

    }
    public static class RemovalPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemovalPolicy")
        private java.util.List < String > removalPolicy;

        private RemovalPolicies(Builder builder) {
            this.removalPolicy = builder.removalPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovalPolicies create() {
            return builder().build();
        }

        /**
         * @return removalPolicy
         */
        public java.util.List < String > getRemovalPolicy() {
            return this.removalPolicy;
        }

        public static final class Builder {
            private java.util.List < String > removalPolicy; 

            /**
             * RemovalPolicy.
             */
            public Builder removalPolicy(java.util.List < String > removalPolicy) {
                this.removalPolicy = removalPolicy;
                return this;
            }

            public RemovalPolicies build() {
                return new RemovalPolicies(this);
            } 

        } 

    }
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
        private Integer defaultCooldown;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
        private LoadBalancerIds loadBalancerIds;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("PendingCapacity")
        private Integer pendingCapacity;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemovalPolicies")
        private RemovalPolicies removalPolicies;

        @com.aliyun.core.annotation.NameInMap("RemovingCapacity")
        private Integer removingCapacity;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
        private String scalingGroupName;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private ScalingGroup(Builder builder) {
            this.activeCapacity = builder.activeCapacity;
            this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
            this.creationTime = builder.creationTime;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.defaultCooldown = builder.defaultCooldown;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerIds = builder.loadBalancerIds;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.pendingCapacity = builder.pendingCapacity;
            this.regionId = builder.regionId;
            this.removalPolicies = builder.removalPolicies;
            this.removingCapacity = builder.removingCapacity;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingGroupName = builder.scalingGroupName;
            this.totalCapacity = builder.totalCapacity;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
            return builder().build();
        }

        /**
         * @return activeCapacity
         */
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        /**
         * @return activeScalingConfigurationId
         */
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        /**
         * @return defaultCooldown
         */
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerIds
         */
        public LoadBalancerIds getLoadBalancerIds() {
            return this.loadBalancerIds;
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
         * @return pendingCapacity
         */
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return removalPolicies
         */
        public RemovalPolicies getRemovalPolicies() {
            return this.removalPolicies;
        }

        /**
         * @return removingCapacity
         */
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
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
         * @return totalCapacity
         */
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private Integer activeCapacity; 
            private String activeScalingConfigurationId; 
            private String creationTime; 
            private DBInstanceIds DBInstanceIds; 
            private Integer defaultCooldown; 
            private String lifecycleState; 
            private LoadBalancerIds loadBalancerIds; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer pendingCapacity; 
            private String regionId; 
            private RemovalPolicies removalPolicies; 
            private Integer removingCapacity; 
            private String scalingGroupId; 
            private String scalingGroupName; 
            private Integer totalCapacity; 
            private String vSwitchId; 

            /**
             * ActiveCapacity.
             */
            public Builder activeCapacity(Integer activeCapacity) {
                this.activeCapacity = activeCapacity;
                return this;
            }

            /**
             * ActiveScalingConfigurationId.
             */
            public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
                this.activeScalingConfigurationId = activeScalingConfigurationId;
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
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * DefaultCooldown.
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
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
             * LoadBalancerIds.
             */
            public Builder loadBalancerIds(LoadBalancerIds loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * MaxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MinSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * PendingCapacity.
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RemovalPolicies.
             */
            public Builder removalPolicies(RemovalPolicies removalPolicies) {
                this.removalPolicies = removalPolicies;
                return this;
            }

            /**
             * RemovingCapacity.
             */
            public Builder removingCapacity(Integer removingCapacity) {
                this.removingCapacity = removingCapacity;
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
             * ScalingGroupName.
             */
            public Builder scalingGroupName(String scalingGroupName) {
                this.scalingGroupName = scalingGroupName;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
    public static class ScalingGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScalingGroup")
        private java.util.List < ScalingGroup> scalingGroup;

        private ScalingGroups(Builder builder) {
            this.scalingGroup = builder.scalingGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroups create() {
            return builder().build();
        }

        /**
         * @return scalingGroup
         */
        public java.util.List < ScalingGroup> getScalingGroup() {
            return this.scalingGroup;
        }

        public static final class Builder {
            private java.util.List < ScalingGroup> scalingGroup; 

            /**
             * ScalingGroup.
             */
            public Builder scalingGroup(java.util.List < ScalingGroup> scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            public ScalingGroups build() {
                return new ScalingGroups(this);
            } 

        } 

    }
}
