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

    @NameInMap("Topologies")
    private String topologies;

    private DescribeDBClusterMigrationResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.DBClusterEndpointList = builder.DBClusterEndpointList;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterReadWriteMode = builder.DBClusterReadWriteMode;
        this.delayedSeconds = builder.delayedSeconds;
        this.expiredTime = builder.expiredTime;
        this.migrationStatus = builder.migrationStatus;
        this.rdsEndpointList = builder.rdsEndpointList;
        this.rdsReadWriteMode = builder.rdsReadWriteMode;
        this.requestId = builder.requestId;
        this.sourceRDSDBInstanceId = builder.sourceRDSDBInstanceId;
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
        private String expiredTime; 
        private String migrationStatus; 
        private java.util.List < RdsEndpointList> rdsEndpointList; 
        private String rdsReadWriteMode; 
        private String requestId; 
        private String sourceRDSDBInstanceId; 
        private String topologies; 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * DBClusterEndpointList.
         */
        public Builder DBClusterEndpointList(java.util.List < DBClusterEndpointList> DBClusterEndpointList) {
            this.DBClusterEndpointList = DBClusterEndpointList;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBClusterReadWriteMode.
         */
        public Builder DBClusterReadWriteMode(String DBClusterReadWriteMode) {
            this.DBClusterReadWriteMode = DBClusterReadWriteMode;
            return this;
        }

        /**
         * DelayedSeconds.
         */
        public Builder delayedSeconds(Integer delayedSeconds) {
            this.delayedSeconds = delayedSeconds;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * MigrationStatus.
         */
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }

        /**
         * RdsEndpointList.
         */
        public Builder rdsEndpointList(java.util.List < RdsEndpointList> rdsEndpointList) {
            this.rdsEndpointList = rdsEndpointList;
            return this;
        }

        /**
         * RdsReadWriteMode.
         */
        public Builder rdsReadWriteMode(String rdsReadWriteMode) {
            this.rdsReadWriteMode = rdsReadWriteMode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceRDSDBInstanceId.
         */
        public Builder sourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
            this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
            return this;
        }

        /**
         * Topologies.
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

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private AddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
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
             * AddressItems.
             */
            public Builder addressItems(java.util.List < AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * DBEndpointId.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * EndpointType.
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

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private RdsEndpointListAddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
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
             * AddressItems.
             */
            public Builder addressItems(java.util.List < RdsEndpointListAddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * DBEndpointId.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * EndpointType.
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
