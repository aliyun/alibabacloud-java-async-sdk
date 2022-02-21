// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainByInstanceIdResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainByInstanceIdResponse</p>
 */
public class QueryDomainByInstanceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainByInstanceIdResponseBody body;

    private QueryDomainByInstanceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainByInstanceIdResponse create() {
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
    public QueryDomainByInstanceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainByInstanceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainByInstanceIdResponseBody body);

        @Override
        QueryDomainByInstanceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainByInstanceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainByInstanceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainByInstanceIdResponse response) {
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
        public Builder body(QueryDomainByInstanceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainByInstanceIdResponse build() {
            return new QueryDomainByInstanceIdResponse(this);
        } 

    } 

}
