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
 * {@link DescribeIstioGatewayRouteDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeIstioGatewayRouteDetailRequest</p>
 */
public class DescribeIstioGatewayRouteDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteName")
    private String routeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the ASM gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-route</p>
         */
        public Builder routeName(String routeName) {
            this.putBodyParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
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
