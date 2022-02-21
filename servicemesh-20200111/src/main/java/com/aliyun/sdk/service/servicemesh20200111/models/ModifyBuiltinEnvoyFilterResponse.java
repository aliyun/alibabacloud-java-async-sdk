// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBuiltinEnvoyFilterResponse} extends {@link TeaModel}
 *
 * <p>ModifyBuiltinEnvoyFilterResponse</p>
 */
public class ModifyBuiltinEnvoyFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBuiltinEnvoyFilterResponseBody body;

    private ModifyBuiltinEnvoyFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBuiltinEnvoyFilterResponse create() {
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
    public ModifyBuiltinEnvoyFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBuiltinEnvoyFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBuiltinEnvoyFilterResponseBody body);

        @Override
        ModifyBuiltinEnvoyFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBuiltinEnvoyFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBuiltinEnvoyFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBuiltinEnvoyFilterResponse response) {
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
        public Builder body(ModifyBuiltinEnvoyFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBuiltinEnvoyFilterResponse build() {
            return new ModifyBuiltinEnvoyFilterResponse(this);
        } 

    } 

}
