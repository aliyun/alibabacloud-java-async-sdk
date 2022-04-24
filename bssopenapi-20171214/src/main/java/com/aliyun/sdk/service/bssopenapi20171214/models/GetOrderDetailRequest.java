// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetOrderDetailRequest</p>
 */
public class GetOrderDetailRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private GetOrderDetailRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderDetailRequest create() {
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

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<GetOrderDetailRequest, Builder> {
        private String orderId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderDetailRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public GetOrderDetailRequest build() {
            return new GetOrderDetailRequest(this);
        } 

    } 

}
