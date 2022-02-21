// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWaitingOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateWaitingOrderResponse</p>
 */
public class CreateWaitingOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWaitingOrderResponseBody body;

    private CreateWaitingOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWaitingOrderResponse create() {
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
    public CreateWaitingOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWaitingOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWaitingOrderResponseBody body);

        @Override
        CreateWaitingOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWaitingOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWaitingOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWaitingOrderResponse response) {
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
        public Builder body(CreateWaitingOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWaitingOrderResponse build() {
            return new CreateWaitingOrderResponse(this);
        } 

    } 

}
