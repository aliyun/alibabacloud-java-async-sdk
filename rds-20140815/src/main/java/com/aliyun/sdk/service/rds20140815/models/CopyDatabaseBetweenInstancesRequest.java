// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyDatabaseBetweenInstancesRequest} extends {@link RequestModel}
 *
 * <p>CopyDatabaseBetweenInstancesRequest</p>
 */
public class CopyDatabaseBetweenInstancesRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DbNames")
    @Validation(required = true)
    private String dbNames;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("SyncUserPrivilege")
    private String syncUserPrivilege;

    @Query
    @NameInMap("TargetDBInstanceId")
    @Validation(required = true)
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

        private Builder(CopyDatabaseBetweenInstancesRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.DBInstanceId = response.DBInstanceId;
            this.dbNames = response.dbNames;
            this.resourceOwnerId = response.resourceOwnerId;
            this.restoreTime = response.restoreTime;
            this.syncUserPrivilege = response.syncUserPrivilege;
            this.targetDBInstanceId = response.targetDBInstanceId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
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
         * DbNames.
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
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * SyncUserPrivilege.
         */
        public Builder syncUserPrivilege(String syncUserPrivilege) {
            this.putQueryParameter("SyncUserPrivilege", syncUserPrivilege);
            this.syncUserPrivilege = syncUserPrivilege;
            return this;
        }

        /**
         * TargetDBInstanceId.
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
