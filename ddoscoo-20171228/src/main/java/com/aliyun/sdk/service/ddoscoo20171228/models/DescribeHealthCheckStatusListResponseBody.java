// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeHealthCheckStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckStatusListResponseBody</p>
 */
public class DescribeHealthCheckStatusListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthCheckStatusList")
    private java.util.List<HealthCheckStatusList> healthCheckStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthCheckStatusList
     */
    public java.util.List<HealthCheckStatusList> getHealthCheckStatusList() {
        return this.healthCheckStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<HealthCheckStatusList> healthCheckStatusList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHealthCheckStatusListResponseBody model) {
            this.healthCheckStatusList = model.healthCheckStatusList;
            this.requestId = model.requestId;
        } 

        /**
         * HealthCheckStatusList.
         */
        public Builder healthCheckStatusList(java.util.List<HealthCheckStatusList> healthCheckStatusList) {
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

    /**
     * 
     * {@link DescribeHealthCheckStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckStatusListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(RealServerStatusList model) {
                this.address = model.address;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link DescribeHealthCheckStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthCheckStatusListResponseBody</p>
     */
    public static class HealthCheckStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrontendPort")
        private Integer frontendPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RealServerStatusList")
        private java.util.List<RealServerStatusList> realServerStatusList;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<RealServerStatusList> getRealServerStatusList() {
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
            private java.util.List<RealServerStatusList> realServerStatusList; 
            private String status; 

            private Builder() {
            } 

            private Builder(HealthCheckStatusList model) {
                this.frontendPort = model.frontendPort;
                this.instanceId = model.instanceId;
                this.protocol = model.protocol;
                this.realServerStatusList = model.realServerStatusList;
                this.status = model.status;
            } 

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
            public Builder realServerStatusList(java.util.List<RealServerStatusList> realServerStatusList) {
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
