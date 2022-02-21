// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainSuffixResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainSuffixResponse</p>
 */
public class QueryDomainSuffixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainSuffixResponseBody body;

    private QueryDomainSuffixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainSuffixResponse create() {
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
    public QueryDomainSuffixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainSuffixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainSuffixResponseBody body);

        @Override
        QueryDomainSuffixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainSuffixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainSuffixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainSuffixResponse response) {
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
        public Builder body(QueryDomainSuffixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainSuffixResponse build() {
            return new QueryDomainSuffixResponse(this);
        } 

    } 

}
