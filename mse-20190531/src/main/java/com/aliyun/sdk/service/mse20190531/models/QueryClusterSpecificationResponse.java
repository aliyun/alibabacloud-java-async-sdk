// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterSpecificationResponse} extends {@link TeaModel}
 *
 * <p>QueryClusterSpecificationResponse</p>
 */
public class QueryClusterSpecificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryClusterSpecificationResponseBody body;

    private QueryClusterSpecificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryClusterSpecificationResponse create() {
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
    public QueryClusterSpecificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryClusterSpecificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryClusterSpecificationResponseBody body);

        @Override
        QueryClusterSpecificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryClusterSpecificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryClusterSpecificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryClusterSpecificationResponse response) {
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
        public Builder body(QueryClusterSpecificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryClusterSpecificationResponse build() {
            return new QueryClusterSpecificationResponse(this);
        } 

    } 

}
