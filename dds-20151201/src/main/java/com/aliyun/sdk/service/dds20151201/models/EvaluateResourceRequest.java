// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateResourceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateResourceRequest</p>
 */
public class EvaluateResourceRequest extends Request {
    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicationFactor")
    private String replicationFactor;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ShardsInfo")
    private String shardsInfo;

    @Query
    @NameInMap("Storage")
    private String storage;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private EvaluateResourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.regionId = builder.regionId;
        this.replicationFactor = builder.replicationFactor;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.shardsInfo = builder.shardsInfo;
        this.storage = builder.storage;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return readonlyReplicas
     */
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return shardsInfo
     */
    public String getShardsInfo() {
        return this.shardsInfo;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<EvaluateResourceRequest, Builder> {
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private String engine; 
        private String engineVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String readonlyReplicas; 
        private String regionId; 
        private String replicationFactor; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String shardsInfo; 
        private String storage; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateResourceRequest request) {
            super(request);
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readonlyReplicas = request.readonlyReplicas;
            this.regionId = request.regionId;
            this.replicationFactor = request.replicationFactor;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.shardsInfo = request.shardsInfo;
            this.storage = request.storage;
            this.zoneId = request.zoneId;
        } 

        /**
         * The type of the instance.
         * <p>
         * 
         * > This parameter is required when you check whether resources are sufficient for creating or upgrading a replica set instance. For more information about instance types, see [Instance types](~~57141~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The ID of the instance. This parameter is required when you check whether resources are sufficient for upgrading an instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The database engine of the instance. Set the value to **MongoDB**.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The version of the database engine. Valid values:
         * <p>
         * 
         * *   **7.0**
         * *   **6.0**
         * *   **5.0**
         * *   **4.4**
         * *   **4.2**
         * *   **4.0**
         * 
         * <!---->
         * 
         * *   3.4
         * *   4.0
         * *   4.2
         * *   4.4
         * *   5.0
         * *   6.0
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of read-only nodes in the instance. Valid values: **1** to **5**.
         * <p>
         * 
         * > This parameter is not required for standalone or serverless instances.
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of nodes in the instance.
         * <p>
         * 
         * *   Set the value to **1** for standalone instances.
         * *   Valid values for replica set instances: **3**, **5**, and **7**
         * 
         * > This parameter is not required for serverless instances.
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The node information about the sharded cluster instance. This parameter is required when you check whether resources are sufficient for creating or upgrading a sharded cluster instance.
         * <p>
         * 
         * To check whether resources are sufficient for creating a sharded cluster instance, specify the specifications of each node in the instance. The value must be a JSON string. Example:
         * 
         *     {
         *          "ConfigSvrs":
         *              [{"Storage":20,"DBInstanceClass":"dds.cs.mid"}],
         *          "Mongos":
         *              [{"DBInstanceClass":"dds.mongos.standard"},{"DBInstanceClass":"dds.mongos.standard"}],
         *          "Shards":
         *              [{"Storage":50,"DBInstanceClass":"dds.shard.standard"},{"Storage":50,"DBInstanceClass":"dds.shard.standard"},   {"Storage":50,"DBInstanceClass":"dds.shard.standard"}]
         *      }
         * 
         * Parameters in the example:
         * 
         * *   ConfigSvrs: the Configserver node.
         * *   Mongos: the mongos node.
         * *   Shards: the shard node.
         * *   Storage: the storage space of the node.
         * *   DBInstanceClass: the instance type of the node. For more information, see [Sharded cluster instance types](~~311414~~).
         * 
         * To check whether resources are sufficient for upgrading a single node of a sharded cluster instance, specify only the information about the node to be upgraded. The value must be a JSON string. Example:
         * 
         *     {
         *          "NodeId": "d-bp147c4d9ca7****", "NodeClass": "dds.shard.standard"
         *     } 
         * 
         * Parameters in the example:
         * 
         * *   NodeId: the ID of the node.
         * *   NodeClass: the instance type of the node. For more information, see [Sharded cluster instance types](~~311414~~).
         */
        public Builder shardsInfo(String shardsInfo) {
            this.putQueryParameter("ShardsInfo", shardsInfo);
            this.shardsInfo = shardsInfo;
            return this;
        }

        /**
         * The storage capacity of the replica set instance. Unit: GB.
         * <p>
         * 
         * > This parameter is required for the instances that use cloud disks.
         */
        public Builder storage(String storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public EvaluateResourceRequest build() {
            return new EvaluateResourceRequest(this);
        } 

    } 

}
