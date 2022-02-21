// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcGatewayEndpointResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcGatewayEndpointResponse</p>
 */
public class DeleteVpcGatewayEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcGatewayEndpointResponseBody body;

    private DeleteVpcGatewayEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcGatewayEndpointResponse create() {
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
    public DeleteVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcGatewayEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcGatewayEndpointResponseBody body);

        @Override
        DeleteVpcGatewayEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcGatewayEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcGatewayEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcGatewayEndpointResponse response) {
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
        public Builder body(DeleteVpcGatewayEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcGatewayEndpointResponse build() {
            return new DeleteVpcGatewayEndpointResponse(this);
        } 

    } 

}
