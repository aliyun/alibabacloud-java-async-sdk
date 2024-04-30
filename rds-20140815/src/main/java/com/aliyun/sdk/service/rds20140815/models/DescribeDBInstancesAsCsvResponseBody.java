// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesAsCsvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesAsCsvResponseBody</p>
 */
public class DescribeDBInstancesAsCsvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstancesAsCsvResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesAsCsvResponseBody create() {
        return builder().build();
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
        private Items items; 
        private String requestId; 

        /**
         * An array that consists of the fields in **DBInstanceAttribute**.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstancesAsCsvResponseBody build() {
            return new DescribeDBInstancesAsCsvResponseBody(this);
        } 

    } 

    public static class SlaveZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("slaveRegion")
        private java.util.List < String > slaveRegion;

        private SlaveZones(Builder builder) {
            this.slaveRegion = builder.slaveRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZones create() {
            return builder().build();
        }

        /**
         * @return slaveRegion
         */
        public java.util.List < String > getSlaveRegion() {
            return this.slaveRegion;
        }

        public static final class Builder {
            private java.util.List < String > slaveRegion; 

            /**
             * slaveRegion.
             */
            public Builder slaveRegion(java.util.List < String > slaveRegion) {
                this.slaveRegion = slaveRegion;
                return this;
            }

            public SlaveZones build() {
                return new SlaveZones(this);
            } 

        } 

    }
    public static class DBInstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountMaxQuantity")
        private Integer accountMaxQuantity;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AvailabilityValue")
        private String availabilityValue;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DBMaxQuantity")
        private Integer DBMaxQuantity;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExportKey")
        private String exportKey;

        @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("IncrementSourceDBInstanceId")
        private String incrementSourceDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ReadDelayTime")
        private String readDelayTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("SlaveZones")
        private SlaveZones slaveZones;

        @com.aliyun.core.annotation.NameInMap("SupportUpgradeAccountType")
        private String supportUpgradeAccountType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstanceAttribute(Builder builder) {
            this.accountMaxQuantity = builder.accountMaxQuantity;
            this.accountType = builder.accountType;
            this.availabilityValue = builder.availabilityValue;
            this.category = builder.category;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.creationTime = builder.creationTime;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBMaxQuantity = builder.DBMaxQuantity;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.exportKey = builder.exportKey;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.incrementSourceDBInstanceId = builder.incrementSourceDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.masterInstanceId = builder.masterInstanceId;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.payType = builder.payType;
            this.port = builder.port;
            this.readDelayTime = builder.readDelayTime;
            this.regionId = builder.regionId;
            this.securityIPList = builder.securityIPList;
            this.slaveZones = builder.slaveZones;
            this.supportUpgradeAccountType = builder.supportUpgradeAccountType;
            this.tags = builder.tags;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return accountMaxQuantity
         */
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return availabilityValue
         */
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return connectionMode
         */
        public String getConnectionMode() {
            return this.connectionMode;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBInstanceCPU
         */
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceClassType
         */
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceMemory
         */
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStorage
         */
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return DBMaxQuantity
         */
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return exportKey
         */
        public String getExportKey() {
            return this.exportKey;
        }

        /**
         * @return guardDBInstanceId
         */
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        /**
         * @return incrementSourceDBInstanceId
         */
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return readDelayTime
         */
        public String getReadDelayTime() {
            return this.readDelayTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return slaveZones
         */
        public SlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        /**
         * @return supportUpgradeAccountType
         */
        public String getSupportUpgradeAccountType() {
            return this.supportUpgradeAccountType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return tempDBInstanceId
         */
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer accountMaxQuantity; 
            private String accountType; 
            private String availabilityValue; 
            private String category; 
            private String connectionMode; 
            private String connectionString; 
            private String creationTime; 
            private String DBInstanceCPU; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private Integer DBInstanceStorage; 
            private String DBInstanceType; 
            private Integer DBMaxQuantity; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String exportKey; 
            private String guardDBInstanceId; 
            private String incrementSourceDBInstanceId; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String masterInstanceId; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String payType; 
            private String port; 
            private String readDelayTime; 
            private String regionId; 
            private String securityIPList; 
            private SlaveZones slaveZones; 
            private String supportUpgradeAccountType; 
            private String tags; 
            private String tempDBInstanceId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The maximum number of accounts.
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * The type of the account.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The service availability of the instance in percentage.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * The category of the instance.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The connection mode of the instance. Valid values:
             * <p>
             * 
             * *   **Performance**: standard mode.
             * *   **Safety**: safe mode.
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * The internal endpoint of the instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of CPU cores.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * The instance family.
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The memory capacity of the instance. Unit: MB.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **Internet**: Internet
             * *   **Intranet**: internal network
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * The status of the instance.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage capacity of the instance. Unit: GB.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The type of the instance. Valid values:
             * <p>
             * 
             * *   **Primary**: primary instance
             * *   **Readonly**: read-only instance
             * *   **Guard**: disaster recovery instance
             * *   **Temp**: temporary instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The maximum number of databases that can be created on the instance.
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The engine version of the instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * A deprecated parameter. You do not need to configure this parameter.
             */
            public Builder exportKey(String exportKey) {
                this.exportKey = exportKey;
                return this;
            }

            /**
             * The ID of the disaster recovery instance that is attached to the instance.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * The ID of the instance from which incremental data comes. The incremental data of a disaster recovery instance or read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * The network type.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * The lock mode of the instance.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The reason why the instance was locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The maintenance window of the instance. The time is displayed in UTC. Take note that the maintenance window that is displayed in the ApsaraDB RDS console is equal to the value of this parameter plus 8 hours.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The ID of the primary instance.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * The maximum number of I/O requests per second.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * The billing method of the instance.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port that is used to connect to the instance over an internal network.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The latency of data replication from the primary instance to the read-only instance. This parameter is valid for read-only instances.
             */
            public Builder readDelayTime(String readDelayTime) {
                this.readDelayTime = readDelayTime;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The IP address whitelist.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * A deprecated parameter. You do not need to configure this parameter.
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * N/A.
             */
            public Builder supportUpgradeAccountType(String supportUpgradeAccountType) {
                this.supportUpgradeAccountType = supportUpgradeAccountType;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the temporary instance that is attached to the instance.
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstanceAttribute build() {
                return new DBInstanceAttribute(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceAttribute")
        private java.util.List < DBInstanceAttribute> DBInstanceAttribute;

        private Items(Builder builder) {
            this.DBInstanceAttribute = builder.DBInstanceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstanceAttribute
         */
        public java.util.List < DBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

        public static final class Builder {
            private java.util.List < DBInstanceAttribute> DBInstanceAttribute; 

            /**
             * DBInstanceAttribute.
             */
            public Builder DBInstanceAttribute(java.util.List < DBInstanceAttribute> DBInstanceAttribute) {
                this.DBInstanceAttribute = DBInstanceAttribute;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
