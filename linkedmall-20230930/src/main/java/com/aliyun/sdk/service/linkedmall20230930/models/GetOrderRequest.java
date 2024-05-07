// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderRequest} extends {@link RequestModel}
 *
 * <p>GetOrderRequest</p>
 */
public class GetOrderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("orderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    private GetOrderRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<GetOrderRequest, Builder> {
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderRequest request) {
            super(request);
            this.orderId = request.orderId;
        } 

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.putPathParameter("orderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public GetOrderRequest build() {
            return new GetOrderRequest(this);
        } 

    } 

}
