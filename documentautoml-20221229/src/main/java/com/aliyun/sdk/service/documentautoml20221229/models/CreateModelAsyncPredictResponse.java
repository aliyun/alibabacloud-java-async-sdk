// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelAsyncPredictResponse} extends {@link TeaModel}
 *
 * <p>CreateModelAsyncPredictResponse</p>
 */
public class CreateModelAsyncPredictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelAsyncPredictResponseBody body;

    private CreateModelAsyncPredictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelAsyncPredictResponse create() {
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
    public CreateModelAsyncPredictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelAsyncPredictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelAsyncPredictResponseBody body);

        @Override
        CreateModelAsyncPredictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelAsyncPredictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelAsyncPredictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelAsyncPredictResponse response) {
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
        public Builder body(CreateModelAsyncPredictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelAsyncPredictResponse build() {
            return new CreateModelAsyncPredictResponse(this);
        } 

    } 

}
