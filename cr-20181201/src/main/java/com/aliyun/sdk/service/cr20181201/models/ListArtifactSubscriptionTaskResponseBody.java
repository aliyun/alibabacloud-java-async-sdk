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
 * {@link ListArtifactSubscriptionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactSubscriptionTaskResponseBody</p>
 */
public class ListArtifactSubscriptionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListArtifactSubscriptionTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactSubscriptionTaskResponseBody create() {
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListArtifactSubscriptionTaskResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81E7A039-A4EF-57D9-A100-88E5DCEF9D56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried artifact subscription tasks.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactSubscriptionTaskResponseBody build() {
            return new ListArtifactSubscriptionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactSubscriptionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactSubscriptionTaskResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
        private String sourceNamespaceName;

        @com.aliyun.core.annotation.NameInMap("SourceProvider")
        private String sourceProvider;

        @com.aliyun.core.annotation.NameInMap("SourceRepoName")
        private String sourceRepoName;

        @com.aliyun.core.annotation.NameInMap("SourceRepoType")
        private String sourceRepoType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

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

        private Tasks(Builder builder) {
            this.artifactType = builder.artifactType;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.namespaceName = builder.namespaceName;
            this.repoName = builder.repoName;
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

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
        public String getStartTime() {
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
            private String endTime; 
            private String instanceId; 
            private String message; 
            private String namespaceName; 
            private String repoName; 
            private String sourceNamespaceName; 
            private String sourceProvider; 
            private String sourceRepoName; 
            private String sourceRepoType; 
            private String startTime; 
            private Long tagSubscriptionCount; 
            private Long tagTotalCount; 
            private String taskId; 
            private String taskResult; 
            private String taskStatus; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.artifactType = model.artifactType;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.message = model.message;
                this.namespaceName = model.namespaceName;
                this.repoName = model.repoName;
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
             * <p>The type of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The end time of the artifact subscription task.</p>
             * 
             * <strong>example:</strong>
             * <p>1692756630000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-7pd01myak****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-ns</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The name of the repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test-repo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
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
             * <p>The type of the source artifact.</p>
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
             * <p>1695348301000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of subscribed tags.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder tagSubscriptionCount(Long tagSubscriptionCount) {
                this.tagSubscriptionCount = tagSubscriptionCount;
                return this;
            }

            /**
             * <p>The total number of tags.</p>
             * 
             * <strong>example:</strong>
             * <p>311</p>
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
             * <p>The task result.</p>
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
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
