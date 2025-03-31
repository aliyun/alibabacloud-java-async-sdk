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
 * {@link GetArtifactBuildTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildTaskResponseBody</p>
 */
public class GetArtifactBuildTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactBuildType")
    private String artifactBuildType;

    @com.aliyun.core.annotation.NameInMap("BuildTaskId")
    private String buildTaskId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.NameInMap("Instructions")
    private java.util.List<String> instructions;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceArtifact")
    private SourceArtifact sourceArtifact;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Integer startTime;

    @com.aliyun.core.annotation.NameInMap("TargetArtifact")
    private TargetArtifact targetArtifact;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private GetArtifactBuildTaskResponseBody(Builder builder) {
        this.artifactBuildType = builder.artifactBuildType;
        this.buildTaskId = builder.buildTaskId;
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.instructions = builder.instructions;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.sourceArtifact = builder.sourceArtifact;
        this.startTime = builder.startTime;
        this.targetArtifact = builder.targetArtifact;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactBuildTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactBuildType
     */
    public String getArtifactBuildType() {
        return this.artifactBuildType;
    }

    /**
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
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
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return instructions
     */
    public java.util.List<String> getInstructions() {
        return this.instructions;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceArtifact
     */
    public SourceArtifact getSourceArtifact() {
        return this.sourceArtifact;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return targetArtifact
     */
    public TargetArtifact getTargetArtifact() {
        return this.targetArtifact;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String artifactBuildType; 
        private String buildTaskId; 
        private String code; 
        private Integer endTime; 
        private java.util.List<String> instructions; 
        private Boolean isSuccess; 
        private String requestId; 
        private SourceArtifact sourceArtifact; 
        private Integer startTime; 
        private TargetArtifact targetArtifact; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(GetArtifactBuildTaskResponseBody model) {
            this.artifactBuildType = model.artifactBuildType;
            this.buildTaskId = model.buildTaskId;
            this.code = model.code;
            this.endTime = model.endTime;
            this.instructions = model.instructions;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.sourceArtifact = model.sourceArtifact;
            this.startTime = model.startTime;
            this.targetArtifact = model.targetArtifact;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * <p>The type of the artifact building task. Valid values:</p>
         * <ul>
         * <li><code>IMAGE_TO_ACCELERATED_IMAGE</code>: builds accelerated images for Container Service for Kubernetes (ACK) clusters.</li>
         * <li><code>IMAGE_TO_ECI_ACCELERATED_IMAGE</code>: builds accelerated images for elastic container instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_TO_ACCELERATED_IMAGE</p>
         */
        public Builder artifactBuildType(String artifactBuildType) {
            this.artifactBuildType = artifactBuildType;
            return this;
        }

        /**
         * <p>The ID of the artifact building task.</p>
         * 
         * <strong>example:</strong>
         * <p>i2a-1yu****</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.buildTaskId = buildTaskId;
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
         * <p>The time when the artifact building task ends.</p>
         * 
         * <strong>example:</strong>
         * <p>156871880</p>
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Instructions.
         */
        public Builder instructions(java.util.List<String> instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C4C7DD0C-C9D6-437A-A7EE-121EFD70D002</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the source artifact.</p>
         */
        public Builder sourceArtifact(SourceArtifact sourceArtifact) {
            this.sourceArtifact = sourceArtifact;
            return this;
        }

        /**
         * <p>The time when the artifact building task starts.</p>
         * 
         * <strong>example:</strong>
         * <p>156871881</p>
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The artifact that is built in the task.</p>
         */
        public Builder targetArtifact(TargetArtifact targetArtifact) {
            this.targetArtifact = targetArtifact;
            return this;
        }

        /**
         * <p>The status of the artifact that is built in the task. Valid values:</p>
         * <ul>
         * <li><code>PENDING</code>: The artifact is being scheduled.</li>
         * <li><code>BUILDING</code>: The artifact is being built.</li>
         * <li><code>SUCCESS</code>: The artifact is built.</li>
         * <li><code>FAILED</code>: The artifact fails to be built.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILDING</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetArtifactBuildTaskResponseBody build() {
            return new GetArtifactBuildTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArtifactBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactBuildTaskResponseBody</p>
     */
    public static class SourceArtifact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SourceArtifact(Builder builder) {
            this.artifactType = builder.artifactType;
            this.repoId = builder.repoId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceArtifact create() {
            return builder().build();
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String artifactType; 
            private String repoId; 
            private String version; 

            private Builder() {
            } 

            private Builder(SourceArtifact model) {
                this.artifactType = model.artifactType;
                this.repoId = model.repoId;
                this.version = model.version;
            } 

            /**
             * <p>The type of the artifact that is built in the task. The value can only be IMAGE.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The ID of the repository to which the source artifact belongs. The repository can only be an image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-shac42yvqzvq****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The version of the artifact. The artifact can only be an image.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SourceArtifact build() {
                return new SourceArtifact(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetArtifactBuildTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactBuildTaskResponseBody</p>
     */
    public static class TargetArtifact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private TargetArtifact(Builder builder) {
            this.artifactType = builder.artifactType;
            this.repoId = builder.repoId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetArtifact create() {
            return builder().build();
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String artifactType; 
            private String repoId; 
            private String version; 

            private Builder() {
            } 

            private Builder(TargetArtifact model) {
                this.artifactType = model.artifactType;
                this.repoId = model.repoId;
                this.version = model.version;
            } 

            /**
             * <p>The type of the artifact that is built in the task. The value can only be IMAGE.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The ID of the repository to which the artifact that is built in the task belongs. The repository can only be an image repository. The value is the same as the ID of the repository to which the source artifact belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-1234567</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The version of the artifact that is built in the task. The artifact can only be an image.</p>
             * 
             * <strong>example:</strong>
             * <p>latest_accelerated</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public TargetArtifact build() {
                return new TargetArtifact(this);
            } 

        } 

    }
}
