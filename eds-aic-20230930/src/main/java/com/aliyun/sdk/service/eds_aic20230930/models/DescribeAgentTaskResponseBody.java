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
 * {@link DescribeAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgentTaskResponseBody</p>
 */
public class DescribeAgentTaskResponseBody extends TeaModel {
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

    private DescribeAgentTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentTaskResponseBody create() {
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

        private Builder(DescribeAgentTaskResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public DescribeAgentTaskResponseBody build() {
            return new DescribeAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RunningAt")
        private String runningAt;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private String steps;

        @com.aliyun.core.annotation.NameInMap("TaskDuration")
        private String taskDuration;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("UserPrompt")
        private String userPrompt;

        private Tasks(Builder builder) {
            this.currentStatus = builder.currentStatus;
            this.instanceId = builder.instanceId;
            this.runningAt = builder.runningAt;
            this.steps = builder.steps;
            this.taskDuration = builder.taskDuration;
            this.taskId = builder.taskId;
            this.taskResult = builder.taskResult;
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
         * @return steps
         */
        public String getSteps() {
            return this.steps;
        }

        /**
         * @return taskDuration
         */
        public String getTaskDuration() {
            return this.taskDuration;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskResult
         */
        public String getTaskResult() {
            return this.taskResult;
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
            private String steps; 
            private String taskDuration; 
            private String taskId; 
            private String taskResult; 
            private String userPrompt; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.currentStatus = model.currentStatus;
                this.instanceId = model.instanceId;
                this.runningAt = model.runningAt;
                this.steps = model.steps;
                this.taskDuration = model.taskDuration;
                this.taskId = model.taskId;
                this.taskResult = model.taskResult;
                this.userPrompt = model.userPrompt;
            } 

            /**
             * CurrentStatus.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RunningAt.
             */
            public Builder runningAt(String runningAt) {
                this.runningAt = runningAt;
                return this;
            }

            /**
             * Steps.
             */
            public Builder steps(String steps) {
                this.steps = steps;
                return this;
            }

            /**
             * TaskDuration.
             */
            public Builder taskDuration(String taskDuration) {
                this.taskDuration = taskDuration;
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
             * TaskResult.
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * UserPrompt.
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
