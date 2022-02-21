// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcGatewayEndpointAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateVpcGatewayEndpointAttributeResponse</p>
 */
public class UpdateVpcGatewayEndpointAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVpcGatewayEndpointAttributeResponseBody body;

    private UpdateVpcGatewayEndpointAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVpcGatewayEndpointAttributeResponse create() {
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
    public UpdateVpcGatewayEndpointAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVpcGatewayEndpointAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVpcGatewayEndpointAttributeResponseBody body);

        @Override
        UpdateVpcGatewayEndpointAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVpcGatewayEndpointAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVpcGatewayEndpointAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVpcGatewayEndpointAttributeResponse response) {
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
        public Builder body(UpdateVpcGatewayEndpointAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVpcGatewayEndpointAttributeResponse build() {
            return new UpdateVpcGatewayEndpointAttributeResponse(this);
        } 

    } 

}
