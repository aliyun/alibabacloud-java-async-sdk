// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link SubscribeProductRequest} extends {@link RequestModel}
 *
 * <p>SubscribeProductRequest</p>
 */
public class SubscribeProductRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    private SubscribeProductRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<SubscribeProductRequest, Builder> {
        private String consumerId; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeProductRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.productId = request.productId;
        } 

        /**
         * <p>The consumer ID. This parameter specifies the HiMarket Consumer for which to subscribe to an API product. This operation authenticates the request based on the consumer. After this operation creates the subscription record, you can call UnsubscribeHiMarketProduct to cancel the subscription or call ApproveProductSubscription to approve the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The ID of the API product to subscribe to. This is the primary ID of the Product resource. You can obtain this ID from the productId field of a list item returned by ListProducts.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public SubscribeProductRequest build() {
            return new SubscribeProductRequest(this);
        } 

    } 

}
