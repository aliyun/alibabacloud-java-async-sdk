// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRoutesRequest} extends {@link RequestModel}
 *
 * <p>DescribeIstioGatewayRoutesRequest</p>
 */
public class DescribeIstioGatewayRoutesRequest extends Request {
    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeIstioGatewayRoutesRequest(Builder builder) {
        super(builder);
        this.istioGatewayName = builder.istioGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayRoutesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeIstioGatewayRoutesRequest, Builder> {
        private String istioGatewayName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIstioGatewayRoutesRequest request) {
            super(request);
            this.istioGatewayName = request.istioGatewayName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The name of the ASM gateway.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeIstioGatewayRoutesRequest build() {
            return new DescribeIstioGatewayRoutesRequest(this);
        } 

    } 

}
