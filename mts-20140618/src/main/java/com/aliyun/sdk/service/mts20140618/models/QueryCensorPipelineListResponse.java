// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCensorPipelineListResponse} extends {@link TeaModel}
 *
 * <p>QueryCensorPipelineListResponse</p>
 */
public class QueryCensorPipelineListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCensorPipelineListResponseBody body;

    private QueryCensorPipelineListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCensorPipelineListResponse create() {
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
    public QueryCensorPipelineListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCensorPipelineListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCensorPipelineListResponseBody body);

        @Override
        QueryCensorPipelineListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCensorPipelineListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCensorPipelineListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCensorPipelineListResponse response) {
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
        public Builder body(QueryCensorPipelineListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCensorPipelineListResponse build() {
            return new QueryCensorPipelineListResponse(this);
        } 

    } 

}
