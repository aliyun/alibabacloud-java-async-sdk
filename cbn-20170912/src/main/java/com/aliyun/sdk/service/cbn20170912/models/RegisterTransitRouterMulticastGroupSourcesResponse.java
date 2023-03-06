// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterTransitRouterMulticastGroupSourcesResponse} extends {@link TeaModel}
 *
 * <p>RegisterTransitRouterMulticastGroupSourcesResponse</p>
 */
public class RegisterTransitRouterMulticastGroupSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterTransitRouterMulticastGroupSourcesResponseBody body;

    private RegisterTransitRouterMulticastGroupSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterTransitRouterMulticastGroupSourcesResponse create() {
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
    public RegisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterTransitRouterMulticastGroupSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterTransitRouterMulticastGroupSourcesResponseBody body);

        @Override
        RegisterTransitRouterMulticastGroupSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterTransitRouterMulticastGroupSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterTransitRouterMulticastGroupSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterTransitRouterMulticastGroupSourcesResponse response) {
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
        public Builder body(RegisterTransitRouterMulticastGroupSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterTransitRouterMulticastGroupSourcesResponse build() {
            return new RegisterTransitRouterMulticastGroupSourcesResponse(this);
        } 

    } 

}
