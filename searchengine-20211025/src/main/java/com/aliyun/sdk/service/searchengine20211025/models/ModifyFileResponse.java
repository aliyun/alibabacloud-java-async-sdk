// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFileResponse} extends {@link TeaModel}
 *
 * <p>ModifyFileResponse</p>
 */
public class ModifyFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFileResponseBody body;

    private ModifyFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFileResponse create() {
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
    public ModifyFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFileResponseBody body);

        @Override
        ModifyFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFileResponse response) {
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
        public Builder body(ModifyFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFileResponse build() {
            return new ModifyFileResponse(this);
        } 

    } 

}
