// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAttributeResponseBody</p>
 */
public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAttributeResponseBody create() {
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    public static class DBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceId")
        private java.util.List < String > DBInstanceId;

        private DBInstanceIds(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public java.util.List < String > getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > DBInstanceId; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(java.util.List < String > DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    public static class Extra extends TeaModel {
        @NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        private Extra(Builder builder) {
            this.DBInstanceIds = builder.DBInstanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public static final class Builder {
            private DBInstanceIds DBInstanceIds; 

            /**
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
    public static class ReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        private ReadOnlyDBInstanceId(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceId create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private String DBInstanceId; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceId build() {
                return new ReadOnlyDBInstanceId(this);
            } 

        } 

    }
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId;

        private ReadOnlyDBInstanceIds(Builder builder) {
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public java.util.List < ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    public static class SlaveZone extends TeaModel {
        @NameInMap("ZoneId")
        private String zoneId;

        private SlaveZone(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZone create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public SlaveZone build() {
                return new SlaveZone(this);
            } 

        } 

    }
    public static class SlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        private java.util.List < SlaveZone> slaveZone;

        private SlaveZones(Builder builder) {
            this.slaveZone = builder.slaveZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaveZones create() {
            return builder().build();
        }

        /**
         * @return slaveZone
         */
        public java.util.List < SlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

        public static final class Builder {
            private java.util.List < SlaveZone> slaveZone; 

            /**
             * SlaveZone.
             */
            public Builder slaveZone(java.util.List < SlaveZone> slaveZone) {
                this.slaveZone = slaveZone;
                return this;
            }

            public SlaveZones build() {
                return new SlaveZones(this);
            } 

        } 

    }
    public static class DBInstanceAttribute extends TeaModel {
        @NameInMap("AccountMaxQuantity")
        private Integer accountMaxQuantity;

        @NameInMap("AdvancedFeatures")
        private String advancedFeatures;

        @NameInMap("AutoUpgradeMinorVersion")
        private String autoUpgradeMinorVersion;

        @NameInMap("AvailabilityValue")
        private String availabilityValue;

        @NameInMap("Category")
        private String category;

        @NameInMap("Collation")
        private String collation;

        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("ConsoleVersion")
        private String consoleVersion;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("DBMaxQuantity")
        private Integer DBMaxQuantity;

        @NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Extra")
        private Extra extra;

        @NameInMap("GeneralGroupName")
        private String generalGroupName;

        @NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @NameInMap("IncrementSourceDBInstanceId")
        private String incrementSourceDBInstanceId;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("LatestKernelVersion")
        private String latestKernelVersion;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @NameInMap("MasterZone")
        private String masterZone;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private String port;

        @NameInMap("ProxyType")
        private Integer proxyType;

        @NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        private String readonlyInstanceSQLDelayedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityIPMode")
        private String securityIPMode;

        @NameInMap("SlaveZones")
        private SlaveZones slaveZones;

        @NameInMap("SuperPermissionMode")
        private String superPermissionMode;

        @NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @NameInMap("TimeZone")
        private String timeZone;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("TipsLevel")
        private Integer tipsLevel;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstanceAttribute(Builder builder) {
            this.accountMaxQuantity = builder.accountMaxQuantity;
            this.advancedFeatures = builder.advancedFeatures;
            this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
            this.availabilityValue = builder.availabilityValue;
            this.category = builder.category;
            this.collation = builder.collation;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.consoleVersion = builder.consoleVersion;
            this.creationTime = builder.creationTime;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBMaxQuantity = builder.DBMaxQuantity;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.extra = builder.extra;
            this.generalGroupName = builder.generalGroupName;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.incrementSourceDBInstanceId = builder.incrementSourceDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.latestKernelVersion = builder.latestKernelVersion;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.masterInstanceId = builder.masterInstanceId;
            this.masterZone = builder.masterZone;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.payType = builder.payType;
            this.port = builder.port;
            this.proxyType = builder.proxyType;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.readonlyInstanceSQLDelayedTime = builder.readonlyInstanceSQLDelayedTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityIPMode = builder.securityIPMode;
            this.slaveZones = builder.slaveZones;
            this.superPermissionMode = builder.superPermissionMode;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.timeZone = builder.timeZone;
            this.tips = builder.tips;
            this.tipsLevel = builder.tipsLevel;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
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
         * @return advancedFeatures
         */
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        /**
         * @return autoUpgradeMinorVersion
         */
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
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
         * @return collation
         */
        public String getCollation() {
            return this.collation;
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
         * @return consoleVersion
         */
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
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
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
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
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
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
         * @return extra
         */
        public Extra getExtra() {
            return this.extra;
        }

        /**
         * @return generalGroupName
         */
        public String getGeneralGroupName() {
            return this.generalGroupName;
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
         * @return latestKernelVersion
         */
        public String getLatestKernelVersion() {
            return this.latestKernelVersion;
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
         * @return masterZone
         */
        public String getMasterZone() {
            return this.masterZone;
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
         * @return proxyType
         */
        public Integer getProxyType() {
            return this.proxyType;
        }

        /**
         * @return readOnlyDBInstanceIds
         */
        public ReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        /**
         * @return readonlyInstanceSQLDelayedTime
         */
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityIPMode
         */
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        /**
         * @return slaveZones
         */
        public SlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        /**
         * @return superPermissionMode
         */
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        /**
         * @return tempDBInstanceId
         */
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return tipsLevel
         */
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
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
            private String advancedFeatures; 
            private String autoUpgradeMinorVersion; 
            private String availabilityValue; 
            private String category; 
            private String collation; 
            private String connectionMode; 
            private String connectionString; 
            private String consoleVersion; 
            private String creationTime; 
            private String currentKernelVersion; 
            private String DBInstanceCPU; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private Integer DBInstanceStorage; 
            private String DBInstanceStorageType; 
            private String DBInstanceType; 
            private Integer DBMaxQuantity; 
            private String dedicatedHostGroupId; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private Extra extra; 
            private String generalGroupName; 
            private String guardDBInstanceId; 
            private String incrementSourceDBInstanceId; 
            private String instanceNetworkType; 
            private String latestKernelVersion; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String masterInstanceId; 
            private String masterZone; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String payType; 
            private String port; 
            private Integer proxyType; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String readonlyInstanceSQLDelayedTime; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityIPMode; 
            private SlaveZones slaveZones; 
            private String superPermissionMode; 
            private String tempDBInstanceId; 
            private String timeZone; 
            private String tips; 
            private Integer tipsLevel; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AccountMaxQuantity.
             */
            public Builder accountMaxQuantity(Integer accountMaxQuantity) {
                this.accountMaxQuantity = accountMaxQuantity;
                return this;
            }

            /**
             * AdvancedFeatures.
             */
            public Builder advancedFeatures(String advancedFeatures) {
                this.advancedFeatures = advancedFeatures;
                return this;
            }

            /**
             * AutoUpgradeMinorVersion.
             */
            public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
                this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
                return this;
            }

            /**
             * AvailabilityValue.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Collation.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * ConnectionMode.
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
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
             * ConsoleVersion.
             */
            public Builder consoleVersion(String consoleVersion) {
                this.consoleVersion = consoleVersion;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * DBInstanceCPU.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceClassType.
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceMemory.
             */
            public Builder DBInstanceMemory(Long DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DBInstanceStorageType.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * DBInstanceType.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * DBMaxQuantity.
             */
            public Builder DBMaxQuantity(Integer DBMaxQuantity) {
                this.DBMaxQuantity = DBMaxQuantity;
                return this;
            }

            /**
             * DedicatedHostGroupId.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(Extra extra) {
                this.extra = extra;
                return this;
            }

            /**
             * GeneralGroupName.
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * GuardDBInstanceId.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * IncrementSourceDBInstanceId.
             */
            public Builder incrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
                this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * LatestKernelVersion.
             */
            public Builder latestKernelVersion(String latestKernelVersion) {
                this.latestKernelVersion = latestKernelVersion;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * MaintainTime.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * MasterInstanceId.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * MasterZone.
             */
            public Builder masterZone(String masterZone) {
                this.masterZone = masterZone;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
             * ProxyType.
             */
            public Builder proxyType(Integer proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * ReadOnlyDBInstanceIds.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * ReadonlyInstanceSQLDelayedTime.
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityIPMode.
             */
            public Builder securityIPMode(String securityIPMode) {
                this.securityIPMode = securityIPMode;
                return this;
            }

            /**
             * SlaveZones.
             */
            public Builder slaveZones(SlaveZones slaveZones) {
                this.slaveZones = slaveZones;
                return this;
            }

            /**
             * SuperPermissionMode.
             */
            public Builder superPermissionMode(String superPermissionMode) {
                this.superPermissionMode = superPermissionMode;
                return this;
            }

            /**
             * TempDBInstanceId.
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * TipsLevel.
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
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
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
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
             * ZoneId.
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
        @NameInMap("DBInstanceAttribute")
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
