// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExchangeUpStreamBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListExchangeUpStreamBindingsResponse</p>
 */
public class ListExchangeUpStreamBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExchangeUpStreamBindingsResponseBody body;

    private ListExchangeUpStreamBindingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExchangeUpStreamBindingsResponse create() {
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
    public ListExchangeUpStreamBindingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExchangeUpStreamBindingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExchangeUpStreamBindingsResponseBody body);

        @Override
        ListExchangeUpStreamBindingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExchangeUpStreamBindingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExchangeUpStreamBindingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExchangeUpStreamBindingsResponse response) {
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
        public Builder body(ListExchangeUpStreamBindingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExchangeUpStreamBindingsResponse build() {
            return new ListExchangeUpStreamBindingsResponse(this);
        } 

    } 

}
