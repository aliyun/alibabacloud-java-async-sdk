// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuctionDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryAuctionDetailResponse</p>
 */
public class QueryAuctionDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAuctionDetailResponseBody body;

    private QueryAuctionDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAuctionDetailResponse create() {
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
    public QueryAuctionDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAuctionDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAuctionDetailResponseBody body);

        @Override
        QueryAuctionDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAuctionDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAuctionDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAuctionDetailResponse response) {
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
        public Builder body(QueryAuctionDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAuctionDetailResponse build() {
            return new QueryAuctionDetailResponse(this);
        } 

    } 

}
