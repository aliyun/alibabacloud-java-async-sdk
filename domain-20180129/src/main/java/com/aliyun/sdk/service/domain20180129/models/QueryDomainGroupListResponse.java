// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainGroupListResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainGroupListResponse</p>
 */
public class QueryDomainGroupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainGroupListResponseBody body;

    private QueryDomainGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainGroupListResponse create() {
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
    public QueryDomainGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainGroupListResponseBody body);

        @Override
        QueryDomainGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainGroupListResponse response) {
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
        public Builder body(QueryDomainGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainGroupListResponse build() {
            return new QueryDomainGroupListResponse(this);
        } 

    } 

}
