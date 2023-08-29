// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiAddActiveCodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiAddActiveCodeResponse</p>
 */
public class OpenApiAddActiveCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiAddActiveCodeResponseBody body;

    private OpenApiAddActiveCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiAddActiveCodeResponse create() {
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
    public OpenApiAddActiveCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiAddActiveCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiAddActiveCodeResponseBody body);

        @Override
        OpenApiAddActiveCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiAddActiveCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiAddActiveCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiAddActiveCodeResponse response) {
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
        public Builder body(OpenApiAddActiveCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiAddActiveCodeResponse build() {
            return new OpenApiAddActiveCodeResponse(this);
        } 

    } 

}
