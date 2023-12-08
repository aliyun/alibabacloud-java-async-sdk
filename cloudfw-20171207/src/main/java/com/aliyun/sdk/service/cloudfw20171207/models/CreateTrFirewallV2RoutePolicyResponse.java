// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrFirewallV2RoutePolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateTrFirewallV2RoutePolicyResponse</p>
 */
public class CreateTrFirewallV2RoutePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTrFirewallV2RoutePolicyResponseBody body;

    private CreateTrFirewallV2RoutePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTrFirewallV2RoutePolicyResponse create() {
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
    public CreateTrFirewallV2RoutePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTrFirewallV2RoutePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTrFirewallV2RoutePolicyResponseBody body);

        @Override
        CreateTrFirewallV2RoutePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTrFirewallV2RoutePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTrFirewallV2RoutePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTrFirewallV2RoutePolicyResponse response) {
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
        public Builder body(CreateTrFirewallV2RoutePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTrFirewallV2RoutePolicyResponse build() {
            return new CreateTrFirewallV2RoutePolicyResponse(this);
        } 

    } 

}
