// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrateTaskRequest</p>
 */
public class CreateMigrateTaskRequest extends Request {
    @Query
    @NameInMap("BackupMode")
    @Validation(required = true)
    private String backupMode;

    @Query
    @NameInMap("CheckDBMode")
    private String checkDBMode;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    @Validation(required = true)
    private String DBName;

    @Query
    @NameInMap("IsOnlineDB")
    @Validation(required = true)
    private String isOnlineDB;

    @Query
    @NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @Query
    @NameInMap("OSSUrls")
    private String OSSUrls;

    @Query
    @NameInMap("OssObjectPositions")
    private String ossObjectPositions;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateMigrateTaskRequest(Builder builder) {
        super(builder);
        this.backupMode = builder.backupMode;
        this.checkDBMode = builder.checkDBMode;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.isOnlineDB = builder.isOnlineDB;
        this.migrateTaskId = builder.migrateTaskId;
        this.OSSUrls = builder.OSSUrls;
        this.ossObjectPositions = builder.ossObjectPositions;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return checkDBMode
     */
    public String getCheckDBMode() {
        return this.checkDBMode;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return isOnlineDB
     */
    public String getIsOnlineDB() {
        return this.isOnlineDB;
    }

    /**
     * @return migrateTaskId
     */
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    /**
     * @return OSSUrls
     */
    public String getOSSUrls() {
        return this.OSSUrls;
    }

    /**
     * @return ossObjectPositions
     */
    public String getOssObjectPositions() {
        return this.ossObjectPositions;
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

    public static final class Builder extends Request.Builder<CreateMigrateTaskRequest, Builder> {
        private String backupMode; 
        private String checkDBMode; 
        private String DBInstanceId; 
        private String DBName; 
        private String isOnlineDB; 
        private String migrateTaskId; 
        private String OSSUrls; 
        private String ossObjectPositions; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMigrateTaskRequest response) {
            super(response);
            this.backupMode = response.backupMode;
            this.checkDBMode = response.checkDBMode;
            this.DBInstanceId = response.DBInstanceId;
            this.DBName = response.DBName;
            this.isOnlineDB = response.isOnlineDB;
            this.migrateTaskId = response.migrateTaskId;
            this.OSSUrls = response.OSSUrls;
            this.ossObjectPositions = response.ossObjectPositions;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * CheckDBMode.
         */
        public Builder checkDBMode(String checkDBMode) {
            this.putQueryParameter("CheckDBMode", checkDBMode);
            this.checkDBMode = checkDBMode;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * IsOnlineDB.
         */
        public Builder isOnlineDB(String isOnlineDB) {
            this.putQueryParameter("IsOnlineDB", isOnlineDB);
            this.isOnlineDB = isOnlineDB;
            return this;
        }

        /**
         * MigrateTaskId.
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.putQueryParameter("MigrateTaskId", migrateTaskId);
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * OSSUrls.
         */
        public Builder OSSUrls(String OSSUrls) {
            this.putQueryParameter("OSSUrls", OSSUrls);
            this.OSSUrls = OSSUrls;
            return this;
        }

        /**
         * OssObjectPositions.
         */
        public Builder ossObjectPositions(String ossObjectPositions) {
            this.putQueryParameter("OssObjectPositions", ossObjectPositions);
            this.ossObjectPositions = ossObjectPositions;
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
        public CreateMigrateTaskRequest build() {
            return new CreateMigrateTaskRequest(this);
        } 

    } 

}
