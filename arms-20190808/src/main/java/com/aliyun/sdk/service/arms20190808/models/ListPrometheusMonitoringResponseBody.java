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
 * {@link ListPrometheusMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusMonitoringResponseBody</p>
 */
public class ListPrometheusMonitoringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrometheusMonitoringResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusMonitoringResponseBody create() {
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
         * <p>The status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D80ADAAC-8C32-5479-BD14-C28CF832****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusMonitoringResponseBody build() {
            return new ListPrometheusMonitoringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusMonitoringResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusMonitoringResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ConfigYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("MonitoringName")
        private String monitoringName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.configYaml = builder.configYaml;
            this.monitoringName = builder.monitoringName;
            this.status = builder.status;
            this.type = builder.type;
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
         * @return configYaml
         */
        public String getConfigYaml() {
            return this.configYaml;
        }

        /**
         * @return monitoringName
         */
        public String getMonitoringName() {
            return this.monitoringName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterId; 
            private String configYaml; 
            private String monitoringName; 
            private String status; 
            private String type; 

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
             * <p>The monitoring configuration. The value is a YAML string.</p>
             * 
             * <strong>example:</strong>
             * <p>apiVersion: monitoring.coreos.com/v1
             * kind: ServiceMonitor
             * metadata:
             *   name: tomcat-demo
             *   namespace: default
             * spec:
             *   endpoints:
             *     - interval: 30s
             *       path: /metrics
             *       port: tomcat-monitor
             *   namespaceSelector:
             *     any: true
             *   selector:
             *     matchLabels:
             *       app: tomcat</p>
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * <p>The name of the monitoring configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>podMonitor1</p>
             */
            public Builder monitoringName(String monitoringName) {
                this.monitoringName = monitoringName;
                return this;
            }

            /**
             * <p>The status of the monitoring configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>run</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the monitoring configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>podMonitor</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
