// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByDomainNameResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainByDomainNameResponse</p>
 */
public class QueryDomainByDomainNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainByDomainNameResponseBody body;

    private QueryDomainByDomainNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainByDomainNameResponse create() {
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
    public QueryDomainByDomainNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainByDomainNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainByDomainNameResponseBody body);

        @Override
        QueryDomainByDomainNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainByDomainNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainByDomainNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainByDomainNameResponse response) {
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
        public Builder body(QueryDomainByDomainNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainByDomainNameResponse build() {
            return new QueryDomainByDomainNameResponse(this);
        } 

    } 

}
