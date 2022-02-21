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

        private Builder(ModifyConsumerGroupPasswordRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.consumerGroupID = response.consumerGroupID;
            this.consumerGroupName = response.consumerGroupName;
            this.consumerGroupPassword = response.consumerGroupPassword;
            this.consumerGroupUserName = response.consumerGroupUserName;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.subscriptionInstanceId = response.subscriptionInstanceId;
            this.consumerGroupNewPassword = response.consumerGroupNewPassword;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * ConsumerGroupID.
         */
        public Builder consumerGroupID(String consumerGroupID) {
            this.putQueryParameter("ConsumerGroupID", consumerGroupID);
            this.consumerGroupID = consumerGroupID;
            return this;
        }

        /**
         * ConsumerGroupName.
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * ConsumerGroupPassword.
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * ConsumerGroupUserName.
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
         * SubscriptionInstanceId.
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * consumerGroupNewPassword.
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
