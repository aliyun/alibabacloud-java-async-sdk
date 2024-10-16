// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendMessageWithTemplateRequest} extends {@link RequestModel}
 *
 * <p>SendMessageWithTemplateRequest</p>
 */
public class SendMessageWithTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
    private String templateParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
    private Long validityPeriod;

    private SendMessageWithTemplateRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.from = builder.from;
        this.smsUpExtendCode = builder.smsUpExtendCode;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
        this.to = builder.to;
        this.validityPeriod = builder.validityPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageWithTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
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

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return validityPeriod
     */
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public static final class Builder extends Request.Builder<SendMessageWithTemplateRequest, Builder> {
        private String channelId; 
        private String from; 
        private String smsUpExtendCode; 
        private String templateCode; 
        private String templateParam; 
        private String to; 
        private Long validityPeriod; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageWithTemplateRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.from = request.from;
            this.smsUpExtendCode = request.smsUpExtendCode;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
            this.to = request.to;
            this.validityPeriod = request.validityPeriod;
        } 

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>5739</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The signature. To query the signature, log on to the <a href="https://sms-intl.console.aliyun.com/overview">Short Message Service (SMS) console</a> and navigate to the <strong>Signatures</strong> tab of the <strong>Go China</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicloud321</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The extension code of the MO message.</p>
         * 
         * <strong>example:</strong>
         * <p>90999</p>
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
            return this;
        }

        /**
         * <p>The code of the message template. To query the code, log on to the <a href="https://sms-intl.console.aliyun.com/overview">SMS console</a> and navigate to the <strong>Templates</strong> tab of the <strong>Go China</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The value of the variable in the message template. If a variable exists in the template, the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;1234&quot;,&quot;product&quot;:&quot;ytx&quot;}</p>
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        /**
         * <p>The mobile phone number to which the message is sent. You must add the country code to the beginning of the mobile phone number. Example: 861503871****.</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/sms/product-overview/dialing-codes?spm=a2c63.p38356.0.0.367279cbwQFoeM">Dialing codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861503871****</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The validity period of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder validityPeriod(Long validityPeriod) {
            this.putQueryParameter("ValidityPeriod", validityPeriod);
            this.validityPeriod = validityPeriod;
            return this;
        }

        @Override
        public SendMessageWithTemplateRequest build() {
            return new SendMessageWithTemplateRequest(this);
        } 

    } 

}
