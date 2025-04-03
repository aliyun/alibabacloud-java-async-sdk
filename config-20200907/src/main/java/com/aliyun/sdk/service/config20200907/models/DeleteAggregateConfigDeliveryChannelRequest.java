// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAggregateConfigDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteAggregateConfigDeliveryChannelRequest</p>
 */
public class DeleteAggregateConfigDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    private DeleteAggregateConfigDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateConfigDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAggregateConfigDeliveryChannelRequest, Builder> {
        private String aggregatorId; 
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAggregateConfigDeliveryChannelRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-23c6626622af0041****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the delivery channel.</p>
         * <p>For more information about how to obtain the ID of a delivery channel, see <a href="https://help.aliyun.com/document_detail/429842.html">ListAggregateConfigDeliveryChannels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-38c3013b46c9002c****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        @Override
        public DeleteAggregateConfigDeliveryChannelRequest build() {
            return new DeleteAggregateConfigDeliveryChannelRequest(this);
        } 

    } 

}
