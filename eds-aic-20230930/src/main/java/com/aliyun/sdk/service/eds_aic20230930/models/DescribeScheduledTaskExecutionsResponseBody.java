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
 * {@link DescribeScheduledTaskExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTaskExecutionsResponseBody</p>
 */
public class DescribeScheduledTaskExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Executions")
    private java.util.List<Executions> executions;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScheduledTaskExecutionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.executions = builder.executions;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTaskExecutionsResponseBody create() {
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
     * @return executions
     */
    public java.util.List<Executions> getExecutions() {
        return this.executions;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.List<Executions> executions; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScheduledTaskExecutionsResponseBody model) {
            this.code = model.code;
            this.executions = model.executions;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of task execution records.</p>
         */
        public Builder executions(java.util.List<Executions> executions) {
            this.executions = executions;
            return this;
        }

        /**
         * <p>The maximum number of results returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTaskExecutionsResponseBody build() {
            return new DescribeScheduledTaskExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScheduledTaskExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTaskExecutionsResponseBody</p>
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
             * <p>The MIME type.</p>
             * 
             * <strong>example:</strong>
             * <p>image/png</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The OSS pre-signed download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/">https://bucket.oss-cn-hangzhou.aliyuncs.com/</a>...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>screenshot.png</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The file size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The upload time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05T10:00:00+08:00</p>
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
     * {@link DescribeScheduledTaskExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTaskExecutionsResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactCount")
        private Integer artifactCount;

        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("CompletedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("ConfigSnapshot")
        private String configSnapshot;

        @com.aliyun.core.annotation.NameInMap("DurationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Executions(Builder builder) {
            this.artifactCount = builder.artifactCount;
            this.artifacts = builder.artifacts;
            this.completedAt = builder.completedAt;
            this.configSnapshot = builder.configSnapshot;
            this.durationMs = builder.durationMs;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.output = builder.output;
            this.scheduledId = builder.scheduledId;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
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
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return configSnapshot
         */
        public String getConfigSnapshot() {
            return this.configSnapshot;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return scheduledId
         */
        public String getScheduledId() {
            return this.scheduledId;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
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

        public static final class Builder {
            private Integer artifactCount; 
            private java.util.List<Artifacts> artifacts; 
            private String completedAt; 
            private String configSnapshot; 
            private Long durationMs; 
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 
            private String output; 
            private String scheduledId; 
            private String startedAt; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Executions model) {
                this.artifactCount = model.artifactCount;
                this.artifacts = model.artifacts;
                this.completedAt = model.completedAt;
                this.configSnapshot = model.configSnapshot;
                this.durationMs = model.durationMs;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.instanceId = model.instanceId;
                this.output = model.output;
                this.scheduledId = model.scheduledId;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The number of task artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder artifactCount(Integer artifactCount) {
                this.artifactCount = artifactCount;
                return this;
            }

            /**
             * <p>The list of uploaded task artifacts.</p>
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-12T00:05:30</p>
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * <p>The configuration snapshot in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;maxSteps&quot;:10}</p>
             */
            public Builder configSnapshot(String configSnapshot) {
                this.configSnapshot = configSnapshot;
                return this;
            }

            /**
             * <p>The execution duration in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>330000</p>
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskTimeout</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>task timeout after 600s</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-axxkuuxahbu1*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The execution output in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>sch-260705-agb*****</p>
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-12T00:00:00</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the scheduled task execution record.</p>
             * 
             * <strong>example:</strong>
             * <p>t-260703-gby*****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
}
