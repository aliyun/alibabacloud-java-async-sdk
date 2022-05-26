// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * GroupsInfo.
         */
        public Builder groupsInfo(java.util.List < GroupsInfo> groupsInfo) {
            this.groupsInfo = groupsInfo;
            return this;
        }

        /**
         * RequestId.
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

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("GroupUsers")
        private String groupUsers;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUsers = builder.groupUsers;
            this.nodeNum = builder.nodeNum;
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
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String groupName; 
            private String groupType; 
            private String groupUsers; 
            private Integer nodeNum; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * GroupUsers.
             */
            public Builder groupUsers(String groupUsers) {
                this.groupUsers = groupUsers;
                return this;
            }

            /**
             * NodeNum.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * UpdateTime.
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
