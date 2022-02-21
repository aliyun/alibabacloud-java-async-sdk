// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExchangesResponse} extends {@link TeaModel}
 *
 * <p>ListExchangesResponse</p>
 */
public class ListExchangesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExchangesResponseBody body;

    private ListExchangesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExchangesResponse create() {
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
    public ListExchangesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExchangesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExchangesResponseBody body);

        @Override
        ListExchangesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExchangesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExchangesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExchangesResponse response) {
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
        public Builder body(ListExchangesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExchangesResponse build() {
            return new ListExchangesResponse(this);
        } 

    } 

}
