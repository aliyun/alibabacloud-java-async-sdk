// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessagePublishResponse} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessagePublishResponse</p>
 */
public class QueryMqttTraceMessagePublishResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMqttTraceMessagePublishResponseBody body;

    private QueryMqttTraceMessagePublishResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMqttTraceMessagePublishResponse create() {
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
    public QueryMqttTraceMessagePublishResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMqttTraceMessagePublishResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMqttTraceMessagePublishResponseBody body);

        @Override
        QueryMqttTraceMessagePublishResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMqttTraceMessagePublishResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMqttTraceMessagePublishResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMqttTraceMessagePublishResponse response) {
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
        public Builder body(QueryMqttTraceMessagePublishResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMqttTraceMessagePublishResponse build() {
            return new QueryMqttTraceMessagePublishResponse(this);
        } 

    } 

}
