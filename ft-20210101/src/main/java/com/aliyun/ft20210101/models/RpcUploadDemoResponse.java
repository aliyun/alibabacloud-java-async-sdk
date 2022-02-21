// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcUploadDemoResponse} extends {@link TeaModel}
 *
 * <p>RpcUploadDemoResponse</p>
 */
public class RpcUploadDemoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcUploadDemoResponseBody body;

    private RpcUploadDemoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RpcUploadDemoResponse create() {
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
    public RpcUploadDemoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RpcUploadDemoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RpcUploadDemoResponseBody body);

        @Override
        RpcUploadDemoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RpcUploadDemoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RpcUploadDemoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RpcUploadDemoResponse response) {
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
        public Builder body(RpcUploadDemoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RpcUploadDemoResponse build() {
            return new RpcUploadDemoResponse(this);
        } 

    } 

}
