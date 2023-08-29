// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiUniqueEncodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiUniqueEncodeResponse</p>
 */
public class OpenApiUniqueEncodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiUniqueEncodeResponseBody body;

    private OpenApiUniqueEncodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiUniqueEncodeResponse create() {
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
    public OpenApiUniqueEncodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiUniqueEncodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiUniqueEncodeResponseBody body);

        @Override
        OpenApiUniqueEncodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiUniqueEncodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiUniqueEncodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiUniqueEncodeResponse response) {
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
        public Builder body(OpenApiUniqueEncodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiUniqueEncodeResponse build() {
            return new OpenApiUniqueEncodeResponse(this);
        } 

    } 

}
