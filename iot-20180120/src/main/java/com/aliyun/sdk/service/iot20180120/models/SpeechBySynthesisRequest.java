// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpeechBySynthesisRequest} extends {@link RequestModel}
 *
 * <p>SpeechBySynthesisRequest</p>
 */
public class SpeechBySynthesisRequest extends Request {
    @Body
    @NameInMap("AudioFormat")
    @Validation(required = true)
    private String audioFormat;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("IotId")
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    @Body
    @NameInMap("SpeechId")
    private String speechId;

    @Body
    @NameInMap("SpeechRate")
    @Validation(maximum = 500)
    private Integer speechRate;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    @Body
    @NameInMap("Voice")
    @Validation(required = true)
    private String voice;

    @Body
    @NameInMap("Volume")
    @Validation(maximum = 100)
    private Integer volume;

    private SpeechBySynthesisRequest(Builder builder) {
        super(builder);
        this.audioFormat = builder.audioFormat;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.speechId = builder.speechId;
        this.speechRate = builder.speechRate;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpeechBySynthesisRequest create() {
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
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return speechId
     */
    public String getSpeechId() {
        return this.speechId;
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

    public static final class Builder extends Request.Builder<SpeechBySynthesisRequest, Builder> {
        private String audioFormat; 
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String speechId; 
        private Integer speechRate; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(SpeechBySynthesisRequest request) {
            super(request);
            this.audioFormat = request.audioFormat;
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.speechId = request.speechId;
            this.speechRate = request.speechRate;
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
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SpeechId.
         */
        public Builder speechId(String speechId) {
            this.putBodyParameter("SpeechId", speechId);
            this.speechId = speechId;
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
        public SpeechBySynthesisRequest build() {
            return new SpeechBySynthesisRequest(this);
        } 

    } 

}
