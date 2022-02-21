// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushRecordsResponse} extends {@link TeaModel}
 *
 * <p>QueryPushRecordsResponse</p>
 */
public class QueryPushRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPushRecordsResponseBody body;

    private QueryPushRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPushRecordsResponse create() {
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
    public QueryPushRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPushRecordsResponseBody body);

        @Override
        QueryPushRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPushRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushRecordsResponse response) {
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
        public Builder body(QueryPushRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushRecordsResponse build() {
            return new QueryPushRecordsResponse(this);
        } 

    } 

}
