// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomRoutingEndpointGroupsResponse</p>
 */
public class DeleteCustomRoutingEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomRoutingEndpointGroupsResponseBody body;

    private DeleteCustomRoutingEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomRoutingEndpointGroupsResponse create() {
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
    public DeleteCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomRoutingEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomRoutingEndpointGroupsResponseBody body);

        @Override
        DeleteCustomRoutingEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomRoutingEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomRoutingEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomRoutingEndpointGroupsResponse response) {
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
        public Builder body(DeleteCustomRoutingEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomRoutingEndpointGroupsResponse build() {
            return new DeleteCustomRoutingEndpointGroupsResponse(this);
        } 

    } 

}
