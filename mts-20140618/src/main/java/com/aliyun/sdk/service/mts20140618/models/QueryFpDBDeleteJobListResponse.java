// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFpDBDeleteJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryFpDBDeleteJobListResponse</p>
 */
public class QueryFpDBDeleteJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFpDBDeleteJobListResponseBody body;

    private QueryFpDBDeleteJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFpDBDeleteJobListResponse create() {
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
    public QueryFpDBDeleteJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFpDBDeleteJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFpDBDeleteJobListResponseBody body);

        @Override
        QueryFpDBDeleteJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFpDBDeleteJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFpDBDeleteJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFpDBDeleteJobListResponse response) {
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
        public Builder body(QueryFpDBDeleteJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFpDBDeleteJobListResponse build() {
            return new QueryFpDBDeleteJobListResponse(this);
        } 

    } 

}
