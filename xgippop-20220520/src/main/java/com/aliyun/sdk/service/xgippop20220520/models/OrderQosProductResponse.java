// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderQosProductResponse} extends {@link TeaModel}
 *
 * <p>OrderQosProductResponse</p>
 */
public class OrderQosProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OrderQosProductResponseBody body;

    private OrderQosProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OrderQosProductResponse create() {
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
    public OrderQosProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OrderQosProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OrderQosProductResponseBody body);

        @Override
        OrderQosProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OrderQosProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OrderQosProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OrderQosProductResponse response) {
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
        public Builder body(OrderQosProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OrderQosProductResponse build() {
            return new OrderQosProductResponse(this);
        } 

    } 

}
