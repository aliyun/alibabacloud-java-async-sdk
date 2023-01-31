// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScriptResponse} extends {@link TeaModel}
 *
 * <p>ModifyScriptResponse</p>
 */
public class ModifyScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScriptResponseBody body;

    private ModifyScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScriptResponse create() {
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
    public ModifyScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScriptResponseBody body);

        @Override
        ModifyScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScriptResponse response) {
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
        public Builder body(ModifyScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScriptResponse build() {
            return new ModifyScriptResponse(this);
        } 

    } 

}
