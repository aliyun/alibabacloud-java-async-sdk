// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RRpcResponse} extends {@link TeaModel}
 *
 * <p>RRpcResponse</p>
 */
public class RRpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RRpcResponseBody body;

    private RRpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RRpcResponse create() {
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
    public RRpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RRpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RRpcResponseBody body);

        @Override
        RRpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RRpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RRpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RRpcResponse response) {
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
        public Builder body(RRpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RRpcResponse build() {
            return new RRpcResponse(this);
        } 

    } 

}
