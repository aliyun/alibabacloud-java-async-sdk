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
         * The height of the media stream. Unit: pixels.
         */
        public Builder playInfoList(PlayInfoList playInfoList) {
            this.playInfoList = playInfoList;
            return this;
        }

        /**
         * The information about the audio or video stream.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The width of the media stream. Unit: pixels.
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

        @NameInMap("JobId")
        private String jobId;

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
            this.jobId = builder.jobId;
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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
            private String jobId; 
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
             * 颜色位深
             */
            public Builder bitDepth(Integer bitDepth) {
                this.bitDepth = bitDepth;
                return this;
            }

            /**
             * The format of the media stream. Separate multiple formats with commas (,). Valid values:
             * <p>
             * 
             * *   **mp4**
             * *   **m3u8**
             * *   **mp3**
             * *   **mpd**
             * 
             * > By default, ApsaraVideo VOD returns video streams in all the preceding formats. However, video streams in the MPD format are returned only if the MPD container format is specified in the transcoding template. For more information, see the [Container parameter in the TranscodeTemplate](~~52839~~) table.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * The status of the media stream. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Invisible**
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The color depth. This value must be an integer.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * The encryption type of the media stream. Valid values:
             * <p>
             * 
             * *   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography
             * *   **HLSEncryption**: HTTP Live Streaming (HLS) encryption
             * 
             * > If the encryption type is**AliyunVoDEncryption**, only ApsaraVideo Player SDK can be used to play videos.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The status of the audio or video file. For more information about the value range and description, see the [Status](~~52839~~) table.
             */
            public Builder encrypt(Long encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * The title of the audio or video file.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * Queries the playback URL of a video or audio file by its ID.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The type of the output URL. Default value: oss. Valid values:
             * <p>
             * 
             * *   **oss**
             * *   **cdn**
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * 视频流HDR类型
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * The returned result.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * The type of the media file. Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The validity period of the playback URL. Unit: seconds.
             * <p>
             * 
             * *   If the OutputType parameter is set to **cdn**:
             * 
             *     *   This parameter takes effect only if URL authentication is enabled. Otherwise, the playback URL does not expire.
             *     *   Minimum value: **1**.
             *     *   Maximum value: unlimited.
             *     *   Default value: The default validity period that is specified in URL authentication is used.
             * 
             * *   If the OutputType parameter is set to **oss**:
             * 
             *     *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.
             *     *   Minimum value: **1**.
             *     *   Maximum value: **2592000** (30 days). This limit is imposed to reduce security risks of the origin server.
             *     *   Default value: **3600**.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The type of the data to return. Default value: Single. Valid values:
             * <p>
             * 
             * *   **Single**: Only one latest transcoded stream is returned for each quality and format.
             * *   **Multiple**: All transcoded streams are returned for each quality and format.
             */
            public Builder narrowBandType(String narrowBandType) {
                this.narrowBandType = narrowBandType;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder playURL(String playURL) {
                this.playURL = playURL;
                return this;
            }

            /**
             * The custom playback configuration. The value is a JSON string. For more information, see [PlayConfig](~~86952~~).
             * <p>
             * 
             * > 
             * 
             * *   If you do not specify PlayConfig or `PlayDomain` in PlayConfig, the default domain name configured in ApsaraVideo VOD is used in this operation. If no default domain name is configured, the domain names are queried in reverse chronological order based on the time when the domain names were modified. The domain name that was last modified is used as the streaming domain name. To prevent domain name issues, we recommend that you specify the default streaming domain name. You can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Configuration Management** > **Media Management** > **Storage** > **Manage** > **Origin Domain Name** to set the default streaming domain name.
             * 
             * *   If the `EncryptType` parameter in PlayConfig is set to `AliyunVoDEncryption`, the playback URL of the stream encrypted by using proprietary cryptography is not returned to ensure video security. If you want to return such URL, you must set the `ResultType` parameter to `Multiple`.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The size of the media stream. Unit: bytes.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * The specifications of transcoded audio and video streams. For more information about the valid values, see [Output specifications](~~124671~~).
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The bitrate of the media stream. Unit: Kbit/s.
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * The quality of the video stream. Separate multiple qualities with commas (,). Valid values:
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
             * 
             * > By default, ApsaraVideo VOD returns video streams in all preceding qualities. However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the [PackageSetting parameter in the TranscodeTemplate](~~52839~~) table.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * Indicates whether the video stream was encrypted. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
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
            private String title; 
            private String videoId; 

            /**
             * ApsaraVideo VOD
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The type of the media stream. Separate multiple types with commas (,). Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             * 
             * By default, video and audio streams are returned.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder danMuURL(String danMuURL) {
                this.danMuURL = danMuURL;
                return this;
            }

            /**
             * The ID of the watermark that is associated with the media stream.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The ID of the audio or video file. You can use one of the following methods to obtain the ID of the file:
             * <p>
             * 
             * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
             * *   Obtain the value of the VideoId parameter when you call the [CreateUploadVideo](~~55407~~) operation to upload files.
             * *   Obtain the value of the VideoId parameter by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * The thumbnail URL of the audio or video file.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The format of the media stream.
             * <p>
             * 
             * *   If the media file is a video file, the valid values are **mp4** and **m3u8**.
             * *   If the media file is an audio-only file, the value is **mp3**.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the media stream. If the media stream is a video stream, the value is **video**. If the media stream is an audio-only stream, the value is **audio**.
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
