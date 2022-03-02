// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InitiateMultipartUploadResponse} extends {@link TeaModel}
 *
 * <p>InitiateMultipartUploadResponse</p>
 */
public class InitiateMultipartUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitiateMultipartUploadResponseBody body;

    private InitiateMultipartUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitiateMultipartUploadResponse create() {
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
    public InitiateMultipartUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitiateMultipartUploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitiateMultipartUploadResponseBody body);

        @Override
        InitiateMultipartUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitiateMultipartUploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitiateMultipartUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitiateMultipartUploadResponse response) {
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
        public Builder body(InitiateMultipartUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitiateMultipartUploadResponse build() {
            return new InitiateMultipartUploadResponse(this);
        } 

    } 

}
