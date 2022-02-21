// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatGatewayResponse} extends {@link TeaModel}
 *
 * <p>CreateNatGatewayResponse</p>
 */
public class CreateNatGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNatGatewayResponseBody body;

    private CreateNatGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNatGatewayResponse create() {
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
    public CreateNatGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNatGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNatGatewayResponseBody body);

        @Override
        CreateNatGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNatGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNatGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNatGatewayResponse response) {
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
        public Builder body(CreateNatGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNatGatewayResponse build() {
            return new CreateNatGatewayResponse(this);
        } 

    } 

}
