// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterMigrationResponseBody</p>
 */
public class DescribeDBClusterMigrationResponseBody extends TeaModel {
    @NameInMap("Comment")
    private String comment;

    @NameInMap("DBClusterEndpointList")
    private java.util.List < DBClusterEndpointList> DBClusterEndpointList;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("DBClusterReadWriteMode")
    private String DBClusterReadWriteMode;

    @NameInMap("DelayedSeconds")
    private Integer delayedSeconds;

    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("MigrationStatus")
    private String migrationStatus;

    @NameInMap("RdsEndpointList")
    private java.util.List < RdsEndpointList> rdsEndpointList;

    @NameInMap("RdsReadWriteMode")
    private String rdsReadWriteMode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceRDSDBInstanceId")
    private String sourceRDSDBInstanceId;

    @NameInMap("SrcDbType")
    private String srcDbType;

    @NameInMap("Topologies")
    private String topologies;

    private DescribeDBClusterMigrationResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.DBClusterEndpointList = builder.DBClusterEndpointList;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterReadWriteMode = builder.DBClusterReadWriteMode;
        this.delayedSeconds = builder.delayedSeconds;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.expiredTime = builder.expiredTime;
        this.migrationStatus = builder.migrationStatus;
        this.rdsEndpointList = builder.rdsEndpointList;
        this.rdsReadWriteMode = builder.rdsReadWriteMode;
        this.requestId = builder.requestId;
        this.sourceRDSDBInstanceId = builder.sourceRDSDBInstanceId;
        this.srcDbType = builder.srcDbType;
        this.topologies = builder.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterMigrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return DBClusterEndpointList
     */
    public java.util.List < DBClusterEndpointList> getDBClusterEndpointList() {
        return this.DBClusterEndpointList;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBClusterReadWriteMode
     */
    public String getDBClusterReadWriteMode() {
        return this.DBClusterReadWriteMode;
    }

    /**
     * @return delayedSeconds
     */
    public Integer getDelayedSeconds() {
        return this.delayedSeconds;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return migrationStatus
     */
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    /**
     * @return rdsEndpointList
     */
    public java.util.List < RdsEndpointList> getRdsEndpointList() {
        return this.rdsEndpointList;
    }

    /**
     * @return rdsReadWriteMode
     */
    public String getRdsReadWriteMode() {
        return this.rdsReadWriteMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceRDSDBInstanceId
     */
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    /**
     * @return srcDbType
     */
    public String getSrcDbType() {
        return this.srcDbType;
    }

    /**
     * @return topologies
     */
    public String getTopologies() {
        return this.topologies;
    }

    public static final class Builder {
        private String comment; 
        private java.util.List < DBClusterEndpointList> DBClusterEndpointList; 
        private String DBClusterId; 
        private String DBClusterReadWriteMode; 
        private Integer delayedSeconds; 
        private String dtsInstanceId; 
        private String expiredTime; 
        private String migrationStatus; 
        private java.util.List < RdsEndpointList> rdsEndpointList; 
        private String rdsReadWriteMode; 
        private String requestId; 
        private String sourceRDSDBInstanceId; 
        private String srcDbType; 
        private String topologies; 

        /**
         * The description of a migration exception. If no exception occurs during the migration, an empty string is returned.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * The endpoints of the PolarDB cluster.
         */
        public Builder DBClusterEndpointList(java.util.List < DBClusterEndpointList> DBClusterEndpointList) {
            this.DBClusterEndpointList = DBClusterEndpointList;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The mode of the PolarDB cluster. Valid values:
         * <p>
         * 
         * *   **rw**: read and write mode
         * *   **ro**: read-only mode
         */
        public Builder DBClusterReadWriteMode(String DBClusterReadWriteMode) {
            this.DBClusterReadWriteMode = DBClusterReadWriteMode;
            return this;
        }

        /**
         * The replication latency between the ApsaraDB RDS instance and the PolarDB cluster. Unit: seconds.
         */
        public Builder delayedSeconds(Integer delayedSeconds) {
            this.delayedSeconds = delayedSeconds;
            return this;
        }

        /**
         * The ID of the synchronous task.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The expiration time of the replication between ApsaraDB RDS and PolarDB. The time is in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The migration state of the PolarDB cluster. Valid values:
         * <p>
         * 
         * *   **NO_MIGRATION**: No migration task is running.
         * *   **RDS2POLARDB_CLONING**: Data is being replicated.
         * *   **RDS2POLARDB_SYNCING**: Data is being replicated. During the replication, the PolarDB cluster is running in read-only mode and the source ApsaraDB RDS instance is running in read and write mode.
         * *   **SWITCHING**: Databases are being switched.
         * *   **POLARDB2RDS_SYNCING**: Databases are switched. The PolarDB cluster is running in read and write mode and the source ApsaraDB RDS instance is running in read-only mode. In this state, you can modify the endpoints for your applications.
         * *   **ROLLBACK**: The migration is being rolled back. After the rollback is complete, the value **RDS2POLARDB_SYNCING** is returned.
         * *   **CLOSING_MIGRATION**: The migration task is being terminated.
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * The endpoints of the ApsaraDB RDS instance.
         */
        public Builder rdsEndpointList(java.util.List < RdsEndpointList> rdsEndpointList) {
            this.rdsEndpointList = rdsEndpointList;
            return this;
        }

        /**
         * The mode of the source ApsaraDB RDS instance. Valid values:
         * <p>
         * 
         * *   **rw**: read and write mode
         * *   **ro**: read-only mode
         */
        public Builder rdsReadWriteMode(String rdsReadWriteMode) {
            this.rdsReadWriteMode = rdsReadWriteMode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the source ApsaraDB RDS instance.
         */
        public Builder sourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
            this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
            return this;
        }

        /**
         * The type of the source database. Valid values:
         * <p>
         * 
         * *   **PolarDBMySQL**: The source database is a PolarDB for MySQL database when the major version of your PolarDB cluster is upgraded.
         * *   **RDS**: The source database is an ApsaraDB RDS database when data is migrated from ApsaraDB RDS to PolarDB for MySQL.
         */
        public Builder srcDbType(String srcDbType) {
            this.srcDbType = srcDbType;
            return this;
        }

        /**
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **RDS2POLARDB**: Data is replicated from an ApsaraDB RDS instance to a PolarDB cluster.
         * *   **POLARDB2RDS**: Data is replicated from a PolarDB cluster to an ApsaraDB RDS instance.
         */
        public Builder topologies(String topologies) {
            this.topologies = topologies;
            return this;
        }

        public DescribeDBClusterMigrationResponseBody build() {
            return new DescribeDBClusterMigrationResponseBody(this);
        } 

    } 

    public static class AddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("Port")
        private String port;

        @NameInMap("SSLEnabled")
        private String SSLEnabled;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private AddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
            this.SSLEnabled = builder.SSLEnabled;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressItems create() {
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
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return SSLEnabled
         */
        public String getSSLEnabled() {
            return this.SSLEnabled;
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
            private String netType; 
            private String port; 
            private String SSLEnabled; 
            private String VPCId; 
            private String vSwitchId; 

            /**
             * The connection string.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The IP address of the endpoint.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The network type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Public**: the public endpoint
             * *   **Private**: the internal endpoint (VPC)
             * *   **Inner**: the internal endpoint (classic network)
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **Enabled**
             * *   **Disabled**
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public AddressItems build() {
                return new AddressItems(this);
            } 

        } 

    }
    public static class DBClusterEndpointList extends TeaModel {
        @NameInMap("AddressItems")
        private java.util.List < AddressItems> addressItems;

        @NameInMap("DBEndpointId")
        private String DBEndpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        private DBClusterEndpointList(Builder builder) {
            this.addressItems = builder.addressItems;
            this.DBEndpointId = builder.DBEndpointId;
            this.endpointType = builder.endpointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterEndpointList create() {
            return builder().build();
        }

        /**
         * @return addressItems
         */
        public java.util.List < AddressItems> getAddressItems() {
            return this.addressItems;
        }

        /**
         * @return DBEndpointId
         */
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        public static final class Builder {
            private java.util.List < AddressItems> addressItems; 
            private String DBEndpointId; 
            private String endpointType; 

            /**
             * Details about the endpoints.
             */
            public Builder addressItems(java.util.List < AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Cluster**: the default cluster endpoint
             * *   **Primary**: the primary endpoint
             * *   **Custom**: the custom cluster endpoint
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            public DBClusterEndpointList build() {
                return new DBClusterEndpointList(this);
            } 

        } 

    }
    public static class RdsEndpointListAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("Port")
        private String port;

        @NameInMap("SSLEnabled")
        private String SSLEnabled;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private RdsEndpointListAddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
            this.SSLEnabled = builder.SSLEnabled;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsEndpointListAddressItems create() {
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
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return SSLEnabled
         */
        public String getSSLEnabled() {
            return this.SSLEnabled;
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
            private String netType; 
            private String port; 
            private String SSLEnabled; 
            private String VPCId; 
            private String vSwitchId; 

            /**
             * The connection string.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The IP address of the endpoint.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The network type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Public**: the public endpoint
             * *   **Private**: the internal endpoint (VPC)
             * *   **Inner**: the internal endpoint (classic network)
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **Enabled**
             * *   **Disabled**
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public RdsEndpointListAddressItems build() {
                return new RdsEndpointListAddressItems(this);
            } 

        } 

    }
    public static class RdsEndpointList extends TeaModel {
        @NameInMap("AddressItems")
        private java.util.List < RdsEndpointListAddressItems> addressItems;

        @NameInMap("DBEndpointId")
        private String DBEndpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        private RdsEndpointList(Builder builder) {
            this.addressItems = builder.addressItems;
            this.DBEndpointId = builder.DBEndpointId;
            this.endpointType = builder.endpointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsEndpointList create() {
            return builder().build();
        }

        /**
         * @return addressItems
         */
        public java.util.List < RdsEndpointListAddressItems> getAddressItems() {
            return this.addressItems;
        }

        /**
         * @return DBEndpointId
         */
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        public static final class Builder {
            private java.util.List < RdsEndpointListAddressItems> addressItems; 
            private String DBEndpointId; 
            private String endpointType; 

            /**
             * Details about the endpoints.
             */
            public Builder addressItems(java.util.List < RdsEndpointListAddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Normal**: the standard endpoint
             * *   **ReadWriteSplitting**: the read/write splitting endpoint
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            public RdsEndpointList build() {
                return new RdsEndpointList(this);
            } 

        } 

    }
}
