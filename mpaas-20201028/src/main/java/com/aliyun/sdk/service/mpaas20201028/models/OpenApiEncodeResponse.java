// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiEncodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiEncodeResponse</p>
 */
public class OpenApiEncodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiEncodeResponseBody body;

    private OpenApiEncodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiEncodeResponse create() {
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
    public OpenApiEncodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiEncodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiEncodeResponseBody body);

        @Override
        OpenApiEncodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiEncodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiEncodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiEncodeResponse response) {
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
        public Builder body(OpenApiEncodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiEncodeResponse build() {
            return new OpenApiEncodeResponse(this);
        } 

    } 

}
