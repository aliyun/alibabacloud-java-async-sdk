// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDatabaseResponseBody</p>
 */
public class CopyDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("DBStatus")
    private String DBStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CopyDatabaseResponseBody(Builder builder) {
        this.DBName = builder.DBName;
        this.DBStatus = builder.DBStatus;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return DBStatus
     */
    public String getDBStatus() {
        return this.DBStatus;
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
        private String DBName; 
        private String DBStatus; 
        private String requestId; 
        private String taskId; 

        /**
         * The name of the database.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * The status of the database. Valid values:
         * <p>
         * 
         * *   **Creating**
         * *   **Running**
         * *   **Deleting**
         */
        public Builder DBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
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
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CopyDatabaseResponseBody build() {
            return new CopyDatabaseResponseBody(this);
        } 

    } 

}
