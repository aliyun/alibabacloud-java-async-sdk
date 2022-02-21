// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutFunctionAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>PutFunctionAsyncInvokeConfigResponse</p>
 */
public class PutFunctionAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutFunctionAsyncInvokeConfigResponseBody body;

    private PutFunctionAsyncInvokeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutFunctionAsyncInvokeConfigResponse create() {
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
    public PutFunctionAsyncInvokeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutFunctionAsyncInvokeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutFunctionAsyncInvokeConfigResponseBody body);

        @Override
        PutFunctionAsyncInvokeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutFunctionAsyncInvokeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutFunctionAsyncInvokeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutFunctionAsyncInvokeConfigResponse response) {
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
        public Builder body(PutFunctionAsyncInvokeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutFunctionAsyncInvokeConfigResponse build() {
            return new PutFunctionAsyncInvokeConfigResponse(this);
        } 

    } 

}
