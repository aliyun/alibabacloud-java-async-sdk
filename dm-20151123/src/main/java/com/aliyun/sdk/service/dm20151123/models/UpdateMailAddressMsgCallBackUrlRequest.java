// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMailAddressMsgCallBackUrlRequest} extends {@link RequestModel}
 *
 * <p>UpdateMailAddressMsgCallBackUrlRequest</p>
 */
public class UpdateMailAddressMsgCallBackUrlRequest extends Request {
    @Query
    @NameInMap("MailFrom")
    @Validation(required = true)
    private String mailFrom;

    @Query
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateMailAddressMsgCallBackUrlRequest(Builder builder) {
        super(builder);
        this.mailFrom = builder.mailFrom;
        this.notifyUrl = builder.notifyUrl;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMailAddressMsgCallBackUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailFrom
     */
    public String getMailFrom() {
        return this.mailFrom;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
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

    public static final class Builder extends Request.Builder<UpdateMailAddressMsgCallBackUrlRequest, Builder> {
        private String mailFrom; 
        private String notifyUrl; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMailAddressMsgCallBackUrlRequest request) {
            super(request);
            this.mailFrom = request.mailFrom;
            this.notifyUrl = request.notifyUrl;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * MailFrom.
         */
        public Builder mailFrom(String mailFrom) {
            this.putQueryParameter("MailFrom", mailFrom);
            this.mailFrom = mailFrom;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
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

        @Override
        public UpdateMailAddressMsgCallBackUrlRequest build() {
            return new UpdateMailAddressMsgCallBackUrlRequest(this);
        } 

    } 

}
