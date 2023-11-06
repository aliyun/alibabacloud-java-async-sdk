// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigDeliveryChannelsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigDeliveryChannelsRequest</p>
 */
public class ListConfigDeliveryChannelsRequest extends Request {
    @Query
    @NameInMap("DeliveryChannelIds")
    private String deliveryChannelIds;

    private ListConfigDeliveryChannelsRequest(Builder builder) {
        super(builder);
        this.deliveryChannelIds = builder.deliveryChannelIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigDeliveryChannelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannelIds
     */
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

    public static final class Builder extends Request.Builder<ListConfigDeliveryChannelsRequest, Builder> {
        private String deliveryChannelIds; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigDeliveryChannelsRequest request) {
            super(request);
            this.deliveryChannelIds = request.deliveryChannelIds;
        } 

        /**
         * The ID of the delivery channel. Separate multiple IDs with commas (,).
         */
        public Builder deliveryChannelIds(String deliveryChannelIds) {
            this.putQueryParameter("DeliveryChannelIds", deliveryChannelIds);
            this.deliveryChannelIds = deliveryChannelIds;
            return this;
        }

        @Override
        public ListConfigDeliveryChannelsRequest build() {
            return new ListConfigDeliveryChannelsRequest(this);
        } 

    } 

}
