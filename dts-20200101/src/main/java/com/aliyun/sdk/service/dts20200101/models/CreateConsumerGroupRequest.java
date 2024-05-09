// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerGroupRequest</p>
 */
public class CreateConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceId;

    private CreateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.consumerGroupName = builder.consumerGroupName;
        this.consumerGroupPassword = builder.consumerGroupPassword;
        this.consumerGroupUserName = builder.consumerGroupUserName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerGroupRequest create() {
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
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * @return consumerGroupPassword
     */
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    /**
     * @return consumerGroupUserName
     */
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
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

    public static final class Builder extends Request.Builder<CreateConsumerGroupRequest, Builder> {
        private String accountId; 
        private String consumerGroupName; 
        private String consumerGroupPassword; 
        private String consumerGroupUserName; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerGroupRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.consumerGroupName = request.consumerGroupName;
            this.consumerGroupPassword = request.consumerGroupPassword;
            this.consumerGroupUserName = request.consumerGroupUserName;
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
         * The name of the consumer group. The name cannot exceed 128 characters in length. We recommend that you use an informative name for easy identification.
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * The password that corresponds to the username of the consumer group.
         * <p>
         * 
         * *   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
         * *   A password must be 8 to 32 characters in length.
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * The username of the consumer group.
         * <p>
         * 
         * *   A username must contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (\_).
         * *   A username cannot exceed 16 characters in length.
         */
        public Builder consumerGroupUserName(String consumerGroupUserName) {
            this.putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
            this.consumerGroupUserName = consumerGroupUserName;
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
        public CreateConsumerGroupRequest build() {
            return new CreateConsumerGroupRequest(this);
        } 

    } 

}
