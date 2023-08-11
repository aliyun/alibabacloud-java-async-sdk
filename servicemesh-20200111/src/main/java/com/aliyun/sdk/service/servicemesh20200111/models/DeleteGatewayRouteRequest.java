// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayRouteRequest</p>
 */
public class DeleteGatewayRouteRequest extends Request {
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

    private DeleteGatewayRouteRequest(Builder builder) {
        super(builder);
        this.istioGatewayName = builder.istioGatewayName;
        this.routeName = builder.routeName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayRouteRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGatewayRouteRequest, Builder> {
        private String istioGatewayName; 
        private String routeName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayRouteRequest request) {
            super(request);
            this.istioGatewayName = request.istioGatewayName;
            this.routeName = request.routeName;
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
         * The name of the routing rule.
         */
        public Builder routeName(String routeName) {
            this.putBodyParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DeleteGatewayRouteRequest build() {
            return new DeleteGatewayRouteRequest(this);
        } 

    } 

}
