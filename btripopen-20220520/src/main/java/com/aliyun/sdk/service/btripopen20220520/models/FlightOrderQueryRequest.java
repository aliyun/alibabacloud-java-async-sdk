// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOrderQueryRequest} extends {@link RequestModel}
 *
 * <p>FlightOrderQueryRequest</p>
 */
public class FlightOrderQueryRequest extends Request {
    @Query
    @NameInMap("order_id")
    @Validation(required = true)
    private Long orderId;

    @Query
    @NameInMap("user_id")
    private String userId;

    private FlightOrderQueryRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOrderQueryRequest create() {
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<FlightOrderQueryRequest, Builder> {
        private Long orderId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(FlightOrderQueryRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.userId = request.userId;
        } 

        /**
         * order_id.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public FlightOrderQueryRequest build() {
            return new FlightOrderQueryRequest(this);
        } 

    } 

}
