// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobStatisticsResponse} extends {@link TeaModel}
 *
 * <p>QueryJobStatisticsResponse</p>
 */
public class QueryJobStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJobStatisticsResponseBody body;

    private QueryJobStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJobStatisticsResponse create() {
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
    public QueryJobStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJobStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJobStatisticsResponseBody body);

        @Override
        QueryJobStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJobStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJobStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJobStatisticsResponse response) {
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
        public Builder body(QueryJobStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJobStatisticsResponse build() {
            return new QueryJobStatisticsResponse(this);
        } 

    } 

}
