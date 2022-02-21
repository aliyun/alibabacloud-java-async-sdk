// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineGatewayRouteResponse} extends {@link TeaModel}
 *
 * <p>OfflineGatewayRouteResponse</p>
 */
public class OfflineGatewayRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OfflineGatewayRouteResponseBody body;

    private OfflineGatewayRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OfflineGatewayRouteResponse create() {
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
    public OfflineGatewayRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OfflineGatewayRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OfflineGatewayRouteResponseBody body);

        @Override
        OfflineGatewayRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OfflineGatewayRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OfflineGatewayRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OfflineGatewayRouteResponse response) {
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
        public Builder body(OfflineGatewayRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OfflineGatewayRouteResponse build() {
            return new OfflineGatewayRouteResponse(this);
        } 

    } 

}
