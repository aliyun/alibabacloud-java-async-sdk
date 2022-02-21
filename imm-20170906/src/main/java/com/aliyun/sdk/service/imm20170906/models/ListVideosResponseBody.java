// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideosResponseBody} extends {@link TeaModel}
 *
 * <p>ListVideosResponseBody</p>
 */
public class ListVideosResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("Videos")
    private java.util.List < Videos> videos;

    private ListVideosResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.videos = builder.videos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return videos
     */
    public java.util.List < Videos> getVideos() {
        return this.videos;
    }

    public static final class Builder {
        private String nextMarker; 
        private String requestId; 
        private String setId; 
        private java.util.List < Videos> videos; 

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
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
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * Videos.
         */
        public Builder videos(java.util.List < Videos> videos) {
            this.videos = videos;
            return this;
        }

        public ListVideosResponseBody build() {
            return new ListVideosResponseBody(this);
        } 

    } 

    public static class VideoTags extends TeaModel {
        @NameInMap("ParentTagName")
        private String parentTagName;

        @NameInMap("TagConfidence")
        private Float tagConfidence;

        @NameInMap("TagLevel")
        private Integer tagLevel;

        @NameInMap("TagName")
        private String tagName;

        private VideoTags(Builder builder) {
            this.parentTagName = builder.parentTagName;
            this.tagConfidence = builder.tagConfidence;
            this.tagLevel = builder.tagLevel;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTags create() {
            return builder().build();
        }

        /**
         * @return parentTagName
         */
        public String getParentTagName() {
            return this.parentTagName;
        }

        /**
         * @return tagConfidence
         */
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        /**
         * @return tagLevel
         */
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String parentTagName; 
            private Float tagConfidence; 
            private Integer tagLevel; 
            private String tagName; 

            /**
             * ParentTagName.
             */
            public Builder parentTagName(String parentTagName) {
                this.parentTagName = parentTagName;
                return this;
            }

            /**
             * TagConfidence.
             */
            public Builder tagConfidence(Float tagConfidence) {
                this.tagConfidence = tagConfidence;
                return this;
            }

            /**
             * TagLevel.
             */
            public Builder tagLevel(Integer tagLevel) {
                this.tagLevel = tagLevel;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public VideoTags build() {
                return new VideoTags(this);
            } 

        } 

    }
    public static class Videos extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExternalId")
        private String externalId;

        @NameInMap("FileSize")
        private Integer fileSize;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ProcessFailReason")
        private String processFailReason;

        @NameInMap("ProcessModifyTime")
        private String processModifyTime;

        @NameInMap("ProcessStatus")
        private String processStatus;

        @NameInMap("RemarksA")
        private String remarksA;

        @NameInMap("RemarksB")
        private String remarksB;

        @NameInMap("RemarksC")
        private String remarksC;

        @NameInMap("RemarksD")
        private String remarksD;

        @NameInMap("SourcePosition")
        private String sourcePosition;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SourceUri")
        private String sourceUri;

        @NameInMap("VideoDuration")
        private Float videoDuration;

        @NameInMap("VideoFormat")
        private String videoFormat;

        @NameInMap("VideoFrames")
        private Integer videoFrames;

        @NameInMap("VideoHeight")
        private Integer videoHeight;

        @NameInMap("VideoTags")
        private java.util.List < VideoTags> videoTags;

        @NameInMap("VideoTagsFailReason")
        private String videoTagsFailReason;

        @NameInMap("VideoTagsModifyTime")
        private String videoTagsModifyTime;

        @NameInMap("VideoTagsStatus")
        private String videoTagsStatus;

        @NameInMap("VideoUri")
        private String videoUri;

        @NameInMap("VideoWidth")
        private Integer videoWidth;

        private Videos(Builder builder) {
            this.createTime = builder.createTime;
            this.externalId = builder.externalId;
            this.fileSize = builder.fileSize;
            this.modifyTime = builder.modifyTime;
            this.processFailReason = builder.processFailReason;
            this.processModifyTime = builder.processModifyTime;
            this.processStatus = builder.processStatus;
            this.remarksA = builder.remarksA;
            this.remarksB = builder.remarksB;
            this.remarksC = builder.remarksC;
            this.remarksD = builder.remarksD;
            this.sourcePosition = builder.sourcePosition;
            this.sourceType = builder.sourceType;
            this.sourceUri = builder.sourceUri;
            this.videoDuration = builder.videoDuration;
            this.videoFormat = builder.videoFormat;
            this.videoFrames = builder.videoFrames;
            this.videoHeight = builder.videoHeight;
            this.videoTags = builder.videoTags;
            this.videoTagsFailReason = builder.videoTagsFailReason;
            this.videoTagsModifyTime = builder.videoTagsModifyTime;
            this.videoTagsStatus = builder.videoTagsStatus;
            this.videoUri = builder.videoUri;
            this.videoWidth = builder.videoWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Videos create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return processFailReason
         */
        public String getProcessFailReason() {
            return this.processFailReason;
        }

        /**
         * @return processModifyTime
         */
        public String getProcessModifyTime() {
            return this.processModifyTime;
        }

        /**
         * @return processStatus
         */
        public String getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return remarksA
         */
        public String getRemarksA() {
            return this.remarksA;
        }

        /**
         * @return remarksB
         */
        public String getRemarksB() {
            return this.remarksB;
        }

        /**
         * @return remarksC
         */
        public String getRemarksC() {
            return this.remarksC;
        }

        /**
         * @return remarksD
         */
        public String getRemarksD() {
            return this.remarksD;
        }

        /**
         * @return sourcePosition
         */
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        /**
         * @return videoDuration
         */
        public Float getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoFormat
         */
        public String getVideoFormat() {
            return this.videoFormat;
        }

        /**
         * @return videoFrames
         */
        public Integer getVideoFrames() {
            return this.videoFrames;
        }

        /**
         * @return videoHeight
         */
        public Integer getVideoHeight() {
            return this.videoHeight;
        }

        /**
         * @return videoTags
         */
        public java.util.List < VideoTags> getVideoTags() {
            return this.videoTags;
        }

        /**
         * @return videoTagsFailReason
         */
        public String getVideoTagsFailReason() {
            return this.videoTagsFailReason;
        }

        /**
         * @return videoTagsModifyTime
         */
        public String getVideoTagsModifyTime() {
            return this.videoTagsModifyTime;
        }

        /**
         * @return videoTagsStatus
         */
        public String getVideoTagsStatus() {
            return this.videoTagsStatus;
        }

        /**
         * @return videoUri
         */
        public String getVideoUri() {
            return this.videoUri;
        }

        /**
         * @return videoWidth
         */
        public Integer getVideoWidth() {
            return this.videoWidth;
        }

        public static final class Builder {
            private String createTime; 
            private String externalId; 
            private Integer fileSize; 
            private String modifyTime; 
            private String processFailReason; 
            private String processModifyTime; 
            private String processStatus; 
            private String remarksA; 
            private String remarksB; 
            private String remarksC; 
            private String remarksD; 
            private String sourcePosition; 
            private String sourceType; 
            private String sourceUri; 
            private Float videoDuration; 
            private String videoFormat; 
            private Integer videoFrames; 
            private Integer videoHeight; 
            private java.util.List < VideoTags> videoTags; 
            private String videoTagsFailReason; 
            private String videoTagsModifyTime; 
            private String videoTagsStatus; 
            private String videoUri; 
            private Integer videoWidth; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ProcessFailReason.
             */
            public Builder processFailReason(String processFailReason) {
                this.processFailReason = processFailReason;
                return this;
            }

            /**
             * ProcessModifyTime.
             */
            public Builder processModifyTime(String processModifyTime) {
                this.processModifyTime = processModifyTime;
                return this;
            }

            /**
             * ProcessStatus.
             */
            public Builder processStatus(String processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * RemarksA.
             */
            public Builder remarksA(String remarksA) {
                this.remarksA = remarksA;
                return this;
            }

            /**
             * RemarksB.
             */
            public Builder remarksB(String remarksB) {
                this.remarksB = remarksB;
                return this;
            }

            /**
             * RemarksC.
             */
            public Builder remarksC(String remarksC) {
                this.remarksC = remarksC;
                return this;
            }

            /**
             * RemarksD.
             */
            public Builder remarksD(String remarksD) {
                this.remarksD = remarksD;
                return this;
            }

            /**
             * SourcePosition.
             */
            public Builder sourcePosition(String sourcePosition) {
                this.sourcePosition = sourcePosition;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SourceUri.
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            /**
             * VideoDuration.
             */
            public Builder videoDuration(Float videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * VideoFormat.
             */
            public Builder videoFormat(String videoFormat) {
                this.videoFormat = videoFormat;
                return this;
            }

            /**
             * VideoFrames.
             */
            public Builder videoFrames(Integer videoFrames) {
                this.videoFrames = videoFrames;
                return this;
            }

            /**
             * VideoHeight.
             */
            public Builder videoHeight(Integer videoHeight) {
                this.videoHeight = videoHeight;
                return this;
            }

            /**
             * VideoTags.
             */
            public Builder videoTags(java.util.List < VideoTags> videoTags) {
                this.videoTags = videoTags;
                return this;
            }

            /**
             * VideoTagsFailReason.
             */
            public Builder videoTagsFailReason(String videoTagsFailReason) {
                this.videoTagsFailReason = videoTagsFailReason;
                return this;
            }

            /**
             * VideoTagsModifyTime.
             */
            public Builder videoTagsModifyTime(String videoTagsModifyTime) {
                this.videoTagsModifyTime = videoTagsModifyTime;
                return this;
            }

            /**
             * VideoTagsStatus.
             */
            public Builder videoTagsStatus(String videoTagsStatus) {
                this.videoTagsStatus = videoTagsStatus;
                return this;
            }

            /**
             * VideoUri.
             */
            public Builder videoUri(String videoUri) {
                this.videoUri = videoUri;
                return this;
            }

            /**
             * VideoWidth.
             */
            public Builder videoWidth(Integer videoWidth) {
                this.videoWidth = videoWidth;
                return this;
            }

            public Videos build() {
                return new Videos(this);
            } 

        } 

    }
}
