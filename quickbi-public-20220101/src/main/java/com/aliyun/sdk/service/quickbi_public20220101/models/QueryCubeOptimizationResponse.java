// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCubeOptimizationResponse} extends {@link TeaModel}
 *
 * <p>QueryCubeOptimizationResponse</p>
 */
public class QueryCubeOptimizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCubeOptimizationResponseBody body;

    private QueryCubeOptimizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCubeOptimizationResponse create() {
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
    public QueryCubeOptimizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCubeOptimizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCubeOptimizationResponseBody body);

        @Override
        QueryCubeOptimizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCubeOptimizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCubeOptimizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCubeOptimizationResponse response) {
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
        public Builder body(QueryCubeOptimizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCubeOptimizationResponse build() {
            return new QueryCubeOptimizationResponse(this);
        } 

    } 

}
