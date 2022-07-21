// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpeechRequest} extends {@link RequestModel}
 *
 * <p>CreateSpeechRequest</p>
 */
public class CreateSpeechRequest extends Request {
    @Body
    @NameInMap("AudioFormat")
    private String audioFormat;

    @Body
    @NameInMap("BizCode")
    private String bizCode;

    @Body
    @NameInMap("EnableSoundCode")
    private Boolean enableSoundCode;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    @Body
    @NameInMap("SoundCodeConfig")
    private java.util.Map < String, ? > soundCodeConfig;

    @Body
    @NameInMap("SpeechRate")
    @Validation(maximum = 500)
    private Integer speechRate;

    @Body
    @NameInMap("SpeechType")
    private String speechType;

    @Body
    @NameInMap("Text")
    private String text;

    @Body
    @NameInMap("Voice")
    @Validation(required = true)
    private String voice;

    @Body
    @NameInMap("Volume")
    @Validation(maximum = 100)
    private Integer volume;

    private CreateSpeechRequest(Builder builder) {
        super(builder);
        this.audioFormat = builder.audioFormat;
        this.bizCode = builder.bizCode;
        this.enableSoundCode = builder.enableSoundCode;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectCode = builder.projectCode;
        this.soundCodeConfig = builder.soundCodeConfig;
        this.speechRate = builder.speechRate;
        this.speechType = builder.speechType;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpeechRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFormat
     */
    public String getAudioFormat() {
        return this.audioFormat;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return enableSoundCode
     */
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return soundCodeConfig
     */
    public java.util.Map < String, ? > getSoundCodeConfig() {
        return this.soundCodeConfig;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return speechType
     */
    public String getSpeechType() {
        return this.speechType;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
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
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<CreateSpeechRequest, Builder> {
        private String audioFormat; 
        private String bizCode; 
        private Boolean enableSoundCode; 
        private String iotInstanceId; 
        private String projectCode; 
        private java.util.Map < String, ? > soundCodeConfig; 
        private Integer speechRate; 
        private String speechType; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpeechRequest request) {
            super(request);
            this.audioFormat = request.audioFormat;
            this.bizCode = request.bizCode;
            this.enableSoundCode = request.enableSoundCode;
            this.iotInstanceId = request.iotInstanceId;
            this.projectCode = request.projectCode;
            this.soundCodeConfig = request.soundCodeConfig;
            this.speechRate = request.speechRate;
            this.speechType = request.speechType;
            this.text = request.text;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * AudioFormat.
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putBodyParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * EnableSoundCode.
         */
        public Builder enableSoundCode(Boolean enableSoundCode) {
            this.putBodyParameter("EnableSoundCode", enableSoundCode);
            this.enableSoundCode = enableSoundCode;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * SoundCodeConfig.
         */
        public Builder soundCodeConfig(java.util.Map < String, ? > soundCodeConfig) {
            String soundCodeConfigShrink = shrink(soundCodeConfig, "SoundCodeConfig", "json");
            this.putBodyParameter("SoundCodeConfig", soundCodeConfigShrink);
            this.soundCodeConfig = soundCodeConfig;
            return this;
        }

        /**
         * SpeechRate.
         */
        public Builder speechRate(Integer speechRate) {
            this.putBodyParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * SpeechType.
         */
        public Builder speechType(String speechType) {
            this.putBodyParameter("SpeechType", speechType);
            this.speechType = speechType;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * Voice.
         */
        public Builder voice(String voice) {
            this.putBodyParameter("Voice", voice);
            this.voice = voice;
            return this;
        }

        /**
         * Volume.
         */
        public Builder volume(Integer volume) {
            this.putBodyParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public CreateSpeechRequest build() {
            return new CreateSpeechRequest(this);
        } 

    } 

}
