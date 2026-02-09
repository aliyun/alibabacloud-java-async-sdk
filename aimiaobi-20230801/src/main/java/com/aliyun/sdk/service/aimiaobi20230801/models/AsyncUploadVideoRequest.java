// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncUploadVideoRequest} extends {@link RequestModel}
 *
 * <p>AsyncUploadVideoRequest</p>
 */
public class AsyncUploadVideoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptiveThreshold")
    private Float adaptiveThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnlysisPrompt")
    private String anlysisPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceIdentitySimilarityMinScore")
    private Double faceIdentitySimilarityMinScore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceVideo")
    private ReferenceVideo referenceVideo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveSubtitle")
    private Boolean removeSubtitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceVideos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SourceVideos> sourceVideos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SplitInterval")
    private Integer splitInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoRoles")
    private java.util.List<VideoRoles> videoRoles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoShotFaceIdentityCount")
    private Integer videoShotFaceIdentityCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncUploadVideoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adaptiveThreshold = builder.adaptiveThreshold;
        this.anlysisPrompt = builder.anlysisPrompt;
        this.faceIdentitySimilarityMinScore = builder.faceIdentitySimilarityMinScore;
        this.referenceVideo = builder.referenceVideo;
        this.removeSubtitle = builder.removeSubtitle;
        this.sourceVideos = builder.sourceVideos;
        this.splitInterval = builder.splitInterval;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.videoRoles = builder.videoRoles;
        this.videoShotFaceIdentityCount = builder.videoShotFaceIdentityCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncUploadVideoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adaptiveThreshold
     */
    public Float getAdaptiveThreshold() {
        return this.adaptiveThreshold;
    }

    /**
     * @return anlysisPrompt
     */
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    /**
     * @return faceIdentitySimilarityMinScore
     */
    public Double getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    /**
     * @return referenceVideo
     */
    public ReferenceVideo getReferenceVideo() {
        return this.referenceVideo;
    }

    /**
     * @return removeSubtitle
     */
    public Boolean getRemoveSubtitle() {
        return this.removeSubtitle;
    }

    /**
     * @return sourceVideos
     */
    public java.util.List<SourceVideos> getSourceVideos() {
        return this.sourceVideos;
    }

    /**
     * @return splitInterval
     */
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return videoRoles
     */
    public java.util.List<VideoRoles> getVideoRoles() {
        return this.videoRoles;
    }

    /**
     * @return videoShotFaceIdentityCount
     */
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncUploadVideoRequest, Builder> {
        private String regionId; 
        private Float adaptiveThreshold; 
        private String anlysisPrompt; 
        private Double faceIdentitySimilarityMinScore; 
        private ReferenceVideo referenceVideo; 
        private Boolean removeSubtitle; 
        private java.util.List<SourceVideos> sourceVideos; 
        private Integer splitInterval; 
        private String taskName; 
        private String taskType; 
        private java.util.List<VideoRoles> videoRoles; 
        private Integer videoShotFaceIdentityCount; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncUploadVideoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adaptiveThreshold = request.adaptiveThreshold;
            this.anlysisPrompt = request.anlysisPrompt;
            this.faceIdentitySimilarityMinScore = request.faceIdentitySimilarityMinScore;
            this.referenceVideo = request.referenceVideo;
            this.removeSubtitle = request.removeSubtitle;
            this.sourceVideos = request.sourceVideos;
            this.splitInterval = request.splitInterval;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.videoRoles = request.videoRoles;
            this.videoShotFaceIdentityCount = request.videoShotFaceIdentityCount;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AdaptiveThreshold.
         */
        public Builder adaptiveThreshold(Float adaptiveThreshold) {
            this.putBodyParameter("AdaptiveThreshold", adaptiveThreshold);
            this.adaptiveThreshold = adaptiveThreshold;
            return this;
        }

        /**
         * AnlysisPrompt.
         */
        public Builder anlysisPrompt(String anlysisPrompt) {
            this.putBodyParameter("AnlysisPrompt", anlysisPrompt);
            this.anlysisPrompt = anlysisPrompt;
            return this;
        }

        /**
         * FaceIdentitySimilarityMinScore.
         */
        public Builder faceIdentitySimilarityMinScore(Double faceIdentitySimilarityMinScore) {
            this.putBodyParameter("FaceIdentitySimilarityMinScore", faceIdentitySimilarityMinScore);
            this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
            return this;
        }

        /**
         * ReferenceVideo.
         */
        public Builder referenceVideo(ReferenceVideo referenceVideo) {
            String referenceVideoShrink = shrink(referenceVideo, "ReferenceVideo", "json");
            this.putBodyParameter("ReferenceVideo", referenceVideoShrink);
            this.referenceVideo = referenceVideo;
            return this;
        }

        /**
         * RemoveSubtitle.
         */
        public Builder removeSubtitle(Boolean removeSubtitle) {
            this.putBodyParameter("RemoveSubtitle", removeSubtitle);
            this.removeSubtitle = removeSubtitle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceVideos(java.util.List<SourceVideos> sourceVideos) {
            String sourceVideosShrink = shrink(sourceVideos, "SourceVideos", "json");
            this.putBodyParameter("SourceVideos", sourceVideosShrink);
            this.sourceVideos = sourceVideos;
            return this;
        }

        /**
         * SplitInterval.
         */
        public Builder splitInterval(Integer splitInterval) {
            this.putBodyParameter("SplitInterval", splitInterval);
            this.splitInterval = splitInterval;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * VideoRoles.
         */
        public Builder videoRoles(java.util.List<VideoRoles> videoRoles) {
            String videoRolesShrink = shrink(videoRoles, "VideoRoles", "json");
            this.putBodyParameter("VideoRoles", videoRolesShrink);
            this.videoRoles = videoRoles;
            return this;
        }

        /**
         * VideoShotFaceIdentityCount.
         */
        public Builder videoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
            this.putBodyParameter("VideoShotFaceIdentityCount", videoShotFaceIdentityCount);
            this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncUploadVideoRequest build() {
            return new AsyncUploadVideoRequest(this);
        } 

    } 

    /**
     * 
     * {@link AsyncUploadVideoRequest} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoRequest</p>
     */
    public static class ReferenceVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoExtraInfo")
        private String videoExtraInfo;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private ReferenceVideo(Builder builder) {
            this.videoExtraInfo = builder.videoExtraInfo;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceVideo create() {
            return builder().build();
        }

        /**
         * @return videoExtraInfo
         */
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String videoExtraInfo; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(ReferenceVideo model) {
                this.videoExtraInfo = model.videoExtraInfo;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * VideoExtraInfo.
             */
            public Builder videoExtraInfo(String videoExtraInfo) {
                this.videoExtraInfo = videoExtraInfo;
                return this;
            }

            /**
             * VideoName.
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public ReferenceVideo build() {
                return new ReferenceVideo(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncUploadVideoRequest} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoRequest</p>
     */
    public static class SourceVideos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoExtraInfo")
        private String videoExtraInfo;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String videoUrl;

        private SourceVideos(Builder builder) {
            this.videoExtraInfo = builder.videoExtraInfo;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceVideos create() {
            return builder().build();
        }

        /**
         * @return videoExtraInfo
         */
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String videoExtraInfo; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(SourceVideos model) {
                this.videoExtraInfo = model.videoExtraInfo;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * VideoExtraInfo.
             */
            public Builder videoExtraInfo(String videoExtraInfo) {
                this.videoExtraInfo = videoExtraInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123.mp4</p>
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://123.mp4">http://123.mp4</a>
             * 目前该接口只进行视频理解额和分析，并没有对文件进行转存。请保证视频地址在任务执行期间有效。</p>
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public SourceVideos build() {
                return new SourceVideos(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncUploadVideoRequest} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoRequest</p>
     */
    public static class RoleUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleFileName")
        private String roleFileName;

        @com.aliyun.core.annotation.NameInMap("RoleFileUrl")
        private String roleFileUrl;

        private RoleUrls(Builder builder) {
            this.roleFileName = builder.roleFileName;
            this.roleFileUrl = builder.roleFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUrls create() {
            return builder().build();
        }

        /**
         * @return roleFileName
         */
        public String getRoleFileName() {
            return this.roleFileName;
        }

        /**
         * @return roleFileUrl
         */
        public String getRoleFileUrl() {
            return this.roleFileUrl;
        }

        public static final class Builder {
            private String roleFileName; 
            private String roleFileUrl; 

            private Builder() {
            } 

            private Builder(RoleUrls model) {
                this.roleFileName = model.roleFileName;
                this.roleFileUrl = model.roleFileUrl;
            } 

            /**
             * RoleFileName.
             */
            public Builder roleFileName(String roleFileName) {
                this.roleFileName = roleFileName;
                return this;
            }

            /**
             * RoleFileUrl.
             */
            public Builder roleFileUrl(String roleFileUrl) {
                this.roleFileUrl = roleFileUrl;
                return this;
            }

            public RoleUrls build() {
                return new RoleUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncUploadVideoRequest} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoRequest</p>
     */
    public static class VideoRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleInfo")
        private String roleInfo;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RoleUrls")
        private java.util.List<RoleUrls> roleUrls;

        private VideoRoles(Builder builder) {
            this.roleInfo = builder.roleInfo;
            this.roleName = builder.roleName;
            this.roleUrls = builder.roleUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoRoles create() {
            return builder().build();
        }

        /**
         * @return roleInfo
         */
        public String getRoleInfo() {
            return this.roleInfo;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return roleUrls
         */
        public java.util.List<RoleUrls> getRoleUrls() {
            return this.roleUrls;
        }

        public static final class Builder {
            private String roleInfo; 
            private String roleName; 
            private java.util.List<RoleUrls> roleUrls; 

            private Builder() {
            } 

            private Builder(VideoRoles model) {
                this.roleInfo = model.roleInfo;
                this.roleName = model.roleName;
                this.roleUrls = model.roleUrls;
            } 

            /**
             * RoleInfo.
             */
            public Builder roleInfo(String roleInfo) {
                this.roleInfo = roleInfo;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RoleUrls.
             */
            public Builder roleUrls(java.util.List<RoleUrls> roleUrls) {
                this.roleUrls = roleUrls;
                return this;
            }

            public VideoRoles build() {
                return new VideoRoles(this);
            } 

        } 

    }
}
