// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpeechRequest} extends {@link RequestModel}
 *
 * <p>UpdateSpeechRequest</p>
 */
public class UpdateSpeechRequest extends Request {
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
    @NameInMap("SpeechCode")
    @Validation(required = true)
    private String speechCode;

    @Body
    @NameInMap("SpeechRate")
    @Validation(maximum = 500)
    private Integer speechRate;

    @Body
    @NameInMap("Voice")
    @Validation(required = true)
    private String voice;

    @Body
    @NameInMap("Volume")
    @Validation(maximum = 100)
    private Integer volume;

    private UpdateSpeechRequest(Builder builder) {
        super(builder);
        this.enableSoundCode = builder.enableSoundCode;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectCode = builder.projectCode;
        this.soundCodeConfig = builder.soundCodeConfig;
        this.speechCode = builder.speechCode;
        this.speechRate = builder.speechRate;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpeechRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return speechCode
     */
    public String getSpeechCode() {
        return this.speechCode;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
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

    public static final class Builder extends Request.Builder<UpdateSpeechRequest, Builder> {
        private Boolean enableSoundCode; 
        private String iotInstanceId; 
        private String projectCode; 
        private java.util.Map < String, ? > soundCodeConfig; 
        private String speechCode; 
        private Integer speechRate; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSpeechRequest request) {
            super(request);
            this.enableSoundCode = request.enableSoundCode;
            this.iotInstanceId = request.iotInstanceId;
            this.projectCode = request.projectCode;
            this.soundCodeConfig = request.soundCodeConfig;
            this.speechCode = request.speechCode;
            this.speechRate = request.speechRate;
            this.voice = request.voice;
            this.volume = request.volume;
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
         * SpeechCode.
         */
        public Builder speechCode(String speechCode) {
            this.putBodyParameter("SpeechCode", speechCode);
            this.speechCode = speechCode;
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
        public UpdateSpeechRequest build() {
            return new UpdateSpeechRequest(this);
        } 

    } 

}
