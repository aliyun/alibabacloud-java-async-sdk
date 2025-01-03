// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitSmartClipTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmartClipTaskRequest</p>
 */
public class SubmitSmartClipTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    private EditingConfig editingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendParam")
    private String extendParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private InputConfig inputConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private OutputConfig outputConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitSmartClipTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.editingConfig = builder.editingConfig;
        this.extendParam = builder.extendParam;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmartClipTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return editingConfig
     */
    public EditingConfig getEditingConfig() {
        return this.editingConfig;
    }

    /**
     * @return extendParam
     */
    public String getExtendParam() {
        return this.extendParam;
    }

    /**
     * @return inputConfig
     */
    public InputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return outputConfig
     */
    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitSmartClipTaskRequest, Builder> {
        private String regionId; 
        private EditingConfig editingConfig; 
        private String extendParam; 
        private InputConfig inputConfig; 
        private OutputConfig outputConfig; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmartClipTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.editingConfig = request.editingConfig;
            this.extendParam = request.extendParam;
            this.inputConfig = request.inputConfig;
            this.outputConfig = request.outputConfig;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EditingConfig.
         */
        public Builder editingConfig(EditingConfig editingConfig) {
            String editingConfigShrink = shrink(editingConfig, "EditingConfig", "json");
            this.putBodyParameter("EditingConfig", editingConfigShrink);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * ExtendParam.
         */
        public Builder extendParam(String extendParam) {
            this.putBodyParameter("ExtendParam", extendParam);
            this.extendParam = extendParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputConfig(InputConfig inputConfig) {
            String inputConfigShrink = shrink(inputConfig, "InputConfig", "json");
            this.putBodyParameter("InputConfig", inputConfigShrink);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * OutputConfig.
         */
        public Builder outputConfig(OutputConfig outputConfig) {
            String outputConfigShrink = shrink(outputConfig, "OutputConfig", "json");
            this.putBodyParameter("OutputConfig", outputConfigShrink);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitSmartClipTaskRequest build() {
            return new SubmitSmartClipTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class BackgroundMusicConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Double volume;

        private BackgroundMusicConfig(Builder builder) {
            this.style = builder.style;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundMusicConfig create() {
            return builder().build();
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return volume
         */
        public Double getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String style; 
            private Double volume; 

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Double volume) {
                this.volume = volume;
                return this;
            }

            public BackgroundMusicConfig build() {
                return new BackgroundMusicConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class MediaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Volume")
        private Double volume;

        private MediaConfig(Builder builder) {
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaConfig create() {
            return builder().build();
        }

        /**
         * @return volume
         */
        public Double getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Double volume; 

            /**
             * Volume.
             */
            public Builder volume(Double volume) {
                this.volume = volume;
                return this;
            }

            public MediaConfig build() {
                return new MediaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class AsrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alignment")
        private String alignment;

        @com.aliyun.core.annotation.NameInMap("Font")
        private String font;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private String fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private String fontSize;

        @com.aliyun.core.annotation.NameInMap("Spacing")
        private String spacing;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private AsrConfig(Builder builder) {
            this.alignment = builder.alignment;
            this.font = builder.font;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.spacing = builder.spacing;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrConfig create() {
            return builder().build();
        }

        /**
         * @return alignment
         */
        public String getAlignment() {
            return this.alignment;
        }

        /**
         * @return font
         */
        public String getFont() {
            return this.font;
        }

        /**
         * @return fontColor
         */
        public String getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public String getFontSize() {
            return this.fontSize;
        }

        /**
         * @return spacing
         */
        public String getSpacing() {
            return this.spacing;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private String alignment; 
            private String font; 
            private String fontColor; 
            private String fontSize; 
            private String spacing; 
            private Float x; 
            private Float y; 

            /**
             * Alignment.
             */
            public Builder alignment(String alignment) {
                this.alignment = alignment;
                return this;
            }

            /**
             * Font.
             */
            public Builder font(String font) {
                this.font = font;
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
             * FontSize.
             */
            public Builder fontSize(String fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Spacing.
             */
            public Builder spacing(String spacing) {
                this.spacing = spacing;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public AsrConfig build() {
                return new AsrConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class SpeechConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrConfig")
        private AsrConfig asrConfig;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Double speechRate;

        @com.aliyun.core.annotation.NameInMap("Style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Double volume;

        private SpeechConfig(Builder builder) {
            this.asrConfig = builder.asrConfig;
            this.speechRate = builder.speechRate;
            this.style = builder.style;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpeechConfig create() {
            return builder().build();
        }

        /**
         * @return asrConfig
         */
        public AsrConfig getAsrConfig() {
            return this.asrConfig;
        }

        /**
         * @return speechRate
         */
        public Double getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Double getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private AsrConfig asrConfig; 
            private Double speechRate; 
            private String style; 
            private String voice; 
            private Double volume; 

            /**
             * AsrConfig.
             */
            public Builder asrConfig(AsrConfig asrConfig) {
                this.asrConfig = asrConfig;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Double speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Double volume) {
                this.volume = volume;
                return this;
            }

            public SpeechConfig build() {
                return new SpeechConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class TitleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alignment")
        private String alignment;

        @com.aliyun.core.annotation.NameInMap("TimelineIn")
        private Float timelineIn;

        @com.aliyun.core.annotation.NameInMap("TimelineOut")
        private Float timelineOut;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private TitleConfig(Builder builder) {
            this.alignment = builder.alignment;
            this.timelineIn = builder.timelineIn;
            this.timelineOut = builder.timelineOut;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TitleConfig create() {
            return builder().build();
        }

        /**
         * @return alignment
         */
        public String getAlignment() {
            return this.alignment;
        }

        /**
         * @return timelineIn
         */
        public Float getTimelineIn() {
            return this.timelineIn;
        }

        /**
         * @return timelineOut
         */
        public Float getTimelineOut() {
            return this.timelineOut;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private String alignment; 
            private Float timelineIn; 
            private Float timelineOut; 
            private Float x; 
            private Float y; 

            /**
             * Alignment.
             */
            public Builder alignment(String alignment) {
                this.alignment = alignment;
                return this;
            }

            /**
             * TimelineIn.
             */
            public Builder timelineIn(Float timelineIn) {
                this.timelineIn = timelineIn;
                return this;
            }

            /**
             * TimelineOut.
             */
            public Builder timelineOut(Float timelineOut) {
                this.timelineOut = timelineOut;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public TitleConfig build() {
                return new TitleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class EditingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundMusicConfig")
        private BackgroundMusicConfig backgroundMusicConfig;

        @com.aliyun.core.annotation.NameInMap("MediaConfig")
        private MediaConfig mediaConfig;

        @com.aliyun.core.annotation.NameInMap("SpeechConfig")
        private SpeechConfig speechConfig;

        @com.aliyun.core.annotation.NameInMap("TitleConfig")
        private TitleConfig titleConfig;

        private EditingConfig(Builder builder) {
            this.backgroundMusicConfig = builder.backgroundMusicConfig;
            this.mediaConfig = builder.mediaConfig;
            this.speechConfig = builder.speechConfig;
            this.titleConfig = builder.titleConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundMusicConfig
         */
        public BackgroundMusicConfig getBackgroundMusicConfig() {
            return this.backgroundMusicConfig;
        }

        /**
         * @return mediaConfig
         */
        public MediaConfig getMediaConfig() {
            return this.mediaConfig;
        }

        /**
         * @return speechConfig
         */
        public SpeechConfig getSpeechConfig() {
            return this.speechConfig;
        }

        /**
         * @return titleConfig
         */
        public TitleConfig getTitleConfig() {
            return this.titleConfig;
        }

        public static final class Builder {
            private BackgroundMusicConfig backgroundMusicConfig; 
            private MediaConfig mediaConfig; 
            private SpeechConfig speechConfig; 
            private TitleConfig titleConfig; 

            /**
             * BackgroundMusicConfig.
             */
            public Builder backgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
                this.backgroundMusicConfig = backgroundMusicConfig;
                return this;
            }

            /**
             * MediaConfig.
             */
            public Builder mediaConfig(MediaConfig mediaConfig) {
                this.mediaConfig = mediaConfig;
                return this;
            }

            /**
             * SpeechConfig.
             */
            public Builder speechConfig(SpeechConfig speechConfig) {
                this.speechConfig = speechConfig;
                return this;
            }

            /**
             * TitleConfig.
             */
            public Builder titleConfig(TitleConfig titleConfig) {
                this.titleConfig = titleConfig;
                return this;
            }

            public EditingConfig build() {
                return new EditingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class BackgroundMusics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private BackgroundMusics(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundMusics create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://default/bucket-name/filepath/video.mp3</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fileKey</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BackgroundMusics build() {
                return new BackgroundMusics(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class StickerId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private StickerId(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StickerId create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://default/bucket-name/filepath/sticker.png</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fileKey</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StickerId build() {
                return new StickerId(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class Stickers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("StickerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private StickerId stickerId;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double y;

        private Stickers(Builder builder) {
            this.height = builder.height;
            this.stickerId = builder.stickerId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stickers create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return stickerId
         */
        public StickerId getStickerId() {
            return this.stickerId;
        }

        /**
         * @return width
         */
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        public static final class Builder {
            private Double height; 
            private StickerId stickerId; 
            private Double width; 
            private Double x; 
            private Double y; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder stickerId(StickerId stickerId) {
                this.stickerId = stickerId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            public Stickers build() {
                return new Stickers(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class VideoIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private VideoIds(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoIds create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://default/bucket-name/filepath/video.mp4</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fileKey</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VideoIds build() {
                return new VideoIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class InputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundMusics")
        private java.util.List<BackgroundMusics> backgroundMusics;

        @com.aliyun.core.annotation.NameInMap("SpeechTexts")
        private java.util.List<String> speechTexts;

        @com.aliyun.core.annotation.NameInMap("Stickers")
        private java.util.List<Stickers> stickers;

        @com.aliyun.core.annotation.NameInMap("Titles")
        private java.util.List<String> titles;

        @com.aliyun.core.annotation.NameInMap("VideoIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<VideoIds> videoIds;

        private InputConfig(Builder builder) {
            this.backgroundMusics = builder.backgroundMusics;
            this.speechTexts = builder.speechTexts;
            this.stickers = builder.stickers;
            this.titles = builder.titles;
            this.videoIds = builder.videoIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputConfig create() {
            return builder().build();
        }

        /**
         * @return backgroundMusics
         */
        public java.util.List<BackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        /**
         * @return speechTexts
         */
        public java.util.List<String> getSpeechTexts() {
            return this.speechTexts;
        }

        /**
         * @return stickers
         */
        public java.util.List<Stickers> getStickers() {
            return this.stickers;
        }

        /**
         * @return titles
         */
        public java.util.List<String> getTitles() {
            return this.titles;
        }

        /**
         * @return videoIds
         */
        public java.util.List<VideoIds> getVideoIds() {
            return this.videoIds;
        }

        public static final class Builder {
            private java.util.List<BackgroundMusics> backgroundMusics; 
            private java.util.List<String> speechTexts; 
            private java.util.List<Stickers> stickers; 
            private java.util.List<String> titles; 
            private java.util.List<VideoIds> videoIds; 

            /**
             * BackgroundMusics.
             */
            public Builder backgroundMusics(java.util.List<BackgroundMusics> backgroundMusics) {
                this.backgroundMusics = backgroundMusics;
                return this;
            }

            /**
             * SpeechTexts.
             */
            public Builder speechTexts(java.util.List<String> speechTexts) {
                this.speechTexts = speechTexts;
                return this;
            }

            /**
             * Stickers.
             */
            public Builder stickers(java.util.List<Stickers> stickers) {
                this.stickers = stickers;
                return this;
            }

            /**
             * Titles.
             */
            public Builder titles(java.util.List<String> titles) {
                this.titles = titles;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder videoIds(java.util.List<VideoIds> videoIds) {
                this.videoIds = videoIds;
                return this;
            }

            public InputConfig build() {
                return new InputConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmartClipTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmartClipTaskRequest</p>
     */
    public static class OutputConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("MaxDuration")
        private Integer maxDuration;

        @com.aliyun.core.annotation.NameInMap("SaveToGeneratedContent")
        private Boolean saveToGeneratedContent;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private OutputConfig(Builder builder) {
            this.count = builder.count;
            this.fileName = builder.fileName;
            this.height = builder.height;
            this.maxDuration = builder.maxDuration;
            this.saveToGeneratedContent = builder.saveToGeneratedContent;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputConfig create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return maxDuration
         */
        public Integer getMaxDuration() {
            return this.maxDuration;
        }

        /**
         * @return saveToGeneratedContent
         */
        public Boolean getSaveToGeneratedContent() {
            return this.saveToGeneratedContent;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer count; 
            private String fileName; 
            private Integer height; 
            private Integer maxDuration; 
            private Boolean saveToGeneratedContent; 
            private Integer width; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * MaxDuration.
             */
            public Builder maxDuration(Integer maxDuration) {
                this.maxDuration = maxDuration;
                return this;
            }

            /**
             * SaveToGeneratedContent.
             */
            public Builder saveToGeneratedContent(Boolean saveToGeneratedContent) {
                this.saveToGeneratedContent = saveToGeneratedContent;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public OutputConfig build() {
                return new OutputConfig(this);
            } 

        } 

    }
}
