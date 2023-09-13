// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    @NameInMap("MediaBase")
    private MediaBase mediaBase;

    @NameInMap("PlayInfoList")
    private java.util.List < PlayInfoList> playInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private GetPlayInfoResponseBody(Builder builder) {
        this.mediaBase = builder.mediaBase;
        this.playInfoList = builder.playInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaBase
     */
    public MediaBase getMediaBase() {
        return this.mediaBase;
    }

    /**
     * @return playInfoList
     */
    public java.util.List < PlayInfoList> getPlayInfoList() {
        return this.playInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaBase mediaBase; 
        private java.util.List < PlayInfoList> playInfoList; 
        private String requestId; 

        /**
         * MediaBase.
         */
        public Builder mediaBase(MediaBase mediaBase) {
            this.mediaBase = mediaBase;
            return this;
        }

        /**
         * PlayInfoList.
         */
        public Builder playInfoList(java.util.List < PlayInfoList> playInfoList) {
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

        public GetPlayInfoResponseBody build() {
            return new GetPlayInfoResponseBody(this);
        } 

    } 

    public static class MediaBase extends TeaModel {
        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaTags")
        private String mediaTags;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        private MediaBase(Builder builder) {
            this.cateId = builder.cateId;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.mediaId = builder.mediaId;
            this.mediaTags = builder.mediaTags;
            this.mediaType = builder.mediaType;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBase create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaTags
         */
        public String getMediaTags() {
            return this.mediaTags;
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

        public static final class Builder {
            private Long cateId; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String mediaId; 
            private String mediaTags; 
            private String mediaType; 
            private String status; 
            private String title; 

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaTags.
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
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

            public MediaBase build() {
                return new MediaBase(this);
            } 

        } 

    }
    public static class PlayInfoList extends TeaModel {
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

        @NameInMap("FileURL")
        private String fileURL;

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

        @NameInMap("Status")
        private String status;

        @NameInMap("StreamTags")
        private String streamTags;

        @NameInMap("StreamType")
        private String streamType;

        @NameInMap("TransTemplateType")
        private String transTemplateType;

        @NameInMap("WatermarkId")
        private String watermarkId;

        @NameInMap("Width")
        private Long width;

        private PlayInfoList(Builder builder) {
            this.bitDepth = builder.bitDepth;
            this.bitrate = builder.bitrate;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.duration = builder.duration;
            this.encrypt = builder.encrypt;
            this.encryptType = builder.encryptType;
            this.fileURL = builder.fileURL;
            this.format = builder.format;
            this.fps = builder.fps;
            this.HDRType = builder.HDRType;
            this.height = builder.height;
            this.jobId = builder.jobId;
            this.modificationTime = builder.modificationTime;
            this.narrowBandType = builder.narrowBandType;
            this.playURL = builder.playURL;
            this.size = builder.size;
            this.status = builder.status;
            this.streamTags = builder.streamTags;
            this.streamType = builder.streamType;
            this.transTemplateType = builder.transTemplateType;
            this.watermarkId = builder.watermarkId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayInfoList create() {
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
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamTags
         */
        public String getStreamTags() {
            return this.streamTags;
        }

        /**
         * @return streamType
         */
        public String getStreamType() {
            return this.streamType;
        }

        /**
         * @return transTemplateType
         */
        public String getTransTemplateType() {
            return this.transTemplateType;
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
            private String fileURL; 
            private String format; 
            private String fps; 
            private String HDRType; 
            private Long height; 
            private String jobId; 
            private String modificationTime; 
            private String narrowBandType; 
            private String playURL; 
            private Long size; 
            private String status; 
            private String streamTags; 
            private String streamType; 
            private String transTemplateType; 
            private String watermarkId; 
            private Long width; 

            /**
             * BitDepth.
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
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
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
             * HDRType.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StreamTags.
             */
            public Builder streamTags(String streamTags) {
                this.streamTags = streamTags;
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
             * TransTemplateType.
             */
            public Builder transTemplateType(String transTemplateType) {
                this.transTemplateType = transTemplateType;
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

            public PlayInfoList build() {
                return new PlayInfoList(this);
            } 

        } 

    }
}
