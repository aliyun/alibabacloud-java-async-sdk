// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusIntegrationResponseBody</p>
 */
public class ListPrometheusIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrometheusIntegrationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusIntegrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The queried exporters.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusIntegrationResponseBody build() {
            return new ListPrometheusIntegrationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("CanEditor")
        private Boolean canEditor;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("ExporterType")
        private String exporterType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IntegrationType")
        private String integrationType;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
        private Boolean needUpgrade;

        @com.aliyun.core.annotation.NameInMap("Param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("ShowDescribe")
        private Boolean showDescribe;

        @com.aliyun.core.annotation.NameInMap("ShowLog")
        private Boolean showLog;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.canDelete = builder.canDelete;
            this.canEditor = builder.canEditor;
            this.clusterId = builder.clusterId;
            this.containerName = builder.containerName;
            this.describe = builder.describe;
            this.exporterType = builder.exporterType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.integrationType = builder.integrationType;
            this.namespace = builder.namespace;
            this.needUpgrade = builder.needUpgrade;
            this.param = builder.param;
            this.podName = builder.podName;
            this.showDescribe = builder.showDescribe;
            this.showLog = builder.showLog;
            this.status = builder.status;
            this.target = builder.target;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return canEditor
         */
        public Boolean getCanEditor() {
            return this.canEditor;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return exporterType
         */
        public String getExporterType() {
            return this.exporterType;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return integrationType
         */
        public String getIntegrationType() {
            return this.integrationType;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return needUpgrade
         */
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return showDescribe
         */
        public Boolean getShowDescribe() {
            return this.showDescribe;
        }

        /**
         * @return showLog
         */
        public Boolean getShowLog() {
            return this.showLog;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean canDelete; 
            private Boolean canEditor; 
            private String clusterId; 
            private String containerName; 
            private String describe; 
            private String exporterType; 
            private Long instanceId; 
            private String instanceName; 
            private String integrationType; 
            private String namespace; 
            private Boolean needUpgrade; 
            private String param; 
            private String podName; 
            private Boolean showDescribe; 
            private Boolean showLog; 
            private String status; 
            private String target; 
            private String version; 

            /**
             * Indicates whether the exporter can be deleted.
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * Indicates whether the exporter can be edited.
             */
            public Builder canEditor(Boolean canEditor) {
                this.canEditor = canEditor;
                return this;
            }

            /**
             * The ID of the Prometheus instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The description of the exporter.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * The type of the exporter.
             */
            public Builder exporterType(String exporterType) {
                this.exporterType = exporterType;
                return this;
            }

            /**
             * The ID of the exporter.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the exporter.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The integration type. Valid values: kafka, mysql, redis, snmp, emr, nubela, and tidb.
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Indicates whether an upgrade is required.
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * The configurations of the exporter. The value is a JSON string.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * The pod name of the exporter.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * Indicates whether the description is displayed.
             */
            public Builder showDescribe(Boolean showDescribe) {
                this.showDescribe = showDescribe;
                return this;
            }

            /**
             * Indicates whether the exporter logs are displayed.
             */
            public Builder showLog(Boolean showLog) {
                this.showLog = showLog;
                return this;
            }

            /**
             * The status of the exporter.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The monitored IP address.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
