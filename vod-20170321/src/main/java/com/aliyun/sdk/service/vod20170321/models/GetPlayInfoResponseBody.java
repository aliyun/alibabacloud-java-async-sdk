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
 * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPlayInfoResponseBody</p>
 */
public class GetPlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlayInfoList")
    private PlayInfoList playInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoBase")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPlayInfoResponseBody model) {
            this.playInfoList = model.playInfoList;
            this.requestId = model.requestId;
            this.videoBase = model.videoBase;
        } 

        /**
         * PlayInfoList.
         */
        public Builder playInfoList(PlayInfoList playInfoList) {
            this.playInfoList = playInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F552E596-967D-5500-842F-17E6364****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The basic information about the audio or video file.</p>
         */
        public Builder videoBase(VideoBase videoBase) {
            this.videoBase = videoBase;
            return this;
        }

        public GetPlayInfoResponseBody build() {
            return new GetPlayInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPlayInfoResponseBody</p>
     */
    public static class PlayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BitDepth")
        private Integer bitDepth;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CodecName")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Long encrypt;

        @com.aliyun.core.annotation.NameInMap("EncryptMode")
        private String encryptMode;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("HDRType")
        private String HDRType;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("JobExt")
        private String jobExt;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("NarrowBandType")
        private String narrowBandType;

        @com.aliyun.core.annotation.NameInMap("PlayURL")
        private String playURL;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Long width;

        private PlayInfo(Builder builder) {
            this.bitDepth = builder.bitDepth;
            this.bitrate = builder.bitrate;
            this.codecName = builder.codecName;
            this.creationTime = builder.creationTime;
            this.definition = builder.definition;
            this.duration = builder.duration;
            this.encrypt = builder.encrypt;
            this.encryptMode = builder.encryptMode;
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
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
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
         * @return encryptMode
         */
        public String getEncryptMode() {
            return this.encryptMode;
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
            private String codecName; 
            private String creationTime; 
            private String definition; 
            private String duration; 
            private Long encrypt; 
            private String encryptMode; 
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

            private Builder() {
            } 

            private Builder(PlayInfo model) {
                this.bitDepth = model.bitDepth;
                this.bitrate = model.bitrate;
                this.codecName = model.codecName;
                this.creationTime = model.creationTime;
                this.definition = model.definition;
                this.duration = model.duration;
                this.encrypt = model.encrypt;
                this.encryptMode = model.encryptMode;
                this.encryptType = model.encryptType;
                this.format = model.format;
                this.fps = model.fps;
                this.HDRType = model.HDRType;
                this.height = model.height;
                this.jobExt = model.jobExt;
                this.jobId = model.jobId;
                this.jobType = model.jobType;
                this.modificationTime = model.modificationTime;
                this.narrowBandType = model.narrowBandType;
                this.playURL = model.playURL;
                this.size = model.size;
                this.specification = model.specification;
                this.status = model.status;
                this.streamType = model.streamType;
                this.watermarkId = model.watermarkId;
                this.width = model.width;
            } 

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
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
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
             * EncryptMode.
             */
            public Builder encryptMode(String encryptMode) {
                this.encryptMode = encryptMode;
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
             * JobExt.
             */
            public Builder jobExt(String jobExt) {
                this.jobExt = jobExt;
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
             * JobType.
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
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
    /**
     * 
     * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPlayInfoResponseBody</p>
     */
    public static class PlayInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlayInfo")
        private java.util.List<PlayInfo> playInfo;

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
        public java.util.List<PlayInfo> getPlayInfo() {
            return this.playInfo;
        }

        public static final class Builder {
            private java.util.List<PlayInfo> playInfo; 

            private Builder() {
            } 

            private Builder(PlayInfoList model) {
                this.playInfo = model.playInfo;
            } 

            /**
             * PlayInfo.
             */
            public Builder playInfo(java.util.List<PlayInfo> playInfo) {
                this.playInfo = playInfo;
                return this;
            }

            public PlayInfoList build() {
                return new PlayInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPlayInfoResponseBody</p>
     */
    public static class VideoBase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DanMuURL")
        private String danMuURL;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoId")
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

            private Builder() {
            } 

            private Builder(VideoBase model) {
                this.coverURL = model.coverURL;
                this.creationTime = model.creationTime;
                this.danMuURL = model.danMuURL;
                this.duration = model.duration;
                this.mediaType = model.mediaType;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.title = model.title;
                this.videoId = model.videoId;
            } 

            /**
             * <p>The URL of the thumbnail for the audio or video file.</p>
             * <blockquote>
             * <p>If you need to obtain the thumbnail URL in real time after a video is uploaded, you can configure an ApsaraVideo VOD callback. For more information, refer to <a href="https://help.aliyun.com/document_detail/67214.html">HTTP callbacks</a> and <a href="https://help.aliyun.com/document_detail/57337.html">Video snapshot completion event</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/sample.jpg?auth_key=2333232-atb">http://example.aliyundoc.com/sample.jpg?auth_key=2333232-atb</a>****</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the audio or video file was created. The time follows the ISO 8601 standard in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-26T06:38:48Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The URL of the live comment mask data.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/****?auth_key=abdf2123-6783232">http://example.aliyundoc.com/****?auth_key=abdf2123-6783232</a>****</p>
             */
            public Builder danMuURL(String danMuURL) {
                this.danMuURL = danMuURL;
                return this;
            }

            /**
             * <p>The duration of the audio or video file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3.1667</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The type of the media file. Valid values:</p>
             * <ul>
             * <li><strong>video</strong>: video.</li>
             * <li><strong>audio</strong>: audio-only.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The status of the audio or video file. For more information about the valid values and descriptions, refer to <a href="~~52839#title-vqg-8cz-7p8~~">Status: media status</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The media storage type. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: standard.</li>
             * <li><strong>IA</strong>: infrequent access for media assets.</li>
             * <li><strong>Archive</strong>: archive for media assets.</li>
             * <li><strong>ColdArchive</strong>: cold archive for media assets.</li>
             * <li><strong>SourceIA</strong>: infrequent access for mezzanine files.</li>
             * <li><strong>SourceArchive</strong>: archive for mezzanine files.</li>
             * <li><strong>SourceColdArchive</strong>: cold archive for mezzanine files.</li>
             * <li><strong>Changing</strong>: the storage type of the media asset is being changed.</li>
             * <li><strong>SourceChanging</strong>: the storage type of the mezzanine file is being changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The title of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraVideo VOD</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the audio or video file.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f654b6e91d24d81d44****</p>
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
