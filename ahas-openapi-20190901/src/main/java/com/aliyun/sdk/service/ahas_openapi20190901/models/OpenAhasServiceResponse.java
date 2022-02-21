// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAhasServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenAhasServiceResponse</p>
 */
public class OpenAhasServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenAhasServiceResponseBody body;

    private OpenAhasServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenAhasServiceResponse create() {
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
    public OpenAhasServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenAhasServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenAhasServiceResponseBody body);

        @Override
        OpenAhasServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenAhasServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenAhasServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenAhasServiceResponse response) {
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
        public Builder body(OpenAhasServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenAhasServiceResponse build() {
            return new OpenAhasServiceResponse(this);
        } 

    } 

}
