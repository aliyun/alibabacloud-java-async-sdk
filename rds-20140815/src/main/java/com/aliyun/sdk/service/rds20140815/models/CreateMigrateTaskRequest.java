// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMigrateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMigrateTaskRequest</p>
 */
public class CreateMigrateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckDBMode")
    private String checkDBMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOnlineDB")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isOnlineDB;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSUrls")
    private String OSSUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectPositions")
    private String ossObjectPositions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>The type of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: The migration task migrates full backup files.</li>
         * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The consistency check method for the database. Valid values:</p>
         * <ul>
         * <li><strong>SyncExecuteDBCheck</strong>: synchronous database check</li>
         * <li><strong>AsyncExecuteDBCheck</strong>: asynchronous database check</li>
         * </ul>
         * <p>Default value: <strong>AsyncExecuteDBCheck</strong> (compatible with SQL Server 2008 R2)</p>
         * <blockquote>
         * <p> This parameter is valid when <strong>IsOnlineDB</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AsyncExecuteDBCheck</p>
         */
        public Builder checkDBMode(String checkDBMode) {
            this.putQueryParameter("CheckDBMode", checkDBMode);
            this.checkDBMode = checkDBMode;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the destination database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>Specifies whether to make the restored database data available for user access. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * <blockquote>
         * <p> Set the value to <strong>True</strong> for instances that run SQL Server 2008 R2.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isOnlineDB(String isOnlineDB) {
            this.putQueryParameter("IsOnlineDB", isOnlineDB);
            this.isOnlineDB = isOnlineDB;
            return this;
        }

        /**
         * <p>The migration task ID.</p>
         * <ul>
         * <li>If you set <strong>BackupMode</strong> to <strong>FULL</strong>, the value of this parameter is empty. The full backup mode is compatible with instance that runs SQL Server 2008 R2.</li>
         * <li>If you set <strong>BackupMode</strong> to <strong>UPDF</strong>, the value of this parameter is the ID of the required full migration task.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>IsOnlineDB</strong> to <strong>True</strong>, the value of <strong>BackupMode</strong> must be <strong>FULL</strong>.</li>
         * <li>If you set <strong>IsOnlineDB</strong> to <strong>False</strong>, the value of <strong>BackupMode</strong> must be <strong>UPDF</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.putQueryParameter("MigrateTaskId", migrateTaskId);
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * <p>The shared URL of the backup file in the OSS bucket. The URL must be encoded.</p>
         * <p>If you specify multiple URLs, separate them with vertical bars (|) and then encode them.</p>
         * <blockquote>
         * <p> This parameter is required for instances that run SQL Server 2008 R2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>check_cdn_oss.sh <a href="http://www.xxxxxx.mobi">www.xxxxxx.mobi</a></p>
         */
        public Builder OSSUrls(String OSSUrls) {
            this.putQueryParameter("OSSUrls", OSSUrls);
            this.OSSUrls = OSSUrls;
            return this;
        }

        /**
         * <p>The information about the backup file in the OSS bucket. The values consist of three parts that are separated by colons (:):</p>
         * <ul>
         * <li>OSS endpoint: oss-ap-southeast-1.aliyuncs.com.</li>
         * <li>Name of the OSS bucket: rdsmssqlsingapore.</li>
         * <li>Key of the backup file in the OSS bucket: autotest_2008R2_TestMigration_FULL.bak.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is optional for instances that run SQL Server 2008 R2.</li>
         * <li>This parameter is required for instances that run a major engine version later than SQL Server 2008 R2.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-ap-southeast-1.aliyuncs.com:rdsmssqlsingapore:autotest_2008R2_TestMigration_FULL.bak</p>
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
