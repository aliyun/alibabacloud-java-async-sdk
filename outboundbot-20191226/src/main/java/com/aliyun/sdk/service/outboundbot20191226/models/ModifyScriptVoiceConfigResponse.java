// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScriptVoiceConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyScriptVoiceConfigResponse</p>
 */
public class ModifyScriptVoiceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScriptVoiceConfigResponseBody body;

    private ModifyScriptVoiceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScriptVoiceConfigResponse create() {
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
    public ModifyScriptVoiceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScriptVoiceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScriptVoiceConfigResponseBody body);

        @Override
        ModifyScriptVoiceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScriptVoiceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScriptVoiceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScriptVoiceConfigResponse response) {
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
        public Builder body(ModifyScriptVoiceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScriptVoiceConfigResponse build() {
            return new ModifyScriptVoiceConfigResponse(this);
        } 

    } 

}
