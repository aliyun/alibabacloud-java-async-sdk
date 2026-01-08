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
         * AdAccountId.
         */
        public Builder adAccountId(String adAccountId) {
            this.putQueryParameter("AdAccountId", adAccountId);
            this.adAccountId = adAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The message content.</p>
         * <p><strong>Notes on WhatsApp messages:</strong></p>
         * <ul>
         * <li>If you set <strong>messageType</strong> to <strong>text</strong>, you must specify <strong>text</strong> and must not specify <strong>Caption</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>image</strong>, you must specify <strong>Link</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>video</strong>, you must specify <strong>Link</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>audio</strong>, <strong>Link</strong> is required and <strong>Caption</strong> is invalid.</li>
         * <li>If you set <strong>messageType</strong> to <strong>document</strong>, <strong>Link</strong> and <strong>FileName</strong> are required and <strong>Caption</strong> is invalid.</li>
         * <li>If you set <strong>messageType</strong> to <strong>interactive</strong>, you must specify <strong>type</strong> and <strong>action</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>contacts</strong>, you must specify <strong>name</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>location</strong>, you must specify <strong>longitude</strong> and <strong>latitude</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>sticker</strong>, you must specify <strong>Link</strong>, and <strong>Caption</strong> and <strong>FileName</strong> are invalid.</li>
         * <li>If you set <strong>messageType</strong> to <strong>reaction</strong>, you must specify <strong>messageId</strong> and <strong>emoji</strong>.</li>
         * </ul>
         * <p><strong>Notes on Viber messages:</strong></p>
         * <ul>
         * <li>If you set <strong>messageType</strong> to <strong>text</strong>, you must specify <strong>text</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>image</strong>, you must specify <strong>link</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>video</strong>, you must specify <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>document</strong>, you must specify <strong>link</strong>, <strong>fileName</strong>, and <strong>fileType</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>text_button</strong>, you must specify <strong>text</strong>, <strong>caption</strong>, and <strong>action</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>text_image_button</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>caption</strong>, and <strong>action</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>text_video</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, and <strong>duration</strong>.</li>
         * <li>If you set <strong>messageType</strong> to <strong>text_video_button</strong>, you must specify <strong>text</strong>, <strong>link</strong>, <strong>thumbnail</strong>, <strong>fileSize</strong>, <strong>duration</strong>, and <strong>caption</strong>. In addition, you must not specify <strong>action</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;text&quot;: &quot;hello whatsapp&quot;, &quot;link&quot;: &quot;&quot;, &quot;caption&quot;: &quot;&quot;, &quot;fileName&quot;: &quot;&quot; }</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContextMessageId.
         */
        public Builder contextMessageId(String contextMessageId) {
            this.putQueryParameter("ContextMessageId", contextMessageId);
            this.contextMessageId = contextMessageId;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * CustWabaId.
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * FallBackContent.
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putQueryParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * FallBackDuration.
         */
        public Builder fallBackDuration(Integer fallBackDuration) {
            this.putQueryParameter("FallBackDuration", fallBackDuration);
            this.fallBackDuration = fallBackDuration;
            return this;
        }

        /**
         * FallBackId.
         */
        public Builder fallBackId(String fallBackId) {
            this.putQueryParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * FallBackRule.
         */
        public Builder fallBackRule(String fallBackRule) {
            this.putQueryParameter("FallBackRule", fallBackRule);
            this.fallBackRule = fallBackRule;
            return this;
        }

        /**
         * FlowAction.
         */
        public Builder flowAction(FlowAction flowAction) {
            String flowActionShrink = shrink(flowAction, "FlowAction", "json");
            this.putQueryParameter("FlowAction", flowActionShrink);
            this.flowAction = flowAction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * IsvCode.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MessageCampaignId.
         */
        public Builder messageCampaignId(String messageCampaignId) {
            this.putQueryParameter("MessageCampaignId", messageCampaignId);
            this.messageCampaignId = messageCampaignId;
            return this;
        }

        /**
         * MessageType.
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
         * <p>The payload of the button.</p>
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
         * ProductAction.
         */
        public Builder productAction(ProductAction productAction) {
            String productActionShrink = shrink(productAction, "ProductAction", "json");
            this.putQueryParameter("ProductAction", productActionShrink);
            this.productAction = productAction;
            return this;
        }

        /**
         * RecipientType.
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
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateParams.
         */
        public Builder templateParams(java.util.Map<String, String> templateParams) {
            String templateParamsShrink = shrink(templateParams, "TemplateParams", "json");
            this.putQueryParameter("TemplateParams", templateParamsShrink);
            this.templateParams = templateParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * TokenType.
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        /**
         * TrackingData.
         */
        public Builder trackingData(String trackingData) {
            this.putQueryParameter("TrackingData", trackingData);
            this.trackingData = trackingData;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
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
             * FlowActionData.
             */
            public Builder flowActionData(java.util.Map<String, ?> flowActionData) {
                this.flowActionData = flowActionData;
                return this;
            }

            /**
             * FlowToken.
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
             * ProductRetailerId.
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
             * ProductItems.
             */
            public Builder productItems(java.util.List<ProductItems> productItems) {
                this.productItems = productItems;
                return this;
            }

            /**
             * Title.
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
             * Sections.
             */
            public Builder sections(java.util.List<Sections> sections) {
                this.sections = sections;
                return this;
            }

            /**
             * ThumbnailProductRetailerId.
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
