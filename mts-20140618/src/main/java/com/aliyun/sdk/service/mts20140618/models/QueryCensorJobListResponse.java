// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCensorJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryCensorJobListResponse</p>
 */
public class QueryCensorJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCensorJobListResponseBody body;

    private QueryCensorJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCensorJobListResponse create() {
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
    public QueryCensorJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCensorJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCensorJobListResponseBody body);

        @Override
        QueryCensorJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCensorJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCensorJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCensorJobListResponse response) {
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
        public Builder body(QueryCensorJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCensorJobListResponse build() {
            return new QueryCensorJobListResponse(this);
        } 

    } 

}
