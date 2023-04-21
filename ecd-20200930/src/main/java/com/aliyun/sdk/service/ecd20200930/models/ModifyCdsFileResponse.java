// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileResponse} extends {@link TeaModel}
 *
 * <p>ModifyCdsFileResponse</p>
 */
public class ModifyCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCdsFileResponseBody body;

    private ModifyCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCdsFileResponse create() {
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
    public ModifyCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCdsFileResponseBody body);

        @Override
        ModifyCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCdsFileResponse response) {
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
        public Builder body(ModifyCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCdsFileResponse build() {
            return new ModifyCdsFileResponse(this);
        } 

    } 

}
