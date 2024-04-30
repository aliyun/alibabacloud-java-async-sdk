// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the backup set by which you want to restore databases of the source instance. When you replicate databases by backup set, you can call the DescribeBackups operation to obtain the ID of the backup set.
         * <p>
         * 
         * > : You must specify one of the **BackupId** and **RestoreTime** parameters.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The source instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The names of the databases that you want to copy. Format: `Source database name 1,Source database name 2`.
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
         * The point in time when the system replicates databases. You can select a point in time within the backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > You must specify one of the **BackupId** and **RestoreTime** parameters.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * Specifies whether to copy users and permissions.
         * <p>
         * 
         * *   **YES**: copies users and permissions. If the destination instance has a user whose name is the same as a user in the source instance, the permissions of the user in the source instance will also be granted to the user in the destination instance after you copy user permissions.
         * *   **NO**: does not copy users and permissions.
         * 
         * Default value: **NO**.
         */
        public Builder syncUserPrivilege(String syncUserPrivilege) {
            this.putQueryParameter("SyncUserPrivilege", syncUserPrivilege);
            this.syncUserPrivilege = syncUserPrivilege;
            return this;
        }

        /**
         * The destination instance ID. You can call the DescribeDBInstances operation to query the instance ID.
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
