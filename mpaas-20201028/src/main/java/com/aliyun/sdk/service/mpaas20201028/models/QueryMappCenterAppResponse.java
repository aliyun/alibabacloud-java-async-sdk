// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMappCenterAppResponse} extends {@link TeaModel}
 *
 * <p>QueryMappCenterAppResponse</p>
 */
public class QueryMappCenterAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMappCenterAppResponseBody body;

    private QueryMappCenterAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMappCenterAppResponse create() {
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
    public QueryMappCenterAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMappCenterAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMappCenterAppResponseBody body);

        @Override
        QueryMappCenterAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMappCenterAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMappCenterAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMappCenterAppResponse response) {
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
        public Builder body(QueryMappCenterAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMappCenterAppResponse build() {
            return new QueryMappCenterAppResponse(this);
        } 

    } 

}
