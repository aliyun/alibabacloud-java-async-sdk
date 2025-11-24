// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceMeshUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshUpgradeStatusRequest</p>
 */
public class DescribeServiceMeshUpgradeStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllIstioGatewayFullNames")
    private String allIstioGatewayFullNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuestClusterIds")
    private String guestClusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeServiceMeshUpgradeStatusRequest request) {
            super(request);
            this.allIstioGatewayFullNames = request.allIstioGatewayFullNames;
            this.guestClusterIds = request.guestClusterIds;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The fully qualified names of ingress gateways in the ASM instance. Separate multiple names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>istio-system:ingressgateway1,istio-system:ingressgateway2</p>
         */
        public Builder allIstioGatewayFullNames(String allIstioGatewayFullNames) {
            this.putBodyParameter("AllIstioGatewayFullNames", allIstioGatewayFullNames);
            this.allIstioGatewayFullNames = allIstioGatewayFullNames;
            return this;
        }

        /**
         * <p>The IDs of the clusters on the data plane of the ASM instance. Separate multiple clusters with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>caeac85a793c94afbbb0a4bb20320****</p>
         */
        public Builder guestClusterIds(String guestClusterIds) {
            this.putBodyParameter("GuestClusterIds", guestClusterIds);
            this.guestClusterIds = guestClusterIds;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
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
