// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMetricByPageResponse} extends {@link TeaModel}
 *
 * <p>QueryMetricByPageResponse</p>
 */
public class QueryMetricByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMetricByPageResponseBody body;

    private QueryMetricByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMetricByPageResponse create() {
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
    public QueryMetricByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMetricByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMetricByPageResponseBody body);

        @Override
        QueryMetricByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMetricByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMetricByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMetricByPageResponse response) {
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
        public Builder body(QueryMetricByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMetricByPageResponse build() {
            return new QueryMetricByPageResponse(this);
        } 

    } 

}
