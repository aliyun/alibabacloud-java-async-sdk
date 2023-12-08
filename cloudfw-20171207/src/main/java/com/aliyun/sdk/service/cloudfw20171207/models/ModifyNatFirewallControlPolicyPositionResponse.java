// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNatFirewallControlPolicyPositionResponse} extends {@link TeaModel}
 *
 * <p>ModifyNatFirewallControlPolicyPositionResponse</p>
 */
public class ModifyNatFirewallControlPolicyPositionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNatFirewallControlPolicyPositionResponseBody body;

    private ModifyNatFirewallControlPolicyPositionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNatFirewallControlPolicyPositionResponse create() {
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
    public ModifyNatFirewallControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNatFirewallControlPolicyPositionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNatFirewallControlPolicyPositionResponseBody body);

        @Override
        ModifyNatFirewallControlPolicyPositionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNatFirewallControlPolicyPositionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNatFirewallControlPolicyPositionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNatFirewallControlPolicyPositionResponse response) {
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
        public Builder body(ModifyNatFirewallControlPolicyPositionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNatFirewallControlPolicyPositionResponse build() {
            return new ModifyNatFirewallControlPolicyPositionResponse(this);
        } 

    } 

}
