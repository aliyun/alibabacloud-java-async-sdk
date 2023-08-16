// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFixedPriceSelectedOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateFixedPriceSelectedOrderResponse</p>
 */
public class CreateFixedPriceSelectedOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFixedPriceSelectedOrderResponseBody body;

    private CreateFixedPriceSelectedOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFixedPriceSelectedOrderResponse create() {
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
    public CreateFixedPriceSelectedOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFixedPriceSelectedOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFixedPriceSelectedOrderResponseBody body);

        @Override
        CreateFixedPriceSelectedOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFixedPriceSelectedOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFixedPriceSelectedOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFixedPriceSelectedOrderResponse response) {
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
        public Builder body(CreateFixedPriceSelectedOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFixedPriceSelectedOrderResponse build() {
            return new CreateFixedPriceSelectedOrderResponse(this);
        } 

    } 

}
