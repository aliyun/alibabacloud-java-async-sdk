// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewayRouteResponse} extends {@link TeaModel}
 *
 * <p>AddGatewayRouteResponse</p>
 */
public class AddGatewayRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddGatewayRouteResponseBody body;

    private AddGatewayRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddGatewayRouteResponse create() {
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
    public AddGatewayRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddGatewayRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddGatewayRouteResponseBody body);

        @Override
        AddGatewayRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddGatewayRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddGatewayRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddGatewayRouteResponse response) {
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
        public Builder body(AddGatewayRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddGatewayRouteResponse build() {
            return new AddGatewayRouteResponse(this);
        } 

    } 

}
