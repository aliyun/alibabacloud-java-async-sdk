// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightItineraryScanQueryResponse} extends {@link TeaModel}
 *
 * <p>FlightItineraryScanQueryResponse</p>
 */
public class FlightItineraryScanQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightItineraryScanQueryResponseBody body;

    private FlightItineraryScanQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightItineraryScanQueryResponse create() {
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
    public FlightItineraryScanQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightItineraryScanQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightItineraryScanQueryResponseBody body);

        @Override
        FlightItineraryScanQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightItineraryScanQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightItineraryScanQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightItineraryScanQueryResponse response) {
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
        public Builder body(FlightItineraryScanQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightItineraryScanQueryResponse build() {
            return new FlightItineraryScanQueryResponse(this);
        } 

    } 

}
