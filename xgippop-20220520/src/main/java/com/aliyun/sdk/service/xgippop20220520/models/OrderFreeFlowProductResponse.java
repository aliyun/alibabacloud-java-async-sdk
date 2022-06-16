// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderFreeFlowProductResponse} extends {@link TeaModel}
 *
 * <p>OrderFreeFlowProductResponse</p>
 */
public class OrderFreeFlowProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OrderFreeFlowProductResponseBody body;

    private OrderFreeFlowProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OrderFreeFlowProductResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public OrderFreeFlowProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OrderFreeFlowProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OrderFreeFlowProductResponseBody body);

        @Override
        OrderFreeFlowProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OrderFreeFlowProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OrderFreeFlowProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OrderFreeFlowProductResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(OrderFreeFlowProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OrderFreeFlowProductResponse build() {
            return new OrderFreeFlowProductResponse(this);
        } 

    } 

}
