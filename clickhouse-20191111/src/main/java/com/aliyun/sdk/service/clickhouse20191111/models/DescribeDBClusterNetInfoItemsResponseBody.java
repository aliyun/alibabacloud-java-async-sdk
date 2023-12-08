// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNetInfoItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNetInfoItemsResponseBody</p>
 */
public class DescribeDBClusterNetInfoItemsResponseBody extends TeaModel {
    @NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @NameInMap("EnableSLB")
    @Validation(required = true)
    private Boolean enableSLB;

    @NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterNetInfoItemsResponseBody(Builder builder) {
        this.clusterNetworkType = builder.clusterNetworkType;
        this.enableSLB = builder.enableSLB;
        this.netInfoItems = builder.netInfoItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterNetInfoItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterNetworkType
     */
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    /**
     * @return enableSLB
     */
    public Boolean getEnableSLB() {
        return this.enableSLB;
    }

    /**
     * @return netInfoItems
     */
    public NetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterNetworkType; 
        private Boolean enableSLB; 
        private NetInfoItems netInfoItems; 
        private String requestId; 

        /**
         * ClusterNetworkType.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * EnableSLB.
         */
        public Builder enableSLB(Boolean enableSLB) {
            this.enableSLB = enableSLB;
            return this;
        }

        /**
         * NetInfoItems.
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterNetInfoItemsResponseBody build() {
            return new DescribeDBClusterNetInfoItemsResponseBody(this);
        } 

    } 

    public static class NetInfoItem extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("HttpPort")
        private String httpPort;

        @NameInMap("HttpsPort")
        private String httpsPort;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("JdbcPort")
        private String jdbcPort;

        @NameInMap("MySQLPort")
        private String mySQLPort;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private NetInfoItem(Builder builder) {
            this.connectionString = builder.connectionString;
            this.httpPort = builder.httpPort;
            this.httpsPort = builder.httpsPort;
            this.IPAddress = builder.IPAddress;
            this.jdbcPort = builder.jdbcPort;
            this.mySQLPort = builder.mySQLPort;
            this.netType = builder.netType;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItem create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return httpPort
         */
        public String getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return httpsPort
         */
        public String getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return jdbcPort
         */
        public String getJdbcPort() {
            return this.jdbcPort;
        }

        /**
         * @return mySQLPort
         */
        public String getMySQLPort() {
            return this.mySQLPort;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
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

        public static final class Builder {
            private String connectionString; 
            private String httpPort; 
            private String httpsPort; 
            private String IPAddress; 
            private String jdbcPort; 
            private String mySQLPort; 
            private String netType; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * HttpPort.
             */
            public Builder httpPort(String httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * HttpsPort.
             */
            public Builder httpsPort(String httpsPort) {
                this.httpsPort = httpsPort;
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
             * JdbcPort.
             */
            public Builder jdbcPort(String jdbcPort) {
                this.jdbcPort = jdbcPort;
                return this;
            }

            /**
             * MySQLPort.
             */
            public Builder mySQLPort(String mySQLPort) {
                this.mySQLPort = mySQLPort;
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
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetInfoItem build() {
                return new NetInfoItem(this);
            } 

        } 

    }
    public static class NetInfoItems extends TeaModel {
        @NameInMap("NetInfoItem")
        private java.util.List < NetInfoItem> netInfoItem;

        private NetInfoItems(Builder builder) {
            this.netInfoItem = builder.netInfoItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItems create() {
            return builder().build();
        }

        /**
         * @return netInfoItem
         */
        public java.util.List < NetInfoItem> getNetInfoItem() {
            return this.netInfoItem;
        }

        public static final class Builder {
            private java.util.List < NetInfoItem> netInfoItem; 

            /**
             * NetInfoItem.
             */
            public Builder netInfoItem(java.util.List < NetInfoItem> netInfoItem) {
                this.netInfoItem = netInfoItem;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
}
