// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBalanceResponse} extends {@link TeaModel}
 *
 * <p>QueryAccountBalanceResponse</p>
 */
public class QueryAccountBalanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAccountBalanceResponseBody body;

    private QueryAccountBalanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAccountBalanceResponse create() {
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
    public QueryAccountBalanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAccountBalanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAccountBalanceResponseBody body);

        @Override
        QueryAccountBalanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAccountBalanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAccountBalanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAccountBalanceResponse response) {
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
        public Builder body(QueryAccountBalanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAccountBalanceResponse build() {
            return new QueryAccountBalanceResponse(this);
        } 

    } 

}
