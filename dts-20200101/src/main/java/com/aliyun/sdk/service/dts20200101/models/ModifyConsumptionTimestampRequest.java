// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyConsumptionTimestampRequest} extends {@link RequestModel}
 *
 * <p>ModifyConsumptionTimestampRequest</p>
 */
public class ModifyConsumptionTimestampRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ConsumptionTimestamp")
    @Validation(required = true)
    private String consumptionTimestamp;

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

    private ModifyConsumptionTimestampRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.consumptionTimestamp = builder.consumptionTimestamp;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumptionTimestampRequest create() {
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
     * @return consumptionTimestamp
     */
    public String getConsumptionTimestamp() {
        return this.consumptionTimestamp;
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

    public static final class Builder extends Request.Builder<ModifyConsumptionTimestampRequest, Builder> {
        private String accountId; 
        private String consumptionTimestamp; 
        private String ownerId; 
        private String regionId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConsumptionTimestampRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.consumptionTimestamp = response.consumptionTimestamp;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.subscriptionInstanceId = response.subscriptionInstanceId;
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
         * ConsumptionTimestamp.
         */
        public Builder consumptionTimestamp(String consumptionTimestamp) {
            this.putQueryParameter("ConsumptionTimestamp", consumptionTimestamp);
            this.consumptionTimestamp = consumptionTimestamp;
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

        @Override
        public ModifyConsumptionTimestampRequest build() {
            return new ModifyConsumptionTimestampRequest(this);
        } 

    } 

}
