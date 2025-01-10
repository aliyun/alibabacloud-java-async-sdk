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
 * {@link SingleSendMailRequest} extends {@link RequestModel}
 *
 * <p>SingleSendMailRequest</p>
 */
public class SingleSendMailRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FromAlias")
    private String fromAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private String headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HtmlBody")
    private String htmlBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyAddress")
    private String replyAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyAddressAlias")
    private String replyAddressAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyToAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean replyToAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextBody")
    private String textBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnSubscribeFilterLevel")
    private String unSubscribeFilterLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnSubscribeLinkType")
    private String unSubscribeLinkType;

    private SingleSendMailRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.addressType = builder.addressType;
        this.clickTrace = builder.clickTrace;
        this.fromAlias = builder.fromAlias;
        this.headers = builder.headers;
        this.htmlBody = builder.htmlBody;
        this.ownerId = builder.ownerId;
        this.replyAddress = builder.replyAddress;
        this.replyAddressAlias = builder.replyAddressAlias;
        this.replyToAddress = builder.replyToAddress;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subject = builder.subject;
        this.tagName = builder.tagName;
        this.textBody = builder.textBody;
        this.toAddress = builder.toAddress;
        this.unSubscribeFilterLevel = builder.unSubscribeFilterLevel;
        this.unSubscribeLinkType = builder.unSubscribeLinkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleSendMailRequest create() {
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
     * @return fromAlias
     */
    public String getFromAlias() {
        return this.fromAlias;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return htmlBody
     */
    public String getHtmlBody() {
        return this.htmlBody;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return replyToAddress
     */
    public Boolean getReplyToAddress() {
        return this.replyToAddress;
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
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return textBody
     */
    public String getTextBody() {
        return this.textBody;
    }

    /**
     * @return toAddress
     */
    public String getToAddress() {
        return this.toAddress;
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

    public static final class Builder extends Request.Builder<SingleSendMailRequest, Builder> {
        private String accountName; 
        private Integer addressType; 
        private String clickTrace; 
        private String fromAlias; 
        private String headers; 
        private String htmlBody; 
        private Long ownerId; 
        private String replyAddress; 
        private String replyAddressAlias; 
        private Boolean replyToAddress; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subject; 
        private String tagName; 
        private String textBody; 
        private String toAddress; 
        private String unSubscribeFilterLevel; 
        private String unSubscribeLinkType; 

        private Builder() {
            super();
        } 

        private Builder(SingleSendMailRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.addressType = request.addressType;
            this.clickTrace = request.clickTrace;
            this.fromAlias = request.fromAlias;
            this.headers = request.headers;
            this.htmlBody = request.htmlBody;
            this.ownerId = request.ownerId;
            this.replyAddress = request.replyAddress;
            this.replyAddressAlias = request.replyAddressAlias;
            this.replyToAddress = request.replyToAddress;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subject = request.subject;
            this.tagName = request.tagName;
            this.textBody = request.textBody;
            this.toAddress = request.toAddress;
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
         * FromAlias.
         */
        public Builder fromAlias(String fromAlias) {
            this.putQueryParameter("FromAlias", fromAlias);
            this.fromAlias = fromAlias;
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
         * HtmlBody.
         */
        public Builder htmlBody(String htmlBody) {
            this.putQueryParameter("HtmlBody", htmlBody);
            this.htmlBody = htmlBody;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder replyToAddress(Boolean replyToAddress) {
            this.putQueryParameter("ReplyToAddress", replyToAddress);
            this.replyToAddress = replyToAddress;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subject</p>
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
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
         * TextBody.
         */
        public Builder textBody(String textBody) {
            this.putQueryParameter("TextBody", textBody);
            this.textBody = textBody;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test1@example.com">test1@example.com</a></p>
         */
        public Builder toAddress(String toAddress) {
            this.putQueryParameter("ToAddress", toAddress);
            this.toAddress = toAddress;
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
        public SingleSendMailRequest build() {
            return new SingleSendMailRequest(this);
        } 

    } 

}
