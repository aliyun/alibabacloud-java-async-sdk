// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMailAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateMailAddressRequest</p>
 */
public class CreateMailAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplyAddress")
    private String replyAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sendtype")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendtype;

    private CreateMailAddressRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.ownerId = builder.ownerId;
        this.replyAddress = builder.replyAddress;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendtype = builder.sendtype;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMailAddressRequest create() {
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
     * @return sendtype
     */
    public String getSendtype() {
        return this.sendtype;
    }

    public static final class Builder extends Request.Builder<CreateMailAddressRequest, Builder> {
        private String accountName; 
        private Long ownerId; 
        private String replyAddress; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sendtype; 

        private Builder() {
            super();
        } 

        private Builder(CreateMailAddressRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.ownerId = request.ownerId;
            this.replyAddress = request.replyAddress;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendtype = request.sendtype;
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
         * Sendtype.
         */
        public Builder sendtype(String sendtype) {
            this.putQueryParameter("Sendtype", sendtype);
            this.sendtype = sendtype;
            return this;
        }

        @Override
        public CreateMailAddressRequest build() {
            return new CreateMailAddressRequest(this);
        } 

    } 

}
