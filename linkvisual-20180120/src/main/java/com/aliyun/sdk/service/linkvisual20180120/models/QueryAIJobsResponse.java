// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIJobsResponse} extends {@link TeaModel}
 *
 * <p>QueryAIJobsResponse</p>
 */
public class QueryAIJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAIJobsResponseBody body;

    private QueryAIJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAIJobsResponse create() {
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
    public QueryAIJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAIJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAIJobsResponseBody body);

        @Override
        QueryAIJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAIJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAIJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAIJobsResponse response) {
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
        public Builder body(QueryAIJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAIJobsResponse build() {
            return new QueryAIJobsResponse(this);
        } 

    } 

}
