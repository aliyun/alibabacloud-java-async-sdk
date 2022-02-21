// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductResponse} extends {@link TeaModel}
 *
 * <p>QueryProductResponse</p>
 */
public class QueryProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryProductResponseBody body;

    private QueryProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryProductResponse create() {
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
    public QueryProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryProductResponseBody body);

        @Override
        QueryProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryProductResponse response) {
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
        public Builder body(QueryProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryProductResponse build() {
            return new QueryProductResponse(this);
        } 

    } 

}
