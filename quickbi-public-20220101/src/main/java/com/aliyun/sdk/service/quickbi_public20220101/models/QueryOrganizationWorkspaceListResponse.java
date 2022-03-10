// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrganizationWorkspaceListResponse} extends {@link TeaModel}
 *
 * <p>QueryOrganizationWorkspaceListResponse</p>
 */
public class QueryOrganizationWorkspaceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOrganizationWorkspaceListResponseBody body;

    private QueryOrganizationWorkspaceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOrganizationWorkspaceListResponse create() {
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
    public QueryOrganizationWorkspaceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOrganizationWorkspaceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOrganizationWorkspaceListResponseBody body);

        @Override
        QueryOrganizationWorkspaceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOrganizationWorkspaceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOrganizationWorkspaceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOrganizationWorkspaceListResponse response) {
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
        public Builder body(QueryOrganizationWorkspaceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOrganizationWorkspaceListResponse build() {
            return new QueryOrganizationWorkspaceListResponse(this);
        } 

    } 

}
