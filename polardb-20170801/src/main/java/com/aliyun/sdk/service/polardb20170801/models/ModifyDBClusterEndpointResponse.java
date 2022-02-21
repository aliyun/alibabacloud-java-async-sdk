// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterEndpointResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterEndpointResponse</p>
 */
public class ModifyDBClusterEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBClusterEndpointResponseBody body;

    private ModifyDBClusterEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBClusterEndpointResponse create() {
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
    public ModifyDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBClusterEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBClusterEndpointResponseBody body);

        @Override
        ModifyDBClusterEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBClusterEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBClusterEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBClusterEndpointResponse response) {
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
        public Builder body(ModifyDBClusterEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBClusterEndpointResponse build() {
            return new ModifyDBClusterEndpointResponse(this);
        } 

    } 

}
