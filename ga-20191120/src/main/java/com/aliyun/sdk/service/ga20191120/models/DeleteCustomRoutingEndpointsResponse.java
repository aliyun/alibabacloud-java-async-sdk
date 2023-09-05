// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointsResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomRoutingEndpointsResponse</p>
 */
public class DeleteCustomRoutingEndpointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomRoutingEndpointsResponseBody body;

    private DeleteCustomRoutingEndpointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomRoutingEndpointsResponse create() {
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
    public DeleteCustomRoutingEndpointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomRoutingEndpointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomRoutingEndpointsResponseBody body);

        @Override
        DeleteCustomRoutingEndpointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomRoutingEndpointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomRoutingEndpointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomRoutingEndpointsResponse response) {
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
        public Builder body(DeleteCustomRoutingEndpointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomRoutingEndpointsResponse build() {
            return new DeleteCustomRoutingEndpointsResponse(this);
        } 

    } 

}
