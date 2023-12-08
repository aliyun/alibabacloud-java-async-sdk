// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallCenConfigureResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallCenConfigureResponse</p>
 */
public class CreateVpcFirewallCenConfigureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcFirewallCenConfigureResponseBody body;

    private CreateVpcFirewallCenConfigureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcFirewallCenConfigureResponse create() {
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
    public CreateVpcFirewallCenConfigureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcFirewallCenConfigureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcFirewallCenConfigureResponseBody body);

        @Override
        CreateVpcFirewallCenConfigureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcFirewallCenConfigureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcFirewallCenConfigureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcFirewallCenConfigureResponse response) {
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
        public Builder body(CreateVpcFirewallCenConfigureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcFirewallCenConfigureResponse build() {
            return new CreateVpcFirewallCenConfigureResponse(this);
        } 

    } 

}
