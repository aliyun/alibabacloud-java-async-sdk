// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeFirewallTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallTaskResponseBody</p>
 */
public class DescribeFirewallTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsFound")
    private Boolean isFound;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskFinishTimestamp")
    private String taskFinishTimestamp;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskStartTimestamp")
    private String taskStartTimestamp;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskSteps")
    private java.util.List<TaskSteps> taskSteps;

    @com.aliyun.core.annotation.NameInMap("TaskWaitingTime")
    private String taskWaitingTime;

    private DescribeFirewallTaskResponseBody(Builder builder) {
        this.isFound = builder.isFound;
        this.requestId = builder.requestId;
        this.taskFinishTimestamp = builder.taskFinishTimestamp;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskStartTimestamp = builder.taskStartTimestamp;
        this.taskStatus = builder.taskStatus;
        this.taskSteps = builder.taskSteps;
        this.taskWaitingTime = builder.taskWaitingTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isFound
     */
    public Boolean getIsFound() {
        return this.isFound;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinishTimestamp
     */
    public String getTaskFinishTimestamp() {
        return this.taskFinishTimestamp;
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

    /**
     * @return taskStartTimestamp
     */
    public String getTaskStartTimestamp() {
        return this.taskStartTimestamp;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskSteps
     */
    public java.util.List<TaskSteps> getTaskSteps() {
        return this.taskSteps;
    }

    /**
     * @return taskWaitingTime
     */
    public String getTaskWaitingTime() {
        return this.taskWaitingTime;
    }

    public static final class Builder {
        private Boolean isFound; 
        private String requestId; 
        private String taskFinishTimestamp; 
        private Long taskId; 
        private String taskName; 
        private String taskStartTimestamp; 
        private String taskStatus; 
        private java.util.List<TaskSteps> taskSteps; 
        private String taskWaitingTime; 

        private Builder() {
        } 

        private Builder(DescribeFirewallTaskResponseBody model) {
            this.isFound = model.isFound;
            this.requestId = model.requestId;
            this.taskFinishTimestamp = model.taskFinishTimestamp;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.taskStartTimestamp = model.taskStartTimestamp;
            this.taskStatus = model.taskStatus;
            this.taskSteps = model.taskSteps;
            this.taskWaitingTime = model.taskWaitingTime;
        } 

        /**
         * IsFound.
         */
        public Builder isFound(Boolean isFound) {
            this.isFound = isFound;
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
         * TaskFinishTimestamp.
         */
        public Builder taskFinishTimestamp(String taskFinishTimestamp) {
            this.taskFinishTimestamp = taskFinishTimestamp;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStartTimestamp.
         */
        public Builder taskStartTimestamp(String taskStartTimestamp) {
            this.taskStartTimestamp = taskStartTimestamp;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskSteps.
         */
        public Builder taskSteps(java.util.List<TaskSteps> taskSteps) {
            this.taskSteps = taskSteps;
            return this;
        }

        /**
         * TaskWaitingTime.
         */
        public Builder taskWaitingTime(String taskWaitingTime) {
            this.taskWaitingTime = taskWaitingTime;
            return this;
        }

        public DescribeFirewallTaskResponseBody build() {
            return new DescribeFirewallTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTaskResponseBody</p>
     */
    public static class TaskSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StepInfo")
        private String stepInfo;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepProgress")
        private String stepProgress;

        @com.aliyun.core.annotation.NameInMap("StepStatus")
        private String stepStatus;

        private TaskSteps(Builder builder) {
            this.stepInfo = builder.stepInfo;
            this.stepName = builder.stepName;
            this.stepProgress = builder.stepProgress;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskSteps create() {
            return builder().build();
        }

        /**
         * @return stepInfo
         */
        public String getStepInfo() {
            return this.stepInfo;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepProgress
         */
        public String getStepProgress() {
            return this.stepProgress;
        }

        /**
         * @return stepStatus
         */
        public String getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private String stepInfo; 
            private String stepName; 
            private String stepProgress; 
            private String stepStatus; 

            private Builder() {
            } 

            private Builder(TaskSteps model) {
                this.stepInfo = model.stepInfo;
                this.stepName = model.stepName;
                this.stepProgress = model.stepProgress;
                this.stepStatus = model.stepStatus;
            } 

            /**
             * StepInfo.
             */
            public Builder stepInfo(String stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * StepProgress.
             */
            public Builder stepProgress(String stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * StepStatus.
             */
            public Builder stepStatus(String stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public TaskSteps build() {
                return new TaskSteps(this);
            } 

        } 

    }
}
