// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceMetaResponse} extends {@link TeaModel}
 *
 * <p>ModifyResourceMetaResponse</p>
 */
public class ModifyResourceMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyResourceMetaResponseBody body;

    private ModifyResourceMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyResourceMetaResponse create() {
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
    public ModifyResourceMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyResourceMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyResourceMetaResponseBody body);

        @Override
        ModifyResourceMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyResourceMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyResourceMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyResourceMetaResponse response) {
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
        public Builder body(ModifyResourceMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyResourceMetaResponse build() {
            return new ModifyResourceMetaResponse(this);
        } 

    } 

}
