// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionMappingRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionMappingRequest</p>
 */
public class ModifySubscriptionMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapping;

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
    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionId;

    private ModifySubscriptionMappingRequest(Builder builder) {
        super(builder);
        this.mapping = builder.mapping;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySubscriptionMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mapping
     */
    public String getMapping() {
        return this.mapping;
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
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public static final class Builder extends Request.Builder<ModifySubscriptionMappingRequest, Builder> {
        private String mapping; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySubscriptionMappingRequest request) {
            super(request);
            this.mapping = request.mapping;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subscriptionId = request.subscriptionId;
        } 

        /**
         * Mapping.
         */
        public Builder mapping(String mapping) {
            this.putQueryParameter("Mapping", mapping);
            this.mapping = mapping;
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

        /**
         * SubscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.putQueryParameter("SubscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        @Override
        public ModifySubscriptionMappingRequest build() {
            return new ModifySubscriptionMappingRequest(this);
        } 

    } 

}
