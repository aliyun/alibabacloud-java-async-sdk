// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBundleResponse} extends {@link TeaModel}
 *
 * <p>ModifyBundleResponse</p>
 */
public class ModifyBundleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBundleResponseBody body;

    private ModifyBundleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBundleResponse create() {
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
    public ModifyBundleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBundleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBundleResponseBody body);

        @Override
        ModifyBundleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBundleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBundleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBundleResponse response) {
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
        public Builder body(ModifyBundleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBundleResponse build() {
            return new ModifyBundleResponse(this);
        } 

    } 

}
