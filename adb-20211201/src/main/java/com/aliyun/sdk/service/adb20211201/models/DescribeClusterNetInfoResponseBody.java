// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClusterNetInfoResponseBody model) {
            this.clusterNetworkType = model.clusterNetworkType;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network type of the cluster. Only the Virtual Private Cloud (VPC) network type is supported. <strong>VPC</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * <p>The queried network information about the cluster.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69A29B65-CD0C-52B1-BE42-8B454569747F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterNetInfoResponseBody build() {
            return new DescribeClusterNetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Ports model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>http</strong></li>
             * <li><strong>https</strong></li>
             * <li><strong>mysql</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
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
     * {@link DescribeClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetInfoResponseBody</p>
     */
    public static class AddressPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ports")
        private java.util.List<Ports> ports;

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
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        public static final class Builder {
            private java.util.List<Ports> ports; 

            private Builder() {
            } 

            private Builder(AddressPorts model) {
                this.ports = model.ports;
            } 

            /**
             * ports.
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            public AddressPorts build() {
                return new AddressPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Address model) {
                this.connectionString = model.connectionString;
                this.connectionStringPrefix = model.connectionStringPrefix;
                this.IPAddress = model.IPAddress;
                this.netType = model.netType;
                this.port = model.port;
                this.ports = model.ports;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The endpoint of the cluster.</p>
             * <ul>
             * <li>If NetType is set to VPC, the VPC endpoint of the cluster is returned.</li>
             * <li>If NetType is set to Public, the public endpoint of the cluster is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>amv-wz9dqvn0o7****.ads.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The prefix of the endpoint.</p>
             * <ul>
             * <li>If NetType is set to VPC, the prefix of the VPC endpoint is returned.</li>
             * <li>If NetType is set to Public, the prefix of the public endpoint is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>amv-wz9dqvn0o7****</p>
             */
            public Builder connectionStringPrefix(String connectionStringPrefix) {
                this.connectionStringPrefix = connectionStringPrefix;
                return this;
            }

            /**
             * <p>The IP address of the endpoint.</p>
             * <ul>
             * <li>If NetType is set to VPC, the private IP address of the cluster is returned.</li>
             * <li>If NetType is set to Public, the public IP address of the cluster is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The network type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: Internet.</li>
             * <li><strong>VPC</strong>: VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the cluster. <strong>3306</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ports.</p>
             */
            public Builder ports(AddressPorts ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * <blockquote>
             * <p> If NetType is set to Public, an empty string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbhucmd5b****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the cluster.</p>
             * <blockquote>
             * <p> If NetType is set to Public, an empty string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1syh8vvw8yec****</p>
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
    /**
     * 
     * {@link DescribeClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNetInfoResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private java.util.List<Address> address;

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
        public java.util.List<Address> getAddress() {
            return this.address;
        }

        public static final class Builder {
            private java.util.List<Address> address; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.address = model.address;
            } 

            /**
             * Address.
             */
            public Builder address(java.util.List<Address> address) {
                this.address = address;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
