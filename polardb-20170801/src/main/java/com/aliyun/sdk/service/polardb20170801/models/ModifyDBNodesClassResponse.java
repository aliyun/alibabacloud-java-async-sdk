// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBNodesClassResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBNodesClassResponse</p>
 */
public class ModifyDBNodesClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBNodesClassResponseBody body;

    private ModifyDBNodesClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBNodesClassResponse create() {
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
    public ModifyDBNodesClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBNodesClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBNodesClassResponseBody body);

        @Override
        ModifyDBNodesClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBNodesClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBNodesClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBNodesClassResponse response) {
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
        public Builder body(ModifyDBNodesClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBNodesClassResponse build() {
            return new ModifyDBNodesClassResponse(this);
        } 

    } 

}
