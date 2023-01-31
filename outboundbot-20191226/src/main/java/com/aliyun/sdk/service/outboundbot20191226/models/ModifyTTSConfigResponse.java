// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTTSConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyTTSConfigResponse</p>
 */
public class ModifyTTSConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTTSConfigResponseBody body;

    private ModifyTTSConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTTSConfigResponse create() {
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
    public ModifyTTSConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTTSConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTTSConfigResponseBody body);

        @Override
        ModifyTTSConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTTSConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTTSConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTTSConfigResponse response) {
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
        public Builder body(ModifyTTSConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTTSConfigResponse build() {
            return new ModifyTTSConfigResponse(this);
        } 

    } 

}
