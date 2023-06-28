// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryComponentPerformanceResponse} extends {@link TeaModel}
 *
 * <p>QueryComponentPerformanceResponse</p>
 */
public class QueryComponentPerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryComponentPerformanceResponseBody body;

    private QueryComponentPerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryComponentPerformanceResponse create() {
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
    public QueryComponentPerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryComponentPerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryComponentPerformanceResponseBody body);

        @Override
        QueryComponentPerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryComponentPerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryComponentPerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryComponentPerformanceResponse response) {
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
        public Builder body(QueryComponentPerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryComponentPerformanceResponse build() {
            return new QueryComponentPerformanceResponse(this);
        } 

    } 

}
