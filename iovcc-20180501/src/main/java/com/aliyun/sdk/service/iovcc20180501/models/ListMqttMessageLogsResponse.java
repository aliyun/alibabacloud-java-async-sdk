// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMqttMessageLogsResponse} extends {@link TeaModel}
 *
 * <p>ListMqttMessageLogsResponse</p>
 */
public class ListMqttMessageLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMqttMessageLogsResponseBody body;

    private ListMqttMessageLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMqttMessageLogsResponse create() {
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
    public ListMqttMessageLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMqttMessageLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMqttMessageLogsResponseBody body);

        @Override
        ListMqttMessageLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMqttMessageLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMqttMessageLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMqttMessageLogsResponse response) {
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
        public Builder body(ListMqttMessageLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMqttMessageLogsResponse build() {
            return new ListMqttMessageLogsResponse(this);
        } 

    } 

}
