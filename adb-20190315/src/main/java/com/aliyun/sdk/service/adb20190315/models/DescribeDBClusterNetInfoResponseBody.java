// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNetInfoResponseBody</p>
 */
public class DescribeDBClusterNetInfoResponseBody extends TeaModel {
    @NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
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
         * ClusterNetworkType.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterNetInfoResponseBody build() {
            return new DescribeDBClusterNetInfoResponseBody(this);
        } 

    } 

    public static class Address extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("ConnectionStringPrefix")
        private String connectionStringPrefix;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("Port")
        private String port;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
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

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * ConnectionStringPrefix.
             */
            public Builder connectionStringPrefix(String connectionStringPrefix) {
                this.connectionStringPrefix = connectionStringPrefix;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
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
        @NameInMap("Address")
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
