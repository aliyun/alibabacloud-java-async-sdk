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
 * {@link GetRegisteredServiceEndpointsRequest} extends {@link RequestModel}
 *
 * <p>GetRegisteredServiceEndpointsRequest</p>
 */
public class GetRegisteredServiceEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private String clusterIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceType")
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

        private Builder(GetRegisteredServiceEndpointsRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.name = request.name;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>The name of the registered service.</p>
         * 
         * <strong>example:</strong>
         * <p>c8b054ee8c3914d079b5ce9733328****,c58faedb8a78640d3aeb0372e4c02****</p>
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>The type of the registered service. Valid values:</p>
         * <ul>
         * <li><code>ServiceEntry</code>: indicates that the service is registered by creating a service entry.</li>
         * <li><code>Kubernetes</code>: indicates that the service is registered on a Kubernetes cluster on the data plane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reviews</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The IDs of clusters in the ASM instance. Separate multiple cluster IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
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

        /**
         * <p>The endpoints of the registered service.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
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
