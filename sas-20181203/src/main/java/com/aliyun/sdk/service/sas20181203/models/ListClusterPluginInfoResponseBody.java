// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterPluginInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterPluginInfoResponseBody</p>
 */
public class ListClusterPluginInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterPluginInfoResponseBody build() {
            return new ListClusterPluginInfoResponseBody(this);
        } 

    } 

    public static class NodePluginInfoList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("Installed")
        private Boolean installed;

        @NameInMap("MachineInternetIp")
        private String machineInternetIp;

        @NameInMap("MachineIntranetIp")
        private String machineIntranetIp;

        @NameInMap("MachineName")
        private String machineName;

        @NameInMap("MachineType")
        private Long machineType;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("PluginName")
        private String pluginName;

        @NameInMap("PluginVersion")
        private String pluginVersion;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("instanceId")
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

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Installed.
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * MachineInternetIp.
             */
            public Builder machineInternetIp(String machineInternetIp) {
                this.machineInternetIp = machineInternetIp;
                return this;
            }

            /**
             * MachineIntranetIp.
             */
            public Builder machineIntranetIp(String machineIntranetIp) {
                this.machineIntranetIp = machineIntranetIp;
                return this;
            }

            /**
             * MachineName.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(Long machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * PluginVersion.
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * instanceId.
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
    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterStatus")
        private String clusterStatus;

        @NameInMap("NodePluginInfoList")
        private java.util.List < NodePluginInfoList> nodePluginInfoList;

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
        public java.util.List < NodePluginInfoList> getNodePluginInfoList() {
            return this.nodePluginInfoList;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterStatus; 
            private java.util.List < NodePluginInfoList> nodePluginInfoList; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * NodePluginInfoList.
             */
            public Builder nodePluginInfoList(java.util.List < NodePluginInfoList> nodePluginInfoList) {
                this.nodePluginInfoList = nodePluginInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}