// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRouteDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayRouteDetailResponse</p>
 */
public class DescribeIstioGatewayRouteDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIstioGatewayRouteDetailResponseBody body;

    private DescribeIstioGatewayRouteDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIstioGatewayRouteDetailResponse create() {
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
    public DescribeIstioGatewayRouteDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIstioGatewayRouteDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIstioGatewayRouteDetailResponseBody body);

        @Override
        DescribeIstioGatewayRouteDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIstioGatewayRouteDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIstioGatewayRouteDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIstioGatewayRouteDetailResponse response) {
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
        public Builder body(DescribeIstioGatewayRouteDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIstioGatewayRouteDetailResponse build() {
            return new DescribeIstioGatewayRouteDetailResponse(this);
        } 

    } 

}
