// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCardSmsRequest} extends {@link RequestModel}
 *
 * <p>SendCardSmsRequest</p>
 */
public class SendCardSmsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardObjects")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < CardObjects> cardObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigitalTemplateCode")
    private String digitalTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigitalTemplateParam")
    private String digitalTemplateParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fallbackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateParam")
    private String smsTemplateParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
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
         * The objects of the message template.
         */
        public Builder cardObjects(java.util.List < CardObjects> cardObjects) {
            this.putQueryParameter("CardObjects", cardObjects);
            this.cardObjects = cardObjects;
            return this;
        }

        /**
         * The code of the message template. You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > Make sure that the message template has been approved.
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * The code of the digital message template that applies when the card message is rolled back. You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > Make sure that the message template has been approved.
         */
        public Builder digitalTemplateCode(String digitalTemplateCode) {
            this.putQueryParameter("DigitalTemplateCode", digitalTemplateCode);
            this.digitalTemplateCode = digitalTemplateCode;
            return this;
        }

        /**
         * The variables of the digital message template.
         * <p>
         * 
         * > If you need to add line breaks to the JSON template, make sure that the format is valid.
         */
        public Builder digitalTemplateParam(String digitalTemplateParam) {
            this.putQueryParameter("DigitalTemplateParam", digitalTemplateParam);
            this.digitalTemplateParam = digitalTemplateParam;
            return this;
        }

        /**
         * The rollback type. Valid values:
         * <p>
         * 
         * *   **SMS**: text message
         * *   **DIGITALSMS**: digital message
         * *   **NONE**: none
         */
        public Builder fallbackType(String fallbackType) {
            this.putQueryParameter("FallbackType", fallbackType);
            this.fallbackType = fallbackType;
            return this;
        }

        /**
         * The ID that is reserved for the caller of the operation.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * The signature. You can view the template code in the **Signature** column on the **Signaturess** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > The signature must be approved.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * The code of the text message template that applies when the card message is rolled back. You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > Make sure that the message template has been approved. If you set the **FallbackType** parameter to **SMS**, this parameter is required.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * The variables of the text message template.
         * <p>
         * 
         * > If you need to add line breaks to the JSON template, make sure that the format is valid.
         */
        public Builder smsTemplateParam(String smsTemplateParam) {
            this.putQueryParameter("SmsTemplateParam", smsTemplateParam);
            this.smsTemplateParam = smsTemplateParam;
            return this;
        }

        /**
         * The extension code of the upstream message. Upstream messages are messages sent to the communication service provider. Upstream messages are used to customize a service, complete an inquiry, or send a request. You are charged for sending upstream messages based on the billing standards of the service provider.
         * <p>
         * 
         * > If you do not need upstream messages, ignore this parameter.
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
            return this;
        }

        /**
         * The code of the text message template.
         * <p>
         * 
         * Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click **Go Globe** or **Go China**. You can view the message template in the **Template Code** column on the **Message Templates** tab.
         * 
         * > The message templates must be created on the Go Globe page and approved.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The variables of the message template. Format: JSON.
         * <p>
         * 
         * > If you need to add line breaks to the JSON template, make sure that the format is valid.
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
        @com.aliyun.core.annotation.NameInMap("customUrl")
        private String customUrl;

        @com.aliyun.core.annotation.NameInMap("dyncParams")
        private String dyncParams;

        @com.aliyun.core.annotation.NameInMap("mobile")
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
             * The URL to which the message is redirected if the message fails to be rendered.
             */
            public Builder customUrl(String customUrl) {
                this.customUrl = customUrl;
                return this;
            }

            /**
             * The variables. Special characters, such as $ and {}, do not need to be entered.
             */
            public Builder dyncParams(String dyncParams) {
                this.dyncParams = dyncParams;
                return this;
            }

            /**
             * The mobile phone number.
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
