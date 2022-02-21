// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrateTaskForSQLServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrateTaskForSQLServerResponseBody</p>
 */
public class CreateMigrateTaskForSQLServerResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("DBName")
    private String DBName;

    @NameInMap("MigrateIaskId")
    private String migrateIaskId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskType")
    private String taskType;

    private CreateMigrateTaskForSQLServerResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBName = builder.DBName;
        this.migrateIaskId = builder.migrateIaskId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrateTaskForSQLServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return migrateIaskId
     */
    public String getMigrateIaskId() {
        return this.migrateIaskId;
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

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String DBInstanceName; 
        private String DBName; 
        private String migrateIaskId; 
        private String requestId; 
        private String taskId; 
        private String taskType; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
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
         * MigrateIaskId.
         */
        public Builder migrateIaskId(String migrateIaskId) {
            this.migrateIaskId = migrateIaskId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public CreateMigrateTaskForSQLServerResponseBody build() {
            return new CreateMigrateTaskForSQLServerResponseBody(this);
        } 

    } 

}
