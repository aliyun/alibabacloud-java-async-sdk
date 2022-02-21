// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateElbBuyOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateElbBuyOrderResponse</p>
 */
public class CreateElbBuyOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateElbBuyOrderResponseBody body;

    private CreateElbBuyOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateElbBuyOrderResponse create() {
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
    public CreateElbBuyOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateElbBuyOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateElbBuyOrderResponseBody body);

        @Override
        CreateElbBuyOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateElbBuyOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateElbBuyOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateElbBuyOrderResponse response) {
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
        public Builder body(CreateElbBuyOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateElbBuyOrderResponse build() {
            return new CreateElbBuyOrderResponse(this);
        } 

    } 

}
