// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallV2RoutePoliciesResponse} extends {@link TeaModel}
 *
 * <p>DeleteFirewallV2RoutePoliciesResponse</p>
 */
public class DeleteFirewallV2RoutePoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFirewallV2RoutePoliciesResponseBody body;

    private DeleteFirewallV2RoutePoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFirewallV2RoutePoliciesResponse create() {
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
    public DeleteFirewallV2RoutePoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFirewallV2RoutePoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFirewallV2RoutePoliciesResponseBody body);

        @Override
        DeleteFirewallV2RoutePoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFirewallV2RoutePoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFirewallV2RoutePoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFirewallV2RoutePoliciesResponse response) {
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
        public Builder body(DeleteFirewallV2RoutePoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFirewallV2RoutePoliciesResponse build() {
            return new DeleteFirewallV2RoutePoliciesResponse(this);
        } 

    } 

}
