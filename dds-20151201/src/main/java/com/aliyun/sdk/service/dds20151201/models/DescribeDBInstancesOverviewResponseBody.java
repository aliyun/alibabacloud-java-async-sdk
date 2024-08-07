// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesOverviewResponseBody</p>
 */
public class DescribeDBInstancesOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    private java.util.List < DBInstances> DBInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeDBInstancesOverviewResponseBody(Builder builder) {
        this.DBInstances = builder.DBInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstances
     */
    public java.util.List < DBInstances> getDBInstances() {
        return this.DBInstances;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DBInstances> DBInstances; 
        private String requestId; 
        private String totalCount; 

        /**
         * The information of instances.
         */
        public Builder DBInstances(java.util.List < DBInstances> DBInstances) {
            this.DBInstances = DBInstances;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstancesOverviewResponseBody build() {
            return new DescribeDBInstancesOverviewResponseBody(this);
        } 

    } 

    public static class MongosList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private MongosList(Builder builder) {
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MongosList create() {
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

            public MongosList build() {
                return new MongosList(this);
            } 

        } 

    }
    public static class ShardList extends TeaModel {
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

        private ShardList(Builder builder) {
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
            this.nodeStorage = builder.nodeStorage;
            this.readonlyReplicas = builder.readonlyReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardList create() {
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
             * The storage space of the shard node. Unit: GB.
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

            public ShardList build() {
                return new ShardList(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key. Valid values of N: **1** to **20**.
             * <p>
             * 
             * *   The key cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             * *   It can be up to 64 characters in length.
             * *   It cannot be an empty string.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. Valid values of N: **1** to **20**.
             * <p>
             * 
             * *   The value cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
             * *   The value can be up to 128 characters in length.
             * *   The value can be an empty string.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DBInstances extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("KindCode")
        private String kindCode;

        @com.aliyun.core.annotation.NameInMap("LastDowngradeTime")
        private String lastDowngradeTime;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MongosList")
        private java.util.List < MongosList> mongosList;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
        private String replicationFactor;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShardList")
        private java.util.List < ShardList> shardList;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcAuthMode")
        private String vpcAuthMode;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstances(Builder builder) {
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
            this.kindCode = builder.kindCode;
            this.lastDowngradeTime = builder.lastDowngradeTime;
            this.lockMode = builder.lockMode;
            this.mongosList = builder.mongosList;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.replicationFactor = builder.replicationFactor;
            this.resourceGroupId = builder.resourceGroupId;
            this.shardList = builder.shardList;
            this.tags = builder.tags;
            this.vpcAuthMode = builder.vpcAuthMode;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
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
        public java.util.List < MongosList> getMongosList() {
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
         * @return shardList
         */
        public java.util.List < ShardList> getShardList() {
            return this.shardList;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
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
            private String kindCode; 
            private String lastDowngradeTime; 
            private String lockMode; 
            private java.util.List < MongosList> mongosList; 
            private String networkType; 
            private String regionId; 
            private String replicationFactor; 
            private String resourceGroupId; 
            private java.util.List < ShardList> shardList; 
            private java.util.List < Tags> tags; 
            private String vpcAuthMode; 
            private String zoneId; 

            /**
             * The read and write throughput consumed by the instance.
             * <p>
             * 
             * > 
             * 
             * *   This parameter is returned when the instance is a serverless instance.
             * 
             * *   Serverless instances are available only in the China site (aliyun.com).
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
             * *   **PostPaid**: pay-as-you-go
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
             * The instance type. The instance type varies based on the instance architecture. For more information about instance types supported by different instance architectures, see the following references:
             * <p>
             * 
             * *   [Standalone instance types](~~311407~~)
             * *   [Replica set instance types](~~311410~~)
             * *   [Sharded cluster instance types](~~311414~~)
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
             * The state of the instance. For more information about valid values, see [Instance states](~~63870~~).
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage space of the instance. Unit: GB.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * The architecture of the instance. Valid values:
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
             * The time when the instance data was destroyed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * The database engine of the instance. Set the value to **MongoDB**.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance.
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
             * Indicates whether the instance is locked. Valid values:
             * <p>
             * 
             * *   **Unlock**: The instance is not locked.
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
             * The details of the mongos nodes.
             * <p>
             * 
             * >  This parameter is returned when the instance is a sharded cluster instance.
             */
            public Builder mongosList(java.util.List < MongosList> mongosList) {
                this.mongosList = mongosList;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **Classic**
             * *   **VPC**
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
             * The number of nodes in the instance.
             * <p>
             * 
             * >  This parameter is returned when the instance is a replica set instance.
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
             * The details of the shard nodes.
             * <p>
             * 
             * >  This parameter is returned when the instance is a sharded cluster instance.
             */
            public Builder shardList(java.util.List < ShardList> shardList) {
                this.shardList = shardList;
                return this;
            }

            /**
             * The tags to add to the instance.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether password-free access over VPC is enabled. Valid values:
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

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
