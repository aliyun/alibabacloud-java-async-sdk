// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshGatewaySLBStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshGatewaySLBStatusRequest</p>
 */
public class DescribeServiceMeshGatewaySLBStatusRequest extends Request {
    @Body
    @NameInMap("GatewayAddresses")
    private String gatewayAddresses;

    @Body
    @NameInMap("GatewayFullName")
    private String gatewayFullName;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshGatewaySLBStatusRequest(Builder builder) {
        super(builder);
        this.gatewayAddresses = builder.gatewayAddresses;
        this.gatewayFullName = builder.gatewayFullName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshGatewaySLBStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayAddresses
     */
    public String getGatewayAddresses() {
        return this.gatewayAddresses;
    }

    /**
     * @return gatewayFullName
     */
    public String getGatewayFullName() {
        return this.gatewayFullName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshGatewaySLBStatusRequest, Builder> {
        private String gatewayAddresses; 
        private String gatewayFullName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshGatewaySLBStatusRequest response) {
            super(response);
            this.gatewayAddresses = response.gatewayAddresses;
            this.gatewayFullName = response.gatewayFullName;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * GatewayAddresses.
         */
        public Builder gatewayAddresses(String gatewayAddresses) {
            this.putBodyParameter("GatewayAddresses", gatewayAddresses);
            this.gatewayAddresses = gatewayAddresses;
            return this;
        }

        /**
         * GatewayFullName.
         */
        public Builder gatewayFullName(String gatewayFullName) {
            this.putBodyParameter("GatewayFullName", gatewayFullName);
            this.gatewayFullName = gatewayFullName;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeServiceMeshGatewaySLBStatusRequest build() {
            return new DescribeServiceMeshGatewaySLBStatusRequest(this);
        } 

    } 

}
