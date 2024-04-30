// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceHAConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceHAConfigRequest</p>
 */
public class ModifyDBInstanceHAConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HAMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String HAMode;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String syncMode;

    private ModifyDBInstanceHAConfigRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.HAMode = builder.HAMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.syncMode = builder.syncMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceHAConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return HAMode
     */
    public String getHAMode() {
        return this.HAMode;
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

    /**
     * @return syncMode
     */
    public String getSyncMode() {
        return this.syncMode;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceHAConfigRequest, Builder> {
        private String dbInstanceId; 
        private String HAMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String syncMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceHAConfigRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.HAMode = request.HAMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.syncMode = request.syncMode;
        } 

        /**
         * The ID of the instance.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The HA mode of the instance.
         * <p>
         * 
         * *   RPO: Data consistency is preferred. The instance ensures data reliability to minimize data losses. If you have high requirements on data consistency, select this mode.
         * *   RTO: Service availability is preferred. The instance restores the database service at the earliest opportunity to ensure service availability. If you have high requirements for service availability, select this mode.
         */
        public Builder HAMode(String HAMode) {
            this.putQueryParameter("HAMode", HAMode);
            this.HAMode = HAMode;
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

        /**
         * The data replication mode of the instance. For more information, see [Data replication mode](~~96055~~).
         * <p>
         * 
         * *   Semi-sync: the semi-synchronous mode.
         * *   Sync: the synchronous mode.
         * *   gAsyncg: the asynchronous mode.
         * *   Mgr: the MySQL group replication (MGR) mode. This mode is available only for the China site (aliyun.com).
         * 
         * > This parameter is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
         */
        public Builder syncMode(String syncMode) {
            this.putQueryParameter("SyncMode", syncMode);
            this.syncMode = syncMode;
            return this;
        }

        @Override
        public ModifyDBInstanceHAConfigRequest build() {
            return new ModifyDBInstanceHAConfigRequest(this);
        } 

    } 

}
