// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConsumerGroupByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>QueryConsumerGroupByGroupIdResponse</p>
 */
public class QueryConsumerGroupByGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConsumerGroupByGroupIdResponseBody body;

    private QueryConsumerGroupByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConsumerGroupByGroupIdResponse create() {
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
    public QueryConsumerGroupByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConsumerGroupByGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConsumerGroupByGroupIdResponseBody body);

        @Override
        QueryConsumerGroupByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConsumerGroupByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConsumerGroupByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConsumerGroupByGroupIdResponse response) {
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
        public Builder body(QueryConsumerGroupByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConsumerGroupByGroupIdResponse build() {
            return new QueryConsumerGroupByGroupIdResponse(this);
        } 

    } 

}
