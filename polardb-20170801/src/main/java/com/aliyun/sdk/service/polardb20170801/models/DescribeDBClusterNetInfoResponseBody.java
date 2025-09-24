// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

    @com.aliyun.core.annotation.NameInMap("DBClusterNetInfos")
    private DBClusterNetInfos DBClusterNetInfos;

    @com.aliyun.core.annotation.NameInMap("DBNodeNetInfos")
    private DBNodeNetInfos DBNodeNetInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterNetInfoResponseBody(Builder builder) {
        this.clusterNetworkType = builder.clusterNetworkType;
        this.DBClusterNetInfos = builder.DBClusterNetInfos;
        this.DBNodeNetInfos = builder.DBNodeNetInfos;
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
     * @return DBClusterNetInfos
     */
    public DBClusterNetInfos getDBClusterNetInfos() {
        return this.DBClusterNetInfos;
    }

    /**
     * @return DBNodeNetInfos
     */
    public DBNodeNetInfos getDBNodeNetInfos() {
        return this.DBNodeNetInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterNetworkType; 
        private DBClusterNetInfos DBClusterNetInfos; 
        private DBNodeNetInfos DBNodeNetInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterNetInfoResponseBody model) {
            this.clusterNetworkType = model.clusterNetworkType;
            this.DBClusterNetInfos = model.DBClusterNetInfos;
            this.DBNodeNetInfos = model.DBNodeNetInfos;
            this.requestId = model.requestId;
        } 

        /**
         * ClusterNetworkType.
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * DBClusterNetInfos.
         */
        public Builder DBClusterNetInfos(DBClusterNetInfos DBClusterNetInfos) {
            this.DBClusterNetInfos = DBClusterNetInfos;
            return this;
        }

        /**
         * DBNodeNetInfos.
         */
        public Builder DBNodeNetInfos(DBNodeNetInfos DBNodeNetInfos) {
            this.DBNodeNetInfos = DBNodeNetInfos;
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

    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class DBClusterNetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("ConnectionStringType")
        private String connectionStringType;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private DBClusterNetInfo(Builder builder) {
            this.connectionString = builder.connectionString;
            this.connectionStringType = builder.connectionStringType;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.port = builder.port;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterNetInfo create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return connectionStringType
         */
        public String getConnectionStringType() {
            return this.connectionStringType;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return IPType
         */
        public String getIPType() {
            return this.IPType;
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
            private String connectionStringType; 
            private String IPAddress; 
            private String IPType; 
            private String port; 
            private String VPCId; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(DBClusterNetInfo model) {
                this.connectionString = model.connectionString;
                this.connectionStringType = model.connectionStringType;
                this.IPAddress = model.IPAddress;
                this.IPType = model.IPType;
                this.port = model.port;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * ConnectionStringType.
             */
            public Builder connectionStringType(String connectionStringType) {
                this.connectionStringType = connectionStringType;
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
             * IPType.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
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

            public DBClusterNetInfo build() {
                return new DBClusterNetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class DBClusterNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterNetInfo")
        private java.util.List<DBClusterNetInfo> DBClusterNetInfo;

        private DBClusterNetInfos(Builder builder) {
            this.DBClusterNetInfo = builder.DBClusterNetInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterNetInfos create() {
            return builder().build();
        }

        /**
         * @return DBClusterNetInfo
         */
        public java.util.List<DBClusterNetInfo> getDBClusterNetInfo() {
            return this.DBClusterNetInfo;
        }

        public static final class Builder {
            private java.util.List<DBClusterNetInfo> DBClusterNetInfo; 

            private Builder() {
            } 

            private Builder(DBClusterNetInfos model) {
                this.DBClusterNetInfo = model.DBClusterNetInfo;
            } 

            /**
             * DBClusterNetInfo.
             */
            public Builder DBClusterNetInfo(java.util.List<DBClusterNetInfo> DBClusterNetInfo) {
                this.DBClusterNetInfo = DBClusterNetInfo;
                return this;
            }

            public DBClusterNetInfos build() {
                return new DBClusterNetInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class NetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetInfo(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.port = builder.port;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfo create() {
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
         * @return IPType
         */
        public String getIPType() {
            return this.IPType;
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
            private String IPAddress; 
            private String IPType; 
            private String port; 
            private String VPCId; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NetInfo model) {
                this.connectionString = model.connectionString;
                this.IPAddress = model.IPAddress;
                this.IPType = model.IPType;
                this.port = model.port;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

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
             * IPType.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
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

            public NetInfo build() {
                return new NetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class NetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfo")
        private java.util.List<NetInfo> netInfo;

        private NetInfos(Builder builder) {
            this.netInfo = builder.netInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfos create() {
            return builder().build();
        }

        /**
         * @return netInfo
         */
        public java.util.List<NetInfo> getNetInfo() {
            return this.netInfo;
        }

        public static final class Builder {
            private java.util.List<NetInfo> netInfo; 

            private Builder() {
            } 

            private Builder(NetInfos model) {
                this.netInfo = model.netInfo;
            } 

            /**
             * NetInfo.
             */
            public Builder netInfo(java.util.List<NetInfo> netInfo) {
                this.netInfo = netInfo;
                return this;
            }

            public NetInfos build() {
                return new NetInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class DBNodeNetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBNodeRole")
        private String DBNodeRole;

        @com.aliyun.core.annotation.NameInMap("NetInfos")
        private NetInfos netInfos;

        private DBNodeNetInfo(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.DBNodeRole = builder.DBNodeRole;
            this.netInfos = builder.netInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeNetInfo create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBNodeRole
         */
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        /**
         * @return netInfos
         */
        public NetInfos getNetInfos() {
            return this.netInfos;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String DBNodeRole; 
            private NetInfos netInfos; 

            private Builder() {
            } 

            private Builder(DBNodeNetInfo model) {
                this.DBInstanceId = model.DBInstanceId;
                this.DBNodeRole = model.DBNodeRole;
                this.netInfos = model.netInfos;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBNodeRole.
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * NetInfos.
             */
            public Builder netInfos(NetInfos netInfos) {
                this.netInfos = netInfos;
                return this;
            }

            public DBNodeNetInfo build() {
                return new DBNodeNetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterNetInfoResponseBody</p>
     */
    public static class DBNodeNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeNetInfo")
        private java.util.List<DBNodeNetInfo> DBNodeNetInfo;

        private DBNodeNetInfos(Builder builder) {
            this.DBNodeNetInfo = builder.DBNodeNetInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeNetInfos create() {
            return builder().build();
        }

        /**
         * @return DBNodeNetInfo
         */
        public java.util.List<DBNodeNetInfo> getDBNodeNetInfo() {
            return this.DBNodeNetInfo;
        }

        public static final class Builder {
            private java.util.List<DBNodeNetInfo> DBNodeNetInfo; 

            private Builder() {
            } 

            private Builder(DBNodeNetInfos model) {
                this.DBNodeNetInfo = model.DBNodeNetInfo;
            } 

            /**
             * DBNodeNetInfo.
             */
            public Builder DBNodeNetInfo(java.util.List<DBNodeNetInfo> DBNodeNetInfo) {
                this.DBNodeNetInfo = DBNodeNetInfo;
                return this;
            }

            public DBNodeNetInfos build() {
                return new DBNodeNetInfos(this);
            } 

        } 

    }
}
