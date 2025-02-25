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
 * {@link ListAggregateConfigDeliveryChannelsRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateConfigDeliveryChannelsRequest</p>
 */
public class ListAggregateConfigDeliveryChannelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelIds")
    private String deliveryChannelIds;

    private ListAggregateConfigDeliveryChannelsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.deliveryChannelIds = builder.deliveryChannelIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigDeliveryChannelsRequest create() {
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
     * @return deliveryChannelIds
     */
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

    public static final class Builder extends Request.Builder<ListAggregateConfigDeliveryChannelsRequest, Builder> {
        private String aggregatorId; 
        private String deliveryChannelIds; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateConfigDeliveryChannelsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.deliveryChannelIds = request.deliveryChannelIds;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a4e5626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The IDs of the delivery channels. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-d9106457e0d900b1****</p>
         */
        public Builder deliveryChannelIds(String deliveryChannelIds) {
            this.putQueryParameter("DeliveryChannelIds", deliveryChannelIds);
            this.deliveryChannelIds = deliveryChannelIds;
            return this;
        }

        @Override
        public ListAggregateConfigDeliveryChannelsRequest build() {
            return new ListAggregateConfigDeliveryChannelsRequest(this);
        } 

    } 

}
