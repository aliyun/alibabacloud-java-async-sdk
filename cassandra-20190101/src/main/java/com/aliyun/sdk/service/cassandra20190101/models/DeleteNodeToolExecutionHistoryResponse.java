// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodeToolExecutionHistoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteNodeToolExecutionHistoryResponse</p>
 */
public class DeleteNodeToolExecutionHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNodeToolExecutionHistoryResponseBody body;

    private DeleteNodeToolExecutionHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNodeToolExecutionHistoryResponse create() {
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
    public DeleteNodeToolExecutionHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNodeToolExecutionHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNodeToolExecutionHistoryResponseBody body);

        @Override
        DeleteNodeToolExecutionHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNodeToolExecutionHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNodeToolExecutionHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNodeToolExecutionHistoryResponse response) {
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
        public Builder body(DeleteNodeToolExecutionHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNodeToolExecutionHistoryResponse build() {
            return new DeleteNodeToolExecutionHistoryResponse(this);
        } 

    } 

}
