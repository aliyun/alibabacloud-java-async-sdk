// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link MigrateToOtherZoneRequest} extends {@link RequestModel}
 *
 * <p>MigrateToOtherZoneRequest</p>
 */
public class MigrateToOtherZoneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyCount")
    @com.aliyun.core.annotation.Validation(maximum = 9)
    private Integer readOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaCount")
    private Integer replicaCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReadOnlyCount")
    @com.aliyun.core.annotation.Validation(maximum = 9)
    private Integer slaveReadOnlyCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReplicaCount")
    private Integer slaveReplicaCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private MigrateToOtherZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.effectiveTime = builder.effectiveTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.readOnlyCount = builder.readOnlyCount;
        this.replicaCount = builder.replicaCount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityToken = builder.securityToken;
        this.slaveReadOnlyCount = builder.slaveReadOnlyCount;
        this.slaveReplicaCount = builder.slaveReplicaCount;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateToOtherZoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
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
     * @return readOnlyCount
     */
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    /**
     * @return replicaCount
     */
    public Integer getReplicaCount() {
        return this.replicaCount;
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
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return slaveReadOnlyCount
     */
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    /**
     * @return slaveReplicaCount
     */
    public Integer getSlaveReplicaCount() {
        return this.slaveReplicaCount;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<MigrateToOtherZoneRequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String effectiveTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer readOnlyCount; 
        private Integer replicaCount; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondaryZoneId; 
        private String securityToken; 
        private Integer slaveReadOnlyCount; 
        private Integer slaveReplicaCount; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateToOtherZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.effectiveTime = request.effectiveTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.readOnlyCount = request.readOnlyCount;
            this.replicaCount = request.replicaCount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityToken = request.securityToken;
            this.slaveReadOnlyCount = request.slaveReadOnlyCount;
            this.slaveReplicaCount = request.slaveReplicaCount;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Tair (Redis OSS-compatible) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The time when the database is switched after the instance is migrated. Valid values:</p>
         * <ul>
         * <li><strong>Immediately</strong>: The database is immediately switched after the instance is migrated.</li>
         * <li><strong>MaintainTime</strong>: The database is switched within the maintenance window.</li>
         * </ul>
         * <blockquote>
         * <p> Default value: Immediately.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Immediately</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
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
         * <p>The number of read replicas in the primary zone.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The <strong>ReadOnlyCount</strong> and <strong>SlaveReadOnlyCount</strong> parameters are applicable only to cloud-native instances for which read/write splitting is enabled. When you migrate an instance to multiple zones, you can use these parameters to adjust the distribution of read replicas in the primary and secondary zones of the instance. This operation does not allow you to increase or decrease the number of nodes. Therefore, the sum of the values of <code>ReadOnlyCount and SlaveReadOnlyCount</code> must be the same as that before the migration.</p>
         * </li>
         * <li><p>If you do not specify these parameters when you migrate an instance from a single zone to multiple zones, one read replica is migrated to the secondary zone, and all other read replicas remain in the primary zone.</p>
         * </li>
         * <li><p>If the instance is a cluster instance, the preceding parameters indicate the number of read replicas per shard in the primary and secondary zones of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder readOnlyCount(Integer readOnlyCount) {
            this.putQueryParameter("ReadOnlyCount", readOnlyCount);
            this.readOnlyCount = readOnlyCount;
            return this;
        }

        /**
         * <p>The number of replica nodes in the primary zone.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The <strong>ReplicaCount</strong> and <strong>SlaveReplicaCount</strong> parameters are applicable only to cloud-native instances. When you migrate an instance to multiple zones, you can use these parameters to adjust the distribution of replica nodes in the primary and secondary zones of the instance. This operation does not allow you to increase or decrease the number of nodes. Therefore, the sum of the values of <code>ReplicaCount and SlaveReplicaCount</code> must be the same as that before the migration.</p>
         * </li>
         * <li><p>If you do not specify these parameters when you migrate an instance from a single zone to multiple zones, one replica node is migrated to the secondary zone, and all other replica nodes remain in the primary zone.</p>
         * </li>
         * <li><p>If the instance is a cluster instance, the preceding parameters indicate the number of replica nodes per shard in the primary and secondary zones of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicaCount(Integer replicaCount) {
            this.putQueryParameter("ReplicaCount", replicaCount);
            this.replicaCount = replicaCount;
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
         * <p>The ID of the secondary zone to which you want to migrate the instance. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query zone IDs.</p>
         * <blockquote>
         * <p> If you specify this parameter, the master node and replica node of the instance can be deployed in different zones and disaster recovery is implemented across zones. The instance can withstand failures in data centers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The number of read replicas in the secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder slaveReadOnlyCount(Integer slaveReadOnlyCount) {
            this.putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount);
            this.slaveReadOnlyCount = slaveReadOnlyCount;
            return this;
        }

        /**
         * <p>The number of replica nodes in the secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder slaveReplicaCount(Integer slaveReplicaCount) {
            this.putQueryParameter("SlaveReplicaCount", slaveReplicaCount);
            this.slaveReplicaCount = slaveReplicaCount;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The zone where the vSwitch resides must be the same as the ID of the destination zone.</p>
         * </li>
         * <li><p>If the network type of the instance is VPC, this parameter is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the destination primary zone. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query zone IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public MigrateToOtherZoneRequest build() {
            return new MigrateToOtherZoneRequest(this);
        } 

    } 

}
