// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointGroupDestinationsResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomRoutingEndpointGroupDestinationsResponse</p>
 */
public class DeleteCustomRoutingEndpointGroupDestinationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomRoutingEndpointGroupDestinationsResponseBody body;

    private DeleteCustomRoutingEndpointGroupDestinationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomRoutingEndpointGroupDestinationsResponse create() {
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
    public DeleteCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomRoutingEndpointGroupDestinationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomRoutingEndpointGroupDestinationsResponseBody body);

        @Override
        DeleteCustomRoutingEndpointGroupDestinationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomRoutingEndpointGroupDestinationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomRoutingEndpointGroupDestinationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomRoutingEndpointGroupDestinationsResponse response) {
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
        public Builder body(DeleteCustomRoutingEndpointGroupDestinationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomRoutingEndpointGroupDestinationsResponse build() {
            return new DeleteCustomRoutingEndpointGroupDestinationsResponse(this);
        } 

    } 

}
