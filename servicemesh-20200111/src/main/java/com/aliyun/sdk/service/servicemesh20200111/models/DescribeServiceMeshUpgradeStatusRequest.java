// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshUpgradeStatusRequest</p>
 */
public class DescribeServiceMeshUpgradeStatusRequest extends Request {
    @Body
    @NameInMap("AllIstioGatewayFullNames")
    private String allIstioGatewayFullNames;

    @Body
    @NameInMap("GuestClusterIds")
    private String guestClusterIds;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshUpgradeStatusRequest(Builder builder) {
        super(builder);
        this.allIstioGatewayFullNames = builder.allIstioGatewayFullNames;
        this.guestClusterIds = builder.guestClusterIds;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshUpgradeStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allIstioGatewayFullNames
     */
    public String getAllIstioGatewayFullNames() {
        return this.allIstioGatewayFullNames;
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

    public static final class Builder extends Request.Builder<DescribeServiceMeshUpgradeStatusRequest, Builder> {
        private String allIstioGatewayFullNames; 
        private String guestClusterIds; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshUpgradeStatusRequest response) {
            super(response);
            this.allIstioGatewayFullNames = response.allIstioGatewayFullNames;
            this.guestClusterIds = response.guestClusterIds;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * AllIstioGatewayFullNames.
         */
        public Builder allIstioGatewayFullNames(String allIstioGatewayFullNames) {
            this.putBodyParameter("AllIstioGatewayFullNames", allIstioGatewayFullNames);
            this.allIstioGatewayFullNames = allIstioGatewayFullNames;
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
        public DescribeServiceMeshUpgradeStatusRequest build() {
            return new DescribeServiceMeshUpgradeStatusRequest(this);
        } 

    } 

}
