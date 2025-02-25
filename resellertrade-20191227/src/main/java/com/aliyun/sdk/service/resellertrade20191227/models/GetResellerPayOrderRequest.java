// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResellerPayOrderRequest} extends {@link RequestModel}
 *
 * <p>GetResellerPayOrderRequest</p>
 */
public class GetResellerPayOrderRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private GetResellerPayOrderRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResellerPayOrderRequest create() {
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
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetResellerPayOrderRequest, Builder> {
        private String orderId; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetResellerPayOrderRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.uid = request.uid;
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
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetResellerPayOrderRequest build() {
            return new GetResellerPayOrderRequest(this);
        } 

    } 

}
