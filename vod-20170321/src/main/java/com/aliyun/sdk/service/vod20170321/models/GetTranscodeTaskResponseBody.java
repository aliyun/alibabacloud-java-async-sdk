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
 * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeTaskResponseBody</p>
 */
public class GetTranscodeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistJobIds")
    private java.util.List<String> nonExistJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeJobInfoList")
    private java.util.List<TranscodeJobInfoList> transcodeJobInfoList;

    @com.aliyun.core.annotation.NameInMap("TranscodeTask")
    private TranscodeTask transcodeTask;

    private GetTranscodeTaskResponseBody(Builder builder) {
        this.nonExistJobIds = builder.nonExistJobIds;
        this.requestId = builder.requestId;
        this.transcodeJobInfoList = builder.transcodeJobInfoList;
        this.transcodeTask = builder.transcodeTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistJobIds
     */
    public java.util.List<String> getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeJobInfoList
     */
    public java.util.List<TranscodeJobInfoList> getTranscodeJobInfoList() {
        return this.transcodeJobInfoList;
    }

    /**
     * @return transcodeTask
     */
    public TranscodeTask getTranscodeTask() {
        return this.transcodeTask;
    }

    public static final class Builder {
        private java.util.List<String> nonExistJobIds; 
        private String requestId; 
        private java.util.List<TranscodeJobInfoList> transcodeJobInfoList; 
        private TranscodeTask transcodeTask; 

        /**
         * <p>The nonexistent job ID.</p>
         */
        public Builder nonExistJobIds(java.util.List<String> nonExistJobIds) {
            this.nonExistJobIds = nonExistJobIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F4C6D5BE-BF13-45*****6C-516EA8906DCD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of transcode job information.</p>
         */
        public Builder transcodeJobInfoList(java.util.List<TranscodeJobInfoList> transcodeJobInfoList) {
            this.transcodeJobInfoList = transcodeJobInfoList;
            return this;
        }

        /**
         * <p>Details about transcoding tasks.</p>
         */
        public Builder transcodeTask(TranscodeTask transcodeTask) {
            this.transcodeTask = transcodeTask;
            return this;
        }

        public GetTranscodeTaskResponseBody build() {
            return new GetTranscodeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTaskResponseBody</p>
     */
    public static class OutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamList")
        private String audioStreamList;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("Filesize")
        private Long filesize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("OutputFileUrl")
        private String outputFileUrl;

        @com.aliyun.core.annotation.NameInMap("SubtitleStreamList")
        private String subtitleStreamList;

        @com.aliyun.core.annotation.NameInMap("VideoStreamList")
        private String videoStreamList;

        @com.aliyun.core.annotation.NameInMap("WatermarkIdList")
        private java.util.List<String> watermarkIdList;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private OutputFile(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.encryption = builder.encryption;
            this.filesize = builder.filesize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.outputFileUrl = builder.outputFileUrl;
            this.subtitleStreamList = builder.subtitleStreamList;
            this.videoStreamList = builder.videoStreamList;
            this.watermarkIdList = builder.watermarkIdList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public String getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
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
         * @return outputFileUrl
         */
        public String getOutputFileUrl() {
            return this.outputFileUrl;
        }

        /**
         * @return subtitleStreamList
         */
        public String getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        /**
         * @return videoStreamList
         */
        public String getVideoStreamList() {
            return this.videoStreamList;
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
            private String audioStreamList; 
            private String bitrate; 
            private String duration; 
            private String encryption; 
            private Long filesize; 
            private String format; 
            private String fps; 
            private String height; 
            private String outputFileUrl; 
            private String subtitleStreamList; 
            private String videoStreamList; 
            private java.util.List<String> watermarkIdList; 
            private String width; 

            /**
             * <p>List of audio streams.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;AudioStreamList&quot;: &quot;[{&quot;Bitrate&quot;:&quot;64.533&quot;,&quot;ChannelLayout&quot;:&quot;stereo&quot;,&quot;Channels&quot;:&quot;2&quot;,&quot;CodecLongName&quot;:&quot;AAC (Advanced Audio Coding)&quot;,&quot;CodecName&quot;:&quot;aac&quot;,&quot;CodecTag&quot;:&quot;0x6134706d&quot;,&quot;CodecTagString&quot;:&quot;mp4a&quot;,&quot;CodecTimeBase&quot;:&quot;1/44100&quot;,&quot;Duration&quot;:&quot;12.615533&quot;,&quot;Index&quot;:&quot;1&quot;,&quot;Lang&quot;:&quot;und&quot;,&quot;SampleFmt&quot;:&quot;fltp&quot;,&quot;Samplerate&quot;:&quot;44100&quot;,&quot;StartTime&quot;:&quot;-0.046440&quot;,&quot;Timebase&quot;:&quot;1/44100&quot;}]</p>
             */
            public Builder audioStreamList(String audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>Average bitrate of the transcoded output file. Unit: Kbps.</p>
             * 
             * <strong>example:</strong>
             * <p>964</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>Duration of the transcoded output file. Unit: seconds (s).</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Encryption configuration used for the transcoded output file. Values:</p>
             * <ul>
             * <li>AliyunVoDEncryption: Alibaba Cloud Video Encryption (private encryption).</li>
             * <li>HLSEncryption: HLS standard encryption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EncryptType&quot;:&quot;AliyunVoDEncryption&quot;}</p>
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>Size of the transcoded output file. Unit: bytes (B).</p>
             * 
             * <strong>example:</strong>
             * <p>851076</p>
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * <p>Container format of the transcoded output file.</p>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>Frame rate of the transcoded output file. Unit: frames per second (fps).</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Height of the video frame in the transcoded output file. Unit: pixels (px).</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>OSS address of the transcoded output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-%7BDestMd5%7D-od-S00000001-200000.mp4">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-{DestMd5}-od-S00000001-200000.mp4</a></p>
             */
            public Builder outputFileUrl(String outputFileUrl) {
                this.outputFileUrl = outputFileUrl;
                return this;
            }

            /**
             * <p>List of subtitle streams.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder subtitleStreamList(String subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * <p>List of video streams.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;AvgFPS&quot;:&quot;30.0&quot;,&quot;Bitrate&quot;:&quot;933.814&quot;,&quot;CodecLongName&quot;:&quot;H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10&quot;,&quot;CodecName&quot;:&quot;h264&quot;,&quot;CodecTag&quot;:&quot;0x31637661&quot;,&quot;CodecTagString&quot;:&quot;avc1&quot;,&quot;CodecTimeBase&quot;:&quot;1/60&quot;,&quot;Dar&quot;:&quot;9:16&quot;,&quot;Duration&quot;:&quot;12.033333&quot;,&quot;Fps&quot;:&quot;30.0&quot;,&quot;HasBFrames&quot;:&quot;2&quot;,&quot;Height&quot;:&quot;360&quot;,&quot;Index&quot;:&quot;0&quot;,&quot;Lang&quot;:&quot;und&quot;,&quot;Level&quot;:&quot;30&quot;,&quot;PixFmt&quot;:&quot;yuv420p&quot;,&quot;Profile&quot;:&quot;High&quot;,&quot;Sar&quot;:&quot;81:256&quot;,&quot;StartTime&quot;:&quot;0.000000&quot;,&quot;Timebase&quot;:&quot;1/15360&quot;,&quot;Width&quot;:&quot;640&quot;}]</p>
             */
            public Builder videoStreamList(String videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            /**
             * <p>List of watermarks used for transcoding.</p>
             */
            public Builder watermarkIdList(java.util.List<String> watermarkIdList) {
                this.watermarkIdList = watermarkIdList;
                return this;
            }

            /**
             * <p>Width of the video frame in the transcoded output file. Unit: pixels (px).</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTaskResponseBody</p>
     */
    public static class TranscodeJobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InputFileUrl")
        private String inputFileUrl;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private OutputFile outputFile;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobId")
        private String transcodeJobId;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobStatus")
        private String transcodeJobStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeProgress")
        private Long transcodeProgress;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        private TranscodeJobInfoList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.inputFileUrl = builder.inputFileUrl;
            this.outputFile = builder.outputFile;
            this.priority = builder.priority;
            this.transcodeJobId = builder.transcodeJobId;
            this.transcodeJobStatus = builder.transcodeJobStatus;
            this.transcodeProgress = builder.transcodeProgress;
            this.transcodeTemplateId = builder.transcodeTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobInfoList create() {
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
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
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
         * @return inputFileUrl
         */
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return transcodeJobId
         */
        public String getTranscodeJobId() {
            return this.transcodeJobId;
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

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String definition; 
            private String errorCode; 
            private String errorMessage; 
            private String inputFileUrl; 
            private OutputFile outputFile; 
            private String priority; 
            private String transcodeJobId; 
            private String transcodeJobStatus; 
            private Long transcodeProgress; 
            private String transcodeTemplateId; 

            /**
             * <p>The complete time of the transcoding job. The format is yyyy-MM-dd&quot;T&quot;HH:mm:ssZ (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T08:30:16Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The creation time of the transcoding job. The format is yyyy-MM-dd&quot;T&quot;HH:mm:ssZ (UTC time).</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T08:27:16Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The clarity and audio quality types are defined as follows:</p>
             * <ul>
             * <li>SD: Standard Definition.</li>
             * <li>HD: High Definition.</li>
             * <li>FHD: Full High Definition.</li>
             * <li>OD: Original Definition.</li>
             * <li>2K: 2K.</li>
             * <li>4K: 4K.</li>
             * <li>SQ: Standard Audio Quality.</li>
             * <li>HQ: High Audio Quality.</li>
             * <li>AUTO: Adaptive Bitrate.  This is only available when the transcoding template is configured with packaging settings. Please refer to <a href="https://api.aliyun-inc.com/~~52839~~?spm=openapi-amp.newDocPublishment.0.0.65b0281fNUFIXC">the Transcoding Template Configuration - Package Setting</a> for more details.</li>
             * </ul>
             * <blockquote>
             * <p>This value represents the clarity label configured in the transcoding template and does not indicate the actual resolution range of the transcoded output file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>LD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ErrorMessage</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The OSS address of the source file for transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv</a></p>
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * <p>Information about the transcoded output files.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>The priority of the transcoding task.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the transcode job.</p>
             * 
             * <strong>example:</strong>
             * <p>38f0e513c88*****85515f9d50be188</p>
             */
            public Builder transcodeJobId(String transcodeJobId) {
                this.transcodeJobId = transcodeJobId;
                return this;
            }

            /**
             * <p>The status of the transcoding job:</p>
             * <p>Transcoding: Transcoding in progress.
             * TranscodeSuccess: Transcoding successful.
             * TranscodeFail: Transcoding failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Transcoding</p>
             */
            public Builder transcodeJobStatus(String transcodeJobStatus) {
                this.transcodeJobStatus = transcodeJobStatus;
                return this;
            }

            /**
             * <p>The processing progress of the transcoding job. The value range is [0, 100].</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder transcodeProgress(Long transcodeProgress) {
                this.transcodeProgress = transcodeProgress;
                return this;
            }

            /**
             * <p>The ID of the template used for the transcode job.</p>
             * 
             * <strong>example:</strong>
             * <p>174b0534fea3*****b51c8f0ad1374</p>
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            public TranscodeJobInfoList build() {
                return new TranscodeJobInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTaskResponseBody</p>
     */
    public static class TranscodeJobInfoListOutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamList")
        private String audioStreamList;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("Filesize")
        private Long filesize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("OutputFileUrl")
        private String outputFileUrl;

        @com.aliyun.core.annotation.NameInMap("SubtitleStreamList")
        private String subtitleStreamList;

        @com.aliyun.core.annotation.NameInMap("VideoStreamList")
        private String videoStreamList;

        @com.aliyun.core.annotation.NameInMap("WatermarkIdList")
        private java.util.List<String> watermarkIdList;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private TranscodeJobInfoListOutputFile(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.encryption = builder.encryption;
            this.filesize = builder.filesize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.outputFileUrl = builder.outputFileUrl;
            this.subtitleStreamList = builder.subtitleStreamList;
            this.videoStreamList = builder.videoStreamList;
            this.watermarkIdList = builder.watermarkIdList;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobInfoListOutputFile create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public String getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
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
         * @return outputFileUrl
         */
        public String getOutputFileUrl() {
            return this.outputFileUrl;
        }

        /**
         * @return subtitleStreamList
         */
        public String getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        /**
         * @return videoStreamList
         */
        public String getVideoStreamList() {
            return this.videoStreamList;
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
            private String audioStreamList; 
            private String bitrate; 
            private String duration; 
            private String encryption; 
            private Long filesize; 
            private String format; 
            private String fps; 
            private String height; 
            private String outputFileUrl; 
            private String subtitleStreamList; 
            private String videoStreamList; 
            private java.util.List<String> watermarkIdList; 
            private String width; 

            /**
             * <p>The audio streams.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;AudioStreamList&quot;: &quot;[{&quot;Bitrate&quot;:&quot;64.533&quot;,&quot;ChannelLayout&quot;:&quot;stereo&quot;,&quot;Channels&quot;:&quot;2&quot;,&quot;CodecLongName&quot;:&quot;AAC (Advanced Audio Coding)&quot;,&quot;CodecName&quot;:&quot;aac&quot;,&quot;CodecTag&quot;:&quot;0x6134706d&quot;,&quot;CodecTagString&quot;:&quot;mp4a&quot;,&quot;CodecTimeBase&quot;:&quot;1/44100&quot;,&quot;Duration&quot;:&quot;12.615533&quot;,&quot;Index&quot;:&quot;1&quot;,&quot;Lang&quot;:&quot;und&quot;,&quot;SampleFmt&quot;:&quot;fltp&quot;,&quot;Samplerate&quot;:&quot;44100&quot;,&quot;StartTime&quot;:&quot;-0.046440&quot;,&quot;Timebase&quot;:&quot;1/44100&quot;}]</p>
             */
            public Builder audioStreamList(String audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * <p>The average bitrate of the output file. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>964</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The length of the output file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The encryption method of the output file. Valid values:</p>
             * <ul>
             * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
             * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EncryptType&quot;:&quot;AliyunVoDEncryption&quot;}</p>
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The size of the output file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>851076</p>
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * <p>The container format of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate of the output file. Unit: frames per second.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The height of the output video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The OSS URL of the output file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-%7BDestMd5%7D-od-S00000001-200000.mp4">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-{DestMd5}-od-S00000001-200000.mp4</a></p>
             */
            public Builder outputFileUrl(String outputFileUrl) {
                this.outputFileUrl = outputFileUrl;
                return this;
            }

            /**
             * <p>The subtitle streams.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder subtitleStreamList(String subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * <p>The video streams.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;AvgFPS&quot;:&quot;30.0&quot;,&quot;Bitrate&quot;:&quot;933.814&quot;,&quot;CodecLongName&quot;:&quot;H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10&quot;,&quot;CodecName&quot;:&quot;h264&quot;,&quot;CodecTag&quot;:&quot;0x31637661&quot;,&quot;CodecTagString&quot;:&quot;avc1&quot;,&quot;CodecTimeBase&quot;:&quot;1/60&quot;,&quot;Dar&quot;:&quot;9:16&quot;,&quot;Duration&quot;:&quot;12.033333&quot;,&quot;Fps&quot;:&quot;30.0&quot;,&quot;HasBFrames&quot;:&quot;2&quot;,&quot;Height&quot;:&quot;360&quot;,&quot;Index&quot;:&quot;0&quot;,&quot;Lang&quot;:&quot;und&quot;,&quot;Level&quot;:&quot;30&quot;,&quot;PixFmt&quot;:&quot;yuv420p&quot;,&quot;Profile&quot;:&quot;High&quot;,&quot;Sar&quot;:&quot;81:256&quot;,&quot;StartTime&quot;:&quot;0.000000&quot;,&quot;Timebase&quot;:&quot;1/15360&quot;,&quot;Width&quot;:&quot;640&quot;}]</p>
             */
            public Builder videoStreamList(String videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            /**
             * <p>The IDs of the watermarks used by the output file.</p>
             */
            public Builder watermarkIdList(java.util.List<String> watermarkIdList) {
                this.watermarkIdList = watermarkIdList;
                return this;
            }

            /**
             * <p>The width of the output video. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public TranscodeJobInfoListOutputFile build() {
                return new TranscodeJobInfoListOutputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTaskResponseBody</p>
     */
    public static class TranscodeTaskTranscodeJobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InputFileUrl")
        private String inputFileUrl;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private TranscodeJobInfoListOutputFile outputFile;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobId")
        private String transcodeJobId;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobStatus")
        private String transcodeJobStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeProgress")
        private Long transcodeProgress;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        private TranscodeTaskTranscodeJobInfoList(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.inputFileUrl = builder.inputFileUrl;
            this.outputFile = builder.outputFile;
            this.priority = builder.priority;
            this.transcodeJobId = builder.transcodeJobId;
            this.transcodeJobStatus = builder.transcodeJobStatus;
            this.transcodeProgress = builder.transcodeProgress;
            this.transcodeTemplateId = builder.transcodeTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTaskTranscodeJobInfoList create() {
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
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
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
         * @return inputFileUrl
         */
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        /**
         * @return outputFile
         */
        public TranscodeJobInfoListOutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return transcodeJobId
         */
        public String getTranscodeJobId() {
            return this.transcodeJobId;
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

        public static final class Builder {
            private String completeTime; 
            private String creationTime; 
            private String definition; 
            private String errorCode; 
            private String errorMessage; 
            private String inputFileUrl; 
            private TranscodeJobInfoListOutputFile outputFile; 
            private String priority; 
            private String transcodeJobId; 
            private String transcodeJobStatus; 
            private Long transcodeProgress; 
            private String transcodeTemplateId; 

            /**
             * <p>The time when the transcoding job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T08:30:16Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the transcoding job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T08:27:16Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The video resolution. Valid values:</p>
             * <ul>
             * <li><strong>LD</strong>: low definition</li>
             * <li><strong>SD</strong>: standard definition</li>
             * <li><strong>HD</strong>: high definition</li>
             * <li><strong>FHD</strong>: ultra high definition</li>
             * <li><strong>OD</strong>: original definition</li>
             * <li><strong>2K</strong>: 2K</li>
             * <li><strong>4K</strong>: 4K</li>
             * <li><strong>SQ</strong>: standard sound quality</li>
             * <li><strong>HQ</strong>: high sound quality</li>
             * <li><strong>AUTO</strong>: adaptive bitrate Adaptive bitrate streams are returned only if PackageSetting is set in the transcoding template. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a>.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter indicates the definition that is configured in the transcoding template and does not indicate the actual resolution of the output video.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>LD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
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
             * <p>The Object Storage Service (OSS) URL of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv</a></p>
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * <p>The information about the output file.</p>
             */
            public Builder outputFile(TranscodeJobInfoListOutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>The priority of the transcoding job.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the transcoding job.</p>
             * 
             * <strong>example:</strong>
             * <p>38f0e513c88*****85515f9d50be188</p>
             */
            public Builder transcodeJobId(String transcodeJobId) {
                this.transcodeJobId = transcodeJobId;
                return this;
            }

            /**
             * <p>The status of the transcoding job.</p>
             * <ul>
             * <li><strong>Transcoding</strong></li>
             * <li><strong>TranscodeSuccess</strong></li>
             * <li><strong>TranscodeFail</strong></li>
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
             * <p>The progress of the transcoding job. Valid values: <code>[0,100]</code>.</p>
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
             * <p>174b0534fea3*****b51c8f0ad1374</p>
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            public TranscodeTaskTranscodeJobInfoList build() {
                return new TranscodeTaskTranscodeJobInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTaskResponseBody</p>
     */
    public static class TranscodeTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TranscodeJobInfoList")
        private java.util.List<TranscodeTaskTranscodeJobInfoList> transcodeJobInfoList;

        @com.aliyun.core.annotation.NameInMap("TranscodeTaskId")
        private String transcodeTaskId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private String trigger;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private TranscodeTask(Builder builder) {
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.taskStatus = builder.taskStatus;
            this.transcodeJobInfoList = builder.transcodeJobInfoList;
            this.transcodeTaskId = builder.transcodeTaskId;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
            this.trigger = builder.trigger;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTask create() {
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
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return transcodeJobInfoList
         */
        public java.util.List<TranscodeTaskTranscodeJobInfoList> getTranscodeJobInfoList() {
            return this.transcodeJobInfoList;
        }

        /**
         * @return transcodeTaskId
         */
        public String getTranscodeTaskId() {
            return this.transcodeTaskId;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
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
            private String taskStatus; 
            private java.util.List<TranscodeTaskTranscodeJobInfoList> transcodeJobInfoList; 
            private String transcodeTaskId; 
            private String transcodeTemplateGroupId; 
            private String trigger; 
            private String videoId; 

            /**
             * <p>The time when the transcoding task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:40:12Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the transcoding task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-23T12:35:12Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The status of the transcoding task. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: In progress.</li>
             * <li><strong>Partial</strong>: Some transcoding jobs were complete.</li>
             * <li><strong>CompleteAllSucc</strong>: All transcoding jobs were successful.</li>
             * <li><strong>CompleteAllFail</strong>: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</li>
             * <li><strong>CompletePartialSucc</strong>: All transcoding jobs were complete but only some were successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Processing</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>Details about transcoding jobs.</p>
             */
            public Builder transcodeJobInfoList(java.util.List<TranscodeTaskTranscodeJobInfoList> transcodeJobInfoList) {
                this.transcodeJobInfoList = transcodeJobInfoList;
                return this;
            }

            /**
             * <p>The ID of the transcoding task.</p>
             * 
             * <strong>example:</strong>
             * <p>b1b65ab107e14*****3dbb900f6c1fe0</p>
             */
            public Builder transcodeTaskId(String transcodeTaskId) {
                this.transcodeTaskId = transcodeTaskId;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>b500c7094bd241*****3e9900752d7c3</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * <p>The mode in which the transcoding task is triggered. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: The transcoding task is automatically triggered when the video is uploaded.</li>
             * <li><strong>Manual</strong>: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The ID of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>883f5d98107*****b7f20aaa352f</p>
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public TranscodeTask build() {
                return new TranscodeTask(this);
            } 

        } 

    }
}
