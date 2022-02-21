// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncResultResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncResultResponse</p>
 */
public class GetAsyncResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsyncResultResponseBody body;

    private GetAsyncResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncResultResponse create() {
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
    public GetAsyncResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsyncResultResponseBody body);

        @Override
        GetAsyncResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsyncResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncResultResponse response) {
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
        public Builder body(GetAsyncResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncResultResponse build() {
            return new GetAsyncResultResponse(this);
        } 

    } 

}
