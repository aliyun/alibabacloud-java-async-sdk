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
 * {@link DescribeEnvServiceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvServiceMonitorResponseBody</p>
 */
public class DescribeEnvServiceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnvServiceMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvServiceMonitorResponseBody create() {
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
         * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
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
        public Builder data(Data data) {
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
         * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvServiceMonitorResponseBody build() {
            return new DescribeEnvServiceMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnvServiceMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvServiceMonitorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigYaml")
        private String configYaml;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceMonitorName")
        private String serviceMonitorName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.configYaml = builder.configYaml;
            this.environmentId = builder.environmentId;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.serviceMonitorName = builder.serviceMonitorName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configYaml
         */
        public String getConfigYaml() {
            return this.configYaml;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceMonitorName
         */
        public String getServiceMonitorName() {
            return this.serviceMonitorName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String configYaml; 
            private String environmentId; 
            private String namespace; 
            private String regionId; 
            private String serviceMonitorName; 
            private String status; 

            /**
             * <p>The YAML configuration file of the ServiceMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>Refer to supplementary instructions.</p>
             */
            public Builder configYaml(String configYaml) {
                this.configYaml = configYaml;
                return this;
            }

            /**
             * <p>The ID of the environment instance.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the ServiceMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceMonitor1</p>
             */
            public Builder serviceMonitorName(String serviceMonitorName) {
                this.serviceMonitorName = serviceMonitorName;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>run</li>
             * <li>stop</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>run</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
