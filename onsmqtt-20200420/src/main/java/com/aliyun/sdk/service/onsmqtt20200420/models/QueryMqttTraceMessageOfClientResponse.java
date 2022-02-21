// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessageOfClientResponse} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageOfClientResponse</p>
 */
public class QueryMqttTraceMessageOfClientResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMqttTraceMessageOfClientResponseBody body;

    private QueryMqttTraceMessageOfClientResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMqttTraceMessageOfClientResponse create() {
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
    public QueryMqttTraceMessageOfClientResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMqttTraceMessageOfClientResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMqttTraceMessageOfClientResponseBody body);

        @Override
        QueryMqttTraceMessageOfClientResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMqttTraceMessageOfClientResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMqttTraceMessageOfClientResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMqttTraceMessageOfClientResponse response) {
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
        public Builder body(QueryMqttTraceMessageOfClientResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMqttTraceMessageOfClientResponse build() {
            return new QueryMqttTraceMessageOfClientResponse(this);
        } 

    } 

}
