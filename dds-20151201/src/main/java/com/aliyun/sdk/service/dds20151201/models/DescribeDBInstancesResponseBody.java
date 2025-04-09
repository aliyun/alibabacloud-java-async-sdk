// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstancesResponseBody model) {
            this.DBInstances = model.DBInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the instance.</p>
         */
        public Builder DBInstances(DBInstances DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0E4FE33F-5510-5758-8FA7-A6672CDE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of instances in the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(MongosAttribute model) {
                this.nodeClass = model.nodeClass;
                this.nodeDescription = model.nodeDescription;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The instance type of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.mongos.standard</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The description of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>testmongosnode</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The ID of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp10e3b0d02f****</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class MongosList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MongosAttribute")
        private java.util.List<MongosAttribute> mongosAttribute;

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
        public java.util.List<MongosAttribute> getMongosAttribute() {
            return this.mongosAttribute;
        }

        public static final class Builder {
            private java.util.List<MongosAttribute> mongosAttribute; 

            private Builder() {
            } 

            private Builder(MongosList model) {
                this.mongosAttribute = model.mongosAttribute;
            } 

            /**
             * MongosAttribute.
             */
            public Builder mongosAttribute(java.util.List<MongosAttribute> mongosAttribute) {
                this.mongosAttribute = mongosAttribute;
                return this;
            }

            public MongosList build() {
                return new MongosList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ShardAttribute model) {
                this.nodeClass = model.nodeClass;
                this.nodeDescription = model.nodeDescription;
                this.nodeId = model.nodeId;
                this.nodeStorage = model.nodeStorage;
                this.readonlyReplicas = model.readonlyReplicas;
            } 

            /**
             * <p>The instance type of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.shard.mid</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The description of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>testshardnode</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The ID of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1cac6f2083****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The storage capacity of the shard node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
                return this;
            }

            /**
             * <p>The number of read-only nodes in the shard node. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class ShardList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardAttribute")
        private java.util.List<ShardAttribute> shardAttribute;

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
        public java.util.List<ShardAttribute> getShardAttribute() {
            return this.shardAttribute;
        }

        public static final class Builder {
            private java.util.List<ShardAttribute> shardAttribute; 

            private Builder() {
            } 

            private Builder(ShardList model) {
                this.shardAttribute = model.shardAttribute;
            } 

            /**
             * ShardAttribute.
             */
            public Builder shardAttribute(java.util.List<ShardAttribute> shardAttribute) {
                this.shardAttribute = shardAttribute;
                return this;
            }

            public ShardList build() {
                return new ShardList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.backupRetentionPolicy = model.backupRetentionPolicy;
                this.capacityUnit = model.capacityUnit;
                this.chargeType = model.chargeType;
                this.creationTime = model.creationTime;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.DBInstanceType = model.DBInstanceType;
                this.destroyTime = model.destroyTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.hiddenZoneId = model.hiddenZoneId;
                this.kindCode = model.kindCode;
                this.lastDowngradeTime = model.lastDowngradeTime;
                this.lockMode = model.lockMode;
                this.mongosList = model.mongosList;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.releaseTime = model.releaseTime;
                this.replicationFactor = model.replicationFactor;
                this.resourceGroupId = model.resourceGroupId;
                this.secondaryZoneId = model.secondaryZoneId;
                this.shardList = model.shardList;
                this.storageType = model.storageType;
                this.tags = model.tags;
                this.vpcAuthMode = model.vpcAuthMode;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The backup retention policy configured for the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: All backup sets of the instance are immediately deleted when the instance is released.</li>
             * <li><strong>1</strong>: A backup set of the instance is automatically backed up and retained for a long period of time when the instance is released.</li>
             * <li><strong>2</strong>: All backup sets of the instance are automatically backed up and retained for a long period of time when the instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backupRetentionPolicy(Integer backupRetentionPolicy) {
                this.backupRetentionPolicy = backupRetentionPolicy;
                return this;
            }

            /**
             * <p>The I/O throughput consumed by the instance.</p>
             * <blockquote>
             * <p> This parameter is required only when the instance is a serverless instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid:</strong> pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-25T02:18:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.mongo.mid</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test database</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp18b0934e70****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The architecture of the instance.</p>
             * <ul>
             * <li><strong>sharding</strong>: sharded cluster instance</li>
             * <li><strong>replicate</strong>: replica set or standalone instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sharding</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The time when the instance data is destroyed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <ul>
             * <li>For a subscription instance, the computing resources of the instance are released on the 16th day after expiration, and the data of the instance is retained for seven days. The data is deleted on the 23th day after expiration and cannot be restored.</li>
             * <li>For a pay-as-you-go instance, the computing resources of the instance are released on the 16th day after the payment becomes overdue, and the data of the instance is retained for seven days. The data is deleted on the 23th day after the payment becomes overdue and cannot be restored.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-12-10T16:00:00Z</p>
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * <p>The engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MongoDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>7.0</strong></li>
             * <li><strong>6.0</strong></li>
             * <li><strong>5.0</strong></li>
             * <li><strong>4.4</strong></li>
             * <li><strong>4.2</strong></li>
             * <li><strong>4.0</strong></li>
             * <li><strong>3.4</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4.2</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-25T16:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The secondary zone 2 of the instance in the multi-zone deployment. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
             * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
             * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
             * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
             * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
             * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
             * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
             * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
             * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
             * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
             * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
             * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
             * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
             * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
             * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
             * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
             * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
             * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.</li>
             * <li>This parameter is returned only if you use the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder hiddenZoneId(String hiddenZoneId) {
                this.hiddenZoneId = hiddenZoneId;
                return this;
            }

            /**
             * <p>The kind code of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: physical machine</li>
             * <li><strong>1</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>2</strong>: Docker cluster</li>
             * <li><strong>18</strong>: Kubernetes cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder kindCode(String kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * <p>The date when the last downgrade operation was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-08</p>
             */
            public Builder lastDowngradeTime(String lastDowngradeTime) {
                this.lastDowngradeTime = lastDowngradeTime;
                return this;
            }

            /**
             * <p>The lock status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The cluster is unlocked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before it is rolled back.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked after the storage space is exhausted.</li>
             * <li><strong>Released</strong>: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The details of the mongos node.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             */
            public Builder mongosList(MongosList mongosList) {
                this.mongosList = mongosList;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong>: classic network</li>
             * <li><strong>VPC</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Classic</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the instance was released.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-17T07:01Z</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The number of nodes in the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a replica set instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder replicationFactor(String replicationFactor) {
                this.replicationFactor = replicationFactor;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyiu4ekp****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The secondary zone 1 of the instance in the multi-zone deployment. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
             * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
             * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
             * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
             * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
             * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
             * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
             * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
             * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
             * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
             * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
             * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
             * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
             * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
             * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
             * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
             * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
             * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.</li>
             * <li>This parameter is returned only if you use the China site (aliyun.com).</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * <p>The details of the shard node.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             */
            public Builder shardList(ShardList shardList) {
                this.shardList = shardList;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cloud_essd</strong>: Enterprise SSD (ESSD)</li>
             * <li><strong>local_ssd</strong>: local SSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The details of the tag.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether password-free access over virtual private cloud (VPC) is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Open</strong>: Password-free access over VPC is enabled.</li>
             * <li><strong>Close</strong>: Password-free access over VPC is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Close</p>
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List<DBInstance> DBInstance;

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
        public java.util.List<DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List<DBInstance> DBInstance; 

            private Builder() {
            } 

            private Builder(DBInstances model) {
                this.DBInstance = model.DBInstance;
            } 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List<DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
