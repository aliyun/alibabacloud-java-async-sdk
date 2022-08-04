// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableFirewallRulesResponse} extends {@link TeaModel}
 *
 * <p>EnableFirewallRulesResponse</p>
 */
public class EnableFirewallRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableFirewallRulesResponseBody body;

    private EnableFirewallRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableFirewallRulesResponse create() {
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
    public EnableFirewallRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableFirewallRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableFirewallRulesResponseBody body);

        @Override
        EnableFirewallRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableFirewallRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableFirewallRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableFirewallRulesResponse response) {
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
        public Builder body(EnableFirewallRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableFirewallRulesResponse build() {
            return new EnableFirewallRulesResponse(this);
        } 

    } 

}
