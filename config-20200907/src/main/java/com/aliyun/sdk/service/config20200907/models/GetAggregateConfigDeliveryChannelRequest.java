// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateConfigDeliveryChannelRequest</p>
 */
public class GetAggregateConfigDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    private GetAggregateConfigDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigDeliveryChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return deliveryChannelId
     */
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public static final class Builder extends Request.Builder<GetAggregateConfigDeliveryChannelRequest, Builder> {
        private String aggregatorId; 
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateConfigDeliveryChannelRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the delivery channel.
         * <p>
         * 
         * For more information about how to obtain the ID of a delivery channel, see [ListAggregateConfigDeliveryChannels](~~429842~~).
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        @Override
        public GetAggregateConfigDeliveryChannelRequest build() {
            return new GetAggregateConfigDeliveryChannelRequest(this);
        } 

    } 

}
