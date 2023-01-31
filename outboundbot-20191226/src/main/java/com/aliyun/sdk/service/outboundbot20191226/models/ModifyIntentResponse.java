// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIntentResponse} extends {@link TeaModel}
 *
 * <p>ModifyIntentResponse</p>
 */
public class ModifyIntentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIntentResponseBody body;

    private ModifyIntentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIntentResponse create() {
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
    public ModifyIntentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIntentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIntentResponseBody body);

        @Override
        ModifyIntentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIntentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIntentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIntentResponse response) {
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
        public Builder body(ModifyIntentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIntentResponse build() {
            return new ModifyIntentResponse(this);
        } 

    } 

}
