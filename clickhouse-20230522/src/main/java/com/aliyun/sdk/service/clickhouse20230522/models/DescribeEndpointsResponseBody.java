// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndpointsResponseBody</p>
 */
public class DescribeEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEndpointsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEndpointsResponseBody build() {
            return new DescribeEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointsResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < Ports> ports;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private Endpoints(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.ports = builder.ports;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectionString; 
            private String IPAddress; 
            private String netType; 
            private java.util.List < Ports> ports; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcInstanceId; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * IPAddress.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf61z****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        private Data(Builder builder) {
            this.endpoints = builder.endpoints;
            this.instanceNetworkType = builder.instanceNetworkType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public static final class Builder {
            private java.util.List < Endpoints> endpoints; 
            private String instanceNetworkType; 

            /**
             * Endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
