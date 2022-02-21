// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServiceEndpointsRequest} extends {@link RequestModel}
 *
 * <p>GetRegisteredServiceEndpointsRequest</p>
 */
public class GetRegisteredServiceEndpointsRequest extends Request {
    @Body
    @NameInMap("ClusterIds")
    private String clusterIds;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServiceType")
    private String serviceType;

    private GetRegisteredServiceEndpointsRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisteredServiceEndpointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<GetRegisteredServiceEndpointsRequest, Builder> {
        private String clusterIds; 
        private String name; 
        private String namespace; 
        private String serviceMeshId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(GetRegisteredServiceEndpointsRequest response) {
            super(response);
            this.clusterIds = response.clusterIds;
            this.name = response.name;
            this.namespace = response.namespace;
            this.serviceMeshId = response.serviceMeshId;
            this.serviceType = response.serviceType;
        } 

        /**
         * ClusterIds.
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
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

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public GetRegisteredServiceEndpointsRequest build() {
            return new GetRegisteredServiceEndpointsRequest(this);
        } 

    } 

}
