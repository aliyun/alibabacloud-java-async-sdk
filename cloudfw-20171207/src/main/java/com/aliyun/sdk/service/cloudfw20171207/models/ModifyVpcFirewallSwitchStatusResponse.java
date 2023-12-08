// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallSwitchStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpcFirewallSwitchStatusResponse</p>
 */
public class ModifyVpcFirewallSwitchStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpcFirewallSwitchStatusResponseBody body;

    private ModifyVpcFirewallSwitchStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpcFirewallSwitchStatusResponse create() {
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
    public ModifyVpcFirewallSwitchStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpcFirewallSwitchStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpcFirewallSwitchStatusResponseBody body);

        @Override
        ModifyVpcFirewallSwitchStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpcFirewallSwitchStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpcFirewallSwitchStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpcFirewallSwitchStatusResponse response) {
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
        public Builder body(ModifyVpcFirewallSwitchStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpcFirewallSwitchStatusResponse build() {
            return new ModifyVpcFirewallSwitchStatusResponse(this);
        } 

    } 

}
