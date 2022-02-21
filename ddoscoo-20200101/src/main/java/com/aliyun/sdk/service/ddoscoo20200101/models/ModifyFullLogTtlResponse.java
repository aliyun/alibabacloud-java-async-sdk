// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFullLogTtlResponse} extends {@link TeaModel}
 *
 * <p>ModifyFullLogTtlResponse</p>
 */
public class ModifyFullLogTtlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFullLogTtlResponseBody body;

    private ModifyFullLogTtlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFullLogTtlResponse create() {
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
    public ModifyFullLogTtlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFullLogTtlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFullLogTtlResponseBody body);

        @Override
        ModifyFullLogTtlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFullLogTtlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFullLogTtlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFullLogTtlResponse response) {
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
        public Builder body(ModifyFullLogTtlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFullLogTtlResponse build() {
            return new ModifyFullLogTtlResponse(this);
        } 

    } 

}
