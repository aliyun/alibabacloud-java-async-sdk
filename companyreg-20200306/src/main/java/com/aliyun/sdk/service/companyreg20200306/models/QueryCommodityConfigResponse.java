// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityConfigResponse} extends {@link TeaModel}
 *
 * <p>QueryCommodityConfigResponse</p>
 */
public class QueryCommodityConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCommodityConfigResponseBody body;

    private QueryCommodityConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCommodityConfigResponse create() {
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
    public QueryCommodityConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCommodityConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCommodityConfigResponseBody body);

        @Override
        QueryCommodityConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCommodityConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCommodityConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCommodityConfigResponse response) {
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
        public Builder body(QueryCommodityConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCommodityConfigResponse build() {
            return new QueryCommodityConfigResponse(this);
        } 

    } 

}
