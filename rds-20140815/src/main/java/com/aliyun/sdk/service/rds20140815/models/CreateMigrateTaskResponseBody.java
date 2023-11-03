// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrateTaskResponseBody</p>
 */
public class CreateMigrateTaskResponseBody extends TeaModel {
    @NameInMap("BackupMode")
    private String backupMode;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DBName")
    private String DBName;

    @NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private CreateMigrateTaskResponseBody(Builder builder) {
        this.backupMode = builder.backupMode;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.migrateTaskId = builder.migrateTaskId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrateTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
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
     * @return migrateTaskId
     */
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String backupMode; 
        private String DBInstanceId; 
        private String DBName; 
        private String migrateTaskId; 
        private String requestId; 
        private String taskId; 

        /**
         * The type of the migration task. Valid values:
         * <p>
         * 
         * *   **FULL**: The migration task migrates full backup files.
         * *   **UPDF**: The migration task migrates incremental or log backup files.
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * The ID of the migration task.
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateMigrateTaskResponseBody build() {
            return new CreateMigrateTaskResponseBody(this);
        } 

    } 

}
