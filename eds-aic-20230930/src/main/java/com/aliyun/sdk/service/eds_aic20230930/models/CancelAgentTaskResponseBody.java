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
 * {@link CancelAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CancelAgentTaskResponseBody</p>
 */
public class CancelAgentTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private CancelAgentTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAgentTaskResponseBody create() {
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

        private Builder(CancelAgentTaskResponseBody model) {
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
         * <p>The message returned by the API.</p>
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
         * <p>4B886792-2051-5DB4-8AE6-C8E45D3B4****</p>
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

        public CancelAgentTaskResponseBody build() {
            return new CancelAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CancelAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CancelAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelAt")
        private String cancelAt;

        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PreviousStatus")
        private String previousStatus;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.cancelAt = builder.cancelAt;
            this.currentStatus = builder.currentStatus;
            this.failedReason = builder.failedReason;
            this.instanceId = builder.instanceId;
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
         * @return cancelAt
         */
        public String getCancelAt() {
            return this.cancelAt;
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
            private String cancelAt; 
            private String currentStatus; 
            private String failedReason; 
            private String instanceId; 
            private String previousStatus; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.cancelAt = model.cancelAt;
                this.currentStatus = model.currentStatus;
                this.failedReason = model.failedReason;
                this.instanceId = model.instanceId;
                this.previousStatus = model.previousStatus;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The time when the task was canceled, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-13T17:42:19Z</p>
             */
            public Builder cancelAt(String cancelAt) {
                this.cancelAt = cancelAt;
                return this;
            }

            /**
             * <p>The current status of the task. Valid values:</p>
             * <ul>
             * <li>CANCELLING: The task is being canceled.</li>
             * <li>CANCELED: The task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * <p>The reason why the task cancellation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Task status [COMPLETED] does not support cancellation, only PENDING/RUNNING/CANCELLING tasks can be canceled.</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The ID of the Mobile node.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-ek65k51zoxia3x8xz</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the task before cancellation. Valid values:</p>
             * <ul>
             * <li>PENDING: The task is being created.</li>
             * <li>RUNNING: The task is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder previousStatus(String previousStatus) {
                this.previousStatus = previousStatus;
                return this;
            }

            /**
             * <p>The globally unique task ID.</p>
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
