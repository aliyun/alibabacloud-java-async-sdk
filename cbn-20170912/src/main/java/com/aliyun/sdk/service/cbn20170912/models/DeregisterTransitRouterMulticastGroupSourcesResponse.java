// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterTransitRouterMulticastGroupSourcesResponse} extends {@link TeaModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupSourcesResponse</p>
 */
public class DeregisterTransitRouterMulticastGroupSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeregisterTransitRouterMulticastGroupSourcesResponseBody body;

    private DeregisterTransitRouterMulticastGroupSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeregisterTransitRouterMulticastGroupSourcesResponse create() {
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
    public DeregisterTransitRouterMulticastGroupSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeregisterTransitRouterMulticastGroupSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeregisterTransitRouterMulticastGroupSourcesResponseBody body);

        @Override
        DeregisterTransitRouterMulticastGroupSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeregisterTransitRouterMulticastGroupSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeregisterTransitRouterMulticastGroupSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeregisterTransitRouterMulticastGroupSourcesResponse response) {
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
        public Builder body(DeregisterTransitRouterMulticastGroupSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeregisterTransitRouterMulticastGroupSourcesResponse build() {
            return new DeregisterTransitRouterMulticastGroupSourcesResponse(this);
        } 

    } 

}
