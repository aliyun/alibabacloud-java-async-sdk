// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMassMessageRequest} extends {@link RequestModel}
 *
 * <p>SendChatappMassMessageRequest</p>
 */
public class SendChatappMassMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallBackContent")
    private String fallBackContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallBackDuration")
    @com.aliyun.core.annotation.Validation(maximum = 43200, minimum = 10)
    private Integer fallBackDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallBackId")
    private String fallBackId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallBackRule")
    private String fallBackRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SenderList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SenderList> senderList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Long ttl;

    private SendChatappMassMessageRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.fallBackContent = builder.fallBackContent;
        this.fallBackDuration = builder.fallBackDuration;
        this.fallBackId = builder.fallBackId;
        this.fallBackRule = builder.fallBackRule;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.label = builder.label;
        this.language = builder.language;
        this.senderList = builder.senderList;
        this.tag = builder.tag;
        this.taskId = builder.taskId;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatappMassMessageRequest create() {
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
     * @return senderList
     */
    public java.util.List < SenderList> getSenderList() {
        return this.senderList;
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
     * @return ttl
     */
    public Long getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<SendChatappMassMessageRequest, Builder> {
        private String channelType; 
        private String custSpaceId; 
        private String custWabaId; 
        private String fallBackContent; 
        private Integer fallBackDuration; 
        private String fallBackId; 
        private String fallBackRule; 
        private String from; 
        private String isvCode; 
        private String label; 
        private String language; 
        private java.util.List < SenderList> senderList; 
        private String tag; 
        private String taskId; 
        private String templateCode; 
        private String templateName; 
        private Long ttl; 

        private Builder() {
            super();
        } 

        private Builder(SendChatappMassMessageRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.fallBackContent = request.fallBackContent;
            this.fallBackDuration = request.fallBackDuration;
            this.fallBackId = request.fallBackId;
            this.fallBackRule = request.fallBackRule;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.label = request.label;
            this.language = request.language;
            this.senderList = request.senderList;
            this.tag = request.tag;
            this.taskId = request.taskId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.ttl = request.ttl;
        } 

        /**
         * The channel type. Valid values: whatsapp, viber, and line.
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
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
         * The ID of the WhatsApp Business account under the ISV account.
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * The fallback content.
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * FallBackDuration.
         */
        public Builder fallBackDuration(Integer fallBackDuration) {
            this.putBodyParameter("FallBackDuration", fallBackDuration);
            this.fallBackDuration = fallBackDuration;
            return this;
        }

        /**
         * The ID of the fallback strategy.
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * The fallback rule.
         * <p>
         * 
         * >  Valid values:
         * 
         * *   undelivered: A fallback is triggered if the WhatsApp message is not delivered to clients. When the WhatsApp message is being sent, the template parameters are verified. If the parameters fail to pass the verification, the message fails to be sent. Whether the template and phone number are prohibited is not verified. By default, this value is used when FallBackRule is left empty.
         * 
         * *   sentfailed: A fallback is triggered even if the template parameters including variables fail to pass the verification. If the channelType, type, messageType, to, and from parameters fail to pass the verification, a fallback is not triggered.
         */
        public Builder fallBackRule(String fallBackRule) {
            this.putBodyParameter("FallBackRule", fallBackRule);
            this.fallBackRule = fallBackRule;
            return this;
        }

        /**
         * The phone number of the message sender.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ISV verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The message type when the ChannelType parameter is set to viber. Valid values: promotion and transaction.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * The language. For more information about language codes, see [Language codes](~~463420~~).
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The phone numbers to which the message is sent.
         */
        public Builder senderList(java.util.List < SenderList> senderList) {
            String senderListShrink = shrink(senderList, "SenderList", "json");
            this.putBodyParameter("SenderList", senderListShrink);
            this.senderList = senderList;
            return this;
        }

        /**
         * The tag information when the ChannelType parameter is set to viber.
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
         * The encoding of the message template.
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
         * The timeout period for sending messages when the ChannelType parameter is set to viber. Valid values: 30 to 1209600. Unit: seconds.
         */
        public Builder ttl(Long ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public SendChatappMassMessageRequest build() {
            return new SendChatappMassMessageRequest(this);
        } 

    } 

    public static class FlowAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowActionData")
        private java.util.Map < String, String > flowActionData;

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
             * FlowActionData.
             */
            public Builder flowActionData(java.util.Map < String, String > flowActionData) {
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
        @com.aliyun.core.annotation.NameInMap("ProductItems")
        private java.util.List < ProductItems> productItems;

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
        @com.aliyun.core.annotation.NameInMap("Sections")
        private java.util.List < Sections> sections;

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
             * The products. Up to 30 products and 10 categories can be added.
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
    public static class SenderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowAction")
        private FlowAction flowAction;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private java.util.List < String > payload;

        @com.aliyun.core.annotation.NameInMap("ProductAction")
        private ProductAction productAction;

        @com.aliyun.core.annotation.NameInMap("TemplateParams")
        private java.util.Map < String, String > templateParams;

        @com.aliyun.core.annotation.NameInMap("To")
        @com.aliyun.core.annotation.Validation(required = true)
        private String to;

        private SenderList(Builder builder) {
            this.flowAction = builder.flowAction;
            this.payload = builder.payload;
            this.productAction = builder.productAction;
            this.templateParams = builder.templateParams;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SenderList create() {
            return builder().build();
        }

        /**
         * @return flowAction
         */
        public FlowAction getFlowAction() {
            return this.flowAction;
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

        public static final class Builder {
            private FlowAction flowAction; 
            private java.util.List < String > payload; 
            private ProductAction productAction; 
            private java.util.Map < String, String > templateParams; 
            private String to; 

            /**
             * FlowAction.
             */
            public Builder flowAction(FlowAction flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * The payload.
             */
            public Builder payload(java.util.List < String > payload) {
                this.payload = payload;
                return this;
            }

            /**
             * The information about the product.
             */
            public Builder productAction(ProductAction productAction) {
                this.productAction = productAction;
                return this;
            }

            /**
             * The parameters of the template.
             */
            public Builder templateParams(java.util.Map < String, String > templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * The phone number to which the message is sent.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public SenderList build() {
                return new SenderList(this);
            } 

        } 

    }
}
