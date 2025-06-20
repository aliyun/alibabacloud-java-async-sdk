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
 * {@link DeleteDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeliveryChannelRequest</p>
 */
public class DeleteDeliveryChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryChannelId;

    private DeleteDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.deliveryChannelId = builder.deliveryChannelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeliveryChannelRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDeliveryChannelRequest, Builder> {
        private String deliveryChannelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeliveryChannelRequest request) {
            super(request);
            this.deliveryChannelId = request.deliveryChannelId;
        } 

        /**
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
        public DeleteDeliveryChannelRequest build() {
            return new DeleteDeliveryChannelRequest(this);
        } 

    } 

}
