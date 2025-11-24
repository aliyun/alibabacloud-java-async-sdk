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
 * {@link UpdateMeshMultiClusterNetworkRequest} extends {@link RequestModel}
 *
 * <p>UpdateMeshMultiClusterNetworkRequest</p>
 */
public class UpdateMeshMultiClusterNetworkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultiClusterNetworks")
    private java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private UpdateMeshMultiClusterNetworkRequest(Builder builder) {
        super(builder);
        this.multiClusterNetworks = builder.multiClusterNetworks;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMeshMultiClusterNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multiClusterNetworks
     */
    public java.util.Map<String, MultiClusterNetworksValue> getMultiClusterNetworks() {
        return this.multiClusterNetworks;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateMeshMultiClusterNetworkRequest, Builder> {
        private java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMeshMultiClusterNetworkRequest request) {
            super(request);
            this.multiClusterNetworks = request.multiClusterNetworks;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The network configuration descriptions of multiple Kubernetes clusters. The key in the map is the ID of a Kubernetes cluster, and the value is the network configuration of the cluster.</p>
         */
        public Builder multiClusterNetworks(java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks) {
            String multiClusterNetworksShrink = shrink(multiClusterNetworks, "MultiClusterNetworks", "json");
            this.putBodyParameter("MultiClusterNetworks", multiClusterNetworksShrink);
            this.multiClusterNetworks = multiClusterNetworks;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpdateMeshMultiClusterNetworkRequest build() {
            return new UpdateMeshMultiClusterNetworkRequest(this);
        } 

    } 

}
