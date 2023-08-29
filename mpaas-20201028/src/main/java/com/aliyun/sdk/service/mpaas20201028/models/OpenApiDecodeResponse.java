// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiDecodeResponse} extends {@link TeaModel}
 *
 * <p>OpenApiDecodeResponse</p>
 */
public class OpenApiDecodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiDecodeResponseBody body;

    private OpenApiDecodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiDecodeResponse create() {
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
    public OpenApiDecodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiDecodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiDecodeResponseBody body);

        @Override
        OpenApiDecodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiDecodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiDecodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiDecodeResponse response) {
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
        public Builder body(OpenApiDecodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiDecodeResponse build() {
            return new OpenApiDecodeResponse(this);
        } 

    } 

}
