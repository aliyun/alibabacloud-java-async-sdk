// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushSchedulerListResponse} extends {@link TeaModel}
 *
 * <p>QueryPushSchedulerListResponse</p>
 */
public class QueryPushSchedulerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPushSchedulerListResponseBody body;

    private QueryPushSchedulerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPushSchedulerListResponse create() {
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
    public QueryPushSchedulerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushSchedulerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPushSchedulerListResponseBody body);

        @Override
        QueryPushSchedulerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushSchedulerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPushSchedulerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushSchedulerListResponse response) {
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
        public Builder body(QueryPushSchedulerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushSchedulerListResponse build() {
            return new QueryPushSchedulerListResponse(this);
        } 

    } 

}
