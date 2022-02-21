// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableVpcIpv4GatewayResponse} extends {@link TeaModel}
 *
 * <p>EnableVpcIpv4GatewayResponse</p>
 */
public class EnableVpcIpv4GatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableVpcIpv4GatewayResponseBody body;

    private EnableVpcIpv4GatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableVpcIpv4GatewayResponse create() {
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
    public EnableVpcIpv4GatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableVpcIpv4GatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableVpcIpv4GatewayResponseBody body);

        @Override
        EnableVpcIpv4GatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableVpcIpv4GatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableVpcIpv4GatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableVpcIpv4GatewayResponse response) {
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
        public Builder body(EnableVpcIpv4GatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableVpcIpv4GatewayResponse build() {
            return new EnableVpcIpv4GatewayResponse(this);
        } 

    } 

}
