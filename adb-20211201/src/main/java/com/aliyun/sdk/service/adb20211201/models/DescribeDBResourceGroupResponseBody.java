// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponseBody</p>
 */
public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("GroupsInfo")
    private java.util.List < GroupsInfo> groupsInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBResourceGroupResponseBody(Builder builder) {
        this.groupsInfo = builder.groupsInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupsInfo
     */
    public java.util.List < GroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GroupsInfo> groupsInfo; 
        private String requestId; 

        /**
         * The queried resource group.
         */
        public Builder groupsInfo(java.util.List < GroupsInfo> groupsInfo) {
            this.groupsInfo = groupsInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBResourceGroupResponseBody build() {
            return new DescribeDBResourceGroupResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("TargetGroupName")
        private String targetGroupName;

        private Rules(Builder builder) {
            this.groupName = builder.groupName;
            this.queryTime = builder.queryTime;
            this.targetGroupName = builder.targetGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return targetGroupName
         */
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

        public static final class Builder {
            private String groupName; 
            private String queryTime; 
            private String targetGroupName; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * TargetGroupName.
             */
            public Builder targetGroupName(String targetGroupName) {
                this.targetGroupName = targetGroupName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class GroupsInfo extends TeaModel {
        @NameInMap("ClusterMode")
        private String clusterMode;

        @NameInMap("ClusterSizeResource")
        private String clusterSizeResource;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ElasticMinComputeResource")
        private String elasticMinComputeResource;

        @NameInMap("EnableSpot")
        private String enableSpot;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("GroupUsers")
        private String groupUsers;

        @NameInMap("MaxClusterCount")
        private Integer maxClusterCount;

        @NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @NameInMap("MinClusterCount")
        private Integer minClusterCount;

        @NameInMap("MinComputeResource")
        private String minComputeResource;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("RunningClusterCount")
        private Integer runningClusterCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.clusterMode = builder.clusterMode;
            this.clusterSizeResource = builder.clusterSizeResource;
            this.createTime = builder.createTime;
            this.elasticMinComputeResource = builder.elasticMinComputeResource;
            this.enableSpot = builder.enableSpot;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUsers = builder.groupUsers;
            this.maxClusterCount = builder.maxClusterCount;
            this.maxComputeResource = builder.maxComputeResource;
            this.minClusterCount = builder.minClusterCount;
            this.minComputeResource = builder.minComputeResource;
            this.rules = builder.rules;
            this.runningClusterCount = builder.runningClusterCount;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupsInfo create() {
            return builder().build();
        }

        /**
         * @return clusterMode
         */
        public String getClusterMode() {
            return this.clusterMode;
        }

        /**
         * @return clusterSizeResource
         */
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return elasticMinComputeResource
         */
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        /**
         * @return enableSpot
         */
        public String getEnableSpot() {
            return this.enableSpot;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return groupUsers
         */
        public String getGroupUsers() {
            return this.groupUsers;
        }

        /**
         * @return maxClusterCount
         */
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        /**
         * @return maxComputeResource
         */
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        /**
         * @return minClusterCount
         */
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        /**
         * @return minComputeResource
         */
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return runningClusterCount
         */
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String clusterMode; 
            private String clusterSizeResource; 
            private String createTime; 
            private String elasticMinComputeResource; 
            private String enableSpot; 
            private String groupName; 
            private String groupType; 
            private String groupUsers; 
            private Integer maxClusterCount; 
            private String maxComputeResource; 
            private Integer minClusterCount; 
            private String minComputeResource; 
            private java.util.List < Rules> rules; 
            private Integer runningClusterCount; 
            private String status; 
            private String updateTime; 

            /**
             * A reserved parameter.
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder clusterSizeResource(String clusterSizeResource) {
                this.clusterSizeResource = clusterSizeResource;
                return this;
            }

            /**
             * The time when the resource group was created. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The minimum amount of elastic computing resources. Unit: ACUs.
             */
            public Builder elasticMinComputeResource(String elasticMinComputeResource) {
                this.elasticMinComputeResource = elasticMinComputeResource;
                return this;
            }

            /**
             * EnableSpot.
             */
            public Builder enableSpot(String enableSpot) {
                this.enableSpot = enableSpot;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the resource group. Valid values:
             * <p>
             * 
             * *   **Interactive**
             * *   **Job**
             * 
             * >  For more information about resource groups, see [Resource groups](~~428610~~).
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The Resource Access Management (RAM) user with which the resource group is associated.
             */
            public Builder groupUsers(String groupUsers) {
                this.groupUsers = groupUsers;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder maxClusterCount(Integer maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * The maximum amount of reserved computing resources. Unit: ACUs.
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder minClusterCount(Integer minClusterCount) {
                this.minClusterCount = minClusterCount;
                return this;
            }

            /**
             * The minimum amount of reserved computing resources. Unit: AnalyticDB compute units (ACUs).
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder runningClusterCount(Integer runningClusterCount) {
                this.runningClusterCount = runningClusterCount;
                return this;
            }

            /**
             * The state of the resource group. Valid values:
             * <p>
             * 
             * *   **creating**: The resource group is being created.
             * *   **ok**: The resource group is created.
             * *   **pendingdelete**: The resource group is pending to be deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the resource group was updated. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public GroupsInfo build() {
                return new GroupsInfo(this);
            } 

        } 

    }
}
