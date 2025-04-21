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
    private java.util.List<SenderList> senderList;

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
    public java.util.List<SenderList> getSenderList() {
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
        private java.util.List<SenderList> senderList; 
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
         * <p>The type of the channel. Valid values:</p>
         * <ul>
         * <li><strong>whatsapp</strong></li>
         * <li><strong>viber</strong></li>
         * <li><strong>line</strong> (under development)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>whatsapp</p>
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The space ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>28251486512358****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The WhatsApp Business Account (WABA) ID of the RAM user within the independent software vendor (ISV) account.</p>
         * <blockquote>
         * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65921621816****</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The content of the fallback message.</p>
         * 
         * <strong>example:</strong>
         * <p>Fallback message</p>
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * <p>Specifies the period of time after which the fallback message is sent if the message receipt that indicates the message is delivered to clients is not received. If this parameter is left empty, the fallback message is sent only when the message fails to be sent or the message receipt that indicates the message is not delivered to clients is received. Unit: seconds. Valid values: 60 to 43200.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder fallBackDuration(Integer fallBackDuration) {
            this.putBodyParameter("FallBackDuration", fallBackDuration);
            this.fallBackDuration = fallBackDuration;
            return this;
        }

        /**
         * <p>The ID of the fallback policy.</p>
         * 
         * <strong>example:</strong>
         * <p>S00001</p>
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * <p>The fallback rule. Valid values:</p>
         * <ul>
         * <li><strong>undelivered</strong>: A fallback is triggered if the message is not delivered to clients. When the message is being sent, the template parameters are verified. If the parameters fail to pass the verification, the message fails to be sent. Whether the template and phone number are prohibited is not verified. By default, this value is used when FallBackRule is left empty.</li>
         * <li><strong>sentFailed</strong>: A fallback is triggered even if the template parameters including variables fail to pass the verification. If the channelType, type, messageType, to, and from parameters fail to pass the verification, a fallback is not triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>undelivered</p>
         */
        public Builder fallBackRule(String fallBackRule) {
            this.putBodyParameter("FallBackRule", fallBackRule);
            this.fallBackRule = fallBackRule;
            return this;
        }

        /**
         * <p>The mobile phone number of the message sender.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861387777****</p>
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ISV verification code. This parameter is used to verify whether the RAM user is authorized by the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikdkkdk</p>
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The type of the Viber message. Valid values:</p>
         * <ul>
         * <li><strong>promotion</strong></li>
         * <li><strong>transaction</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The language. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The mobile phone numbers of the message receivers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder senderList(java.util.List<SenderList> senderList) {
            String senderListShrink = shrink(senderList, "SenderList", "json");
            this.putBodyParameter("SenderList", senderListShrink);
            this.senderList = senderList;
            return this;
        }

        /**
         * <p>The tag information when the ChannelType parameter is set to viber.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>744c4b5c79c9432497a075bdfca36bf5</p>
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The timeout period for sending messages when the ChannelType parameter is set to viber. Valid values: 30 to 1209600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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

    /**
     * 
     * {@link SendChatappMassMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMassMessageRequest</p>
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
             * <p>The default parameter of the Flow.</p>
             */
            public Builder flowActionData(java.util.Map<String, ?> flowActionData) {
                this.flowActionData = flowActionData;
                return this;
            }

            /**
             * <p>The information about the Flow token.</p>
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
     * {@link SendChatappMassMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMassMessageRequest</p>
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
             * <p>The retailer ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>ksi399d8</p>
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
     * {@link SendChatappMassMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMassMessageRequest</p>
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
             * <p>The products.</p>
             */
            public Builder productItems(java.util.List<ProductItems> productItems) {
                this.productItems = productItems;
                return this;
            }

            /**
             * <p>The name of the category.</p>
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
     * {@link SendChatappMassMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMassMessageRequest</p>
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
             * <p>The products. Up to 30 products and 10 categories can be added.</p>
             */
            public Builder sections(java.util.List<Sections> sections) {
                this.sections = sections;
                return this;
            }

            /**
             * <p>The retailer ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>skkks999393</p>
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
    /**
     * 
     * {@link SendChatappMassMessageRequest} extends {@link TeaModel}
     *
     * <p>SendChatappMassMessageRequest</p>
     */
    public static class SenderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowAction")
        private FlowAction flowAction;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private java.util.List<String> payload;

        @com.aliyun.core.annotation.NameInMap("ProductAction")
        private ProductAction productAction;

        @com.aliyun.core.annotation.NameInMap("TemplateParams")
        private java.util.Map<String, String> templateParams;

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

        public static final class Builder {
            private FlowAction flowAction; 
            private java.util.List<String> payload; 
            private ProductAction productAction; 
            private java.util.Map<String, String> templateParams; 
            private String to; 

            private Builder() {
            } 

            private Builder(SenderList model) {
                this.flowAction = model.flowAction;
                this.payload = model.payload;
                this.productAction = model.productAction;
                this.templateParams = model.templateParams;
                this.to = model.to;
            } 

            /**
             * <p>The Flow action.</p>
             */
            public Builder flowAction(FlowAction flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * <p>The payload of the button.</p>
             */
            public Builder payload(java.util.List<String> payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The information about the product.</p>
             */
            public Builder productAction(ProductAction productAction) {
                this.productAction = productAction;
                return this;
            }

            /**
             * <p>The parameters of the template.</p>
             */
            public Builder templateParams(java.util.Map<String, String> templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * <p>The mobile phone number of the message receiver.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>861388988****</p>
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
