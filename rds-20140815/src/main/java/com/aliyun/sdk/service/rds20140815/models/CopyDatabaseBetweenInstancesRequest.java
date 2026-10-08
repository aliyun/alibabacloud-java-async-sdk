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
 * {@link CopyDatabaseBetweenInstancesRequest} extends {@link RequestModel}
 *
 * <p>CopyDatabaseBetweenInstancesRequest</p>
 */
public class CopyDatabaseBetweenInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncUserPrivilege")
    private String syncUserPrivilege;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDBInstanceId;

    private CopyDatabaseBetweenInstancesRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.DBInstanceId = builder.DBInstanceId;
        this.dbNames = builder.dbNames;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.syncUserPrivilege = builder.syncUserPrivilege;
        this.targetDBInstanceId = builder.targetDBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDatabaseBetweenInstancesRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
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
     * @return syncUserPrivilege
     */
    public String getSyncUserPrivilege() {
        return this.syncUserPrivilege;
    }

    /**
     * @return targetDBInstanceId
     */
    public String getTargetDBInstanceId() {
        return this.targetDBInstanceId;
    }

    public static final class Builder extends Request.Builder<CopyDatabaseBetweenInstancesRequest, Builder> {
        private String backupId; 
        private String DBInstanceId; 
        private String dbNames; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String syncUserPrivilege; 
        private String targetDBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CopyDatabaseBetweenInstancesRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.DBInstanceId = request.DBInstanceId;
            this.dbNames = request.dbNames;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.syncUserPrivilege = request.syncUserPrivilege;
            this.targetDBInstanceId = request.targetDBInstanceId;
        } 

        /**
         * <p>The backup set ID of the source instance. To copy a database from a backup set, call DescribeBackups to query the backup set ID.</p>
         * <blockquote>
         * <p>You must specify either <strong>BackupId</strong> or <strong>RestoreTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>259321****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The source instance ID. You can call DescribeDBInstances to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp172446ys9cf****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The list of database names to be copied. Format: <code>{&quot;Source database name&quot;:&quot;Destination database name&quot;}</code>. Separate multiple databases with commas (,). Examples:</p>
         * <ul>
         * <li>Copy a single database: <code>{&quot;zhttest&quot;:&quot;zhttest&quot;}</code></li>
         * <li>Copy multiple databases: <code>{&quot;zhttest01&quot;:&quot;zhttest01&quot;,&quot;zhttest02&quot;:&quot;zhttest02&quot;}</code></li>
         * </ul>
         * <blockquote>
         * <p>The database name on the target instance can be different from that on the source instance. However, make sure that the target instance does not contain a database with the same name before copying.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;zhttest&quot;:&quot;zhttest&quot;}</p>
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
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
         * <p>The point in time to which you want to copy the database. You can specify any point in time within the backup retention period. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <p>You must specify either <strong>BackupId</strong> or <strong>RestoreTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-08T17:41:14Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>Specifies whether to copy users and permissions. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: Users and permissions are copied. If the target instance contains a user with the same name, the permissions of the user on the source instance are merged with those of the user on the target instance.</li>
         * <li><strong>NO</strong> (default): Users and permissions are not copied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        public Builder syncUserPrivilege(String syncUserPrivilege) {
            this.putQueryParameter("SyncUserPrivilege", syncUserPrivilege);
            this.syncUserPrivilege = syncUserPrivilege;
            return this;
        }

        /**
         * <p>The target instance ID. You can invoke DescribeDBInstances to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1m71wvzfiq7****</p>
         */
        public Builder targetDBInstanceId(String targetDBInstanceId) {
            this.putQueryParameter("TargetDBInstanceId", targetDBInstanceId);
            this.targetDBInstanceId = targetDBInstanceId;
            return this;
        }

        @Override
        public CopyDatabaseBetweenInstancesRequest build() {
            return new CopyDatabaseBetweenInstancesRequest(this);
        } 

    } 

}
