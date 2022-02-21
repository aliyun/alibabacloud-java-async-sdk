// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAliasesResponse} extends {@link TeaModel}
 *
 * <p>QueryAliasesResponse</p>
 */
public class QueryAliasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAliasesResponseBody body;

    private QueryAliasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAliasesResponse create() {
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
    public QueryAliasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAliasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAliasesResponseBody body);

        @Override
        QueryAliasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAliasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAliasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAliasesResponse response) {
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
        public Builder body(QueryAliasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAliasesResponse build() {
            return new QueryAliasesResponse(this);
        } 

    } 

}
