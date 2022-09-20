// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMessageRequest} extends {@link RequestModel}
 *
 * <p>SendChatappMessageRequest</p>
 */
public class SendChatappMessageRequest extends Request {
    @Body
    @NameInMap("ChannelType")
    @Validation(required = true)
    private String channelType;

    @Query
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("CustWabaId")
    private String custWabaId;

    @Body
    @NameInMap("FallBackContent")
    private String fallBackContent;

    @Body
    @NameInMap("FallBackId")
    private String fallBackId;

    @Body
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Body
    @NameInMap("IsvCode")
    private String isvCode;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("MessageType")
    private String messageType;

    @Query
    @NameInMap("Payload")
    private java.util.List < String > payload;

    @Body
    @NameInMap("TemplateCode")
    private String templateCode;

    @Body
    @NameInMap("TemplateParams")
    private java.util.Map < String, String > templateParams;

    @Body
    @NameInMap("To")
    @Validation(required = true)
    private String to;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private SendChatappMessageRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.content = builder.content;
        this.custWabaId = builder.custWabaId;
        this.fallBackContent = builder.fallBackContent;
        this.fallBackId = builder.fallBackId;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.messageType = builder.messageType;
        this.payload = builder.payload;
        this.templateCode = builder.templateCode;
        this.templateParams = builder.templateParams;
        this.to = builder.to;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatappMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return fallBackContent
     */
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    /**
     * @return fallBackId
     */
    public String getFallBackId() {
        return this.fallBackId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return payload
     */
    public java.util.List < String > getPayload() {
        return this.payload;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParams
     */
    public java.util.Map < String, String > getTemplateParams() {
        return this.templateParams;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendChatappMessageRequest, Builder> {
        private String channelType; 
        private String content; 
        private String custWabaId; 
        private String fallBackContent; 
        private String fallBackId; 
        private String from; 
        private String isvCode; 
        private String language; 
        private String messageType; 
        private java.util.List < String > payload; 
        private String templateCode; 
        private java.util.Map < String, String > templateParams; 
        private String to; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendChatappMessageRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.content = request.content;
            this.custWabaId = request.custWabaId;
            this.fallBackContent = request.fallBackContent;
            this.fallBackId = request.fallBackId;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.messageType = request.messageType;
            this.payload = request.payload;
            this.templateCode = request.templateCode;
            this.templateParams = request.templateParams;
            this.to = request.to;
            this.type = request.type;
        } 

        /**
         * 通道类型 whatsapp/viber/line
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * 消息内容
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ISV客户wabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * 回落内容
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * 回落策略ID
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * 发送方
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 语言
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * 消息类型
         */
        public Builder messageType(String messageType) {
            this.putBodyParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(java.util.List < String > payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * 模板编码
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParams.
         */
        public Builder templateParams(java.util.Map < String, String > templateParams) {
            String templateParamsShrink = shrink(templateParams, "TemplateParams", "json");
            this.putBodyParameter("TemplateParams", templateParamsShrink);
            this.templateParams = templateParams;
            return this;
        }

        /**
         * 接收号码
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * 消息大类
         * <p>
         * template--模板
         * message--非模板
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendChatappMessageRequest build() {
            return new SendChatappMessageRequest(this);
        } 

    } 

}
