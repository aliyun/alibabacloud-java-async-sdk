// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAsyncTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateAsyncTaskResponse</p>
 */
public class CreateAsyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAsyncTaskResponseBody body;

    private CreateAsyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAsyncTaskResponse create() {
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
    public CreateAsyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAsyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAsyncTaskResponseBody body);

        @Override
        CreateAsyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAsyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAsyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAsyncTaskResponse response) {
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
        public Builder body(CreateAsyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAsyncTaskResponse build() {
            return new CreateAsyncTaskResponse(this);
        } 

    } 

}
