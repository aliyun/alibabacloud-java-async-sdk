// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySingleAggregationReportResponse} extends {@link TeaModel}
 *
 * <p>QuerySingleAggregationReportResponse</p>
 */
public class QuerySingleAggregationReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySingleAggregationReportResponseBody body;

    private QuerySingleAggregationReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySingleAggregationReportResponse create() {
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
    public QuerySingleAggregationReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySingleAggregationReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySingleAggregationReportResponseBody body);

        @Override
        QuerySingleAggregationReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySingleAggregationReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySingleAggregationReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySingleAggregationReportResponse response) {
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
        public Builder body(QuerySingleAggregationReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySingleAggregationReportResponse build() {
            return new QuerySingleAggregationReportResponse(this);
        } 

    } 

}
