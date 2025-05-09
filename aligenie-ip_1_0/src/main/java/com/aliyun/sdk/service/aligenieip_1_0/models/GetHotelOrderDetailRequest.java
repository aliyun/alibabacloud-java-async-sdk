// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetHotelOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetHotelOrderDetailRequest</p>
 */
public class GetHotelOrderDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link GetHotelOrderDetailRequest} extends {@link TeaModel}
     *
     * <p>GetHotelOrderDetailRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderNo")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Payload model) {
                this.orderNo = model.orderNo;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20220714150702000168270112410630</p>
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
