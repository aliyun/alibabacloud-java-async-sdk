// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterFromGrafanaResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterFromGrafanaResponseBody</p>
 */
public class ListClusterFromGrafanaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromClusterList")
    private java.util.List < PromClusterList> promClusterList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterFromGrafanaResponseBody(Builder builder) {
        this.promClusterList = builder.promClusterList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterFromGrafanaResponseBody create() {
        return builder().build();
    }

    /**
     * @return promClusterList
     */
    public java.util.List < PromClusterList> getPromClusterList() {
        return this.promClusterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PromClusterList> promClusterList; 
        private String requestId; 

        /**
         * The cluster information.
         */
        public Builder promClusterList(java.util.List < PromClusterList> promClusterList) {
            this.promClusterList = promClusterList;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterFromGrafanaResponseBody build() {
            return new ListClusterFromGrafanaResponseBody(this);
        } 

    } 

    public static class PromClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("ControllerId")
        private String controllerId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private Long installTime;

        @com.aliyun.core.annotation.NameInMap("IsControllerInstalled")
        private Boolean isControllerInstalled;

        @com.aliyun.core.annotation.NameInMap("LastHeartBeatTime")
        private Long lastHeartBeatTime;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("PluginsJsonArray")
        private String pluginsJsonArray;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StateJson")
        private String stateJson;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private PromClusterList(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.controllerId = builder.controllerId;
            this.createTime = builder.createTime;
            this.extra = builder.extra;
            this.id = builder.id;
            this.installTime = builder.installTime;
            this.isControllerInstalled = builder.isControllerInstalled;
            this.lastHeartBeatTime = builder.lastHeartBeatTime;
            this.nodeNum = builder.nodeNum;
            this.options = builder.options;
            this.pluginsJsonArray = builder.pluginsJsonArray;
            this.regionId = builder.regionId;
            this.stateJson = builder.stateJson;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromClusterList create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return controllerId
         */
        public String getControllerId() {
            return this.controllerId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installTime
         */
        public Long getInstallTime() {
            return this.installTime;
        }

        /**
         * @return isControllerInstalled
         */
        public Boolean getIsControllerInstalled() {
            return this.isControllerInstalled;
        }

        /**
         * @return lastHeartBeatTime
         */
        public Long getLastHeartBeatTime() {
            return this.lastHeartBeatTime;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return pluginsJsonArray
         */
        public String getPluginsJsonArray() {
            return this.pluginsJsonArray;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stateJson
         */
        public String getStateJson() {
            return this.stateJson;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentStatus; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String controllerId; 
            private Long createTime; 
            private String extra; 
            private Long id; 
            private Long installTime; 
            private Boolean isControllerInstalled; 
            private Long lastHeartBeatTime; 
            private Integer nodeNum; 
            private String options; 
            private String pluginsJsonArray; 
            private String regionId; 
            private String stateJson; 
            private Long updateTime; 
            private String userId; 

            /**
             * The status of the Prometheus agent on the cluster. Valid values:
             * <p>
             * 
             * *   INSTALL_FAILED: The Prometheus agent failed to be installed.
             * *   INSTALL_SUCCEED: The Prometheus agent was installed.
             * *   NOT_REGISTER: You have not registered an Alibaba Cloud account.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The type of the cluster.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The controller ID.
             */
            public Builder controllerId(String controllerId) {
                this.controllerId = controllerId;
                return this;
            }

            /**
             * The time when the dashboard was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The extended fields. This parameter is a JSON string.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The ID of a database in the cluster.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The timestamp when the Prometheus agent was installed.
             */
            public Builder installTime(Long installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * Indicates whether the Prometheus agent was installed. Valid values:
             * <p>
             * 
             * *   true: The Prometheus agent was installed.
             * *   false: The Prometheus agent was not installed.
             */
            public Builder isControllerInstalled(Boolean isControllerInstalled) {
                this.isControllerInstalled = isControllerInstalled;
                return this;
            }

            /**
             * The time when the last heartbeat was reported.
             */
            public Builder lastHeartBeatTime(Long lastHeartBeatTime) {
                this.lastHeartBeatTime = lastHeartBeatTime;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The custom parameter.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * The list of nodejsonar logs.
             */
            public Builder pluginsJsonArray(String pluginsJsonArray) {
                this.pluginsJsonArray = pluginsJsonArray;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The information about applications deployed in the cluster.
             */
            public Builder stateJson(String stateJson) {
                this.stateJson = stateJson;
                return this;
            }

            /**
             * The time when the dashboard was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the cluster belongs.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public PromClusterList build() {
                return new PromClusterList(this);
            } 

        } 

    }
}
