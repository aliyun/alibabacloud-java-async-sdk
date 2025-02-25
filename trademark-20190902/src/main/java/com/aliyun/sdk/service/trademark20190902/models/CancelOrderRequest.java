// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRequest} extends {@link RequestModel}
 *
 * <p>CancelOrderRequest</p>
 */
public class CancelOrderRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    private CancelOrderRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<CancelOrderRequest, Builder> {
        private Long orderId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOrderRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public CancelOrderRequest build() {
            return new CancelOrderRequest(this);
        } 

    } 

}
