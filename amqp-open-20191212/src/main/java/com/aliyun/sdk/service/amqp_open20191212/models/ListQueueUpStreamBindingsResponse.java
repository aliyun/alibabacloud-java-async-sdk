// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueueUpStreamBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListQueueUpStreamBindingsResponse</p>
 */
public class ListQueueUpStreamBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueueUpStreamBindingsResponseBody body;

    private ListQueueUpStreamBindingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueueUpStreamBindingsResponse create() {
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
    public ListQueueUpStreamBindingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueueUpStreamBindingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueueUpStreamBindingsResponseBody body);

        @Override
        ListQueueUpStreamBindingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueueUpStreamBindingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueueUpStreamBindingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueueUpStreamBindingsResponse response) {
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
        public Builder body(ListQueueUpStreamBindingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueueUpStreamBindingsResponse build() {
            return new ListQueueUpStreamBindingsResponse(this);
        } 

    } 

}
