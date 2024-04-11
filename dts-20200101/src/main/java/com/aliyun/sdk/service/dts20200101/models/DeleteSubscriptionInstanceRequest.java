// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubscriptionInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubscriptionInstanceRequest</p>
 */
public class DeleteSubscriptionInstanceRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    private DeleteSubscriptionInstanceRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubscriptionInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteSubscriptionInstanceRequest, Builder> {
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubscriptionInstanceRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
        } 

        /**
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        @Override
        public DeleteSubscriptionInstanceRequest build() {
            return new DeleteSubscriptionInstanceRequest(this);
        } 

    } 

}
