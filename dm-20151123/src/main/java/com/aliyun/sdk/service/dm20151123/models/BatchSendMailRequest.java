// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link BatchSendMailRequest} extends {@link RequestModel}
 *
 * <p>BatchSendMailRequest</p>
 */
public class BatchSendMailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
    private Integer addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClickTrace")
    private String clickTrace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainAuth")
    private Boolean domainAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private String headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPoolId")
    private String ipPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Receivers")
    private java.util.List<Receivers> receivers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiversName")
    private String receiversName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyAddress")
    private String replyAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyAddressAlias")
    private String replyAddressAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private TemplateContent templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnSubscribeFilterLevel")
    private String unSubscribeFilterLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnSubscribeLinkType")
    private String unSubscribeLinkType;

    private BatchSendMailRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.addressType = builder.addressType;
        this.clickTrace = builder.clickTrace;
        this.domainAuth = builder.domainAuth;
        this.headers = builder.headers;
        this.ipPoolId = builder.ipPoolId;
        this.ownerId = builder.ownerId;
        this.receivers = builder.receivers;
        this.receiversName = builder.receiversName;
        this.replyAddress = builder.replyAddress;
        this.replyAddressAlias = builder.replyAddressAlias;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagName = builder.tagName;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.unSubscribeFilterLevel = builder.unSubscribeFilterLevel;
        this.unSubscribeLinkType = builder.unSubscribeLinkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return addressType
     */
    public Integer getAddressType() {
        return this.addressType;
    }

    /**
     * @return clickTrace
     */
    public String getClickTrace() {
        return this.clickTrace;
    }

    /**
     * @return domainAuth
     */
    public Boolean getDomainAuth() {
        return this.domainAuth;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return ipPoolId
     */
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return receivers
     */
    public java.util.List<Receivers> getReceivers() {
        return this.receivers;
    }

    /**
     * @return receiversName
     */
    public String getReceiversName() {
        return this.receiversName;
    }

    /**
     * @return replyAddress
     */
    public String getReplyAddress() {
        return this.replyAddress;
    }

    /**
     * @return replyAddressAlias
     */
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
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
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return templateContent
     */
    public TemplateContent getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return unSubscribeFilterLevel
     */
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    /**
     * @return unSubscribeLinkType
     */
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

    public static final class Builder extends Request.Builder<BatchSendMailRequest, Builder> {
        private String accountName; 
        private Integer addressType; 
        private String clickTrace; 
        private Boolean domainAuth; 
        private String headers; 
        private String ipPoolId; 
        private Long ownerId; 
        private java.util.List<Receivers> receivers; 
        private String receiversName; 
        private String replyAddress; 
        private String replyAddressAlias; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tagName; 
        private TemplateContent templateContent; 
        private String templateName; 
        private String unSubscribeFilterLevel; 
        private String unSubscribeLinkType; 

        private Builder() {
            super();
        } 

        private Builder(BatchSendMailRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.addressType = request.addressType;
            this.clickTrace = request.clickTrace;
            this.domainAuth = request.domainAuth;
            this.headers = request.headers;
            this.ipPoolId = request.ipPoolId;
            this.ownerId = request.ownerId;
            this.receivers = request.receivers;
            this.receiversName = request.receiversName;
            this.replyAddress = request.replyAddress;
            this.replyAddressAlias = request.replyAddressAlias;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagName = request.tagName;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.unSubscribeFilterLevel = request.unSubscribeFilterLevel;
            this.unSubscribeLinkType = request.unSubscribeLinkType;
        } 

        /**
         * <p>The sending address configured in the management console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.com">test@example.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <ul>
         * <li>0: Random account</li>
         * <li>1: Sending address</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addressType(Integer addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <ul>
         * <li>1: Enable data tracking function</li>
         * <li>0 (default): Disable data tracking function</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder clickTrace(String clickTrace) {
            this.putQueryParameter("ClickTrace", clickTrace);
            this.clickTrace = clickTrace;
            return this;
        }

        /**
         * DomainAuth.
         */
        public Builder domainAuth(Boolean domainAuth) {
            this.putQueryParameter("DomainAuth", domainAuth);
            this.domainAuth = domainAuth;
            return this;
        }

        /**
         * <p>Currently, the standard fields that can be added to the email header are Message-ID, List-Unsubscribe, and List-Unsubscribe-Post. Standard fields will overwrite the existing values in the email header, while non-standard fields must start with X-User- and will be appended to the email header. Currently, up to 10 headers can be passed in JSON format, and both standard and non-standard fields must comply with the syntax requirements for headers.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Message-ID&quot;: &quot;<a href="mailto:msg0001@example.com">msg0001@example.com</a>&quot;,
         *   &quot;X-User-UID1&quot;: &quot;UID-1-000001&quot;,
         *   &quot;X-User-UID2&quot;: &quot;UID-2-000001&quot;
         * }</p>
         */
        public Builder headers(String headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * <p>dedicated IP pool ID. Users who have purchased an dedicated IP can use this parameter to specify the outgoing IP for this send operation.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder ipPoolId(String ipPoolId) {
            this.putQueryParameter("IpPoolId", ipPoolId);
            this.ipPoolId = ipPoolId;
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
         * Receivers.
         */
        public Builder receivers(java.util.List<Receivers> receivers) {
            String receiversShrink = shrink(receivers, "Receivers", "json");
            this.putBodyParameter("Receivers", receiversShrink);
            this.receivers = receivers;
            return this;
        }

        /**
         * <p>The name of the recipient list that has been created and uploaded with recipients. Note: The recipient list should not be deleted until at least 10 minutes after the task is triggered, otherwise it may cause sending failure.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        public Builder receiversName(String receiversName) {
            this.putQueryParameter("ReceiversName", receiversName);
            this.receiversName = receiversName;
            return this;
        }

        /**
         * <p>Reply address</p>
         * 
         * <strong>example:</strong>
         * <p>test2***@example.net</p>
         */
        public Builder replyAddress(String replyAddress) {
            this.putQueryParameter("ReplyAddress", replyAddress);
            this.replyAddress = replyAddress;
            return this;
        }

        /**
         * <p>Alias for the reply address</p>
         * 
         * <strong>example:</strong>
         * <p>Lucy</p>
         */
        public Builder replyAddressAlias(String replyAddressAlias) {
            this.putQueryParameter("ReplyAddressAlias", replyAddressAlias);
            this.replyAddressAlias = replyAddressAlias;
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
         * <p>Email tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>test3</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(TemplateContent templateContent) {
            String templateContentShrink = shrink(templateContent, "TemplateContent", "json");
            this.putBodyParameter("TemplateContent", templateContentShrink);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>The name of the template that has been created and approved in advance.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Filtering level. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
         * <ul>
         * <li>disabled: No filtering</li>
         * <li>default: Use the default strategy, bulk addresses use sender address-level filtering</li>
         * <li>mailfrom: Sender address-level filtering</li>
         * <li>mailfrom_domain: Sender domain-level filtering</li>
         * <li>edm_id: Account-level filtering</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mailfrom_domain</p>
         */
        public Builder unSubscribeFilterLevel(String unSubscribeFilterLevel) {
            this.putQueryParameter("UnSubscribeFilterLevel", unSubscribeFilterLevel);
            this.unSubscribeFilterLevel = unSubscribeFilterLevel;
            return this;
        }

        /**
         * <p>The type of generated unsubscribe link. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
         * <ul>
         * <li>disabled: Do not generate</li>
         * <li>default: Use the default strategy: Generate an unsubscribe link when a bulk-type sending address sends to specific domains, such as those containing keywords like &quot;gmail&quot;, &quot;yahoo&quot;,
         * &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,
         * &quot;outlook&quot;, &quot;ymail.com&quot;, etc.</li>
         * <li>zh-cn: Generate, for future content preparation</li>
         * <li>en-us: Generate, for future content preparation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder unSubscribeLinkType(String unSubscribeLinkType) {
            this.putQueryParameter("UnSubscribeLinkType", unSubscribeLinkType);
            this.unSubscribeLinkType = unSubscribeLinkType;
            return this;
        }

        @Override
        public BatchSendMailRequest build() {
            return new BatchSendMailRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchSendMailRequest} extends {@link TeaModel}
     *
     * <p>BatchSendMailRequest</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateData")
        private java.util.Map<String, String> templateData;

        @com.aliyun.core.annotation.NameInMap("To")
        private java.util.List<String> to;

        private Receivers(Builder builder) {
            this.templateData = builder.templateData;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
        }

        /**
         * @return templateData
         */
        public java.util.Map<String, String> getTemplateData() {
            return this.templateData;
        }

        /**
         * @return to
         */
        public java.util.List<String> getTo() {
            return this.to;
        }

        public static final class Builder {
            private java.util.Map<String, String> templateData; 
            private java.util.List<String> to; 

            private Builder() {
            } 

            private Builder(Receivers model) {
                this.templateData = model.templateData;
                this.to = model.to;
            } 

            /**
             * TemplateData.
             */
            public Builder templateData(java.util.Map<String, String> templateData) {
                this.templateData = templateData;
                return this;
            }

            /**
             * To.
             */
            public Builder to(java.util.List<String> to) {
                this.to = to;
                return this;
            }

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchSendMailRequest} extends {@link TeaModel}
     *
     * <p>BatchSendMailRequest</p>
     */
    public static class TemplateContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("HtmlBody")
        private String htmlBody;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("TextBody")
        private String textBody;

        private TemplateContent(Builder builder) {
            this.alias = builder.alias;
            this.htmlBody = builder.htmlBody;
            this.subject = builder.subject;
            this.textBody = builder.textBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateContent create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return htmlBody
         */
        public String getHtmlBody() {
            return this.htmlBody;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return textBody
         */
        public String getTextBody() {
            return this.textBody;
        }

        public static final class Builder {
            private String alias; 
            private String htmlBody; 
            private String subject; 
            private String textBody; 

            private Builder() {
            } 

            private Builder(TemplateContent model) {
                this.alias = model.alias;
                this.htmlBody = model.htmlBody;
                this.subject = model.subject;
                this.textBody = model.textBody;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * HtmlBody.
             */
            public Builder htmlBody(String htmlBody) {
                this.htmlBody = htmlBody;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * TextBody.
             */
            public Builder textBody(String textBody) {
                this.textBody = textBody;
                return this;
            }

            public TemplateContent build() {
                return new TemplateContent(this);
            } 

        } 

    }
}
