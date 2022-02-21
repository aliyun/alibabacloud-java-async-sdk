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
         * PlayInfoList.
         */
        public Builder playInfoList(PlayInfoList playInfoList) {
            this.playInfoList = playInfoList;
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
         * VideoBase.
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
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
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
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
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
             * Encrypt.
             */
            public Builder encrypt(Long encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
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
             * 视频流HDR类型
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * NarrowBandType.
             */
            public Builder narrowBandType(String narrowBandType) {
                this.narrowBandType = narrowBandType;
                return this;
            }

            /**
             * PlayURL.
             */
            public Builder playURL(String playURL) {
                this.playURL = playURL;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * WatermarkId.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * Width.
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
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
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
             * DanMuURL.
             */
            public Builder danMuURL(String danMuURL) {
                this.danMuURL = danMuURL;
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
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * VideoId.
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
