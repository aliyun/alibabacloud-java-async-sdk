// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryExceptionHistoryResponse} extends {@link TeaModel}
 *
 * <p>QueryExceptionHistoryResponse</p>
 */
public class QueryExceptionHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryExceptionHistoryResponseBody body;

    private QueryExceptionHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryExceptionHistoryResponse create() {
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
    public QueryExceptionHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryExceptionHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryExceptionHistoryResponseBody body);

        @Override
        QueryExceptionHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryExceptionHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryExceptionHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryExceptionHistoryResponse response) {
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
        public Builder body(QueryExceptionHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryExceptionHistoryResponse build() {
            return new QueryExceptionHistoryResponse(this);
        } 

    } 

}
