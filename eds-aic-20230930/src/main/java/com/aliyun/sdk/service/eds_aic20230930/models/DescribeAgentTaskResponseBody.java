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
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private Artifacts(Builder builder) {
            this.contentType = builder.contentType;
            this.downloadUrl = builder.downloadUrl;
            this.name = builder.name;
            this.size = builder.size;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String contentType; 
            private String downloadUrl; 
            private String name; 
            private Long size; 
            private String updatedTime; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.contentType = model.contentType;
                this.downloadUrl = model.downloadUrl;
                this.name = model.name;
                this.size = model.size;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgentTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactCount")
        private Integer artifactCount;

        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("DigestSource")
        private String digestSource;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RunningAt")
        private String runningAt;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private String steps;

        @com.aliyun.core.annotation.NameInMap("TaskDigest")
        private String taskDigest;

        @com.aliyun.core.annotation.NameInMap("TaskDuration")
        private String taskDuration;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("UserPrompt")
        private String userPrompt;

        private Tasks(Builder builder) {
            this.artifactCount = builder.artifactCount;
            this.artifacts = builder.artifacts;
            this.currentStatus = builder.currentStatus;
            this.digestSource = builder.digestSource;
            this.instanceId = builder.instanceId;
            this.reason = builder.reason;
            this.runningAt = builder.runningAt;
            this.steps = builder.steps;
            this.taskDigest = builder.taskDigest;
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
         * @return artifactCount
         */
        public Integer getArtifactCount() {
            return this.artifactCount;
        }

        /**
         * @return artifacts
         */
        public java.util.List<Artifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return digestSource
         */
        public String getDigestSource() {
            return this.digestSource;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
         * @return taskDigest
         */
        public String getTaskDigest() {
            return this.taskDigest;
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
            private Integer artifactCount; 
            private java.util.List<Artifacts> artifacts; 
            private String currentStatus; 
            private String digestSource; 
            private String instanceId; 
            private String reason; 
            private String runningAt; 
            private String steps; 
            private String taskDigest; 
            private String taskDuration; 
            private String taskId; 
            private String taskResult; 
            private String userPrompt; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.artifactCount = model.artifactCount;
                this.artifacts = model.artifacts;
                this.currentStatus = model.currentStatus;
                this.digestSource = model.digestSource;
                this.instanceId = model.instanceId;
                this.reason = model.reason;
                this.runningAt = model.runningAt;
                this.steps = model.steps;
                this.taskDigest = model.taskDigest;
                this.taskDuration = model.taskDuration;
                this.taskId = model.taskId;
                this.taskResult = model.taskResult;
                this.userPrompt = model.userPrompt;
            } 

            /**
             * ArtifactCount.
             */
            public Builder artifactCount(Integer artifactCount) {
                this.artifactCount = artifactCount;
                return this;
            }

            /**
             * Artifacts.
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * CurrentStatus.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * DigestSource.
             */
            public Builder digestSource(String digestSource) {
                this.digestSource = digestSource;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * TaskDigest.
             */
            public Builder taskDigest(String taskDigest) {
                this.taskDigest = taskDigest;
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
