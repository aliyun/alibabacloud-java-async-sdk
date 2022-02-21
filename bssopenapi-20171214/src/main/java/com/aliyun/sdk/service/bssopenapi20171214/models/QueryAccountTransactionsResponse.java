// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionsResponse} extends {@link TeaModel}
 *
 * <p>QueryAccountTransactionsResponse</p>
 */
public class QueryAccountTransactionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAccountTransactionsResponseBody body;

    private QueryAccountTransactionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAccountTransactionsResponse create() {
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
    public QueryAccountTransactionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAccountTransactionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAccountTransactionsResponseBody body);

        @Override
        QueryAccountTransactionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAccountTransactionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAccountTransactionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAccountTransactionsResponse response) {
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
        public Builder body(QueryAccountTransactionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAccountTransactionsResponse build() {
            return new QueryAccountTransactionsResponse(this);
        } 

    } 

}
