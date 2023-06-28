// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReportPerformanceResponse} extends {@link TeaModel}
 *
 * <p>QueryReportPerformanceResponse</p>
 */
public class QueryReportPerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryReportPerformanceResponseBody body;

    private QueryReportPerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryReportPerformanceResponse create() {
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
    public QueryReportPerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryReportPerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryReportPerformanceResponseBody body);

        @Override
        QueryReportPerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryReportPerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryReportPerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryReportPerformanceResponse response) {
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
        public Builder body(QueryReportPerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryReportPerformanceResponse build() {
            return new QueryReportPerformanceResponse(this);
        } 

    } 

}
