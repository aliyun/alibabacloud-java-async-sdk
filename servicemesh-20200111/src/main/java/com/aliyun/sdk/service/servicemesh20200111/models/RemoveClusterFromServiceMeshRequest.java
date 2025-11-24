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
 * {@link RemoveClusterFromServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>RemoveClusterFromServiceMeshRequest</p>
 */
public class RemoveClusterFromServiceMeshRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReserveNamespace")
    private Boolean reserveNamespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private RemoveClusterFromServiceMeshRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.reserveNamespace = builder.reserveNamespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveClusterFromServiceMeshRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return reserveNamespace
     */
    public Boolean getReserveNamespace() {
        return this.reserveNamespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<RemoveClusterFromServiceMeshRequest, Builder> {
        private String clusterId; 
        private Boolean reserveNamespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveClusterFromServiceMeshRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.reserveNamespace = request.reserveNamespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The ID of the cluster that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to reserve the istio-system namespace when you delete the cluster. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reserveNamespace(Boolean reserveNamespace) {
            this.putBodyParameter("ReserveNamespace", reserveNamespace);
            this.reserveNamespace = reserveNamespace;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public RemoveClusterFromServiceMeshRequest build() {
            return new RemoveClusterFromServiceMeshRequest(this);
        } 

    } 

}
