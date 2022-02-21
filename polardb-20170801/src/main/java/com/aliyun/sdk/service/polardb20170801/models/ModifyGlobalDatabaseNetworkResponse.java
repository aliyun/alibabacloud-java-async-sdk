// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalDatabaseNetworkResponse} extends {@link TeaModel}
 *
 * <p>ModifyGlobalDatabaseNetworkResponse</p>
 */
public class ModifyGlobalDatabaseNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGlobalDatabaseNetworkResponseBody body;

    private ModifyGlobalDatabaseNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGlobalDatabaseNetworkResponse create() {
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
    public ModifyGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGlobalDatabaseNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGlobalDatabaseNetworkResponseBody body);

        @Override
        ModifyGlobalDatabaseNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGlobalDatabaseNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGlobalDatabaseNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGlobalDatabaseNetworkResponse response) {
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
        public Builder body(ModifyGlobalDatabaseNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGlobalDatabaseNetworkResponse build() {
            return new ModifyGlobalDatabaseNetworkResponse(this);
        } 

    } 

}
