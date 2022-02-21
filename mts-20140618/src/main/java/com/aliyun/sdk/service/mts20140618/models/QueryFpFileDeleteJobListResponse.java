// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFpFileDeleteJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryFpFileDeleteJobListResponse</p>
 */
public class QueryFpFileDeleteJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFpFileDeleteJobListResponseBody body;

    private QueryFpFileDeleteJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFpFileDeleteJobListResponse create() {
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
    public QueryFpFileDeleteJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFpFileDeleteJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFpFileDeleteJobListResponseBody body);

        @Override
        QueryFpFileDeleteJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFpFileDeleteJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFpFileDeleteJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFpFileDeleteJobListResponse response) {
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
        public Builder body(QueryFpFileDeleteJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFpFileDeleteJobListResponse build() {
            return new QueryFpFileDeleteJobListResponse(this);
        } 

    } 

}
