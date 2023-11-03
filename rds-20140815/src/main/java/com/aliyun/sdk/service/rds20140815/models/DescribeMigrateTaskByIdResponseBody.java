// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrateTaskByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTaskByIdResponseBody</p>
 */
public class DescribeMigrateTaskByIdResponseBody extends TeaModel {
    @NameInMap("BackupMode")
    private String backupMode;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("DBName")
    private String DBName;

    @NameInMap("Description")
    private String description;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("IsDBReplaced")
    private String isDBReplaced;

    @NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeMigrateTaskByIdResponseBody(Builder builder) {
        this.backupMode = builder.backupMode;
        this.createTime = builder.createTime;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBName = builder.DBName;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.isDBReplaced = builder.isDBReplaced;
        this.migrateTaskId = builder.migrateTaskId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrateTaskByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isDBReplaced
     */
    public String getIsDBReplaced() {
        return this.isDBReplaced;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String backupMode; 
        private String createTime; 
        private String DBInstanceName; 
        private String DBName; 
        private String description; 
        private String endTime; 
        private String isDBReplaced; 
        private String migrateTaskId; 
        private String requestId; 
        private String status; 

        /**
         * The type of the migration task. Valid values:
         * <p>
         * 
         * *   **FULL**: The migration task migrates full backup files that can be used to restore the full data of the instance.
         * *   **UPDF**: The migration task migrates incremental or log backup files that can be used to restore the incremental data of the instance.
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * The time when the migration task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
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
         * The description of the migration task.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time when the migration task was completed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Indicates whether the imported data overwrites the existing data. Valid values:
         * <p>
         * 
         * *   **False**: The imported data does not overwrite the existing data.
         * *   **True**: The imported data overwrites the existing data.
         */
        public Builder isDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
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
         * The status of the migration task. Valid values:
         * <p>
         * 
         * *   **NoStart**: The task has not started.
         * *   **Running**:The task is in progress.
         * *   **Success**: The task is successful.
         * *   **Failed**: The task failed.
         * *   **Waiting**: The task is waiting for an incremental backup file to be imported.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeMigrateTaskByIdResponseBody build() {
            return new DescribeMigrateTaskByIdResponseBody(this);
        } 

    } 

}
