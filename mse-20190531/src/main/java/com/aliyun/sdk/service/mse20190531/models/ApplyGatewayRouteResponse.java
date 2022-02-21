// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyGatewayRouteResponse} extends {@link TeaModel}
 *
 * <p>ApplyGatewayRouteResponse</p>
 */
public class ApplyGatewayRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyGatewayRouteResponseBody body;

    private ApplyGatewayRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyGatewayRouteResponse create() {
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
    public ApplyGatewayRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyGatewayRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyGatewayRouteResponseBody body);

        @Override
        ApplyGatewayRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyGatewayRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyGatewayRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyGatewayRouteResponse response) {
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
        public Builder body(ApplyGatewayRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyGatewayRouteResponse build() {
            return new ApplyGatewayRouteResponse(this);
        } 

    } 

}
