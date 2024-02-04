// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTTSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTTSConfigResponseBody</p>
 */
public class DescribeTTSConfigResponseBody extends TeaModel {
    @NameInMap("AppKey")
    private String appKey;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("EngineXunfei")
    private String engineXunfei;

    @NameInMap("NlsServiceType")
    private String nlsServiceType;

    @NameInMap("PitchRate")
    private Integer pitchRate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpeechRate")
    private Integer speechRate;

    @NameInMap("Voice")
    private String voice;

    @NameInMap("Volume")
    private Integer volume;

    private DescribeTTSConfigResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.engine = builder.engine;
        this.engineXunfei = builder.engineXunfei;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.requestId = builder.requestId;
        this.speechRate = builder.speechRate;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSConfigResponseBody create() {
        return builder().build();
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
     * @return nlsServiceType
     */
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    /**
     * @return pitchRate
     */
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String appKey; 
        private String engine; 
        private String engineXunfei; 
        private String nlsServiceType; 
        private Integer pitchRate; 
        private String requestId; 
        private Integer speechRate; 
        private String voice; 
        private Integer volume; 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * EngineXunfei.
         */
        public Builder engineXunfei(String engineXunfei) {
            this.engineXunfei = engineXunfei;
            return this;
        }

        /**
         * NlsServiceType.
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.nlsServiceType = nlsServiceType;
            return this;
        }

        /**
         * PitchRate.
         */
        public Builder pitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpeechRate.
         */
        public Builder speechRate(Integer speechRate) {
            this.speechRate = speechRate;
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
        public Builder volume(Integer volume) {
            this.volume = volume;
            return this;
        }

        public DescribeTTSConfigResponseBody build() {
            return new DescribeTTSConfigResponseBody(this);
        } 

    } 

}
