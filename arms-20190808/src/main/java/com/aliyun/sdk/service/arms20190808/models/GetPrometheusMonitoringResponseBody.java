// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusMonitoringResponseBody</p>
 */
public class GetPrometheusMonitoringResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetPrometheusMonitoringResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusMonitoringResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
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

        public GetPrometheusMonitoringResponseBody build() {
            return new GetPrometheusMonitoringResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ConfigYaml")
        private String configYaml;

        @NameInMap("MonitoringName")
        private String monitoringName;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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
             * Prometheus实例ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The monitoring configuration. The value is a YAML string.
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * The name of the monitoring configuration.
             */
            public Builder monitoringName(String monitoringName) {
                this.monitoringName = monitoringName;
                return this;
            }

            /**
             * The status of the monitoring configuration. Valid values: run and stop.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the monitoring configuration. Valid values: ServiceMonitor, PodMonitor, CustomJob, and Probe.
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
