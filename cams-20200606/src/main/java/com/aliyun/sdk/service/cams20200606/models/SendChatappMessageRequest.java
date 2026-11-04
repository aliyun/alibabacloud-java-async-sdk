// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link SendChatappMessageRequest} extends {@link RequestModel}
 *
 * <p>SendChatappMessageRequest</p>
 */
public class SendChatappMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdAccountId")
    private String adAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContextMessageId")
    private String contextMessageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallBackContent")
    private String fallBackContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallBackDuration")
    private Integer fallBackDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallBackId")
    private String fallBackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallBackRule")
    private String fallBackRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowAction")
    private FlowAction flowAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    @Deprecated
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageCampaignId")
    private String messageCampaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    private java.util.List<String> payload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductAction")
    private ProductAction productAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecipientType")
    private String recipientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParams")
    private java.util.Map<String, String> templateParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenType")
    private String tokenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrackingData")
    private String trackingData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private SendChatappMessageRequest(Builder builder) {
        super(builder);
        this.adAccountId = builder.adAccountId;
        this.category = builder.category;
        this.channelType = builder.channelType;
        this.content = builder.content;
        this.contextMessageId = builder.contextMessageId;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.fallBackContent = builder.fallBackContent;
        this.fallBackDuration = builder.fallBackDuration;
        this.fallBackId = builder.fallBackId;
        this.fallBackRule = builder.fallBackRule;
        this.flowAction = builder.flowAction;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.label = builder.label;
        this.language = builder.language;
        this.messageCampaignId = builder.messageCampaignId;
        this.messageType = builder.messageType;
        this.ownerId = builder.ownerId;
        this.payload = builder.payload;
        this.productAction = builder.productAction;
        this.recipientType = builder.recipientType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.taskId = builder.taskId;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateParams = builder.templateParams;
        this.to = builder.to;
        this.tokenType = builder.tokenType;
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
     * @return adAccountId
     */
    public String getAdAccountId() {
        return this.adAccountId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return fallBackDuration
     */
    public Integer getFallBackDuration() {
        return this.fallBackDuration;
    }

    /**
     * @return fallBackId
     */
    public String getFallBackId() {
        return this.fallBackId;
    }

    /**
     * @return fallBackRule
     */
    public String getFallBackRule() {
        return this.fallBackRule;
    }

    /**
     * @return flowAction
     */
    public FlowAction getFlowAction() {
        return this.flowAction;
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
     * @return messageCampaignId
     */
    public String getMessageCampaignId() {
        return this.messageCampaignId;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payload
     */
    public java.util.List<String> getPayload() {
        return this.payload;
    }

    /**
     * @return productAction
     */
    public ProductAction getProductAction() {
        return this.productAction;
    }

    /**
     * @return recipientType
     */
    public String getRecipientType() {
        return this.recipientType;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateParams
     */
    public java.util.Map<String, String> getTemplateParams() {
        return this.templateParams;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
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
        private String adAccountId; 
        private String category; 
        private String channelType; 
        private String content; 
        private String contextMessageId; 
        private String custSpaceId; 
        private String custWabaId; 
        private String fallBackContent; 
        private Integer fallBackDuration; 
        private String fallBackId; 
        private String fallBackRule; 
        private FlowAction flowAction; 
        private String from; 
        private String isvCode; 
        private String label; 
        private String language; 
        private String messageCampaignId; 
        private String messageType; 
        private Long ownerId; 
        private java.util.List<String> payload; 
        private ProductAction productAction; 
        private String recipientType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tag; 
        private String taskId; 
        private String templateCode; 
        private String templateName; 
        private java.util.Map<String, String> templateParams; 
        private String to; 
        private String tokenType; 
        private String trackingData; 
        private Integer ttl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendChatappMessageRequest request) {
            super(request);
            this.adAccountId = request.adAccountId;
            this.category = request.category;
            this.channelType = request.channelType;
            this.content = request.content;
            this.contextMessageId = request.contextMessageId;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.fallBackContent = request.fallBackContent;
            this.fallBackDuration = request.fallBackDuration;
            this.fallBackId = request.fallBackId;
            this.fallBackRule = request.fallBackRule;
            this.flowAction = request.flowAction;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.label = request.label;
            this.language = request.language;
            this.messageCampaignId = request.messageCampaignId;
            this.messageType = request.messageType;
            this.ownerId = request.ownerId;
            this.payload = request.payload;
            this.productAction = request.productAction;
            this.recipientType = request.recipientType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.taskId = request.taskId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateParams = request.templateParams;
            this.to = request.to;
            this.tokenType = request.tokenType;
            this.trackingData = request.trackingData;
            this.ttl = request.ttl;
            this.type = request.type;
        } 

        /**
         * <p>The Meta ad account ID.</p>
         * <blockquote>
         * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123123********</p>
         */
        public Builder adAccountId(String adAccountId) {
            this.putQueryParameter("AdAccountId", adAccountId);
            this.adAccountId = adAccountId;
            return this;
        }

        /**
         * <p>The message type (for WhatsApp direct send).</p>
         * <blockquote>
         * <p>Warning: Do not specify this parameter if you are not a Meta-invited customer. Otherwise, message sending fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UTILITY</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The channel type. Valid values:  </p>
         * <ul>
         * <li><p><strong>whatsapp</strong> </p>
         * </li>
         * <li><p><strong>messenger</strong> </p>
         * </li>
         * <li><p><strong>instagram</strong></p>
         * </li>
         * <li><p><strong>telegram</strong></p>
         * </li>
         * <li><p><strong>line</strong></p>
         * </li>
         * <li><p><strong>telegram</strong></p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;- <strong>viber</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>whatsapp</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The message content.</p>
         * <details>
         * <summary>WhatsApp message notes:</summary>
         * 
         * <ul>
         * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required and the <strong>Caption</strong> field must not be specified.</li>
         * <li>When <strong>messageType</strong> is <strong>image</strong>, the <strong>Link</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>video</strong>, the <strong>Link</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>audio</strong>, the <strong>Link</strong> field is required and the <strong>Caption</strong> field is invalid.</li>
         * <li>When <strong>messageType</strong> is <strong>document</strong>, the <strong>Link</strong> and <strong>FileName</strong> fields are required and the <strong>Caption</strong> field is invalid.</li>
         * <li>When <strong>messageType</strong> is <strong>interactive</strong>, the <strong>type</strong> and <strong>action</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>contacts</strong>, the <strong>name</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>location</strong>, the <strong>longitude</strong> and <strong>latitude</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>sticker</strong>, the <strong>Link</strong> field is required and the <strong>Caption</strong> and <strong>FileName</strong> fields are invalid.</li>
         * <li>When <strong>messageType</strong> is <strong>reaction</strong>, the <strong>messageId</strong> and <strong>emoji</strong> fields are required.</details></li>
         * </ul>
         * <details>
         * <summary>Messenger message notes:</summary>
         * 
         * <ul>
         * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, <strong>audio</strong>, or <strong>document</strong>, the <strong>link</strong> field is required.</details></li>
         * </ul>
         * <details>
         * <summary>Instagram message notes:</summary>
         * 
         * <ul>
         * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, or <strong>audio</strong>, the <strong>link</strong> field is required.</details></li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <details>
         * <summary>Viber message notes:</summary>
         * 
         * <ul>
         * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>image</strong>, the <strong>link</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>video</strong>, the <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>document</strong>, the <strong>link</strong>, <strong>fileName</strong>, and <strong>fileType</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>text_button</strong>, the <strong>text</strong>, <strong>caption</strong>, and <strong>action</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>text_image_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>caption</strong>, and <strong>action</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>text_video</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>text_video_button</strong>, the <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, <strong>duration</strong>, and <strong>caption</strong> fields are required, and the <strong>action</strong> field must not be empty.</details></li>
         * </ul>
         * <details>
         * <summary>Telegram message notes:</summary>
         * 
         * <ul>
         * <li>When <strong>messageType</strong> is <strong>text</strong>, the <strong>text</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>image</strong>, <strong>video</strong>, <strong>audio</strong>, <strong>gif</strong>, or <strong>sticker</strong>, the <strong>link</strong> field is required.</li>
         * <li>When <strong>messageType</strong> is <strong>location</strong>, the <strong>latitude</strong> and <strong>longitude</strong> fields are required.</li>
         * <li>When <strong>messageType</strong> is <strong>interactive</strong>, the <strong>type</strong> field is required. You can send various Telegram message types. Example: {&quot;type&quot;: &quot;sendPhoto&quot;, &quot;sendPhoto&quot;: {&quot;photo&quot;:&quot;<a href="http://img.png%22,%22caption%22:%2221%22%7D%7D">http://img.png&quot;,&quot;caption&quot;:&quot;21&quot;}}</a>. This can be used to send a Photo type message. For more information about message types, see <a href="https://core.telegram.org/bots/api#sendphoto">Telegram message body</a>.</details></li>
         * </ul>
         * <details>
         * <summary>LINE message notes:</summary>
         * 
         * <ul>
         * <li><p>When <strong>messageType</strong> is <strong>text</strong> or <strong>textV2</strong>, the <strong>text</strong> field is required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>image</strong> or <strong>video</strong>, the <strong>link</strong> and <strong>previewImageUrl</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>audio</strong>, the <strong>link</strong> and <strong>duration</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>buttons</strong> or <strong>confirm</strong>, the <strong>text</strong> and <strong>actions</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>carousel</strong> or <strong>imageCarousel</strong>, the <strong>columns</strong> field is required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>quickReply</strong>, the <strong>text</strong> and <strong>items</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>sticker</strong>, the <strong>packageId</strong> and <strong>stickerId</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>location</strong>, the <strong>title</strong>, <strong>address</strong>, <strong>latitude</strong>, and <strong>longitude</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>coupon</strong>, the <strong>couponId</strong> field is required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>imagemap</strong>, the <strong>baseUrl</strong> and <strong>altText</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>flex</strong>, the <strong>contents</strong> and <strong>altText</strong> fields are required.</p>
         * </li>
         * <li><p>When <strong>messageType</strong> is <strong>interactive</strong>, you can pass in message formats supported by LINE:</p>
         * <ul>
         * <li>To send a single message, the <strong>type</strong> field is required, and other fields follow the LINE message body format. Example: {&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;test&quot;}</li>
         * <li>To send multiple messages (LINE supports up to 5 messages at a time), the <strong>messages</strong> field is required. Example: {&quot;messages&quot;: [{&quot;type&quot;: &quot;text&quot;, &quot;text&quot;: &quot;test&quot;}, {&quot;type&quot;: &quot;image&quot;, &quot;originalContentUrl&quot;: &quot;<a href="http://img.png">http://img.png</a>&quot;, &quot;previewImageUrl&quot;: &quot;<a href="http://img2.png%22%7D%5D%7D">http://img2.png&quot;}]}</a></li>
         * <li>For more information, see <a href="https://developers.line.biz/en/reference/messaging-api/#message-objects">LINE message body</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;text&quot;: &quot;hello,whatsapp&quot;,
         *   &quot;link&quot;: &quot;https://<em><strong><strong><strong>&quot;,
         *   &quot;caption&quot;: &quot;</strong></strong>&quot;,
         *   &quot;fileName&quot;: &quot;</strong></em>*&quot;
         * }</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the message to reply to. This is the ID of a previously sent or received message.</p>
         * 
         * <strong>example:</strong>
         * <p>61851ccb2f1365b16aee****</p>
         */
        public Builder contextMessageId(String contextMessageId) {
            this.putQueryParameter("ContextMessageId", contextMessageId);
            this.contextMessageId = contextMessageId;
            return this;
        }

        /**
         * <p>The SpaceId of the ISV sub-customer or the instance ID of a direct customer. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-8c8*********</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The ISV customer WABA ID. </p>
         * <blockquote>
         * <p>This parameter is deprecated. Use CustSpaceId instead.</p>
         * <ul>
         * <li>You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cams-8c8*********</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The custom fallback content. This parameter is for the China International site. China site users can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Fallback SMS</p>
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putQueryParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * <p>The fallback trigger time. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;If the message does not return a delivered receipt within the specified time, fallback is triggered. If this parameter is not specified, fallback is triggered only when the message fails to send or a failure status report is received. Unit: seconds. Minimum value: 60. Maximum value: 43200.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder fallBackDuration(Integer fallBackDuration) {
            this.putQueryParameter("FallBackDuration", fallBackDuration);
            this.fallBackDuration = fallBackDuration;
            return this;
        }

        /**
         * <p>The fallback policy ID. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;You can view the policy ID on the <a href="https://chatapp.console.alibabacloud.com/FallbackStrategy"><strong>Fallback Strategy</strong></a> page.</p>
         * 
         * <strong>example:</strong>
         * <p>S0****</p>
         */
        public Builder fallBackId(String fallBackId) {
            this.putQueryParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * <p>The fallback rule. This parameter is for the China International site. China site users can ignore this parameter.
         * &lt;props=&quot;intl&quot;&gt;Valid values:
         * &lt;props=&quot;intl&quot;&gt;- <strong>undelivered</strong>: fallback is triggered when the message cannot be delivered to the endpoint (template and parameter validation must pass during the sending state; blocked templates or numbers are not validated). This rule is used by default when the parameter value is empty.
         * &lt;props=&quot;intl&quot;&gt;- <strong>sentFailed</strong>: fallback is also triggered when template or template variable validation fails. Only the channelType, type, messageType, to, and from (existence check) parameters are strictly validated.</p>
         * 
         * <strong>example:</strong>
         * <p>undelivered</p>
         */
        public Builder fallBackRule(String fallBackRule) {
            this.putQueryParameter("FallBackRule", fallBackRule);
            this.fallBackRule = fallBackRule;
            return this;
        }

        /**
         * <p>The Flow message object.</p>
         * <blockquote>
         * <p>Valid only for WHATSAPP.</p>
         * </blockquote>
         */
        public Builder flowAction(FlowAction flowAction) {
            String flowActionShrink = shrink(flowAction, "FlowAction", "json");
            this.putQueryParameter("FlowAction", flowActionShrink);
            this.flowAction = flowAction;
            return this;
        }

        /**
         * <p>The sender number.</p>
         * <ul>
         * <li>When ChannelType is <strong>whatsapp</strong>, this is the phone number registered and bindng with WhatsApp. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</li>
         * <li>When ChannelType is <strong>messenger</strong>, this is the Page ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Public Page</strong> page.</li>
         * <li>When ChannelType is <strong>instagram</strong>, this is the Instagram professional account ID (Account ID). You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Professional Account</strong> page.
         * &lt;props=&quot;intl&quot;&gt;- When ChannelType is <strong>viber</strong>, this is the Viber Service ID. You can view it on the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Service ID Management</strong> page.</li>
         * <li>When ChannelType is <strong>telegram</strong>, this is the Telegram bot ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Bot Management</strong> page.</li>
         * <li>When ChannelType is <strong>line</strong>, this is the LINE Channel ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>LINE Official Account</strong> page.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861387777****</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ISV verification code.</p>
         * <blockquote>
         * <p>This parameter is deprecated. You can ignore it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123123******</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The Viber message type. This parameter is for the China International site. China site users can ignore this parameter.
         * &lt;props=&quot;intl&quot;&gt;Valid values:
         * &lt;props=&quot;intl&quot;&gt;- <strong>pormotion</strong>: marketing or promotional messages.
         * &lt;props=&quot;intl&quot;&gt;- <strong>transaction</strong>: notification messages.</p>
         * <blockquote>
         * <p>Valid only for VIBER.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The language. For a list of language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The campaign message ID.</p>
         * <blockquote>
         * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123123********</p>
         */
        public Builder messageCampaignId(String messageCampaignId) {
            this.putQueryParameter("MessageCampaignId", messageCampaignId);
            this.messageCampaignId = messageCampaignId;
            return this;
        }

        /**
         * <p>The detailed message type when Type is set to message. Valid values:</p>
         * <details>
         * <summary>WHATSAPP</summary>
         * 
         * <ul>
         * <li><p>text: text message.</p>
         * </li>
         * <li><p>image: image message.</p>
         * </li>
         * <li><p>video: video message.</p>
         * </li>
         * <li><p>audio: audio message.</p>
         * </li>
         * <li><p>document: document message.</p>
         * </li>
         * <li><p>interactive: interactive message.</p>
         * </li>
         * <li><p>location: location message.</p>
         * </li>
         * <li><p>contacts: contacts message.</p>
         * </li>
         * <li><p>reaction: reaction message.</p>
         * </li>
         * <li><p>sticker: sticker message.</p>
         * </li>
         * <li><p>typing_indicator: typing indicator message.</p>
         * </li>
         * <li><p>pin: pin or unpin message (group messages only).</p>
         * </li>
         * <li><p>carousel: carousel message.</p>
         * </details></li>
         * </ul>
         * <details>
         * <summary>VIBER</summary>
         * 
         * <ul>
         * <li><p>text: text message.</p>
         * </li>
         * <li><p>image: image message.</p>
         * </li>
         * <li><p>text_image_button: text + image + button message.</p>
         * </li>
         * <li><p>text_button: text + button message.</p>
         * </li>
         * <li><p>document: document message.</p>
         * </li>
         * <li><p>video: video message.</p>
         * </li>
         * <li><p>text_video: text + video message.</p>
         * </li>
         * <li><p>text_video_button: text + video + button message.</p>
         * </li>
         * <li><p>text_image: text + image message.</p>
         * </details></li>
         * </ul>
         * <details>
         * <summary>MESSENGER / INSTAGRAM</summary>
         * 
         * <ul>
         * <li><p>text: text message.</p>
         * </li>
         * <li><p>image: image message.</p>
         * </li>
         * <li><p>video: video message.</p>
         * </li>
         * <li><p>document: document message.</p>
         * </li>
         * <li><p>audio: audio message.</p>
         * </li>
         * <li><p>interactive: interactive message.</p>
         * </li>
         * <li><p>couponTemplate: coupon template message.</p>
         * </li>
         * <li><p>regularTemplate: regular template message.</p>
         * </li>
         * <li><p>quickReply: quick reply message.</p>
         * </li>
         * <li><p>buttonTemplate: button template message.</p>
         * </details></li>
         * </ul>
         * <details>
         * <summary>TELEGRAM</summary>
         * 
         * <ul>
         * <li><p>text: text message.</p>
         * </li>
         * <li><p>image: image message.</p>
         * </li>
         * <li><p>video: video message.</p>
         * </li>
         * <li><p>audio: audio message.</p>
         * </li>
         * <li><p>document: document message.</p>
         * </li>
         * <li><p>location: location message.</p>
         * </li>
         * <li><p>gif: animated GIF message.</p>
         * </li>
         * <li><p>sticker: sticker message.</p>
         * </li>
         * <li><p>interactive: custom pass-through Telegram message.</p>
         * </li>
         * </ul>
         * </details>
         * 
         * <details>
         * <summary>LINE</summary>
         * 
         * <ul>
         * <li><p>text: text message.</p>
         * </li>
         * <li><p>image: image message.</p>
         * </li>
         * <li><p>video: video message.</p>
         * </li>
         * <li><p>audio: audio message.</p>
         * </li>
         * <li><p>buttons: button message.</p>
         * </li>
         * <li><p>confirm: confirm message.</p>
         * </li>
         * <li><p>carousel: carousel message.</p>
         * </li>
         * <li><p>imageCarousel: image carousel message.</p>
         * </li>
         * <li><p>quickReply: quick reply message.</p>
         * </li>
         * <li><p>sticker: sticker message.</p>
         * </li>
         * <li><p>location: location message.</p>
         * </li>
         * <li><p>textV2: text message (V2).</p>
         * </li>
         * <li><p>coupon: coupon message.</p>
         * </li>
         * <li><p>imagemap: imagemap message.</p>
         * </li>
         * <li><p>flex: flex message.</p>
         * </li>
         * <li><p>interactive: custom pass-through LINE message.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p><a href="https://developers.line.biz/en/reference/messaging-api/#message-objects">For more information, see the message types supported by LINE</a></p>
         * </blockquote>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The collection of button trigger messages.</p>
         * <blockquote>
         * <p>This parameter is valid only for WHATSAPP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>payloadtext1,payloadtext2,payloadtext3</p>
         */
        public Builder payload(java.util.List<String> payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * <p>The product information. This parameter is valid only for WhatsApp channel types. It refers to the product information you uploaded on Meta.</p>
         * <blockquote>
         * <p>Valid only for WHATSAPP.</p>
         * </blockquote>
         */
        public Builder productAction(ProductAction productAction) {
            String productActionShrink = shrink(productAction, "ProductAction", "json");
            this.putQueryParameter("ProductAction", productActionShrink);
            this.productAction = productAction;
            return this;
        }

        /**
         * <p>The recipient type. Valid values:</p>
         * <ul>
         * <li><p>individual: an individual.</p>
         * </li>
         * <li><p>group: a group.</p>
         * </li>
         * <li><p>userId: WhatsApp BSUID. Valid only for WHATSAPP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>individual</p>
         */
        public Builder recipientType(String recipientType) {
            this.putQueryParameter("RecipientType", recipientType);
            this.recipientType = recipientType;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tag information. Custom tag information when sending Viber messages.</p>
         * <blockquote>
         * <p>Valid only for VIBER.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The custom task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The template code. You can view the template code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>1119***************</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The template name. You can view the template name on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The collection of template parameters.</p>
         */
        public Builder templateParams(java.util.Map<String, String> templateParams) {
            String templateParamsShrink = shrink(templateParams, "TemplateParams", "json");
            this.putQueryParameter("TemplateParams", templateParamsShrink);
            this.templateParams = templateParams;
            return this;
        }

        /**
         * <p>The recipient number.</p>
         * <ul>
         * <li>When ChannelType is <strong>whatsapp</strong>, this is the phone number or BSUID of the message recipient.</li>
         * <li>When ChannelType is <strong>messenger</strong>, this is the Page-Scoped User ID generated when the user interacts with the Facebook page.</li>
         * <li>When ChannelType is <strong>instagram</strong>, this is the Instagram User ID generated when the user interacts with the Instagram business or creator account.
         * &lt;props=&quot;intl&quot;&gt;- When ChannelType is <strong>viber</strong>, this is the phone number of the message recipient.</li>
         * <li>When ChannelType is <strong>telegram</strong>, this is the Telegram chatId.</li>
         * <li>When ChannelType is <strong>line</strong>, this is the LINE User ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861388988****</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The token type.</p>
         * <blockquote>
         * <p>This parameter is a test parameter that is not fully available. Ignore this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bearer</p>
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        /**
         * <p>The custom tracking data passed in for Viber message types. This parameter is for the China International site. China site users can ignore this parameter.</p>
         * <blockquote>
         * <p>Valid only for VIBER.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Tracking Data</p>
         */
        public Builder trackingData(String trackingData) {
            this.putQueryParameter("TrackingData", trackingData);
            this.trackingData = trackingData;
            return this;
        }

        /**
         * <p>The Viber message sending timeout period. This parameter is for the China International site. China site users can ignore this parameter. &lt;props=&quot;intl&quot;&gt;Unit: seconds. Valid values: 30 to 1209600.</p>
         * <blockquote>
         * <p>Valid only for VIBER.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><p>template: a message template that has been approved in the console. This type of message can be sent at any time.</p>
         * </li>
         * <li><p>message: a message in any format. This type of message can only be sent within 24 hours after receiving the last message from the user.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: When Type is set to template, you must specify TemplateCode. When Type is set to message, you must specify MessageType.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendChatappMessageRequest build() {
            return new SendChatappMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendChatappMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMessageRequest</p>
     */
    public static class FlowAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowActionData")
        private java.util.Map<String, ?> flowActionData;

        @com.aliyun.core.annotation.NameInMap("FlowToken")
        private String flowToken;

        private FlowAction(Builder builder) {
            this.flowActionData = builder.flowActionData;
            this.flowToken = builder.flowToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowAction create() {
            return builder().build();
        }

        /**
         * @return flowActionData
         */
        public java.util.Map<String, ?> getFlowActionData() {
            return this.flowActionData;
        }

        /**
         * @return flowToken
         */
        public String getFlowToken() {
            return this.flowToken;
        }

        public static final class Builder {
            private java.util.Map<String, ?> flowActionData; 
            private String flowToken; 

            private Builder() {
            } 

            private Builder(FlowAction model) {
                this.flowActionData = model.flowActionData;
                this.flowToken = model.flowToken;
            } 

            /**
             * <p>The collection of Flow default parameters.</p>
             */
            public Builder flowActionData(java.util.Map<String, ?> flowActionData) {
                this.flowActionData = flowActionData;
                return this;
            }

            /**
             * <p>The custom Flow token information.</p>
             * 
             * <strong>example:</strong>
             * <p>kde****</p>
             */
            public Builder flowToken(String flowToken) {
                this.flowToken = flowToken;
                return this;
            }

            public FlowAction build() {
                return new FlowAction(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatappMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMessageRequest</p>
     */
    public static class ProductItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductRetailerId")
        private String productRetailerId;

        private ProductItems(Builder builder) {
            this.productRetailerId = builder.productRetailerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductItems create() {
            return builder().build();
        }

        /**
         * @return productRetailerId
         */
        public String getProductRetailerId() {
            return this.productRetailerId;
        }

        public static final class Builder {
            private String productRetailerId; 

            private Builder() {
            } 

            private Builder(ProductItems model) {
                this.productRetailerId = model.productRetailerId;
            } 

            /**
             * <p>The product ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>ksi3****</p>
             */
            public Builder productRetailerId(String productRetailerId) {
                this.productRetailerId = productRetailerId;
                return this;
            }

            public ProductItems build() {
                return new ProductItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatappMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMessageRequest</p>
     */
    public static class Sections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductItems")
        private java.util.List<ProductItems> productItems;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Sections(Builder builder) {
            this.productItems = builder.productItems;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sections create() {
            return builder().build();
        }

        /**
         * @return productItems
         */
        public java.util.List<ProductItems> getProductItems() {
            return this.productItems;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<ProductItems> productItems; 
            private String title; 

            private Builder() {
            } 

            private Builder(Sections model) {
                this.productItems = model.productItems;
                this.title = model.title;
            } 

            /**
             * <p>The list of product items.</p>
             */
            public Builder productItems(java.util.List<ProductItems> productItems) {
                this.productItems = productItems;
                return this;
            }

            /**
             * <p>The category name. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Sections build() {
                return new Sections(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendChatappMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMessageRequest</p>
     */
    public static class ProductAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sections")
        private java.util.List<Sections> sections;

        @com.aliyun.core.annotation.NameInMap("ThumbnailProductRetailerId")
        private String thumbnailProductRetailerId;

        private ProductAction(Builder builder) {
            this.sections = builder.sections;
            this.thumbnailProductRetailerId = builder.thumbnailProductRetailerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductAction create() {
            return builder().build();
        }

        /**
         * @return sections
         */
        public java.util.List<Sections> getSections() {
            return this.sections;
        }

        /**
         * @return thumbnailProductRetailerId
         */
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

        public static final class Builder {
            private java.util.List<Sections> sections; 
            private String thumbnailProductRetailerId; 

            private Builder() {
            } 

            private Builder(ProductAction model) {
                this.sections = model.sections;
                this.thumbnailProductRetailerId = model.thumbnailProductRetailerId;
            } 

            /**
             * <p>The list of product categories (up to 10 categories and 30 products).</p>
             */
            public Builder sections(java.util.List<Sections> sections) {
                this.sections = sections;
                return this;
            }

            /**
             * <p>The product catalog ID. You can obtain it by calling the <a href="https://help.aliyun.com/document_detail/2539783.html">ListProductCatalog</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>skkks99****</p>
             */
            public Builder thumbnailProductRetailerId(String thumbnailProductRetailerId) {
                this.thumbnailProductRetailerId = thumbnailProductRetailerId;
                return this;
            }

            public ProductAction build() {
                return new ProductAction(this);
            } 

        } 

    }
}
