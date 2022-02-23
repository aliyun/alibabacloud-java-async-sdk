// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySqlAnalysisDataResponse} extends {@link TeaModel}
 *
 * <p>QuerySqlAnalysisDataResponse</p>
 */
public class QuerySqlAnalysisDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySqlAnalysisDataResponseBody body;

    private QuerySqlAnalysisDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySqlAnalysisDataResponse create() {
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
    public QuerySqlAnalysisDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySqlAnalysisDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySqlAnalysisDataResponseBody body);

        @Override
        QuerySqlAnalysisDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySqlAnalysisDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySqlAnalysisDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySqlAnalysisDataResponse response) {
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
        public Builder body(QuerySqlAnalysisDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySqlAnalysisDataResponse build() {
            return new QuerySqlAnalysisDataResponse(this);
        } 

    } 

}
