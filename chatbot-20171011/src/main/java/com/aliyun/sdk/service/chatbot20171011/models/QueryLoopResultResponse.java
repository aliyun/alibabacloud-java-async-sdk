// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopResultResponse} extends {@link TeaModel}
 *
 * <p>QueryLoopResultResponse</p>
 */
public class QueryLoopResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLoopResultResponseBody body;

    private QueryLoopResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLoopResultResponse create() {
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
    public QueryLoopResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLoopResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLoopResultResponseBody body);

        @Override
        QueryLoopResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLoopResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLoopResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLoopResultResponse response) {
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
        public Builder body(QueryLoopResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLoopResultResponse build() {
            return new QueryLoopResultResponse(this);
        } 

    } 

}
