// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAsyncPredictResponse} extends {@link TeaModel}
 *
 * <p>CreateAsyncPredictResponse</p>
 */
public class CreateAsyncPredictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAsyncPredictResponseBody body;

    private CreateAsyncPredictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAsyncPredictResponse create() {
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
    public CreateAsyncPredictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAsyncPredictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAsyncPredictResponseBody body);

        @Override
        CreateAsyncPredictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAsyncPredictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAsyncPredictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAsyncPredictResponse response) {
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
        public Builder body(CreateAsyncPredictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAsyncPredictResponse build() {
            return new CreateAsyncPredictResponse(this);
        } 

    } 

}
