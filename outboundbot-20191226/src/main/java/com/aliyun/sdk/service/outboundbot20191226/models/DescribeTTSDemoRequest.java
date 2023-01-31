// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTTSDemoRequest} extends {@link RequestModel}
 *
 * <p>DescribeTTSDemoRequest</p>
 */
public class DescribeTTSDemoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PitchRate")
    private Integer pitchRate;

    @Query
    @NameInMap("ScriptId")
    private String scriptId;

    @Query
    @NameInMap("SpeechRate")
    @Validation(required = true, maximum = 500)
    private Integer speechRate;

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
    @Validation(required = true, maximum = 100)
    private Integer volume;

    private DescribeTTSDemoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pitchRate = builder.pitchRate;
        this.scriptId = builder.scriptId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
        private Integer pitchRate; 
        private String scriptId; 
        private Integer speechRate; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTTSDemoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pitchRate = request.pitchRate;
            this.scriptId = request.scriptId;
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
         * SpeechRate.
         */
        public Builder speechRate(Integer speechRate) {
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
