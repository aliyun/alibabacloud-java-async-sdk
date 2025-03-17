// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    @com.aliyun.core.annotation.NameInMap("MediaBase")
    private MediaBase mediaBase;

    @com.aliyun.core.annotation.NameInMap("PlayInfoList")
    private java.util.List<PlayInfoList> playInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PlayInfoList> getPlayInfoList() {
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
        private java.util.List<PlayInfoList> playInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPlayInfoResponseBody model) {
            this.mediaBase = model.mediaBase;
            this.playInfoList = model.playInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the media asset.</p>
         */
        public Builder mediaBase(MediaBase mediaBase) {
            this.mediaBase = mediaBase;
            return this;
        }

        /**
         * <p>The information about the audio or video stream.</p>
         */
        public Builder playInfoList(java.util.List<PlayInfoList> playInfoList) {
            this.playInfoList = playInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class MediaBase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaTags")
        private String mediaTags;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
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

            private Builder() {
            } 

            private Builder(MediaBase model) {
                this.cateId = model.cateId;
                this.coverURL = model.coverURL;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.mediaId = model.mediaId;
                this.mediaTags = model.mediaTags;
                this.mediaType = model.mediaType;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
             * <ul>
             * <li>Log on to the <a href="https://ims.console.aliyun.com">Intelligent Media Services (IMS) console</a> and choose <strong>Media Asset Management</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
             * <li>View the value of the CateId parameter returned by the AddCategory operation that you called to create a category.</li>
             * <li>View the value of the CateId parameter returned by the GetCategories operation that you called to query a category.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4220</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The URL of the thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p>https://***.oss-cn-shanghai.aliyuncs.com/cover/281c64d6-b5fb-4c57-97cd-84da56a8b151_large_cover_url.jpg</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the media asset was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-22T10:07:31+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The content description.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2eea77a61c7b4ddd95bec34a6f65b***</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The tags.</p>
             * <ul>
             * <li>Up to 16 tags are supported.</li>
             * <li>Multiple tags are separated by commas (,).</li>
             * <li>Each tag can be up to 32 bytes in length.</li>
             * <li>The value is encoded in UTF-8.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test,ccc</p>
             */
            public Builder mediaTags(String mediaTags) {
                this.mediaTags = mediaTags;
                return this;
            }

            /**
             * <p>The type of the media asset. Valid values:</p>
             * <p>video audio</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The resource status. Valid values:</p>
             * <p>Init: the initial state, which indicates that the source file is not ready.</p>
             * <p>Preparing: The source file is being prepared. For example, the file is being uploaded or edited.</p>
             * <p>PrepareFail: The source file failed to be prepared. For example, the information of the source file failed to be obtained.</p>
             * <p>Normal: The source file is ready.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>testTitle</p>
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
    /**
     * 
     * {@link GetPlayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPlayInfoResponseBody</p>
     */
    public static class PlayInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BitDepth")
        private Integer bitDepth;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Long encrypt;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("HDRType")
        private String HDRType;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("NarrowBandType")
        private String narrowBandType;

        @com.aliyun.core.annotation.NameInMap("PlayURL")
        private String playURL;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamTags")
        private String streamTags;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private String streamType;

        @com.aliyun.core.annotation.NameInMap("TransTemplateType")
        private String transTemplateType;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        @com.aliyun.core.annotation.NameInMap("Width")
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

            private Builder() {
            } 

            private Builder(PlayInfoList model) {
                this.bitDepth = model.bitDepth;
                this.bitrate = model.bitrate;
                this.creationTime = model.creationTime;
                this.definition = model.definition;
                this.duration = model.duration;
                this.encrypt = model.encrypt;
                this.encryptType = model.encryptType;
                this.fileURL = model.fileURL;
                this.format = model.format;
                this.fps = model.fps;
                this.HDRType = model.HDRType;
                this.height = model.height;
                this.jobId = model.jobId;
                this.modificationTime = model.modificationTime;
                this.narrowBandType = model.narrowBandType;
                this.playURL = model.playURL;
                this.size = model.size;
                this.status = model.status;
                this.streamTags = model.streamTags;
                this.streamType = model.streamType;
                this.transTemplateType = model.transTemplateType;
                this.watermarkId = model.watermarkId;
                this.width = model.width;
            } 

            /**
             * <p>The color depth.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder bitDepth(Integer bitDepth) {
                this.bitDepth = bitDepth;
                return this;
            }

            /**
             * <p>The bitrate of the media stream. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The time when the media stream was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-10T02:28:49Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The quality of the media stream. Valid values:</p>
             * <ul>
             * <li><strong>FD</strong>: low definition</li>
             * <li><strong>LD</strong>: standard definition</li>
             * <li><strong>SD</strong>: high definition</li>
             * <li><strong>HD</strong>: ultra-high definition</li>
             * <li><strong>OD</strong>: original definition</li>
             * <li><strong>2K</strong></li>
             * <li><strong>4K</strong></li>
             * <li><strong>SQ</strong>: standard sound quality</li>
             * <li><strong>HQ</strong>: high sound quality</li>
             * <li><strong>AUTO</strong>: adaptive bitrate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The duration of the media stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>9.0464</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Indicates whether the media stream is encrypted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The media stream is not encrypted.</li>
             * <li><strong>1</strong>: The media stream is encrypted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder encrypt(Long encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * <p>The encryption type of the media stream. Valid values:</p>
             * <ul>
             * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
             * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
             * </ul>
             * <blockquote>
             * <p> If the encryption type is AliyunVoDEncryption, only ApsaraVideo Player SDK can be used to play videos.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AliyunVoDEncryption</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The OSS URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/sv/43a68ee9-181809b6aba/43a68ee9-181809b6aba.mpeg">http://outin-***.oss-cn-shanghai.aliyuncs.com/sv/43a68ee9-181809b6aba/43a68ee9-181809b6aba.mpeg</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The format of the media stream.</p>
             * <ul>
             * <li>If the media asset is a video file, the valid values are <strong>mp4</strong> and <strong>m3u8</strong>.</li>
             * <li>If the media asset is an audio-only file, the value is <strong>mp3</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The frame rate of the media stream. Unit: frames per second (FPS).</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The high dynamic range (HDR) type of the media stream. Valid values:</p>
             * <ul>
             * <li>HDR</li>
             * <li>HDR10</li>
             * <li>HLG</li>
             * <li>DolbyVision</li>
             * <li>HDRVivid</li>
             * <li>SDR+</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HDR</p>
             */
            public Builder HDRType(String HDRType) {
                this.HDRType = HDRType;
                return this;
            }

            /**
             * <p>The height of the media stream. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36c9d38e70bf43ed9f7f8f48d6356***</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The time when the media stream was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-13T11:39:41.714+08:00</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The type of Narrowband HD™ transcoding. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: standard transcoding</li>
             * <li><strong>1.0</strong>: Narrowband HD™ 1.0 transcoding</li>
             * <li><strong>2.0</strong>: Narrowband HD™ 2.0 transcoding</li>
             * </ul>
             * <p>This parameter is returned only when a definition that is available in the built-in Narrowband HD™ 1.0 transcoding template is specified. For more information, see the <a href="https://help.aliyun.com/document_detail/52839.html">Definition parameter in TranscodeTemplate</a> table.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder narrowBandType(String narrowBandType) {
                this.narrowBandType = narrowBandType;
                return this;
            }

            /**
             * <p>The playback URL of the media stream.</p>
             * 
             * <strong>example:</strong>
             * <p>https://***.aliyuncdn.com/sv/756bee1-17f980f0945/756bee1-17f980f0945.mp4</p>
             */
            public Builder playURL(String playURL) {
                this.playURL = playURL;
                return this;
            }

            /**
             * <p>The size of the media stream. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>418112</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the media stream. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>Invisible</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the media stream, which are used to identify the transcoding type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;ims.audioServiceType&quot;: &quot;AudioEnhancement&quot;}&quot;</p>
             */
            public Builder streamTags(String streamTags) {
                this.streamTags = streamTags;
                return this;
            }

            /**
             * <p>The type of the media stream. If the media stream is a video stream, the value is <strong>video</strong>. If the media stream is an audio-only stream, the value is <strong>audio</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder streamType(String streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The type of the transcoding template. Valid values:</p>
             * <ul>
             * <li>Normal: standard transcoding</li>
             * <li>AudioTranscode: audio transcoding</li>
             * <li>Remux: container format conversion</li>
             * <li>NarrowBandV1: Narrowband HD™ 1.0</li>
             * <li>NarrowBandV2: Narrowband HD™ 2.0</li>
             * <li>UHD: audio and video enhancement (ultra-high definition)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder transTemplateType(String transTemplateType) {
                this.transTemplateType = transTemplateType;
                return this;
            }

            /**
             * <p>The ID of the watermark that is associated with the media stream.</p>
             * 
             * <strong>example:</strong>
             * <p>5bed88672b1e2520ead228935ed51***</p>
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            /**
             * <p>The width of the media stream. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
