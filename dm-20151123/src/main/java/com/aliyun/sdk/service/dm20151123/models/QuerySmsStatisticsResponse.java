// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsStatisticsResponse} extends {@link TeaModel}
 *
 * <p>QuerySmsStatisticsResponse</p>
 */
public class QuerySmsStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmsStatisticsResponseBody body;

    private QuerySmsStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmsStatisticsResponse create() {
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
    public QuerySmsStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmsStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmsStatisticsResponseBody body);

        @Override
        QuerySmsStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmsStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmsStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmsStatisticsResponse response) {
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
        public Builder body(QuerySmsStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmsStatisticsResponse build() {
            return new QuerySmsStatisticsResponse(this);
        } 

    } 

}
