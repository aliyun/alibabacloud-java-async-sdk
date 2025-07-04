// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link GetMultiAccountDeliveryChannelStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetMultiAccountDeliveryChannelStatisticsRequest</p>
 */
public class GetMultiAccountDeliveryChannelStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    private GetMultiAccountDeliveryChannelStatisticsRequest(Builder builder) {
        super(builder);
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountDeliveryChannelStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannelId
     */
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public static final class Builder extends Request.Builder<GetMultiAccountDeliveryChannelStatisticsRequest, Builder> {
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(GetMultiAccountDeliveryChannelStatisticsRequest request) {
            super(request);
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
         * <p>The ID of the delivery channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-6q79dm4o9***</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        @Override
        public GetMultiAccountDeliveryChannelStatisticsRequest build() {
            return new GetMultiAccountDeliveryChannelStatisticsRequest(this);
        } 

    } 

}
