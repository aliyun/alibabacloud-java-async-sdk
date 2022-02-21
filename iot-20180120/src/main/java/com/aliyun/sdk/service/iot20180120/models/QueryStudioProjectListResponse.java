// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStudioProjectListResponse} extends {@link TeaModel}
 *
 * <p>QueryStudioProjectListResponse</p>
 */
public class QueryStudioProjectListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryStudioProjectListResponseBody body;

    private QueryStudioProjectListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryStudioProjectListResponse create() {
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
    public QueryStudioProjectListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStudioProjectListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryStudioProjectListResponseBody body);

        @Override
        QueryStudioProjectListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStudioProjectListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryStudioProjectListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStudioProjectListResponse response) {
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
        public Builder body(QueryStudioProjectListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStudioProjectListResponse build() {
            return new QueryStudioProjectListResponse(this);
        } 

    } 

}
