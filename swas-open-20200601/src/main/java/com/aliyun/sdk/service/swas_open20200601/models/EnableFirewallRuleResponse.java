// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableFirewallRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableFirewallRuleResponse</p>
 */
public class EnableFirewallRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableFirewallRuleResponseBody body;

    private EnableFirewallRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableFirewallRuleResponse create() {
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
    public EnableFirewallRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableFirewallRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableFirewallRuleResponseBody body);

        @Override
        EnableFirewallRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableFirewallRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableFirewallRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableFirewallRuleResponse response) {
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
        public Builder body(EnableFirewallRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableFirewallRuleResponse build() {
            return new EnableFirewallRuleResponse(this);
        } 

    } 

}
