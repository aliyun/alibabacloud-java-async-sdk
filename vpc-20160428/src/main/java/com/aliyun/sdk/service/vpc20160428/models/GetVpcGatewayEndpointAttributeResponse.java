// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcGatewayEndpointAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetVpcGatewayEndpointAttributeResponse</p>
 */
public class GetVpcGatewayEndpointAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVpcGatewayEndpointAttributeResponseBody body;

    private GetVpcGatewayEndpointAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVpcGatewayEndpointAttributeResponse create() {
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
    public GetVpcGatewayEndpointAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVpcGatewayEndpointAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVpcGatewayEndpointAttributeResponseBody body);

        @Override
        GetVpcGatewayEndpointAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVpcGatewayEndpointAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVpcGatewayEndpointAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVpcGatewayEndpointAttributeResponse response) {
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
        public Builder body(GetVpcGatewayEndpointAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVpcGatewayEndpointAttributeResponse build() {
            return new GetVpcGatewayEndpointAttributeResponse(this);
        } 

    } 

}
