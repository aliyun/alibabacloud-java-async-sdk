// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointGroupDestinationsResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointGroupDestinationsResponse</p>
 */
public class CreateCustomRoutingEndpointGroupDestinationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomRoutingEndpointGroupDestinationsResponseBody body;

    private CreateCustomRoutingEndpointGroupDestinationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomRoutingEndpointGroupDestinationsResponse create() {
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
    public CreateCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomRoutingEndpointGroupDestinationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomRoutingEndpointGroupDestinationsResponseBody body);

        @Override
        CreateCustomRoutingEndpointGroupDestinationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomRoutingEndpointGroupDestinationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomRoutingEndpointGroupDestinationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomRoutingEndpointGroupDestinationsResponse response) {
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
        public Builder body(CreateCustomRoutingEndpointGroupDestinationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomRoutingEndpointGroupDestinationsResponse build() {
            return new CreateCustomRoutingEndpointGroupDestinationsResponse(this);
        } 

    } 

}
