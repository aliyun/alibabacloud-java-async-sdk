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
    @NameInMap("FallBackDuration")
    @Validation(maximum = 43200, minimum = 10)
    private Integer fallBackDuration;

    @Body
    @NameInMap("FallBackId")
    private String fallBackId;

    @Body
    @NameInMap("FallBackRule")
    private String fallBackRule;

    @Body
    @NameInMap("FlowAction")
    private FlowAction flowAction;

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
    @NameInMap("ProductAction")
    private ProductAction productAction;

    @Body
    @NameInMap("Tag")
    private String tag;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("TemplateCode")
    private String templateCode;

    @Body
    @NameInMap("TemplateName")
    private String templateName;

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
        this.fallBackDuration = builder.fallBackDuration;
        this.fallBackId = builder.fallBackId;
        this.fallBackRule = builder.fallBackRule;
        this.flowAction = builder.flowAction;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.label = builder.label;
        this.language = builder.language;
        this.messageType = builder.messageType;
        this.payload = builder.payload;
        this.productAction = builder.productAction;
        this.tag = builder.tag;
        this.taskId = builder.taskId;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
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
     * @return productAction
     */
    public ProductAction getProductAction() {
        return this.productAction;
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
        private Integer fallBackDuration; 
        private String fallBackId; 
        private String fallBackRule; 
        private FlowAction flowAction; 
        private String from; 
        private String isvCode; 
        private String label; 
        private String language; 
        private String messageType; 
        private java.util.List < String > payload; 
        private ProductAction productAction; 
        private String tag; 
        private String taskId; 
        private String templateCode; 
        private String templateName; 
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
            this.fallBackDuration = request.fallBackDuration;
            this.fallBackId = request.fallBackId;
            this.fallBackRule = request.fallBackRule;
            this.flowAction = request.flowAction;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.label = request.label;
            this.language = request.language;
            this.messageType = request.messageType;
            this.payload = request.payload;
            this.productAction = request.productAction;
            this.tag = request.tag;
            this.taskId = request.taskId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
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
         * *   **viber**
         * *   line. The feature that ChatAPP sends messages by using Line is under development.
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
         * **Usage notes when you set the ChannelType parameter to whatsapp:**
         * 
         * *   When you set the **MessageType** parameter to **text**, the **text** parameter is required and the **caption** parameter cannot be specified.
         * *   When you set the **MessageType** parameter to **image**, the **link** parameter is required.
         * *   When you set the **MessageType** parameter to **video**, the **link** parameter is required.
         * *   When you set the **MessageType** parameter to **audio**, the **link** parameter is required and the **caption** parameter is invalid.
         * *   When you set the **MessageType** parameter to **document**, the **link** and **fileName** parameters are required and the **caption** parameter is invalid.
         * *   When you set the **MessageType** parameter to **interactive**, the **type** and **action** parameters are required.
         * *   When you set the **MessageType** parameter to **contacts**, the **name** parameter is required.
         * *   When you set the **MessageType** parameter to **location**, the **longitude** and **latitude** parameters are required.
         * *   When you set the **MessageType** parameter to **sticker**, the **link** parameter is required, and the **caption** and **fileName** parameters are invalid.
         * *   When you set the **MessageType** parameter to **reaction**, the **messageId** and **emoji** parameters are required.
         * 
         * **Usage notes when you set the ChannelType parameter to viber:**
         * 
         * *   When you set the **MessageType** parameter to **text**, the **text** parameter is required.
         * *   When you set the **MessageType** parameter to **image**, the **link** parameter is required.
         * *   When you set the **MessageType** parameter to **video**, the **link**, **thumbnail**, **fileSize**, and **duration** parameters are required.
         * *   When you set the **MessageType** parameter to **document**, the **link**, **fileName**, and **fileType** parameters are required.
         * *   When you set the **MessageType** parameter to **text_button**, the **text**, **caption**, and **action** parameters are required.
         * *   When you set the **MessageType** parameter to **text_image_button**, the **text**, **link**, **caption**, and **action** parameters are required.
         * *   When you set the **MessageType** parameter to **text_video**, the **text**, **link**, **thumbnail**, **fileSize**, and **duration** parameters are required.
         * *   When you set the **MessageType** parameter to **text_video_button**, the **text**, **link**, **thumbnail**, **fileSize**, **duration**, and **caption** parameters are required. The **action** parameter is invalid.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The ID of the message to reply to.
         */
        public Builder contextMessageId(String contextMessageId) {
            this.putBodyParameter("ContextMessageId", contextMessageId);
            this.contextMessageId = contextMessageId;
            return this;
        }

        /**
         * The space ID of the user.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The ID of the WhatsApp account that you register.
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * The content of the fallback message.
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * Specifies the period of time after which the fallback Short Message Service (SMS) message is sent if the message receipt that indicates the message is delivered to customers is not received. If this parameter is left empty, the fallback SMS message is sent only when the **message fails to be sent** or **the message receipt that indicates the message is not delivered to customers** is received. Valid values: 60 to 43200. Unit: seconds.
         */
        public Builder fallBackDuration(Integer fallBackDuration) {
            this.putBodyParameter("FallBackDuration", fallBackDuration);
            this.fallBackDuration = fallBackDuration;
            return this;
        }

        /**
         * The ID of the fallback strategy. You can create a fallback strategy and view the information in the console.
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * 回落规则。
         * <p>
         * 
         * > 取值范围
         * > - undelivered  消息不能发送到端时回落（在发送状态时模板、参数需要校验通过，模板被封、号码被封等不做校验）。参数值为空时默认使用此规则
         * > - sentFailed  消息在校验模板、模板变量等参数时，校验不通过也会回落。只会强校验channelType, type, messageType, to, from(是否存在) 几个参数。
         * 
         * <props="china">
         * 
         * > 中国站此字段无效
         * </props>
         */
        public Builder fallBackRule(String fallBackRule) {
            this.putBodyParameter("FallBackRule", fallBackRule);
            this.fallBackRule = fallBackRule;
            return this;
        }

        /**
         * Flow发送数据
         */
        public Builder flowAction(FlowAction flowAction) {
            String flowActionShrink = shrink(flowAction, "FlowAction", "json");
            this.putBodyParameter("FlowAction", flowActionShrink);
            this.flowAction = flowAction;
            return this;
        }

        /**
         * The phone number of the message sender.
         * <p>
         * 
         * > You can specify a mobile phone number that is registered for a WhatsApp account and is approved in the ChatAPP console.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The type of the Viber message. This parameter is required if you set the ChannelType parameter to viber. Valid values: promotion and transaction.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * The language that is used in the message template. This parameter is required only if you set the Type parameter to **template**. For more information about language codes, see [Language codes](~~463420~~).
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The specific type of the message. This parameter is required only if you set the Type parameter to **message**.
         * <p>
         * 
         * **Valid values of MessageType when you set the ChannelType parameter to whatsapp:**
         * 
         * *   **text**: a text message.
         * *   **image**: an image message.
         * *   **video**: a video message.
         * *   **audio**: an audio message.
         * *   **document**: a document message.
         * *   **interactive**: an interactive message.
         * *   **contacts**: a contact message.
         * *   **location**: a location message.
         * *   **sticker**: a sticker message.
         * *   **reaction**: a reaction message.
         * 
         * **Valid values of MessageType when you set the ChannelType parameter to viber:**
         * 
         * *   **text**: a text message.
         * *   **image**: an image message.
         * *   **video**: a video message.
         * *   **document**: a document message.
         * *   **text_button**: a message that contains the text and button media objects.
         * *   **text_image_button**: a message that contains multiple media objects, including the text, image, and button.
         * *   **text_video**: a message that contains the text and video media objects.
         * *   **text_video_button**: a message that contains multiple media objects, including text, video, and button.
         * *   **text_image**: a message that contains the text and image media objects.
         * 
         * > For more information, see [Parameters of a message template](~~454530~~).
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
         * The information about the products included in the WhatsApp catalog message or multi-product message (MPM).
         */
        public Builder productAction(ProductAction productAction) {
            String productActionShrink = shrink(productAction, "ProductAction", "json");
            this.putBodyParameter("ProductAction", productActionShrink);
            this.productAction = productAction;
            return this;
        }

        /**
         * The tag information of the Viber message.
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The code of the message template. This parameter is required only if you set the Type parameter to **template**.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
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
         * The phone number that receives the message.
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The tracking ID of the Viber message.
         */
        public Builder trackingData(String trackingData) {
            this.putBodyParameter("TrackingData", trackingData);
            this.trackingData = trackingData;
            return this;
        }

        /**
         * The timeout period for sending the Viber message. Valid values: 30 to 1209600. Unit: seconds.
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
         * *   **template**: a template message. A template message is sent based on a template that is created in the ChatAPP console and is approved. You can send template messages at any time based on your business requirements.
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

    public static class FlowAction extends TeaModel {
        @NameInMap("FlowActionData")
        private java.util.Map < String, String > flowActionData;

        @NameInMap("FlowToken")
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
        public java.util.Map < String, String > getFlowActionData() {
            return this.flowActionData;
        }

        /**
         * @return flowToken
         */
        public String getFlowToken() {
            return this.flowToken;
        }

        public static final class Builder {
            private java.util.Map < String, String > flowActionData; 
            private String flowToken; 

            /**
             * flow默认参数
             */
            public Builder flowActionData(java.util.Map < String, String > flowActionData) {
                this.flowActionData = flowActionData;
                return this;
            }

            /**
             * flow token信息
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
    public static class ProductItems extends TeaModel {
        @NameInMap("ProductRetailerId")
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

            /**
             * The retailer ID of the product.
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
    public static class Sections extends TeaModel {
        @NameInMap("ProductItems")
        private java.util.List < ProductItems> productItems;

        @NameInMap("Title")
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
        public java.util.List < ProductItems> getProductItems() {
            return this.productItems;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < ProductItems> productItems; 
            private String title; 

            /**
             * The products.
             */
            public Builder productItems(java.util.List < ProductItems> productItems) {
                this.productItems = productItems;
                return this;
            }

            /**
             * The name of the category.
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
    public static class ProductAction extends TeaModel {
        @NameInMap("Sections")
        private java.util.List < Sections> sections;

        @NameInMap("ThumbnailProductRetailerId")
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
        public java.util.List < Sections> getSections() {
            return this.sections;
        }

        /**
         * @return thumbnailProductRetailerId
         */
        public String getThumbnailProductRetailerId() {
            return this.thumbnailProductRetailerId;
        }

        public static final class Builder {
            private java.util.List < Sections> sections; 
            private String thumbnailProductRetailerId; 

            /**
             * The products. Up to 30 products can be added. The products can be divided into up to 10 categories.
             */
            public Builder sections(java.util.List < Sections> sections) {
                this.sections = sections;
                return this;
            }

            /**
             * The retailer ID of the product.
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
