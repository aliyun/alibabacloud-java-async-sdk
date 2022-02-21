// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegistrantProfileRealNameVerificationInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfileRealNameVerificationInfoResponse</p>
 */
public class QueryRegistrantProfileRealNameVerificationInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRegistrantProfileRealNameVerificationInfoResponseBody body;

    private QueryRegistrantProfileRealNameVerificationInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRegistrantProfileRealNameVerificationInfoResponse create() {
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
    public QueryRegistrantProfileRealNameVerificationInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRegistrantProfileRealNameVerificationInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRegistrantProfileRealNameVerificationInfoResponseBody body);

        @Override
        QueryRegistrantProfileRealNameVerificationInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRegistrantProfileRealNameVerificationInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRegistrantProfileRealNameVerificationInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRegistrantProfileRealNameVerificationInfoResponse response) {
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
        public Builder body(QueryRegistrantProfileRealNameVerificationInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRegistrantProfileRealNameVerificationInfoResponse build() {
            return new QueryRegistrantProfileRealNameVerificationInfoResponse(this);
        } 

    } 

}
