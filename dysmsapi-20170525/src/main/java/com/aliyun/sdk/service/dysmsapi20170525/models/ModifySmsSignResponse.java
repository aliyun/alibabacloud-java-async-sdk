// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySmsSignResponse} extends {@link TeaModel}
 *
 * <p>ModifySmsSignResponse</p>
 */
public class ModifySmsSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySmsSignResponseBody body;

    private ModifySmsSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySmsSignResponse create() {
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
    public ModifySmsSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySmsSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySmsSignResponseBody body);

        @Override
        ModifySmsSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySmsSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySmsSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySmsSignResponse response) {
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
        public Builder body(ModifySmsSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySmsSignResponse build() {
            return new ModifySmsSignResponse(this);
        } 

    } 

}
