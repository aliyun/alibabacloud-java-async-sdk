// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetListResponse} extends {@link TeaModel}
 *
 * <p>QueryDatasetListResponse</p>
 */
public class QueryDatasetListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDatasetListResponseBody body;

    private QueryDatasetListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDatasetListResponse create() {
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
    public QueryDatasetListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDatasetListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDatasetListResponseBody body);

        @Override
        QueryDatasetListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDatasetListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDatasetListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDatasetListResponse response) {
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
        public Builder body(QueryDatasetListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDatasetListResponse build() {
            return new QueryDatasetListResponse(this);
        } 

    } 

}
