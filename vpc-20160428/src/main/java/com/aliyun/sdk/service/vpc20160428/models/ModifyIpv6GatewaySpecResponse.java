// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpv6GatewaySpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpv6GatewaySpecResponse</p>
 */
public class ModifyIpv6GatewaySpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpv6GatewaySpecResponseBody body;

    private ModifyIpv6GatewaySpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpv6GatewaySpecResponse create() {
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
    public ModifyIpv6GatewaySpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpv6GatewaySpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpv6GatewaySpecResponseBody body);

        @Override
        ModifyIpv6GatewaySpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpv6GatewaySpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpv6GatewaySpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpv6GatewaySpecResponse response) {
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
        public Builder body(ModifyIpv6GatewaySpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpv6GatewaySpecResponse build() {
            return new ModifyIpv6GatewaySpecResponse(this);
        } 

    } 

}
