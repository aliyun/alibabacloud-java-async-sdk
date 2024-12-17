// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetTranscodeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeSummaryResponseBody</p>
 */
public class GetTranscodeSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistVideoIds")
    private java.util.List<String> nonExistVideoIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeSummaryList")
    private java.util.List<TranscodeSummaryList> transcodeSummaryList;

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
    public java.util.List<String> getNonExistVideoIds() {
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
    public java.util.List<TranscodeSummaryList> getTranscodeSummaryList() {
        return this.transcodeSummaryList;
    }

    public static final class Builder {
        private java.util.List<String> nonExistVideoIds; 
        private String requestId; 
        private java.util.List<TranscodeSummaryList> transcodeSummaryList; 

        /**
         * <p>The IDs of the audio or video files that do not exist.</p>
         */
        public Builder nonExistVideoIds(java.util.List<String> nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transcoding summary of the file.</p>
         */
        public Builder transcodeSummaryList(java.util.List<TranscodeSummaryList> transcodeSummaryList) {
            this.transcodeSummaryList = transcodeSummaryList;
            return this;
        }

        public GetTranscodeSummaryResponseBody build() {
            return new GetTranscodeSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranscodeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeSummaryResponseBody</p>
     */
    public static class TranscodeJobInfoSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Filesize")
        private Long filesize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobStatus")
        private String transcodeJobStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeProgress")
        private Long transcodeProgress;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        @com.aliyun.core.annotation.NameInMap("WatermarkIdList")
        private java.util.List<String> watermarkIdList;

        @com.aliyun.core.annotation.NameInMap("Width")
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
        public java.util.List<String> getWatermarkIdList() {
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
            private java.util.List<String> watermarkIdList; 
            private String width; 

            /**
             * <p>The average bitrate of the output video. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>749</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The time when the transcoding job was complete. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T03:40:51Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the transcoding job was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T03:34:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The duration of the output video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The error code returned when the transcoding job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the transcoding job failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ErrorMessage</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The size of the output video. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1144259</p>
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * <p>The container format of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate of the output video. Unit: frames per second.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the output video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>960</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The status of the transcoding job. Valid values:</p>
             * <ul>
             * <li><strong>Transcoding</strong>: Transcoding is in process.</li>
             * <li><strong>TranscodeSuccess</strong>: The job was successful.</li>
             * <li><strong>TranscodeFail</strong>: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Transcoding</p>
             */
            public Builder transcodeJobStatus(String transcodeJobStatus) {
                this.transcodeJobStatus = transcodeJobStatus;
                return this;
            }

            /**
             * <p>The transcoding progress. Valid values: <code>[0,100]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder transcodeProgress(Long transcodeProgress) {
                this.transcodeProgress = transcodeProgress;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>57496724ae2*****0968d6e08acc8f6</p>
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            /**
             * <p>The IDs of the watermarks that are applied to the output video.</p>
             */
            public Builder watermarkIdList(java.util.List<String> watermarkIdList) {
                this.watermarkIdList = watermarkIdList;
                return this;
            }

            /**
             * <p>The width of the output video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>544</p>
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
    /**
     * 
     * {@link GetTranscodeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeSummaryResponseBody</p>
     */
    public static class TranscodeSummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobInfoSummaryList")
        private java.util.List<TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList;

        @com.aliyun.core.annotation.NameInMap("TranscodeStatus")
        private String transcodeStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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
        public java.util.List<TranscodeJobInfoSummaryList> getTranscodeJobInfoSummaryList() {
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
            private java.util.List<TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList; 
            private String transcodeStatus; 
            private String transcodeTemplateGroupId; 
            private String videoId; 

            /**
             * <p>The time when the transcoding task was complete. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:40:12Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the transcoding task was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:35:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The summaries of transcoding jobs.</p>
             */
            public Builder transcodeJobInfoSummaryList(java.util.List<TranscodeJobInfoSummaryList> transcodeJobInfoSummaryList) {
                this.transcodeJobInfoSummaryList = transcodeJobInfoSummaryList;
                return this;
            }

            /**
             * <p>The status of the transcoding task. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: Transcoding is in process.</li>
             * <li><strong>Partial</strong>: Some transcoding jobs were complete.</li>
             * <li><strong>CompleteAllSucc</strong>: All transcoding jobs were successful.</li>
             * <li><strong>CompleteAllFail</strong>: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</li>
             * <li><strong>CompletePartialSucc</strong>: All transcoding jobs were complete but only some were successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder transcodeStatus(String transcodeStatus) {
                this.transcodeStatus = transcodeStatus;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>44f9e406bbb*****736a9abe876ecc0</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * <p>The ID of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>e1db68cc586644b83e562bcd94****</p>
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
