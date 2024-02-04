// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuditTTSVoiceRequest} extends {@link RequestModel}
 *
 * <p>AuditTTSVoiceRequest</p>
 */
public class AuditTTSVoiceRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    private String accessKey;

    @Query
    @NameInMap("AppKey")
    private String appKey;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PitchRate")
    private String pitchRate;

    @Query
    @NameInMap("SecretKey")
    private String secretKey;

    @Query
    @NameInMap("SpeechRate")
    @Validation(required = true)
    private String speechRate;

    @Query
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    @Query
    @NameInMap("Voice")
    @Validation(required = true)
    private String voice;

    @Query
    @NameInMap("Volume")
    @Validation(required = true)
    private String volume;

    private AuditTTSVoiceRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.appKey = builder.appKey;
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.pitchRate = builder.pitchRate;
        this.secretKey = builder.secretKey;
        this.speechRate = builder.speechRate;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditTTSVoiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pitchRate
     */
    public String getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return speechRate
     */
    public String getSpeechRate() {
        return this.speechRate;
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
    public String getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<AuditTTSVoiceRequest, Builder> {
        private String accessKey; 
        private String appKey; 
        private String engine; 
        private String instanceId; 
        private String pitchRate; 
        private String secretKey; 
        private String speechRate; 
        private String text; 
        private String voice; 
        private String volume; 

        private Builder() {
            super();
        } 

        private Builder(AuditTTSVoiceRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.appKey = request.appKey;
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.pitchRate = request.pitchRate;
            this.secretKey = request.secretKey;
            this.speechRate = request.speechRate;
            this.text = request.text;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PitchRate.
         */
        public Builder pitchRate(String pitchRate) {
            this.putQueryParameter("PitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * SecretKey.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * SpeechRate.
         */
        public Builder speechRate(String speechRate) {
            this.putQueryParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * Voice.
         */
        public Builder voice(String voice) {
            this.putQueryParameter("Voice", voice);
            this.voice = voice;
            return this;
        }

        /**
         * Volume.
         */
        public Builder volume(String volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public AuditTTSVoiceRequest build() {
            return new AuditTTSVoiceRequest(this);
        } 

    } 

}
