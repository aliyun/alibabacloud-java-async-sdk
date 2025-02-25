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
 * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscodeJobsResponseBody</p>
 */
public class ListTranscodeJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTranscodeJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscodeJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * <p>The list of jobs.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The token of the next page is returned after you call this operation for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>019daf5780f74831b0e1a767c9f1c178</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTranscodeJobsResponseBody build() {
            return new ListTranscodeJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class InputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InputGroup(Builder builder) {
            this.inputUrl = builder.inputUrl;
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputGroup create() {
            return builder().build();
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String inputUrl; 
            private String media; 
            private String type; 

            /**
             * <p>The URL of the media asset. This parameter is specified only when the media asset is transcoded.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The media object.</p>
             * <ul>
             * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
             * <li>If Type is set to Media, the ID of a media asset is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an Object Storage Service (OSS) object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InputGroup build() {
                return new InputGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.outputUrl = builder.outputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String outputUrl; 
            private String type; 

            /**
             * <p>The media object. If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported. If Type is set to Media, the ID of a media asset is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The URL of the transcoded output stream. This parameter is required only when the output is a media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/{MediaId}/{JobId}.mp4</p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class CombineConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioIndex")
        @com.aliyun.core.annotation.Validation(required = true)
        private String audioIndex;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Double start;

        @com.aliyun.core.annotation.NameInMap("VideoIndex")
        @com.aliyun.core.annotation.Validation(required = true)
        private String videoIndex;

        private CombineConfigs(Builder builder) {
            this.audioIndex = builder.audioIndex;
            this.duration = builder.duration;
            this.start = builder.start;
            this.videoIndex = builder.videoIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CombineConfigs create() {
            return builder().build();
        }

        /**
         * @return audioIndex
         */
        public String getAudioIndex() {
            return this.audioIndex;
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public Double getStart() {
            return this.start;
        }

        /**
         * @return videoIndex
         */
        public String getVideoIndex() {
            return this.videoIndex;
        }

        public static final class Builder {
            private String audioIndex; 
            private Double duration; 
            private Double start; 
            private String videoIndex; 

            /**
             * <p>The audio stream index.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0 或 exclude</p>
             */
            public Builder audioIndex(String audioIndex) {
                this.audioIndex = audioIndex;
                return this;
            }

            /**
             * <p>The duration of the input stream. The default value is the duration of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>20.0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of the input stream. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder start(Double start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The video stream index.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0 或 exclude</p>
             */
            public Builder videoIndex(String videoIndex) {
                this.videoIndex = videoIndex;
                return this;
            }

            public CombineConfigs build() {
                return new CombineConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CipherText")
        private String cipherText;

        @com.aliyun.core.annotation.NameInMap("DecryptKeyUri")
        private String decryptKeyUri;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        private Encryption(Builder builder) {
            this.cipherText = builder.cipherText;
            this.decryptKeyUri = builder.decryptKeyUri;
            this.encryptType = builder.encryptType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return cipherText
         */
        public String getCipherText() {
            return this.cipherText;
        }

        /**
         * @return decryptKeyUri
         */
        public String getDecryptKeyUri() {
            return this.decryptKeyUri;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        public static final class Builder {
            private String cipherText; 
            private String decryptKeyUri; 
            private String encryptType; 

            /**
             * <p>The ciphertext of HTTP Live Streaming (HLS) encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>MTYi00NDU0LTg5O****</p>
             */
            public Builder cipherText(String cipherText) {
                this.cipherText = cipherText;
                return this;
            }

            /**
             * <p>The endpoint of the decryption service for HLS encryption.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sample.com/path?CipherText=MTYi00NDU0LTg5O">https://sample.com/path?CipherText=MTYi00NDU0LTg5O</a>****</p>
             */
            public Builder decryptKeyUri(String decryptKeyUri) {
                this.decryptKeyUri = decryptKeyUri;
                return this;
            }

            /**
             * <p>The encryption type.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateEncryption</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private File(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * <p>The media object. If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported. If Type is set to Media, the ID of a media asset is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Timeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private Timeline(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * <p>The duration of the stream. Valid values: the number of seconds or &quot;ToEND&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>ToEND</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The beginning of the time range for which data was queried.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:05</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class OverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private Timeline timeline;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private OverwriteParams(Builder builder) {
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.file = builder.file;
            this.height = builder.height;
            this.referPos = builder.referPos;
            this.timeline = builder.timeline;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParams create() {
            return builder().build();
        }

        /**
         * @return dx
         */
        public String getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public String getDy() {
            return this.dy;
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return timeline
         */
        public Timeline getTimeline() {
            return this.timeline;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String dx; 
            private String dy; 
            private File file; 
            private String height; 
            private String referPos; 
            private Timeline timeline; 
            private String width; 

            /**
             * <p>The position of the watermark on the x-axis.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * <p>The position of the watermark on the y-axis.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * <p>The watermark image file.</p>
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The height of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The reference position of the watermark. Valid values: TopLeft, TopRight, BottomLeft, and BottomRight. Default value: TopLeft.</p>
             * 
             * <strong>example:</strong>
             * <p>TopLeft</p>
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * <p>The timeline settings.</p>
             */
            public Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * <p>The width of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public OverwriteParams build() {
                return new OverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class ImageWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private OverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ImageWatermarks(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageWatermarks create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public OverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private OverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(OverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public ImageWatermarks build() {
                return new ImageWatermarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class OverwriteParamsFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OverwriteParamsFile(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParamsFile create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * <p>The media object.</p>
             * <ul>
             * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
             * <li>If Type is set to Media, the ID of a media asset is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the media object. Valid values:</p>
             * <ul>
             * <li>OSS: an OSS object.</li>
             * <li>Media: a media asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverwriteParamsFile build() {
                return new OverwriteParamsFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class SubtitlesOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharEnc")
        private String charEnc;

        @com.aliyun.core.annotation.NameInMap("File")
        private OverwriteParamsFile file;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private SubtitlesOverwriteParams(Builder builder) {
            this.charEnc = builder.charEnc;
            this.file = builder.file;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitlesOverwriteParams create() {
            return builder().build();
        }

        /**
         * @return charEnc
         */
        public String getCharEnc() {
            return this.charEnc;
        }

        /**
         * @return file
         */
        public OverwriteParamsFile getFile() {
            return this.file;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String charEnc; 
            private OverwriteParamsFile file; 
            private String format; 

            /**
             * <p>The file encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>UTF-8</p>
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * <p>The subtitle file.</p>
             */
            public Builder file(OverwriteParamsFile file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The format of the subtitle file.</p>
             * 
             * <strong>example:</strong>
             * <p>vtt</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public SubtitlesOverwriteParams build() {
                return new SubtitlesOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Subtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private SubtitlesOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Subtitles(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitles create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public SubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private SubtitlesOverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(SubtitlesOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Subtitles build() {
                return new Subtitles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class TextWatermarksOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adaptive")
        private String adaptive;

        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private String borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidth")
        private Integer borderWidth;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FontAlpha")
        private String fontAlpha;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontName")
        private String fontName;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("Left")
        private String left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private String top;

        private TextWatermarksOverwriteParams(Builder builder) {
            this.adaptive = builder.adaptive;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.content = builder.content;
            this.fontAlpha = builder.fontAlpha;
            this.fontColor = builder.fontColor;
            this.fontName = builder.fontName;
            this.fontSize = builder.fontSize;
            this.left = builder.left;
            this.top = builder.top;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextWatermarksOverwriteParams create() {
            return builder().build();
        }

        /**
         * @return adaptive
         */
        public String getAdaptive() {
            return this.adaptive;
        }

        /**
         * @return borderColor
         */
        public String getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fontAlpha
         */
        public String getFontAlpha() {
            return this.fontAlpha;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return left
         */
        public String getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public String getTop() {
            return this.top;
        }

        public static final class Builder {
            private String adaptive; 
            private String borderColor; 
            private Integer borderWidth; 
            private String content; 
            private String fontAlpha; 
            private String fontColor; 
            private String fontName; 
            private Integer fontSize; 
            private String left; 
            private String top; 

            /**
             * <p>Indicates whether the text size was adjusted based on the output video dimensions. true / false, default: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder adaptive(String adaptive) {
                this.adaptive = adaptive;
                return this;
            }

            /**
             * <p>The border color.</p>
             * 
             * <strong>example:</strong>
             * <p>#006400</p>
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The border width.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * <p>The watermark text. Base64 encoding is not required. The string must be encoded in UTF-8.</p>
             * 
             * <strong>example:</strong>
             * <p>测试水印</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The transparency of the watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder fontAlpha(String fontAlpha) {
                this.fontAlpha = fontAlpha;
                return this;
            }

            /**
             * <p>The color of the text.</p>
             * 
             * <strong>example:</strong>
             * <p>#006400</p>
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font of the text.</p>
             * 
             * <strong>example:</strong>
             * <p>SimSun</p>
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * <p>The size of the text.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The distance of the watermark from the left edge.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The distance of the watermark from the top edge.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder top(String top) {
                this.top = top;
                return this;
            }

            public TextWatermarksOverwriteParams build() {
                return new TextWatermarksOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class TextWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private TextWatermarksOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private TextWatermarks(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextWatermarks create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public TextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private TextWatermarksOverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(TextWatermarksOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public TextWatermarks build() {
                return new TextWatermarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Volume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntegratedLoudnessTarget")
        private String integratedLoudnessTarget;

        @com.aliyun.core.annotation.NameInMap("LoudnessRangeTarget")
        private String loudnessRangeTarget;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("TruePeak")
        private String truePeak;

        private Volume(Builder builder) {
            this.integratedLoudnessTarget = builder.integratedLoudnessTarget;
            this.loudnessRangeTarget = builder.loudnessRangeTarget;
            this.method = builder.method;
            this.truePeak = builder.truePeak;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return integratedLoudnessTarget
         */
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        /**
         * @return loudnessRangeTarget
         */
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return truePeak
         */
        public String getTruePeak() {
            return this.truePeak;
        }

        public static final class Builder {
            private String integratedLoudnessTarget; 
            private String loudnessRangeTarget; 
            private String method; 
            private String truePeak; 

            /**
             * <p>The output volume.</p>
             * 
             * <strong>example:</strong>
             * <p>-6</p>
             */
            public Builder integratedLoudnessTarget(String integratedLoudnessTarget) {
                this.integratedLoudnessTarget = integratedLoudnessTarget;
                return this;
            }

            /**
             * <p>The volume range.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder loudnessRangeTarget(String loudnessRangeTarget) {
                this.loudnessRangeTarget = loudnessRangeTarget;
                return this;
            }

            /**
             * <p>The volume adjustment method. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The peak volume.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder truePeak(String truePeak) {
                this.truePeak = truePeak;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Audio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("Samplerate")
        private String samplerate;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Volume volume;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.remove = builder.remove;
            this.samplerate = builder.samplerate;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return remove
         */
        public String getRemove() {
            return this.remove;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        /**
         * @return volume
         */
        public Volume getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String remove; 
            private String samplerate; 
            private Volume volume; 

            /**
             * <p>The audio bitrate of the output file.</p>
             * <ul>
             * <li>Valid values: [8,1000].</li>
             * <li>Unit: Kbit/s.</li>
             * <li>Default value: 128.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The number of sound channels. Default value: 2.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The audio codec. Valid values: AAC, MP3, VORBIS, and FLAC. Default value: AAC.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The audio codec profile. If the Codec parameter is set to AAC, the valid values are aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</p>
             * 
             * <strong>example:</strong>
             * <p>aac_low</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>Indicates whether the audio stream is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * <p>The sampling rate.</p>
             * <ul>
             * <li>Default value: 44100.</li>
             * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
             * <li>Unit: Hz.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * <p>The volume configurations.</p>
             */
            public Builder volume(Volume volume) {
                this.volume = volume;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private Container(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String format; 

            /**
             * <p>The container format.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ForceSegTime")
        private String forceSegTime;

        private Segment(Builder builder) {
            this.duration = builder.duration;
            this.forceSegTime = builder.forceSegTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return forceSegTime
         */
        public String getForceSegTime() {
            return this.forceSegTime;
        }

        public static final class Builder {
            private String duration; 
            private String forceSegTime; 

            /**
             * <p>The segment length.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The forced segmentation point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>2,3</p>
             */
            public Builder forceSegTime(String forceSegTime) {
                this.forceSegTime = forceSegTime;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class MuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        private MuxConfig(Builder builder) {
            this.segment = builder.segment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        public static final class Builder {
            private Segment segment; 

            /**
             * <p>The segment settings.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            public MuxConfig build() {
                return new MuxConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbrMax")
        private String abrMax;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Bufsize")
        private String bufsize;

        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Crf")
        private String crf;

        @com.aliyun.core.annotation.NameInMap("Crop")
        private String crop;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private String gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("LongShortMode")
        private String longShortMode;

        @com.aliyun.core.annotation.NameInMap("Maxrate")
        private String maxrate;

        @com.aliyun.core.annotation.NameInMap("Pad")
        private String pad;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Preset")
        private String preset;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Remove")
        private String remove;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.abrMax = builder.abrMax;
            this.bitrate = builder.bitrate;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.crop = builder.crop;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.longShortMode = builder.longShortMode;
            this.maxrate = builder.maxrate;
            this.pad = builder.pad;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.remove = builder.remove;
            this.scanMode = builder.scanMode;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return abrMax
         */
        public String getAbrMax() {
            return this.abrMax;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bufsize
         */
        public String getBufsize() {
            return this.bufsize;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return crf
         */
        public String getCrf() {
            return this.crf;
        }

        /**
         * @return crop
         */
        public String getCrop() {
            return this.crop;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return longShortMode
         */
        public String getLongShortMode() {
            return this.longShortMode;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return pad
         */
        public String getPad() {
            return this.pad;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return remove
         */
        public String getRemove() {
            return this.remove;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String abrMax; 
            private String bitrate; 
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String crop; 
            private String fps; 
            private String gop; 
            private String height; 
            private String longShortMode; 
            private String maxrate; 
            private String pad; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String remove; 
            private String scanMode; 
            private String width; 

            /**
             * <p>The maximum adaptive bitrate (ABR). This parameter takes effect only for Narrowband HD 1.0. Valid values: [10,50000]. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder abrMax(String abrMax) {
                this.abrMax = abrMax;
                return this;
            }

            /**
             * <p>The average bitrate of the video.</p>
             * <ul>
             * <li>Valid values: [10,50000].</li>
             * <li>Unit: Kbit/s.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The buffer size.</p>
             * <ul>
             * <li>Valid values: [1000,128000].</li>
             * <li>Default value: 6000.</li>
             * <li>Unit: KB.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6000</p>
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * <p>The encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264</p>
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The constant rate factor.</p>
             * <ul>
             * <li>Valid values: [0,51].</li>
             * <li>Default value: 23 if the encoding format is H.264, or 26 if the encoding format is H.265.</li>
             * </ul>
             * <p>If this parameter is set, the value of Bitrate becomes invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The method of video cropping. Valid values:</p>
             * <ul>
             * <li>border: automatically detects and removes black bars.</li>
             * <li>A value in the width:height:left:top format: crops the videos based on the custom settings. Example: 1280:800:0:140.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280:800:0:140</p>
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * <ul>
             * <li>Valid values: (0,60].</li>
             * <li>The value is 60 if the frame rate of the input video exceeds 60.</li>
             * <li>Default value: the frame rate of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The maximum number of frames between two keyframes.</p>
             * <ul>
             * <li>Valid values: [1,1080000].</li>
             * <li>Default value: 250.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>250</p>
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The height of the output video.</p>
             * <ul>
             * <li>Valid values: [128,4096].</li>
             * <li>Unit: pixels.</li>
             * <li>Default value: the height of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Indicates whether the auto-rotate screen feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder longShortMode(String longShortMode) {
                this.longShortMode = longShortMode;
                return this;
            }

            /**
             * <p>The maximum bitrate of the output video. Valid values: [10,50000]. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The black bars added to the video.</p>
             * <ul>
             * <li>Format: width:height:left:top.</li>
             * <li>Example: 1280:800:0:140.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280:800:0:140</p>
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The preset video algorithm. This parameter takes effect only if the encoding format is H.264. Valid values: veryfast, fast, medium, slow, and slower. Default value: medium.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * <p>The encoding profile. Valid values: baseline, main, and high.</p>
             * <ul>
             * <li>baseline: applicable to mobile devices.</li>
             * <li>main: applicable to standard-definition devices.</li>
             * <li>high: applicable to high-definition devices.</li>
             * </ul>
             * <p>Default value: high.</p>
             * 
             * <strong>example:</strong>
             * <p>Main</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>Indicates whether the video was removed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * <p>The scan mode. Valid values: interlaced and progressive.</p>
             * 
             * <strong>example:</strong>
             * <p>progressive</p>
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * <p>The width of the output video.</p>
             * <ul>
             * <li>Valid values: [128,4096].</li>
             * <li>Unit: pixels.</li>
             * <li>Default value: the width of the input video.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class TranscodeOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private TranscodeOverwriteParams(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.muxConfig = builder.muxConfig;
            this.tags = builder.tags;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeOverwriteParams create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return muxConfig
         */
        public MuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private Audio audio; 
            private Container container; 
            private MuxConfig muxConfig; 
            private java.util.Map<String, String> tags; 
            private Video video; 

            /**
             * <p>The audio settings.</p>
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The encapsulation format settings.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The encapsulation settings.</p>
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The video settings.</p>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public TranscodeOverwriteParams build() {
                return new TranscodeOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Transcode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private TranscodeOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Transcode(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcode create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public TranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private TranscodeOverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(TranscodeOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9547c6ad97cb4f2aaa29683ebd18d410</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Transcode build() {
                return new Transcode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class ProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CombineConfigs")
        private java.util.List<CombineConfigs> combineConfigs;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("ImageWatermarks")
        private java.util.List<ImageWatermarks> imageWatermarks;

        @com.aliyun.core.annotation.NameInMap("IsInheritTags")
        private Boolean isInheritTags;

        @com.aliyun.core.annotation.NameInMap("Subtitles")
        private java.util.List<Subtitles> subtitles;

        @com.aliyun.core.annotation.NameInMap("TextWatermarks")
        private java.util.List<TextWatermarks> textWatermarks;

        @com.aliyun.core.annotation.NameInMap("Transcode")
        private Transcode transcode;

        private ProcessConfig(Builder builder) {
            this.combineConfigs = builder.combineConfigs;
            this.encryption = builder.encryption;
            this.imageWatermarks = builder.imageWatermarks;
            this.isInheritTags = builder.isInheritTags;
            this.subtitles = builder.subtitles;
            this.textWatermarks = builder.textWatermarks;
            this.transcode = builder.transcode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfig create() {
            return builder().build();
        }

        /**
         * @return combineConfigs
         */
        public java.util.List<CombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return imageWatermarks
         */
        public java.util.List<ImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        /**
         * @return isInheritTags
         */
        public Boolean getIsInheritTags() {
            return this.isInheritTags;
        }

        /**
         * @return subtitles
         */
        public java.util.List<Subtitles> getSubtitles() {
            return this.subtitles;
        }

        /**
         * @return textWatermarks
         */
        public java.util.List<TextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        /**
         * @return transcode
         */
        public Transcode getTranscode() {
            return this.transcode;
        }

        public static final class Builder {
            private java.util.List<CombineConfigs> combineConfigs; 
            private Encryption encryption; 
            private java.util.List<ImageWatermarks> imageWatermarks; 
            private Boolean isInheritTags; 
            private java.util.List<Subtitles> subtitles; 
            private java.util.List<TextWatermarks> textWatermarks; 
            private Transcode transcode; 

            /**
             * <p>The multi-input stream merge configuration.</p>
             */
            public Builder combineConfigs(java.util.List<CombineConfigs> combineConfigs) {
                this.combineConfigs = combineConfigs;
                return this;
            }

            /**
             * <p>The encryption settings.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The watermark configuration for an image.</p>
             */
            public Builder imageWatermarks(java.util.List<ImageWatermarks> imageWatermarks) {
                this.imageWatermarks = imageWatermarks;
                return this;
            }

            /**
             * <p>Indicates whether the tags of the input stream are inherited in the output stream. This parameter does not take effect when the input is not a media asset. Default value: false.</p>
             */
            public Builder isInheritTags(Boolean isInheritTags) {
                this.isInheritTags = isInheritTags;
                return this;
            }

            /**
             * <p>The subtitle configuration.</p>
             */
            public Builder subtitles(java.util.List<Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * <p>The configurations of the text watermarks.</p>
             */
            public Builder textWatermarks(java.util.List<TextWatermarks> textWatermarks) {
                this.textWatermarks = textWatermarks;
                return this;
            }

            /**
             * <p>The transcoding configuration.</p>
             */
            public Builder transcode(Transcode transcode) {
                this.transcode = transcode;
                return this;
            }

            public ProcessConfig build() {
                return new ProcessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class OutputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("ProcessConfig")
        private ProcessConfig processConfig;

        private OutputGroup(Builder builder) {
            this.output = builder.output;
            this.processConfig = builder.processConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputGroup create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return processConfig
         */
        public ProcessConfig getProcessConfig() {
            return this.processConfig;
        }

        public static final class Builder {
            private Output output; 
            private ProcessConfig processConfig; 

            /**
             * <p>The output file configuration.</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The job processing configuration.</p>
             */
            public Builder processConfig(ProcessConfig processConfig) {
                this.processConfig = processConfig;
                return this;
            }

            public OutputGroup build() {
                return new OutputGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private Integer priority; 

            /**
             * <p>The ID of the MPS queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>e37ebee5d98b4781897f6086e89f9c56</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTranscodeJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InputGroup")
        private java.util.List<InputGroup> inputGroup;

        @com.aliyun.core.annotation.NameInMap("JobCount")
        private Integer jobCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputGroup")
        private java.util.List<OutputGroup> outputGroup;

        @com.aliyun.core.annotation.NameInMap("ParentJobId")
        private String parentJobId;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private ScheduleConfig scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Jobs(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.inputGroup = builder.inputGroup;
            this.jobCount = builder.jobCount;
            this.name = builder.name;
            this.outputGroup = builder.outputGroup;
            this.parentJobId = builder.parentJobId;
            this.percent = builder.percent;
            this.requestId = builder.requestId;
            this.scheduleConfig = builder.scheduleConfig;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.triggerSource = builder.triggerSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inputGroup
         */
        public java.util.List<InputGroup> getInputGroup() {
            return this.inputGroup;
        }

        /**
         * @return jobCount
         */
        public Integer getJobCount() {
            return this.jobCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputGroup
         */
        public java.util.List<OutputGroup> getOutputGroup() {
            return this.outputGroup;
        }

        /**
         * @return parentJobId
         */
        public String getParentJobId() {
            return this.parentJobId;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return scheduleConfig
         */
        public ScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return triggerSource
         */
        public String getTriggerSource() {
            return this.triggerSource;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String createTime; 
            private String finishTime; 
            private java.util.List<InputGroup> inputGroup; 
            private Integer jobCount; 
            private String name; 
            private java.util.List<OutputGroup> outputGroup; 
            private String parentJobId; 
            private Integer percent; 
            private String requestId; 
            private ScheduleConfig scheduleConfig; 
            private String status; 
            private String submitTime; 
            private String triggerSource; 
            private String userData; 

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The input group of the job. An input of a single file indicates a transcoding job. An input of multiple files indicates an audio and video stream merge job.</p>
             */
            public Builder inputGroup(java.util.List<InputGroup> inputGroup) {
                this.inputGroup = inputGroup;
                return this;
            }

            /**
             * <p>The number of subjobs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder jobCount(Integer jobCount) {
                this.jobCount = jobCount;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>transcode-job</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output group of the job.</p>
             */
            public Builder outputGroup(java.util.List<OutputGroup> outputGroup) {
                this.outputGroup = outputGroup;
                return this;
            }

            /**
             * <p>The main job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8b2198504dd340b7b3c9842a74fc9baa</p>
             */
            public Builder parentJobId(String parentJobId) {
                this.parentJobId = parentJobId;
                return this;
            }

            /**
             * <p>The completion percentage of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the request that submitted the job.</p>
             * 
             * <strong>example:</strong>
             * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The scheduling configuration of the job.</p>
             */
            public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The state of the job.</p>
             * <ul>
             * <li>Success: At least one of the subjobs is successful.</li>
             * <li>Fail: All subjobs failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The source of the job. Valid values:</p>
             * <ul>
             * <li>API</li>
             * <li>WorkFlow</li>
             * <li>Console</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder triggerSource(String triggerSource) {
                this.triggerSource = triggerSource;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>user-data</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
