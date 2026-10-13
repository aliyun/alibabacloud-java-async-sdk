// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("KeepCDC")
    private Boolean keepCDC;

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
        this.keepCDC = builder.keepCDC;
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
     * @return keepCDC
     */
    public Boolean getKeepCDC() {
        return this.keepCDC;
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
        private Boolean keepCDC; 
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
            this.keepCDC = request.keepCDC;
            this.migrateTaskId = request.migrateTaskId;
            this.OSSUrls = request.OSSUrls;
            this.ossObjectPositions = request.ossObjectPositions;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The type of the cloud migration task. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: restores data by using a full backup file. This value is applicable to the first migration or full data recovery scenarios.</li>
         * <li><strong>UPDF</strong>: restores incremental data by using an incremental backup file or log file. This value is applicable to incremental synchronization scenarios based on an existing full backup.</li>
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
         * <p>The consistency check method used after the database is opened. This parameter takes effect only when IsOnlineDB is set to True. Valid values:</p>
         * <ul>
         * <li><strong>SyncExecuteDBCheck</strong>: synchronously executes the database check. This value is applicable to scenarios that require high data consistency.</li>
         * <li><strong>AsyncExecuteDBCheck</strong>: asynchronously executes the database check. This value provides higher performance but may delay the discovery of potential issues.</li>
         * </ul>
         * <p>Default value: <strong>AsyncExecuteDBCheck</strong> (compatible with SQL Server 2008 R2).</p>
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
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
         * <p>Specifies whether to bring the restored database online for user access. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: brings the database online.</li>
         * <li><strong>False</strong>: does not bring the database online.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For SQL Server 2008 R2, this value is always True.</li>
         * <li>If <strong>IsOnlineDB</strong> is set to <strong>True</strong>, <strong>BackupMode</strong> must be set to <strong>FULL</strong>.</li>
         * <li>If <strong>IsOnlineDB</strong> is set to <strong>False</strong>, <strong>BackupMode</strong> must be set to <strong>UPDF</strong>.</li>
         * </ul>
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
         * <p>Specifies whether to retain the database- and table-level Change Data Capture (CDC) switches and change table data. This parameter takes effect only when IsOnlineDB is set to True. Regardless of the value of this parameter, CDC jobs are not rebuilt.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder keepCDC(Boolean keepCDC) {
            this.putQueryParameter("KeepCDC", keepCDC);
            this.keepCDC = keepCDC;
            return this;
        }

        /**
         * <p>The ID of the migration task. Valid values:</p>
         * <ul>
         * <li>If <strong>BackupMode</strong> is set to <strong>FULL</strong>, leave this parameter empty. This ensures compatibility with SQL Server 2008 R2.</li>
         * <li>If <strong>BackupMode</strong> is set to <strong>UPDF</strong>, set this parameter to the ID of the corresponding FULL task. You can call the DescribeMigrateTasks operation to query the ID.</li>
         * </ul>
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
         * <p>The shared URL of the backup file in OSS. The URL must be encoded. If multiple URLs exist, separate them with vertical bars (|) and then encode the string before passing it as the parameter value.</p>
         * <blockquote>
         * <p>This parameter is required for SQL Server 2008 R2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>check_cdn_oss.sh www.******.mobi</p>
         */
        public Builder OSSUrls(String OSSUrls) {
            this.putQueryParameter("OSSUrls", OSSUrls);
            this.OSSUrls = OSSUrls;
            return this;
        }

        /**
         * <p>The components of the OSS file. The value consists of the following three parts separated by colons (:):</p>
         * <ul>
         * <li><strong>OSS endpoint</strong>: oss-ap-southeast-1.aliyuncs.com.</li>
         * <li><strong>OSS bucket name</strong>: rdsmssqlsingapore.</li>
         * <li><strong>Backup file name in OSS</strong>: autotest_2008R2_TestMigration_FULL.bak.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required for SQL Server versions later than 2008 R2.</p>
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
