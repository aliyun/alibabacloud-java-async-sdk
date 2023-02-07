// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityListResponse} extends {@link TeaModel}
 *
 * <p>QueryCommodityListResponse</p>
 */
public class QueryCommodityListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCommodityListResponseBody body;

    private QueryCommodityListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCommodityListResponse create() {
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
    public QueryCommodityListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCommodityListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCommodityListResponseBody body);

        @Override
        QueryCommodityListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCommodityListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCommodityListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCommodityListResponse response) {
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
        public Builder body(QueryCommodityListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCommodityListResponse build() {
            return new QueryCommodityListResponse(this);
        } 

    } 

}
