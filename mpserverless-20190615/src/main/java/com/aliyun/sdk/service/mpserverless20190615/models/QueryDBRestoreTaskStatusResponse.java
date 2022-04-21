// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBRestoreTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDBRestoreTaskStatusResponse</p>
 */
public class QueryDBRestoreTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDBRestoreTaskStatusResponseBody body;

    private QueryDBRestoreTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDBRestoreTaskStatusResponse create() {
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
    public QueryDBRestoreTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDBRestoreTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDBRestoreTaskStatusResponseBody body);

        @Override
        QueryDBRestoreTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDBRestoreTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDBRestoreTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDBRestoreTaskStatusResponse response) {
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
        public Builder body(QueryDBRestoreTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDBRestoreTaskStatusResponse build() {
            return new QueryDBRestoreTaskStatusResponse(this);
        } 

    } 

}
