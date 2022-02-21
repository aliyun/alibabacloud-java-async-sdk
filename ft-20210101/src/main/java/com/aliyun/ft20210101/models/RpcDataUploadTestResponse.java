// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadTestResponse} extends {@link TeaModel}
 *
 * <p>RpcDataUploadTestResponse</p>
 */
public class RpcDataUploadTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcDataUploadTestResponseBody body;

    private RpcDataUploadTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RpcDataUploadTestResponse create() {
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
    public RpcDataUploadTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RpcDataUploadTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RpcDataUploadTestResponseBody body);

        @Override
        RpcDataUploadTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RpcDataUploadTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RpcDataUploadTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RpcDataUploadTestResponse response) {
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
        public Builder body(RpcDataUploadTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RpcDataUploadTestResponse build() {
            return new RpcDataUploadTestResponse(this);
        } 

    } 

}
