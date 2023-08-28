// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodeConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyNodeConfigResponse</p>
 */
public class ModifyNodeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNodeConfigResponseBody body;

    private ModifyNodeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNodeConfigResponse create() {
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
    public ModifyNodeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNodeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNodeConfigResponseBody body);

        @Override
        ModifyNodeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNodeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNodeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNodeConfigResponse response) {
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
        public Builder body(ModifyNodeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNodeConfigResponse build() {
            return new ModifyNodeConfigResponse(this);
        } 

    } 

}
