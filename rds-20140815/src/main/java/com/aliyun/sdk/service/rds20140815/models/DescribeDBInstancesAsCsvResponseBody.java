// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>An array that consists of the fields in <strong>DBInstanceAttribute</strong>.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A444291****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstancesAsCsvResponseBody build() {
            return new DescribeDBInstancesAsCsvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesAsCsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesAsCsvResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDBInstancesAsCsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesAsCsvResponseBody</p>
     */
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
             * <p>The maximum number of accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * <p>The type of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>super</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The service availability of the instance in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * <p>The category of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The connection mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Performance</strong>: standard mode.</li>
             * <li><strong>Safety</strong>: enhanced mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Performance</p>
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2011-05-30T12:11:04Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mys2.small</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The instance family.</p>
             * 
             * <strong>example:</strong>
             * <p>s</p>
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The memory capacity of the instance. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong></li>
             * <li><strong>Intranet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong>: primary instance</li>
             * <li><strong>ReadOnly</strong>: read-only instance</li>
             * <li><strong>Guard</strong>: disaster recovery instance</li>
             * <li><strong>Temp</strong>: temporary instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The maximum number of databases that can be created on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-27T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>A deprecated parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder exportKey(String exportKey) {
                this.exportKey = exportKey;
                return this;
            }

            /**
             * <p>The ID of the disaster recovery instance that is attached to the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsuxxxxxxxxxx</p>
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * <p>The ID of the instance from which incremental data comes. The incremental data of a disaster recovery instance comes from its primary instance. The incremental data of a read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * <p>The lock mode of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the instance was locked.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_expired</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The maintenance window of the instance. The time follows the ISO 8601 standard and is displayed in UTC. In the ApsaraDB RDS console, the maintenance window is displayed in UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00Z-02:00Z</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The primary instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum number of I/O requests per second.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The port that is used to connect to the instance over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The latency of data replication from the primary instance to the read-only instance. This parameter is valid for read-only instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder readDelayTime(String readDelayTime) {
                this.readDelayTime = readDelayTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>42.xx.xx.xx</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>A deprecated parameter. You do not need to specify this parameter.</p>
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * <p>N/A.</p>
             * 
             * <strong>example:</strong>
             * <p>No</p>
             */
            public Builder supportUpgradeAccountType(String supportUpgradeAccountType) {
                this.supportUpgradeAccountType = supportUpgradeAccountType;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the temporary instance that is attached to the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsuxxxxxxxxxx</p>
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6adz52c2pxxxxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6f7l4fg90xxxxxxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
    /**
     * 
     * {@link DescribeDBInstancesAsCsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesAsCsvResponseBody</p>
     */
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
