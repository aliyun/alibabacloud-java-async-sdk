// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallConfigureResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallConfigureResponse</p>
 */
public class CreateVpcFirewallConfigureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcFirewallConfigureResponseBody body;

    private CreateVpcFirewallConfigureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcFirewallConfigureResponse create() {
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
    public CreateVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcFirewallConfigureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcFirewallConfigureResponseBody body);

        @Override
        CreateVpcFirewallConfigureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcFirewallConfigureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcFirewallConfigureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcFirewallConfigureResponse response) {
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
        public Builder body(CreateVpcFirewallConfigureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcFirewallConfigureResponse build() {
            return new CreateVpcFirewallConfigureResponse(this);
        } 

    } 

}
