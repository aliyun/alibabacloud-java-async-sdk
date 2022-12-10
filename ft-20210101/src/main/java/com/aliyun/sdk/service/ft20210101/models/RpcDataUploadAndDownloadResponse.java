// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadAndDownloadResponse} extends {@link TeaModel}
 *
 * <p>RpcDataUploadAndDownloadResponse</p>
 */
public class RpcDataUploadAndDownloadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcDataUploadAndDownloadResponseBody body;

    private RpcDataUploadAndDownloadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RpcDataUploadAndDownloadResponse create() {
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
    public RpcDataUploadAndDownloadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RpcDataUploadAndDownloadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RpcDataUploadAndDownloadResponseBody body);

        @Override
        RpcDataUploadAndDownloadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RpcDataUploadAndDownloadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RpcDataUploadAndDownloadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RpcDataUploadAndDownloadResponse response) {
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
        public Builder body(RpcDataUploadAndDownloadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RpcDataUploadAndDownloadResponse build() {
            return new RpcDataUploadAndDownloadResponse(this);
        } 

    } 

}
