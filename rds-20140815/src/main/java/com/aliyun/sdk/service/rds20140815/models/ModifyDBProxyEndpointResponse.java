// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyEndpointResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBProxyEndpointResponse</p>
 */
public class ModifyDBProxyEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBProxyEndpointResponseBody body;

    private ModifyDBProxyEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBProxyEndpointResponse create() {
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
    public ModifyDBProxyEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBProxyEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBProxyEndpointResponseBody body);

        @Override
        ModifyDBProxyEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBProxyEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBProxyEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBProxyEndpointResponse response) {
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
        public Builder body(ModifyDBProxyEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBProxyEndpointResponse build() {
            return new ModifyDBProxyEndpointResponse(this);
        } 

    } 

}
