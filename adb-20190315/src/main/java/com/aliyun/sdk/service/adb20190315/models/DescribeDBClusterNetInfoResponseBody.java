// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNetInfoResponseBody</p>
 */
public class DescribeDBClusterNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterNetInfoResponseBody(Builder builder) {
        this.clusterNetworkType = builder.clusterNetworkType;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterNetInfoResponseBody create() {
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

        private Builder(DescribeDBClusterNetInfoResponseBody model) {
            this.clusterNetworkType = model.clusterNetworkType;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network type of the cluster.</p>
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
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterNetInfoResponseBody build() {
            return new DescribeDBClusterNetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
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
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The endpoint of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bpxxxxxxxx.ads.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The prefix of the cluster endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>am-bpxxxxxxxx89k51380</p>
             */
            public Builder connectionStringPrefix(String connectionStringPrefix) {
                this.connectionStringPrefix = connectionStringPrefix;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.x.x</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The network type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: public endpoint.</li>
             * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) endpoint.</li>
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
             * <p>The port number that is used to connect to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * <blockquote>
             * <p> If NetType is set to Public, an empty string is returned for this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * <blockquote>
             * <p> If NetType is set to Public, an empty string is returned for this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxx</p>
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
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
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
