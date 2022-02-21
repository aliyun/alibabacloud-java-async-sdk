// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBProxyEndpointAddressResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBProxyEndpointAddressResponse</p>
 */
public class DeleteDBProxyEndpointAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBProxyEndpointAddressResponseBody body;

    private DeleteDBProxyEndpointAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBProxyEndpointAddressResponse create() {
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
    public DeleteDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBProxyEndpointAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBProxyEndpointAddressResponseBody body);

        @Override
        DeleteDBProxyEndpointAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBProxyEndpointAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBProxyEndpointAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBProxyEndpointAddressResponse response) {
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
        public Builder body(DeleteDBProxyEndpointAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBProxyEndpointAddressResponse build() {
            return new DeleteDBProxyEndpointAddressResponse(this);
        } 

    } 

}
