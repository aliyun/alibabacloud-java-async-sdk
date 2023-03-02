// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcNoDefaultErrorCodeApiResponse} extends {@link TeaModel}
 *
 * <p>RpcNoDefaultErrorCodeApiResponse</p>
 */
public class RpcNoDefaultErrorCodeApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RpcNoDefaultErrorCodeApiResponseBody body;

    private RpcNoDefaultErrorCodeApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RpcNoDefaultErrorCodeApiResponse create() {
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
    public RpcNoDefaultErrorCodeApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RpcNoDefaultErrorCodeApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RpcNoDefaultErrorCodeApiResponseBody body);

        @Override
        RpcNoDefaultErrorCodeApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RpcNoDefaultErrorCodeApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RpcNoDefaultErrorCodeApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RpcNoDefaultErrorCodeApiResponse response) {
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
        public Builder body(RpcNoDefaultErrorCodeApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RpcNoDefaultErrorCodeApiResponse build() {
            return new RpcNoDefaultErrorCodeApiResponse(this);
        } 

    } 

}
