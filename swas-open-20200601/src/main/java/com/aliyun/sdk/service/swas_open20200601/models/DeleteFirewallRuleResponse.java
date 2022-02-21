// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteFirewallRuleResponse</p>
 */
public class DeleteFirewallRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFirewallRuleResponseBody body;

    private DeleteFirewallRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFirewallRuleResponse create() {
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
    public DeleteFirewallRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFirewallRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFirewallRuleResponseBody body);

        @Override
        DeleteFirewallRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFirewallRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFirewallRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFirewallRuleResponse response) {
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
        public Builder body(DeleteFirewallRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFirewallRuleResponse build() {
            return new DeleteFirewallRuleResponse(this);
        } 

    } 

}
