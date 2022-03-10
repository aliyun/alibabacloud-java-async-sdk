// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserListResponse} extends {@link TeaModel}
 *
 * <p>QueryUserListResponse</p>
 */
public class QueryUserListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserListResponseBody body;

    private QueryUserListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserListResponse create() {
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
    public QueryUserListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserListResponseBody body);

        @Override
        QueryUserListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserListResponse response) {
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
        public Builder body(QueryUserListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserListResponse build() {
            return new QueryUserListResponse(this);
        } 

    } 

}
