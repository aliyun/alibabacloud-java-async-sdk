// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNatGatewaySpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyNatGatewaySpecResponse</p>
 */
public class ModifyNatGatewaySpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNatGatewaySpecResponseBody body;

    private ModifyNatGatewaySpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNatGatewaySpecResponse create() {
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
    public ModifyNatGatewaySpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNatGatewaySpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNatGatewaySpecResponseBody body);

        @Override
        ModifyNatGatewaySpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNatGatewaySpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNatGatewaySpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNatGatewaySpecResponse response) {
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
        public Builder body(ModifyNatGatewaySpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNatGatewaySpecResponse build() {
            return new ModifyNatGatewaySpecResponse(this);
        } 

    } 

}
