// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksByWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>QueryWorksByWorkspaceResponse</p>
 */
public class QueryWorksByWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWorksByWorkspaceResponseBody body;

    private QueryWorksByWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWorksByWorkspaceResponse create() {
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
    public QueryWorksByWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWorksByWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWorksByWorkspaceResponseBody body);

        @Override
        QueryWorksByWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWorksByWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWorksByWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWorksByWorkspaceResponse response) {
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
        public Builder body(QueryWorksByWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWorksByWorkspaceResponse build() {
            return new QueryWorksByWorkspaceResponse(this);
        } 

    } 

}
