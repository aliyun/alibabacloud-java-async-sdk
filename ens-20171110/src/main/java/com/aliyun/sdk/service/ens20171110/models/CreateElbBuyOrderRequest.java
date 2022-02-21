// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElbBuyOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateElbBuyOrderRequest</p>
 */
public class CreateElbBuyOrderRequest extends Request {
    @Query
    @NameInMap("OrderDetails")
    @Validation(required = true)
    private String orderDetails;

    private CreateElbBuyOrderRequest(Builder builder) {
        super(builder);
        this.orderDetails = builder.orderDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElbBuyOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderDetails
     */
    public String getOrderDetails() {
        return this.orderDetails;
    }

    public static final class Builder extends Request.Builder<CreateElbBuyOrderRequest, Builder> {
        private String orderDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateElbBuyOrderRequest response) {
            super(response);
            this.orderDetails = response.orderDetails;
        } 

        /**
         * OrderDetails.
         */
        public Builder orderDetails(String orderDetails) {
            this.putQueryParameter("OrderDetails", orderDetails);
            this.orderDetails = orderDetails;
            return this;
        }

        @Override
        public CreateElbBuyOrderRequest build() {
            return new CreateElbBuyOrderRequest(this);
        } 

    } 

}
