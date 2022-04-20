// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRouteDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeIstioGatewayRouteDetailRequest</p>
 */
public class DescribeIstioGatewayRouteDetailRequest extends Request {
    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("RouteName")
    private String routeName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeIstioGatewayRouteDetailRequest(Builder builder) {
        super(builder);
        this.istioGatewayName = builder.istioGatewayName;
        this.routeName = builder.routeName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayRouteDetailRequest create() {
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
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeIstioGatewayRouteDetailRequest, Builder> {
        private String istioGatewayName; 
        private String routeName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIstioGatewayRouteDetailRequest request) {
            super(request);
            this.istioGatewayName = request.istioGatewayName;
            this.routeName = request.routeName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * IstioGatewayName.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * RouteName.
         */
        public Builder routeName(String routeName) {
            this.putBodyParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeIstioGatewayRouteDetailRequest build() {
            return new DescribeIstioGatewayRouteDetailRequest(this);
        } 

    } 

}
