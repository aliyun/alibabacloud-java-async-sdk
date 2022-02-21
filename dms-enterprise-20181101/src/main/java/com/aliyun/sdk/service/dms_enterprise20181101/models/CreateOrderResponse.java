// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateOrderResponse</p>
 */
public class CreateOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrderResponseBody body;

    private CreateOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrderResponse create() {
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
    public CreateOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrderResponseBody body);

        @Override
        CreateOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrderResponse response) {
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
        public Builder body(CreateOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrderResponse build() {
            return new CreateOrderResponse(this);
        } 

    } 

}
