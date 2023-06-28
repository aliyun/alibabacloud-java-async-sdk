// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCubePerformanceResponse} extends {@link TeaModel}
 *
 * <p>QueryCubePerformanceResponse</p>
 */
public class QueryCubePerformanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCubePerformanceResponseBody body;

    private QueryCubePerformanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCubePerformanceResponse create() {
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
    public QueryCubePerformanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCubePerformanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCubePerformanceResponseBody body);

        @Override
        QueryCubePerformanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCubePerformanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCubePerformanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCubePerformanceResponse response) {
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
        public Builder body(QueryCubePerformanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCubePerformanceResponse build() {
            return new QueryCubePerformanceResponse(this);
        } 

    } 

}
