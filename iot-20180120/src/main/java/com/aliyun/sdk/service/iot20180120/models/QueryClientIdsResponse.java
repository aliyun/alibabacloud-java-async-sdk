// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClientIdsResponse} extends {@link TeaModel}
 *
 * <p>QueryClientIdsResponse</p>
 */
public class QueryClientIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryClientIdsResponseBody body;

    private QueryClientIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryClientIdsResponse create() {
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
    public QueryClientIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryClientIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryClientIdsResponseBody body);

        @Override
        QueryClientIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryClientIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryClientIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryClientIdsResponse response) {
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
        public Builder body(QueryClientIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryClientIdsResponse build() {
            return new QueryClientIdsResponse(this);
        } 

    } 

}
