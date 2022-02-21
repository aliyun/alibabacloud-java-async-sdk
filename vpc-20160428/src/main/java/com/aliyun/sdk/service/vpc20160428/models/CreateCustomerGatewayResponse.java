// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomerGatewayResponse} extends {@link TeaModel}
 *
 * <p>CreateCustomerGatewayResponse</p>
 */
public class CreateCustomerGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCustomerGatewayResponseBody body;

    private CreateCustomerGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCustomerGatewayResponse create() {
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
    public CreateCustomerGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCustomerGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCustomerGatewayResponseBody body);

        @Override
        CreateCustomerGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCustomerGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCustomerGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCustomerGatewayResponse response) {
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
        public Builder body(CreateCustomerGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCustomerGatewayResponse build() {
            return new CreateCustomerGatewayResponse(this);
        } 

    } 

}
