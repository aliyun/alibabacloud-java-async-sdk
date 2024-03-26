// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLivePortraitProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateLivePortraitProjectRequest</p>
 */
public class CreateLivePortraitProjectRequest extends Request {
    @Body
    @NameInMap("AudioId")
    private String audioId;

    @Body
    @NameInMap("AudioUrl")
    private String audioUrl;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("CustomParams")
    private String customParams;

    @Body
    @NameInMap("ImageId")
    private String imageId;

    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("LightModel")
    @Deprecated
    private Boolean lightModel;

    @Body
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

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

    private CreateLivePortraitProjectRequest(Builder builder) {
        super(builder);
        this.audioId = builder.audioId;
        this.audioUrl = builder.audioUrl;
        this.content = builder.content;
        this.customParams = builder.customParams;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.lightModel = builder.lightModel;
        this.mode = builder.mode;
        this.outputConfig = builder.outputConfig;
        this.title = builder.title;
        this.ttsVoiceId = builder.ttsVoiceId;
        this.watermarkImageUrl = builder.watermarkImageUrl;
        this.watermarkStyle = builder.watermarkStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivePortraitProjectRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return customParams
     */
    public String getCustomParams() {
        return this.customParams;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
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
     * @return lightModel
     */
    public Boolean getLightModel() {
        return this.lightModel;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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

    public static final class Builder extends Request.Builder<CreateLivePortraitProjectRequest, Builder> {
        private String audioId; 
        private String audioUrl; 
        private String content; 
        private String customParams; 
        private String imageId; 
        private String imageUrl; 
        private String intro; 
        private String jwtToken; 
        private Boolean lightModel; 
        private String mode; 
        private String outputConfig; 
        private String title; 
        private String ttsVoiceId; 
        private String watermarkImageUrl; 
        private String watermarkStyle; 

        private Builder() {
            super();
        } 

        private Builder(CreateLivePortraitProjectRequest request) {
            super(request);
            this.audioId = request.audioId;
            this.audioUrl = request.audioUrl;
            this.content = request.content;
            this.customParams = request.customParams;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.lightModel = request.lightModel;
            this.mode = request.mode;
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
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * CustomParams.
         */
        public Builder customParams(String customParams) {
            this.putBodyParameter("CustomParams", customParams);
            this.customParams = customParams;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
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
         * LightModel.
         */
        public Builder lightModel(Boolean lightModel) {
            this.putBodyParameter("LightModel", lightModel);
            this.lightModel = lightModel;
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
        public CreateLivePortraitProjectRequest build() {
            return new CreateLivePortraitProjectRequest(this);
        } 

    } 

}
