// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
         * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_3245</p>
         */
        public Builder cardTemplateCode(String cardTemplateCode) {
            this.putQueryParameter("CardTemplateCode", cardTemplateCode);
            this.cardTemplateCode = cardTemplateCode;
            return this;
        }

        /**
         * <p>The variables of the card message template.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;customurl&quot;:&quot;<a href="http://www.alibaba.com%5C%22,%5C%22dyncParams%5C%22:%5C%22%7B%5C%5C%5C%22a%5C%5C%5C%22:%5C%5C%5C%22hello%5C%5C%5C%22,%5C%5C%5C%22b%5C%5C%5C%22:%5C%5C%5C%22world%5C%5C%5C%22%7D%5C%22%7D%5D">http://www.alibaba.com\&quot;,\&quot;dyncParams\&quot;:\&quot;{\\\&quot;a\\\&quot;:\\\&quot;hello\\\&quot;,\\\&quot;b\\\&quot;:\\\&quot;world\\\&quot;}\&quot;}]</a></p>
         */
        public Builder cardTemplateParamJson(String cardTemplateParamJson) {
            this.putQueryParameter("CardTemplateParamJson", cardTemplateParamJson);
            this.cardTemplateParamJson = cardTemplateParamJson;
            return this;
        }

        /**
         * <p>The code of the digital message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DIGITAL_SMS_234080176</p>
         */
        public Builder digitalTemplateCode(String digitalTemplateCode) {
            this.putQueryParameter("DigitalTemplateCode", digitalTemplateCode);
            this.digitalTemplateCode = digitalTemplateCode;
            return this;
        }

        /**
         * <p>The variables of the digital message template.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
         */
        public Builder digitalTemplateParamJson(String digitalTemplateParamJson) {
            this.putQueryParameter("DigitalTemplateParamJson", digitalTemplateParamJson);
            this.digitalTemplateParamJson = digitalTemplateParamJson;
            return this;
        }

        /**
         * <p>The rollback type. Valid values:</p>
         * <ul>
         * <li><strong>SMS</strong>: text message</li>
         * <li><strong>DIGITALSMS</strong>: digital message</li>
         * <li><strong>NONE</strong>: none</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        public Builder fallbackType(String fallbackType) {
            this.putQueryParameter("FallbackType", fallbackType);
            this.fallbackType = fallbackType;
            return this;
        }

        /**
         * <p>The ID that is reserved for the caller of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>16545681783595370</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * <p>The mobile numbers of the recipients.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1390000****&quot;,&quot;1370000****&quot;]&quot;</p>
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * <p>The signature. You can view the template code in the <strong>Signature</strong> column on the <strong>Signaturess</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;aliyun&quot;,&quot;aliyuncode&quot;]</p>
         */
        public Builder signNameJson(String signNameJson) {
            this.putQueryParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * <p>The code of the text message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
         * <blockquote>
         * <p>Make sure that the message template has been approved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SMS_234251075</p>
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putQueryParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * <p>The variables of the text message template.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
         */
        public Builder smsTemplateParamJson(String smsTemplateParamJson) {
            this.putQueryParameter("SmsTemplateParamJson", smsTemplateParamJson);
            this.smsTemplateParamJson = smsTemplateParamJson;
            return this;
        }

        /**
         * <p>The extension code of the upstream message.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;6&quot;,&quot;6&quot;]</p>
         */
        public Builder smsUpExtendCodeJson(String smsUpExtendCodeJson) {
            this.putQueryParameter("SmsUpExtendCodeJson", smsUpExtendCodeJson);
            this.smsUpExtendCodeJson = smsUpExtendCodeJson;
            return this;
        }

        /**
         * <p>The code of the message template.</p>
         * <p>You can log on to the <a href="https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview">Alibaba Cloud console</a>, click <strong>Go China</strong> or <strong>Go Globe</strong> in the left-side navigation pane, and then view the <strong>template code</strong> on the <strong>Templates</strong> tab.</p>
         * <blockquote>
         * <p>You must specify a message template that is created in the SMS console and approved by Alibaba Cloud. If you send messages to countries or regions outside the Chinese mainland, use the corresponding message templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SMS_20375****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The value of the variable in the message template.</p>
         * <blockquote>
         * <p>If you need to add line breaks to the JSON template, make sure that the format is valid. In addition, the sequence of variable values must be the same as that of the mobile numbers and signatures.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TemplateParamJson&quot;},{&quot;name&quot;:&quot;TemplateParamJson&quot;}]</p>
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
