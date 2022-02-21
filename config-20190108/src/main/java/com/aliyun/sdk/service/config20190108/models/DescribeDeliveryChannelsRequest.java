// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeliveryChannelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeliveryChannelsRequest</p>
 */
public class DescribeDeliveryChannelsRequest extends Request {
    @Query
    @NameInMap("DeliveryChannelIds")
    private String deliveryChannelIds;

    private DescribeDeliveryChannelsRequest(Builder builder) {
        super(builder);
        this.deliveryChannelIds = builder.deliveryChannelIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeliveryChannelsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDeliveryChannelsRequest, Builder> {
        private String deliveryChannelIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeliveryChannelsRequest response) {
            super(response);
            this.deliveryChannelIds = response.deliveryChannelIds;
        } 

        /**
         * DeliveryChannelIds.
         */
        public Builder deliveryChannelIds(String deliveryChannelIds) {
            this.putQueryParameter("DeliveryChannelIds", deliveryChannelIds);
            this.deliveryChannelIds = deliveryChannelIds;
            return this;
        }

        @Override
        public DescribeDeliveryChannelsRequest build() {
            return new DescribeDeliveryChannelsRequest(this);
        } 

    } 

}
