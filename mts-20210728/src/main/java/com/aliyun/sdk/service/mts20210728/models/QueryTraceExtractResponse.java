// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceExtractResponse} extends {@link TeaModel}
 *
 * <p>QueryTraceExtractResponse</p>
 */
public class QueryTraceExtractResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTraceExtractResponseBody body;

    private QueryTraceExtractResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTraceExtractResponse create() {
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
    public QueryTraceExtractResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTraceExtractResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTraceExtractResponseBody body);

        @Override
        QueryTraceExtractResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTraceExtractResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTraceExtractResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTraceExtractResponse response) {
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
        public Builder body(QueryTraceExtractResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTraceExtractResponse build() {
            return new QueryTraceExtractResponse(this);
        } 

    } 

}
