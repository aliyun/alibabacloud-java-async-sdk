// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuctionsResponse} extends {@link TeaModel}
 *
 * <p>QueryAuctionsResponse</p>
 */
public class QueryAuctionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAuctionsResponseBody body;

    private QueryAuctionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAuctionsResponse create() {
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
    public QueryAuctionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAuctionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAuctionsResponseBody body);

        @Override
        QueryAuctionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAuctionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAuctionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAuctionsResponse response) {
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
        public Builder body(QueryAuctionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAuctionsResponse build() {
            return new QueryAuctionsResponse(this);
        } 

    } 

}
