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
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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
        this.instanceId = builder.instanceId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
        private String speechRate; 
        private String text; 
        private String voice; 
        private String volume; 

        private Builder() {
            super();
        } 

        private Builder(AuditTTSVoiceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.speechRate = request.speechRate;
            this.text = request.text;
            this.voice = request.voice;
            this.volume = request.volume;
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
