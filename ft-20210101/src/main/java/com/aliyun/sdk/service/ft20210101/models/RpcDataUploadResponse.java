// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadResponse} extends {@link TeaModel}
 *
 * <p>RpcDataUploadResponse</p>
 */
public class RpcDataUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcDataUploadResponseBody body;

    private RpcDataUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RpcDataUploadResponse create() {
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
    public RpcDataUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RpcDataUploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RpcDataUploadResponseBody body);

        @Override
        RpcDataUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RpcDataUploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RpcDataUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RpcDataUploadResponse response) {
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
        public Builder body(RpcDataUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RpcDataUploadResponse build() {
            return new RpcDataUploadResponse(this);
        } 

    } 

}
