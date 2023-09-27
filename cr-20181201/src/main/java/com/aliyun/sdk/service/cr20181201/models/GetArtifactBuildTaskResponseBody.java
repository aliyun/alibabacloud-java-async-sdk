// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactBuildTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildTaskResponseBody</p>
 */
public class GetArtifactBuildTaskResponseBody extends TeaModel {
    @NameInMap("ArtifactBuildType")
    private String artifactBuildType;

    @NameInMap("BuildTaskId")
    private String buildTaskId;

    @NameInMap("Code")
    private String code;

    @NameInMap("EndTime")
    private Integer endTime;

    @NameInMap("Instructions")
    private java.util.List < String > instructions;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceArtifact")
    private SourceArtifact sourceArtifact;

    @NameInMap("StartTime")
    private Integer startTime;

    @NameInMap("TargetArtifact")
    private TargetArtifact targetArtifact;

    @NameInMap("TaskStatus")
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
    public java.util.List < String > getInstructions() {
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
        private java.util.List < String > instructions; 
        private Boolean isSuccess; 
        private String requestId; 
        private SourceArtifact sourceArtifact; 
        private Integer startTime; 
        private TargetArtifact targetArtifact; 
        private String taskStatus; 

        /**
         * The type of the artifact building task. Valid values:
         * <p>
         * 
         * *   `IMAGE_TO_ACCELERATED_IMAGE`: builds accelerated images for Container Service for Kubernetes (ACK) clusters.
         * *   `IMAGE_TO_ECI_ACCELERATED_IMAGE`: builds accelerated images for elastic container instances.
         */
        public Builder artifactBuildType(String artifactBuildType) {
            this.artifactBuildType = artifactBuildType;
            return this;
        }

        /**
         * The ID of the artifact building task.
         */
        public Builder buildTaskId(String buildTaskId) {
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the artifact building task ends.
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Instructions.
         */
        public Builder instructions(java.util.List < String > instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * The information about the source artifact.
         */
        public Builder sourceArtifact(SourceArtifact sourceArtifact) {
            this.sourceArtifact = sourceArtifact;
            return this;
        }

        /**
         * The time when the artifact building task starts.
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The artifact that is built in the task.
         */
        public Builder targetArtifact(TargetArtifact targetArtifact) {
            this.targetArtifact = targetArtifact;
            return this;
        }

        /**
         * The status of the artifact that is built in the task. Valid values:
         * <p>
         * 
         * *   `PENDING`: The artifact is being scheduled.
         * *   `BUILDING`: The artifact is being built.
         * *   `SUCCESS`: The artifact is built.
         * *   `FAILED`: The artifact fails to be built.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetArtifactBuildTaskResponseBody build() {
            return new GetArtifactBuildTaskResponseBody(this);
        } 

    } 

    public static class SourceArtifact extends TeaModel {
        @NameInMap("ArtifactType")
        private String artifactType;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Version")
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

            /**
             * The type of the artifact that is built in the task. The value can only be IMAGE.
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * The ID of the repository to which the source artifact belongs. The repository can only be an image repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The version of the artifact. The artifact can only be an image.
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
    public static class TargetArtifact extends TeaModel {
        @NameInMap("ArtifactType")
        private String artifactType;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Version")
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

            /**
             * The type of the artifact that is built in the task. The value can only be IMAGE.
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * The ID of the repository to which the artifact that is built in the task belongs. The repository can only be an image repository. The value is the same as the ID of the repository to which the source artifact belongs.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The version of the artifact that is built in the task. The artifact can only be an image.
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
