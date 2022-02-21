// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySyncReportAggregationResponse} extends {@link TeaModel}
 *
 * <p>QuerySyncReportAggregationResponse</p>
 */
public class QuerySyncReportAggregationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySyncReportAggregationResponseBody body;

    private QuerySyncReportAggregationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySyncReportAggregationResponse create() {
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
    public QuerySyncReportAggregationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySyncReportAggregationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySyncReportAggregationResponseBody body);

        @Override
        QuerySyncReportAggregationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySyncReportAggregationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySyncReportAggregationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySyncReportAggregationResponse response) {
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
        public Builder body(QuerySyncReportAggregationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySyncReportAggregationResponse build() {
            return new QuerySyncReportAggregationResponse(this);
        } 

    } 

}
