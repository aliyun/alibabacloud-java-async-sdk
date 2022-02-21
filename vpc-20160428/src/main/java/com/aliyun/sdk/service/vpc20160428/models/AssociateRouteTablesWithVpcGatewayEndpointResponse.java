// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateRouteTablesWithVpcGatewayEndpointResponse} extends {@link TeaModel}
 *
 * <p>AssociateRouteTablesWithVpcGatewayEndpointResponse</p>
 */
public class AssociateRouteTablesWithVpcGatewayEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateRouteTablesWithVpcGatewayEndpointResponseBody body;

    private AssociateRouteTablesWithVpcGatewayEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateRouteTablesWithVpcGatewayEndpointResponse create() {
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
    public AssociateRouteTablesWithVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateRouteTablesWithVpcGatewayEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateRouteTablesWithVpcGatewayEndpointResponseBody body);

        @Override
        AssociateRouteTablesWithVpcGatewayEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateRouteTablesWithVpcGatewayEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateRouteTablesWithVpcGatewayEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateRouteTablesWithVpcGatewayEndpointResponse response) {
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
        public Builder body(AssociateRouteTablesWithVpcGatewayEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateRouteTablesWithVpcGatewayEndpointResponse build() {
            return new AssociateRouteTablesWithVpcGatewayEndpointResponse(this);
        } 

    } 

}
