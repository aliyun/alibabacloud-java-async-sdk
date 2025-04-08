// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoResponseBody</p>
 */
public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClustersNetInfos")
    private java.util.List<DBClustersNetInfos> DBClustersNetInfos;

    @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfos")
    private java.util.List<DBInstanceNetInfos> DBInstanceNetInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClustersNetInfos
     */
    public java.util.List<DBClustersNetInfos> getDBClustersNetInfos() {
        return this.DBClustersNetInfos;
    }

    /**
     * @return DBInstanceNetInfos
     */
    public java.util.List<DBInstanceNetInfos> getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DBClustersNetInfos> DBClustersNetInfos; 
        private java.util.List<DBInstanceNetInfos> DBInstanceNetInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceNetInfoResponseBody model) {
            this.DBClustersNetInfos = model.DBClustersNetInfos;
            this.DBInstanceNetInfos = model.DBInstanceNetInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The network information about the backend (BE) clusters.</p>
         */
        public Builder DBClustersNetInfos(java.util.List<DBClustersNetInfos> DBClustersNetInfos) {
            this.DBClustersNetInfos = DBClustersNetInfos;
            return this;
        }

        /**
         * <p>The network information about the instance.</p>
         */
        public Builder DBInstanceNetInfos(java.util.List<DBInstanceNetInfos> DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoResponseBody build() {
            return new DescribeDBInstanceNetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PortList model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port that is used to connect to the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQLPort/HttpPort</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>9030/8080</p>
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
    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
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
        private java.util.List<PortList> portList;

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
        public java.util.List<PortList> getPortList() {
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
            private java.util.List<PortList> portList; 
            private Boolean userVisible; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(DBClustersNetInfos model) {
                this.clusterId = model.clusterId;
                this.connectionString = model.connectionString;
                this.ip = model.ip;
                this.netType = model.netType;
                this.portList = model.portList;
                this.userVisible = model.userVisible;
                this.vpcId = model.vpcId;
                this.vpcInstanceId = model.vpcInstanceId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-****-be</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The connection string of the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The IP address of the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8.131.<em><strong>.</strong></em></p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The network type of the BE cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC/PUBLIC</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * PortList.
             */
            public Builder portList(java.util.List<PortList> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * <p>Indicates whether the network information is visible to users.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-****-fe-20230816101006</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-****</p>
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
    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DBInstanceNetInfosPortList model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQLPort</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol of the port. Valid values:</p>
             * <ul>
             * <li><strong>HttpPort</strong>: HTTP port.</li>
             * <li><strong>MySQLPort</strong>: MySQL port.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9030</p>
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
    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
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
        private java.util.List<DBInstanceNetInfosPortList> portList;

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
        public java.util.List<DBInstanceNetInfosPortList> getPortList() {
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
            private java.util.List<DBInstanceNetInfosPortList> portList; 
            private Boolean userVisible; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(DBInstanceNetInfos model) {
                this.clusterId = model.clusterId;
                this.connectionString = model.connectionString;
                this.ip = model.ip;
                this.netType = model.netType;
                this.portList = model.portList;
                this.userVisible = model.userVisible;
                this.vpcId = model.vpcId;
                this.vpcInstanceId = model.vpcInstanceId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-****-be</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The connection string of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-h033cnd****-fe.selectdbfe.pre.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: indicates a virtual private cloud (VPC)-connected instance.</li>
             * <li><strong>PUBLIC</strong>: indicates an Internet-connected instance.</li>
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
             * <p>The ports.</p>
             */
            public Builder portList(java.util.List<DBInstanceNetInfosPortList> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * <p>Indicates whether the network information is visible to users. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz90scxq6ods388ft****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the VPC-connected instance.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-h033cnd****-fe-20230816101006</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6mlqti065rer6m0****</p>
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
