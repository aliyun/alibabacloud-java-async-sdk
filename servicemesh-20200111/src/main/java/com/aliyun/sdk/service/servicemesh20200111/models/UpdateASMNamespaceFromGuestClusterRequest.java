// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateASMNamespaceFromGuestClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateASMNamespaceFromGuestClusterRequest</p>
 */
public class UpdateASMNamespaceFromGuestClusterRequest extends Request {
    @Body
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    private String k8sClusterId;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpdateASMNamespaceFromGuestClusterRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateASMNamespaceFromGuestClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateASMNamespaceFromGuestClusterRequest, Builder> {
        private String k8sClusterId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateASMNamespaceFromGuestClusterRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The ID of the Kubernetes cluster whose namespace information you want to synchronize to ASM. The Kubernetes cluster is added to the ASM instance that is specified by the ServiceMeshId parameter.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
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

        @Override
        public UpdateASMNamespaceFromGuestClusterRequest build() {
            return new UpdateASMNamespaceFromGuestClusterRequest(this);
        } 

    } 

}
