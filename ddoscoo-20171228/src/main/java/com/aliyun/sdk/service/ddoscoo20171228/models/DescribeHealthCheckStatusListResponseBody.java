// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckStatusListResponseBody</p>
 */
public class DescribeHealthCheckStatusListResponseBody extends TeaModel {
    @NameInMap("HealthCheckStatusList")
    private java.util.List < HealthCheckStatusList> healthCheckStatusList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHealthCheckStatusListResponseBody(Builder builder) {
        this.healthCheckStatusList = builder.healthCheckStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckStatusListResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckStatusList
     */
    public java.util.List < HealthCheckStatusList> getHealthCheckStatusList() {
        return this.healthCheckStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HealthCheckStatusList> healthCheckStatusList; 
        private String requestId; 

        /**
         * HealthCheckStatusList.
         */
        public Builder healthCheckStatusList(java.util.List < HealthCheckStatusList> healthCheckStatusList) {
            this.healthCheckStatusList = healthCheckStatusList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHealthCheckStatusListResponseBody build() {
            return new DescribeHealthCheckStatusListResponseBody(this);
        } 

    } 

    public static class RealServerStatusList extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Status")
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Status.
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
    public static class HealthCheckStatusList extends TeaModel {
        @NameInMap("FrontendPort")
        private Integer frontendPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RealServerStatusList")
        private java.util.List < RealServerStatusList> realServerStatusList;

        @NameInMap("Status")
        private String status;

        private HealthCheckStatusList(Builder builder) {
            this.frontendPort = builder.frontendPort;
            this.instanceId = builder.instanceId;
            this.protocol = builder.protocol;
            this.realServerStatusList = builder.realServerStatusList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckStatusList create() {
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
             * FrontendPort.
             */
            public Builder frontendPort(Integer frontendPort) {
                this.frontendPort = frontendPort;
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

            /**
             * RealServerStatusList.
             */
            public Builder realServerStatusList(java.util.List < RealServerStatusList> realServerStatusList) {
                this.realServerStatusList = realServerStatusList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public HealthCheckStatusList build() {
                return new HealthCheckStatusList(this);
            } 

        } 

    }
}
