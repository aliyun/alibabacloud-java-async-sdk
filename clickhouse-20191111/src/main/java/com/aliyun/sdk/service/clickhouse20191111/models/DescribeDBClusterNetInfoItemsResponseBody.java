// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterNetInfoItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterNetInfoItemsResponseBody</p>
 */
public class DescribeDBClusterNetInfoItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @com.aliyun.core.annotation.NameInMap("EnableSLB")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableSLB;

    @com.aliyun.core.annotation.NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The network type of the cluster. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * <p>Indicates whether Server Load Balancer (SLB) is activated in the VPC. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSLB(Boolean enableSLB) {
            this.enableSLB = enableSLB;
            return this;
        }

        /**
         * <p>The network information about the cluster.</p>
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterNetInfoItemsResponseBody build() {
            return new DescribeDBClusterNetInfoItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterNetInfoItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoItemsResponseBody</p>
     */
    public static class NetInfoItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private String httpPort;

        @com.aliyun.core.annotation.NameInMap("HttpsPort")
        private String httpsPort;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("JdbcPort")
        private String jdbcPort;

        @com.aliyun.core.annotation.NameInMap("MySQLPort")
        private String mySQLPort;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
             * <p>The endpoint that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp1554t789i8e****.clickhouse.ads.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The HTTP port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8123</p>
             */
            public Builder httpPort(String httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * <p>The HTTPS port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8443</p>
             */
            public Builder httpsPort(String httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.255.234.251</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The port number that is used in Java Database Connectivity (JDBC).</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder jdbcPort(String jdbcPort) {
                this.jdbcPort = jdbcPort;
                return this;
            }

            /**
             * <p>The port of the MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>9004</p>
             */
            public Builder mySQLPort(String mySQLPort) {
                this.mySQLPort = mySQLPort;
                return this;
            }

            /**
             * <p>The network type of the endpoint. Valid values:</p>
             * <ul>
             * <li>Public: public endpoint</li>
             * <li>VPC: VPC</li>
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
             * <p>The vSwitch ID.</p>
             * <blockquote>
             * <p> If the value of the NetType parameter is set to Public, an empty string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1gzt31twhlo0sa5****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * <blockquote>
             * <p> If the value of the NetType parameter is set to Public, an empty string is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp175iuvg8nxqraf2****</p>
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
    /**
     * 
     * {@link DescribeDBClusterNetInfoItemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoItemsResponseBody</p>
     */
    public static class NetInfoItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfoItem")
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
