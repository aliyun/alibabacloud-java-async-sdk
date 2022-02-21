// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestStatByCodeResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncErrorRequestStatByCodeResponse</p>
 */
public class GetAsyncErrorRequestStatByCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsyncErrorRequestStatByCodeResponseBody body;

    private GetAsyncErrorRequestStatByCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncErrorRequestStatByCodeResponse create() {
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
    public GetAsyncErrorRequestStatByCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncErrorRequestStatByCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsyncErrorRequestStatByCodeResponseBody body);

        @Override
        GetAsyncErrorRequestStatByCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncErrorRequestStatByCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsyncErrorRequestStatByCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncErrorRequestStatByCodeResponse response) {
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
        public Builder body(GetAsyncErrorRequestStatByCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncErrorRequestStatByCodeResponse build() {
            return new GetAsyncErrorRequestStatByCodeResponse(this);
        } 

    } 

}
