// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnterpriseDataListResponse} extends {@link TeaModel}
 *
 * <p>QueryEnterpriseDataListResponse</p>
 */
public class QueryEnterpriseDataListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEnterpriseDataListResponseBody body;

    private QueryEnterpriseDataListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEnterpriseDataListResponse create() {
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
    public QueryEnterpriseDataListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEnterpriseDataListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEnterpriseDataListResponseBody body);

        @Override
        QueryEnterpriseDataListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEnterpriseDataListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEnterpriseDataListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEnterpriseDataListResponse response) {
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
        public Builder body(QueryEnterpriseDataListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEnterpriseDataListResponse build() {
            return new QueryEnterpriseDataListResponse(this);
        } 

    } 

}
