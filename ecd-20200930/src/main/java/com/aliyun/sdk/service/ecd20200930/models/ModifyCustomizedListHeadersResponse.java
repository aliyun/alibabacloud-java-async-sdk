// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomizedListHeadersResponse} extends {@link TeaModel}
 *
 * <p>ModifyCustomizedListHeadersResponse</p>
 */
public class ModifyCustomizedListHeadersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCustomizedListHeadersResponseBody body;

    private ModifyCustomizedListHeadersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCustomizedListHeadersResponse create() {
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
    public ModifyCustomizedListHeadersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCustomizedListHeadersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCustomizedListHeadersResponseBody body);

        @Override
        ModifyCustomizedListHeadersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCustomizedListHeadersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCustomizedListHeadersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCustomizedListHeadersResponse response) {
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
        public Builder body(ModifyCustomizedListHeadersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCustomizedListHeadersResponse build() {
            return new ModifyCustomizedListHeadersResponse(this);
        } 

    } 

}
