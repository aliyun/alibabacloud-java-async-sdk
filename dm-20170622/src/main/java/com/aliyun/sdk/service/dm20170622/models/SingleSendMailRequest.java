// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendMailRequest} extends {@link RequestModel}
 *
 * <p>SingleSendMailRequest</p>
 */
public class SingleSendMailRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AddressType")
    @Validation(required = true, maximum = 1)
    private Integer addressType;

    @Query
    @NameInMap("ClickTrace")
    private String clickTrace;

    @Query
    @NameInMap("FromAlias")
    private String fromAlias;

    @Query
    @NameInMap("HtmlBody")
    private String htmlBody;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReplyAddress")
    private String replyAddress;

    @Query
    @NameInMap("ReplyAddressAlias")
    private String replyAddressAlias;

    @Query
    @NameInMap("ReplyToAddress")
    @Validation(required = true)
    private Boolean replyToAddress;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Subject")
    @Validation(required = true)
    private String subject;

    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("TextBody")
    private String textBody;

    @Query
    @NameInMap("ToAddress")
    @Validation(required = true)
    private String toAddress;

    private SingleSendMailRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.addressType = builder.addressType;
        this.clickTrace = builder.clickTrace;
        this.fromAlias = builder.fromAlias;
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

    public static final class Builder extends Request.Builder<SingleSendMailRequest, Builder> {
        private String accountName; 
        private Integer addressType; 
        private String clickTrace; 
        private String fromAlias; 
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

        private Builder() {
            super();
        } 

        private Builder(SingleSendMailRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.addressType = request.addressType;
            this.clickTrace = request.clickTrace;
            this.fromAlias = request.fromAlias;
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
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AddressType.
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
         * ReplyToAddress.
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
         * Subject.
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
         * ToAddress.
         */
        public Builder toAddress(String toAddress) {
            this.putQueryParameter("ToAddress", toAddress);
            this.toAddress = toAddress;
            return this;
        }

        @Override
        public SingleSendMailRequest build() {
            return new SingleSendMailRequest(this);
        } 

    } 

}
