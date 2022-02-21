// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryJobListResponse</p>
 */
public class QueryJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryJobListResponseBody body;

    private QueryJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryJobListResponse create() {
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
    public QueryJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryJobListResponseBody body);

        @Override
        QueryJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryJobListResponse response) {
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
        public Builder body(QueryJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryJobListResponse build() {
            return new QueryJobListResponse(this);
        } 

    } 

}
