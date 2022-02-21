// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushStatByMsgResponse} extends {@link TeaModel}
 *
 * <p>QueryPushStatByMsgResponse</p>
 */
public class QueryPushStatByMsgResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPushStatByMsgResponseBody body;

    private QueryPushStatByMsgResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPushStatByMsgResponse create() {
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
    public QueryPushStatByMsgResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushStatByMsgResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPushStatByMsgResponseBody body);

        @Override
        QueryPushStatByMsgResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushStatByMsgResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPushStatByMsgResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushStatByMsgResponse response) {
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
        public Builder body(QueryPushStatByMsgResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushStatByMsgResponse build() {
            return new QueryPushStatByMsgResponse(this);
        } 

    } 

}
