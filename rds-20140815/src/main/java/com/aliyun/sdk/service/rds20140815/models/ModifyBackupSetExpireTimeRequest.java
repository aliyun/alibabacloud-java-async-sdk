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
 * {@link ModifyBackupSetExpireTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupSetExpireTimeRequest</p>
 */
public class ModifyBackupSetExpireTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectExpireTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expectExpireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyBackupSetExpireTimeRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.DBInstanceId = builder.DBInstanceId;
        this.expectExpireTime = builder.expectExpireTime;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupSetExpireTimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public Long getBackupId() {
        return this.backupId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return expectExpireTime
     */
    public String getExpectExpireTime() {
        return this.expectExpireTime;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupSetExpireTimeRequest, Builder> {
        private Long backupId; 
        private String DBInstanceId; 
        private String expectExpireTime; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupSetExpireTimeRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.DBInstanceId = request.DBInstanceId;
            this.expectExpireTime = request.expectExpireTime;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backup set ID. You can invoke DescribeBackups to query the backup set ID. The backup set must meet the following conditions:</p>
         * <ul>
         * <li>Engine (database type): SQLServer</li>
         * <li>BackupMode (backup pattern): Manual (manual backup)</li>
         * <li>BackupMethod: Physical (physical backup)</li>
         * <li>BackupType: FullBackup (full backup)</li>
         * <li>BackupStatus: Success (backup completed)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>262186****</p>
         */
        public Builder backupId(Long backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-7xv8f2zcia0e4****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The time to which you want to extend the expiration time of the backup set. Specify the time in the yyyy-MM-ddTHH:mmZ format (UTC).</p>
         * <p>The specified time cannot be earlier than the current expiration time. You can call DescribeBackups to query the current expiration time (ExpectExpireTime).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-15T12:10:23Z</p>
         */
        public Builder expectExpireTime(String expectExpireTime) {
            this.putQueryParameter("ExpectExpireTime", expectExpireTime);
            this.expectExpireTime = expectExpireTime;
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
        public ModifyBackupSetExpireTimeRequest build() {
            return new ModifyBackupSetExpireTimeRequest(this);
        } 

    } 

}
