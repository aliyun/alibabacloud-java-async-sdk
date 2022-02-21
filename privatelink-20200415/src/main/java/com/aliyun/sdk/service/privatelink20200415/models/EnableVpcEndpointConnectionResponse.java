// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableVpcEndpointConnectionResponse} extends {@link TeaModel}
 *
 * <p>EnableVpcEndpointConnectionResponse</p>
 */
public class EnableVpcEndpointConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableVpcEndpointConnectionResponseBody body;

    private EnableVpcEndpointConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableVpcEndpointConnectionResponse create() {
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
    public EnableVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableVpcEndpointConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableVpcEndpointConnectionResponseBody body);

        @Override
        EnableVpcEndpointConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableVpcEndpointConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableVpcEndpointConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableVpcEndpointConnectionResponse response) {
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
        public Builder body(EnableVpcEndpointConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableVpcEndpointConnectionResponse build() {
            return new EnableVpcEndpointConnectionResponse(this);
        } 

    } 

}
