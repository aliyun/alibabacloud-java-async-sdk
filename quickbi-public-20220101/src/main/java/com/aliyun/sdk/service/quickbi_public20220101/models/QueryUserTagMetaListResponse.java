// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserTagMetaListResponse} extends {@link TeaModel}
 *
 * <p>QueryUserTagMetaListResponse</p>
 */
public class QueryUserTagMetaListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserTagMetaListResponseBody body;

    private QueryUserTagMetaListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserTagMetaListResponse create() {
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
    public QueryUserTagMetaListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserTagMetaListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserTagMetaListResponseBody body);

        @Override
        QueryUserTagMetaListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserTagMetaListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserTagMetaListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserTagMetaListResponse response) {
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
        public Builder body(QueryUserTagMetaListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserTagMetaListResponse build() {
            return new QueryUserTagMetaListResponse(this);
        } 

    } 

}
