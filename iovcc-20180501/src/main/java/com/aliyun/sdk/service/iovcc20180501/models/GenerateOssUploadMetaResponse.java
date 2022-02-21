// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssUploadMetaResponse} extends {@link TeaModel}
 *
 * <p>GenerateOssUploadMetaResponse</p>
 */
public class GenerateOssUploadMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateOssUploadMetaResponseBody body;

    private GenerateOssUploadMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateOssUploadMetaResponse create() {
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
    public GenerateOssUploadMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateOssUploadMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateOssUploadMetaResponseBody body);

        @Override
        GenerateOssUploadMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateOssUploadMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateOssUploadMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateOssUploadMetaResponse response) {
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
        public Builder body(GenerateOssUploadMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateOssUploadMetaResponse build() {
            return new GenerateOssUploadMetaResponse(this);
        } 

    } 

}
