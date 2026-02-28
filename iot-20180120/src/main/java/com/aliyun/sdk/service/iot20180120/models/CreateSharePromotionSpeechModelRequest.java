// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateSharePromotionSpeechModelRequest} extends {@link RequestModel}
 *
 * <p>CreateSharePromotionSpeechModelRequest</p>
 */
public class CreateSharePromotionSpeechModelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharePromotionActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sharePromotionActivityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechModelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String speechModelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer speechRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Voice")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Volume")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer volume;

    private CreateSharePromotionSpeechModelRequest(Builder builder) {
        super(builder);
        this.audioFormat = builder.audioFormat;
        this.bizCode = builder.bizCode;
        this.iotInstanceId = builder.iotInstanceId;
        this.sharePromotionActivityId = builder.sharePromotionActivityId;
        this.shareTaskCode = builder.shareTaskCode;
        this.speechModelType = builder.speechModelType;
        this.speechRate = builder.speechRate;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSharePromotionSpeechModelRequest create() {
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
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sharePromotionActivityId
     */
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    /**
     * @return speechModelType
     */
    public String getSpeechModelType() {
        return this.speechModelType;
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

    public static final class Builder extends Request.Builder<CreateSharePromotionSpeechModelRequest, Builder> {
        private String audioFormat; 
        private String bizCode; 
        private String iotInstanceId; 
        private String sharePromotionActivityId; 
        private String shareTaskCode; 
        private String speechModelType; 
        private Integer speechRate; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(CreateSharePromotionSpeechModelRequest request) {
            super(request);
            this.audioFormat = request.audioFormat;
            this.bizCode = request.bizCode;
            this.iotInstanceId = request.iotInstanceId;
            this.sharePromotionActivityId = request.sharePromotionActivityId;
            this.shareTaskCode = request.shareTaskCode;
            this.speechModelType = request.speechModelType;
            this.speechRate = request.speechRate;
            this.text = request.text;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wav</p>
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZFDZ</p>
         */
        public Builder bizCode(String bizCode) {
            this.putBodyParameter("BizCode", bizCode);
            this.bizCode = bizCode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
         */
        public Builder sharePromotionActivityId(String sharePromotionActivityId) {
            this.putBodyParameter("SharePromotionActivityId", sharePromotionActivityId);
            this.sharePromotionActivityId = sharePromotionActivityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder speechModelType(String speechModelType) {
            this.putBodyParameter("SpeechModelType", speechModelType);
            this.speechModelType = speechModelType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiaoyun</p>
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
        public CreateSharePromotionSpeechModelRequest build() {
            return new CreateSharePromotionSpeechModelRequest(this);
        } 

    } 

}
