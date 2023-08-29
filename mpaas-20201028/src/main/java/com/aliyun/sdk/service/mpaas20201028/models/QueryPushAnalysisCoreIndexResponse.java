// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushAnalysisCoreIndexResponse} extends {@link TeaModel}
 *
 * <p>QueryPushAnalysisCoreIndexResponse</p>
 */
public class QueryPushAnalysisCoreIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPushAnalysisCoreIndexResponseBody body;

    private QueryPushAnalysisCoreIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPushAnalysisCoreIndexResponse create() {
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
    public QueryPushAnalysisCoreIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushAnalysisCoreIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPushAnalysisCoreIndexResponseBody body);

        @Override
        QueryPushAnalysisCoreIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushAnalysisCoreIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPushAnalysisCoreIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushAnalysisCoreIndexResponse response) {
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
        public Builder body(QueryPushAnalysisCoreIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushAnalysisCoreIndexResponse build() {
            return new QueryPushAnalysisCoreIndexResponse(this);
        } 

    } 

}
