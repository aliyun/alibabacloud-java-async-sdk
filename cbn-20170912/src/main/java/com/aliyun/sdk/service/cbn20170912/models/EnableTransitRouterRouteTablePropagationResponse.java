// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableTransitRouterRouteTablePropagationResponse} extends {@link TeaModel}
 *
 * <p>EnableTransitRouterRouteTablePropagationResponse</p>
 */
public class EnableTransitRouterRouteTablePropagationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableTransitRouterRouteTablePropagationResponseBody body;

    private EnableTransitRouterRouteTablePropagationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableTransitRouterRouteTablePropagationResponse create() {
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
    public EnableTransitRouterRouteTablePropagationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableTransitRouterRouteTablePropagationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableTransitRouterRouteTablePropagationResponseBody body);

        @Override
        EnableTransitRouterRouteTablePropagationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableTransitRouterRouteTablePropagationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableTransitRouterRouteTablePropagationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableTransitRouterRouteTablePropagationResponse response) {
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
        public Builder body(EnableTransitRouterRouteTablePropagationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableTransitRouterRouteTablePropagationResponse build() {
            return new EnableTransitRouterRouteTablePropagationResponse(this);
        } 

    } 

}
