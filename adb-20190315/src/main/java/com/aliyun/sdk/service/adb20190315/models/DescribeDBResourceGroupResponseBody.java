// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponseBody</p>
 */
public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("GroupsInfo")
    private java.util.List < GroupsInfo> groupsInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBResourceGroupResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String DBClusterId; 
        private java.util.List < GroupsInfo> groupsInfo; 
        private String requestId; 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried resource groups.</p>
         */
        public Builder groupsInfo(java.util.List < GroupsInfo> groupsInfo) {
            this.groupsInfo = groupsInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBResourceGroupResponseBody build() {
            return new DescribeDBResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class GroupsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUserList")
        private java.util.List < String > groupUserList;

        @com.aliyun.core.annotation.NameInMap("GroupUsers")
        private String groupUsers;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUserList = builder.groupUserList;
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
         * @return groupUserList
         */
        public java.util.List < String > getGroupUserList() {
            return this.groupUserList;
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
            private java.util.List < String > groupUserList; 
            private String groupUsers; 
            private Integer nodeNum; 
            private String updateTime; 

            /**
             * <p>The time when the resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-09 16:57:35.241</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFAULT</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The query execution mode. Valid values:</p>
             * <ul>
             * <li><strong>interactive</strong></li>
             * <li><strong>batch</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>interactive</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The database accounts that are associated with the resource group.</p>
             */
            public Builder groupUserList(java.util.List < String > groupUserList) {
                this.groupUserList = groupUserList;
                return this;
            }

            /**
             * <p>The database accounts that are associated with the resource group. Multiple database accounts are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>testb,testc</p>
             */
            public Builder groupUsers(String groupUsers) {
                this.groupUsers = groupUsers;
                return this;
            }

            /**
             * <p>The number of nodes. Each node provides 16 cores and 64 GB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The time when the resource group was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-09 16:57:35.241</p>
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
