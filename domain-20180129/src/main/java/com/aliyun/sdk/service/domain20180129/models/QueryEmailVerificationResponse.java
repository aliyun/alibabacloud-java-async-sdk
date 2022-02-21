// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmailVerificationResponse} extends {@link TeaModel}
 *
 * <p>QueryEmailVerificationResponse</p>
 */
public class QueryEmailVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEmailVerificationResponseBody body;

    private QueryEmailVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEmailVerificationResponse create() {
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
    public QueryEmailVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEmailVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEmailVerificationResponseBody body);

        @Override
        QueryEmailVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEmailVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEmailVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEmailVerificationResponse response) {
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
        public Builder body(QueryEmailVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEmailVerificationResponse build() {
            return new QueryEmailVerificationResponse(this);
        } 

    } 

}
