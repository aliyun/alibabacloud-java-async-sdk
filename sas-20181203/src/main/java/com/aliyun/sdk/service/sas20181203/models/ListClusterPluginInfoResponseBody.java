// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListClusterPluginInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterPluginInfoResponseBody</p>
 */
public class ListClusterPluginInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterPluginInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterPluginInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClusterPluginInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the plug-in.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterPluginInfoResponseBody build() {
            return new ListClusterPluginInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterPluginInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterPluginInfoResponseBody</p>
     */
    public static class NodePluginInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Installed")
        private Boolean installed;

        @com.aliyun.core.annotation.NameInMap("MachineInternetIp")
        private String machineInternetIp;

        @com.aliyun.core.annotation.NameInMap("MachineIntranetIp")
        private String machineIntranetIp;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private Long machineType;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginVersion")
        private String pluginVersion;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NodePluginInfoList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.installed = builder.installed;
            this.machineInternetIp = builder.machineInternetIp;
            this.machineIntranetIp = builder.machineIntranetIp;
            this.machineName = builder.machineName;
            this.machineType = builder.machineType;
            this.online = builder.online;
            this.pluginName = builder.pluginName;
            this.pluginVersion = builder.pluginVersion;
            this.uuid = builder.uuid;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePluginInfoList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return installed
         */
        public Boolean getInstalled() {
            return this.installed;
        }

        /**
         * @return machineInternetIp
         */
        public String getMachineInternetIp() {
            return this.machineInternetIp;
        }

        /**
         * @return machineIntranetIp
         */
        public String getMachineIntranetIp() {
            return this.machineIntranetIp;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return machineType
         */
        public Long getMachineType() {
            return this.machineType;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return pluginVersion
         */
        public String getPluginVersion() {
            return this.pluginVersion;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private Boolean installed; 
            private String machineInternetIp; 
            private String machineIntranetIp; 
            private String machineName; 
            private Long machineType; 
            private Boolean online; 
            private String pluginName; 
            private String pluginVersion; 
            private String uuid; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(NodePluginInfoList model) {
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.installed = model.installed;
                this.machineInternetIp = model.machineInternetIp;
                this.machineIntranetIp = model.machineIntranetIp;
                this.machineName = model.machineName;
                this.machineType = model.machineType;
                this.online = model.online;
                this.pluginName = model.pluginName;
                this.pluginVersion = model.pluginVersion;
                this.uuid = model.uuid;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>kenerl not support</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>kenerl not support</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is installed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>100.100.XXX.XX</p>
             */
            public Builder machineInternetIp(String machineInternetIp) {
                this.machineInternetIp = machineInternetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>10.XXX.XXX.XX</p>
             */
            public Builder machineIntranetIp(String machineIntranetIp) {
                this.machineIntranetIp = machineIntranetIp;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>npznas05</p>
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values include:</p>
             * <ul>
             * <li><strong>ecs</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>slb</strong>: Server Load Balancer (SLB) instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder machineType(Long machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> If the Security Center agent of the server is offline, Security Center does not protect the server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The name of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>alihips</p>
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * <p>The version of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.1</p>
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>bc563d2b-2a3d-411b-8bbe-d75b8d3c****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>tpp-cn-2r42njq4y001</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NodePluginInfoList build() {
                return new NodePluginInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterPluginInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterPluginInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterStatus")
        private String clusterStatus;

        @com.aliyun.core.annotation.NameInMap("NodePluginInfoList")
        private java.util.List<NodePluginInfoList> nodePluginInfoList;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterStatus = builder.clusterStatus;
            this.nodePluginInfoList = builder.nodePluginInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return nodePluginInfoList
         */
        public java.util.List<NodePluginInfoList> getNodePluginInfoList() {
            return this.nodePluginInfoList;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterStatus; 
            private java.util.List<NodePluginInfoList> nodePluginInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterStatus = model.clusterStatus;
                this.nodePluginInfoList = model.nodePluginInfoList;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>lmftest</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>1: normal</li>
             * <li>2: abnormal</li>
             * <li>3: offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ABNORMAL</p>
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * <p>The plug-ins.</p>
             */
            public Builder nodePluginInfoList(java.util.List<NodePluginInfoList> nodePluginInfoList) {
                this.nodePluginInfoList = nodePluginInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
