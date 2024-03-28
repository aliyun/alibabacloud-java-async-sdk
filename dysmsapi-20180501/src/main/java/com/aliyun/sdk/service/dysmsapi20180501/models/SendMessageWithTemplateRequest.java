// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageWithTemplateRequest} extends {@link RequestModel}
 *
 * <p>SendMessageWithTemplateRequest</p>
 */
public class SendMessageWithTemplateRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("TemplateParam")
    private String templateParam;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private String to;

    @Query
    @NameInMap("ValidityPeriod")
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * The signature. To query the signature, log on to the [Short Message Service (SMS) console](https://sms-intl.console.aliyun.com/overview) and navigate to the **Signatures** tab of the **Go China** page.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The extension code of the MO message.
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
            return this;
        }

        /**
         * The code of the message template. To query the code, log on to the [SMS console](https://sms-intl.console.aliyun.com/overview) and navigate to the **Templates** tab of the **Go China** page.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The value of the variable in the message template. If a variable exists in the template, the parameter is required.
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        /**
         * The mobile phone number to which the message is sent. You must add the country code to the beginning of the mobile phone number. Example: 861503871\*\*\*\*.
         * <p>
         * 
         * For more information, see [Dialing codes](https://www.alibabacloud.com/help/zh/short-message-service/latest/dialing-codes).
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The validity period of the message.
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
