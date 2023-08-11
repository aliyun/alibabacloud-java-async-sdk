// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSwimLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSwimLaneGroupRequest</p>
 */
public class CreateSwimLaneGroupRequest extends Request {
    @Body
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Body
    @NameInMap("IngressGatewayName")
    @Validation(required = true)
    private String ingressGatewayName;

    @Body
    @NameInMap("IngressType")
    @Validation(required = true)
    private String ingressType;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServicesList")
    @Validation(required = true)
    private String servicesList;

    private CreateSwimLaneGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.ingressGatewayName = builder.ingressGatewayName;
        this.ingressType = builder.ingressType;
        this.serviceMeshId = builder.serviceMeshId;
        this.servicesList = builder.servicesList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSwimLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return ingressGatewayName
     */
    public String getIngressGatewayName() {
        return this.ingressGatewayName;
    }

    /**
     * @return ingressType
     */
    public String getIngressType() {
        return this.ingressType;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return servicesList
     */
    public String getServicesList() {
        return this.servicesList;
    }

    public static final class Builder extends Request.Builder<CreateSwimLaneGroupRequest, Builder> {
        private String groupName; 
        private String ingressGatewayName; 
        private String ingressType; 
        private String serviceMeshId; 
        private String servicesList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSwimLaneGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.ingressGatewayName = request.ingressGatewayName;
            this.ingressType = request.ingressType;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
        } 

        /**
         * The name of the lane group.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The name of the ingress gateway.
         */
        public Builder ingressGatewayName(String ingressGatewayName) {
            this.putBodyParameter("IngressGatewayName", ingressGatewayName);
            this.ingressGatewayName = ingressGatewayName;
            return this;
        }

        /**
         * The type of the gateway for ingress traffic. Only ASM ingress gateways are supported.
         */
        public Builder ingressType(String ingressType) {
            this.putBodyParameter("IngressType", ingressType);
            this.ingressType = ingressType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud Service Mesh (ASM) instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * A list of services associated with the lane group. The value is a JSON array. The format of a service is `$Cluster name/$Cluster ID/$Namespace/$Service name`.
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        @Override
        public CreateSwimLaneGroupRequest build() {
            return new CreateSwimLaneGroupRequest(this);
        } 

    } 

}
