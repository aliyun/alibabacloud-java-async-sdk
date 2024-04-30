// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudMigrationPrecheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudMigrationPrecheckTaskResponseBody</p>
 */
public class CreateCloudMigrationPrecheckTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateCloudMigrationPrecheckTaskResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudMigrationPrecheckTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String requestId; 
        private Long taskId; 
        private String taskName; 

        /**
         * The name of the instance.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
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
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the task.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateCloudMigrationPrecheckTaskResponseBody build() {
            return new CreateCloudMigrationPrecheckTaskResponseBody(this);
        } 

    } 

}
