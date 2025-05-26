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
    @com.aliyun.core.annotation.NameInMap("Headers")
    private String headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiversName")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
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
        this.headers = builder.headers;
        this.ownerId = builder.ownerId;
        this.receiversName = builder.receiversName;
        this.replyAddress = builder.replyAddress;
        this.replyAddressAlias = builder.replyAddressAlias;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagName = builder.tagName;
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
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private String headers; 
        private Long ownerId; 
        private String receiversName; 
        private String replyAddress; 
        private String replyAddressAlias; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tagName; 
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
            this.headers = request.headers;
            this.ownerId = request.ownerId;
            this.receiversName = request.receiversName;
            this.replyAddress = request.replyAddress;
            this.replyAddressAlias = request.replyAddressAlias;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagName = request.tagName;
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
         * <p>Currently, the standard fields that can be added to the email header are Message-ID, List-Unsubscribe, and List-Unsubscribe-Post. Standard fields will overwrite the existing values in the email header, while non-standard fields need to start with X-User- and will be appended to the email header. Currently, up to 10 headers can be passed in JSON format, and both standard and non-standard fields must comply with the syntax requirements for headers.</p>
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the recipient list that has been created and uploaded. Note: The recipient list should not be deleted until at least 10 minutes after the task is triggered, otherwise it may cause sending failure.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of a pre-created and approved template.</p>
         * <p>This parameter is required.</p>
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
         * <p>Filter level. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
         * <ul>
         * <li>disabled: No filtering</li>
         * <li>default: Use the default strategy, bulk addresses use sender address level filtering</li>
         * <li>mailfrom: Sender address level filtering</li>
         * <li>mailfrom_domain: Sender domain level filtering</li>
         * <li>edm_id: Account level filtering</li>
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
         * <p>Type of generated unsubscribe link. Refer to the <a href="https://help.aliyun.com/document_detail/2689048.html">Unsubscribe Function Link Generation and Filtering Mechanism</a> document.</p>
         * <ul>
         * <li>disabled: Not generated</li>
         * <li>default: Use the default strategy: Generate an unsubscribe link when sending from a bulk email address to specific domains, such as those containing keywords like &quot;gmail&quot;, &quot;yahoo&quot;,
         * &quot;google&quot;, &quot;aol.com&quot;, &quot;hotmail&quot;,
         * &quot;outlook&quot;, &quot;ymail.com&quot;, etc.</li>
         * <li>zh-cn: Generated, for future content preparation</li>
         * <li>en-us: Generated, for future content preparation</li>
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

}
