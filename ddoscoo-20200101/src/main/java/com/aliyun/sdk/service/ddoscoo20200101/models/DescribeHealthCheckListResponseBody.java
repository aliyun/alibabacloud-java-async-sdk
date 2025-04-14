// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeHealthCheckListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckListResponseBody</p>
 */
public class DescribeHealthCheckListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckList")
    private java.util.List<HealthCheckList> healthCheckList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckList
     */
    public java.util.List<HealthCheckList> getHealthCheckList() {
        return this.healthCheckList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<HealthCheckList> healthCheckList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHealthCheckListResponseBody model) {
            this.healthCheckList = model.healthCheckList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of information about the health check configuration.</p>
         */
        public Builder healthCheckList(java.util.List<HealthCheckList> healthCheckList) {
            this.healthCheckList = healthCheckList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83B4AF42-E8EE-4DC9-BD73-87B7733A36F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHealthCheckListResponseBody build() {
            return new DescribeHealthCheckListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHealthCheckListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.domain = model.domain;
                this.down = model.down;
                this.interval = model.interval;
                this.port = model.port;
                this.timeout = model.timeout;
                this.type = model.type;
                this.up = model.up;
                this.uri = model.uri;
            } 

            /**
             * <p>The domain name.</p>
             * <blockquote>
             * <p> This parameter is returned only when the Layer 7 health check configuration is queried.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of consecutive failed health checks that must occur before a port is declared unhealthy. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder down(Integer down) {
                this.down = down;
                return this;
            }

            /**
             * <p>The interval at which checks are performed. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The port that was checked.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The response timeout period. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong>: The Layer 4 health check configuration was queried.</li>
             * <li><strong>http</strong>: The Layer 7 health check configuration was queried.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The number of consecutive successful health checks that must occur before a port is declared healthy. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder up(Integer up) {
                this.up = up;
                return this;
            }

            /**
             * <p>The check path.</p>
             * <blockquote>
             * <p> This parameter is returned only when the Layer 7 health check configuration is queried.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/abc</p>
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
    /**
     * 
     * {@link DescribeHealthCheckListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HealthCheckList model) {
                this.frontendPort = model.frontendPort;
                this.healthCheck = model.healthCheck;
                this.instanceId = model.instanceId;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The forwarding port.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
                return this;
            }

            /**
             * <p>The health check configuration.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-mp91j1ao****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The forwarding protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
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
