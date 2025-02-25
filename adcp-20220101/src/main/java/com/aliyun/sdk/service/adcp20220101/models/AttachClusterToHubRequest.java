// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClusterToHubRequest} extends {@link RequestModel}
 *
 * <p>AttachClusterToHubRequest</p>
 */
public class AttachClusterToHubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachToMesh")
    private Boolean attachToMesh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterIds;

    private AttachClusterToHubRequest(Builder builder) {
        super(builder);
        this.attachToMesh = builder.attachToMesh;
        this.clusterId = builder.clusterId;
        this.clusterIds = builder.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachClusterToHubRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachToMesh
     */
    public Boolean getAttachToMesh() {
        return this.attachToMesh;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    public static final class Builder extends Request.Builder<AttachClusterToHubRequest, Builder> {
        private Boolean attachToMesh; 
        private String clusterId; 
        private String clusterIds; 

        private Builder() {
            super();
        } 

        private Builder(AttachClusterToHubRequest request) {
            super(request);
            this.attachToMesh = request.attachToMesh;
            this.clusterId = request.clusterId;
            this.clusterIds = request.clusterIds;
        } 

        /**
         * The operation that you want to perform. Set the value to **AttachClusterToHub**.
         */
        public Builder attachToMesh(Boolean attachToMesh) {
            this.putQueryParameter("AttachToMesh", attachToMesh);
            this.attachToMesh = attachToMesh;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        @Override
        public AttachClusterToHubRequest build() {
            return new AttachClusterToHubRequest(this);
        } 

    } 

}
