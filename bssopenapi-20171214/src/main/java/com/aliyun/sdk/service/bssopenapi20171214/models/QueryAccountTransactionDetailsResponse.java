// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountTransactionDetailsResponse} extends {@link TeaModel}
 *
 * <p>QueryAccountTransactionDetailsResponse</p>
 */
public class QueryAccountTransactionDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAccountTransactionDetailsResponseBody body;

    private QueryAccountTransactionDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAccountTransactionDetailsResponse create() {
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
    public QueryAccountTransactionDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAccountTransactionDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAccountTransactionDetailsResponseBody body);

        @Override
        QueryAccountTransactionDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAccountTransactionDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAccountTransactionDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAccountTransactionDetailsResponse response) {
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
        public Builder body(QueryAccountTransactionDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAccountTransactionDetailsResponse build() {
            return new QueryAccountTransactionDetailsResponse(this);
        } 

    } 

}
