// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobRequest</p>
 */
public class SubmitTranscodeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < InputGroup> inputGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OutputGroup> outputGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTranscodeJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.inputGroup = builder.inputGroup;
        this.name = builder.name;
        this.outputGroup = builder.outputGroup;
        this.scheduleConfig = builder.scheduleConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranscodeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return inputGroup
     */
    public java.util.List < InputGroup> getInputGroup() {
        return this.inputGroup;
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
    public java.util.List < OutputGroup> getOutputGroup() {
        return this.outputGroup;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTranscodeJobRequest, Builder> {
        private String clientToken; 
        private java.util.List < InputGroup> inputGroup; 
        private String name; 
        private java.util.List < OutputGroup> outputGroup; 
        private ScheduleConfig scheduleConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTranscodeJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.inputGroup = request.inputGroup;
            this.name = request.name;
            this.outputGroup = request.outputGroup;
            this.scheduleConfig = request.scheduleConfig;
            this.userData = request.userData;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputGroup(java.util.List < InputGroup> inputGroup) {
            String inputGroupShrink = shrink(inputGroup, "InputGroup", "json");
            this.putQueryParameter("InputGroup", inputGroupShrink);
            this.inputGroup = inputGroup;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outputGroup(java.util.List < OutputGroup> outputGroup) {
            String outputGroupShrink = shrink(outputGroup, "OutputGroup", "json");
            this.putQueryParameter("OutputGroup", outputGroupShrink);
            this.outputGroup = outputGroup;
            return this;
        }

        /**
         * ScheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTranscodeJobRequest build() {
            return new SubmitTranscodeJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class InputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * InputUrl.
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Double start) {
                this.start = start;
                return this;
            }

            /**
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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

            /**
             * CipherText.
             */
            public Builder cipherText(String cipherText) {
                this.cipherText = cipherText;
                return this;
            }

            /**
             * DecryptKeyUri.
             */
            public Builder decryptKeyUri(String decryptKeyUri) {
                this.decryptKeyUri = decryptKeyUri;
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
             * KeyServiceType.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Dx.
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * Dy.
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * File.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * ReferPos.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * Timeline.
             */
            public Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            /**
             * Width.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class ImageWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private OverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * OverwriteParams.
             */
            public Builder overwriteParams(OverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * CharEnc.
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * File.
             */
            public Builder file(OverwriteParamsFile file) {
                this.file = file;
                return this;
            }

            /**
             * Format.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class Subtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private SubtitlesOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * OverwriteParams.
             */
            public Builder overwriteParams(SubtitlesOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Adaptive.
             */
            public Builder adaptive(String adaptive) {
                this.adaptive = adaptive;
                return this;
            }

            /**
             * BorderColor.
             */
            public Builder borderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * BorderWidth.
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FontAlpha.
             */
            public Builder fontAlpha(String fontAlpha) {
                this.fontAlpha = fontAlpha;
                return this;
            }

            /**
             * FontColor.
             */
            public Builder fontColor(String fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * FontName.
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class TextWatermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private TextWatermarksOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * OverwriteParams.
             */
            public Builder overwriteParams(TextWatermarksOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * IntegratedLoudnessTarget.
             */
            public Builder integratedLoudnessTarget(String integratedLoudnessTarget) {
                this.integratedLoudnessTarget = integratedLoudnessTarget;
                return this;
            }

            /**
             * LoudnessRangeTarget.
             */
            public Builder loudnessRangeTarget(String loudnessRangeTarget) {
                this.loudnessRangeTarget = loudnessRangeTarget;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * TruePeak.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Remove.
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * Samplerate.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * Volume.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Format.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ForceSegTime.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * Segment.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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

            /**
             * AdjDarMethod.
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * IsCheckAudioBitrate.
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * IsCheckAudioBitrateFail.
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * IsCheckReso.
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * IsCheckResoFail.
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * IsCheckVideoBitrate.
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * IsCheckVideoBitrateFail.
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * TransMode.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * AbrMax.
             */
            public Builder abrMax(String abrMax) {
                this.abrMax = abrMax;
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
             * Bufsize.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Crf.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * Crop.
             */
            public Builder crop(String crop) {
                this.crop = crop;
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
             * Gop.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * LongShortMode.
             */
            public Builder longShortMode(String longShortMode) {
                this.longShortMode = longShortMode;
                return this;
            }

            /**
             * Maxrate.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * Pad.
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * PixFmt.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * Preset.
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Remove.
             */
            public Builder remove(String remove) {
                this.remove = remove;
                return this;
            }

            /**
             * ScanMode.
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * Width.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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

            /**
             * Audio.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * MuxConfig.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * TransConfig.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * Video.
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class Transcode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverwriteParams")
        private TranscodeOverwriteParams overwriteParams;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * OverwriteParams.
             */
            public Builder overwriteParams(TranscodeOverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class ProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CombineConfigs")
        private java.util.List < CombineConfigs> combineConfigs;

        @com.aliyun.core.annotation.NameInMap("Encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("ImageWatermarks")
        private java.util.List < ImageWatermarks> imageWatermarks;

        @com.aliyun.core.annotation.NameInMap("Subtitles")
        private java.util.List < Subtitles> subtitles;

        @com.aliyun.core.annotation.NameInMap("TextWatermarks")
        private java.util.List < TextWatermarks> textWatermarks;

        @com.aliyun.core.annotation.NameInMap("Transcode")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public java.util.List < CombineConfigs> getCombineConfigs() {
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
        public java.util.List < ImageWatermarks> getImageWatermarks() {
            return this.imageWatermarks;
        }

        /**
         * @return subtitles
         */
        public java.util.List < Subtitles> getSubtitles() {
            return this.subtitles;
        }

        /**
         * @return textWatermarks
         */
        public java.util.List < TextWatermarks> getTextWatermarks() {
            return this.textWatermarks;
        }

        /**
         * @return transcode
         */
        public Transcode getTranscode() {
            return this.transcode;
        }

        public static final class Builder {
            private java.util.List < CombineConfigs> combineConfigs; 
            private Encryption encryption; 
            private java.util.List < ImageWatermarks> imageWatermarks; 
            private java.util.List < Subtitles> subtitles; 
            private java.util.List < TextWatermarks> textWatermarks; 
            private Transcode transcode; 

            /**
             * CombineConfigs.
             */
            public Builder combineConfigs(java.util.List < CombineConfigs> combineConfigs) {
                this.combineConfigs = combineConfigs;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * ImageWatermarks.
             */
            public Builder imageWatermarks(java.util.List < ImageWatermarks> imageWatermarks) {
                this.imageWatermarks = imageWatermarks;
                return this;
            }

            /**
             * Subtitles.
             */
            public Builder subtitles(java.util.List < Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * TextWatermarks.
             */
            public Builder textWatermarks(java.util.List < TextWatermarks> textWatermarks) {
                this.textWatermarks = textWatermarks;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
     */
    public static class OutputGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        @com.aliyun.core.annotation.Validation(required = true)
        private Output output;

        @com.aliyun.core.annotation.NameInMap("ProcessConfig")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTranscodeJobRequest</p>
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
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * Priority.
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
}
