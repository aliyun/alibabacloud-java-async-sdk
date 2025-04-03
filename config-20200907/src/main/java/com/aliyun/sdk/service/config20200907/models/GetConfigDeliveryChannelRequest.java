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
 * {@link GetConfigDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>GetConfigDeliveryChannelRequest</p>
 */
public class GetConfigDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    private GetConfigDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<GetConfigDeliveryChannelRequest, Builder> {
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigDeliveryChannelRequest request) {
            super(request);
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
         * <p>The ID of the delivery channel.</p>
         * <p>For more information about how to obtain the ID of a delivery channel, see <a href="https://help.aliyun.com/document_detail/429841.html">DescribeDeliveryChannels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-d9106457e0d900b1****</p>
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putQueryParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        @Override
        public GetConfigDeliveryChannelRequest build() {
            return new GetConfigDeliveryChannelRequest(this);
        } 

    } 

}
