// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUploadMetaResponse} extends {@link TeaModel}
 *
 * <p>GetOssUploadMetaResponse</p>
 */
public class GetOssUploadMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOssUploadMetaResponseBody body;

    private GetOssUploadMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOssUploadMetaResponse create() {
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
    public GetOssUploadMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOssUploadMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOssUploadMetaResponseBody body);

        @Override
        GetOssUploadMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOssUploadMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOssUploadMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOssUploadMetaResponse response) {
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
        public Builder body(GetOssUploadMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOssUploadMetaResponse build() {
            return new GetOssUploadMetaResponse(this);
        } 

    } 

}
