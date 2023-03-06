// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOtaSearchResponse} extends {@link TeaModel}
 *
 * <p>FlightOtaSearchResponse</p>
 */
public class FlightOtaSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightOtaSearchResponseBody body;

    private FlightOtaSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightOtaSearchResponse create() {
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
    public FlightOtaSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightOtaSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightOtaSearchResponseBody body);

        @Override
        FlightOtaSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightOtaSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightOtaSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightOtaSearchResponse response) {
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
        public Builder body(FlightOtaSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightOtaSearchResponse build() {
            return new FlightOtaSearchResponse(this);
        } 

    } 

}
