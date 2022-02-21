// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteResponse</p>
 */
public class ListGatewayRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayRouteResponseBody body;

    private ListGatewayRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayRouteResponse create() {
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
    public ListGatewayRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayRouteResponseBody body);

        @Override
        ListGatewayRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayRouteResponse response) {
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
        public Builder body(ListGatewayRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayRouteResponse build() {
            return new ListGatewayRouteResponse(this);
        } 

    } 

}
