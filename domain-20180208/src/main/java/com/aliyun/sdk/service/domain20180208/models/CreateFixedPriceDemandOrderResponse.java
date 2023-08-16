// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFixedPriceDemandOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateFixedPriceDemandOrderResponse</p>
 */
public class CreateFixedPriceDemandOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFixedPriceDemandOrderResponseBody body;

    private CreateFixedPriceDemandOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFixedPriceDemandOrderResponse create() {
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
    public CreateFixedPriceDemandOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFixedPriceDemandOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFixedPriceDemandOrderResponseBody body);

        @Override
        CreateFixedPriceDemandOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFixedPriceDemandOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFixedPriceDemandOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFixedPriceDemandOrderResponse response) {
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
        public Builder body(CreateFixedPriceDemandOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFixedPriceDemandOrderResponse build() {
            return new CreateFixedPriceDemandOrderResponse(this);
        } 

    } 

}
