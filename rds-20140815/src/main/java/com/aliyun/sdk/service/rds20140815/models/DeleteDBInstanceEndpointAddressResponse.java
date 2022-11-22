// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBInstanceEndpointAddressResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBInstanceEndpointAddressResponse</p>
 */
public class DeleteDBInstanceEndpointAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBInstanceEndpointAddressResponseBody body;

    private DeleteDBInstanceEndpointAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBInstanceEndpointAddressResponse create() {
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
    public DeleteDBInstanceEndpointAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBInstanceEndpointAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBInstanceEndpointAddressResponseBody body);

        @Override
        DeleteDBInstanceEndpointAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBInstanceEndpointAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBInstanceEndpointAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBInstanceEndpointAddressResponse response) {
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
        public Builder body(DeleteDBInstanceEndpointAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBInstanceEndpointAddressResponse build() {
            return new DeleteDBInstanceEndpointAddressResponse(this);
        } 

    } 

}
