// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceDeviceResponse} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceDeviceResponse</p>
 */
public class QueryMqttTraceDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMqttTraceDeviceResponseBody body;

    private QueryMqttTraceDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMqttTraceDeviceResponse create() {
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
    public QueryMqttTraceDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMqttTraceDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMqttTraceDeviceResponseBody body);

        @Override
        QueryMqttTraceDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMqttTraceDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMqttTraceDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMqttTraceDeviceResponse response) {
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
        public Builder body(QueryMqttTraceDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMqttTraceDeviceResponse build() {
            return new QueryMqttTraceDeviceResponse(this);
        } 

    } 

}
