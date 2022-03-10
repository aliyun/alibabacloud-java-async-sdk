// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetDetailInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryDatasetDetailInfoResponse</p>
 */
public class QueryDatasetDetailInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDatasetDetailInfoResponseBody body;

    private QueryDatasetDetailInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDatasetDetailInfoResponse create() {
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
    public QueryDatasetDetailInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDatasetDetailInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDatasetDetailInfoResponseBody body);

        @Override
        QueryDatasetDetailInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDatasetDetailInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDatasetDetailInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDatasetDetailInfoResponse response) {
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
        public Builder body(QueryDatasetDetailInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDatasetDetailInfoResponse build() {
            return new QueryDatasetDetailInfoResponse(this);
        } 

    } 

}
