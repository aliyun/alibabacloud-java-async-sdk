// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResolverEndpointResponse} extends {@link TeaModel}
 *
 * <p>DeleteResolverEndpointResponse</p>
 */
public class DeleteResolverEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResolverEndpointResponseBody body;

    private DeleteResolverEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResolverEndpointResponse create() {
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
    public DeleteResolverEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResolverEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResolverEndpointResponseBody body);

        @Override
        DeleteResolverEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResolverEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResolverEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResolverEndpointResponse response) {
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
        public Builder body(DeleteResolverEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResolverEndpointResponse build() {
            return new DeleteResolverEndpointResponse(this);
        } 

    } 

}
