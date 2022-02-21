// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskStatusResponse</p>
 */
public class GetAsyncTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsyncTaskStatusResponseBody body;

    private GetAsyncTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncTaskStatusResponse create() {
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
    public GetAsyncTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsyncTaskStatusResponseBody body);

        @Override
        GetAsyncTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsyncTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncTaskStatusResponse response) {
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
        public Builder body(GetAsyncTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncTaskStatusResponse build() {
            return new GetAsyncTaskStatusResponse(this);
        } 

    } 

}
