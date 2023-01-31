// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOutboundCallNumberResponse} extends {@link TeaModel}
 *
 * <p>ModifyOutboundCallNumberResponse</p>
 */
public class ModifyOutboundCallNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOutboundCallNumberResponseBody body;

    private ModifyOutboundCallNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOutboundCallNumberResponse create() {
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
    public ModifyOutboundCallNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOutboundCallNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOutboundCallNumberResponseBody body);

        @Override
        ModifyOutboundCallNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOutboundCallNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOutboundCallNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOutboundCallNumberResponse response) {
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
        public Builder body(ModifyOutboundCallNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOutboundCallNumberResponse build() {
            return new ModifyOutboundCallNumberResponse(this);
        } 

    } 

}
