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
 * {@link ListPrometheusIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusIntegrationResponseBody</p>
 */
public class ListPrometheusIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried exporters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1F1D8840-5330-5804-A8DB-C3C5C5CED6BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusIntegrationResponseBody build() {
            return new ListPrometheusIntegrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusIntegrationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusIntegrationResponseBody</p>
     */
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
             * <p>Indicates whether the exporter can be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>Indicates whether the exporter can be edited.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canEditor(Boolean canEditor) {
                this.canEditor = canEditor;
                return this;
            }

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>container-1</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The description of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{}&quot;</p>
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * <p>The type of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-exporter</p>
             */
            public Builder exporterType(String exporterType) {
                this.exporterType = exporterType;
                return this;
            }

            /**
             * <p>The ID of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>29374</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>inet</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The integration type. Valid values: kafka, mysql, redis, snmp, emr, nubela, and tidb.</p>
             * 
             * <strong>example:</strong>
             * <p>Kafka, mysql, redis, snmp, emr, nubela, and tidb</p>
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Indicates whether an upgrade is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needUpgrade(Boolean needUpgrade) {
                this.needUpgrade = needUpgrade;
                return this;
            }

            /**
             * <p>The configurations of the exporter. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;port&quot;: &quot;5554&quot;,
             *       &quot;name&quot;: &quot;kafka-test12&quot;,
             *       &quot;kafka_instance&quot;: &quot;kafka-test&quot;,
             *       &quot;__label_value&quot;: &quot;kafka-test&quot;,
             *       &quot;scrape_interval&quot;: 33,
             *       &quot;metrics_path&quot;: &quot;/metrics&quot;,
             *       &quot;__label_key&quot;: &quot;kafka-test&quot;
             * }</p>
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * <p>The pod name of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-exporter-1</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Indicates whether the description is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showDescribe(Boolean showDescribe) {
                this.showDescribe = showDescribe;
                return this;
            }

            /**
             * <p>Indicates whether the exporter logs are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showLog(Boolean showLog) {
                this.showLog = showLog;
                return this;
            }

            /**
             * <p>The status of the exporter.</p>
             * 
             * <strong>example:</strong>
             * <p>installed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The monitored IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>121.40.62.240:3342</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
