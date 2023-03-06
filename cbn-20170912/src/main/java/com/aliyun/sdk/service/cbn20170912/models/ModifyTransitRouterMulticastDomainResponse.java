// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTransitRouterMulticastDomainResponse} extends {@link TeaModel}
 *
 * <p>ModifyTransitRouterMulticastDomainResponse</p>
 */
public class ModifyTransitRouterMulticastDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTransitRouterMulticastDomainResponseBody body;

    private ModifyTransitRouterMulticastDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTransitRouterMulticastDomainResponse create() {
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
    public ModifyTransitRouterMulticastDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTransitRouterMulticastDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTransitRouterMulticastDomainResponseBody body);

        @Override
        ModifyTransitRouterMulticastDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTransitRouterMulticastDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTransitRouterMulticastDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTransitRouterMulticastDomainResponse response) {
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
        public Builder body(ModifyTransitRouterMulticastDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTransitRouterMulticastDomainResponse build() {
            return new ModifyTransitRouterMulticastDomainResponse(this);
        } 

    } 

}
