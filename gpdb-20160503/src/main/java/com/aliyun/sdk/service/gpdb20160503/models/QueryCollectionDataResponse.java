// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCollectionDataResponse} extends {@link TeaModel}
 *
 * <p>QueryCollectionDataResponse</p>
 */
public class QueryCollectionDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCollectionDataResponseBody body;

    private QueryCollectionDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCollectionDataResponse create() {
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
    public QueryCollectionDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCollectionDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCollectionDataResponseBody body);

        @Override
        QueryCollectionDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCollectionDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCollectionDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCollectionDataResponse response) {
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
        public Builder body(QueryCollectionDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCollectionDataResponse build() {
            return new QueryCollectionDataResponse(this);
        } 

    } 

}
