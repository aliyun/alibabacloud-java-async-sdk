// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioRouteAdditionalStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioRouteAdditionalStatusRequest</p>
 */
public class UpdateIstioRouteAdditionalStatusRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("RouteName")
    private String routeName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private UpdateIstioRouteAdditionalStatusRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.istioGatewayName = builder.istioGatewayName;
        this.priority = builder.priority;
        this.routeName = builder.routeName;
        this.serviceMeshId = builder.serviceMeshId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioRouteAdditionalStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateIstioRouteAdditionalStatusRequest, Builder> {
        private String description; 
        private String istioGatewayName; 
        private Integer priority; 
        private String routeName; 
        private String serviceMeshId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioRouteAdditionalStatusRequest request) {
            super(request);
            this.description = request.description;
            this.istioGatewayName = request.istioGatewayName;
            this.priority = request.priority;
            this.routeName = request.routeName;
            this.serviceMeshId = request.serviceMeshId;
            this.status = request.status;
        } 

        /**
         * The description of the routing rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The name of the routing rule.
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
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

        /**
         * The status of the routing rule. Valid values: 0: The routing rule is valid. 1: The routing rule is invalid. 2: An error occurs during the creation or update of the routing rule.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateIstioRouteAdditionalStatusRequest build() {
            return new UpdateIstioRouteAdditionalStatusRequest(this);
        } 

    } 

}
