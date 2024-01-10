// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckRecoveryConditionRequest} extends {@link RequestModel}
 *
 * <p>CheckRecoveryConditionRequest</p>
 */
public class CheckRecoveryConditionRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("DatabaseNames")
    private String databaseNames;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("SourceDBInstance")
    private String sourceDBInstance;

    private CheckRecoveryConditionRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.databaseNames = builder.databaseNames;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.sourceDBInstance = builder.sourceDBInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRecoveryConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return databaseNames
     */
    public String getDatabaseNames() {
        return this.databaseNames;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return sourceDBInstance
     */
    public String getSourceDBInstance() {
        return this.sourceDBInstance;
    }

    public static final class Builder extends Request.Builder<CheckRecoveryConditionRequest, Builder> {
        private String backupId; 
        private String databaseNames; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String sourceDBInstance; 

        private Builder() {
            super();
        } 

        private Builder(CheckRecoveryConditionRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.databaseNames = request.databaseNames;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.sourceDBInstance = request.sourceDBInstance;
        } 

        /**
         * The backup ID.
         * <p>
         * 
         * > *   You can call the [DescribeBackups](~~62172~~) operation to query the backup ID.
         * > *   You must specify one of the **RestoreTime** and BackupId parameters.
         * > *   This parameter is not applicable to sharded cluster instances.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The name of the source database. The value is a JSON array.
         * <p>
         * 
         * >  If you do not specify this parameter, all databases are restored by default.
         */
        public Builder databaseNames(String databaseNames) {
            this.putQueryParameter("DatabaseNames", databaseNames);
            this.databaseNames = databaseNames;
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
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The point in time to which the instance is restored. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > *   The time can be a point in time within the past seven days. The time must be earlier than the current time, but later than the time when the instance was created.
         * > *   You must specify one of the RestoreTime and **BackupId** parameters.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The ID of the source instance.
         */
        public Builder sourceDBInstance(String sourceDBInstance) {
            this.putQueryParameter("SourceDBInstance", sourceDBInstance);
            this.sourceDBInstance = sourceDBInstance;
            return this;
        }

        @Override
        public CheckRecoveryConditionRequest build() {
            return new CheckRecoveryConditionRequest(this);
        } 

    } 

}
