// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskBuyOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateDiskBuyOrderResponse</p>
 */
public class CreateDiskBuyOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiskBuyOrderResponseBody body;

    private CreateDiskBuyOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiskBuyOrderResponse create() {
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
    public CreateDiskBuyOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiskBuyOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiskBuyOrderResponseBody body);

        @Override
        CreateDiskBuyOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiskBuyOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiskBuyOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiskBuyOrderResponse response) {
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
        public Builder body(CreateDiskBuyOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiskBuyOrderResponse build() {
            return new CreateDiskBuyOrderResponse(this);
        } 

    } 

}
