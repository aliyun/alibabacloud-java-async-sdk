// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReadableResourcesListByUserIdResponse} extends {@link TeaModel}
 *
 * <p>QueryReadableResourcesListByUserIdResponse</p>
 */
public class QueryReadableResourcesListByUserIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryReadableResourcesListByUserIdResponseBody body;

    private QueryReadableResourcesListByUserIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryReadableResourcesListByUserIdResponse create() {
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
    public QueryReadableResourcesListByUserIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryReadableResourcesListByUserIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryReadableResourcesListByUserIdResponseBody body);

        @Override
        QueryReadableResourcesListByUserIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryReadableResourcesListByUserIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryReadableResourcesListByUserIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryReadableResourcesListByUserIdResponse response) {
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
        public Builder body(QueryReadableResourcesListByUserIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryReadableResourcesListByUserIdResponse build() {
            return new QueryReadableResourcesListByUserIdResponse(this);
        } 

    } 

}
