// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkAccessEndpointResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkAccessEndpointResponse</p>
 */
public class DeleteNetworkAccessEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNetworkAccessEndpointResponseBody body;

    private DeleteNetworkAccessEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNetworkAccessEndpointResponse create() {
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
    public DeleteNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkAccessEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNetworkAccessEndpointResponseBody body);

        @Override
        DeleteNetworkAccessEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkAccessEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNetworkAccessEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkAccessEndpointResponse response) {
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
        public Builder body(DeleteNetworkAccessEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkAccessEndpointResponse build() {
            return new DeleteNetworkAccessEndpointResponse(this);
        } 

    } 

}
