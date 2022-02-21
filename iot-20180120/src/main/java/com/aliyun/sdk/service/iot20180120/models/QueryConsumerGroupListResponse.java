// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConsumerGroupListResponse} extends {@link TeaModel}
 *
 * <p>QueryConsumerGroupListResponse</p>
 */
public class QueryConsumerGroupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConsumerGroupListResponseBody body;

    private QueryConsumerGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConsumerGroupListResponse create() {
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
    public QueryConsumerGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConsumerGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConsumerGroupListResponseBody body);

        @Override
        QueryConsumerGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConsumerGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConsumerGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConsumerGroupListResponse response) {
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
        public Builder body(QueryConsumerGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConsumerGroupListResponse build() {
            return new QueryConsumerGroupListResponse(this);
        } 

    } 

}
