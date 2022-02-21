// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestListByCodeResponse} extends {@link TeaModel}
 *
 * <p>GetAsyncErrorRequestListByCodeResponse</p>
 */
public class GetAsyncErrorRequestListByCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAsyncErrorRequestListByCodeResponseBody body;

    private GetAsyncErrorRequestListByCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAsyncErrorRequestListByCodeResponse create() {
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
    public GetAsyncErrorRequestListByCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAsyncErrorRequestListByCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAsyncErrorRequestListByCodeResponseBody body);

        @Override
        GetAsyncErrorRequestListByCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAsyncErrorRequestListByCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAsyncErrorRequestListByCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAsyncErrorRequestListByCodeResponse response) {
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
        public Builder body(GetAsyncErrorRequestListByCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAsyncErrorRequestListByCodeResponse build() {
            return new GetAsyncErrorRequestListByCodeResponse(this);
        } 

    } 

}
