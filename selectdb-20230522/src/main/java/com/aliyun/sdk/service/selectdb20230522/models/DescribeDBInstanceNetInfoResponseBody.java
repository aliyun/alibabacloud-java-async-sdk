// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoResponseBody</p>
 */
public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClustersNetInfos")
    private java.util.List < DBClustersNetInfos> DBClustersNetInfos;

    @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfos")
    private java.util.List < DBInstanceNetInfos> DBInstanceNetInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceNetInfoResponseBody(Builder builder) {
        this.DBClustersNetInfos = builder.DBClustersNetInfos;
        this.DBInstanceNetInfos = builder.DBInstanceNetInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClustersNetInfos
     */
    public java.util.List < DBClustersNetInfos> getDBClustersNetInfos() {
        return this.DBClustersNetInfos;
    }

    /**
     * @return DBInstanceNetInfos
     */
    public java.util.List < DBInstanceNetInfos> getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DBClustersNetInfos> DBClustersNetInfos; 
        private java.util.List < DBInstanceNetInfos> DBInstanceNetInfos; 
        private String requestId; 

        /**
         * DBClustersNetInfos.
         */
        public Builder DBClustersNetInfos(java.util.List < DBClustersNetInfos> DBClustersNetInfos) {
            this.DBClustersNetInfos = DBClustersNetInfos;
            return this;
        }

        /**
         * DBInstanceNetInfos.
         */
        public Builder DBInstanceNetInfos(java.util.List < DBInstanceNetInfos> DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoResponseBody build() {
            return new DescribeDBInstanceNetInfoResponseBody(this);
        } 

    } 

    public static class PortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private PortList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortList create() {
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

            public PortList build() {
                return new PortList(this);
            } 

        } 

    }
    public static class DBClustersNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("PortList")
        private java.util.List < PortList> portList;

        @com.aliyun.core.annotation.NameInMap("UserVisible")
        private Boolean userVisible;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private DBClustersNetInfos(Builder builder) {
            this.clusterId = builder.clusterId;
            this.connectionString = builder.connectionString;
            this.ip = builder.ip;
            this.netType = builder.netType;
            this.portList = builder.portList;
            this.userVisible = builder.userVisible;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClustersNetInfos create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return portList
         */
        public java.util.List < PortList> getPortList() {
            return this.portList;
        }

        /**
         * @return userVisible
         */
        public Boolean getUserVisible() {
            return this.userVisible;
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

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String clusterId; 
            private String connectionString; 
            private String ip; 
            private String netType; 
            private java.util.List < PortList> portList; 
            private Boolean userVisible; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vswitchId; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * PortList.
             */
            public Builder portList(java.util.List < PortList> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * UserVisible.
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * VpcId.
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

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public DBClustersNetInfos build() {
                return new DBClustersNetInfos(this);
            } 

        } 

    }
    public static class DBInstanceNetInfosPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private DBInstanceNetInfosPortList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfosPortList create() {
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

            public DBInstanceNetInfosPortList build() {
                return new DBInstanceNetInfosPortList(this);
            } 

        } 

    }
    public static class DBInstanceNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("PortList")
        private java.util.List < DBInstanceNetInfosPortList> portList;

        @com.aliyun.core.annotation.NameInMap("UserVisible")
        private Boolean userVisible;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private DBInstanceNetInfos(Builder builder) {
            this.clusterId = builder.clusterId;
            this.connectionString = builder.connectionString;
            this.ip = builder.ip;
            this.netType = builder.netType;
            this.portList = builder.portList;
            this.userVisible = builder.userVisible;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfos create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return portList
         */
        public java.util.List < DBInstanceNetInfosPortList> getPortList() {
            return this.portList;
        }

        /**
         * @return userVisible
         */
        public Boolean getUserVisible() {
            return this.userVisible;
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

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String clusterId; 
            private String connectionString; 
            private String ip; 
            private String netType; 
            private java.util.List < DBInstanceNetInfosPortList> portList; 
            private Boolean userVisible; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vswitchId; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * PortList.
             */
            public Builder portList(java.util.List < DBInstanceNetInfosPortList> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * UserVisible.
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * VPC ID。
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

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public DBInstanceNetInfos build() {
                return new DBInstanceNetInfos(this);
            } 

        } 

    }
}
