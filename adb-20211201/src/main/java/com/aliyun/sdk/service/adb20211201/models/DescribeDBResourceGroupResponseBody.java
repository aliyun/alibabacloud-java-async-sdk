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
         * The queried resource groups.
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

    public static class GroupsInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ElasticMinComputeResource")
        private String elasticMinComputeResource;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("GroupUsers")
        private String groupUsers;

        @NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @NameInMap("MinComputeResource")
        private String minComputeResource;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.elasticMinComputeResource = builder.elasticMinComputeResource;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUsers = builder.groupUsers;
            this.maxComputeResource = builder.maxComputeResource;
            this.minComputeResource = builder.minComputeResource;
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
         * @return maxComputeResource
         */
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        /**
         * @return minComputeResource
         */
        public String getMinComputeResource() {
            return this.minComputeResource;
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
            private String createTime; 
            private String elasticMinComputeResource; 
            private String groupName; 
            private String groupType; 
            private String groupUsers; 
            private String maxComputeResource; 
            private String minComputeResource; 
            private String status; 
            private String updateTime; 

            /**
             * The time when the resource group was created. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The amount of minimum elastic computing resources. Unit: ACU.
             */
            public Builder elasticMinComputeResource(String elasticMinComputeResource) {
                this.elasticMinComputeResource = elasticMinComputeResource;
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
             * > For information about resource groups of Data Lakehouse Edition, see [Resource groups](~~428610~~).
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
             * The maximum amount of reserved computing resources. Unit: ACU.
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * The minimum amount of reserved computing resources. Unit: AnalyticDB compute unit (ACU).
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            /**
             * The state of the resource group. Valid values:
             * <p>
             * 
             * *   **creating**
             * *   **ok**
             * *   **pendingdelete**
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
