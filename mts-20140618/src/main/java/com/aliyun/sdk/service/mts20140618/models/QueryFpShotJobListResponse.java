// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFpShotJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryFpShotJobListResponse</p>
 */
public class QueryFpShotJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFpShotJobListResponseBody body;

    private QueryFpShotJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFpShotJobListResponse create() {
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
    public QueryFpShotJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFpShotJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFpShotJobListResponseBody body);

        @Override
        QueryFpShotJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFpShotJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFpShotJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFpShotJobListResponse response) {
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
        public Builder body(QueryFpShotJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFpShotJobListResponse build() {
            return new QueryFpShotJobListResponse(this);
        } 

    } 

}
