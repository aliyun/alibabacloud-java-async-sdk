// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskInfoHistoryResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskInfoHistoryResponse</p>
 */
public class QueryTaskInfoHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskInfoHistoryResponseBody body;

    private QueryTaskInfoHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskInfoHistoryResponse create() {
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
    public QueryTaskInfoHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskInfoHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskInfoHistoryResponseBody body);

        @Override
        QueryTaskInfoHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskInfoHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskInfoHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskInfoHistoryResponse response) {
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
        public Builder body(QueryTaskInfoHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskInfoHistoryResponse build() {
            return new QueryTaskInfoHistoryResponse(this);
        } 

    } 

}
