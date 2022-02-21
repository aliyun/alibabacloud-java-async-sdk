// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySmsTemplateResponse} extends {@link TeaModel}
 *
 * <p>ModifySmsTemplateResponse</p>
 */
public class ModifySmsTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySmsTemplateResponseBody body;

    private ModifySmsTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySmsTemplateResponse create() {
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
    public ModifySmsTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySmsTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySmsTemplateResponseBody body);

        @Override
        ModifySmsTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySmsTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySmsTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySmsTemplateResponse response) {
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
        public Builder body(ModifySmsTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySmsTemplateResponse build() {
            return new ModifySmsTemplateResponse(this);
        } 

    } 

}
