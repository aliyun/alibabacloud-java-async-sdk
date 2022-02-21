// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainListResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainListResponse</p>
 */
public class QueryDomainListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainListResponseBody body;

    private QueryDomainListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainListResponse create() {
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
    public QueryDomainListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainListResponseBody body);

        @Override
        QueryDomainListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainListResponse response) {
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
        public Builder body(QueryDomainListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainListResponse build() {
            return new QueryDomainListResponse(this);
        } 

    } 

}
