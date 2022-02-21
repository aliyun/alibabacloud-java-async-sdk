// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVpcEndpointConnectionResponse} extends {@link TeaModel}
 *
 * <p>DisableVpcEndpointConnectionResponse</p>
 */
public class DisableVpcEndpointConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableVpcEndpointConnectionResponseBody body;

    private DisableVpcEndpointConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableVpcEndpointConnectionResponse create() {
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
    public DisableVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableVpcEndpointConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableVpcEndpointConnectionResponseBody body);

        @Override
        DisableVpcEndpointConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableVpcEndpointConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableVpcEndpointConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableVpcEndpointConnectionResponse response) {
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
        public Builder body(DisableVpcEndpointConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableVpcEndpointConnectionResponse build() {
            return new DisableVpcEndpointConnectionResponse(this);
        } 

    } 

}
