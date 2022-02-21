// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainRealNameVerificationInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryDomainRealNameVerificationInfoResponse</p>
 */
public class QueryDomainRealNameVerificationInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDomainRealNameVerificationInfoResponseBody body;

    private QueryDomainRealNameVerificationInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDomainRealNameVerificationInfoResponse create() {
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
    public QueryDomainRealNameVerificationInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDomainRealNameVerificationInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDomainRealNameVerificationInfoResponseBody body);

        @Override
        QueryDomainRealNameVerificationInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDomainRealNameVerificationInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDomainRealNameVerificationInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDomainRealNameVerificationInfoResponse response) {
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
        public Builder body(QueryDomainRealNameVerificationInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDomainRealNameVerificationInfoResponse build() {
            return new QueryDomainRealNameVerificationInfoResponse(this);
        } 

    } 

}
