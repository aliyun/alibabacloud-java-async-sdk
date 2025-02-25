// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskResponseBody</p>
 */
public class GetTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private GetTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>923CA5E8-57BF-5E15-8BA6-E75A966B7E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskResponseBody build() {
            return new GetTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetPathName")
        private String targetPathName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Task(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.endTime = builder.endTime;
            this.failureReason = builder.failureReason;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetPathName = builder.targetPathName;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return accessConfigurationId
         */
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        /**
         * @return accessConfigurationName
         */
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
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
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
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
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetPathName
         */
        public String getTargetPathName() {
            return this.targetPathName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
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
            private String accessConfigurationId; 
            private String accessConfigurationName; 
            private String endTime; 
            private String failureReason; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String startTime; 
            private String status; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetPathName; 
            private String targetType; 
            private String taskId; 
            private String taskType; 

            /**
             * <p>The ID of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-00jhtfl8thteu6uj****</p>
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * <p>The name of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS-Admin</p>
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

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
             * <p>The ID of the CloudSSO identity.</p>
             * 
             * <strong>example:</strong>
             * <p>u-00q8wbq42wiltcrk****</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The name of the CloudSSO identity.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the CloudSSO identity. Valid values:</p>
             * <ul>
             * <li>User</li>
             * <li>Group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
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
             * <p>The ID of the task object.</p>
             * 
             * <strong>example:</strong>
             * <p>114240524784****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the task object.</p>
             * 
             * <strong>example:</strong>
             * <p>dev-test</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The path ID of the task object in the resource directory.</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The path name of the task object in the resource directory.</p>
             */
            public Builder targetPathName(String targetPathName) {
                this.targetPathName = targetPathName;
                return this;
            }

            /**
             * <p>The type of the task object. The value is fixed as RD-Account, which indicates the accounts in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>RD-Account</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
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

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
