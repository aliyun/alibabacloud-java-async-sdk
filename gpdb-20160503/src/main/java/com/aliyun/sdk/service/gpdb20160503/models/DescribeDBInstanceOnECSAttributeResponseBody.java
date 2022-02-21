// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceOnECSAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceOnECSAttributeResponseBody</p>
 */
public class DescribeDBInstanceOnECSAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceOnECSAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceOnECSAttributeResponseBody create() {
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

        public DescribeDBInstanceOnECSAttributeResponseBody build() {
            return new DescribeDBInstanceOnECSAttributeResponseBody(this);
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
        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("CpuCores")
        private Integer cpuCores;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DBInstanceCategory")
        private String DBInstanceCategory;

        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

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

        @NameInMap("InstanceDeployType")
        private String instanceDeployType;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("MasterNodeNum")
        private Integer masterNodeNum;

        @NameInMap("MemorySize")
        private Integer memorySize;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private String port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SegNodeNum")
        private Integer segNodeNum;

        @NameInMap("StorageSize")
        private Integer storageSize;

        @NameInMap("StorageType")
        private String storageType;

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
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.cpuCores = builder.cpuCores;
            this.creationTime = builder.creationTime;
            this.DBInstanceCategory = builder.DBInstanceCategory;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.encryptionKey = builder.encryptionKey;
            this.encryptionType = builder.encryptionType;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.instanceDeployType = builder.instanceDeployType;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.masterNodeNum = builder.masterNodeNum;
            this.memorySize = builder.memorySize;
            this.minorVersion = builder.minorVersion;
            this.payType = builder.payType;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.segNodeNum = builder.segNodeNum;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
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
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
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
         * @return instanceDeployType
         */
        public String getInstanceDeployType() {
            return this.instanceDeployType;
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
         * @return masterNodeNum
         */
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return segNodeNum
         */
        public Integer getSegNodeNum() {
            return this.segNodeNum;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
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
            private String connectionMode; 
            private String connectionString; 
            private Integer cpuCores; 
            private String creationTime; 
            private String DBInstanceCategory; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String encryptionKey; 
            private String encryptionType; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String instanceDeployType; 
            private String instanceNetworkType; 
            private String lockMode; 
            private Integer masterNodeNum; 
            private Integer memorySize; 
            private String minorVersion; 
            private String payType; 
            private String port; 
            private String regionId; 
            private Integer segNodeNum; 
            private Integer storageSize; 
            private String storageType; 
            private Boolean supportRestore; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

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
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
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
             * InstanceDeployType.
             */
            public Builder instanceDeployType(String instanceDeployType) {
                this.instanceDeployType = instanceDeployType;
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
             * MasterNodeNum.
             */
            public Builder masterNodeNum(Integer masterNodeNum) {
                this.masterNodeNum = masterNodeNum;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
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
