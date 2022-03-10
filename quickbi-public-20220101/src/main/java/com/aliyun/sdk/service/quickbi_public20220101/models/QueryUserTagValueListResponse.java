// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserTagValueListResponse} extends {@link TeaModel}
 *
 * <p>QueryUserTagValueListResponse</p>
 */
public class QueryUserTagValueListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserTagValueListResponseBody body;

    private QueryUserTagValueListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserTagValueListResponse create() {
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
    public QueryUserTagValueListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserTagValueListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserTagValueListResponseBody body);

        @Override
        QueryUserTagValueListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserTagValueListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserTagValueListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserTagValueListResponse response) {
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
        public Builder body(QueryUserTagValueListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserTagValueListResponse build() {
            return new QueryUserTagValueListResponse(this);
        } 

    } 

}
