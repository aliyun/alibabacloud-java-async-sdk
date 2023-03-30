// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteOnAuthResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteOnAuthResponse</p>
 */
public class ListGatewayRouteOnAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayRouteOnAuthResponseBody body;

    private ListGatewayRouteOnAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayRouteOnAuthResponse create() {
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
    public ListGatewayRouteOnAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayRouteOnAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayRouteOnAuthResponseBody body);

        @Override
        ListGatewayRouteOnAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayRouteOnAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayRouteOnAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayRouteOnAuthResponse response) {
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
        public Builder body(ListGatewayRouteOnAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayRouteOnAuthResponse build() {
            return new ListGatewayRouteOnAuthResponse(this);
        } 

    } 

}
