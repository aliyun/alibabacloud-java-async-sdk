// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBProxyEndpointAddressResponse} extends {@link TeaModel}
 *
 * <p>CreateDBProxyEndpointAddressResponse</p>
 */
public class CreateDBProxyEndpointAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBProxyEndpointAddressResponseBody body;

    private CreateDBProxyEndpointAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBProxyEndpointAddressResponse create() {
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
    public CreateDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBProxyEndpointAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBProxyEndpointAddressResponseBody body);

        @Override
        CreateDBProxyEndpointAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBProxyEndpointAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBProxyEndpointAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBProxyEndpointAddressResponse response) {
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
        public Builder body(CreateDBProxyEndpointAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBProxyEndpointAddressResponse build() {
            return new CreateDBProxyEndpointAddressResponse(this);
        } 

    } 

}
