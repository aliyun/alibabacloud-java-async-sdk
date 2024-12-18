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
 * {@link CreateMigrateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrateTaskResponseBody</p>
 */
public class CreateMigrateTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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
         * <p>The type of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: The migration task migrates full backup files.</li>
         * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test02</p>
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The ID of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>564******</p>
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>866F5EB8-4650-4061-87F0-379F6F968BCE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>545****</p>
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
