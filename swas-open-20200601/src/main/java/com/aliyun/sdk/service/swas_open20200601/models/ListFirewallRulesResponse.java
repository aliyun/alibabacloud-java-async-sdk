// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFirewallRulesResponse} extends {@link TeaModel}
 *
 * <p>ListFirewallRulesResponse</p>
 */
public class ListFirewallRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFirewallRulesResponseBody body;

    private ListFirewallRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFirewallRulesResponse create() {
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
    public ListFirewallRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFirewallRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFirewallRulesResponseBody body);

        @Override
        ListFirewallRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFirewallRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFirewallRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFirewallRulesResponse response) {
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
        public Builder body(ListFirewallRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFirewallRulesResponse build() {
            return new ListFirewallRulesResponse(this);
        } 

    } 

}
