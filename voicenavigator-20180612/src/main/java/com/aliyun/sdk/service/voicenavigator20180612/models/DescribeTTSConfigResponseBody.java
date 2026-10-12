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
 * {@link DescribeTTSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTTSConfigResponseBody</p>
 */
public class DescribeTTSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliCustomizedVoice")
    private String aliCustomizedVoice;

    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("BackgroundMusicName")
    private String backgroundMusicName;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineXunfei")
    private String engineXunfei;

    @com.aliyun.core.annotation.NameInMap("ExtParams")
    private String extParams;

    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    @com.aliyun.core.annotation.NameInMap("PitchRate")
    private Integer pitchRate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    private Integer speechRate;

    @com.aliyun.core.annotation.NameInMap("TtsOverrides")
    private String ttsOverrides;

    @com.aliyun.core.annotation.NameInMap("TtsOverridesUuid")
    private String ttsOverridesUuid;

    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    @com.aliyun.core.annotation.NameInMap("Volume")
    private Integer volume;

    private DescribeTTSConfigResponseBody(Builder builder) {
        this.aliCustomizedVoice = builder.aliCustomizedVoice;
        this.appKey = builder.appKey;
        this.backgroundMusicName = builder.backgroundMusicName;
        this.engine = builder.engine;
        this.engineXunfei = builder.engineXunfei;
        this.extParams = builder.extParams;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.requestId = builder.requestId;
        this.speechRate = builder.speechRate;
        this.ttsOverrides = builder.ttsOverrides;
        this.ttsOverridesUuid = builder.ttsOverridesUuid;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSConfigResponseBody create() {
        return builder().build();
    }

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
     * @return backgroundMusicName
     */
    public String getBackgroundMusicName() {
        return this.backgroundMusicName;
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
     * @return ttsOverrides
     */
    public String getTtsOverrides() {
        return this.ttsOverrides;
    }

    /**
     * @return ttsOverridesUuid
     */
    public String getTtsOverridesUuid() {
        return this.ttsOverridesUuid;
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
        private String aliCustomizedVoice; 
        private String appKey; 
        private String backgroundMusicName; 
        private String engine; 
        private String engineXunfei; 
        private String extParams; 
        private String nlsServiceType; 
        private Integer pitchRate; 
        private String requestId; 
        private Integer speechRate; 
        private String ttsOverrides; 
        private String ttsOverridesUuid; 
        private String voice; 
        private Integer volume; 

        private Builder() {
        } 

        private Builder(DescribeTTSConfigResponseBody model) {
            this.aliCustomizedVoice = model.aliCustomizedVoice;
            this.appKey = model.appKey;
            this.backgroundMusicName = model.backgroundMusicName;
            this.engine = model.engine;
            this.engineXunfei = model.engineXunfei;
            this.extParams = model.extParams;
            this.nlsServiceType = model.nlsServiceType;
            this.pitchRate = model.pitchRate;
            this.requestId = model.requestId;
            this.speechRate = model.speechRate;
            this.ttsOverrides = model.ttsOverrides;
            this.ttsOverridesUuid = model.ttsOverridesUuid;
            this.voice = model.voice;
            this.volume = model.volume;
        } 

        /**
         * <p>The personalized custom voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc458bba-5a25-4cbc-b5c2</p>
         */
        public Builder aliCustomizedVoice(String aliCustomizedVoice) {
            this.aliCustomizedVoice = aliCustomizedVoice;
            return this;
        }

        /**
         * <p>The AppKey of the third-party voice configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5b358afc</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * BackgroundMusicName.
         */
        public Builder backgroundMusicName(String backgroundMusicName) {
            this.backgroundMusicName = backgroundMusicName;
            return this;
        }

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The iFLYTEK engine parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Voice\&quot;:\&quot;aisjinger\&quot;}</p>
         */
        public Builder engineXunfei(String engineXunfei) {
            this.engineXunfei = engineXunfei;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.extParams = extParams;
            return this;
        }

        /**
         * <p>The TTS service invoke type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.nlsServiceType = nlsServiceType;
            return this;
        }

        /**
         * <p>The pitch rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F132DDBA-66C4-5BD3-BF7E-9642FE877158</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The speech rate.</p>
         * 
         * <strong>example:</strong>
         * <p>-150</p>
         */
        public Builder speechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }

        /**
         * <p>The TTS correction dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;pronunciation\&quot;:\&quot;huanqian\&quot;,\&quot;word\&quot;:\&quot;huaiqian\&quot;}]</p>
         */
        public Builder ttsOverrides(String ttsOverrides) {
            this.ttsOverrides = ttsOverrides;
            return this;
        }

        /**
         * <p>The TTS correction dictionary ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94001ae8-72fd-4f93-84dc-e58e2b20363b</p>
         */
        public Builder ttsOverridesUuid(String ttsOverridesUuid) {
            this.ttsOverridesUuid = ttsOverridesUuid;
            return this;
        }

        /**
         * <p>The voice.</p>
         * 
         * <strong>example:</strong>
         * <p>aixia</p>
         */
        public Builder voice(String voice) {
            this.voice = voice;
            return this;
        }

        /**
         * <p>The volume.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
