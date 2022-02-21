// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySnapshotJobListResponse} extends {@link TeaModel}
 *
 * <p>QuerySnapshotJobListResponse</p>
 */
public class QuerySnapshotJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySnapshotJobListResponseBody body;

    private QuerySnapshotJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySnapshotJobListResponse create() {
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
    public QuerySnapshotJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySnapshotJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySnapshotJobListResponseBody body);

        @Override
        QuerySnapshotJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySnapshotJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySnapshotJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySnapshotJobListResponse response) {
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
        public Builder body(QuerySnapshotJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySnapshotJobListResponse build() {
            return new QuerySnapshotJobListResponse(this);
        } 

    } 

}
