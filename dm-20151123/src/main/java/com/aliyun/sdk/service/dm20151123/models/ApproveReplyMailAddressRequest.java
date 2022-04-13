// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveReplyMailAddressRequest} extends {@link RequestModel}
 *
 * <p>ApproveReplyMailAddressRequest</p>
 */
public class ApproveReplyMailAddressRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Ticket")
    @Validation(required = true)
    private String ticket;

    private ApproveReplyMailAddressRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveReplyMailAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder extends Request.Builder<ApproveReplyMailAddressRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(ApproveReplyMailAddressRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ticket = request.ticket;
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
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public ApproveReplyMailAddressRequest build() {
            return new ApproveReplyMailAddressRequest(this);
        } 

    } 

}
