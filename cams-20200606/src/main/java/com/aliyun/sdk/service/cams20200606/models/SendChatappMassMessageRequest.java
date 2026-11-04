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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelType;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderList")
    private java.util.List<SenderList> senderList;

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
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
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
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.senderList = request.senderList;
            this.tag = request.tag;
            this.taskId = request.taskId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The channel type. Valid values:</p>
         * <ul>
         * <li><p><strong>whatsapp</strong></p>
         * </li>
         * <li><p><strong>messenger</strong></p>
         * </li>
         * <li><p><strong>instagram</strong></p>
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
         * <p>The space ID of the ISV sub-customer, or the instance ID for direct customers. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
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
         * <p>The WABA ID of the ISV customer. This parameter is deprecated. Use CustSpaceId instead, which is the instance ID for direct customers. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> page.</p>
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
         * <p>The custom fallback content. This parameter applies to the international site only and can be ignored on the China site.</p>
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
         * <p>The fallback trigger duration. This parameter applies to the international site only and can be ignored on the China site. &lt;props=&quot;intl&quot;&gt;If no delivery receipt is returned within the specified duration, a fallback is triggered. If this parameter is not set, the fallback is not triggered based on this duration — a fallback occurs only when the message fails to send or a failure status report is received. Unit: seconds. Minimum value: 60. Maximum value: 43200.</p>
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
         * <p>The fallback policy ID. This parameter applies to the international site only and can be ignored on the China site. &lt;props=&quot;intl&quot;&gt;You can view the policy ID on the <a href="https://chatapp.console.alibabacloud.com/FallbackStrategy"><strong>Fallback Policy</strong></a> page.</p>
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
         * <p>The fallback rule. This parameter applies to the international site only and can be ignored on the China site.
         * &lt;props=&quot;intl&quot;&gt;Valid values:
         * &lt;props=&quot;intl&quot;&gt;- <strong>undelivered</strong>: triggers a fallback when the message cannot be delivered to the endpoint. During the sending phase, the template and parameters must pass validation. Checks for blocked templates or blocked phone numbers are not performed. If this parameter is left empty, this rule is used by default.
         * &lt;props=&quot;intl&quot;&gt;- <strong>sentFailed</strong>: triggers a fallback when validation of the template, template variables, or other parameters fails. Only the following parameters are strictly validated: channelType, type, messageType, to, and from (whether they exist).</p>
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
         * <p>The sender\&quot;s phone number.</p>
         * <ul>
         * <li>If ChannelType is <strong>whatsapp</strong>, this is the phone number registered and bound to WhatsApp. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Number Management</strong> page.</li>
         * <li>If ChannelType is <strong>messenger</strong>, this is the Page ID of the public page. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Public Pages</strong> page.</li>
         * <li>If ChannelType is <strong>instagram</strong>, this is the Instagram professional account ID (Account ID). You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Professional Accounts</strong> page.
         * &lt;props=&quot;intl&quot;&gt;- If ChannelType is <strong>viber</strong>, this is the Viber service number ID (Service ID). You can view it on the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Service Number Management</strong> page.</li>
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
         * <p>The ISV verification code used to verify whether a sub-account is authorized by an ISV. This parameter is deprecated and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikd****</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The Viber message type. This parameter applies to the international site only and can be ignored on the China site.
         * &lt;props=&quot;intl&quot;&gt;Valid values:
         * &lt;props=&quot;intl&quot;&gt;- <strong>pormotion</strong>: marketing and promotional messages.
         * &lt;props=&quot;intl&quot;&gt;- <strong>transaction</strong>: notification messages.</p>
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
         * <p>This parameter is required.</p>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>The list of recipient phone numbers.</p>
         */
        public Builder senderList(java.util.List<SenderList> senderList) {
            String senderListShrink = shrink(senderList, "SenderList", "json");
            this.putQueryParameter("SenderList", senderListShrink);
            this.senderList = senderList;
            return this;
        }

        /**
         * <p>The tag information. Specifies a custom tag for Viber messages.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
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
         * <p>The template code. You can view the template code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Template Design</strong> page.</p>
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
         * <p>The template name. You can view the template name on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Template Design</strong> page.</p>
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
         * <p>The timeout period for sending Viber messages. This parameter applies to the international site only and can be ignored on the China site. &lt;props=&quot;intl&quot;&gt;Unit: seconds. Valid values: 30 to 1209600.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        public Builder ttl(Long ttl) {
            this.putQueryParameter("Ttl", ttl);
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
             * <p>The collection of default Flow parameters.</p>
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
             * <p>The product ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
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
             * <p>The list of product information.</p>
             */
            public Builder productItems(java.util.List<ProductItems> productItems) {
                this.productItems = productItems;
                return this;
            }

            /**
             * <p>The category name. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Catalog Management</strong> &gt; <strong>Product Management</strong> page, or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2557786.html">ListProduct</a> operation.</p>
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
             * <p>The list of product categories. A maximum of 10 categories and 30 products are supported.</p>
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

        @com.aliyun.core.annotation.NameInMap("RecipientType")
        private String recipientType;

        @com.aliyun.core.annotation.NameInMap("TemplateParams")
        private java.util.Map<String, String> templateParams;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private SenderList(Builder builder) {
            this.flowAction = builder.flowAction;
            this.payload = builder.payload;
            this.productAction = builder.productAction;
            this.recipientType = builder.recipientType;
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
         * @return recipientType
         */
        public String getRecipientType() {
            return this.recipientType;
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
            private String recipientType; 
            private java.util.Map<String, String> templateParams; 
            private String to; 

            private Builder() {
            } 

            private Builder(SenderList model) {
                this.flowAction = model.flowAction;
                this.payload = model.payload;
                this.productAction = model.productAction;
                this.recipientType = model.recipientType;
                this.templateParams = model.templateParams;
                this.to = model.to;
            } 

            /**
             * <p>The Flow message object.</p>
             */
            public Builder flowAction(FlowAction flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * <p>The list of trigger message identifiers for buttons.</p>
             */
            public Builder payload(java.util.List<String> payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The product information. This parameter applies only to the WhatsApp channel type and represents the product information you uploaded to Meta.</p>
             */
            public Builder productAction(ProductAction productAction) {
                this.productAction = productAction;
                return this;
            }

            /**
             * <p>The recipient type, such as individual.</p>
             * 
             * <strong>example:</strong>
             * <p>individual</p>
             */
            public Builder recipientType(String recipientType) {
                this.recipientType = recipientType;
                return this;
            }

            /**
             * <p>The collection of template parameters.</p>
             */
            public Builder templateParams(java.util.Map<String, String> templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * <p>The recipient\&quot;s phone number.</p>
             * <ul>
             * <li>If ChannelType is <strong>whatsapp</strong>, this is the recipient\&quot;s phone number.</li>
             * <li>If ChannelType is <strong>messenger</strong>, this is the Page-Scoped User ID generated when the user interacts with a Facebook page message.</li>
             * <li>If ChannelType is <strong>instagram</strong>, this is the Instagram User ID generated when the user interacts with an Instagram business account or creator account.
             * &lt;props=&quot;intl&quot;&gt;- If ChannelType is <strong>viber</strong>, this is the recipient\&quot;s phone number.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>861386666****</p>
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
