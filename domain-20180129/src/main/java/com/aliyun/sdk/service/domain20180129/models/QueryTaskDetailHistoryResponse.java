// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailHistoryResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailHistoryResponse</p>
 */
public class QueryTaskDetailHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskDetailHistoryResponseBody body;

    private QueryTaskDetailHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskDetailHistoryResponse create() {
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
    public QueryTaskDetailHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskDetailHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskDetailHistoryResponseBody body);

        @Override
        QueryTaskDetailHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskDetailHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskDetailHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskDetailHistoryResponse response) {
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
        public Builder body(QueryTaskDetailHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskDetailHistoryResponse build() {
            return new QueryTaskDetailHistoryResponse(this);
        } 

    } 

}
