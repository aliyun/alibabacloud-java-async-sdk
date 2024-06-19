// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommitContainerTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommitContainerTaskResponseBody</p>
 */
public class DescribeCommitContainerTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommitTasks")
    private java.util.List < CommitTasks> commitTasks;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCommitContainerTaskResponseBody(Builder builder) {
        this.commitTasks = builder.commitTasks;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommitContainerTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return commitTasks
     */
    public java.util.List < CommitTasks> getCommitTasks() {
        return this.commitTasks;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CommitTasks> commitTasks; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the task.
         */
        public Builder commitTasks(java.util.List < CommitTasks> commitTasks) {
            this.commitTasks = commitTasks;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token that is returned in this request.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommitContainerTaskResponseBody build() {
            return new DescribeCommitContainerTaskResponseBody(this);
        } 

    } 

    public static class CommitPhaseInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("RecordTime")
        private String recordTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CommitPhaseInfos(Builder builder) {
            this.message = builder.message;
            this.phase = builder.phase;
            this.recordTime = builder.recordTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommitPhaseInfos create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return recordTime
         */
        public String getRecordTime() {
            return this.recordTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String phase; 
            private String recordTime; 
            private String status; 

            /**
             * The message about the phase.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The phase name. Valid values:
             * <p>
             * 
             * *   PullBaseImage: Pull the original container image.
             * *   CommitContainer: Commit the container to generate an image.
             * *   PushCommittedImage: Push the image to Container Registry.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The record time of the phase.
             */
            public Builder recordTime(String recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            /**
             * The state of the phase.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CommitPhaseInfos build() {
                return new CommitPhaseInfos(this);
            } 

        } 

    }
    public static class CommitTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitPhaseInfos")
        private java.util.List < CommitPhaseInfos> commitPhaseInfos;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("TaskCreationTime")
        private String taskCreationTime;

        @com.aliyun.core.annotation.NameInMap("TaskFinishedTime")
        private String taskFinishedTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskProgress")
        private String taskProgress;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private CommitTasks(Builder builder) {
            this.commitPhaseInfos = builder.commitPhaseInfos;
            this.containerName = builder.containerName;
            this.statusMessage = builder.statusMessage;
            this.taskCreationTime = builder.taskCreationTime;
            this.taskFinishedTime = builder.taskFinishedTime;
            this.taskId = builder.taskId;
            this.taskProgress = builder.taskProgress;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommitTasks create() {
            return builder().build();
        }

        /**
         * @return commitPhaseInfos
         */
        public java.util.List < CommitPhaseInfos> getCommitPhaseInfos() {
            return this.commitPhaseInfos;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return taskCreationTime
         */
        public String getTaskCreationTime() {
            return this.taskCreationTime;
        }

        /**
         * @return taskFinishedTime
         */
        public String getTaskFinishedTime() {
            return this.taskFinishedTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskProgress
         */
        public String getTaskProgress() {
            return this.taskProgress;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private java.util.List < CommitPhaseInfos> commitPhaseInfos; 
            private String containerName; 
            private String statusMessage; 
            private String taskCreationTime; 
            private String taskFinishedTime; 
            private String taskId; 
            private String taskProgress; 
            private String taskStatus; 

            /**
             * The information about the phase that the task arrives.
             */
            public Builder commitPhaseInfos(java.util.List < CommitPhaseInfos> commitPhaseInfos) {
                this.commitPhaseInfos = commitPhaseInfos;
                return this;
            }

            /**
             * The container name.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The message about the state.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The time when the task was started.
             */
            public Builder taskCreationTime(String taskCreationTime) {
                this.taskCreationTime = taskCreationTime;
                return this;
            }

            /**
             * The time when the task was complete.
             */
            public Builder taskFinishedTime(String taskFinishedTime) {
                this.taskFinishedTime = taskFinishedTime;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The progress of the task in percentage.
             */
            public Builder taskProgress(String taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * The state of the task. Valid values:
             * <p>
             * 
             * *   Running
             * *   Succeeded
             * *   Failed
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public CommitTasks build() {
                return new CommitTasks(this);
            } 

        } 

    }
}
