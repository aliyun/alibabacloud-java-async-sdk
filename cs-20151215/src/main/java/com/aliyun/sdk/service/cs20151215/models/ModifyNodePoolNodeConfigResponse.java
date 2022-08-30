// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodePoolNodeConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyNodePoolNodeConfigResponse</p>
 */
public class ModifyNodePoolNodeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNodePoolNodeConfigResponseBody body;

    private ModifyNodePoolNodeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNodePoolNodeConfigResponse create() {
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
    public ModifyNodePoolNodeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNodePoolNodeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNodePoolNodeConfigResponseBody body);

        @Override
        ModifyNodePoolNodeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNodePoolNodeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNodePoolNodeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNodePoolNodeConfigResponse response) {
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
        public Builder body(ModifyNodePoolNodeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNodePoolNodeConfigResponse build() {
            return new ModifyNodePoolNodeConfigResponse(this);
        } 

    } 

}
