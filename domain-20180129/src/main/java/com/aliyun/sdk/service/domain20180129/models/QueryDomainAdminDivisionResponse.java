// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainAdminDivisionResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainAdminDivisionResponse</p>
 */
public class QueryDomainAdminDivisionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainAdminDivisionResponseBody body;

    private QueryDomainAdminDivisionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainAdminDivisionResponse create() {
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
    public QueryDomainAdminDivisionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainAdminDivisionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainAdminDivisionResponseBody body);

        @Override
        QueryDomainAdminDivisionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainAdminDivisionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainAdminDivisionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainAdminDivisionResponse response) {
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
        public Builder body(QueryDomainAdminDivisionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainAdminDivisionResponse build() {
            return new QueryDomainAdminDivisionResponse(this);
        } 

    } 

}
