// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCardSmsRequest} extends {@link RequestModel}
 *
 * <p>SendCardSmsRequest</p>
 */
public class SendCardSmsRequest extends Request {
    @Query
    @NameInMap("CardObjects")
    @Validation(required = true)
    private java.util.List < CardObjects> cardObjects;

    @Query
    @NameInMap("CardTemplateCode")
    @Validation(required = true)
    private String cardTemplateCode;

    @Query
    @NameInMap("DigitalTemplateCode")
    private String digitalTemplateCode;

    @Query
    @NameInMap("DigitalTemplateParam")
    private String digitalTemplateParam;

    @Query
    @NameInMap("FallbackType")
    @Validation(required = true)
    private String fallbackType;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Query
    @NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @Query
    @NameInMap("SmsTemplateParam")
    private String smsTemplateParam;

    @Query
    @NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @Query
    @NameInMap("TemplateCode")
    private String templateCode;

    @Query
    @NameInMap("TemplateParam")
    private String templateParam;

    private SendCardSmsRequest(Builder builder) {
        super(builder);
        this.cardObjects = builder.cardObjects;
        this.cardTemplateCode = builder.cardTemplateCode;
        this.digitalTemplateCode = builder.digitalTemplateCode;
        this.digitalTemplateParam = builder.digitalTemplateParam;
        this.fallbackType = builder.fallbackType;
        this.outId = builder.outId;
        this.signName = builder.signName;
        this.smsTemplateCode = builder.smsTemplateCode;
        this.smsTemplateParam = builder.smsTemplateParam;
        this.smsUpExtendCode = builder.smsUpExtendCode;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCardSmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardObjects
     */
    public java.util.List < CardObjects> getCardObjects() {
        return this.cardObjects;
    }

    /**
     * @return cardTemplateCode
     */
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    /**
     * @return digitalTemplateCode
     */
    public String getDigitalTemplateCode() {
        return this.digitalTemplateCode;
    }

    /**
     * @return digitalTemplateParam
     */
    public String getDigitalTemplateParam() {
        return this.digitalTemplateParam;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return smsTemplateCode
     */
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    /**
     * @return smsTemplateParam
     */
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
    }

    /**
     * @return smsUpExtendCode
     */
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    public static final class Builder extends Request.Builder<SendCardSmsRequest, Builder> {
        private java.util.List < CardObjects> cardObjects; 
        private String cardTemplateCode; 
        private String digitalTemplateCode; 
        private String digitalTemplateParam; 
        private String fallbackType; 
        private String outId; 
        private String signName; 
        private String smsTemplateCode; 
        private String smsTemplateParam; 
        private String smsUpExtendCode; 
        private String templateCode; 
        private String templateParam; 

        private Builder() {
            super();
        } 

        private Builder(SendCardSmsRequest request) {
            super(request);
            this.cardObjects = request.cardObjects;
            this.cardTemplateCode = request.cardTemplateCode;
            this.digitalTemplateCode = request.digitalTemplateCode;
            this.digitalTemplateParam = request.digitalTemplateParam;
            this.fallbackType = request.fallbackType;
            this.outId = request.outId;
            this.signName = request.signName;
            this.smsTemplateCode = request.smsTemplateCode;
            this.smsTemplateParam = request.smsTemplateParam;
            this.smsUpExtendCode = request.smsUpExtendCode;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
        } 

        /**
         * CardObjects.
         */
        public Builder cardObjects(java.util.List < CardObjects> cardObjects) {
            this.putQueryParameter("CardObjects", cardObjects);
            this.cardObjects = cardObjects;
            return this;
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
         * DigitalTemplateCode.
         */
        public Builder digitalTemplateCode(String digitalTemplateCode) {
            this.putQueryParameter("DigitalTemplateCode", digitalTemplateCode);
            this.digitalTemplateCode = digitalTemplateCode;
            return this;
        }

        /**
         * DigitalTemplateParam.
         */
        public Builder digitalTemplateParam(String digitalTemplateParam) {
            this.putQueryParameter("DigitalTemplateParam", digitalTemplateParam);
            this.digitalTemplateParam = digitalTemplateParam;
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
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
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
         * SmsTemplateParam.
         */
        public Builder smsTemplateParam(String smsTemplateParam) {
            this.putQueryParameter("SmsTemplateParam", smsTemplateParam);
            this.smsTemplateParam = smsTemplateParam;
            return this;
        }

        /**
         * SmsUpExtendCode.
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
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
         * TemplateParam.
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        @Override
        public SendCardSmsRequest build() {
            return new SendCardSmsRequest(this);
        } 

    } 

    public static class CardObjects extends TeaModel {
        @NameInMap("customUrl")
        private String customUrl;

        @NameInMap("dyncParams")
        private String dyncParams;

        @NameInMap("mobile")
        private String mobile;

        private CardObjects(Builder builder) {
            this.customUrl = builder.customUrl;
            this.dyncParams = builder.dyncParams;
            this.mobile = builder.mobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardObjects create() {
            return builder().build();
        }

        /**
         * @return customUrl
         */
        public String getCustomUrl() {
            return this.customUrl;
        }

        /**
         * @return dyncParams
         */
        public String getDyncParams() {
            return this.dyncParams;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        public static final class Builder {
            private String customUrl; 
            private String dyncParams; 
            private String mobile; 

            /**
             * customUrl.
             */
            public Builder customUrl(String customUrl) {
                this.customUrl = customUrl;
                return this;
            }

            /**
             * dyncParams.
             */
            public Builder dyncParams(String dyncParams) {
                this.dyncParams = dyncParams;
                return this;
            }

            /**
             * mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public CardObjects build() {
                return new CardObjects(this);
            } 

        } 

    }
}
