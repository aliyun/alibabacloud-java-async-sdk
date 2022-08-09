// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrderResponse} extends {@link TeaModel}
 *
 * <p>ListOrderResponse</p>
 */
public class ListOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOrderResponseBody body;

    private ListOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOrderResponse create() {
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
    public ListOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOrderResponseBody body);

        @Override
        ListOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOrderResponse response) {
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
        public Builder body(ListOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOrderResponse build() {
            return new ListOrderResponse(this);
        } 

    } 

}
