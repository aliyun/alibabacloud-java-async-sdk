// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateApplicationBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationBackupResponseBody</p>
 */
public class CreateApplicationBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupJobId")
    private String backupJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateApplicationBackupResponseBody(Builder builder) {
        this.backupJobId = builder.backupJobId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationBackupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupJobId
     */
    public String getBackupJobId() {
        return this.backupJobId;
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
        private String backupJobId; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(CreateApplicationBackupResponseBody model) {
            this.backupJobId = model.backupJobId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of the created backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111</p>
         */
        public Builder backupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the workflow task corresponding to the backup creation.</p>
         * 
         * <strong>example:</strong>
         * <p>32077061</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateApplicationBackupResponseBody build() {
            return new CreateApplicationBackupResponseBody(this);
        } 

    } 

}
