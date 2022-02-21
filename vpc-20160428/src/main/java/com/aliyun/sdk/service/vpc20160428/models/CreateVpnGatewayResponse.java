// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnGatewayResponse} extends {@link TeaModel}
 *
 * <p>CreateVpnGatewayResponse</p>
 */
public class CreateVpnGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpnGatewayResponseBody body;

    private CreateVpnGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpnGatewayResponse create() {
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
    public CreateVpnGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpnGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpnGatewayResponseBody body);

        @Override
        CreateVpnGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpnGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpnGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpnGatewayResponse response) {
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
        public Builder body(CreateVpnGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpnGatewayResponse build() {
            return new CreateVpnGatewayResponse(this);
        } 

    } 

}
