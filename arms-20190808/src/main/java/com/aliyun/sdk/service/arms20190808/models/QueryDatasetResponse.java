// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetResponse} extends {@link TeaModel}
 *
 * <p>QueryDatasetResponse</p>
 */
public class QueryDatasetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDatasetResponseBody body;

    private QueryDatasetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDatasetResponse create() {
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
    public QueryDatasetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDatasetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDatasetResponseBody body);

        @Override
        QueryDatasetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDatasetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDatasetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDatasetResponse response) {
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
        public Builder body(QueryDatasetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDatasetResponse build() {
            return new QueryDatasetResponse(this);
        } 

    } 

}
