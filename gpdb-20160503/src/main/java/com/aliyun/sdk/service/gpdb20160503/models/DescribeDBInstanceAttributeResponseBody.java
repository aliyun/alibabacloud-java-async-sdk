// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DBInstanceAttribute extends TeaModel {
        @NameInMap("AvailabilityValue")
        private String availabilityValue;

        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("CpuCores")
        private Integer cpuCores;

        @NameInMap("CpuCoresPerNode")
        private Integer cpuCoresPerNode;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DBInstanceCategory")
        private String DBInstanceCategory;

        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @NameInMap("DBInstanceCpuCores")
        private Integer DBInstanceCpuCores;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceDiskMBPS")
        private Long DBInstanceDiskMBPS;

        @NameInMap("DBInstanceGroupCount")
        private String DBInstanceGroupCount;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @NameInMap("DBInstanceMode")
        private String DBInstanceMode;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @NameInMap("EncryptionKey")
        private String encryptionKey;

        @NameInMap("EncryptionType")
        private String encryptionType;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("HostType")
        private String hostType;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("MasterNodeNum")
        private Integer masterNodeNum;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MemoryPerNode")
        private Integer memoryPerNode;

        @NameInMap("MemorySize")
        private Long memorySize;

        @NameInMap("MemoryUnit")
        private String memoryUnit;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private String port;

        @NameInMap("ReadDelayTime")
        private String readDelayTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("SegNodeNum")
        private Integer segNodeNum;

        @NameInMap("SegmentCounts")
        private Integer segmentCounts;

        @NameInMap("StoragePerNode")
        private Integer storagePerNode;

        @NameInMap("StorageSize")
        private Long storageSize;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("StorageUnit")
        private String storageUnit;

        @NameInMap("SupportRestore")
        private Boolean supportRestore;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstanceAttribute(Builder builder) {
            this.availabilityValue = builder.availabilityValue;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.cpuCores = builder.cpuCores;
            this.cpuCoresPerNode = builder.cpuCoresPerNode;
            this.creationTime = builder.creationTime;
            this.DBInstanceCategory = builder.DBInstanceCategory;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.DBInstanceCpuCores = builder.DBInstanceCpuCores;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceDiskMBPS = builder.DBInstanceDiskMBPS;
            this.DBInstanceGroupCount = builder.DBInstanceGroupCount;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceMode = builder.DBInstanceMode;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.encryptionKey = builder.encryptionKey;
            this.encryptionType = builder.encryptionType;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.hostType = builder.hostType;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.masterNodeNum = builder.masterNodeNum;
            this.maxConnections = builder.maxConnections;
            this.memoryPerNode = builder.memoryPerNode;
            this.memorySize = builder.memorySize;
            this.memoryUnit = builder.memoryUnit;
            this.minorVersion = builder.minorVersion;
            this.payType = builder.payType;
            this.port = builder.port;
            this.readDelayTime = builder.readDelayTime;
            this.regionId = builder.regionId;
            this.securityIPList = builder.securityIPList;
            this.segNodeNum = builder.segNodeNum;
            this.segmentCounts = builder.segmentCounts;
            this.storagePerNode = builder.storagePerNode;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.storageUnit = builder.storageUnit;
            this.supportRestore = builder.supportRestore;
            this.tags = builder.tags;
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
         * @return availabilityValue
         */
        public String getAvailabilityValue() {
            return this.availabilityValue;
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
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cpuCoresPerNode
         */
        public Integer getCpuCoresPerNode() {
            return this.cpuCoresPerNode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBInstanceCategory
         */
        public String getDBInstanceCategory() {
            return this.DBInstanceCategory;
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
         * @return DBInstanceCpuCores
         */
        public Integer getDBInstanceCpuCores() {
            return this.DBInstanceCpuCores;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceDiskMBPS
         */
        public Long getDBInstanceDiskMBPS() {
            return this.DBInstanceDiskMBPS;
        }

        /**
         * @return DBInstanceGroupCount
         */
        public String getDBInstanceGroupCount() {
            return this.DBInstanceGroupCount;
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
         * @return DBInstanceMode
         */
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
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
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return encryptionKey
         */
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
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
         * @return hostType
         */
        public String getHostType() {
            return this.hostType;
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
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return masterNodeNum
         */
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return memoryPerNode
         */
        public Integer getMemoryPerNode() {
            return this.memoryPerNode;
        }

        /**
         * @return memorySize
         */
        public Long getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return memoryUnit
         */
        public String getMemoryUnit() {
            return this.memoryUnit;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
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
         * @return segNodeNum
         */
        public Integer getSegNodeNum() {
            return this.segNodeNum;
        }

        /**
         * @return segmentCounts
         */
        public Integer getSegmentCounts() {
            return this.segmentCounts;
        }

        /**
         * @return storagePerNode
         */
        public Integer getStoragePerNode() {
            return this.storagePerNode;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return storageUnit
         */
        public String getStorageUnit() {
            return this.storageUnit;
        }

        /**
         * @return supportRestore
         */
        public Boolean getSupportRestore() {
            return this.supportRestore;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private String availabilityValue; 
            private String connectionMode; 
            private String connectionString; 
            private Integer cpuCores; 
            private Integer cpuCoresPerNode; 
            private String creationTime; 
            private String DBInstanceCategory; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private Integer DBInstanceCpuCores; 
            private String DBInstanceDescription; 
            private Long DBInstanceDiskMBPS; 
            private String DBInstanceGroupCount; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceMode; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private Long DBInstanceStorage; 
            private String encryptionKey; 
            private String encryptionType; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String hostType; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer masterNodeNum; 
            private Integer maxConnections; 
            private Integer memoryPerNode; 
            private Long memorySize; 
            private String memoryUnit; 
            private String minorVersion; 
            private String payType; 
            private String port; 
            private String readDelayTime; 
            private String regionId; 
            private String securityIPList; 
            private Integer segNodeNum; 
            private Integer segmentCounts; 
            private Integer storagePerNode; 
            private Long storageSize; 
            private String storageType; 
            private String storageUnit; 
            private Boolean supportRestore; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AvailabilityValue.
             */
            public Builder availabilityValue(String availabilityValue) {
                this.availabilityValue = availabilityValue;
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
             * CpuCores.
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * CpuCoresPerNode.
             */
            public Builder cpuCoresPerNode(Integer cpuCoresPerNode) {
                this.cpuCoresPerNode = cpuCoresPerNode;
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
             * DBInstanceCategory.
             */
            public Builder DBInstanceCategory(String DBInstanceCategory) {
                this.DBInstanceCategory = DBInstanceCategory;
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
             * DBInstanceCpuCores.
             */
            public Builder DBInstanceCpuCores(Integer DBInstanceCpuCores) {
                this.DBInstanceCpuCores = DBInstanceCpuCores;
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
             * DBInstanceDiskMBPS.
             */
            public Builder DBInstanceDiskMBPS(Long DBInstanceDiskMBPS) {
                this.DBInstanceDiskMBPS = DBInstanceDiskMBPS;
                return this;
            }

            /**
             * DBInstanceGroupCount.
             */
            public Builder DBInstanceGroupCount(String DBInstanceGroupCount) {
                this.DBInstanceGroupCount = DBInstanceGroupCount;
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
             * DBInstanceMode.
             */
            public Builder DBInstanceMode(String DBInstanceMode) {
                this.DBInstanceMode = DBInstanceMode;
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
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * EncryptionKey.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
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
             * HostType.
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
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
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * MasterNodeNum.
             */
            public Builder masterNodeNum(Integer masterNodeNum) {
                this.masterNodeNum = masterNodeNum;
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
             * MemoryPerNode.
             */
            public Builder memoryPerNode(Integer memoryPerNode) {
                this.memoryPerNode = memoryPerNode;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Long memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * MemoryUnit.
             */
            public Builder memoryUnit(String memoryUnit) {
                this.memoryUnit = memoryUnit;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
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
             * ReadDelayTime.
             */
            public Builder readDelayTime(String readDelayTime) {
                this.readDelayTime = readDelayTime;
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
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * SegNodeNum.
             */
            public Builder segNodeNum(Integer segNodeNum) {
                this.segNodeNum = segNodeNum;
                return this;
            }

            /**
             * SegmentCounts.
             */
            public Builder segmentCounts(Integer segmentCounts) {
                this.segmentCounts = segmentCounts;
                return this;
            }

            /**
             * StoragePerNode.
             */
            public Builder storagePerNode(Integer storagePerNode) {
                this.storagePerNode = storagePerNode;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * StorageUnit.
             */
            public Builder storageUnit(String storageUnit) {
                this.storageUnit = storageUnit;
                return this;
            }

            /**
             * SupportRestore.
             */
            public Builder supportRestore(Boolean supportRestore) {
                this.supportRestore = supportRestore;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
