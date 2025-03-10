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
         * ClickTrace.
         */
        public Builder clickTrace(String clickTrace) {
            this.putQueryParameter("ClickTrace", clickTrace);
            this.clickTrace = clickTrace;
            return this;
        }

        /**
         * Headers.
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
         * ReplyAddress.
         */
        public Builder replyAddress(String replyAddress) {
            this.putQueryParameter("ReplyAddress", replyAddress);
            this.replyAddress = replyAddress;
            return this;
        }

        /**
         * ReplyAddressAlias.
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
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
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
         * UnSubscribeFilterLevel.
         */
        public Builder unSubscribeFilterLevel(String unSubscribeFilterLevel) {
            this.putQueryParameter("UnSubscribeFilterLevel", unSubscribeFilterLevel);
            this.unSubscribeFilterLevel = unSubscribeFilterLevel;
            return this;
        }

        /**
         * UnSubscribeLinkType.
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
