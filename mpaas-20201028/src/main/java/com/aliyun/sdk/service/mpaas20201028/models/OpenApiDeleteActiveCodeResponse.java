// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiDeleteActiveCodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiDeleteActiveCodeResponse</p>
 */
public class OpenApiDeleteActiveCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiDeleteActiveCodeResponseBody body;

    private OpenApiDeleteActiveCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiDeleteActiveCodeResponse create() {
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
    public OpenApiDeleteActiveCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiDeleteActiveCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiDeleteActiveCodeResponseBody body);

        @Override
        OpenApiDeleteActiveCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiDeleteActiveCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiDeleteActiveCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiDeleteActiveCodeResponse response) {
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
        public Builder body(OpenApiDeleteActiveCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiDeleteActiveCodeResponse build() {
            return new OpenApiDeleteActiveCodeResponse(this);
        } 

    } 

}
