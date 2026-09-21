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
 * {@link PauseAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PauseAgentTaskResponseBody</p>
 */
public class PauseAgentTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private PauseAgentTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseAgentTaskResponseBody create() {
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

        private Builder(PauseAgentTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>The status code.</p>
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
         * <p>E38B41A8-8E00-5AE4-A957-6636ACB8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public PauseAgentTaskResponseBody build() {
            return new PauseAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PauseAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PauseAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PausingAt")
        private String pausingAt;

        @com.aliyun.core.annotation.NameInMap("PreviousStatus")
        private String previousStatus;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.currentStatus = builder.currentStatus;
            this.failedReason = builder.failedReason;
            this.instanceId = builder.instanceId;
            this.pausingAt = builder.pausingAt;
            this.previousStatus = builder.previousStatus;
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
         * @return pausingAt
         */
        public String getPausingAt() {
            return this.pausingAt;
        }

        /**
         * @return previousStatus
         */
        public String getPreviousStatus() {
            return this.previousStatus;
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
            private String pausingAt; 
            private String previousStatus; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.currentStatus = model.currentStatus;
                this.failedReason = model.failedReason;
                this.instanceId = model.instanceId;
                this.pausingAt = model.pausingAt;
                this.previousStatus = model.previousStatus;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The current status of the task. The following are possible values:</p>
             * <p>PENDING: The task is being created.</p>
             * <p>RUNNING: The task is running.</p>
             * <p>COMPLETED: The task is completed.</p>
             * <p>FAILED: The task failed.</p>
             * <p>TIMEOUT: The task timed out.</p>
             * <p>PAUSING: The task is being paused.</p>
             * <p>PAUSED: The task is paused.</p>
             * 
             * <strong>example:</strong>
             * <p>PAUSING</p>
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * <p>The reason the task failed to pause.</p>
             * 
             * <strong>example:</strong>
             * <p>Task status [COMPLETED] does not support pause, only RUNNING tasks can be paused.</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The ID of the Mobile node.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-anzzuho371azi44xr</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the pause request was initiated, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-13T17:42:19Z</p>
             */
            public Builder pausingAt(String pausingAt) {
                this.pausingAt = pausingAt;
                return this;
            }

            /**
             * <p>The status of the task before the pause request. The only valid value is:</p>
             * <p>RUNNING: The task is running.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder previousStatus(String previousStatus) {
                this.previousStatus = previousStatus;
                return this;
            }

            /**
             * <p>The unique ID of the task.</p>
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
