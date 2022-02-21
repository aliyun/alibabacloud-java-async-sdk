// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDdTaskOrderResponse} extends {@link TeaModel}
 *
 * <p>ListDdTaskOrderResponse</p>
 */
public class ListDdTaskOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDdTaskOrderResponseBody body;

    private ListDdTaskOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDdTaskOrderResponse create() {
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
    public ListDdTaskOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDdTaskOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDdTaskOrderResponseBody body);

        @Override
        ListDdTaskOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDdTaskOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDdTaskOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDdTaskOrderResponse response) {
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
        public Builder body(ListDdTaskOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDdTaskOrderResponse build() {
            return new ListDdTaskOrderResponse(this);
        } 

    } 

}
