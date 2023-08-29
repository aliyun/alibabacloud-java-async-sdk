// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiQueryActiveCodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiQueryActiveCodeResponse</p>
 */
public class OpenApiQueryActiveCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiQueryActiveCodeResponseBody body;

    private OpenApiQueryActiveCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiQueryActiveCodeResponse create() {
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
    public OpenApiQueryActiveCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiQueryActiveCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiQueryActiveCodeResponseBody body);

        @Override
        OpenApiQueryActiveCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiQueryActiveCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiQueryActiveCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiQueryActiveCodeResponse response) {
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
        public Builder body(OpenApiQueryActiveCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiQueryActiveCodeResponse build() {
            return new OpenApiQueryActiveCodeResponse(this);
        } 

    } 

}
