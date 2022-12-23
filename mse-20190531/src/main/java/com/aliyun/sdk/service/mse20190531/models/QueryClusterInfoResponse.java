// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryClusterInfoResponse</p>
 */
public class QueryClusterInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryClusterInfoResponseBody body;

    private QueryClusterInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryClusterInfoResponse create() {
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
    public QueryClusterInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryClusterInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryClusterInfoResponseBody body);

        @Override
        QueryClusterInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryClusterInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryClusterInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryClusterInfoResponse response) {
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
        public Builder body(QueryClusterInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryClusterInfoResponse build() {
            return new QueryClusterInfoResponse(this);
        } 

    } 

}
