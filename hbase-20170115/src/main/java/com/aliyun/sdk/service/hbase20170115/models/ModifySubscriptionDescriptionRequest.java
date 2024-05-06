// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionDescriptionRequest</p>
 */
public class ModifySubscriptionDescriptionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SubscriptionDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionId;

    private ModifySubscriptionDescriptionRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subscriptionDescription = builder.subscriptionDescription;
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySubscriptionDescriptionRequest create() {
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
     * @return subscriptionDescription
     */
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public static final class Builder extends Request.Builder<ModifySubscriptionDescriptionRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subscriptionDescription; 
        private String subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySubscriptionDescriptionRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subscriptionDescription = request.subscriptionDescription;
            this.subscriptionId = request.subscriptionId;
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
         * SubscriptionDescription.
         */
        public Builder subscriptionDescription(String subscriptionDescription) {
            this.putQueryParameter("SubscriptionDescription", subscriptionDescription);
            this.subscriptionDescription = subscriptionDescription;
            return this;
        }

        /**
         * SubscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.putQueryParameter("SubscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        @Override
        public ModifySubscriptionDescriptionRequest build() {
            return new ModifySubscriptionDescriptionRequest(this);
        } 

    } 

}
