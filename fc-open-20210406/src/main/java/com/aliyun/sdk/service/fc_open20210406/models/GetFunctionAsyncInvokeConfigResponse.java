// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionAsyncInvokeConfigResponse</p>
 */
public class GetFunctionAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionAsyncInvokeConfigResponseBody body;

    private GetFunctionAsyncInvokeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionAsyncInvokeConfigResponse create() {
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
    public GetFunctionAsyncInvokeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionAsyncInvokeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionAsyncInvokeConfigResponseBody body);

        @Override
        GetFunctionAsyncInvokeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionAsyncInvokeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionAsyncInvokeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionAsyncInvokeConfigResponse response) {
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
        public Builder body(GetFunctionAsyncInvokeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionAsyncInvokeConfigResponse build() {
            return new GetFunctionAsyncInvokeConfigResponse(this);
        } 

    } 

}
