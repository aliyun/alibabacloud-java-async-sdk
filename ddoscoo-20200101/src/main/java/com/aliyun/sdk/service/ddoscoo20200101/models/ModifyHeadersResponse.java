// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHeadersResponse} extends {@link TeaModel}
 *
 * <p>ModifyHeadersResponse</p>
 */
public class ModifyHeadersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHeadersResponseBody body;

    private ModifyHeadersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHeadersResponse create() {
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
    public ModifyHeadersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHeadersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHeadersResponseBody body);

        @Override
        ModifyHeadersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHeadersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHeadersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHeadersResponse response) {
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
        public Builder body(ModifyHeadersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHeadersResponse build() {
            return new ModifyHeadersResponse(this);
        } 

    } 

}
