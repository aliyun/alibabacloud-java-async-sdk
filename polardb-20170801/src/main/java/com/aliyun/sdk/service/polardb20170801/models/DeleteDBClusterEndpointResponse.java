// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBClusterEndpointResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBClusterEndpointResponse</p>
 */
public class DeleteDBClusterEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBClusterEndpointResponseBody body;

    private DeleteDBClusterEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBClusterEndpointResponse create() {
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
    public DeleteDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBClusterEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBClusterEndpointResponseBody body);

        @Override
        DeleteDBClusterEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBClusterEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBClusterEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBClusterEndpointResponse response) {
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
        public Builder body(DeleteDBClusterEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBClusterEndpointResponse build() {
            return new DeleteDBClusterEndpointResponse(this);
        } 

    } 

}
