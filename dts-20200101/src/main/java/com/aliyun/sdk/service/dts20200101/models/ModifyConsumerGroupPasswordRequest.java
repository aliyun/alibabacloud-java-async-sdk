// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyConsumerGroupPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyConsumerGroupPasswordRequest</p>
 */
public class ModifyConsumerGroupPasswordRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ConsumerGroupID")
    @Validation(required = true)
    private String consumerGroupID;

    @Query
    @NameInMap("ConsumerGroupName")
    private String consumerGroupName;

    @Query
    @NameInMap("ConsumerGroupPassword")
    @Validation(required = true)
    private String consumerGroupPassword;

    @Query
    @NameInMap("ConsumerGroupUserName")
    private String consumerGroupUserName;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    @Query
    @NameInMap("consumerGroupNewPassword")
    @Validation(required = true)
    private String consumerGroupNewPassword;

    private ModifyConsumerGroupPasswordRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.consumerGroupID = builder.consumerGroupID;
        this.consumerGroupName = builder.consumerGroupName;
        this.consumerGroupPassword = builder.consumerGroupPassword;
        this.consumerGroupUserName = builder.consumerGroupUserName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.consumerGroupNewPassword = builder.consumerGroupNewPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumerGroupPasswordRequest create() {
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
     * @return consumerGroupID
     */
    public String getConsumerGroupID() {
        return this.consumerGroupID;
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
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return consumerGroupNewPassword
     */
    public String getConsumerGroupNewPassword() {
        return this.consumerGroupNewPassword;
    }

    public static final class Builder extends Request.Builder<ModifyConsumerGroupPasswordRequest, Builder> {
        private String accountId; 
        private String consumerGroupID; 
        private String consumerGroupName; 
        private String consumerGroupPassword; 
        private String consumerGroupUserName; 
        private String ownerId; 
        private String regionId; 
        private String subscriptionInstanceId; 
        private String consumerGroupNewPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConsumerGroupPasswordRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.consumerGroupID = request.consumerGroupID;
            this.consumerGroupName = request.consumerGroupName;
            this.consumerGroupPassword = request.consumerGroupPassword;
            this.consumerGroupUserName = request.consumerGroupUserName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.consumerGroupNewPassword = request.consumerGroupNewPassword;
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
         * The ID of the consumer group.
         * <p>
         * 
         * You can call the [DescribeConsumerGroup](~~122886~~) operation to query the consumer group ID.
         */
        public Builder consumerGroupID(String consumerGroupID) {
            this.putQueryParameter("ConsumerGroupID", consumerGroupID);
            this.consumerGroupID = consumerGroupID;
            return this;
        }

        /**
         * The name of the consumer group. You can call the [DescribeConsumerGroup](~~122886~~) operation to query the consumer group name.
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * The current password of the consumer group.
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * The username of the consumer group. You can call the [DescribeConsumerGroup](~~122886~~) operation to query the username.
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
         * The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * The new password of the consumer group.
         * <p>
         * 
         * *   A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.
         * *   A password must be 8 to 32 characters in length.
         */
        public Builder consumerGroupNewPassword(String consumerGroupNewPassword) {
            this.putQueryParameter("consumerGroupNewPassword", consumerGroupNewPassword);
            this.consumerGroupNewPassword = consumerGroupNewPassword;
            return this;
        }

        @Override
        public ModifyConsumerGroupPasswordRequest build() {
            return new ModifyConsumerGroupPasswordRequest(this);
        } 

    } 

}
