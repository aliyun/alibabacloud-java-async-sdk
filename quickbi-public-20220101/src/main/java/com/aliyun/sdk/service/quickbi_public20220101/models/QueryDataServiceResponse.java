// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataServiceResponse} extends {@link TeaModel}
 *
 * <p>QueryDataServiceResponse</p>
 */
public class QueryDataServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDataServiceResponseBody body;

    private QueryDataServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDataServiceResponse create() {
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
    public QueryDataServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDataServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDataServiceResponseBody body);

        @Override
        QueryDataServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDataServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDataServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDataServiceResponse response) {
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
        public Builder body(QueryDataServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDataServiceResponse build() {
            return new QueryDataServiceResponse(this);
        } 

    } 

}
