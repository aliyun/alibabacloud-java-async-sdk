// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnterpriseTagListResponse} extends {@link TeaModel}
 *
 * <p>QueryEnterpriseTagListResponse</p>
 */
public class QueryEnterpriseTagListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEnterpriseTagListResponseBody body;

    private QueryEnterpriseTagListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEnterpriseTagListResponse create() {
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
    public QueryEnterpriseTagListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEnterpriseTagListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEnterpriseTagListResponseBody body);

        @Override
        QueryEnterpriseTagListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEnterpriseTagListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEnterpriseTagListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEnterpriseTagListResponse response) {
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
        public Builder body(QueryEnterpriseTagListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEnterpriseTagListResponse build() {
            return new QueryEnterpriseTagListResponse(this);
        } 

    } 

}
