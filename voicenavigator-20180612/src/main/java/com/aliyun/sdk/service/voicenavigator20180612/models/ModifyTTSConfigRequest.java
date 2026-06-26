// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ModifyTTSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyTTSConfigRequest</p>
 */
public class ModifyTTSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliCustomizedVoice")
    private String aliCustomizedVoice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineXunfei")
    private String engineXunfei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtParams")
    private String extParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PitchRate")
    private String pitchRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    private String speechRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsOverrides")
    private String ttsOverrides;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private String volume;

    private ModifyTTSConfigRequest(Builder builder) {
        super(builder);
        this.aliCustomizedVoice = builder.aliCustomizedVoice;
        this.appKey = builder.appKey;
        this.engine = builder.engine;
        this.engineXunfei = builder.engineXunfei;
        this.extParams = builder.extParams;
        this.instanceId = builder.instanceId;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.speechRate = builder.speechRate;
        this.ttsOverrides = builder.ttsOverrides;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTTSConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliCustomizedVoice
     */
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
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
     * @return engineXunfei
     */
    public String getEngineXunfei() {
        return this.engineXunfei;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nlsServiceType
     */
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    /**
     * @return pitchRate
     */
    public String getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return speechRate
     */
    public String getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return ttsOverrides
     */
    public String getTtsOverrides() {
        return this.ttsOverrides;
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

    public static final class Builder extends Request.Builder<ModifyTTSConfigRequest, Builder> {
        private String aliCustomizedVoice; 
        private String appKey; 
        private String engine; 
        private String engineXunfei; 
        private String extParams; 
        private String instanceId; 
        private String nlsServiceType; 
        private String pitchRate; 
        private String speechRate; 
        private String ttsOverrides; 
        private String voice; 
        private String volume; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTTSConfigRequest request) {
            super(request);
            this.aliCustomizedVoice = request.aliCustomizedVoice;
            this.appKey = request.appKey;
            this.engine = request.engine;
            this.engineXunfei = request.engineXunfei;
            this.extParams = request.extParams;
            this.instanceId = request.instanceId;
            this.nlsServiceType = request.nlsServiceType;
            this.pitchRate = request.pitchRate;
            this.speechRate = request.speechRate;
            this.ttsOverrides = request.ttsOverrides;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * AliCustomizedVoice.
         */
        public Builder aliCustomizedVoice(String aliCustomizedVoice) {
            this.putQueryParameter("AliCustomizedVoice", aliCustomizedVoice);
            this.aliCustomizedVoice = aliCustomizedVoice;
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
         * EngineXunfei.
         */
        public Builder engineXunfei(String engineXunfei) {
            this.putQueryParameter("EngineXunfei", engineXunfei);
            this.engineXunfei = engineXunfei;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f407b22cbe4890ac595f09985848d5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NlsServiceType.
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.putQueryParameter("NlsServiceType", nlsServiceType);
            this.nlsServiceType = nlsServiceType;
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
         * SpeechRate.
         */
        public Builder speechRate(String speechRate) {
            this.putQueryParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * TtsOverrides.
         */
        public Builder ttsOverrides(String ttsOverrides) {
            this.putQueryParameter("TtsOverrides", ttsOverrides);
            this.ttsOverrides = ttsOverrides;
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
        public ModifyTTSConfigRequest build() {
            return new ModifyTTSConfigRequest(this);
        } 

    } 

}
