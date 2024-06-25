// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchCardSmsRequest} extends {@link RequestModel}
 *
 * <p>SendBatchCardSmsRequest</p>
 */
public class SendBatchCardSmsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cardTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CardTemplateParamJson")
    private String cardTemplateParamJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigitalTemplateCode")
    private String digitalTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigitalTemplateParamJson")
    private String digitalTemplateParamJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fallbackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumberJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumberJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignNameJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signNameJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateParamJson")
    private String smsTemplateParamJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsUpExtendCodeJson")
    private String smsUpExtendCodeJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParamJson")
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
         * The variables of the card message template.
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
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
         */
        public Builder digitalTemplateParamJson(String digitalTemplateParamJson) {
            this.putQueryParameter("DigitalTemplateParamJson", digitalTemplateParamJson);
            this.digitalTemplateParamJson = digitalTemplateParamJson;
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
         * The mobile numbers of the recipients.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * The signature. You can view the template code in the **Signature** column on the **Signaturess** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > The signatures must be approved and correspond to the mobile numbers in sequence.
         */
        public Builder signNameJson(String signNameJson) {
            this.putQueryParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * The code of the text message template that applies when the card message is rolled back. You can view the template code in the **Template Code** column on the **Templates** tab of the **Go China** page in the Alibaba Cloud SMS console.
         * <p>
         * 
         * > Make sure that the message template has been approved.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * The variables of the text message template.
         */
        public Builder smsTemplateParamJson(String smsTemplateParamJson) {
            this.putQueryParameter("SmsTemplateParamJson", smsTemplateParamJson);
            this.smsTemplateParamJson = smsTemplateParamJson;
            return this;
        }

        /**
         * The extension code of the upstream message.
         */
        public Builder smsUpExtendCodeJson(String smsUpExtendCodeJson) {
            this.putQueryParameter("SmsUpExtendCodeJson", smsUpExtendCodeJson);
            this.smsUpExtendCodeJson = smsUpExtendCodeJson;
            return this;
        }

        /**
         * The code of the message template.
         * <p>
         * 
         * You can log on to the [Alibaba Cloud console](https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview), click **Go China** or **Go Globe** in the left-side navigation pane, and then view the **template code** on the **Templates** tab.
         * 
         * > You must specify a message template that is created in the SMS console and approved by Alibaba Cloud. If you send messages to countries or regions outside the Chinese mainland, use the corresponding message templates.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The value of the variable in the message template.
         * <p>
         * 
         * > If you need to add line breaks to the JSON template, make sure that the format is valid. In addition, the sequence of variable values must be the same as that of the mobile numbers and signatures.
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
