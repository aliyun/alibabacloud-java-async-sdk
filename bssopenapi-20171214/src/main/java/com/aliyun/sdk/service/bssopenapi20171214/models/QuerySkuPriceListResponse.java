// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySkuPriceListResponse} extends {@link TeaModel}
 *
 * <p>QuerySkuPriceListResponse</p>
 */
public class QuerySkuPriceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySkuPriceListResponseBody body;

    private QuerySkuPriceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySkuPriceListResponse create() {
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
    public QuerySkuPriceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySkuPriceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySkuPriceListResponseBody body);

        @Override
        QuerySkuPriceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySkuPriceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySkuPriceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySkuPriceListResponse response) {
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
        public Builder body(QuerySkuPriceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySkuPriceListResponse build() {
            return new QuerySkuPriceListResponse(this);
        } 

    } 

}
