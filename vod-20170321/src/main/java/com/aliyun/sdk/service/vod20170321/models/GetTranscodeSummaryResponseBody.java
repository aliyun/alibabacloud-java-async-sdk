// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeSummaryResponseBody</p>
 */
public class GetTranscodeSummaryResponseBody extends TeaModel {
    @NameInMap("NonExistVideoIds")
    private java.util.List < String > nonExistVideoIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeSummaryList")
    private java.util.List < TranscodeSummaryList> transcodeSummaryList;

    private GetTranscodeSummaryResponseBody(Builder builder) {
        this.nonExistVideoIds = builder.nonExistVideoIds;
        this.requestId = builder.requestId;
        this.transcodeSummaryList = builder.transcodeSummaryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistVideoIds
     */
    public java.util.List < String > getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeSummaryList
     */
    public java.util.List < TranscodeSummaryList> getTranscodeSummaryList() {
        return this.transcodeSummaryList;
    }

    public static final class Builder {
        private java.util.List < String > nonExistVideoIds; 
        private String requestId; 
        private java.util.List < TranscodeSummaryList> transcodeSummaryList; 

        /**
         * NonExistVideoIds.
         */
        public Builder nonExistVideoIds(java.util.List < String > nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
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
         * TranscodeSummaryList.
         */
        public Builder transcodeSummaryList(java.util.List < TranscodeSummaryList> transcodeSummaryList) {
            this.transcodeSummaryList = transcodeSummaryList;
            return this;
        }

        public GetTranscodeSummaryResponseBody build() {
            return new GetTranscodeSummaryResponseBody(this);
        } 

    } 

    public static class TranscodeJobInfoSummaryList extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Filesize")
        private Long filesize;

        @NameInMap("Format")
        private String format;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private String height;

        @NameInMap("TranscodeJobStatus")
        private String transcodeJobStatus;

        @NameInMap("TranscodeProgress")
        private Long transcodeProgress;

        @NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        @NameInMap("WatermarkIdList")
        private java.util.List < String > watermarkIdList;

        @NameInMap("Width")
        private String width;

        private TranscodeJobInfoSummaryList(Builder builder) {
            this.bitrate = builder.bitrate;
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.filesize = builder.filesize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.transcodeJobStatus = builder.transcodeJobStatus;
            this.transcodeProgress = builder.transcodeProgress;
            this.transcodeTemplateId = builder.transcodeTemplateId;
            this.watermarkIdList = builder.watermarkIdList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobInfoSummaryList create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
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
         * @return filesize
         */
        public Long getFilesize() {
            return this.filesize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return transcodeJobStatus
         */
        public String getTranscodeJobStatus() {
            return this.transcodeJobStatus;
        }

        /**
         * @return transcodeProgress
         */
        public Long getTranscodeProgress() {
            return this.transcodeProgress;
        }

        /**
         * @return transcodeTemplateId
         */
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

        /**
         * @return watermarkIdList
         */
        public java.util.List < String > getWatermarkIdList() {
            return this.watermarkIdList;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String completeTime; 
            private String creationTime; 
            private String duration; 
            private String errorCode; 
            private String errorMessage; 
            private Long filesize; 
            private String format; 
            private String fps; 
            private String height; 
            private String transcodeJobStatus; 
            private Long transcodeProgress; 
            private String transcodeTemplateId; 
            private java.util.List < String > watermarkIdList; 
            private String width; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Filesize.
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * TranscodeJobStatus.
             */
            public Builder transcodeJobStatus(String transcodeJobStatus) {
                this.transcodeJobStatus = transcodeJobStatus;
                return this;
            }

            /**
             * TranscodeProgress.
             */
            public Builder transcodeProgress(Long transcodeProgress) {
                this.transcodeProgress = transcodeProgress;
                return this;
            }

            /**
             * TranscodeTemplateId.
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            /**
             * WatermarkIdList.
             */
            public Builder watermarkIdList(java.util.List < String > watermarkIdList) {
                this.watermarkIdList = watermarkIdList;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public TranscodeJobInfoSummaryList build() {
                return new TranscodeJobInfoSummaryList(this);
            } 

        } 

    }
    public static class TranscodeSummaryList extends TeaModel {
        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("TranscodeJobInfoSummaryList")
        private java.util.List < TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList;

        @NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @NameInMap("VideoId")
        private String videoId;

        private TranscodeSummaryList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.transcodeJobInfoSummaryList = builder.transcodeJobInfoSummaryList;
            this.transcodeStatus = builder.transcodeStatus;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeSummaryList create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return transcodeJobInfoSummaryList
         */
        public java.util.List < TranscodeJobInfoSummaryList> getTranscodeJobInfoSummaryList() {
            return this.transcodeJobInfoSummaryList;
        }

        /**
         * @return transcodeStatus
         */
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private java.util.List < TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList; 
            private String transcodeStatus; 
            private String transcodeTemplateGroupId; 
            private String videoId; 

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * TranscodeJobInfoSummaryList.
             */
            public Builder transcodeJobInfoSummaryList(java.util.List < TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList) {
                this.transcodeJobInfoSummaryList = transcodeJobInfoSummaryList;
                return this;
            }

            /**
             * TranscodeStatus.
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * TranscodeTemplateGroupId.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TranscodeSummaryList build() {
                return new TranscodeSummaryList(this);
            } 

        } 

    }
}
