// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionTaskResponse</p>
 */
public class DeleteFunctionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFunctionTaskResponseBody body;

    private DeleteFunctionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFunctionTaskResponse create() {
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
    public DeleteFunctionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFunctionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFunctionTaskResponseBody body);

        @Override
        DeleteFunctionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFunctionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFunctionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFunctionTaskResponse response) {
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
        public Builder body(DeleteFunctionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFunctionTaskResponse build() {
            return new DeleteFunctionTaskResponse(this);
        } 

    } 

}
