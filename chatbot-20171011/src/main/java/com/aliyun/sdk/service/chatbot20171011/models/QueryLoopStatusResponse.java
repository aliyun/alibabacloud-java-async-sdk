// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoopStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryLoopStatusResponse</p>
 */
public class QueryLoopStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLoopStatusResponseBody body;

    private QueryLoopStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLoopStatusResponse create() {
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
    public QueryLoopStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLoopStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLoopStatusResponseBody body);

        @Override
        QueryLoopStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLoopStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLoopStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLoopStatusResponse response) {
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
        public Builder body(QueryLoopStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLoopStatusResponse build() {
            return new QueryLoopStatusResponse(this);
        } 

    } 

}
