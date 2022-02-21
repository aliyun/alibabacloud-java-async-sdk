// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCnameReuseResponse} extends {@link TeaModel}
 *
 * <p>ModifyCnameReuseResponse</p>
 */
public class ModifyCnameReuseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCnameReuseResponseBody body;

    private ModifyCnameReuseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCnameReuseResponse create() {
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
    public ModifyCnameReuseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCnameReuseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCnameReuseResponseBody body);

        @Override
        ModifyCnameReuseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCnameReuseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCnameReuseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCnameReuseResponse response) {
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
        public Builder body(ModifyCnameReuseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCnameReuseResponse build() {
            return new ModifyCnameReuseResponse(this);
        } 

    } 

}
