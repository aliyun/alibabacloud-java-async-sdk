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
 * {@link EvaluateResourceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateResourceRequest</p>
 */
public class EvaluateResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    private String replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardsInfo")
    private String shardsInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private String storage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The instance type.</p>
         * <blockquote>
         * <p>This parameter is required when you evaluate resources for a replica set instance. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dds.mongo.mid</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance ID. This parameter is required when you evaluate resources for changing instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp14bf67a76d****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The database engine. Set the value to <strong>MongoDB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
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
         * <p>The number of read-only nodes in the instance. Valid values: <strong>1</strong> to <strong>5</strong>.</p>
         * <blockquote>
         * <p>This parameter is not required for standalone instances<ph props ="china"> or serverless instances</ph>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> to query available regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of nodes in the instance.</p>
         * <ul>
         * <li><p>For a standalone instance, set the value to <strong>1</strong>.</p>
         * </li>
         * <li><p>For an instance with shared storage, set the value to <strong>2</strong>.</p>
         * </li>
         * <li><p>For a replica set instance, valid values are <strong>3</strong>, <strong>5</strong>, and <strong>7</strong>.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not required for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The shard information of the sharded cluster instance. This parameter is required when you evaluate resources for a sharded cluster instance.</p>
         * <p>When you evaluate resources for a new sharded cluster instance, you must specify the specifications of each shard in a JSON-formatted character string. Example:</p>
         * <pre><code>{
         *      &quot;ConfigSvrs&quot;:
         *          [{&quot;Storage&quot;:20,&quot;DBInstanceClass&quot;:&quot;dds.cs.mid&quot;}],
         *      &quot;Mongos&quot;:
         *          [{&quot;DBInstanceClass&quot;:&quot;dds.mongos.standard&quot;},{&quot;DBInstanceClass&quot;:&quot;dds.mongos.standard&quot;}],
         *      &quot;Shards&quot;:
         *          [{&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;},{&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;},   {&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;}]
         *  }
         * </code></pre>
         * <p>The parameter descriptions in the example are as follows:</p>
         * <ul>
         * <li>ConfigSvrs: the Configserver nodes.</li>
         * <li>Mongos: the mongos nodes.</li>
         * <li>Shards: the shard nodes.</li>
         * <li>Storage: the storage capacity of the target shard.</li>
         * <li>DBInstanceClass: the instance type of the target shard. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
         * </ul>
         * <p>When you evaluate resources for upgrading or downgrading a sharded cluster instance, you only need to specify the node information in a JSON-formatted character string. Example:</p>
         * <pre><code>{
         *      &quot;NodeId&quot;: &quot;d-bp147c4d9ca7****&quot;, &quot;NodeClass&quot;: &quot;dds.shard.standard&quot;
         * } 
         * </code></pre>
         * <p>The parameter descriptions in the example are as follows:</p>
         * <ul>
         * <li>NodeId: the ID of the target node.</li>
         * <li>NodeClass: the instance type of the target node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NodeId&quot;: &quot;d-bp147c4d9ca7****&quot;, &quot;NodeClass&quot;: &quot;dds.shard.standard&quot;}</p>
         */
        public Builder shardsInfo(String shardsInfo) {
            this.putQueryParameter("ShardsInfo", shardsInfo);
            this.shardsInfo = shardsInfo;
            return this;
        }

        /**
         * <p>The storage capacity of the replica set instance. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is required when the instance uses cloud disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder storage(String storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * <p>The zone ID. You can call <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> to query available zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
