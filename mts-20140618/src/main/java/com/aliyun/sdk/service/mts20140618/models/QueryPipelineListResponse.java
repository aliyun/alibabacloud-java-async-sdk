// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPipelineListResponse} extends {@link TeaModel}
 *
 * <p>QueryPipelineListResponse</p>
 */
public class QueryPipelineListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPipelineListResponseBody body;

    private QueryPipelineListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPipelineListResponse create() {
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
    public QueryPipelineListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPipelineListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPipelineListResponseBody body);

        @Override
        QueryPipelineListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPipelineListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPipelineListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPipelineListResponse response) {
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
        public Builder body(QueryPipelineListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPipelineListResponse build() {
            return new QueryPipelineListResponse(this);
        } 

    } 

}
