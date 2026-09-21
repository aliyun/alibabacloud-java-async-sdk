// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ResumeAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ResumeAgentTaskResponseBody</p>
 */
public class ResumeAgentTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private ResumeAgentTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeAgentTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(ResumeAgentTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ResumeAgentTaskResponseBody build() {
            return new ResumeAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ResumeAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ResumeAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ResumingAt")
        private String resumingAt;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.currentStatus = builder.currentStatus;
            this.failedReason = builder.failedReason;
            this.instanceId = builder.instanceId;
            this.resumingAt = builder.resumingAt;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resumingAt
         */
        public String getResumingAt() {
            return this.resumingAt;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String currentStatus; 
            private String failedReason; 
            private String instanceId; 
            private String resumingAt; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.currentStatus = model.currentStatus;
                this.failedReason = model.failedReason;
                this.instanceId = model.instanceId;
                this.resumingAt = model.resumingAt;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The current status of the task. Valid values:</p>
             * <ul>
             * <li>PENDING: The task is being created.</li>
             * <li>RUNNING: The task is running.</li>
             * <li>COMPLETED: The task is completed.</li>
             * <li>FAILED: The task has failed.</li>
             * <li>TIMEOUT: The task has timed out.</li>
             * <li>PAUSING: The task is being paused.</li>
             * <li>PAUSED: The task is paused.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * <p>The reason why the task failed to resume.</p>
             * 
             * <strong>example:</strong>
             * <p>Task status [COMPLETED] does not support resume, only PAUSED tasks can be resumed.</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The Mobile node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-ek65k51zoxia3x8xz</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the task is resumed, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-13T17:42:19Z</p>
             */
            public Builder resumingAt(String resumingAt) {
                this.resumingAt = resumingAt;
                return this;
            }

            /**
             * <p>The task ID, which is globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>t-imr0fufqd7cle****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
