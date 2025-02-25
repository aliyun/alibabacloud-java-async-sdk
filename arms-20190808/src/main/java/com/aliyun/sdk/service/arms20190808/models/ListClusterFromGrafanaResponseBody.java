// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListClusterFromGrafanaResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterFromGrafanaResponseBody</p>
 */
public class ListClusterFromGrafanaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromClusterList")
    private java.util.List<PromClusterList> promClusterList;

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
    public java.util.List<PromClusterList> getPromClusterList() {
        return this.promClusterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PromClusterList> promClusterList; 
        private String requestId; 

        /**
         * <p>The cluster information.</p>
         */
        public Builder promClusterList(java.util.List<PromClusterList> promClusterList) {
            this.promClusterList = promClusterList;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6849D41E-EED4-5C00-89F9-6047BBD9DCB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterFromGrafanaResponseBody build() {
            return new ListClusterFromGrafanaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterFromGrafanaResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterFromGrafanaResponseBody</p>
     */
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
             * <p>The status of the Prometheus agent on the cluster. Valid values:</p>
             * <ul>
             * <li>INSTALL_FAILED: The Prometheus agent failed to be installed.</li>
             * <li>INSTALL_SUCCEED: The Prometheus agent was installed.</li>
             * <li>NOT_REGISTER: You have not registered an Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTALL_FAILED</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c0df7ad9db0ed43128925ca04774c469e</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ay-ads-hangzhou</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud-product-prometheus</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The controller ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1092</p>
             */
            public Builder controllerId(String controllerId) {
                this.controllerId = controllerId;
                return this;
            }

            /**
             * <p>The time when the dashboard was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-09T02:05:04Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The extended fields. This parameter is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;app_id&quot;:&quot;bbd&quot;,&quot;task_id&quot;:&quot;4305ba5bf14942daa6e553ed91f46988&quot;}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The ID of a database in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>16136</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The timestamp when the Prometheus agent was installed.</p>
             * 
             * <strong>example:</strong>
             * <p>1653532518000</p>
             */
            public Builder installTime(Long installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * <p>Indicates whether the Prometheus agent was installed. Valid values:</p>
             * <ul>
             * <li>true: The Prometheus agent was installed.</li>
             * <li>false: The Prometheus agent was not installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isControllerInstalled(Boolean isControllerInstalled) {
                this.isControllerInstalled = isControllerInstalled;
                return this;
            }

            /**
             * <p>The time when the last heartbeat was reported.</p>
             * 
             * <strong>example:</strong>
             * <p>1653532518000</p>
             */
            public Builder lastHeartBeatTime(Long lastHeartBeatTime) {
                this.lastHeartBeatTime = lastHeartBeatTime;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Option&quot;: [&quot;betaTestApproved&quot;]}</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The list of nodejsonar logs.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder pluginsJsonArray(String pluginsJsonArray) {
                this.pluginsJsonArray = pluginsJsonArray;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The information about applications deployed in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder stateJson(String stateJson) {
                this.stateJson = stateJson;
                return this;
            }

            /**
             * <p>The time when the dashboard was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-16T08:49:34Z</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1247285**</p>
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
