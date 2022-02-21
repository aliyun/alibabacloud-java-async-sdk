// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckListResponseBody</p>
 */
public class DescribeHealthCheckListResponseBody extends TeaModel {
    @NameInMap("HealthCheckList")
    private java.util.List < HealthCheckList> healthCheckList;

    @NameInMap("RequestId")
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
         * HealthCheckList.
         */
        public Builder healthCheckList(java.util.List < HealthCheckList> healthCheckList) {
            this.healthCheckList = healthCheckList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Down")
        private Integer down;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Timeout")
        private Integer timeout;

        @NameInMap("Type")
        private String type;

        @NameInMap("Up")
        private Integer up;

        @NameInMap("Uri")
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Down.
             */
            public Builder down(Integer down) {
                this.down = down;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Up.
             */
            public Builder up(Integer up) {
                this.up = up;
                return this;
            }

            /**
             * Uri.
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
        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
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
             * FrontendPort.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * HealthCheck.
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Protocol.
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
