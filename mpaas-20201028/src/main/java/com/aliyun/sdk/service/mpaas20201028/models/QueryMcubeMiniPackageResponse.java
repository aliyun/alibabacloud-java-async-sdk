// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcubeMiniPackageResponse} extends {@link TeaModel}
 *
 * <p>QueryMcubeMiniPackageResponse</p>
 */
public class QueryMcubeMiniPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMcubeMiniPackageResponseBody body;

    private QueryMcubeMiniPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMcubeMiniPackageResponse create() {
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
    public QueryMcubeMiniPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcubeMiniPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMcubeMiniPackageResponseBody body);

        @Override
        QueryMcubeMiniPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcubeMiniPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMcubeMiniPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcubeMiniPackageResponse response) {
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
        public Builder body(QueryMcubeMiniPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcubeMiniPackageResponse build() {
            return new QueryMcubeMiniPackageResponse(this);
        } 

    } 

}
