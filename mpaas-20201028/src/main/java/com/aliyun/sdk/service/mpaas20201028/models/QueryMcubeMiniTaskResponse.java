// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcubeMiniTaskResponse} extends {@link TeaModel}
 *
 * <p>QueryMcubeMiniTaskResponse</p>
 */
public class QueryMcubeMiniTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMcubeMiniTaskResponseBody body;

    private QueryMcubeMiniTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMcubeMiniTaskResponse create() {
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
    public QueryMcubeMiniTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcubeMiniTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMcubeMiniTaskResponseBody body);

        @Override
        QueryMcubeMiniTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcubeMiniTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMcubeMiniTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcubeMiniTaskResponse response) {
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
        public Builder body(QueryMcubeMiniTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcubeMiniTaskResponse build() {
            return new QueryMcubeMiniTaskResponse(this);
        } 

    } 

}
