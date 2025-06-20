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
 * {@link GetDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>GetDeliveryChannelRequest</p>
 */
public class GetDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    private GetDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<GetDeliveryChannelRequest, Builder> {
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeliveryChannelRequest request) {
            super(request);
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
         * DeliveryChannelId.
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        @Override
        public GetDeliveryChannelRequest build() {
            return new GetDeliveryChannelRequest(this);
        } 

    } 

}
