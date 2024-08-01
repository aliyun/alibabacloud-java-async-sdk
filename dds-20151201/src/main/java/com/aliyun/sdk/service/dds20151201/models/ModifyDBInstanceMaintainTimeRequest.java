// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceMaintainTimeRequest</p>
 */
public class ModifyDBInstanceMaintainTimeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceMaintainTimeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceMaintainTimeRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceMaintainTimeRequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceMaintainTimeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The end time of the maintenance window. Specify the time in the ISO 8601 standard in the *HH:mm*Z format. The time must be in UTC.
         * <p>
         * 
         * >  The end time must be later than the start time of the maintenance window.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * The start time of the maintenance window. Specify the time in the ISO 8601 standard in the *HH:mm*Z format. The time must be in UTC.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
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

        @Override
        public ModifyDBInstanceMaintainTimeRequest build() {
            return new ModifyDBInstanceMaintainTimeRequest(this);
        } 

    } 

}
