// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterCnnfStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterCnnfStatusDetailResponseBody</p>
 */
public class ListClusterCnnfStatusDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterCnnfStatusDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterCnnfStatusDetailResponseBody create() {
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
         * An array that consists of the protection status of the container firewall.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterCnnfStatusDetailResponseBody build() {
            return new ListClusterCnnfStatusDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Installed")
        private Boolean installed;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("InvalidType")
        private String invalidType;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private Integer machineType;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginVersion")
        private String pluginVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.installed = builder.installed;
            this.instanceId = builder.instanceId;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.invalidType = builder.invalidType;
            this.machineName = builder.machineName;
            this.machineType = builder.machineType;
            this.pluginName = builder.pluginName;
            this.pluginVersion = builder.pluginVersion;
            this.status = builder.status;
            this.uuid = builder.uuid;
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
         * @return installed
         */
        public Boolean getInstalled() {
            return this.installed;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return invalidType
         */
        public String getInvalidType() {
            return this.invalidType;
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
        public Integer getMachineType() {
            return this.machineType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String clusterId; 
            private Boolean installed; 
            private String instanceId; 
            private String internetIp; 
            private String intranetIp; 
            private String invalidType; 
            private String machineName; 
            private Integer machineType; 
            private String pluginName; 
            private String pluginVersion; 
            private String status; 
            private String uuid; 

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Indicates whether the container firewall plug-in is installed.
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The public IP address of the associated instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the associated instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The cause why the plug-in is invalid. Valid values:
             * <p>
             * 
             * *   **PLUGIN_OFFLINE**: The plug-in is offline.
             * *   **PLUGIN\_NOT_INSTALLED**: The plug-in is not installed.
             * *   **PLUGIN\_INVALID_VERSION**: The version of the plug-in is invalid.
             */
            public Builder invalidType(String invalidType) {
                this.invalidType = invalidType;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * The machine type of the instance. The value is fixed as **ecs**.
             */
            public Builder machineType(Integer machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * The name of the plug-in. The value is fixed as **alinet**.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * The version of the plug-in.
             */
            public Builder pluginVersion(String pluginVersion) {
                this.pluginVersion = pluginVersion;
                return this;
            }

            /**
             * The online status of the plug-in. Valid values:
             * <p>
             * 
             * *   **false**: The plug-in is offline.
             * *   **true**: The plug-in is online.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
