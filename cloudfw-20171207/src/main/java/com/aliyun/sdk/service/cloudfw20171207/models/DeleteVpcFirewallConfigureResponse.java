// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcFirewallConfigureResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcFirewallConfigureResponse</p>
 */
public class DeleteVpcFirewallConfigureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcFirewallConfigureResponseBody body;

    private DeleteVpcFirewallConfigureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcFirewallConfigureResponse create() {
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
    public DeleteVpcFirewallConfigureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcFirewallConfigureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcFirewallConfigureResponseBody body);

        @Override
        DeleteVpcFirewallConfigureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcFirewallConfigureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcFirewallConfigureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcFirewallConfigureResponse response) {
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
        public Builder body(DeleteVpcFirewallConfigureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcFirewallConfigureResponse build() {
            return new DeleteVpcFirewallConfigureResponse(this);
        } 

    } 

}
