// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryServerLockResponse} extends {@link TeaModel}
 *
 * <p>QueryServerLockResponse</p>
 */
public class QueryServerLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryServerLockResponseBody body;

    private QueryServerLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryServerLockResponse create() {
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
    public QueryServerLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryServerLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryServerLockResponseBody body);

        @Override
        QueryServerLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryServerLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryServerLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryServerLockResponse response) {
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
        public Builder body(QueryServerLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryServerLockResponse build() {
            return new QueryServerLockResponse(this);
        } 

    } 

}
