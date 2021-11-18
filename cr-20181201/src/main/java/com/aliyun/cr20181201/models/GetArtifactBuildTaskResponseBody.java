// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetArtifactBuildTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildTaskResponseBody</p>
 */
public class GetArtifactBuildTaskResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private Integer endTime;

    @NameInMap("StartTime")
    private Integer startTime;

    @NameInMap("ArtifactBuildType")
    private String artifactBuildType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("BuildTaskId")
    private String buildTaskId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("Instructions")
    private java.util.List < String > instructions;

    @NameInMap("SourceArtifact")
    private SourceArtifact sourceArtifact;

    @NameInMap("TargetArtifact")
    private TargetArtifact targetArtifact;


    private GetArtifactBuildTaskResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.artifactBuildType = builder.artifactBuildType;
        this.requestId = builder.requestId;
        this.taskStatus = builder.taskStatus;
        this.buildTaskId = builder.buildTaskId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.instructions = builder.instructions;
        this.sourceArtifact = builder.sourceArtifact;
        this.targetArtifact = builder.targetArtifact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactBuildTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return artifactBuildType
     */
    public String getArtifactBuildType() {
        return this.artifactBuildType;
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
    public String getTaskStatus() {
        return this.taskStatus;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return instructions
     */
    public java.util.List < String > getInstructions() {
        return this.instructions;
    }

    /**
     * @return sourceArtifact
     */
    public SourceArtifact getSourceArtifact() {
        return this.sourceArtifact;
    }

    /**
     * @return targetArtifact
     */
    public TargetArtifact getTargetArtifact() {
        return this.targetArtifact;
    }

    public static final class Builder {
        private Integer endTime; 
        private Integer startTime; 
        private String artifactBuildType; 
        private String requestId; 
        private String taskStatus; 
        private String buildTaskId; 
        private String code; 
        private Boolean isSuccess; 
        private java.util.List < String > instructions; 
        private SourceArtifact sourceArtifact; 
        private TargetArtifact targetArtifact; 

        /**
         * <p>End time</p>
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Start time</p>
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The build type of the product. Valid values:

-"Image_to_accelerated_image": Accelerated image creation for ACK scenario optimization

-"Image_to_eci_accelerated_image": an accelerated image for ECI scenario optimization</p>
         */
        public Builder artifactBuildType(String artifactBuildType) {
            this.artifactBuildType = artifactBuildType;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The production status of the product. Valid values:
-"PENDING": Scheduling

-"BUILDING": creating

-"SUCCESS": created successfully.

-"FAILED": Failed to be created.</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The ID of the product build task.</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * <p>Response code</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Instructions.</p>
         */
        public Builder instructions(java.util.List < String > instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * <p>SOURCE product</p>
         */
        public Builder sourceArtifact(SourceArtifact sourceArtifact) {
            this.sourceArtifact = sourceArtifact;
            return this;
        }

        /**
         * <p>Target Product</p>
         */
        public Builder targetArtifact(TargetArtifact targetArtifact) {
            this.targetArtifact = targetArtifact;
            return this;
        }

        public GetArtifactBuildTaskResponseBody build() {
            return new GetArtifactBuildTaskResponseBody(this);
        } 

    } 

    public static class SourceArtifact extends TeaModel {
        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Version")
        private String version;

        @NameInMap("ArtifactType")
        private String artifactType;


        private SourceArtifact(Builder builder) {
            this.repoId = builder.repoId;
            this.version = builder.version;
            this.artifactType = builder.artifactType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceArtifact create() {
            return builder().build();
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

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        public static final class Builder {
            private String repoId; 
            private String version; 
            private String artifactType; 

            /**
             * <p>The ID of the repository. Currently, only mirror repositories are supported.</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The product version. Currently, only the image version is supported.</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The product type. Currently, only IMAGE is supported.</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            public SourceArtifact build() {
                return new SourceArtifact(this);
            } 

        } 

    }
    public static class TargetArtifact extends TeaModel {
        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Version")
        private String version;

        @NameInMap("ArtifactType")
        private String artifactType;


        private TargetArtifact(Builder builder) {
            this.repoId = builder.repoId;
            this.version = builder.version;
            this.artifactType = builder.artifactType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetArtifact create() {
            return builder().build();
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

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        public static final class Builder {
            private String repoId; 
            private String version; 
            private String artifactType; 

            /**
             * <p>The Repository ID. Currently, only mirror repositories are supported. The Repository ID of the destination product must be the same as that of the source product.</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>Product Version. Currently, only images are supported.

</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The product type. Currently, only IMAGE is supported.</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            public TargetArtifact build() {
                return new TargetArtifact(this);
            } 

        } 

    }
}
