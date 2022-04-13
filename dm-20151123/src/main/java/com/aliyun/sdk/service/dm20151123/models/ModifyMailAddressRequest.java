// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMailAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyMailAddressRequest</p>
 */
public class ModifyMailAddressRequest extends Request {
    @Query
    @NameInMap("MailAddressId")
    @Validation(required = true)
    private Integer mailAddressId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("ReplyAddress")
    private String replyAddress;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyMailAddressRequest(Builder builder) {
        super(builder);
        this.mailAddressId = builder.mailAddressId;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.replyAddress = builder.replyAddress;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMailAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailAddressId
     */
    public Integer getMailAddressId() {
        return this.mailAddressId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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

    public static final class Builder extends Request.Builder<ModifyMailAddressRequest, Builder> {
        private Integer mailAddressId; 
        private Long ownerId; 
        private String password; 
        private String replyAddress; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMailAddressRequest request) {
            super(request);
            this.mailAddressId = request.mailAddressId;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.replyAddress = request.replyAddress;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * MailAddressId.
         */
        public Builder mailAddressId(Integer mailAddressId) {
            this.putQueryParameter("MailAddressId", mailAddressId);
            this.mailAddressId = mailAddressId;
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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

        @Override
        public ModifyMailAddressRequest build() {
            return new ModifyMailAddressRequest(this);
        } 

    } 

}
