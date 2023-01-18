// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightSearchListResponse} extends {@link TeaModel}
 *
 * <p>FlightSearchListResponse</p>
 */
public class FlightSearchListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightSearchListResponseBody body;

    private FlightSearchListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightSearchListResponse create() {
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
    public FlightSearchListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightSearchListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightSearchListResponseBody body);

        @Override
        FlightSearchListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightSearchListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightSearchListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightSearchListResponse response) {
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
        public Builder body(FlightSearchListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightSearchListResponse build() {
            return new FlightSearchListResponse(this);
        } 

    } 

}
