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
 * {@link DescribeAccessInstanceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessInstanceTaskResponseBody</p>
 */
public class DescribeAccessInstanceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsFound")
    private Boolean isFound;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskFinishTimestamp")
    private Long taskFinishTimestamp;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskStartTimestamp")
    private Long taskStartTimestamp;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskSteps")
    private java.util.List<TaskSteps> taskSteps;

    private DescribeAccessInstanceTaskResponseBody(Builder builder) {
        this.isFound = builder.isFound;
        this.requestId = builder.requestId;
        this.taskFinishTimestamp = builder.taskFinishTimestamp;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskStartTimestamp = builder.taskStartTimestamp;
        this.taskStatus = builder.taskStatus;
        this.taskSteps = builder.taskSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceTaskResponseBody create() {
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
    public Long getTaskFinishTimestamp() {
        return this.taskFinishTimestamp;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
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
    public Long getTaskStartTimestamp() {
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

    public static final class Builder {
        private Boolean isFound; 
        private String requestId; 
        private Long taskFinishTimestamp; 
        private String taskId; 
        private String taskName; 
        private Long taskStartTimestamp; 
        private String taskStatus; 
        private java.util.List<TaskSteps> taskSteps; 

        private Builder() {
        } 

        private Builder(DescribeAccessInstanceTaskResponseBody model) {
            this.isFound = model.isFound;
            this.requestId = model.requestId;
            this.taskFinishTimestamp = model.taskFinishTimestamp;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.taskStartTimestamp = model.taskStartTimestamp;
            this.taskStatus = model.taskStatus;
            this.taskSteps = model.taskSteps;
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
        public Builder taskFinishTimestamp(Long taskFinishTimestamp) {
            this.taskFinishTimestamp = taskFinishTimestamp;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStartTimestamp.
         */
        public Builder taskStartTimestamp(Long taskStartTimestamp) {
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

        public DescribeAccessInstanceTaskResponseBody build() {
            return new DescribeAccessInstanceTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessInstanceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessInstanceTaskResponseBody</p>
     */
    public static class TaskSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("StepProgress")
        private String stepProgress;

        @com.aliyun.core.annotation.NameInMap("StepStatus")
        private String stepStatus;

        private TaskSteps(Builder builder) {
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
            private String stepName; 
            private String stepProgress; 
            private String stepStatus; 

            private Builder() {
            } 

            private Builder(TaskSteps model) {
                this.stepName = model.stepName;
                this.stepProgress = model.stepProgress;
                this.stepStatus = model.stepStatus;
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
