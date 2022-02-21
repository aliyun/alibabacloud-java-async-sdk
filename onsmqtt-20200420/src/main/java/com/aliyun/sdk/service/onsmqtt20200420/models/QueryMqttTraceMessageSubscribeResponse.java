// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessageSubscribeResponse} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageSubscribeResponse</p>
 */
public class QueryMqttTraceMessageSubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMqttTraceMessageSubscribeResponseBody body;

    private QueryMqttTraceMessageSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMqttTraceMessageSubscribeResponse create() {
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
    public QueryMqttTraceMessageSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMqttTraceMessageSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMqttTraceMessageSubscribeResponseBody body);

        @Override
        QueryMqttTraceMessageSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMqttTraceMessageSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMqttTraceMessageSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMqttTraceMessageSubscribeResponse response) {
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
        public Builder body(QueryMqttTraceMessageSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMqttTraceMessageSubscribeResponse build() {
            return new QueryMqttTraceMessageSubscribeResponse(this);
        } 

    } 

}
