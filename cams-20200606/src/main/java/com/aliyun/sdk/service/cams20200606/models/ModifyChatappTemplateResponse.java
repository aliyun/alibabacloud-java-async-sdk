// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyChatappTemplateResponse} extends {@link TeaModel}
 *
 * <p>ModifyChatappTemplateResponse</p>
 */
public class ModifyChatappTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyChatappTemplateResponseBody body;

    private ModifyChatappTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyChatappTemplateResponse create() {
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
    public ModifyChatappTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyChatappTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyChatappTemplateResponseBody body);

        @Override
        ModifyChatappTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyChatappTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyChatappTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyChatappTemplateResponse response) {
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
        public Builder body(ModifyChatappTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyChatappTemplateResponse build() {
            return new ModifyChatappTemplateResponse(this);
        } 

    } 

}
