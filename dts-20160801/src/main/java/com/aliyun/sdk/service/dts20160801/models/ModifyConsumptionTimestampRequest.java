// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

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
    @NameInMap("ConsumptionTimestamp")
    @Validation(required = true)
    private String consumptionTimestamp;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SubscriptionInstanceId")
    @Validation(required = true)
    private String subscriptionInstanceId;

    private ModifyConsumptionTimestampRequest(Builder builder) {
        super(builder);
        this.consumptionTimestamp = builder.consumptionTimestamp;
        this.ownerId = builder.ownerId;
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
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyConsumptionTimestampRequest, Builder> {
        private String consumptionTimestamp; 
        private String ownerId; 
        private String subscriptionInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyConsumptionTimestampRequest request) {
            super(request);
            this.consumptionTimestamp = request.consumptionTimestamp;
            this.ownerId = request.ownerId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
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
