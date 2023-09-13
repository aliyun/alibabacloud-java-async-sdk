// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobRequest</p>
 */
public class SubmitTranscodeJobRequest extends Request {
    @Query
    @NameInMap("InputGroup")
    @Validation(required = true)
    private java.util.List < InputGroup> inputGroup;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OutputGroup")
    @Validation(required = true)
    private java.util.List < OutputGroup> outputGroup;

    @Query
    @NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitTranscodeJobRequest(Builder builder) {
        super(builder);
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
            this.inputGroup = request.inputGroup;
            this.name = request.name;
            this.outputGroup = request.outputGroup;
            this.scheduleConfig = request.scheduleConfig;
            this.userData = request.userData;
        } 

        /**
         * InputGroup.
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
         * OutputGroup.
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

    public static class InputGroup extends TeaModel {
        @NameInMap("InputUrl")
        private String inputUrl;

        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("Type")
        @Validation(required = true)
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
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
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
    public static class Output extends TeaModel {
        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("OutputUrl")
        private String outputUrl;

        @NameInMap("Type")
        @Validation(required = true)
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
             * Media.
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
             * Type.
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
    public static class CombineConfigs extends TeaModel {
        @NameInMap("AudioIndex")
        @Validation(required = true)
        private String audioIndex;

        @NameInMap("Duration")
        private Double duration;

        @NameInMap("Start")
        private Double start;

        @NameInMap("VideoIndex")
        @Validation(required = true)
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
             * AudioIndex.
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
             * VideoIndex.
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
    public static class Encryption extends TeaModel {
        @NameInMap("CipherText")
        private String cipherText;

        @NameInMap("DecryptKeyUri")
        private String decryptKeyUri;

        @NameInMap("EncryptType")
        private String encryptType;

        @NameInMap("KeyServiceType")
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
    public static class File extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("Type")
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
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
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
    public static class Timeline extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("Start")
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
    public static class OverwriteParams extends TeaModel {
        @NameInMap("Dx")
        private String dx;

        @NameInMap("Dy")
        private String dy;

        @NameInMap("File")
        private File file;

        @NameInMap("Height")
        private String height;

        @NameInMap("ReferPos")
        private String referPos;

        @NameInMap("Timeline")
        private Timeline timeline;

        @NameInMap("Width")
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
    public static class ImageWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        private OverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        @Validation(required = true)
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
             * TemplateId.
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
    public static class OverwriteParamsFile extends TeaModel {
        @NameInMap("Media")
        private String media;

        @NameInMap("Type")
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
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
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
    public static class SubtitlesOverwriteParams extends TeaModel {
        @NameInMap("CharEnc")
        private String charEnc;

        @NameInMap("File")
        private OverwriteParamsFile file;

        @NameInMap("Format")
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
    public static class Subtitles extends TeaModel {
        @NameInMap("OverwriteParams")
        private SubtitlesOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        @Validation(required = true)
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
             * TemplateId.
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
    public static class TextWatermarksOverwriteParams extends TeaModel {
        @NameInMap("Adaptive")
        private String adaptive;

        @NameInMap("BorderColor")
        private String borderColor;

        @NameInMap("BorderWidth")
        private Integer borderWidth;

        @NameInMap("Content")
        private String content;

        @NameInMap("FontAlpha")
        private String fontAlpha;

        @NameInMap("FontColor")
        private String fontColor;

        @NameInMap("FontName")
        private String fontName;

        @NameInMap("FontSize")
        private Integer fontSize;

        @NameInMap("Left")
        private String left;

        @NameInMap("Top")
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
    public static class TextWatermarks extends TeaModel {
        @NameInMap("OverwriteParams")
        private TextWatermarksOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        @Validation(required = true)
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
             * TemplateId.
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
    public static class Volume extends TeaModel {
        @NameInMap("IntegratedLoudnessTarget")
        private String integratedLoudnessTarget;

        @NameInMap("LoudnessRangeTarget")
        private String loudnessRangeTarget;

        @NameInMap("Method")
        private String method;

        @NameInMap("TruePeak")
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
    public static class Audio extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Remove")
        private String remove;

        @NameInMap("Samplerate")
        private String samplerate;

        @NameInMap("Volume")
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
    public static class Container extends TeaModel {
        @NameInMap("Format")
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
    public static class Segment extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("ForceSegTime")
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
    public static class MuxConfig extends TeaModel {
        @NameInMap("Segment")
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
    public static class TransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        private String isCheckReso;

        @NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
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
    public static class Video extends TeaModel {
        @NameInMap("AbrMax")
        private String abrMax;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Bufsize")
        private String bufsize;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Crf")
        private String crf;

        @NameInMap("Crop")
        private String crop;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private String height;

        @NameInMap("LongShortMode")
        private String longShortMode;

        @NameInMap("Maxrate")
        private String maxrate;

        @NameInMap("Pad")
        private String pad;

        @NameInMap("PixFmt")
        private String pixFmt;

        @NameInMap("Preset")
        private String preset;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Remove")
        private String remove;

        @NameInMap("ScanMode")
        private String scanMode;

        @NameInMap("Width")
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
    public static class TranscodeOverwriteParams extends TeaModel {
        @NameInMap("Audio")
        private Audio audio;

        @NameInMap("Container")
        private Container container;

        @NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @NameInMap("Tags")
        private java.util.Map < String, String > tags;

        @NameInMap("TransConfig")
        private TransConfig transConfig;

        @NameInMap("Video")
        private Video video;

        private TranscodeOverwriteParams(Builder builder) {
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
        public java.util.Map < String, String > getTags() {
            return this.tags;
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
            private java.util.Map < String, String > tags; 
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
             * Tags.
             */
            public Builder tags(java.util.Map < String, String > tags) {
                this.tags = tags;
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
    public static class Transcode extends TeaModel {
        @NameInMap("OverwriteParams")
        private TranscodeOverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        @Validation(required = true)
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
             * TemplateId.
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
    public static class ProcessConfig extends TeaModel {
        @NameInMap("CombineConfigs")
        private java.util.List < CombineConfigs> combineConfigs;

        @NameInMap("Encryption")
        private Encryption encryption;

        @NameInMap("ImageWatermarks")
        private java.util.List < ImageWatermarks> imageWatermarks;

        @NameInMap("IsInheritTags")
        private Boolean isInheritTags;

        @NameInMap("Subtitles")
        private java.util.List < Subtitles> subtitles;

        @NameInMap("TextWatermarks")
        private java.util.List < TextWatermarks> textWatermarks;

        @NameInMap("Transcode")
        @Validation(required = true)
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
         * @return isInheritTags
         */
        public Boolean getIsInheritTags() {
            return this.isInheritTags;
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
            private Boolean isInheritTags; 
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
             * IsInheritTags.
             */
            public Builder isInheritTags(Boolean isInheritTags) {
                this.isInheritTags = isInheritTags;
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
             * Transcode.
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
    public static class OutputGroup extends TeaModel {
        @NameInMap("Output")
        @Validation(required = true)
        private Output output;

        @NameInMap("ProcessConfig")
        @Validation(required = true)
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
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * ProcessConfig.
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
    public static class ScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("Priority")
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
