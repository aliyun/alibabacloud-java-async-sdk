// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterMigrationResponseBody</p>
 */
public class DescribeDBClusterMigrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("DBClusterEndpointList")
    private java.util.List < DBClusterEndpointList> DBClusterEndpointList;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusterReadWriteMode")
    private String DBClusterReadWriteMode;

    @com.aliyun.core.annotation.NameInMap("DelayedSeconds")
    private Integer delayedSeconds;

    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("MigrationStatus")
    private String migrationStatus;

    @com.aliyun.core.annotation.NameInMap("RdsEndpointList")
    private java.util.List < RdsEndpointList> rdsEndpointList;

    @com.aliyun.core.annotation.NameInMap("RdsReadWriteMode")
    private String rdsReadWriteMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceRDSDBInstanceId")
    private String sourceRDSDBInstanceId;

    @com.aliyun.core.annotation.NameInMap("SrcDbType")
    private String srcDbType;

    @com.aliyun.core.annotation.NameInMap("Topologies")
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
         * <p>The mode of the source ApsaraDB RDS instance. Valid values:</p>
         * <ul>
         * <li><strong>rw</strong>: read and write mode</li>
         * <li><strong>ro</strong>: read-only mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The port number.</p>
         */
        public Builder DBClusterEndpointList(java.util.List < DBClusterEndpointList> DBClusterEndpointList) {
            this.DBClusterEndpointList = DBClusterEndpointList;
            return this;
        }

        /**
         * <p>The replication latency between the ApsaraDB RDS instance and the PolarDB cluster. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Details about the endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>ro</p>
         */
        public Builder DBClusterReadWriteMode(String DBClusterReadWriteMode) {
            this.DBClusterReadWriteMode = DBClusterReadWriteMode;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delayedSeconds(Integer delayedSeconds) {
            this.delayedSeconds = delayedSeconds;
            return this;
        }

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: the public endpoint</li>
         * <li><strong>Private</strong>: the internal endpoint (VPC)</li>
         * <li><strong>Inner</strong>: the internal endpoint (classic network)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dts**********618bs</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The mode of the PolarDB cluster. Valid values:</p>
         * <ul>
         * <li><strong>rw</strong>: read and write mode</li>
         * <li><strong>ro</strong>: read-only mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-06-17T01:56:36Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS2POLARDB_SYNCING</p>
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * <p>The port number.</p>
         */
        public Builder rdsEndpointList(java.util.List < RdsEndpointList> rdsEndpointList) {
            this.rdsEndpointList = rdsEndpointList;
            return this;
        }

        /**
         * <p>The ID of the synchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>rw</p>
         */
        public Builder rdsReadWriteMode(String rdsReadWriteMode) {
            this.rdsReadWriteMode = rdsReadWriteMode;
            return this;
        }

        /**
         * <p>The ID of the source ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The endpoints of the ApsaraDB RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-************</p>
         */
        public Builder sourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
            this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
            return this;
        }

        /**
         * SrcDbType.
         */
        public Builder srcDbType(String srcDbType) {
            this.srcDbType = srcDbType;
            return this;
        }

        /**
         * <p>The migration state of the PolarDB cluster. Valid values:</p>
         * <ul>
         * <li><strong>NO_MIGRATION</strong>: No migration task is running.</li>
         * <li><strong>RDS2POLARDB_CLONING</strong>: Data is being replicated.</li>
         * <li><strong>RDS2POLARDB_SYNCING</strong>: Data is being replicated. During the replication, the PolarDB cluster is running in read-only mode and the source ApsaraDB RDS instance is running in read and write mode.</li>
         * <li><strong>SWITCHING</strong>: Databases are being switched.</li>
         * <li><strong>POLARDB2RDS_SYNCING</strong>: Databases are switched. The PolarDB cluster is running in read and write mode and the source ApsaraDB RDS instance is running in read-only mode. In this state, you can modify the endpoints for your applications.</li>
         * <li><strong>ROLLBACK</strong>: The migration is being rolled back. After the rollback is complete, the value <strong>RDS2POLARDB_SYNCING</strong> is returned.</li>
         * <li><strong>CLOSING_MIGRATION</strong>: The migration task is being terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS2POLARDB</p>
         */
        public Builder topologies(String topologies) {
            this.topologies = topologies;
            return this;
        }

        public DescribeDBClusterMigrationResponseBody build() {
            return new DescribeDBClusterMigrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterMigrationResponseBody</p>
     */
    public static class AddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("SSLEnabled")
        private String SSLEnabled;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pc-**************.rwlb.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The description of a migration exception. If no exception occurs during the migration, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>192.<em><strong>.</strong></em>.10</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Cluster</strong>: the default cluster endpoint</li>
             * <li><strong>Primary</strong>: the primary endpoint</li>
             * <li><strong>Custom</strong>: the custom endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * <p>The read/write mode. Valid values:</p>
             * <ul>
             * <li>ReadWrite: receives and forwards read and write requests (automatic read-write splitting).</li>
             * <li>ReadOnly (default): receives and forwards read requests only.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc-**********</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The IP address of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-**********</p>
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
    /**
     * 
     * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterMigrationResponseBody</p>
     */
    public static class DBClusterEndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private java.util.List < AddressItems> addressItems;

        @com.aliyun.core.annotation.NameInMap("DBEndpointId")
        private String DBEndpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("ReadWriteMode")
        private String readWriteMode;

        private DBClusterEndpointList(Builder builder) {
            this.addressItems = builder.addressItems;
            this.DBEndpointId = builder.DBEndpointId;
            this.endpointType = builder.endpointType;
            this.readWriteMode = builder.readWriteMode;
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

        /**
         * @return readWriteMode
         */
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        public static final class Builder {
            private java.util.List < AddressItems> addressItems; 
            private String DBEndpointId; 
            private String endpointType; 
            private String readWriteMode; 

            /**
             * <p>The VPC ID.</p>
             */
            public Builder addressItems(java.util.List < AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * <p>The expiration time of the replication between ApsaraDB RDS and PolarDB. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-***********</p>
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>RDS2POLARDB</strong>: Data is replicated from an ApsaraDB RDS instance to a PolarDB cluster.</li>
             * <li><strong>POLARDB2RDS</strong>: Data is replicated from a PolarDB cluster to an ApsaraDB RDS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder readWriteMode(String readWriteMode) {
                this.readWriteMode = readWriteMode;
                return this;
            }

            public DBClusterEndpointList build() {
                return new DBClusterEndpointList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterMigrationResponseBody</p>
     */
    public static class RdsEndpointListAddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("SSLEnabled")
        private String SSLEnabled;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rm-***********.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The type of the source database. Valid values:</p>
             * <ul>
             * <li><strong>PolarDBMySQL</strong>: The source database is a PolarDB for MySQL database when the major version of your PolarDB cluster is upgraded.</li>
             * <li><strong>RDS</strong>: The source database is an ApsaraDB RDS database when data is migrated from ApsaraDB RDS to PolarDB for MySQL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172.<em><strong>.</strong></em>.173</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: the standard endpoint</li>
             * <li><strong>ReadWriteSplitting</strong>: the read/write splitting endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-************</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The IP address of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-**************</p>
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
    /**
     * 
     * {@link DescribeDBClusterMigrationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterMigrationResponseBody</p>
     */
    public static class RdsEndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private java.util.List < RdsEndpointListAddressItems> addressItems;

        @com.aliyun.core.annotation.NameInMap("CustinsType")
        private String custinsType;

        @com.aliyun.core.annotation.NameInMap("DBEndpointId")
        private String DBEndpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        private RdsEndpointList(Builder builder) {
            this.addressItems = builder.addressItems;
            this.custinsType = builder.custinsType;
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
         * @return custinsType
         */
        public String getCustinsType() {
            return this.custinsType;
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
            private String custinsType; 
            private String DBEndpointId; 
            private String endpointType; 

            /**
             * <p>The VPC ID.</p>
             */
            public Builder addressItems(java.util.List < RdsEndpointListAddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * CustinsType.
             */
            public Builder custinsType(String custinsType) {
                this.custinsType = custinsType;
                return this;
            }

            /**
             * <p>The expiration time of the replication between ApsaraDB RDS and PolarDB. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-***********</p>
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster</p>
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
