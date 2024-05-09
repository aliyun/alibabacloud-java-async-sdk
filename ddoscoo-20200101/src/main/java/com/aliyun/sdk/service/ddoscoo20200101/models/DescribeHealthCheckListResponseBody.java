// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckListResponseBody</p>
 */
public class DescribeHealthCheckListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckList")
    private java.util.List < HealthCheckList> healthCheckList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHealthCheckListResponseBody(Builder builder) {
        this.healthCheckList = builder.healthCheckList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckListResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckList
     */
    public java.util.List < HealthCheckList> getHealthCheckList() {
        return this.healthCheckList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HealthCheckList> healthCheckList; 
        private String requestId; 

        /**
         * An array that consists of information about the health check configuration.
         */
        public Builder healthCheckList(java.util.List < HealthCheckList> healthCheckList) {
            this.healthCheckList = healthCheckList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHealthCheckListResponseBody build() {
            return new DescribeHealthCheckListResponseBody(this);
        } 

    } 

    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Down")
        private Integer down;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Up")
        private Integer up;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private HealthCheck(Builder builder) {
            this.domain = builder.domain;
            this.down = builder.down;
            this.interval = builder.interval;
            this.port = builder.port;
            this.timeout = builder.timeout;
            this.type = builder.type;
            this.up = builder.up;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return down
         */
        public Integer getDown() {
            return this.down;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return up
         */
        public Integer getUp() {
            return this.up;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String domain; 
            private Integer down; 
            private Integer interval; 
            private Integer port; 
            private Integer timeout; 
            private String type; 
            private Integer up; 
            private String uri; 

            /**
             * The domain name.
             * <p>
             * 
             * > This parameter is returned only when the Layer 7 health check configuration is queried.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The number of consecutive failed health checks that must occur before a port is declared unhealthy. Valid values: **1** to **10**.
             */
            public Builder down(Integer down) {
                this.down = down;
                return this;
            }

            /**
             * The interval at which checks are performed. Valid values: **1** to **30**. Unit: seconds.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The port that was checked.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The response timeout period. Valid values: **1** to **30**. Unit: seconds.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **tcp**: The Layer 4 health check configuration was queried.
             * *   **http**: The Layer 7 health check configuration was queried.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The number of consecutive successful health checks that must occur before a port is declared healthy. Valid values: **1** to **10**.
             */
            public Builder up(Integer up) {
                this.up = up;
                return this;
            }

            /**
             * The check path.
             * <p>
             * 
             * > This parameter is returned only when the Layer 7 health check configuration is queried.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    public static class HealthCheckList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private HealthCheckList(Builder builder) {
            this.frontendPort = builder.frontendPort;
            this.healthCheck = builder.healthCheck;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckList create() {
            return builder().build();
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer frontendPort; 
            private HealthCheck healthCheck; 
            private String instanceId; 
            private String protocol; 

            /**
             * The forwarding port.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * The health check configuration.
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The forwarding protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **udp**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public HealthCheckList build() {
                return new HealthCheckList(this);
            } 

        } 

    }
}
