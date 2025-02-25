// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

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
    public static class DBInstance extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CurrentMinorVersion")
        private String currentMinorVersion;

        @NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        private Long DBInstanceMemory;

        @NameInMap("DBInstanceNetworkType")
        private String DBInstanceNetworkType;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodeCount")
        private Long DBNodeCount;

        @NameInMap("DBNodeStorage")
        private Long DBNodeStorage;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Expired")
        private String expired;

        @NameInMap("LatestMinorVersion")
        private String latestMinorVersion;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private String port;

        @NameInMap("PublicConnectionString")
        private String publicConnectionString;

        @NameInMap("PublicPort")
        private Integer publicPort;

        @NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.category = builder.category;
            this.connectionString = builder.connectionString;
            this.creationTime = builder.creationTime;
            this.currentMinorVersion = builder.currentMinorVersion;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceNetworkType = builder.DBInstanceNetworkType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodeStorage = builder.DBNodeStorage;
            this.DBVersion = builder.DBVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.latestMinorVersion = builder.latestMinorVersion;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.masterInstanceId = builder.masterInstanceId;
            this.payType = builder.payType;
            this.port = builder.port;
            this.publicConnectionString = builder.publicConnectionString;
            this.publicPort = builder.publicPort;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return currentMinorVersion
         */
        public String getCurrentMinorVersion() {
            return this.currentMinorVersion;
        }

        /**
         * @return DBInstanceCPU
         */
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
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
         * @return DBInstanceNetworkType
         */
        public String getDBInstanceNetworkType() {
            return this.DBInstanceNetworkType;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
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
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeCount
         */
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        /**
         * @return DBNodeStorage
         */
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return latestMinorVersion
         */
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
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
         * @return publicConnectionString
         */
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        /**
         * @return publicPort
         */
        public Integer getPublicPort() {
            return this.publicPort;
        }

        /**
         * @return readOnlyDBInstanceIds
         */
        public ReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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
            private String category; 
            private String connectionString; 
            private String creationTime; 
            private String currentMinorVersion; 
            private String DBInstanceCPU; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Long DBInstanceMemory; 
            private String DBInstanceNetworkType; 
            private String DBInstanceStatus; 
            private String DBInstanceStorageType; 
            private String DBInstanceType; 
            private String DBNodeClass; 
            private Long DBNodeCount; 
            private Long DBNodeStorage; 
            private String DBVersion; 
            private String expireTime; 
            private String expired; 
            private String latestMinorVersion; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String masterInstanceId; 
            private String payType; 
            private String port; 
            private String publicConnectionString; 
            private Integer publicPort; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String regionId; 
            private String resourceGroupId; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CurrentMinorVersion.
             */
            public Builder currentMinorVersion(String currentMinorVersion) {
                this.currentMinorVersion = currentMinorVersion;
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
             * DBInstanceNetworkType.
             */
            public Builder DBInstanceNetworkType(String DBInstanceNetworkType) {
                this.DBInstanceNetworkType = DBInstanceNetworkType;
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
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeCount.
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * DBNodeStorage.
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
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
             * Expired.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * LatestMinorVersion.
             */
            public Builder latestMinorVersion(String latestMinorVersion) {
                this.latestMinorVersion = latestMinorVersion;
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
             * PublicConnectionString.
             */
            public Builder publicConnectionString(String publicConnectionString) {
                this.publicConnectionString = publicConnectionString;
                return this;
            }

            /**
             * PublicPort.
             */
            public Builder publicPort(Integer publicPort) {
                this.publicPort = publicPort;
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

            public DBInstance build() {
                return new DBInstance(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("DBInstance")
        private java.util.List < DBInstance> DBInstance;

        private Items(Builder builder) {
            this.DBInstance = builder.DBInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstance
         */
        public java.util.List < DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List < DBInstance> DBInstance; 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List < DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
