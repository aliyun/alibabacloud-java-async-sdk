// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBNodeClassResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBNodeClassResponse</p>
 */
public class ModifyDBNodeClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBNodeClassResponseBody body;

    private ModifyDBNodeClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBNodeClassResponse create() {
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
    public ModifyDBNodeClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBNodeClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBNodeClassResponseBody body);

        @Override
        ModifyDBNodeClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBNodeClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBNodeClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBNodeClassResponse response) {
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
        public Builder body(ModifyDBNodeClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBNodeClassResponse build() {
            return new ModifyDBNodeClassResponse(this);
        } 

    } 

}
