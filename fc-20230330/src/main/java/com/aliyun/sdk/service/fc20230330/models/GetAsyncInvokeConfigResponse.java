// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncInvokeConfigResponse</p>
 */
public class GetAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AsyncConfig body;

    private GetAsyncInvokeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncInvokeConfigResponse create() {
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
    public AsyncConfig getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncInvokeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AsyncConfig body);

        @Override
        GetAsyncInvokeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncInvokeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AsyncConfig body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncInvokeConfigResponse response) {
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
        public Builder body(AsyncConfig body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncInvokeConfigResponse build() {
            return new GetAsyncInvokeConfigResponse(this);
        } 

    } 

}
