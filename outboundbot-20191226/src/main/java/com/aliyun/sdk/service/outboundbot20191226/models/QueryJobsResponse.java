// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobsResponse} extends {@link TeaModel}
 *
 * <p>QueryJobsResponse</p>
 */
public class QueryJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJobsResponseBody body;

    private QueryJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJobsResponse create() {
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
    public QueryJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJobsResponseBody body);

        @Override
        QueryJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJobsResponse response) {
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
        public Builder body(QueryJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJobsResponse build() {
            return new QueryJobsResponse(this);
        } 

    } 

}
