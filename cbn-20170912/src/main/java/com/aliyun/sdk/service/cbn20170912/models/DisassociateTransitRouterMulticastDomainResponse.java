// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateTransitRouterMulticastDomainResponse} extends {@link TeaModel}
 *
 * <p>DisassociateTransitRouterMulticastDomainResponse</p>
 */
public class DisassociateTransitRouterMulticastDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisassociateTransitRouterMulticastDomainResponseBody body;

    private DisassociateTransitRouterMulticastDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisassociateTransitRouterMulticastDomainResponse create() {
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
    public DisassociateTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisassociateTransitRouterMulticastDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisassociateTransitRouterMulticastDomainResponseBody body);

        @Override
        DisassociateTransitRouterMulticastDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisassociateTransitRouterMulticastDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisassociateTransitRouterMulticastDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisassociateTransitRouterMulticastDomainResponse response) {
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
        public Builder body(DisassociateTransitRouterMulticastDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisassociateTransitRouterMulticastDomainResponse build() {
            return new DisassociateTransitRouterMulticastDomainResponse(this);
        } 

    } 

}
