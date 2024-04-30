// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>MigrateDBInstanceRequest</p>
 */
public class MigrateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedTime")
    private String specifiedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForSlave")
    private String targetDedicatedHostIdForSlave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdForFollower")
    private String zoneIdForFollower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdForLog")
    private String zoneIdForLog;

    private MigrateDBInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.effectiveTime = builder.effectiveTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.specifiedTime = builder.specifiedTime;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.targetDedicatedHostIdForSlave = builder.targetDedicatedHostIdForSlave;
        this.zoneIdForFollower = builder.zoneIdForFollower;
        this.zoneIdForLog = builder.zoneIdForLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return specifiedTime
     */
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    /**
     * @return targetDedicatedHostIdForMaster
     */
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    /**
     * @return targetDedicatedHostIdForSlave
     */
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    /**
     * @return zoneIdForFollower
     */
    public String getZoneIdForFollower() {
        return this.zoneIdForFollower;
    }

    /**
     * @return zoneIdForLog
     */
    public String getZoneIdForLog() {
        return this.zoneIdForLog;
    }

    public static final class Builder extends Request.Builder<MigrateDBInstanceRequest, Builder> {
        private String DBInstanceId; 
        private String dedicatedHostGroupId; 
        private String effectiveTime; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String specifiedTime; 
        private String targetDedicatedHostIdForMaster; 
        private String targetDedicatedHostIdForSlave; 
        private String zoneIdForFollower; 
        private String zoneIdForLog; 

        private Builder() {
            super();
        } 

        private Builder(MigrateDBInstanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.effectiveTime = request.effectiveTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.specifiedTime = request.specifiedTime;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.targetDedicatedHostIdForSlave = request.targetDedicatedHostIdForSlave;
            this.zoneIdForFollower = request.zoneIdForFollower;
            this.zoneIdForLog = request.zoneIdForLog;
        } 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The time when you want the system to start the migration. Valid values:
         * <p>
         * 
         * *   **Immediately**: The system immediately starts the migration. This is the default value.
         * *   **MaintainTime**: The system starts the migration during the specified maintenance window.
         * *   **Specified**: The system starts the migration at the specified point in time.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
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
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The point in time when you want the system to start the migration. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > This parameter must be specified when you set **EffectiveTime** to **Specified**.
         */
        public Builder specifiedTime(String specifiedTime) {
            this.putQueryParameter("SpecifiedTime", specifiedTime);
            this.specifiedTime = specifiedTime;
            return this;
        }

        /**
         * The ID of the host to which you want to migrate the primary instance. You can call the DescribeDedicatedHosts operation to query the host ID.
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * The ID of the host to which you want to migrate the secondary instance. You can call the DescribeDedicatedHosts operation to query the host ID.
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * The zone ID of the secondary instance.
         */
        public Builder zoneIdForFollower(String zoneIdForFollower) {
            this.putQueryParameter("ZoneIdForFollower", zoneIdForFollower);
            this.zoneIdForFollower = zoneIdForFollower;
            return this;
        }

        /**
         * The zone ID of the logger instance.
         */
        public Builder zoneIdForLog(String zoneIdForLog) {
            this.putQueryParameter("ZoneIdForLog", zoneIdForLog);
            this.zoneIdForLog = zoneIdForLog;
            return this;
        }

        @Override
        public MigrateDBInstanceRequest build() {
            return new MigrateDBInstanceRequest(this);
        } 

    } 

}
