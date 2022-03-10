// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorkspaceUserListResponse} extends {@link TeaModel}
 *
 * <p>QueryWorkspaceUserListResponse</p>
 */
public class QueryWorkspaceUserListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWorkspaceUserListResponseBody body;

    private QueryWorkspaceUserListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWorkspaceUserListResponse create() {
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
    public QueryWorkspaceUserListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWorkspaceUserListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWorkspaceUserListResponseBody body);

        @Override
        QueryWorkspaceUserListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWorkspaceUserListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWorkspaceUserListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWorkspaceUserListResponse response) {
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
        public Builder body(QueryWorkspaceUserListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWorkspaceUserListResponse build() {
            return new QueryWorkspaceUserListResponse(this);
        } 

    } 

}
