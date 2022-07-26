// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOrderListQueryResponse} extends {@link TeaModel}
 *
 * <p>FlightOrderListQueryResponse</p>
 */
public class FlightOrderListQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightOrderListQueryResponseBody body;

    private FlightOrderListQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightOrderListQueryResponse create() {
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
    public FlightOrderListQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightOrderListQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightOrderListQueryResponseBody body);

        @Override
        FlightOrderListQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightOrderListQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightOrderListQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightOrderListQueryResponse response) {
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
        public Builder body(FlightOrderListQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightOrderListQueryResponse build() {
            return new FlightOrderListQueryResponse(this);
        } 

    } 

}
