// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse} extends {@link TeaModel}
 *
 * <p>VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse</p>
 */
public class VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body;

    private VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse create() {
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
    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body);

        @Override
        VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse response) {
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
        public Builder body(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse build() {
            return new VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse(this);
        } 

    } 

}
