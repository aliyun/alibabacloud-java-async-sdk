// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshGatewayPodStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshGatewayPodStatusRequest</p>
 */
public class DescribeServiceMeshGatewayPodStatusRequest extends Request {
    @Body
    @NameInMap("GatewayFullName")
    private String gatewayFullName;

    @Body
    @NameInMap("GuestClusterIds")
    private String guestClusterIds;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshGatewayPodStatusRequest(Builder builder) {
        super(builder);
        this.gatewayFullName = builder.gatewayFullName;
        this.guestClusterIds = builder.guestClusterIds;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshGatewayPodStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayFullName
     */
    public String getGatewayFullName() {
        return this.gatewayFullName;
    }

    /**
     * @return guestClusterIds
     */
    public String getGuestClusterIds() {
        return this.guestClusterIds;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshGatewayPodStatusRequest, Builder> {
        private String gatewayFullName; 
        private String guestClusterIds; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshGatewayPodStatusRequest response) {
            super(response);
            this.gatewayFullName = response.gatewayFullName;
            this.guestClusterIds = response.guestClusterIds;
            this.serviceMeshId = response.serviceMeshId;
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
         * GuestClusterIds.
         */
        public Builder guestClusterIds(String guestClusterIds) {
            this.putBodyParameter("GuestClusterIds", guestClusterIds);
            this.guestClusterIds = guestClusterIds;
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
        public DescribeServiceMeshGatewayPodStatusRequest build() {
            return new DescribeServiceMeshGatewayPodStatusRequest(this);
        } 

    } 

}
