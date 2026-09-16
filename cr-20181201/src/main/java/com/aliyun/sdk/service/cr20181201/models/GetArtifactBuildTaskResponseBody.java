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

    @com.aliyun.core.annotation.NameInMap("ArtifactCompression")
    private ArtifactCompression artifactCompression;

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

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

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
        this.artifactCompression = builder.artifactCompression;
        this.buildTaskId = builder.buildTaskId;
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.instructions = builder.instructions;
        this.isSuccess = builder.isSuccess;
        this.priority = builder.priority;
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
     * @return artifactCompression
     */
    public ArtifactCompression getArtifactCompression() {
        return this.artifactCompression;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
        private ArtifactCompression artifactCompression; 
        private String buildTaskId; 
        private String code; 
        private Integer endTime; 
        private java.util.List<String> instructions; 
        private Boolean isSuccess; 
        private Integer priority; 
        private String requestId; 
        private SourceArtifact sourceArtifact; 
        private Integer startTime; 
        private TargetArtifact targetArtifact; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(GetArtifactBuildTaskResponseBody model) {
            this.artifactBuildType = model.artifactBuildType;
            this.artifactCompression = model.artifactCompression;
            this.buildTaskId = model.buildTaskId;
            this.code = model.code;
            this.endTime = model.endTime;
            this.instructions = model.instructions;
            this.isSuccess = model.isSuccess;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.sourceArtifact = model.sourceArtifact;
            this.startTime = model.startTime;
            this.targetArtifact = model.targetArtifact;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * <p>The artifact build type. Valid values:</p>
         * <ul>
         * <li><p><code>IMAGE_TO_ACCELERATED_IMAGE</code>: Accelerated image creation optimized for ACK scenarios.</p>
         * </li>
         * <li><p><code>IMAGE_TO_ECI_ACCELERATED_IMAGE</code>: Accelerated image artifact optimized for ECI scenarios.</p>
         * </li>
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
         * <p>The artifact compression parameters.</p>
         */
        public Builder artifactCompression(ArtifactCompression artifactCompression) {
            this.artifactCompression = artifactCompression;
            return this;
        }

        /**
         * <p>The ID of the artifact build task.</p>
         * 
         * <strong>example:</strong>
         * <p>i2a-1yu****</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685415871</p>
         */
        public Builder endTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The reserved field list of the artifact build task. The list elements should be empty.</p>
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4C7DD0C-C9D6-437A-A7EE-121EFD70D002</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source artifact.</p>
         */
        public Builder sourceArtifact(SourceArtifact sourceArtifact) {
            this.sourceArtifact = sourceArtifact;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685437471</p>
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The target artifact.</p>
         */
        public Builder targetArtifact(TargetArtifact targetArtifact) {
            this.targetArtifact = targetArtifact;
            return this;
        }

        /**
         * <p>The artifact build status. Valid values:</p>
         * <ul>
         * <li><p><code>PENDING</code>: Scheduling in progress.</p>
         * </li>
         * <li><p><code>BUILDING</code>: Building in progress.</p>
         * </li>
         * <li><p><code>SUCCESS</code>: Build succeeded.</p>
         * </li>
         * <li><p><code>FAILED</code>: Build failed.</p>
         * </li>
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
    public static class ArtifactCompression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SquashKeepLayers")
        private Integer squashKeepLayers;

        @com.aliyun.core.annotation.NameInMap("StartLayerDigest")
        private String startLayerDigest;

        private ArtifactCompression(Builder builder) {
            this.platform = builder.platform;
            this.squashKeepLayers = builder.squashKeepLayers;
            this.startLayerDigest = builder.startLayerDigest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactCompression create() {
            return builder().build();
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return squashKeepLayers
         */
        public Integer getSquashKeepLayers() {
            return this.squashKeepLayers;
        }

        /**
         * @return startLayerDigest
         */
        public String getStartLayerDigest() {
            return this.startLayerDigest;
        }

        public static final class Builder {
            private String platform; 
            private Integer squashKeepLayers; 
            private String startLayerDigest; 

            private Builder() {
            } 

            private Builder(ArtifactCompression model) {
                this.platform = model.platform;
                this.squashKeepLayers = model.squashKeepLayers;
                this.startLayerDigest = model.startLayerDigest;
            } 

            /**
             * <p>The operating system and architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>linux/arm64</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The number of layers to retain after compression.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder squashKeepLayers(Integer squashKeepLayers) {
                this.squashKeepLayers = squashKeepLayers;
                return this;
            }

            /**
             * <p>The digest of the starting layer for compression.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:xxxxx</p>
             */
            public Builder startLayerDigest(String startLayerDigest) {
                this.startLayerDigest = startLayerDigest;
                return this;
            }

            public ArtifactCompression build() {
                return new ArtifactCompression(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("LayerCount")
        private Integer layerCount;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SourceArtifact(Builder builder) {
            this.artifactType = builder.artifactType;
            this.layerCount = builder.layerCount;
            this.repoId = builder.repoId;
            this.size = builder.size;
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
         * @return layerCount
         */
        public Integer getLayerCount() {
            return this.layerCount;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String artifactType; 
            private Integer layerCount; 
            private String repoId; 
            private Long size; 
            private String version; 

            private Builder() {
            } 

            private Builder(SourceArtifact model) {
                this.artifactType = model.artifactType;
                this.layerCount = model.layerCount;
                this.repoId = model.repoId;
                this.size = model.size;
                this.version = model.version;
            } 

            /**
             * <p>The artifact type. Only IMAGE is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The number of artifact layers.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder layerCount(Integer layerCount) {
                this.layerCount = layerCount;
                return this;
            }

            /**
             * <p>The repository ID. Only image repositories are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-shac42yvqzvq****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The artifact size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The artifact version. Only image versions are supported.</p>
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

        @com.aliyun.core.annotation.NameInMap("LayerCount")
        private Integer layerCount;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private TargetArtifact(Builder builder) {
            this.artifactType = builder.artifactType;
            this.layerCount = builder.layerCount;
            this.repoId = builder.repoId;
            this.size = builder.size;
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
         * @return layerCount
         */
        public Integer getLayerCount() {
            return this.layerCount;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String artifactType; 
            private Integer layerCount; 
            private String repoId; 
            private Long size; 
            private String version; 

            private Builder() {
            } 

            private Builder(TargetArtifact model) {
                this.artifactType = model.artifactType;
                this.layerCount = model.layerCount;
                this.repoId = model.repoId;
                this.size = model.size;
                this.version = model.version;
            } 

            /**
             * <p>The artifact type. Only IMAGE is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The number of artifact layers.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder layerCount(Integer layerCount) {
                this.layerCount = layerCount;
                return this;
            }

            /**
             * <p>The repository ID. Only image repositories are supported. The repository ID of the target artifact must be the same as that of the source artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-1234567</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The artifact size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The artifact version. Only images are supported.</p>
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
