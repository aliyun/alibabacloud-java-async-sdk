// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetArtifactSubscriptionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactSubscriptionTaskResponseBody</p>
 */
public class GetArtifactSubscriptionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
    private String sourceNamespaceName;

    @com.aliyun.core.annotation.NameInMap("SourceProvider")
    private String sourceProvider;

    @com.aliyun.core.annotation.NameInMap("SourceRepoName")
    private String sourceRepoName;

    @com.aliyun.core.annotation.NameInMap("SourceRepoType")
    private String sourceRepoType;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("TagSubscriptionCount")
    private Long tagSubscriptionCount;

    @com.aliyun.core.annotation.NameInMap("TagTotalCount")
    private Long tagTotalCount;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskResult")
    private String taskResult;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private GetArtifactSubscriptionTaskResponseBody(Builder builder) {
        this.artifactType = builder.artifactType;
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.message = builder.message;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.requestId = builder.requestId;
        this.sourceNamespaceName = builder.sourceNamespaceName;
        this.sourceProvider = builder.sourceProvider;
        this.sourceRepoName = builder.sourceRepoName;
        this.sourceRepoType = builder.sourceRepoType;
        this.startTime = builder.startTime;
        this.tagSubscriptionCount = builder.tagSubscriptionCount;
        this.tagTotalCount = builder.tagTotalCount;
        this.taskId = builder.taskId;
        this.taskResult = builder.taskResult;
        this.taskStatus = builder.taskStatus;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactSubscriptionTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceNamespaceName
     */
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    /**
     * @return sourceProvider
     */
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    /**
     * @return sourceRepoName
     */
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    /**
     * @return sourceRepoType
     */
    public String getSourceRepoType() {
        return this.sourceRepoType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagSubscriptionCount
     */
    public Long getTagSubscriptionCount() {
        return this.tagSubscriptionCount;
    }

    /**
     * @return tagTotalCount
     */
    public Long getTagTotalCount() {
        return this.tagTotalCount;
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
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String artifactType; 
        private String code; 
        private Long endTime; 
        private String instanceId; 
        private Boolean isSuccess; 
        private String message; 
        private String namespaceName; 
        private String repoName; 
        private String requestId; 
        private String sourceNamespaceName; 
        private String sourceProvider; 
        private String sourceRepoName; 
        private String sourceRepoType; 
        private Long startTime; 
        private Long tagSubscriptionCount; 
        private Long tagTotalCount; 
        private String taskId; 
        private String taskResult; 
        private String taskStatus; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(GetArtifactSubscriptionTaskResponseBody model) {
            this.artifactType = model.artifactType;
            this.code = model.code;
            this.endTime = model.endTime;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.message = model.message;
            this.namespaceName = model.namespaceName;
            this.repoName = model.repoName;
            this.requestId = model.requestId;
            this.sourceNamespaceName = model.sourceNamespaceName;
            this.sourceProvider = model.sourceProvider;
            this.sourceRepoName = model.sourceRepoName;
            this.sourceRepoType = model.sourceRepoType;
            this.startTime = model.startTime;
            this.tagSubscriptionCount = model.tagSubscriptionCount;
            this.tagTotalCount = model.tagTotalCount;
            this.taskId = model.taskId;
            this.taskResult = model.taskResult;
            this.taskStatus = model.taskStatus;
            this.taskType = model.taskType;
        } 

        /**
         * <p>The artifact type.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The end time of the artifact subscription task.</p>
         * 
         * <strong>example:</strong>
         * <p>1691979202000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the Container Registry namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The name of the Container Registry repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12589EF7-96E2-4554-AAD7-F7209E88CAD3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        public Builder sourceNamespaceName(String sourceNamespaceName) {
            this.sourceNamespaceName = sourceNamespaceName;
            return this;
        }

        /**
         * <p>The artifact source.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCKER_HUB</p>
         */
        public Builder sourceProvider(String sourceProvider) {
            this.sourceProvider = sourceProvider;
            return this;
        }

        /**
         * <p>The name of the source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        public Builder sourceRepoName(String sourceRepoName) {
            this.sourceRepoName = sourceRepoName;
            return this;
        }

        /**
         * <p>The type of the source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder sourceRepoType(String sourceRepoType) {
            this.sourceRepoType = sourceRepoType;
            return this;
        }

        /**
         * <p>The start time of the artifact subscription task.</p>
         * 
         * <strong>example:</strong>
         * <p>1568718468000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total subscribed tags.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tagSubscriptionCount(Long tagSubscriptionCount) {
            this.tagSubscriptionCount = tagSubscriptionCount;
            return this;
        }

        /**
         * <p>The total number of tags.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder tagTotalCount(Long tagTotalCount) {
            this.tagTotalCount = tagTotalCount;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crast-40le4es9yh0p****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task results.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder taskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public GetArtifactSubscriptionTaskResponseBody build() {
            return new GetArtifactSubscriptionTaskResponseBody(this);
        } 

    } 

}
