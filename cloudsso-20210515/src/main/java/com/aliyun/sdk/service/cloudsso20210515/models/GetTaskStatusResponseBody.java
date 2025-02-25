// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskStatusResponseBody</p>
 */
public class GetTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private TaskStatus taskStatus;

    private GetTaskStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStatus
     */
    public TaskStatus getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String requestId; 
        private TaskStatus taskStatus; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>005F4623-AE53-504D-830F-44825F7DC211</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status information about the task.</p>
         */
        public Builder taskStatus(TaskStatus taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetTaskStatusResponseBody build() {
            return new GetTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskStatusResponseBody</p>
     */
    public static class TaskStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TaskStatus(Builder builder) {
            this.endTime = builder.endTime;
            this.failureReason = builder.failureReason;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatus create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String endTime; 
            private String failureReason; 
            private String startTime; 
            private String status; 
            private String taskId; 
            private String taskType; 

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-05T02:58:08Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The cause of the task failure.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of <code>Status</code> is <code>Failed</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>No Permission.</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-05T02:58:07Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>InProgress: The task is running.</li>
             * <li>Success: The task is successful.</li>
             * <li>Failed: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-shfqw1u1edszvxw5****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>ProvisionAccessConfiguration: An access configuration is provisioned.</li>
             * <li>DeprovisionAccessConfiguration: An access configuration is de-provisioned.</li>
             * <li>CreateAccessAssignment: Access permissions on an account in the resource directory are assigned.</li>
             * <li>DeleteAccessAssignment: Access permissions on an account in the resource directory are removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DeleteAccessAssignment</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskStatus build() {
                return new TaskStatus(this);
            } 

        } 

    }
}
