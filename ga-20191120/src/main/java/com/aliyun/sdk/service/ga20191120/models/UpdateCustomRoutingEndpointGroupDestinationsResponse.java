// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointGroupDestinationsResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointGroupDestinationsResponse</p>
 */
public class UpdateCustomRoutingEndpointGroupDestinationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCustomRoutingEndpointGroupDestinationsResponseBody body;

    private UpdateCustomRoutingEndpointGroupDestinationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCustomRoutingEndpointGroupDestinationsResponse create() {
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
    public UpdateCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomRoutingEndpointGroupDestinationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCustomRoutingEndpointGroupDestinationsResponseBody body);

        @Override
        UpdateCustomRoutingEndpointGroupDestinationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomRoutingEndpointGroupDestinationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCustomRoutingEndpointGroupDestinationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomRoutingEndpointGroupDestinationsResponse response) {
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
        public Builder body(UpdateCustomRoutingEndpointGroupDestinationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointGroupDestinationsResponse build() {
            return new UpdateCustomRoutingEndpointGroupDestinationsResponse(this);
        } 

    } 

}
