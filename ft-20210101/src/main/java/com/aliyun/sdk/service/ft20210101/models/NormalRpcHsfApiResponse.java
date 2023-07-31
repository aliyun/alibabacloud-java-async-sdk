// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NormalRpcHsfApiResponse} extends {@link TeaModel}
 *
 * <p>NormalRpcHsfApiResponse</p>
 */
public class NormalRpcHsfApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NormalRpcHsfApiResponseBody body;

    private NormalRpcHsfApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static NormalRpcHsfApiResponse create() {
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
    public NormalRpcHsfApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<NormalRpcHsfApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(NormalRpcHsfApiResponseBody body);

        @Override
        NormalRpcHsfApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<NormalRpcHsfApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private NormalRpcHsfApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(NormalRpcHsfApiResponse response) {
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
        public Builder body(NormalRpcHsfApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public NormalRpcHsfApiResponse build() {
            return new NormalRpcHsfApiResponse(this);
        } 

    } 

}
