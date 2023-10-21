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

        private Builder(CreateMigrateTaskRequest request) {
            super(request);
            this.backupMode = request.backupMode;
            this.checkDBMode = request.checkDBMode;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.isOnlineDB = request.isOnlineDB;
            this.migrateTaskId = request.migrateTaskId;
            this.OSSUrls = request.OSSUrls;
            this.ossObjectPositions = request.ossObjectPositions;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The type of the migration task. Valid values:
         * <p>
         * 
         * *   **FULL**: The migration task migrates full backup files.
         * *   **UPDF**: The migration task migrates incremental or log backup files.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * The consistency check method for the database. Valid values:
         * <p>
         * 
         * *   **SyncExecuteDBCheck**: synchronous database check
         * *   **AsyncExecuteDBCheck**: asynchronous database check
         * 
         * Default value: **AsyncExecuteDBCheck** (compatible with SQL Server 2008 R2).
         * 
         * >  This parameter is valid when IsOnlineDB is set to **True**.
         */
        public Builder checkDBMode(String checkDBMode) {
            this.putQueryParameter("CheckDBMode", checkDBMode);
            this.checkDBMode = checkDBMode;
            return this;
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
         * The name of the destination database.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * Specifies whether to make the restored database data available for user access. Valid values:
         * <p>
         * 
         * *   **True**
         * *   **False**
         * 
         * > Set the value to **True** for instances that run SQL Server 2008 R2.
         */
        public Builder isOnlineDB(String isOnlineDB) {
            this.putQueryParameter("IsOnlineDB", isOnlineDB);
            this.isOnlineDB = isOnlineDB;
            return this;
        }

        /**
         * The ID of the migration task.
         * <p>
         * 
         * *   If you set **BackupMode** to **FULL**, the value of this parameter is empty. The full backup mode is compatible with instance that runs SQL Server 2008 R2.
         * *   If you set **BackupMode** to **UPDF**, the value of this parameter is the ID of the required full migration task.
         * 
         * > 
         * 
         * *   If you set **IsOnlineDB** to **True**, the value of **BackupMode** must be **FULL**.
         * 
         * *   If you set **IsOnlineDB** to **False**, the value of **BackupMode** must be **UPDF**.
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.putQueryParameter("MigrateTaskId", migrateTaskId);
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * The shared URL of the backup file in the OSS bucket. The URL must be encoded.
         * <p>
         * 
         * If you specify multiple URLs, separate them with vertical bars (|) and then encode them.
         * 
         * > This parameter is required for instances that run SQL Server 2008 R2.
         */
        public Builder OSSUrls(String OSSUrls) {
            this.putQueryParameter("OSSUrls", OSSUrls);
            this.OSSUrls = OSSUrls;
            return this;
        }

        /**
         * The information about the backup file in the OSS bucket.
         * <p>
         * 
         * The values consist of three parts that are separated by colons (:):
         * 
         * *   OSS endpoint: oss-ap-southeast-1.aliyuncs.com.
         * *   Name of the OSS bucket: rdsmssqlsingapore.
         * *   Key of the backup file in the OSS bucket: autotest\_2008R2\_TestMigration_FULL.bak.
         * 
         * > 
         * 
         * *   This parameter is optional for instances that run SQL Server 2008 R2.
         * 
         * *   This parameter is required for instances that run a database engine version later than SQL Server 2008 R2.
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
