// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySingleReportResponse} extends {@link TeaModel}
 *
 * <p>QuerySingleReportResponse</p>
 */
public class QuerySingleReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySingleReportResponseBody body;

    private QuerySingleReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySingleReportResponse create() {
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
    public QuerySingleReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySingleReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySingleReportResponseBody body);

        @Override
        QuerySingleReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySingleReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySingleReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySingleReportResponse response) {
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
        public Builder body(QuerySingleReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySingleReportResponse build() {
            return new QuerySingleReportResponse(this);
        } 

    } 

}
