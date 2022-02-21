// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConsumerGroupStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryConsumerGroupStatusResponse</p>
 */
public class QueryConsumerGroupStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConsumerGroupStatusResponseBody body;

    private QueryConsumerGroupStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConsumerGroupStatusResponse create() {
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
    public QueryConsumerGroupStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConsumerGroupStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConsumerGroupStatusResponseBody body);

        @Override
        QueryConsumerGroupStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConsumerGroupStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConsumerGroupStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConsumerGroupStatusResponse response) {
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
        public Builder body(QueryConsumerGroupStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConsumerGroupStatusResponse build() {
            return new QueryConsumerGroupStatusResponse(this);
        } 

    } 

}
