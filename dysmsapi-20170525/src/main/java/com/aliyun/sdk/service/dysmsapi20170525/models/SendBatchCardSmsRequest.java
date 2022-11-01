// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchCardSmsRequest} extends {@link RequestModel}
 *
 * <p>SendBatchCardSmsRequest</p>
 */
public class SendBatchCardSmsRequest extends Request {
    @Query
    @NameInMap("CardTemplateCode")
    @Validation(required = true)
    private String cardTemplateCode;

    @Query
    @NameInMap("CardTemplateParamJson")
    private String cardTemplateParamJson;

    @Query
    @NameInMap("DigitalTemplateCode")
    private String digitalTemplateCode;

    @Query
    @NameInMap("DigitalTemplateParamJson")
    private String digitalTemplateParamJson;

    @Query
    @NameInMap("FallbackType")
    @Validation(required = true)
    private String fallbackType;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("PhoneNumberJson")
    @Validation(required = true)
    private String phoneNumberJson;

    @Query
    @NameInMap("SignNameJson")
    @Validation(required = true)
    private String signNameJson;

    @Query
    @NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @Query
    @NameInMap("SmsTemplateParamJson")
    private String smsTemplateParamJson;

    @Query
    @NameInMap("SmsUpExtendCodeJson")
    private String smsUpExtendCodeJson;

    @Query
    @NameInMap("TemplateCode")
    private String templateCode;

    @Query
    @NameInMap("TemplateParamJson")
    private String templateParamJson;

    private SendBatchCardSmsRequest(Builder builder) {
        super(builder);
        this.cardTemplateCode = builder.cardTemplateCode;
        this.cardTemplateParamJson = builder.cardTemplateParamJson;
        this.digitalTemplateCode = builder.digitalTemplateCode;
        this.digitalTemplateParamJson = builder.digitalTemplateParamJson;
        this.fallbackType = builder.fallbackType;
        this.outId = builder.outId;
        this.phoneNumberJson = builder.phoneNumberJson;
        this.signNameJson = builder.signNameJson;
        this.smsTemplateCode = builder.smsTemplateCode;
        this.smsTemplateParamJson = builder.smsTemplateParamJson;
        this.smsUpExtendCodeJson = builder.smsUpExtendCodeJson;
        this.templateCode = builder.templateCode;
        this.templateParamJson = builder.templateParamJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBatchCardSmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardTemplateCode
     */
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    /**
     * @return cardTemplateParamJson
     */
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    /**
     * @return digitalTemplateCode
     */
    public String getDigitalTemplateCode() {
        return this.digitalTemplateCode;
    }

    /**
     * @return digitalTemplateParamJson
     */
    public String getDigitalTemplateParamJson() {
        return this.digitalTemplateParamJson;
    }

    /**
     * @return fallbackType
     */
    public String getFallbackType() {
        return this.fallbackType;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return phoneNumberJson
     */
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    /**
     * @return signNameJson
     */
    public String getSignNameJson() {
        return this.signNameJson;
    }

    /**
     * @return smsTemplateCode
     */
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    /**
     * @return smsTemplateParamJson
     */
    public String getSmsTemplateParamJson() {
        return this.smsTemplateParamJson;
    }

    /**
     * @return smsUpExtendCodeJson
     */
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParamJson
     */
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

    public static final class Builder extends Request.Builder<SendBatchCardSmsRequest, Builder> {
        private String cardTemplateCode; 
        private String cardTemplateParamJson; 
        private String digitalTemplateCode; 
        private String digitalTemplateParamJson; 
        private String fallbackType; 
        private String outId; 
        private String phoneNumberJson; 
        private String signNameJson; 
        private String smsTemplateCode; 
        private String smsTemplateParamJson; 
        private String smsUpExtendCodeJson; 
        private String templateCode; 
        private String templateParamJson; 

        private Builder() {
            super();
        } 

        private Builder(SendBatchCardSmsRequest request) {
            super(request);
            this.cardTemplateCode = request.cardTemplateCode;
            this.cardTemplateParamJson = request.cardTemplateParamJson;
            this.digitalTemplateCode = request.digitalTemplateCode;
            this.digitalTemplateParamJson = request.digitalTemplateParamJson;
            this.fallbackType = request.fallbackType;
            this.outId = request.outId;
            this.phoneNumberJson = request.phoneNumberJson;
            this.signNameJson = request.signNameJson;
            this.smsTemplateCode = request.smsTemplateCode;
            this.smsTemplateParamJson = request.smsTemplateParamJson;
            this.smsUpExtendCodeJson = request.smsUpExtendCodeJson;
            this.templateCode = request.templateCode;
            this.templateParamJson = request.templateParamJson;
        } 

        /**
         * CardTemplateCode.
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * CardTemplateParamJson.
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
            return this;
        }

        /**
         * DigitalTemplateCode.
         */
        public Builder digitalTemplateCode(String digitalTemplateCode) {
            this.putQueryParameter("DigitalTemplateCode", digitalTemplateCode);
            this.digitalTemplateCode = digitalTemplateCode;
            return this;
        }

        /**
         * DigitalTemplateParamJson.
         */
        public Builder digitalTemplateParamJson(String digitalTemplateParamJson) {
            this.putQueryParameter("DigitalTemplateParamJson", digitalTemplateParamJson);
            this.digitalTemplateParamJson = digitalTemplateParamJson;
            return this;
        }

        /**
         * FallbackType.
         */
        public Builder fallbackType(String fallbackType) {
            this.putQueryParameter("FallbackType", fallbackType);
            this.fallbackType = fallbackType;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * PhoneNumberJson.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * SignNameJson.
         */
        public Builder signNameJson(String signNameJson) {
            this.putQueryParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * SmsTemplateCode.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * SmsTemplateParamJson.
         */
        public Builder smsTemplateParamJson(String smsTemplateParamJson) {
            this.putQueryParameter("SmsTemplateParamJson", smsTemplateParamJson);
            this.smsTemplateParamJson = smsTemplateParamJson;
            return this;
        }

        /**
         * SmsUpExtendCodeJson.
         */
        public Builder smsUpExtendCodeJson(String smsUpExtendCodeJson) {
            this.putQueryParameter("SmsUpExtendCodeJson", smsUpExtendCodeJson);
            this.smsUpExtendCodeJson = smsUpExtendCodeJson;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParamJson.
         */
        public Builder templateParamJson(String templateParamJson) {
            this.putQueryParameter("TemplateParamJson", templateParamJson);
            this.templateParamJson = templateParamJson;
            return this;
        }

        @Override
        public SendBatchCardSmsRequest build() {
            return new SendBatchCardSmsRequest(this);
        } 

    } 

}
