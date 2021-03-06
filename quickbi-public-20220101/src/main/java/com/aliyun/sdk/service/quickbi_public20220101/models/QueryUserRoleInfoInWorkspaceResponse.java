// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserRoleInfoInWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>QueryUserRoleInfoInWorkspaceResponse</p>
 */
public class QueryUserRoleInfoInWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserRoleInfoInWorkspaceResponseBody body;

    private QueryUserRoleInfoInWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserRoleInfoInWorkspaceResponse create() {
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
    public QueryUserRoleInfoInWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserRoleInfoInWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserRoleInfoInWorkspaceResponseBody body);

        @Override
        QueryUserRoleInfoInWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserRoleInfoInWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserRoleInfoInWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserRoleInfoInWorkspaceResponse response) {
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
        public Builder body(QueryUserRoleInfoInWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserRoleInfoInWorkspaceResponse build() {
            return new QueryUserRoleInfoInWorkspaceResponse(this);
        } 

    } 

}
