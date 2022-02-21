// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesResponse} extends {@link TeaModel}
 *
 * <p>ListQueuesResponse</p>
 */
public class ListQueuesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueuesResponseBody body;

    private ListQueuesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueuesResponse create() {
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
    public ListQueuesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueuesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueuesResponseBody body);

        @Override
        ListQueuesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueuesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueuesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueuesResponse response) {
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
        public Builder body(ListQueuesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueuesResponse build() {
            return new ListQueuesResponse(this);
        } 

    } 

}
