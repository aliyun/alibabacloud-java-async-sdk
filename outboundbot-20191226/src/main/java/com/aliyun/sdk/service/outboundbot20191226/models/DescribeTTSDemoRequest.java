// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeTTSDemoRequest} extends {@link RequestModel}
 *
 * <p>DescribeTTSDemoRequest</p>
 */
public class DescribeTTSDemoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private String accessKey;

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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PitchRate")
    private Integer pitchRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer speechRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer volume;

    private DescribeTTSDemoRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.aliCustomizedVoice = builder.aliCustomizedVoice;
        this.appKey = builder.appKey;
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.scriptId = builder.scriptId;
        this.secretKey = builder.secretKey;
        this.speechRate = builder.speechRate;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSDemoRequest create() {
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
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
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
    public Integer getSpeechRate() {
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
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<DescribeTTSDemoRequest, Builder> {
        private String accessKey; 
        private String aliCustomizedVoice; 
        private String appKey; 
        private String engine; 
        private String instanceId; 
        private String nlsServiceType; 
        private Integer pitchRate; 
        private String scriptId; 
        private String secretKey; 
        private Integer speechRate; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTTSDemoRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.aliCustomizedVoice = request.aliCustomizedVoice;
            this.appKey = request.appKey;
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.nlsServiceType = request.nlsServiceType;
            this.pitchRate = request.pitchRate;
            this.scriptId = request.scriptId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
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
        public Builder pitchRate(Integer pitchRate) {
            this.putQueryParameter("PitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
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
        public Builder speechRate(Integer speechRate) {
            this.putQueryParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public Builder volume(Integer volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public DescribeTTSDemoRequest build() {
            return new DescribeTTSDemoRequest(this);
        } 

    } 

}
