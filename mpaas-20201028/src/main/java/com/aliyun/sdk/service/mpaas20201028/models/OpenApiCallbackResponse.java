// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiCallbackResponse} extends {@link TeaModel}
 *
 * <p>OpenApiCallbackResponse</p>
 */
public class OpenApiCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiCallbackResponseBody body;

    private OpenApiCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiCallbackResponse create() {
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
    public OpenApiCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiCallbackResponseBody body);

        @Override
        OpenApiCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiCallbackResponse response) {
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
        public Builder body(OpenApiCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiCallbackResponse build() {
            return new OpenApiCallbackResponse(this);
        } 

    } 

}
