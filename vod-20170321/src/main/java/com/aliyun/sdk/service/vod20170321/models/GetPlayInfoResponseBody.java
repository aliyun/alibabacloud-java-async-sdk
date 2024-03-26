// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPlayInfoResponseBody</p>
 */
public class GetPlayInfoResponseBody extends TeaModel {
    @NameInMap("PlayInfoList")
    private PlayInfoList playInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoBase")
    private VideoBase videoBase;

    private GetPlayInfoResponseBody(Builder builder) {
        this.playInfoList = builder.playInfoList;
        this.requestId = builder.requestId;
        this.videoBase = builder.videoBase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return playInfoList
     */
    public PlayInfoList getPlayInfoList() {
        return this.playInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoBase
     */
    public VideoBase getVideoBase() {
        return this.videoBase;
    }

    public static final class Builder {
        private PlayInfoList playInfoList; 
        private String requestId; 
        private VideoBase videoBase; 

        /**
         * The information about the audio or video stream.
         */
        public Builder playInfoList(PlayInfoList playInfoList) {
            this.playInfoList = playInfoList;
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
         * The basic information about the audio or video file.
         */
        public Builder videoBase(VideoBase videoBase) {
            this.videoBase = videoBase;
            return this;
        }

        public GetPlayInfoResponseBody build() {
            return new GetPlayInfoResponseBody(this);
        } 

    } 

    public static class PlayInfo extends TeaModel {
        @NameInMap("BitDepth")
        private Integer bitDepth;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Definition")
        private String definition;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Encrypt")
        private Long encrypt;

        @NameInMap("EncryptType")
        private String encryptType;

        @NameInMap("Format")
        private String format;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("HDRType")
        private String HDRType;

        @NameInMap("Height")
        private Long height;

        @NameInMap("JobExt")
        private String jobExt;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobType")
        private Integer jobType;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("NarrowBandType")
        private String narrowBandType;

        @NameInMap("PlayURL")
        private String playURL;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("Status")
        private String status;

        @NameInMap("StreamType")
        private String streamType;

        @NameInMap("WatermarkId")
        private String watermarkId;

        @NameInMap("Width")
        private Long width;

        private PlayInfo(Builder builder) {
            this.bitDepth = builder.bitDepth;
            this.bitrate = builder.bitrate;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.duration = builder.duration;
            this.encrypt = builder.encrypt;
            this.encryptType = builder.encryptType;
            this.format = builder.format;
            this.fps = builder.fps;
            this.HDRType = builder.HDRType;
            this.height = builder.height;
            this.jobExt = builder.jobExt;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.modificationTime = builder.modificationTime;
            this.narrowBandType = builder.narrowBandType;
            this.playURL = builder.playURL;
            this.size = builder.size;
            this.specification = builder.specification;
            this.status = builder.status;
            this.streamType = builder.streamType;
            this.watermarkId = builder.watermarkId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfo create() {
            return builder().build();
        }

        /**
         * @return bitDepth
         */
        public Integer getBitDepth() {
            return this.bitDepth;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
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
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return encrypt
         */
        public Long getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
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
         * @return HDRType
         */
        public String getHDRType() {
            return this.HDRType;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return jobExt
         */
        public String getJobExt() {
            return this.jobExt;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return narrowBandType
         */
        public String getNarrowBandType() {
            return this.narrowBandType;
        }

        /**
         * @return playURL
         */
        public String getPlayURL() {
            return this.playURL;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer bitDepth; 
            private String bitrate; 
            private String creationTime; 
            private String definition; 
            private String duration; 
            private Long encrypt; 
            private String encryptType; 
            private String format; 
            private String fps; 
            private String HDRType; 
            private Long height; 
            private String jobExt; 
            private String jobId; 
            private Integer jobType; 
            private String modificationTime; 
            private String narrowBandType; 
            private String playURL; 
            private Long size; 
            private String specification; 
            private String status; 
            private String streamType; 
            private String watermarkId; 
            private Long width; 

            /**
             * The color depth. This value is an integer.
             */
            public Builder bitDepth(Integer bitDepth) {
                this.bitDepth = bitDepth;
                return this;
            }

            /**
             * The bitrate of the media stream. Unit: Kbit/s.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The time when the audio or video stream was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The quality of the media stream. Valid values:
             * <p>
             * 
             * *   **FD**: low definition
             * *   **LD**: standard definition
             * *   **SD**: high definition
             * *   **HD**: ultra-high definition
             * *   **OD**: original definition
             * *   **2K**: 2K
             * *   **4K**: 4K
             * *   **SQ**: standard sound quality
             * *   **HQ**: high sound quality
             * *   **AUTO**: adaptive bitrate
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * The duration of the media stream. Unit: seconds. 86,400 seconds is equivalent to 24 hours.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Indicates whether the media stream is encrypted. Valid values:
             * <p>
             * 
             * *   **0**: The media stream is not encrypted.
             * *   **1**: The media stream is encrypted.
             */
            public Builder encrypt(Long encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * The encryption type of the media stream. Valid values:
             * <p>
             * 
             * *   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography
             * *   **HLSEncryption**: HTTP Live Streaming (HLS) encryption
             * 
             * >  If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * The format of the media stream.
             * <p>
             * 
             * *   If the media file is a video file, the valid values are **mp4** and **m3u8**.
             * *   If the media file is an audio-only file, the value is **mp3**.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The frame rate of the media stream. Unit: frames per second.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * The HDR type of the media stream. Valid values:
             * <p>
             * 
             * *   HDR
             * *   HDR10
             * *   HLG
             * *   DolbyVision
             * *   HDRVivid
             * *   SDR+
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * The height of the media stream. Unit: pixels.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * The custom watermark information of the copyright watermark. This parameter is returned if you set `JobType` to `2`.
             */
            public Builder jobExt(String jobExt) {
                this.jobExt = jobExt;
                return this;
            }

            /**
             * The job ID for transcoding the media stream. This ID uniquely identifies a media stream.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The type of the digital watermark. Valid values:
             * <p>
             * 
             * *   **1**: tracing watermark
             * *   **2**: copyright watermark
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * The time when the audio or video file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The type of Narrowband HD transcoding. Valid values:
             * <p>
             * 
             * *   **0**: normal transcoding
             * *   **1.0**: Narrowband HD 1.0
             * *   **2.0**: Narrowband HD 2.0
             * 
             * This parameter is returned only when a quality that is available in the built-in Narrowband HD 1.0 transcoding template is specified. For more information, see the [Definition parameter in the TranscodeTemplate](~~52839~~) table.
             */
            public Builder narrowBandType(String narrowBandType) {
                this.narrowBandType = narrowBandType;
                return this;
            }

            /**
             * The playback URL of the media stream.
             */
            public Builder playURL(String playURL) {
                this.playURL = playURL;
                return this;
            }

            /**
             * The size of the media stream. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The specifications of transcoded audio and video streams. For more information about the valid values, see [Output specifications](~~124671~~).
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * The status of the audio or video stream. Valid values:
             * <p>
             * 
             * *   **Normal**: The latest transcoded stream in each quality and format is in the Normal status.
             * *   **Invisible**: If multiple streams are transcoded in the same quality and format, the latest transcoded stream is in the Normal status and other streams are in the Invisible status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the media stream. If the media stream is a video stream, the value is **video**. If the media stream is an audio-only stream, the value is **audio**.
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * The ID of the watermark that is associated with the media stream.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * The width of the media stream. Unit: pixels.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public PlayInfo build() {
                return new PlayInfo(this);
            } 

        } 

    }
    public static class PlayInfoList extends TeaModel {
        @NameInMap("PlayInfo")
        private java.util.List < PlayInfo> playInfo;

        private PlayInfoList(Builder builder) {
            this.playInfo = builder.playInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfoList create() {
            return builder().build();
        }

        /**
         * @return playInfo
         */
        public java.util.List < PlayInfo> getPlayInfo() {
            return this.playInfo;
        }

        public static final class Builder {
            private java.util.List < PlayInfo> playInfo; 

            /**
             * PlayInfo.
             */
            public Builder playInfo(java.util.List < PlayInfo> playInfo) {
                this.playInfo = playInfo;
                return this;
            }

            public PlayInfoList build() {
                return new PlayInfoList(this);
            } 

        } 

    }
    public static class VideoBase extends TeaModel {
        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DanMuURL")
        private String danMuURL;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoId")
        private String videoId;

        private VideoBase(Builder builder) {
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.danMuURL = builder.danMuURL;
            this.duration = builder.duration;
            this.mediaType = builder.mediaType;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.title = builder.title;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoBase create() {
            return builder().build();
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return danMuURL
         */
        public String getDanMuURL() {
            return this.danMuURL;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String coverURL; 
            private String creationTime; 
            private String danMuURL; 
            private String duration; 
            private String mediaType; 
            private String status; 
            private String storageClass; 
            private String title; 
            private String videoId; 

            /**
             * The thumbnail URL of the audio or video file.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The URL of the masked live comment data.
             */
            public Builder danMuURL(String danMuURL) {
                this.danMuURL = danMuURL;
                return this;
            }

            /**
             * The duration of the audio or video file. Unit: seconds.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The type of the media file. Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The storage class of the audio or video file. Valid values:
             * <p>
             * 
             * *   **Standard**: All media resources are stored as Standard objects.
             * *   **IA**: All media resources are stored as IA objects.
             * *   **Archive**: All media resources are stored as Archive objects.
             * *   **ColdArchive**: All media resources are stored as Cold Archive objects.
             * *   **SourceIA**: Only the source files are IA objects.
             * *   **SourceArchive**: Only the source files are Archive objects.
             * *   **SourceColdArchive**: Only the source files are Cold Archive objects.
             * *   **Changing**: The storage class of the audio or video file is being changed.
             * *   **SourceChanging**: The storage class of the source file is being changed.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The title of the audio or video file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The ID of the media file.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public VideoBase build() {
                return new VideoBase(this);
            } 

        } 

    }
}
