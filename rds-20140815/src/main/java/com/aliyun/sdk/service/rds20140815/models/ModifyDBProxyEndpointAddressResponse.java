// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyEndpointAddressResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBProxyEndpointAddressResponse</p>
 */
public class ModifyDBProxyEndpointAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBProxyEndpointAddressResponseBody body;

    private ModifyDBProxyEndpointAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBProxyEndpointAddressResponse create() {
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
    public ModifyDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBProxyEndpointAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBProxyEndpointAddressResponseBody body);

        @Override
        ModifyDBProxyEndpointAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBProxyEndpointAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBProxyEndpointAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBProxyEndpointAddressResponse response) {
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
        public Builder body(ModifyDBProxyEndpointAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBProxyEndpointAddressResponse build() {
            return new ModifyDBProxyEndpointAddressResponse(this);
        } 

    } 

}
