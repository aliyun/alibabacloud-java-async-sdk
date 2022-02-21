// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductListResponse} extends {@link TeaModel}
 *
 * <p>QueryProductListResponse</p>
 */
public class QueryProductListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryProductListResponseBody body;

    private QueryProductListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryProductListResponse create() {
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
    public QueryProductListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryProductListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryProductListResponseBody body);

        @Override
        QueryProductListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryProductListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryProductListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryProductListResponse response) {
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
        public Builder body(QueryProductListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryProductListResponse build() {
            return new QueryProductListResponse(this);
        } 

    } 

}
