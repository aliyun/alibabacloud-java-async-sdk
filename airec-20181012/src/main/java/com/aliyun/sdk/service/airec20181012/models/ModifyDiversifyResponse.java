// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiversifyResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiversifyResponse</p>
 */
public class ModifyDiversifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiversifyResponseBody body;

    private ModifyDiversifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiversifyResponse create() {
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
    public ModifyDiversifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiversifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiversifyResponseBody body);

        @Override
        ModifyDiversifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiversifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiversifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiversifyResponse response) {
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
        public Builder body(ModifyDiversifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiversifyResponse build() {
            return new ModifyDiversifyResponse(this);
        } 

    } 

}
