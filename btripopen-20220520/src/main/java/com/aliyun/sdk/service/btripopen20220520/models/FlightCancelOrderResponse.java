// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCancelOrderResponse} extends {@link TeaModel}
 *
 * <p>FlightCancelOrderResponse</p>
 */
public class FlightCancelOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightCancelOrderResponseBody body;

    private FlightCancelOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightCancelOrderResponse create() {
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
    public FlightCancelOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightCancelOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightCancelOrderResponseBody body);

        @Override
        FlightCancelOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightCancelOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightCancelOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightCancelOrderResponse response) {
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
        public Builder body(FlightCancelOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightCancelOrderResponse build() {
            return new FlightCancelOrderResponse(this);
        } 

    } 

}
