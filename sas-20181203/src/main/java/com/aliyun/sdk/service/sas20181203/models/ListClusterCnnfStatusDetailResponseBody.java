// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterCnnfStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterCnnfStatusDetailResponseBody</p>
 */
public class ListClusterCnnfStatusDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
         * The ID of the server.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the cluster.
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
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Installed")
        private Boolean installed;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("InvalidType")
        private String invalidType;

        @NameInMap("MachineName")
        private String machineName;

        @NameInMap("MachineType")
        private Integer machineType;

        @NameInMap("PluginName")
        private String pluginName;

        @NameInMap("PluginVersion")
        private String pluginVersion;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
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
             * Indicates whether the container firewall plug-in is installed.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The machine type of the instance. The value is fixed as **ecs**.
             */
            public Builder installed(Boolean installed) {
                this.installed = installed;
                return this;
            }

            /**
             * The online status of the plug-in. Valid values:
             * <p>
             * 
             * *   **false**: The plug-in is offline.
             * *   **true**: The plug-in is online.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * InvalidType.
             */
            public Builder invalidType(String invalidType) {
                this.invalidType = invalidType;
                return this;
            }

            /**
             * The public IP address of the associated instance.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(Integer machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * The private IP address of the associated instance.
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
             * The version of the plug-in.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the plug-in. The value is fixed as **alinet**.
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
