// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightPayOrderResponse} extends {@link TeaModel}
 *
 * <p>FlightPayOrderResponse</p>
 */
public class FlightPayOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightPayOrderResponseBody body;

    private FlightPayOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightPayOrderResponse create() {
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
    public FlightPayOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightPayOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightPayOrderResponseBody body);

        @Override
        FlightPayOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightPayOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightPayOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightPayOrderResponse response) {
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
        public Builder body(FlightPayOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightPayOrderResponse build() {
            return new FlightPayOrderResponse(this);
        } 

    } 

}
