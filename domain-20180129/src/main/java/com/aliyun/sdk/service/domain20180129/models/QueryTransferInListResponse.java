// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransferInListResponse} extends {@link TeaModel}
 *
 * <p>QueryTransferInListResponse</p>
 */
public class QueryTransferInListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTransferInListResponseBody body;

    private QueryTransferInListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTransferInListResponse create() {
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
    public QueryTransferInListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTransferInListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTransferInListResponseBody body);

        @Override
        QueryTransferInListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTransferInListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTransferInListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTransferInListResponse response) {
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
        public Builder body(QueryTransferInListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTransferInListResponse build() {
            return new QueryTransferInListResponse(this);
        } 

    } 

}
