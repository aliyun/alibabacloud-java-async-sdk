// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDigitalHumanProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateDigitalHumanProjectRequest</p>
 */
public class CreateDigitalHumanProjectRequest extends Request {
    @Body
    @NameInMap("AudioId")
    private String audioId;

    @Body
    @NameInMap("AudioUrl")
    private String audioUrl;

    @Body
    @NameInMap("BackgroundId")
    private String backgroundId;

    @Body
    @NameInMap("BackgroundUrl")
    private String backgroundUrl;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("ForegroundId")
    private String foregroundId;

    @Body
    @NameInMap("ForegroundUrl")
    private String foregroundUrl;

    @Body
    @NameInMap("HumanLayerStyle")
    private String humanLayerStyle;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Body
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Body
    @NameInMap("OutputConfig")
    private String outputConfig;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("TtsVoiceId")
    private String ttsVoiceId;

    @Body
    @NameInMap("WatermarkImageUrl")
    private String watermarkImageUrl;

    @Body
    @NameInMap("WatermarkStyle")
    private String watermarkStyle;

    private CreateDigitalHumanProjectRequest(Builder builder) {
        super(builder);
        this.audioId = builder.audioId;
        this.audioUrl = builder.audioUrl;
        this.backgroundId = builder.backgroundId;
        this.backgroundUrl = builder.backgroundUrl;
        this.content = builder.content;
        this.foregroundId = builder.foregroundId;
        this.foregroundUrl = builder.foregroundUrl;
        this.humanLayerStyle = builder.humanLayerStyle;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.mode = builder.mode;
        this.modelId = builder.modelId;
        this.outputConfig = builder.outputConfig;
        this.title = builder.title;
        this.ttsVoiceId = builder.ttsVoiceId;
        this.watermarkImageUrl = builder.watermarkImageUrl;
        this.watermarkStyle = builder.watermarkStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDigitalHumanProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioId
     */
    public String getAudioId() {
        return this.audioId;
    }

    /**
     * @return audioUrl
     */
    public String getAudioUrl() {
        return this.audioUrl;
    }

    /**
     * @return backgroundId
     */
    public String getBackgroundId() {
        return this.backgroundId;
    }

    /**
     * @return backgroundUrl
     */
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return foregroundId
     */
    public String getForegroundId() {
        return this.foregroundId;
    }

    /**
     * @return foregroundUrl
     */
    public String getForegroundUrl() {
        return this.foregroundUrl;
    }

    /**
     * @return humanLayerStyle
     */
    public String getHumanLayerStyle() {
        return this.humanLayerStyle;
    }

    /**
     * @return intro
     */
    public String getIntro() {
        return this.intro;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return ttsVoiceId
     */
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    /**
     * @return watermarkImageUrl
     */
    public String getWatermarkImageUrl() {
        return this.watermarkImageUrl;
    }

    /**
     * @return watermarkStyle
     */
    public String getWatermarkStyle() {
        return this.watermarkStyle;
    }

    public static final class Builder extends Request.Builder<CreateDigitalHumanProjectRequest, Builder> {
        private String audioId; 
        private String audioUrl; 
        private String backgroundId; 
        private String backgroundUrl; 
        private String content; 
        private String foregroundId; 
        private String foregroundUrl; 
        private String humanLayerStyle; 
        private String intro; 
        private String jwtToken; 
        private String mode; 
        private String modelId; 
        private String outputConfig; 
        private String title; 
        private String ttsVoiceId; 
        private String watermarkImageUrl; 
        private String watermarkStyle; 

        private Builder() {
            super();
        } 

        private Builder(CreateDigitalHumanProjectRequest request) {
            super(request);
            this.audioId = request.audioId;
            this.audioUrl = request.audioUrl;
            this.backgroundId = request.backgroundId;
            this.backgroundUrl = request.backgroundUrl;
            this.content = request.content;
            this.foregroundId = request.foregroundId;
            this.foregroundUrl = request.foregroundUrl;
            this.humanLayerStyle = request.humanLayerStyle;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.mode = request.mode;
            this.modelId = request.modelId;
            this.outputConfig = request.outputConfig;
            this.title = request.title;
            this.ttsVoiceId = request.ttsVoiceId;
            this.watermarkImageUrl = request.watermarkImageUrl;
            this.watermarkStyle = request.watermarkStyle;
        } 

        /**
         * AudioId.
         */
        public Builder audioId(String audioId) {
            this.putBodyParameter("AudioId", audioId);
            this.audioId = audioId;
            return this;
        }

        /**
         * AudioUrl.
         */
        public Builder audioUrl(String audioUrl) {
            this.putBodyParameter("AudioUrl", audioUrl);
            this.audioUrl = audioUrl;
            return this;
        }

        /**
         * BackgroundId.
         */
        public Builder backgroundId(String backgroundId) {
            this.putBodyParameter("BackgroundId", backgroundId);
            this.backgroundId = backgroundId;
            return this;
        }

        /**
         * BackgroundUrl.
         */
        public Builder backgroundUrl(String backgroundUrl) {
            this.putBodyParameter("BackgroundUrl", backgroundUrl);
            this.backgroundUrl = backgroundUrl;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ForegroundId.
         */
        public Builder foregroundId(String foregroundId) {
            this.putBodyParameter("ForegroundId", foregroundId);
            this.foregroundId = foregroundId;
            return this;
        }

        /**
         * ForegroundUrl.
         */
        public Builder foregroundUrl(String foregroundUrl) {
            this.putBodyParameter("ForegroundUrl", foregroundUrl);
            this.foregroundUrl = foregroundUrl;
            return this;
        }

        /**
         * HumanLayerStyle.
         */
        public Builder humanLayerStyle(String humanLayerStyle) {
            this.putBodyParameter("HumanLayerStyle", humanLayerStyle);
            this.humanLayerStyle = humanLayerStyle;
            return this;
        }

        /**
         * Intro.
         */
        public Builder intro(String intro) {
            this.putBodyParameter("Intro", intro);
            this.intro = intro;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * OutputConfig.
         */
        public Builder outputConfig(String outputConfig) {
            this.putBodyParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * TtsVoiceId.
         */
        public Builder ttsVoiceId(String ttsVoiceId) {
            this.putBodyParameter("TtsVoiceId", ttsVoiceId);
            this.ttsVoiceId = ttsVoiceId;
            return this;
        }

        /**
         * WatermarkImageUrl.
         */
        public Builder watermarkImageUrl(String watermarkImageUrl) {
            this.putBodyParameter("WatermarkImageUrl", watermarkImageUrl);
            this.watermarkImageUrl = watermarkImageUrl;
            return this;
        }

        /**
         * WatermarkStyle.
         */
        public Builder watermarkStyle(String watermarkStyle) {
            this.putBodyParameter("WatermarkStyle", watermarkStyle);
            this.watermarkStyle = watermarkStyle;
            return this;
        }

        @Override
        public CreateDigitalHumanProjectRequest build() {
            return new CreateDigitalHumanProjectRequest(this);
        } 

    } 

}
