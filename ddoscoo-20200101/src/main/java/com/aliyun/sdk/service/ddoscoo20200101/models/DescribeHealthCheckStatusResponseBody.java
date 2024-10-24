// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHealthCheckStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckStatusResponseBody</p>
 */
public class DescribeHealthCheckStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckStatus")
    private java.util.List < HealthCheckStatus> healthCheckStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHealthCheckStatusResponseBody(Builder builder) {
        this.healthCheckStatus = builder.healthCheckStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckStatus
     */
    public java.util.List < HealthCheckStatus> getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HealthCheckStatus> healthCheckStatus; 
        private String requestId; 

        /**
         * <p>An array that consists of the details of the health status of the origin server.</p>
         */
        public Builder healthCheckStatus(java.util.List < HealthCheckStatus> healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>DE9FF9E1-569C-4B6C-AB6A-0F6D927BB27C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHealthCheckStatusResponseBody build() {
            return new DescribeHealthCheckStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHealthCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckStatusResponseBody</p>
     */
    public static class RealServerStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RealServerStatusList(Builder builder) {
            this.address = builder.address;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealServerStatusList create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String address; 
            private String status; 

            /**
             * <p>The IP address of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The health state of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: healthy</li>
             * <li><strong>abnormal</strong>: unhealthy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abnormal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RealServerStatusList build() {
                return new RealServerStatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHealthCheckStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckStatusResponseBody</p>
     */
    public static class HealthCheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RealServerStatusList")
        private java.util.List < RealServerStatusList> realServerStatusList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private HealthCheckStatus(Builder builder) {
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.realServerStatusList = builder.realServerStatusList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckStatus create() {
            return builder().build();
        }

        /**
         * @return frontendPort
         */
        public Integer getFrontendPort() {
            return this.frontendPort;
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

        /**
         * @return realServerStatusList
         */
        public java.util.List < RealServerStatusList> getRealServerStatusList() {
            return this.realServerStatusList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer frontendPort; 
            private String instanceId; 
            private String protocol; 
            private java.util.List < RealServerStatusList> realServerStatusList; 
            private String status; 

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

            /**
             * <p>An array that consists of the health states of the IP addresses of the origin server.</p>
             */
            public Builder realServerStatusList(java.util.List < RealServerStatusList> realServerStatusList) {
                this.realServerStatusList = realServerStatusList;
                return this;
            }

            /**
             * <p>The health status of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: healthy</li>
             * <li><strong>abnormal</strong>: unhealthy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public HealthCheckStatus build() {
                return new HealthCheckStatus(this);
            } 

        } 

    }
}
