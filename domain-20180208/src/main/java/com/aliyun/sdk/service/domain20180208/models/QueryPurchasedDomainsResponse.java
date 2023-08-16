// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPurchasedDomainsResponse} extends {@link TeaModel}
 *
 * <p>QueryPurchasedDomainsResponse</p>
 */
public class QueryPurchasedDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPurchasedDomainsResponseBody body;

    private QueryPurchasedDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPurchasedDomainsResponse create() {
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
    public QueryPurchasedDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPurchasedDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPurchasedDomainsResponseBody body);

        @Override
        QueryPurchasedDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPurchasedDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPurchasedDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPurchasedDomainsResponse response) {
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
        public Builder body(QueryPurchasedDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPurchasedDomainsResponse build() {
            return new QueryPurchasedDomainsResponse(this);
        } 

    } 

}
