// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAsyncTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteAsyncTaskResponse</p>
 */
public class DeleteAsyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAsyncTaskResponseBody body;

    private DeleteAsyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAsyncTaskResponse create() {
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
    public DeleteAsyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAsyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAsyncTaskResponseBody body);

        @Override
        DeleteAsyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAsyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAsyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAsyncTaskResponse response) {
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
        public Builder body(DeleteAsyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAsyncTaskResponse build() {
            return new DeleteAsyncTaskResponse(this);
        } 

    } 

}
