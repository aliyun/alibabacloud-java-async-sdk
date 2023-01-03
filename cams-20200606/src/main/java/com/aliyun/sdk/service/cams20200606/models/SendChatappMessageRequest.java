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
    @NameInMap("ContextMessageId")
    private String contextMessageId;

    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("CustWabaId")
    @Deprecated
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
    @NameInMap("Label")
    private String label;

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
    @NameInMap("Tag")
    private String tag;

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
    @NameInMap("TrackingData")
    private String trackingData;

    @Body
    @NameInMap("Ttl")
    private Integer ttl;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private SendChatappMessageRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.content = builder.content;
        this.contextMessageId = builder.contextMessageId;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.fallBackContent = builder.fallBackContent;
        this.fallBackId = builder.fallBackId;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.label = builder.label;
        this.language = builder.language;
        this.messageType = builder.messageType;
        this.payload = builder.payload;
        this.tag = builder.tag;
        this.templateCode = builder.templateCode;
        this.templateParams = builder.templateParams;
        this.to = builder.to;
        this.trackingData = builder.trackingData;
        this.ttl = builder.ttl;
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
     * @return contextMessageId
     */
    public String getContextMessageId() {
        return this.contextMessageId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
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
     * @return label
     */
    public String getLabel() {
        return this.label;
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
     * @return tag
     */
    public String getTag() {
        return this.tag;
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
     * @return trackingData
     */
    public String getTrackingData() {
        return this.trackingData;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
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
        private String contextMessageId; 
        private String custSpaceId; 
        private String custWabaId; 
        private String fallBackContent; 
        private String fallBackId; 
        private String from; 
        private String isvCode; 
        private String label; 
        private String language; 
        private String messageType; 
        private java.util.List < String > payload; 
        private String tag; 
        private String templateCode; 
        private java.util.Map < String, String > templateParams; 
        private String to; 
        private String trackingData; 
        private Integer ttl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendChatappMessageRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.content = request.content;
            this.contextMessageId = request.contextMessageId;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.fallBackContent = request.fallBackContent;
            this.fallBackId = request.fallBackId;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.label = request.label;
            this.language = request.language;
            this.messageType = request.messageType;
            this.payload = request.payload;
            this.tag = request.tag;
            this.templateCode = request.templateCode;
            this.templateParams = request.templateParams;
            this.to = request.to;
            this.trackingData = request.trackingData;
            this.ttl = request.ttl;
            this.type = request.type;
        } 

        /**
         * The type of the message channel. Valid values:
         * <p>
         * 
         * *   **whatsapp**
         * *   viber (under development)
         * *   line (under development)
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * The content of the message.
         * <p>
         * 
         * **
         * 
         * **Note** The **Content** parameter is required if you set the **Type** parameter to **message**.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 回复的消息ID
         */
        public Builder contextMessageId(String contextMessageId) {
            this.putBodyParameter("ContextMessageId", contextMessageId);
            this.contextMessageId = contextMessageId;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The unique identifier of the WhatsApp account that you register.
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * Fallback message content.
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * Fallback strategy id. Fallback Strategy can be created on the ChatApp console.
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * The mobile phone number of the message sender.
         * <p>
         * 
         * <notice>You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the ChatApp console.</notice>
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Assigned by ISV for RAM user authentication and authorization.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * Viber消息类型，取值 pormotion/transation
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * The language that is used in the message template.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The type of the message. This parameter is required if you set the Type parameter to **message**. Valid values:
         * <p>
         * 
         * *   **text**: a text message. The **Text** parameter is required if you set the MessageType parameter to text.
         * *   **image**: an image message. The **Link** parameter is required and the **Caption** parameter is optional if you set the MessageType parameter to image.
         * *   **video**: a video message. The **Link** parameter is required and the **Caption** parameter is optional if you set the MessageType parameter to video.
         * *   **audio**: an audio message. The **Link** parameter is required and the **Caption** parameter is invalid if you set the MessageType parameter to audio.
         * *   **document**: a document message. The **Link** and **FileName** parameters are required and the **Caption** parameter is invalid if you set the MessageType parameter to document.
         */
        public Builder messageType(String messageType) {
            this.putBodyParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * The payload of the button.
         */
        public Builder payload(java.util.List < String > payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * viber消息发送时tag信息
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The code of the message template. This parameter is required if you set the Type parameter to **template**.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The variables of the message template.
         */
        public Builder templateParams(java.util.Map < String, String > templateParams) {
            String templateParamsShrink = shrink(templateParams, "TemplateParams", "json");
            this.putBodyParameter("TemplateParams", templateParamsShrink);
            this.templateParams = templateParams;
            return this;
        }

        /**
         * The mobile phone number of the message recipient.
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * viber消息跟踪数据值
         */
        public Builder trackingData(String trackingData) {
            this.putBodyParameter("TrackingData", trackingData);
            this.trackingData = trackingData;
            return this;
        }

        /**
         * Viber消息发送超时时间，单位为秒，取值范围 30 - 1209600
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * The type of the message. Valid values:
         * <p>
         * 
         * *   **template**: a template message. A template message is sent based on a template that is created in the ChatApp console and is approved. You can send template messages based on your business requirements.
         * *   **message**: a custom message. You can send a custom message to a user only within 24 hours after you receive the last message from the user.
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
