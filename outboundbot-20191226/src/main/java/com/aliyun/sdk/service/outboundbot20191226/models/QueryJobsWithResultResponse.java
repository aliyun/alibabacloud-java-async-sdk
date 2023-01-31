// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobsWithResultResponse} extends {@link TeaModel}
 *
 * <p>QueryJobsWithResultResponse</p>
 */
public class QueryJobsWithResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJobsWithResultResponseBody body;

    private QueryJobsWithResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJobsWithResultResponse create() {
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
    public QueryJobsWithResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJobsWithResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJobsWithResultResponseBody body);

        @Override
        QueryJobsWithResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJobsWithResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJobsWithResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJobsWithResultResponse response) {
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
        public Builder body(QueryJobsWithResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJobsWithResultResponse build() {
            return new QueryJobsWithResultResponse(this);
        } 

    } 

}
