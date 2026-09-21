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
 * {@link RunAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RunAgentTaskResponseBody</p>
 */
public class RunAgentTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private RunAgentTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAgentTaskResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private String message; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(RunAgentTaskResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * <p>The status code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>For example, &quot;200&quot; indicates success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
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

        public RunAgentTaskResponseBody build() {
            return new RunAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RunningAt")
        private String runningAt;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UserPrompt")
        private String userPrompt;

        private Tasks(Builder builder) {
            this.currentStatus = builder.currentStatus;
            this.instanceId = builder.instanceId;
            this.runningAt = builder.runningAt;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.userPrompt = builder.userPrompt;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return runningAt
         */
        public String getRunningAt() {
            return this.runningAt;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return userPrompt
         */
        public String getUserPrompt() {
            return this.userPrompt;
        }

        public static final class Builder {
            private String currentStatus; 
            private String instanceId; 
            private String runningAt; 
            private String sessionId; 
            private String taskId; 
            private String userPrompt; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.currentStatus = model.currentStatus;
                this.instanceId = model.instanceId;
                this.runningAt = model.runningAt;
                this.sessionId = model.sessionId;
                this.taskId = model.taskId;
                this.userPrompt = model.userPrompt;
            } 

            /**
             * <p>The current status of the task. Valid values:</p>
             * <p>PENDING: The task is being created.</p>
             * <p>RUNNING: The task is running.</p>
             * <p>COMPLETED: The task is completed.</p>
             * <p>FAILED: The task failed.</p>
             * <p>TIMEOUT: The task timed out.</p>
             * <p>CALL_FOR_USER: Waiting for user action.</p>
             * <p>PAUSING: The task is being paused.</p>
             * <p>PAUSED: The task is paused.</p>
             * <p>CANCELLING: The task is being canceled.</p>
             * <p>CANCELED: The task is canceled.</p>
             * <p>STOPPED: The task is stopped.</p>
             * <p>TIMEOUT: The task timed out.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
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
             * <p>The time when the task was created, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-13T17:42:19Z</p>
             */
            public Builder runningAt(String runningAt) {
                this.runningAt = runningAt;
                return this;
            }

            /**
             * <p>The session ID. Tasks with the same session ID share context.</p>
             * 
             * <strong>example:</strong>
             * <p>ses-260702-21bh****。</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
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

            /**
             * <p>The user instruction in natural language. The Agent performs operations based on this instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>Go to App Store and download DingTalk</p>
             */
            public Builder userPrompt(String userPrompt) {
                this.userPrompt = userPrompt;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
