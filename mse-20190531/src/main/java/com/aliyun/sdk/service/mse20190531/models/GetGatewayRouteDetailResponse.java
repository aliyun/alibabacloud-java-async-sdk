// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayRouteDetailResponse} extends {@link TeaModel}
 *
 * <p>GetGatewayRouteDetailResponse</p>
 */
public class GetGatewayRouteDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGatewayRouteDetailResponseBody body;

    private GetGatewayRouteDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGatewayRouteDetailResponse create() {
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
    public GetGatewayRouteDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGatewayRouteDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGatewayRouteDetailResponseBody body);

        @Override
        GetGatewayRouteDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGatewayRouteDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGatewayRouteDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGatewayRouteDetailResponse response) {
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
        public Builder body(GetGatewayRouteDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGatewayRouteDetailResponse build() {
            return new GetGatewayRouteDetailResponse(this);
        } 

    } 

}
