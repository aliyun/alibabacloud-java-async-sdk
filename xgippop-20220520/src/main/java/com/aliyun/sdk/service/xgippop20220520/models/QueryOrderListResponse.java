// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderListResponse} extends {@link TeaModel}
 *
 * <p>QueryOrderListResponse</p>
 */
public class QueryOrderListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOrderListResponseBody body;

    private QueryOrderListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOrderListResponse create() {
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
    public QueryOrderListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOrderListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOrderListResponseBody body);

        @Override
        QueryOrderListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOrderListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOrderListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOrderListResponse response) {
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
        public Builder body(QueryOrderListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOrderListResponse build() {
            return new QueryOrderListResponse(this);
        } 

    } 

}
