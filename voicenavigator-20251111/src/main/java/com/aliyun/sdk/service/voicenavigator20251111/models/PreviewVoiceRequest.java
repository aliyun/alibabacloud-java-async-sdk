// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link PreviewVoiceRequest} extends {@link RequestModel}
 *
 * <p>PreviewVoiceRequest</p>
 */
public class PreviewVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsAccessType")
    private String nlsAccessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsEngine")
    private String nlsEngine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    private PreviewVoiceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.nlsAccessType = builder.nlsAccessType;
        this.nlsEngine = builder.nlsEngine;
        this.params = builder.params;
        this.text = builder.text;
        this.voice = builder.voice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nlsAccessType
     */
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    /**
     * @return nlsEngine
     */
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
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

    public static final class Builder extends Request.Builder<PreviewVoiceRequest, Builder> {
        private String instanceId; 
        private String model; 
        private String nlsAccessType; 
        private String nlsEngine; 
        private Params params; 
        private String text; 
        private String voice; 

        private Builder() {
            super();
        } 

        private Builder(PreviewVoiceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.nlsAccessType = request.nlsAccessType;
            this.nlsEngine = request.nlsEngine;
            this.params = request.params;
            this.text = request.text;
            this.voice = request.voice;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NlsAccessType.
         */
        public Builder nlsAccessType(String nlsAccessType) {
            this.putBodyParameter("NlsAccessType", nlsAccessType);
            this.nlsAccessType = nlsAccessType;
            return this;
        }

        /**
         * NlsEngine.
         */
        public Builder nlsEngine(String nlsEngine) {
            this.putBodyParameter("NlsEngine", nlsEngine);
            this.nlsEngine = nlsEngine;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
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

        @Override
        public PreviewVoiceRequest build() {
            return new PreviewVoiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link PreviewVoiceRequest} extends {@link TeaModel}
     *
     * <p>PreviewVoiceRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PitchRate")
        private Float pitchRate;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Float speechRate;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private Params(Builder builder) {
            this.pitchRate = builder.pitchRate;
            this.speechRate = builder.speechRate;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return pitchRate
         */
        public Float getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return speechRate
         */
        public Float getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Float pitchRate; 
            private Float speechRate; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.pitchRate = model.pitchRate;
                this.speechRate = model.speechRate;
                this.volume = model.volume;
            } 

            /**
             * PitchRate.
             */
            public Builder pitchRate(Float pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Float speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
