// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopListResponse} extends {@link TeaModel}
 *
 * <p>QueryLoopListResponse</p>
 */
public class QueryLoopListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLoopListResponseBody body;

    private QueryLoopListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLoopListResponse create() {
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
    public QueryLoopListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLoopListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLoopListResponseBody body);

        @Override
        QueryLoopListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLoopListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLoopListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLoopListResponse response) {
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
        public Builder body(QueryLoopListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLoopListResponse build() {
            return new QueryLoopListResponse(this);
        } 

    } 

}
