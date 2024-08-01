// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    private DBInstances DBInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBInstancesResponseBody(Builder builder) {
        this.DBInstances = builder.DBInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstances
     */
    public DBInstances getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DBInstances DBInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the instance.
         */
        public Builder DBInstances(DBInstances DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of instances in the query results.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    public static class MongosAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private MongosAttribute(Builder builder) {
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MongosAttribute create() {
            return builder().build();
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String nodeClass; 
            private String nodeDescription; 
            private String nodeId; 

            /**
             * The instance type of the mongos node.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * The description of the mongos node.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * The ID of the mongos node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public MongosAttribute build() {
                return new MongosAttribute(this);
            } 

        } 

    }
    public static class MongosList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MongosAttribute")
        private java.util.List < MongosAttribute> mongosAttribute;

        private MongosList(Builder builder) {
            this.mongosAttribute = builder.mongosAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MongosList create() {
            return builder().build();
        }

        /**
         * @return mongosAttribute
         */
        public java.util.List < MongosAttribute> getMongosAttribute() {
            return this.mongosAttribute;
        }

        public static final class Builder {
            private java.util.List < MongosAttribute> mongosAttribute; 

            /**
             * MongosAttribute.
             */
            public Builder mongosAttribute(java.util.List < MongosAttribute> mongosAttribute) {
                this.mongosAttribute = mongosAttribute;
                return this;
            }

            public MongosList build() {
                return new MongosList(this);
            } 

        } 

    }
    public static class ShardAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeStorage")
        private Integer nodeStorage;

        @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
        private Integer readonlyReplicas;

        private ShardAttribute(Builder builder) {
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
            this.nodeStorage = builder.nodeStorage;
            this.readonlyReplicas = builder.readonlyReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardAttribute create() {
            return builder().build();
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeStorage
         */
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        /**
         * @return readonlyReplicas
         */
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public static final class Builder {
            private String nodeClass; 
            private String nodeDescription; 
            private String nodeId; 
            private Integer nodeStorage; 
            private Integer readonlyReplicas; 

            /**
             * The instance type of the shard node.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * The description of the shard node.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * The ID of the shard node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The storage capacity of the shard node. Unit: GB.
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
                return this;
            }

            /**
             * The number of read-only nodes in the shard node. Valid values: **0** to **5**.
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            public ShardAttribute build() {
                return new ShardAttribute(this);
            } 

        } 

    }
    public static class ShardList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardAttribute")
        private java.util.List < ShardAttribute> shardAttribute;

        private ShardList(Builder builder) {
            this.shardAttribute = builder.shardAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardList create() {
            return builder().build();
        }

        /**
         * @return shardAttribute
         */
        public java.util.List < ShardAttribute> getShardAttribute() {
            return this.shardAttribute;
        }

        public static final class Builder {
            private java.util.List < ShardAttribute> shardAttribute; 

            /**
             * ShardAttribute.
             */
            public Builder shardAttribute(java.util.List < ShardAttribute> shardAttribute) {
                this.shardAttribute = shardAttribute;
                return this;
            }

            public ShardList build() {
                return new ShardList(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
        @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicy")
        private Integer backupRetentionPolicy;

        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private String capacityUnit;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DestroyTime")
        private String destroyTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("HiddenZoneId")
        private String hiddenZoneId;

        @com.aliyun.core.annotation.NameInMap("KindCode")
        private String kindCode;

        @com.aliyun.core.annotation.NameInMap("LastDowngradeTime")
        private String lastDowngradeTime;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MongosList")
        private MongosList mongosList;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
        private String replicationFactor;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("ShardList")
        private ShardList shardList;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcAuthMode")
        private String vpcAuthMode;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.backupRetentionPolicy = builder.backupRetentionPolicy;
            this.capacityUnit = builder.capacityUnit;
            this.chargeType = builder.chargeType;
            this.creationTime = builder.creationTime;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceType = builder.DBInstanceType;
            this.destroyTime = builder.destroyTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.hiddenZoneId = builder.hiddenZoneId;
            this.kindCode = builder.kindCode;
            this.lastDowngradeTime = builder.lastDowngradeTime;
            this.lockMode = builder.lockMode;
            this.mongosList = builder.mongosList;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.releaseTime = builder.releaseTime;
            this.replicationFactor = builder.replicationFactor;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.shardList = builder.shardList;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.vpcAuthMode = builder.vpcAuthMode;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return backupRetentionPolicy
         */
        public Integer getBackupRetentionPolicy() {
            return this.backupRetentionPolicy;
        }

        /**
         * @return capacityUnit
         */
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return destroyTime
         */
        public String getDestroyTime() {
            return this.destroyTime;
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
         * @return hiddenZoneId
         */
        public String getHiddenZoneId() {
            return this.hiddenZoneId;
        }

        /**
         * @return kindCode
         */
        public String getKindCode() {
            return this.kindCode;
        }

        /**
         * @return lastDowngradeTime
         */
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return mongosList
         */
        public MongosList getMongosList() {
            return this.mongosList;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return replicationFactor
         */
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondaryZoneId
         */
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        /**
         * @return shardList
         */
        public ShardList getShardList() {
            return this.shardList;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcAuthMode
         */
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer backupRetentionPolicy; 
            private String capacityUnit; 
            private String chargeType; 
            private String creationTime; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private Integer DBInstanceStorage; 
            private String DBInstanceType; 
            private String destroyTime; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String hiddenZoneId; 
            private String kindCode; 
            private String lastDowngradeTime; 
            private String lockMode; 
            private MongosList mongosList; 
            private String networkType; 
            private String regionId; 
            private String releaseTime; 
            private String replicationFactor; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private ShardList shardList; 
            private String storageType; 
            private Tags tags; 
            private String vpcAuthMode; 
            private String zoneId; 

            /**
             * The backup retention policy configured for the instance. Valid values:
             * <p>
             * 
             * *   **0**: All backup sets of the instance are immediately deleted when the instance is released.
             * *   **1**: A backup set of the instance is automatically backed up and retained for a long period of time when the instance is released.
             * *   **2**: All backup sets of the instance are automatically backed up and retained for a long period of time when the instance is released.
             */
            public Builder backupRetentionPolicy(Integer backupRetentionPolicy) {
                this.backupRetentionPolicy = backupRetentionPolicy;
                return this;
            }

            /**
             * The I/O throughput consumed by the instance.
             * <p>
             * 
             * >  This parameter is required only when the instance is a serverless instance.
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid:** pay-as-you-go
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The status of the instance. For more information, see [Instance states](~~63870~~).
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage capacity of the instance.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The architecture of the instance.
             * <p>
             * 
             * *   **sharding**: sharded cluster instance
             * *   **replicate**: replica set or standalone instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The time when the instance data is destroyed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * > *   For a subscription instance, the computing resources of the instance are released on the 16th day after expiration, and the data of the instance is retained for seven days. The data is deleted on the 23th day after expiration and cannot be restored.
             * > *   For a pay-as-you-go instance, the computing resources of the instance are released on the 16th day after the payment becomes overdue, and the data of the instance is retained for seven days. The data is deleted on the 23th day after the payment becomes overdue and cannot be restored.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * The engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance. Valid values:
             * <p>
             * 
             * *   **7.0**
             * *   **6.0**
             * *   **5.0**
             * *   **4.4**
             * *   **4.2**
             * *   **4.0**
             * *   **3.4**
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The secondary zone 2 of the instance in the multi-zone deployment. Valid values:
             * <p>
             * 
             * *   **cn-hangzhou-g**: Hangzhou Zone G
             * *   **cn-hangzhou-h**: Hangzhou Zone H
             * *   **cn-hangzhou-i**: Hangzhou Zone I
             * *   **cn-hongkong-b**: Hong Kong Zone B
             * *   **cn-hongkong-c**: Hong Kong Zone C
             * *   **cn-hongkong-d**: Hong Kong Zone D
             * *   **cn-wulanchabu-a**: Ulanqab Zone A
             * *   **cn-wulanchabu-b**: Ulanqab Zone B
             * *   **cn-wulanchabu-c**: Ulanqab Zone C
             * *   **ap-southeast-1a**: Singapore Zone A
             * *   **ap-southeast-1b**: Singapore Zone B
             * *   **ap-southeast-1c**: Singapore Zone C
             * *   **ap-southeast-5a**: Jakarta Zone A
             * *   **ap-southeast-5b**: Jakarta Zone B
             * *   **ap-southeast-5c**: Jakarta Zone C
             * *   **eu-central-1a**: Frankfurt Zone A
             * *   **eu-central-1b**: Frankfurt Zone B
             * *   **eu-central-1c**: Frankfurt Zone C
             * 
             * > *   This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.
             * > *   This parameter is returned only if you use the China site (aliyun.com).
             */
            public Builder hiddenZoneId(String hiddenZoneId) {
                this.hiddenZoneId = hiddenZoneId;
                return this;
            }

            /**
             * The kind code of the instance. Valid values:
             * <p>
             * 
             * *   **0**: physical machine
             * *   **1**: Elastic Compute Service (ECS) instance
             * *   **2**: Docker cluster
             * *   **18**: Kubernetes cluster
             */
            public Builder kindCode(String kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * The date when the last downgrade operation was performed.
             */
            public Builder lastDowngradeTime(String lastDowngradeTime) {
                this.lastDowngradeTime = lastDowngradeTime;
                return this;
            }

            /**
             * The lock status of the instance. Valid values:
             * <p>
             * 
             * *   **Unlock**: The cluster is unlocked.
             * *   **ManualLock**: The instance is manually locked.
             * *   **LockByExpiration**: The instance is automatically locked due to instance expiration.
             * *   **LockByRestoration**: The instance is automatically locked before it is rolled back.
             * *   **LockByDiskQuota**: The instance is automatically locked after the storage space is exhausted.
             * *   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The details of the mongos node.
             * <p>
             * 
             * >  This parameter is returned if the instance is a sharded cluster instance.
             */
            public Builder mongosList(MongosList mongosList) {
                this.mongosList = mongosList;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **Classic**: classic network
             * *   **VPC**: VPC
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the instance was released.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The number of nodes in the instance.
             * <p>
             * 
             * >  This parameter is returned if the instance is a replica set instance.
             */
            public Builder replicationFactor(String replicationFactor) {
                this.replicationFactor = replicationFactor;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The secondary zone 1 of the instance in the multi-zone deployment. Valid values:
             * <p>
             * 
             * *   **cn-hangzhou-g**: Hangzhou Zone G
             * *   **cn-hangzhou-h**: Hangzhou Zone H
             * *   **cn-hangzhou-i**: Hangzhou Zone I
             * *   **cn-hongkong-b**: Hong Kong Zone B
             * *   **cn-hongkong-c**: Hong Kong Zone C
             * *   **cn-hongkong-d**: Hong Kong Zone D
             * *   **cn-wulanchabu-a**: Ulanqab Zone A
             * *   **cn-wulanchabu-b**: Ulanqab Zone B
             * *   **cn-wulanchabu-c**: Ulanqab Zone C
             * *   **ap-southeast-1a**: Singapore Zone A
             * *   **ap-southeast-1b**: Singapore Zone B
             * *   **ap-southeast-1c**: Singapore Zone C
             * *   **ap-southeast-5a**: Jakarta Zone A
             * *   **ap-southeast-5b**: Jakarta Zone B
             * *   **ap-southeast-5c**: Jakarta Zone C
             * *   **eu-central-1a**: Frankfurt Zone A
             * *   **eu-central-1b**: Frankfurt Zone B
             * *   **eu-central-1c**: Frankfurt Zone C
             * 
             * > *   This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.
             * > *   This parameter is returned only if you use the China site (aliyun.com).
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * The details of the shard node.
             * <p>
             * 
             * >  This parameter is returned if the instance is a sharded cluster instance.
             */
            public Builder shardList(ShardList shardList) {
                this.shardList = shardList;
                return this;
            }

            /**
             * The storage type of the instance. Valid values:
             * <p>
             * 
             * *   **cloud_essd**: Enterprise SSD (ESSD)
             * *   **local_ssd**: local SSD
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The details of the tag.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether password-free access over virtual private cloud (VPC) is enabled. Valid values:
             * <p>
             * 
             * *   **Open**: Password-free access over VPC is enabled.
             * *   **Close**: Password-free access over VPC is disabled.
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * The zone ID of the instance.
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
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List < DBInstance> DBInstance;

        private DBInstances(Builder builder) {
            this.DBInstance = builder.DBInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
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

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
