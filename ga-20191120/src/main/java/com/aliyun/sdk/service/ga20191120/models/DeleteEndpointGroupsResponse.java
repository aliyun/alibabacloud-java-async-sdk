// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>DeleteEndpointGroupsResponse</p>
 */
public class DeleteEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEndpointGroupsResponseBody body;

    private DeleteEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEndpointGroupsResponse create() {
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
    public DeleteEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEndpointGroupsResponseBody body);

        @Override
        DeleteEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEndpointGroupsResponse response) {
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
        public Builder body(DeleteEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEndpointGroupsResponse build() {
            return new DeleteEndpointGroupsResponse(this);
        } 

    } 

}
