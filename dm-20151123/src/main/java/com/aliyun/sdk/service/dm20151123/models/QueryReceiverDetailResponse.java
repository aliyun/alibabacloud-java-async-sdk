// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReceiverDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryReceiverDetailResponse</p>
 */
public class QueryReceiverDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryReceiverDetailResponseBody body;

    private QueryReceiverDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryReceiverDetailResponse create() {
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
    public QueryReceiverDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryReceiverDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryReceiverDetailResponseBody body);

        @Override
        QueryReceiverDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryReceiverDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryReceiverDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryReceiverDetailResponse response) {
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
        public Builder body(QueryReceiverDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryReceiverDetailResponse build() {
            return new QueryReceiverDetailResponse(this);
        } 

    } 

}
