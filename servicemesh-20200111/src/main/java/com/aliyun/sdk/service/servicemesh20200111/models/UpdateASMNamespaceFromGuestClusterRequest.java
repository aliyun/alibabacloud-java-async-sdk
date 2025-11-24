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
 * {@link UpdateASMNamespaceFromGuestClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateASMNamespaceFromGuestClusterRequest</p>
 */
public class UpdateASMNamespaceFromGuestClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("K8sClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String k8sClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the Kubernetes cluster whose namespace information you want to synchronize to ASM. The Kubernetes cluster is added to the ASM instance that is specified by the ServiceMeshId parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c6f6d46583def494ba1f2e2937c8*****</p>
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cbf9ca9e6d5dc4c87a3ecd0ebf1e*****</p>
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
