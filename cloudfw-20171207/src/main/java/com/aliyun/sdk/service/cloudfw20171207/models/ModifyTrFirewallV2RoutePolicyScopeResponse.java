// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTrFirewallV2RoutePolicyScopeResponse} extends {@link TeaModel}
 *
 * <p>ModifyTrFirewallV2RoutePolicyScopeResponse</p>
 */
public class ModifyTrFirewallV2RoutePolicyScopeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTrFirewallV2RoutePolicyScopeResponseBody body;

    private ModifyTrFirewallV2RoutePolicyScopeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTrFirewallV2RoutePolicyScopeResponse create() {
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
    public ModifyTrFirewallV2RoutePolicyScopeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTrFirewallV2RoutePolicyScopeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTrFirewallV2RoutePolicyScopeResponseBody body);

        @Override
        ModifyTrFirewallV2RoutePolicyScopeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTrFirewallV2RoutePolicyScopeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTrFirewallV2RoutePolicyScopeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTrFirewallV2RoutePolicyScopeResponse response) {
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
        public Builder body(ModifyTrFirewallV2RoutePolicyScopeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTrFirewallV2RoutePolicyScopeResponse build() {
            return new ModifyTrFirewallV2RoutePolicyScopeResponse(this);
        } 

    } 

}
