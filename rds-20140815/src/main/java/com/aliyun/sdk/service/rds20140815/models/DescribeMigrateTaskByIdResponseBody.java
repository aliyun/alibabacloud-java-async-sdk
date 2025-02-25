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
 * {@link DescribeMigrateTaskByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTaskByIdResponseBody</p>
 */
public class DescribeMigrateTaskByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("IsDBReplaced")
    private String isDBReplaced;

    @com.aliyun.core.annotation.NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The type of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: The migration task migrates full backup files that can be used to restore the full data of the instance.</li>
         * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files that can be used to restore the incremental data of the instance.</li>
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
         * <p>The time when the migration task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-30T12:11:04Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>mytestdb</p>
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The description of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success to DBCC checkdb asynchronously</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the migration task was completed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-30T15:15:05Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Indicates whether the imported data overwrites the existing data. Valid values:</p>
         * <ul>
         * <li><strong>False</strong>: The imported data does not overwrite the existing data.</li>
         * <li><strong>True</strong>: The imported data overwrites the existing data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder isDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }

        /**
         * <p>The ID of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>235943</p>
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6ED3635A-01F9-47BD-B9C8-CB3FD70A336E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <ul>
         * <li><strong>NoStart</strong>: The task has not started.</li>
         * <li><strong>Running</strong>:The task is in progress.</li>
         * <li><strong>Success</strong>: The task is successful.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Waiting</strong>: The task is waiting for an incremental backup file to be imported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
