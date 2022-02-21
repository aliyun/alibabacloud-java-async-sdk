// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpeechRequest} extends {@link RequestModel}
 *
 * <p>CreateSpeechRequest</p>
 */
public class CreateSpeechRequest extends Request {
    @Body
    @NameInMap("BizCode")
    private String bizCode;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    @Body
    @NameInMap("SpeechRate")
    private Integer speechRate;

    @Body
    @NameInMap("SpeechType")
    private String speechType;

    @Body
    @NameInMap("Text")
    private String text;

    @Body
    @NameInMap("Voice")
    @Validation(required = true)
    private String voice;

    @Body
    @NameInMap("Volume")
    private Integer volume;

    private CreateSpeechRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectCode = builder.projectCode;
        this.speechRate = builder.speechRate;
        this.speechType = builder.speechType;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpeechRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return speechType
     */
    public String getSpeechType() {
        return this.speechType;
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

    public static final class Builder extends Request.Builder<CreateSpeechRequest, Builder> {
        private String bizCode; 
        private String iotInstanceId; 
        private String projectCode; 
        private Integer speechRate; 
        private String speechType; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpeechRequest response) {
            super(response);
            this.bizCode = response.bizCode;
            this.iotInstanceId = response.iotInstanceId;
            this.projectCode = response.projectCode;
            this.speechRate = response.speechRate;
            this.speechType = response.speechType;
            this.text = response.text;
            this.voice = response.voice;
            this.volume = response.volume;
        } 

        /**
         * BizCode.
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
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
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
         * SpeechType.
         */
        public Builder speechType(String speechType) {
            this.putBodyParameter("SpeechType", speechType);
            this.speechType = speechType;
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
        public CreateSpeechRequest build() {
            return new CreateSpeechRequest(this);
        } 

    } 

}
