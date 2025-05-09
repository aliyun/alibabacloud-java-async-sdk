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
 * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeJobResponseBody</p>
 */
public class GetTranscodeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeParentJob")
    private TranscodeParentJob transcodeParentJob;

    private GetTranscodeJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeParentJob = builder.transcodeParentJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeParentJob
     */
    public TranscodeParentJob getTranscodeParentJob() {
        return this.transcodeParentJob;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeParentJob transcodeParentJob; 

        private Builder() {
        } 

        private Builder(GetTranscodeJobResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeParentJob = model.transcodeParentJob;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9EDC30DC-0050-5459-B788-F761B2BE359B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TranscodeParentJobWithSubJobDTO</p>
         */
        public Builder transcodeParentJob(TranscodeParentJob transcodeParentJob) {
            this.transcodeParentJob = transcodeParentJob;
            return this;
        }

        public GetTranscodeJobResponseBody build() {
            return new GetTranscodeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class InputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InputGroup(Builder builder) {
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

            private Builder() {
            } 

            private Builder(InputGroup model) {
                this.media = model.media;
                this.type = model.type;
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

            public InputGroup build() {
                return new InputGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Output model) {
                this.media = model.media;
                this.outputUrl = model.outputUrl;
                this.type = model.type;
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
             * <p>The URL of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CombineConfigs model) {
                this.audioIndex = model.audioIndex;
                this.duration = model.duration;
                this.start = model.start;
                this.videoIndex = model.videoIndex;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CipherText")
        private String cipherText;

        @com.aliyun.core.annotation.NameInMap("DecryptKeyUri")
        private String decryptKeyUri;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KeyServiceType")
        private String keyServiceType;

        private Encryption(Builder builder) {
            this.cipherText = builder.cipherText;
            this.decryptKeyUri = builder.decryptKeyUri;
            this.encryptType = builder.encryptType;
            this.keyServiceType = builder.keyServiceType;
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

        /**
         * @return keyServiceType
         */
        public String getKeyServiceType() {
            return this.keyServiceType;
        }

        public static final class Builder {
            private String cipherText; 
            private String decryptKeyUri; 
            private String encryptType; 
            private String keyServiceType; 

            private Builder() {
            } 

            private Builder(Encryption model) {
                this.cipherText = model.cipherText;
                this.decryptKeyUri = model.decryptKeyUri;
                this.encryptType = model.encryptType;
                this.keyServiceType = model.keyServiceType;
            } 

            /**
             * <p>The ciphertext of HLS encryption.</p>
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

            /**
             * <p>The type of the key service. Valid values: KMS and Base64.</p>
             * 
             * <strong>example:</strong>
             * <p>KMS</p>
             */
            public Builder keyServiceType(String keyServiceType) {
                this.keyServiceType = keyServiceType;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(File model) {
                this.media = model.media;
                this.type = model.type;
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Timeline model) {
                this.duration = model.duration;
                this.start = model.start;
            } 

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
             * <p>The start time of the stream.</p>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OverwriteParams model) {
                this.dx = model.dx;
                this.dy = model.dy;
                this.file = model.file;
                this.height = model.height;
                this.referPos = model.referPos;
                this.timeline = model.timeline;
                this.width = model.width;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ImageWatermarks model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OverwriteParamsFile model) {
                this.media = model.media;
                this.type = model.type;
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SubtitlesOverwriteParams model) {
                this.charEnc = model.charEnc;
                this.file = model.file;
                this.format = model.format;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Subtitles model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TextWatermarksOverwriteParams model) {
                this.adaptive = model.adaptive;
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.content = model.content;
                this.fontAlpha = model.fontAlpha;
                this.fontColor = model.fontColor;
                this.fontName = model.fontName;
                this.fontSize = model.fontSize;
                this.left = model.left;
                this.top = model.top;
            } 

            /**
             * <p>Indicates whether the text size was adjusted based on the output video dimensions. Valid values: true and false. Default value: false.</p>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(TextWatermarks model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Volume model) {
                this.integratedLoudnessTarget = model.integratedLoudnessTarget;
                this.loudnessRangeTarget = model.loudnessRangeTarget;
                this.method = model.method;
                this.truePeak = model.truePeak;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Audio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.remove = model.remove;
                this.samplerate = model.samplerate;
                this.volume = model.volume;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Container model) {
                this.format = model.format;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
                this.forceSegTime = model.forceSegTime;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MuxConfig model) {
                this.segment = model.segment;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckReso")
        private String isCheckReso;

        @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.adjDarMethod = builder.adjDarMethod;
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return adjDarMethod
         */
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String adjDarMethod; 
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            private Builder() {
            } 

            private Builder(TransConfig model) {
                this.adjDarMethod = model.adjDarMethod;
                this.isCheckAudioBitrate = model.isCheckAudioBitrate;
                this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
                this.isCheckReso = model.isCheckReso;
                this.isCheckResoFail = model.isCheckResoFail;
                this.isCheckVideoBitrate = model.isCheckVideoBitrate;
                this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
                this.transMode = model.transMode;
            } 

            /**
             * <p>The method that is used to adjust the resolution. This parameter takes effect only if both the Width and Height parameters are specified. You can use this parameter together with the LongShortMode parameter.</p>
             * <p>Valid values: rescale, crop, pad, and none.</p>
             * <p>Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate was checked. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input audio is less than that of the output audio, the bitrate of the input audio is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
             * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate was checked. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input audio is less than that of the output audio, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * <p>Indicates whether the video resolution was checked. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the width or height of the input video is less than that of the output video, the resolution of the input video is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * <p>Indicates whether the video resolution was checked. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the width or height of the input video is less than that of the output video, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate was checked. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input video is less than that of the output video, the bitrate of the input video is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate was checked. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input video is less than that of the output video, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * <p>The video transcoding mode. Valid values:</p>
             * <ul>
             * <li>onepass: You can set this parameter to onepass if the Bitrate parameter is set to ABR. The encoding speed of this mode is faster than that of the twopass mode.</li>
             * <li>twopass: You can set this parameter to twopass if the Bitrate parameter is set to VBR. The encoding speed of this mode is slower than that of the onepass mode.</li>
             * <li>CBR: the constant bitrate mode.</li>
             * </ul>
             * <p>Default value: onepass.</p>
             * 
             * <strong>example:</strong>
             * <p>onepass</p>
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public TransConfig build() {
                return new TransConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Video model) {
                this.abrMax = model.abrMax;
                this.bitrate = model.bitrate;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.crop = model.crop;
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.longShortMode = model.longShortMode;
                this.maxrate = model.maxrate;
                this.pad = model.pad;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.remove = model.remove;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * <p>The maximum ABR. This parameter takes effect only for Narrowband HD 1.0.</p>
             * <ul>
             * <li>Valid values: [10,50000].</li>
             * <li>Unit: Kbit/s.</li>
             * </ul>
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
             * <li>If this parameter is specified, the value of Bitrate becomes invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * <p>The method of video cropping. Valid values: border: automatically detects and removes black bars. A value in the width:height:left:top format: crops the videos based on the custom settings. Example: 1280:800:0:140.</p>
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
             * <p>The maximum bitrate of the output video.</p>
             * <ul>
             * <li>Valid values: [10,50000].</li>
             * <li>Unit: Kbit/s.</li>
             * </ul>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Audio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private TransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private TranscodeOverwriteParams(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.muxConfig = builder.muxConfig;
            this.transConfig = builder.transConfig;
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
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
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
            private TransConfig transConfig; 
            private Video video; 

            private Builder() {
            } 

            private Builder(TranscodeOverwriteParams model) {
                this.audio = model.audio;
                this.container = model.container;
                this.muxConfig = model.muxConfig;
                this.transConfig = model.transConfig;
                this.video = model.video;
            } 

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
             * <p>The conditional transcoding configurations.</p>
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Transcode model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CombineConfigs")
        private java.util.List<CombineConfigs> combineConfigs;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("ImageWatermarks")
        private java.util.List<ImageWatermarks> imageWatermarks;

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
            private java.util.List<Subtitles> subtitles; 
            private java.util.List<TextWatermarks> textWatermarks; 
            private Transcode transcode; 

            private Builder() {
            } 

            private Builder(ProcessConfig model) {
                this.combineConfigs = model.combineConfigs;
                this.encryption = model.encryption;
                this.imageWatermarks = model.imageWatermarks;
                this.subtitles = model.subtitles;
                this.textWatermarks = model.textWatermarks;
                this.transcode = model.transcode;
            } 

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
             * <p>The watermark configuration of an image.</p>
             */
            public Builder imageWatermarks(java.util.List<ImageWatermarks> imageWatermarks) {
                this.imageWatermarks = imageWatermarks;
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
             * <p>The configurations of the text watermark.</p>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OutputGroup model) {
                this.output = model.output;
                this.processConfig = model.processConfig;
            } 

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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the snapshot job was submitted.</p>
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
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeJobListInputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TranscodeJobListInputGroup(Builder builder) {
            this.inputUrl = builder.inputUrl;
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobListInputGroup create() {
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

            private Builder() {
            } 

            private Builder(TranscodeJobListInputGroup model) {
                this.inputUrl = model.inputUrl;
                this.media = model.media;
                this.type = model.type;
            } 

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

            public TranscodeJobListInputGroup build() {
                return new TranscodeJobListInputGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class AudioStreamInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("ChannelLayout")
        private String channelLayout;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("CodecLongName")
        private String codecLongName;

        @com.aliyun.core.annotation.NameInMap("CodecName")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("CodecTag")
        private String codecTag;

        @com.aliyun.core.annotation.NameInMap("CodecTagString")
        private String codecTagString;

        @com.aliyun.core.annotation.NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("SampleFmt")
        private String sampleFmt;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private String sampleRate;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timebase")
        private String timebase;

        private AudioStreamInfoList(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.index = builder.index;
            this.lang = builder.lang;
            this.sampleFmt = builder.sampleFmt;
            this.sampleRate = builder.sampleRate;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreamInfoList create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channelLayout
         */
        public String getChannelLayout() {
            return this.channelLayout;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return sampleFmt
         */
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        /**
         * @return sampleRate
         */
        public String getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timebase
         */
        public String getTimebase() {
            return this.timebase;
        }

        public static final class Builder {
            private String bitrate; 
            private String channelLayout; 
            private String channels; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String duration; 
            private String index; 
            private String lang; 
            private String sampleFmt; 
            private String sampleRate; 
            private String startTime; 
            private String timebase; 

            private Builder() {
            } 

            private Builder(AudioStreamInfoList model) {
                this.bitrate = model.bitrate;
                this.channelLayout = model.channelLayout;
                this.channels = model.channels;
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.duration = model.duration;
                this.index = model.index;
                this.lang = model.lang;
                this.sampleFmt = model.sampleFmt;
                this.sampleRate = model.sampleRate;
                this.startTime = model.startTime;
                this.timebase = model.timebase;
            } 

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.f</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The sound channel layout.</p>
             * 
             * <strong>example:</strong>
             * <p>stereo</p>
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * <p>The number of sound channels.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC (Advanced Audio Coding)</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The encoder tag.</p>
             * 
             * <strong>example:</strong>
             * <p>0x000f</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The name of the encoder tag.</p>
             * 
             * <strong>example:</strong>
             * <p>[15][0][0][0]</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The time base of the encoder.</p>
             * 
             * <strong>example:</strong>
             * <p>1/44100</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The duration of the stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039989</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The sequence number of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The sample format.</p>
             * 
             * <strong>example:</strong>
             * <p>fltp</p>
             */
            public Builder sampleFmt(String sampleFmt) {
                this.sampleFmt = sampleFmt;
                return this;
            }

            /**
             * <p>The sampling rate. Unit: Hz.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * <p>The start time of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1.473556</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/90000</p>
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public AudioStreamInfoList build() {
                return new AudioStreamInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class FileBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private String bitrate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FileStatus")
        private String fileStatus;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("FormatName")
        private String formatName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private FileBasicInfo(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileStatus = builder.fileStatus;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
            this.formatName = builder.formatName;
            this.height = builder.height;
            this.mediaId = builder.mediaId;
            this.region = builder.region;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileBasicInfo create() {
            return builder().build();
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileStatus
         */
        public String getFileStatus() {
            return this.fileStatus;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String duration; 
            private String fileName; 
            private String fileSize; 
            private String fileStatus; 
            private String fileType; 
            private String fileUrl; 
            private String formatName; 
            private String height; 
            private String mediaId; 
            private String region; 
            private String width; 

            private Builder() {
            } 

            private Builder(FileBasicInfo model) {
                this.bitrate = model.bitrate;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileStatus = model.fileStatus;
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
                this.formatName = model.formatName;
                this.height = model.height;
                this.mediaId = model.mediaId;
                this.region = model.region;
                this.width = model.width;
            } 

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>888.563</p>
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The duration of the video. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039999</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>file.m3u8</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>31737</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The state of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder fileStatus(String fileStatus) {
                this.fileStatus = fileStatus;
                return this;
            }

            /**
             * <p>The file type. Valid values: source_file and transcode_file.</p>
             * 
             * <strong>example:</strong>
             * <p>source_file</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8">http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The name of the video format.</p>
             * 
             * <strong>example:</strong>
             * <p>hls,applehttp</p>
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * <p>The height of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>478</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>486c2890096871edba6f81848c016303</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The region in which the file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The width of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>848</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public FileBasicInfo build() {
                return new FileBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class VideoStreamInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avg_fps")
        private String avgFps;

        @com.aliyun.core.annotation.NameInMap("Bit_rate")
        private String bitRate;

        @com.aliyun.core.annotation.NameInMap("Codec_long_name")
        private String codecLongName;

        @com.aliyun.core.annotation.NameInMap("Codec_name")
        private String codecName;

        @com.aliyun.core.annotation.NameInMap("Codec_tag")
        private String codecTag;

        @com.aliyun.core.annotation.NameInMap("Codec_tag_string")
        private String codecTagString;

        @com.aliyun.core.annotation.NameInMap("Codec_time_base")
        private String codecTimeBase;

        @com.aliyun.core.annotation.NameInMap("Dar")
        private String dar;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Has_b_frames")
        private String hasBFrames;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("NumFrames")
        private String numFrames;

        @com.aliyun.core.annotation.NameInMap("PixFmt")
        private String pixFmt;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Rotate")
        private String rotate;

        @com.aliyun.core.annotation.NameInMap("Sar")
        private String sar;

        @com.aliyun.core.annotation.NameInMap("Start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Time_base")
        private String timeBase;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private VideoStreamInfoList(Builder builder) {
            this.avgFps = builder.avgFps;
            this.bitRate = builder.bitRate;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.dar = builder.dar;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.hasBFrames = builder.hasBFrames;
            this.height = builder.height;
            this.index = builder.index;
            this.lang = builder.lang;
            this.level = builder.level;
            this.numFrames = builder.numFrames;
            this.pixFmt = builder.pixFmt;
            this.profile = builder.profile;
            this.rotate = builder.rotate;
            this.sar = builder.sar;
            this.startTime = builder.startTime;
            this.timeBase = builder.timeBase;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreamInfoList create() {
            return builder().build();
        }

        /**
         * @return avgFps
         */
        public String getAvgFps() {
            return this.avgFps;
        }

        /**
         * @return bitRate
         */
        public String getBitRate() {
            return this.bitRate;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return dar
         */
        public String getDar() {
            return this.dar;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return hasBFrames
         */
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return numFrames
         */
        public String getNumFrames() {
            return this.numFrames;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return sar
         */
        public String getSar() {
            return this.sar;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeBase
         */
        public String getTimeBase() {
            return this.timeBase;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avgFps; 
            private String bitRate; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String dar; 
            private String duration; 
            private String fps; 
            private String hasBFrames; 
            private String height; 
            private String index; 
            private String lang; 
            private String level; 
            private String numFrames; 
            private String pixFmt; 
            private String profile; 
            private String rotate; 
            private String sar; 
            private String startTime; 
            private String timeBase; 
            private String width; 

            private Builder() {
            } 

            private Builder(VideoStreamInfoList model) {
                this.avgFps = model.avgFps;
                this.bitRate = model.bitRate;
                this.codecLongName = model.codecLongName;
                this.codecName = model.codecName;
                this.codecTag = model.codecTag;
                this.codecTagString = model.codecTagString;
                this.codecTimeBase = model.codecTimeBase;
                this.dar = model.dar;
                this.duration = model.duration;
                this.fps = model.fps;
                this.hasBFrames = model.hasBFrames;
                this.height = model.height;
                this.index = model.index;
                this.lang = model.lang;
                this.level = model.level;
                this.numFrames = model.numFrames;
                this.pixFmt = model.pixFmt;
                this.profile = model.profile;
                this.rotate = model.rotate;
                this.sar = model.sar;
                this.startTime = model.startTime;
                this.timeBase = model.timeBase;
                this.width = model.width;
            } 

            /**
             * <p>The average frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0</p>
             */
            public Builder avgFps(String avgFps) {
                this.avgFps = avgFps;
                return this;
            }

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>888.563</p>
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * <p>The name of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * <p>The encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * <p>The tag of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>0x001b</p>
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * <p>The tag string of the encoding format.</p>
             * 
             * <strong>example:</strong>
             * <p>[27][0][0][0]</p>
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * <p>The time base of the encoder.</p>
             * 
             * <strong>example:</strong>
             * <p>1/50</p>
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * <p>The display aspect ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>16:9</p>
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * <p>The duration of the stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>403.039989</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the video stream contains bidirectional frames (B-frames). Valid values:</p>
             * <ul>
             * <li>0: The stream contains no B-frames.</li>
             * <li>1: The stream contains one B-frame.</li>
             * <li>2: The stream contains multiple consecutive B-frames.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * <p>The height of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>478</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The sequence number of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The language of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The codec level.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The total number of frames.</p>
             * 
             * <strong>example:</strong>
             * <p>10040</p>
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * <p>The pixel format.</p>
             * 
             * <strong>example:</strong>
             * <p>yuv420p</p>
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * <p>The encoder profile.</p>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The rotation angle of the video image. Valid values: 0, 90, 180, and 270. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The aspect ratio of the area from which the sampling points are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>478:477</p>
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * <p>The start time of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>1.473556</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time base.</p>
             * 
             * <strong>example:</strong>
             * <p>1/90000</p>
             */
            public Builder timeBase(String timeBase) {
                this.timeBase = timeBase;
                return this;
            }

            /**
             * <p>The width of the output video.</p>
             * 
             * <strong>example:</strong>
             * <p>848</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoStreamInfoList build() {
                return new VideoStreamInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OutFileMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioStreamInfoList")
        private java.util.List<AudioStreamInfoList> audioStreamInfoList;

        @com.aliyun.core.annotation.NameInMap("FileBasicInfo")
        private FileBasicInfo fileBasicInfo;

        @com.aliyun.core.annotation.NameInMap("VideoStreamInfoList")
        private java.util.List<VideoStreamInfoList> videoStreamInfoList;

        private OutFileMeta(Builder builder) {
            this.audioStreamInfoList = builder.audioStreamInfoList;
            this.fileBasicInfo = builder.fileBasicInfo;
            this.videoStreamInfoList = builder.videoStreamInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutFileMeta create() {
            return builder().build();
        }

        /**
         * @return audioStreamInfoList
         */
        public java.util.List<AudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        /**
         * @return fileBasicInfo
         */
        public FileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        /**
         * @return videoStreamInfoList
         */
        public java.util.List<VideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

        public static final class Builder {
            private java.util.List<AudioStreamInfoList> audioStreamInfoList; 
            private FileBasicInfo fileBasicInfo; 
            private java.util.List<VideoStreamInfoList> videoStreamInfoList; 

            private Builder() {
            } 

            private Builder(OutFileMeta model) {
                this.audioStreamInfoList = model.audioStreamInfoList;
                this.fileBasicInfo = model.fileBasicInfo;
                this.videoStreamInfoList = model.videoStreamInfoList;
            } 

            /**
             * <p>The information about the audio stream.</p>
             */
            public Builder audioStreamInfoList(java.util.List<AudioStreamInfoList> audioStreamInfoList) {
                this.audioStreamInfoList = audioStreamInfoList;
                return this;
            }

            /**
             * <p>The basic file information.</p>
             */
            public Builder fileBasicInfo(FileBasicInfo fileBasicInfo) {
                this.fileBasicInfo = fileBasicInfo;
                return this;
            }

            /**
             * <p>The information about the video stream.</p>
             */
            public Builder videoStreamInfoList(java.util.List<VideoStreamInfoList> videoStreamInfoList) {
                this.videoStreamInfoList = videoStreamInfoList;
                return this;
            }

            public OutFileMeta build() {
                return new OutFileMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeJobListOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TranscodeJobListOutput(Builder builder) {
            this.media = builder.media;
            this.outputUrl = builder.outputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobListOutput create() {
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

            private Builder() {
            } 

            private Builder(TranscodeJobListOutput model) {
                this.media = model.media;
                this.outputUrl = model.outputUrl;
                this.type = model.type;
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
             * <p>The path of the transcoded output stream. This parameter is required only when the output is a media asset.</p>
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

            public TranscodeJobListOutput build() {
                return new TranscodeJobListOutput(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigCombineConfigs extends TeaModel {
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

        private ProcessConfigCombineConfigs(Builder builder) {
            this.audioIndex = builder.audioIndex;
            this.duration = builder.duration;
            this.start = builder.start;
            this.videoIndex = builder.videoIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigCombineConfigs create() {
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

            private Builder() {
            } 

            private Builder(ProcessConfigCombineConfigs model) {
                this.audioIndex = model.audioIndex;
                this.duration = model.duration;
                this.start = model.start;
                this.videoIndex = model.videoIndex;
            } 

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

            public ProcessConfigCombineConfigs build() {
                return new ProcessConfigCombineConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigEncryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CipherText")
        private String cipherText;

        @com.aliyun.core.annotation.NameInMap("DecryptKeyUri")
        private String decryptKeyUri;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KeyServiceType")
        private String keyServiceType;

        private ProcessConfigEncryption(Builder builder) {
            this.cipherText = builder.cipherText;
            this.decryptKeyUri = builder.decryptKeyUri;
            this.encryptType = builder.encryptType;
            this.keyServiceType = builder.keyServiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigEncryption create() {
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

        /**
         * @return keyServiceType
         */
        public String getKeyServiceType() {
            return this.keyServiceType;
        }

        public static final class Builder {
            private String cipherText; 
            private String decryptKeyUri; 
            private String encryptType; 
            private String keyServiceType; 

            private Builder() {
            } 

            private Builder(ProcessConfigEncryption model) {
                this.cipherText = model.cipherText;
                this.decryptKeyUri = model.decryptKeyUri;
                this.encryptType = model.encryptType;
                this.keyServiceType = model.keyServiceType;
            } 

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

            /**
             * <p>The type of the key service. Valid values: KMS and Base64.</p>
             * 
             * <strong>example:</strong>
             * <p>KMS</p>
             */
            public Builder keyServiceType(String keyServiceType) {
                this.keyServiceType = keyServiceType;
                return this;
            }

            public ProcessConfigEncryption build() {
                return new ProcessConfigEncryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ImageWatermarksOverwriteParamsFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ImageWatermarksOverwriteParamsFile(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageWatermarksOverwriteParamsFile create() {
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

            private Builder() {
            } 

            private Builder(ImageWatermarksOverwriteParamsFile model) {
                this.media = model.media;
                this.type = model.type;
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

            public ImageWatermarksOverwriteParamsFile build() {
                return new ImageWatermarksOverwriteParamsFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private OverwriteParamsTimeline(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParamsTimeline create() {
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

            private Builder() {
            } 

            private Builder(OverwriteParamsTimeline model) {
                this.duration = model.duration;
                this.start = model.start;
            } 

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
             * <p>The start time of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:05</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public OverwriteParamsTimeline build() {
                return new OverwriteParamsTimeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ImageWatermarksOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dx")
        private String dx;

        @com.aliyun.core.annotation.NameInMap("Dy")
        private String dy;

        @com.aliyun.core.annotation.NameInMap("File")
        private ImageWatermarksOverwriteParamsFile file;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("ReferPos")
        private String referPos;

        @com.aliyun.core.annotation.NameInMap("Timeline")
        private OverwriteParamsTimeline timeline;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private ImageWatermarksOverwriteParams(Builder builder) {
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

        public static ImageWatermarksOverwriteParams create() {
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
        public ImageWatermarksOverwriteParamsFile getFile() {
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
        public OverwriteParamsTimeline getTimeline() {
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
            private ImageWatermarksOverwriteParamsFile file; 
            private String height; 
            private String referPos; 
            private OverwriteParamsTimeline timeline; 
            private String width; 

            private Builder() {
            } 

            private Builder(ImageWatermarksOverwriteParams model) {
                this.dx = model.dx;
                this.dy = model.dy;
                this.file = model.file;
                this.height = model.height;
                this.referPos = model.referPos;
                this.timeline = model.timeline;
                this.width = model.width;
            } 

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
            public Builder file(ImageWatermarksOverwriteParamsFile file) {
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
            public Builder timeline(OverwriteParamsTimeline timeline) {
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

            public ImageWatermarksOverwriteParams build() {
                return new ImageWatermarksOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigImageWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private ImageWatermarksOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ProcessConfigImageWatermarks(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigImageWatermarks create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public ImageWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private ImageWatermarksOverwriteParams overwriteParams; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ProcessConfigImageWatermarks model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(ImageWatermarksOverwriteParams overwriteParams) {
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

            public ProcessConfigImageWatermarks build() {
                return new ProcessConfigImageWatermarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class SubtitlesOverwriteParamsFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SubtitlesOverwriteParamsFile(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitlesOverwriteParamsFile create() {
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

            private Builder() {
            } 

            private Builder(SubtitlesOverwriteParamsFile model) {
                this.media = model.media;
                this.type = model.type;
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

            public SubtitlesOverwriteParamsFile build() {
                return new SubtitlesOverwriteParamsFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigSubtitlesOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharEnc")
        private String charEnc;

        @com.aliyun.core.annotation.NameInMap("File")
        private SubtitlesOverwriteParamsFile file;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private ProcessConfigSubtitlesOverwriteParams(Builder builder) {
            this.charEnc = builder.charEnc;
            this.file = builder.file;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigSubtitlesOverwriteParams create() {
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
        public SubtitlesOverwriteParamsFile getFile() {
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
            private SubtitlesOverwriteParamsFile file; 
            private String format; 

            private Builder() {
            } 

            private Builder(ProcessConfigSubtitlesOverwriteParams model) {
                this.charEnc = model.charEnc;
                this.file = model.file;
                this.format = model.format;
            } 

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
            public Builder file(SubtitlesOverwriteParamsFile file) {
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

            public ProcessConfigSubtitlesOverwriteParams build() {
                return new ProcessConfigSubtitlesOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigSubtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private ProcessConfigSubtitlesOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ProcessConfigSubtitles(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigSubtitles create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public ProcessConfigSubtitlesOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private ProcessConfigSubtitlesOverwriteParams overwriteParams; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ProcessConfigSubtitles model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(ProcessConfigSubtitlesOverwriteParams overwriteParams) {
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

            public ProcessConfigSubtitles build() {
                return new ProcessConfigSubtitles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigTextWatermarksOverwriteParams extends TeaModel {
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

        private ProcessConfigTextWatermarksOverwriteParams(Builder builder) {
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

        public static ProcessConfigTextWatermarksOverwriteParams create() {
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

            private Builder() {
            } 

            private Builder(ProcessConfigTextWatermarksOverwriteParams model) {
                this.adaptive = model.adaptive;
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.content = model.content;
                this.fontAlpha = model.fontAlpha;
                this.fontColor = model.fontColor;
                this.fontName = model.fontName;
                this.fontSize = model.fontSize;
                this.left = model.left;
                this.top = model.top;
            } 

            /**
             * <p>Indicates whether the text size was adjusted based on the output video dimensions. Valid values: true and false. Default value: false.</p>
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

            public ProcessConfigTextWatermarksOverwriteParams build() {
                return new ProcessConfigTextWatermarksOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigTextWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private ProcessConfigTextWatermarksOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ProcessConfigTextWatermarks(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigTextWatermarks create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public ProcessConfigTextWatermarksOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private ProcessConfigTextWatermarksOverwriteParams overwriteParams; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ProcessConfigTextWatermarks model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(ProcessConfigTextWatermarksOverwriteParams overwriteParams) {
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

            public ProcessConfigTextWatermarks build() {
                return new ProcessConfigTextWatermarks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class AudioVolume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntegratedLoudnessTarget")
        private String integratedLoudnessTarget;

        @com.aliyun.core.annotation.NameInMap("LoudnessRangeTarget")
        private String loudnessRangeTarget;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("TruePeak")
        private String truePeak;

        private AudioVolume(Builder builder) {
            this.integratedLoudnessTarget = builder.integratedLoudnessTarget;
            this.loudnessRangeTarget = builder.loudnessRangeTarget;
            this.method = builder.method;
            this.truePeak = builder.truePeak;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioVolume create() {
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

            private Builder() {
            } 

            private Builder(AudioVolume model) {
                this.integratedLoudnessTarget = model.integratedLoudnessTarget;
                this.loudnessRangeTarget = model.loudnessRangeTarget;
                this.method = model.method;
                this.truePeak = model.truePeak;
            } 

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

            public AudioVolume build() {
                return new AudioVolume(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsAudio extends TeaModel {
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
        private AudioVolume volume;

        private OverwriteParamsAudio(Builder builder) {
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

        public static OverwriteParamsAudio create() {
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
        public AudioVolume getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String remove; 
            private String samplerate; 
            private AudioVolume volume; 

            private Builder() {
            } 

            private Builder(OverwriteParamsAudio model) {
                this.bitrate = model.bitrate;
                this.channels = model.channels;
                this.codec = model.codec;
                this.profile = model.profile;
                this.remove = model.remove;
                this.samplerate = model.samplerate;
                this.volume = model.volume;
            } 

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
             * <li>Default value: 44100. Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
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
            public Builder volume(AudioVolume volume) {
                this.volume = volume;
                return this;
            }

            public OverwriteParamsAudio build() {
                return new OverwriteParamsAudio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsContainer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        private OverwriteParamsContainer(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParamsContainer create() {
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

            private Builder() {
            } 

            private Builder(OverwriteParamsContainer model) {
                this.format = model.format;
            } 

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

            public OverwriteParamsContainer build() {
                return new OverwriteParamsContainer(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class MuxConfigSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ForceSegTime")
        private String forceSegTime;

        private MuxConfigSegment(Builder builder) {
            this.duration = builder.duration;
            this.forceSegTime = builder.forceSegTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfigSegment create() {
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

            private Builder() {
            } 

            private Builder(MuxConfigSegment model) {
                this.duration = model.duration;
                this.forceSegTime = model.forceSegTime;
            } 

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

            public MuxConfigSegment build() {
                return new MuxConfigSegment(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsMuxConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Segment")
        private MuxConfigSegment segment;

        private OverwriteParamsMuxConfig(Builder builder) {
            this.segment = builder.segment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParamsMuxConfig create() {
            return builder().build();
        }

        /**
         * @return segment
         */
        public MuxConfigSegment getSegment() {
            return this.segment;
        }

        public static final class Builder {
            private MuxConfigSegment segment; 

            private Builder() {
            } 

            private Builder(OverwriteParamsMuxConfig model) {
                this.segment = model.segment;
            } 

            /**
             * <p>The segment settings.</p>
             */
            public Builder segment(MuxConfigSegment segment) {
                this.segment = segment;
                return this;
            }

            public OverwriteParamsMuxConfig build() {
                return new OverwriteParamsMuxConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsTransConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckReso")
        private String isCheckReso;

        @com.aliyun.core.annotation.NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @com.aliyun.core.annotation.NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @com.aliyun.core.annotation.NameInMap("TransMode")
        private String transMode;

        private OverwriteParamsTransConfig(Builder builder) {
            this.adjDarMethod = builder.adjDarMethod;
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParamsTransConfig create() {
            return builder().build();
        }

        /**
         * @return adjDarMethod
         */
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String adjDarMethod; 
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            private Builder() {
            } 

            private Builder(OverwriteParamsTransConfig model) {
                this.adjDarMethod = model.adjDarMethod;
                this.isCheckAudioBitrate = model.isCheckAudioBitrate;
                this.isCheckAudioBitrateFail = model.isCheckAudioBitrateFail;
                this.isCheckReso = model.isCheckReso;
                this.isCheckResoFail = model.isCheckResoFail;
                this.isCheckVideoBitrate = model.isCheckVideoBitrate;
                this.isCheckVideoBitrateFail = model.isCheckVideoBitrateFail;
                this.transMode = model.transMode;
            } 

            /**
             * <p>The method that is used to adjust the resolution. This parameter takes effect only if both the Width and Height parameters are specified. You can use this parameter together with the LongShortMode parameter.</p>
             * <p>Valid values: rescale, crop, pad, and none.</p>
             * <p>Default value: none.</p>
             * <p>For more information about examples, see How do I set the resolution for an output video?</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate was checked. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input audio is less than that of the output audio, the bitrate of the input audio is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value:</p>
             * <ul>
             * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
             * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the audio bitrate was checked. You can specify only one of the IsCheckAudioBitrate and IsCheckAudioBitrateFail parameters. The priority of the IsCheckAudioBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input audio is less than that of the output audio, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * <p>Indicates whether the video resolution was checked. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the width or height of the input video is less than that of the output video, the resolution of the input video is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * <p>Indicates whether the video resolution was checked. You can specify only one of the IsCheckReso and IsCheckResoFail parameters. The priority of the IsCheckResoFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the width or height of the input video is less than that of the output video, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate was checked. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input video is less than that of the output video, the bitrate of the input video is used for transcoding.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * <p>Indicates whether the video bitrate was checked. You can specify only one of the IsCheckVideoBitrate and IsCheckVideoBitrateFail parameters. The priority of the IsCheckVideoBitrateFail parameter is higher. Valid values:</p>
             * <ul>
             * <li>true If the bitrate of the input video is less than that of the output video, the transcoding job fails.</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * <p>The video transcoding mode. Valid values:</p>
             * <ul>
             * <li>onepass: You can set this parameter to onepass if the Bitrate parameter is set to ABR. The encoding speed of this mode is faster than that of the twopass mode.</li>
             * <li>twopass: You can set this parameter to twopass if the Bitrate parameter is set to VBR. The encoding speed of this mode is slower than that of the onepass mode.</li>
             * <li>CBR: the constant bitrate mode.</li>
             * </ul>
             * <p>Default value: onepass.</p>
             * 
             * <strong>example:</strong>
             * <p>onepass</p>
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public OverwriteParamsTransConfig build() {
                return new OverwriteParamsTransConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class OverwriteParamsVideo extends TeaModel {
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

        private OverwriteParamsVideo(Builder builder) {
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

        public static OverwriteParamsVideo create() {
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

            private Builder() {
            } 

            private Builder(OverwriteParamsVideo model) {
                this.abrMax = model.abrMax;
                this.bitrate = model.bitrate;
                this.bufsize = model.bufsize;
                this.codec = model.codec;
                this.crf = model.crf;
                this.crop = model.crop;
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.longShortMode = model.longShortMode;
                this.maxrate = model.maxrate;
                this.pad = model.pad;
                this.pixFmt = model.pixFmt;
                this.preset = model.preset;
                this.profile = model.profile;
                this.remove = model.remove;
                this.scanMode = model.scanMode;
                this.width = model.width;
            } 

            /**
             * <p>The maximum adaptive bitrate (ABR). This parameter takes effect only for Narrowband HD 1.0.</p>
             * <ul>
             * <li>Valid values: [10,50000].</li>
             * <li>Unit: Kbit/s.</li>
             * </ul>
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
             * <li>Unit: Kbit/s.</li>
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
             * <p>If this parameter is specified, the value of Bitrate becomes invalid.</p>
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
             * <li>A value in the width:height:left:top format: crops the videos based on the custom settings.</li>
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
             * <li>Valid values: (0,60]. The value is 60 if the frame rate of the input video exceeds 60.</li>
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
             * </ul>
             * <p>Default value: the height of the input video.</p>
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
             * <p>The maximum bitrate of the output video.</p>
             * <ul>
             * <li>Valid values: [10,50000].</li>
             * <li>Unit: Kbit/s.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * <p>The black bars added to the video. Format: width:height:left:top.</p>
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
             * </ul>
             * <p>Default value: the width of the input video.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public OverwriteParamsVideo build() {
                return new OverwriteParamsVideo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigTranscodeOverwriteParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private OverwriteParamsAudio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private OverwriteParamsContainer container;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private OverwriteParamsMuxConfig muxConfig;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private OverwriteParamsTransConfig transConfig;

        @com.aliyun.core.annotation.NameInMap("Video")
        private OverwriteParamsVideo video;

        private ProcessConfigTranscodeOverwriteParams(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.muxConfig = builder.muxConfig;
            this.tags = builder.tags;
            this.transConfig = builder.transConfig;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigTranscodeOverwriteParams create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public OverwriteParamsAudio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public OverwriteParamsContainer getContainer() {
            return this.container;
        }

        /**
         * @return muxConfig
         */
        public OverwriteParamsMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return transConfig
         */
        public OverwriteParamsTransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return video
         */
        public OverwriteParamsVideo getVideo() {
            return this.video;
        }

        public static final class Builder {
            private OverwriteParamsAudio audio; 
            private OverwriteParamsContainer container; 
            private OverwriteParamsMuxConfig muxConfig; 
            private java.util.Map<String, String> tags; 
            private OverwriteParamsTransConfig transConfig; 
            private OverwriteParamsVideo video; 

            private Builder() {
            } 

            private Builder(ProcessConfigTranscodeOverwriteParams model) {
                this.audio = model.audio;
                this.container = model.container;
                this.muxConfig = model.muxConfig;
                this.tags = model.tags;
                this.transConfig = model.transConfig;
                this.video = model.video;
            } 

            /**
             * <p>The audio settings.</p>
             */
            public Builder audio(OverwriteParamsAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The encapsulation format settings.</p>
             */
            public Builder container(OverwriteParamsContainer container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The encapsulation settings.</p>
             */
            public Builder muxConfig(OverwriteParamsMuxConfig muxConfig) {
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
             * <p>The conditional transcoding configurations.</p>
             */
            public Builder transConfig(OverwriteParamsTransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The video settings.</p>
             */
            public Builder video(OverwriteParamsVideo video) {
                this.video = video;
                return this;
            }

            public ProcessConfigTranscodeOverwriteParams build() {
                return new ProcessConfigTranscodeOverwriteParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class ProcessConfigTranscode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private ProcessConfigTranscodeOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private ProcessConfigTranscode(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessConfigTranscode create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public ProcessConfigTranscodeOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private ProcessConfigTranscodeOverwriteParams overwriteParams; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(ProcessConfigTranscode model) {
                this.overwriteParams = model.overwriteParams;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The parameters that are used to overwrite the corresponding parameters of the template.</p>
             */
            public Builder overwriteParams(ProcessConfigTranscodeOverwriteParams overwriteParams) {
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

            public ProcessConfigTranscode build() {
                return new ProcessConfigTranscode(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeJobListProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CombineConfigs")
        private java.util.List<ProcessConfigCombineConfigs> combineConfigs;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private ProcessConfigEncryption encryption;

        @com.aliyun.core.annotation.NameInMap("ImageWatermarks")
        private java.util.List<ProcessConfigImageWatermarks> imageWatermarks;

        @com.aliyun.core.annotation.NameInMap("IsInheritTags")
        private Boolean isInheritTags;

        @com.aliyun.core.annotation.NameInMap("Subtitles")
        private java.util.List<ProcessConfigSubtitles> subtitles;

        @com.aliyun.core.annotation.NameInMap("TextWatermarks")
        private java.util.List<ProcessConfigTextWatermarks> textWatermarks;

        @com.aliyun.core.annotation.NameInMap("Transcode")
        private ProcessConfigTranscode transcode;

        private TranscodeJobListProcessConfig(Builder builder) {
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

        public static TranscodeJobListProcessConfig create() {
            return builder().build();
        }

        /**
         * @return combineConfigs
         */
        public java.util.List<ProcessConfigCombineConfigs> getCombineConfigs() {
            return this.combineConfigs;
        }

        /**
         * @return encryption
         */
        public ProcessConfigEncryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return imageWatermarks
         */
        public java.util.List<ProcessConfigImageWatermarks> getImageWatermarks() {
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
        public java.util.List<ProcessConfigSubtitles> getSubtitles() {
            return this.subtitles;
        }

        /**
         * @return textWatermarks
         */
        public java.util.List<ProcessConfigTextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        /**
         * @return transcode
         */
        public ProcessConfigTranscode getTranscode() {
            return this.transcode;
        }

        public static final class Builder {
            private java.util.List<ProcessConfigCombineConfigs> combineConfigs; 
            private ProcessConfigEncryption encryption; 
            private java.util.List<ProcessConfigImageWatermarks> imageWatermarks; 
            private Boolean isInheritTags; 
            private java.util.List<ProcessConfigSubtitles> subtitles; 
            private java.util.List<ProcessConfigTextWatermarks> textWatermarks; 
            private ProcessConfigTranscode transcode; 

            private Builder() {
            } 

            private Builder(TranscodeJobListProcessConfig model) {
                this.combineConfigs = model.combineConfigs;
                this.encryption = model.encryption;
                this.imageWatermarks = model.imageWatermarks;
                this.isInheritTags = model.isInheritTags;
                this.subtitles = model.subtitles;
                this.textWatermarks = model.textWatermarks;
                this.transcode = model.transcode;
            } 

            /**
             * <p>The multi-input stream merge configuration.</p>
             */
            public Builder combineConfigs(java.util.List<ProcessConfigCombineConfigs> combineConfigs) {
                this.combineConfigs = combineConfigs;
                return this;
            }

            /**
             * <p>The encryption settings.</p>
             */
            public Builder encryption(ProcessConfigEncryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The watermark configuration of an image.</p>
             */
            public Builder imageWatermarks(java.util.List<ProcessConfigImageWatermarks> imageWatermarks) {
                this.imageWatermarks = imageWatermarks;
                return this;
            }

            /**
             * <p>Indicates whether the tags of the input stream are inherited in the output stream. This parameter does not take effect when the input is not a media asset. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isInheritTags(Boolean isInheritTags) {
                this.isInheritTags = isInheritTags;
                return this;
            }

            /**
             * <p>The subtitle configuration.</p>
             */
            public Builder subtitles(java.util.List<ProcessConfigSubtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * <p>The configurations of the text watermark.</p>
             */
            public Builder textWatermarks(java.util.List<ProcessConfigTextWatermarks> textWatermarks) {
                this.textWatermarks = textWatermarks;
                return this;
            }

            /**
             * <p>The transcoding configuration.</p>
             */
            public Builder transcode(ProcessConfigTranscode transcode) {
                this.transcode = transcode;
                return this;
            }

            public TranscodeJobListProcessConfig build() {
                return new TranscodeJobListProcessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeJobListScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private TranscodeJobListScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobListScheduleConfig create() {
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

            private Builder() {
            } 

            private Builder(TranscodeJobListScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the snapshot job was submitted.</p>
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

            public TranscodeJobListScheduleConfig build() {
                return new TranscodeJobListScheduleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InputGroup")
        private java.util.List<TranscodeJobListInputGroup> inputGroup;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobIndex")
        private Integer jobIndex;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutFileMeta")
        private OutFileMeta outFileMeta;

        @com.aliyun.core.annotation.NameInMap("Output")
        private TranscodeJobListOutput output;

        @com.aliyun.core.annotation.NameInMap("ParentJobId")
        private String parentJobId;

        @com.aliyun.core.annotation.NameInMap("ProcessConfig")
        private TranscodeJobListProcessConfig processConfig;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private TranscodeJobListScheduleConfig scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitResultJson")
        private java.util.Map<String, ?> submitResultJson;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private TranscodeJobList(Builder builder) {
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.inputGroup = builder.inputGroup;
            this.jobId = builder.jobId;
            this.jobIndex = builder.jobIndex;
            this.name = builder.name;
            this.outFileMeta = builder.outFileMeta;
            this.output = builder.output;
            this.parentJobId = builder.parentJobId;
            this.processConfig = builder.processConfig;
            this.requestId = builder.requestId;
            this.scheduleConfig = builder.scheduleConfig;
            this.status = builder.status;
            this.submitResultJson = builder.submitResultJson;
            this.submitTime = builder.submitTime;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeJobList create() {
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
        public java.util.List<TranscodeJobListInputGroup> getInputGroup() {
            return this.inputGroup;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobIndex
         */
        public Integer getJobIndex() {
            return this.jobIndex;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outFileMeta
         */
        public OutFileMeta getOutFileMeta() {
            return this.outFileMeta;
        }

        /**
         * @return output
         */
        public TranscodeJobListOutput getOutput() {
            return this.output;
        }

        /**
         * @return parentJobId
         */
        public String getParentJobId() {
            return this.parentJobId;
        }

        /**
         * @return processConfig
         */
        public TranscodeJobListProcessConfig getProcessConfig() {
            return this.processConfig;
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
        public TranscodeJobListScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitResultJson
         */
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
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
            private java.util.List<TranscodeJobListInputGroup> inputGroup; 
            private String jobId; 
            private Integer jobIndex; 
            private String name; 
            private OutFileMeta outFileMeta; 
            private TranscodeJobListOutput output; 
            private String parentJobId; 
            private TranscodeJobListProcessConfig processConfig; 
            private String requestId; 
            private TranscodeJobListScheduleConfig scheduleConfig; 
            private String status; 
            private java.util.Map<String, ?> submitResultJson; 
            private String submitTime; 
            private String userData; 

            private Builder() {
            } 

            private Builder(TranscodeJobList model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.inputGroup = model.inputGroup;
                this.jobId = model.jobId;
                this.jobIndex = model.jobIndex;
                this.name = model.name;
                this.outFileMeta = model.outFileMeta;
                this.output = model.output;
                this.parentJobId = model.parentJobId;
                this.processConfig = model.processConfig;
                this.requestId = model.requestId;
                this.scheduleConfig = model.scheduleConfig;
                this.status = model.status;
                this.submitResultJson = model.submitResultJson;
                this.submitTime = model.submitTime;
                this.userData = model.userData;
            } 

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the job was complete.</p>
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
            public Builder inputGroup(java.util.List<TranscodeJobListInputGroup> inputGroup) {
                this.inputGroup = inputGroup;
                return this;
            }

            /**
             * <p>The subjob ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7d6a7e0d4db2457a8d45ff5d43e1bf0a</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The index number of the subjob in the entire job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jobIndex(Integer jobIndex) {
                this.jobIndex = jobIndex;
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
             * <p>The media information about the video generated by the job.</p>
             */
            public Builder outFileMeta(OutFileMeta outFileMeta) {
                this.outFileMeta = outFileMeta;
                return this;
            }

            /**
             * <p>The output file configuration.</p>
             */
            public Builder output(TranscodeJobListOutput output) {
                this.output = output;
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
             * <p>The transcoding configuration.</p>
             */
            public Builder processConfig(TranscodeJobListProcessConfig processConfig) {
                this.processConfig = processConfig;
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
             * <p>The scheduling information about the job.</p>
             */
            public Builder scheduleConfig(TranscodeJobListScheduleConfig scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * <p>The state of the transcoding job. Valid values: Init (the job is submitted), Success (the job is successful), Fail (the job failed), and Deleted (the job is deleted).</p>
             * 
             * <strong>example:</strong>
             * <p>Init</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The job submission result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder submitResultJson(java.util.Map<String, ?> submitResultJson) {
                this.submitResultJson = submitResultJson;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-12T08:49:41Z</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
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

            public TranscodeJobList build() {
                return new TranscodeJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeJobResponseBody</p>
     */
    public static class TranscodeParentJob extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("TranscodeJobList")
        private java.util.List<TranscodeJobList> transcodeJobList;

        @com.aliyun.core.annotation.NameInMap("TriggerSource")
        private String triggerSource;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private TranscodeParentJob(Builder builder) {
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
            this.transcodeJobList = builder.transcodeJobList;
            this.triggerSource = builder.triggerSource;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeParentJob create() {
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
         * @return transcodeJobList
         */
        public java.util.List<TranscodeJobList> getTranscodeJobList() {
            return this.transcodeJobList;
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
            private java.util.List<TranscodeJobList> transcodeJobList; 
            private String triggerSource; 
            private String userData; 

            private Builder() {
            } 

            private Builder(TranscodeParentJob model) {
                this.createTime = model.createTime;
                this.finishTime = model.finishTime;
                this.inputGroup = model.inputGroup;
                this.jobCount = model.jobCount;
                this.name = model.name;
                this.outputGroup = model.outputGroup;
                this.parentJobId = model.parentJobId;
                this.percent = model.percent;
                this.requestId = model.requestId;
                this.scheduleConfig = model.scheduleConfig;
                this.status = model.status;
                this.submitTime = model.submitTime;
                this.transcodeJobList = model.transcodeJobList;
                this.triggerSource = model.triggerSource;
                this.userData = model.userData;
            } 

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
             * <p>The list of subjobs.</p>
             */
            public Builder transcodeJobList(java.util.List<TranscodeJobList> transcodeJobList) {
                this.transcodeJobList = transcodeJobList;
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

            public TranscodeParentJob build() {
                return new TranscodeParentJob(this);
            } 

        } 

    }
}
