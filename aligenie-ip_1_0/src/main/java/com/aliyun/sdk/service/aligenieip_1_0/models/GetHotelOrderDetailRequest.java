// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetHotelOrderDetailRequest</p>
 */
public class GetHotelOrderDetailRequest extends Request {
    @Query
    @NameInMap("Payload")
    @Validation(required = true)
    private Payload payload;

    private GetHotelOrderDetailRequest(Builder builder) {
        super(builder);
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelOrderDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    public static final class Builder extends Request.Builder<GetHotelOrderDetailRequest, Builder> {
        private Payload payload; 

        private Builder() {
            super();
        } 

        private Builder(GetHotelOrderDetailRequest request) {
            super(request);
            this.payload = request.payload;
        } 

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        @Override
        public GetHotelOrderDetailRequest build() {
            return new GetHotelOrderDetailRequest(this);
        } 

    } 

    public static class Payload extends TeaModel {
        @NameInMap("OrderNo")
        @Validation(required = true)
        private String orderNo;

        private Payload(Builder builder) {
            this.orderNo = builder.orderNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
        }

        public static final class Builder {
            private String orderNo; 

            /**
             * OrderNo.
             */
            public Builder orderNo(String orderNo) {
                this.orderNo = orderNo;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
