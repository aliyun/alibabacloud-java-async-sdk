// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponseBody</p>
 */
public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("GroupsInfo")
    private java.util.List<GroupsInfo> groupsInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<GroupsInfo> getGroupsInfo() {
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
        private java.util.List<GroupsInfo> groupsInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBResourceGroupResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.groupsInfo = model.groupsInfo;
            this.requestId = model.requestId;
        } 

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
        public Builder groupsInfo(java.util.List<GroupsInfo> groupsInfo) {
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
        @com.aliyun.core.annotation.NameInMap("ClusterMode")
        private String clusterMode;

        @com.aliyun.core.annotation.NameInMap("ClusterSizeResource")
        private String clusterSizeResource;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ElasticMinComputeResource")
        private String elasticMinComputeResource;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineParams")
        private java.util.Map<String, ?> engineParams;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUserList")
        private java.util.List<String> groupUserList;

        @com.aliyun.core.annotation.NameInMap("GroupUsers")
        private String groupUsers;

        @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
        private Integer maxClusterCount;

        @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @com.aliyun.core.annotation.NameInMap("MinClusterCount")
        private Integer minClusterCount;

        @com.aliyun.core.annotation.NameInMap("MinComputeResource")
        private String minComputeResource;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("RunningClusterCount")
        private Integer runningClusterCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.clusterMode = builder.clusterMode;
            this.clusterSizeResource = builder.clusterSizeResource;
            this.connectionString = builder.connectionString;
            this.createTime = builder.createTime;
            this.elasticMinComputeResource = builder.elasticMinComputeResource;
            this.engine = builder.engine;
            this.engineParams = builder.engineParams;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUserList = builder.groupUserList;
            this.groupUsers = builder.groupUsers;
            this.maxClusterCount = builder.maxClusterCount;
            this.maxComputeResource = builder.maxComputeResource;
            this.minClusterCount = builder.minClusterCount;
            this.minComputeResource = builder.minComputeResource;
            this.nodeNum = builder.nodeNum;
            this.port = builder.port;
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
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
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
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineParams
         */
        public java.util.Map<String, ?> getEngineParams() {
            return this.engineParams;
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
        public java.util.List<String> getGroupUserList() {
            return this.groupUserList;
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
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
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
            private String connectionString; 
            private String createTime; 
            private String elasticMinComputeResource; 
            private String engine; 
            private java.util.Map<String, ?> engineParams; 
            private String groupName; 
            private String groupType; 
            private java.util.List<String> groupUserList; 
            private String groupUsers; 
            private Integer maxClusterCount; 
            private String maxComputeResource; 
            private Integer minClusterCount; 
            private String minComputeResource; 
            private Integer nodeNum; 
            private String port; 
            private Integer runningClusterCount; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(GroupsInfo model) {
                this.clusterMode = model.clusterMode;
                this.clusterSizeResource = model.clusterSizeResource;
                this.connectionString = model.connectionString;
                this.createTime = model.createTime;
                this.elasticMinComputeResource = model.elasticMinComputeResource;
                this.engine = model.engine;
                this.engineParams = model.engineParams;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.groupUserList = model.groupUserList;
                this.groupUsers = model.groupUsers;
                this.maxClusterCount = model.maxClusterCount;
                this.maxComputeResource = model.maxComputeResource;
                this.minClusterCount = model.minClusterCount;
                this.minComputeResource = model.minComputeResource;
                this.nodeNum = model.nodeNum;
                this.port = model.port;
                this.runningClusterCount = model.runningClusterCount;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * ClusterMode.
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * ClusterSizeResource.
             */
            public Builder clusterSizeResource(String clusterSizeResource) {
                this.clusterSizeResource = clusterSizeResource;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

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
             * ElasticMinComputeResource.
             */
            public Builder elasticMinComputeResource(String elasticMinComputeResource) {
                this.elasticMinComputeResource = elasticMinComputeResource;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineParams.
             */
            public Builder engineParams(java.util.Map<String, ?> engineParams) {
                this.engineParams = engineParams;
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
            public Builder groupUserList(java.util.List<String> groupUserList) {
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
             * MaxClusterCount.
             */
            public Builder maxClusterCount(Integer maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * MaxComputeResource.
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * MinClusterCount.
             */
            public Builder minClusterCount(Integer minClusterCount) {
                this.minClusterCount = minClusterCount;
                return this;
            }

            /**
             * MinComputeResource.
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * RunningClusterCount.
             */
            public Builder runningClusterCount(Integer runningClusterCount) {
                this.runningClusterCount = runningClusterCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
