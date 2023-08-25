// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadOssUrlResponse} extends {@link TeaModel}
 *
 * <p>GetUploadOssUrlResponse</p>
 */
public class GetUploadOssUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUploadOssUrlResponseBody body;

    private GetUploadOssUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUploadOssUrlResponse create() {
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
    public GetUploadOssUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUploadOssUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUploadOssUrlResponseBody body);

        @Override
        GetUploadOssUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUploadOssUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUploadOssUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUploadOssUrlResponse response) {
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
        public Builder body(GetUploadOssUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUploadOssUrlResponse build() {
            return new GetUploadOssUrlResponse(this);
        } 

    } 

}
