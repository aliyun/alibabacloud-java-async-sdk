// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterIntoServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>AddClusterIntoServiceMeshRequest</p>
 */
public class AddClusterIntoServiceMeshRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private AddClusterIntoServiceMeshRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClusterIntoServiceMeshRequest create() {
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<AddClusterIntoServiceMeshRequest, Builder> {
        private String clusterId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(AddClusterIntoServiceMeshRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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

        @Override
        public AddClusterIntoServiceMeshRequest build() {
            return new AddClusterIntoServiceMeshRequest(this);
        } 

    } 

}
