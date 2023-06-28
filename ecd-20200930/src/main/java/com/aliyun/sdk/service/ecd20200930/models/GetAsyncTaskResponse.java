// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTaskResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskResponse</p>
 */
public class GetAsyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsyncTaskResponseBody body;

    private GetAsyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncTaskResponse create() {
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
    public GetAsyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsyncTaskResponseBody body);

        @Override
        GetAsyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncTaskResponse response) {
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
        public Builder body(GetAsyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncTaskResponse build() {
            return new GetAsyncTaskResponse(this);
        } 

    } 

}
