// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelAsyncPredictResponse} extends {@link TeaModel}
 *
 * <p>GetModelAsyncPredictResponse</p>
 */
public class GetModelAsyncPredictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelAsyncPredictResponseBody body;

    private GetModelAsyncPredictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelAsyncPredictResponse create() {
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
    public GetModelAsyncPredictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelAsyncPredictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelAsyncPredictResponseBody body);

        @Override
        GetModelAsyncPredictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelAsyncPredictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelAsyncPredictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelAsyncPredictResponse response) {
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
        public Builder body(GetModelAsyncPredictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelAsyncPredictResponse build() {
            return new GetModelAsyncPredictResponse(this);
        } 

    } 

}
