// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckoutWithAKResponse} extends {@link TeaModel}
 *
 * <p>CheckoutWithAKResponse</p>
 */
public class CheckoutWithAKResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckoutWithAKResponseBody body;

    private CheckoutWithAKResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckoutWithAKResponse create() {
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
    public CheckoutWithAKResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckoutWithAKResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckoutWithAKResponseBody body);

        @Override
        CheckoutWithAKResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckoutWithAKResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckoutWithAKResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckoutWithAKResponse response) {
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
        public Builder body(CheckoutWithAKResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckoutWithAKResponse build() {
            return new CheckoutWithAKResponse(this);
        } 

    } 

}
