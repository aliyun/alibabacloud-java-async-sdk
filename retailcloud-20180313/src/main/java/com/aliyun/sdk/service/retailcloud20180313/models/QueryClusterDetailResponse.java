// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryClusterDetailResponse</p>
 */
public class QueryClusterDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryClusterDetailResponseBody body;

    private QueryClusterDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryClusterDetailResponse create() {
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
    public QueryClusterDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryClusterDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryClusterDetailResponseBody body);

        @Override
        QueryClusterDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryClusterDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryClusterDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryClusterDetailResponse response) {
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
        public Builder body(QueryClusterDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryClusterDetailResponse build() {
            return new QueryClusterDetailResponse(this);
        } 

    } 

}
