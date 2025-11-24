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
 * {@link CreateSwimLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSwimLaneGroupRequest</p>
 */
public class CreateSwimLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IngressGatewayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ingressGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IngressGatewayNamespace")
    private String ingressGatewayNamespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IngressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ingressType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsPermissive")
    private Boolean isPermissive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteHeader")
    private String routeHeader;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicesList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String servicesList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceHeader")
    private String traceHeader;

    private CreateSwimLaneGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.ingressGatewayName = builder.ingressGatewayName;
        this.ingressGatewayNamespace = builder.ingressGatewayNamespace;
        this.ingressType = builder.ingressType;
        this.isPermissive = builder.isPermissive;
        this.routeHeader = builder.routeHeader;
        this.serviceMeshId = builder.serviceMeshId;
        this.servicesList = builder.servicesList;
        this.traceHeader = builder.traceHeader;
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
     * @return ingressGatewayNamespace
     */
    public String getIngressGatewayNamespace() {
        return this.ingressGatewayNamespace;
    }

    /**
     * @return ingressType
     */
    public String getIngressType() {
        return this.ingressType;
    }

    /**
     * @return isPermissive
     */
    public Boolean getIsPermissive() {
        return this.isPermissive;
    }

    /**
     * @return routeHeader
     */
    public String getRouteHeader() {
        return this.routeHeader;
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

    /**
     * @return traceHeader
     */
    public String getTraceHeader() {
        return this.traceHeader;
    }

    public static final class Builder extends Request.Builder<CreateSwimLaneGroupRequest, Builder> {
        private String groupName; 
        private String ingressGatewayName; 
        private String ingressGatewayNamespace; 
        private String ingressType; 
        private Boolean isPermissive; 
        private String routeHeader; 
        private String serviceMeshId; 
        private String servicesList; 
        private String traceHeader; 

        private Builder() {
            super();
        } 

        private Builder(CreateSwimLaneGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.ingressGatewayName = request.ingressGatewayName;
            this.ingressGatewayNamespace = request.ingressGatewayNamespace;
            this.ingressType = request.ingressType;
            this.isPermissive = request.isPermissive;
            this.routeHeader = request.routeHeader;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
            this.traceHeader = request.traceHeader;
        } 

        /**
         * <p>The name of the lane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The name of the ingress gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        public Builder ingressGatewayName(String ingressGatewayName) {
            this.putBodyParameter("IngressGatewayName", ingressGatewayName);
            this.ingressGatewayName = ingressGatewayName;
            return this;
        }

        /**
         * IngressGatewayNamespace.
         */
        public Builder ingressGatewayNamespace(String ingressGatewayNamespace) {
            this.putBodyParameter("IngressGatewayNamespace", ingressGatewayNamespace);
            this.ingressGatewayNamespace = ingressGatewayNamespace;
            return this;
        }

        /**
         * <p>The type of the gateway for ingress traffic. Only ASM ingress gateways are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASM</p>
         */
        public Builder ingressType(String ingressType) {
            this.putBodyParameter("IngressType", ingressType);
            this.ingressType = ingressType;
            return this;
        }

        /**
         * <p>Specifies whether the permissive mode is enabled for the lane group to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPermissive(Boolean isPermissive) {
            this.putBodyParameter("IsPermissive", isPermissive);
            this.isPermissive = isPermissive;
            return this;
        }

        /**
         * <p>The request routing header of the lane group if you plan to create a lane group in permissive mode. This parameter must be specified when IsPermissive is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>x-asm-prefer-tag</p>
         */
        public Builder routeHeader(String routeHeader) {
            this.putBodyParameter("RouteHeader", routeHeader);
            this.routeHeader = routeHeader;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>A list of services associated with the lane group. The value is a JSON array. The format of a service is <code>$Cluster name/$Cluster ID/$Namespace/$Service name</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        /**
         * <p>The end-to-end (E2E) pass-through request header of the lane group if you plan to create a lane group in permissive mode. This parameter must be specified when IsPermissive is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>my-request-id</p>
         */
        public Builder traceHeader(String traceHeader) {
            this.putBodyParameter("TraceHeader", traceHeader);
            this.traceHeader = traceHeader;
            return this;
        }

        @Override
        public CreateSwimLaneGroupRequest build() {
            return new CreateSwimLaneGroupRequest(this);
        } 

    } 

}
