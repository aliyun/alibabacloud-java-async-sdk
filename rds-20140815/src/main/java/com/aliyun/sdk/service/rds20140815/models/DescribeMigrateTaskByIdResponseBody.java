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
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * IsDBReplaced.
         */
        public Builder isDBReplaced(String isDBReplaced) {
            this.isDBReplaced = isDBReplaced;
            return this;
        }

        /**
         * MigrateTaskId.
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
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
