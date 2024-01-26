// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightCreateOrderResponse} extends {@link TeaModel}
 *
 * <p>FlightCreateOrderResponse</p>
 */
public class FlightCreateOrderResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private FlightCreateOrderResponseBody body;

    private FlightCreateOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static FlightCreateOrderResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public FlightCreateOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightCreateOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(FlightCreateOrderResponseBody body);

        @Override
        FlightCreateOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightCreateOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private FlightCreateOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightCreateOrderResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(FlightCreateOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightCreateOrderResponse build() {
            return new FlightCreateOrderResponse(this);
        } 

    } 

}
