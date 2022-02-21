// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBEndpointAddressResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBEndpointAddressResponse</p>
 */
public class DeleteDBEndpointAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBEndpointAddressResponseBody body;

    private DeleteDBEndpointAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBEndpointAddressResponse create() {
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
    public DeleteDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBEndpointAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBEndpointAddressResponseBody body);

        @Override
        DeleteDBEndpointAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBEndpointAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBEndpointAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBEndpointAddressResponse response) {
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
        public Builder body(DeleteDBEndpointAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBEndpointAddressResponse build() {
            return new DeleteDBEndpointAddressResponse(this);
        } 

    } 

}
