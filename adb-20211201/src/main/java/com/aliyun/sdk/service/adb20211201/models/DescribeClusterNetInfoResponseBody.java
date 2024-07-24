// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNetInfoResponseBody</p>
 */
public class DescribeClusterNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterNetInfoResponseBody(Builder builder) {
        this.clusterNetworkType = builder.clusterNetworkType;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterNetworkType
     */
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterNetworkType; 
        private Items items; 
        private String requestId; 

        /**
         * The network type of the cluster. Only the Virtual Private Cloud (VPC) network type is supported. **VPC** is returned.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * The queried network information about the cluster.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterNetInfoResponseBody build() {
            return new DescribeClusterNetInfoResponseBody(this);
        } 

    } 

    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

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
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String port; 
            private String protocol; 

            /**
             * The port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **http**
             * *   **https**
             * *   **mysql**
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
    public static class AddressPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ports")
        private java.util.List < Ports> ports;

        private AddressPorts(Builder builder) {
            this.ports = builder.ports;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPorts create() {
            return builder().build();
        }

        /**
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        public static final class Builder {
            private java.util.List < Ports> ports; 

            /**
             * ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            public AddressPorts build() {
                return new AddressPorts(this);
            } 

        } 

    }
    public static class Address extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
        private String connectionStringPrefix;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private AddressPorts ports;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private Address(Builder builder) {
            this.connectionString = builder.connectionString;
            this.connectionStringPrefix = builder.connectionStringPrefix;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
            this.ports = builder.ports;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return connectionStringPrefix
         */
        public String getConnectionStringPrefix() {
            return this.connectionStringPrefix;
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
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return ports
         */
        public AddressPorts getPorts() {
            return this.ports;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String connectionString; 
            private String connectionStringPrefix; 
            private String IPAddress; 
            private String netType; 
            private String port; 
            private AddressPorts ports; 
            private String VPCId; 
            private String vSwitchId; 

            /**
             * The endpoint of the cluster.
             * <p>
             * 
             * *   If NetType is set to VPC, the VPC endpoint of the cluster is returned.
             * *   If NetType is set to Public, the public endpoint of the cluster is returned.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The prefix of the endpoint.
             * <p>
             * 
             * *   If NetType is set to VPC, the prefix of the VPC endpoint is returned.
             * *   If NetType is set to Public, the prefix of the public endpoint is returned.
             */
            public Builder connectionStringPrefix(String connectionStringPrefix) {
                this.connectionStringPrefix = connectionStringPrefix;
                return this;
            }

            /**
             * The IP address of the endpoint.
             * <p>
             * 
             * *   If NetType is set to VPC, the private IP address of the cluster is returned.
             * *   If NetType is set to Public, the public IP address of the cluster is returned.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The network type of the cluster. Valid values:
             * <p>
             * 
             * *   **Public**: Internet.
             * *   **VPC**: VPC.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The port number that is used to connect to the cluster. **3306** is returned.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The ports.
             */
            public Builder ports(AddressPorts ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The VPC ID.
             * <p>
             * 
             * >  If NetType is set to Public, an empty string is returned.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The vSwitch ID of the cluster.
             * <p>
             * 
             * >  If NetType is set to Public, an empty string is returned.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private java.util.List < Address> address;

        private Items(Builder builder) {
            this.address = builder.address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public java.util.List < Address> getAddress() {
            return this.address;
        }

        public static final class Builder {
            private java.util.List < Address> address; 

            /**
             * Address.
             */
            public Builder address(java.util.List < Address> address) {
                this.address = address;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
