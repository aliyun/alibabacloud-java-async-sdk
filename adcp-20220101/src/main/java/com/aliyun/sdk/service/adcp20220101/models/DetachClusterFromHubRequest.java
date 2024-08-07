// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachClusterFromHubRequest} extends {@link RequestModel}
 *
 * <p>DetachClusterFromHubRequest</p>
 */
public class DetachClusterFromHubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetachFromMesh")
    private Boolean detachFromMesh;

    private DetachClusterFromHubRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterIds = builder.clusterIds;
        this.detachFromMesh = builder.detachFromMesh;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachClusterFromHubRequest create() {
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
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return detachFromMesh
     */
    public Boolean getDetachFromMesh() {
        return this.detachFromMesh;
    }

    public static final class Builder extends Request.Builder<DetachClusterFromHubRequest, Builder> {
        private String clusterId; 
        private String clusterIds; 
        private Boolean detachFromMesh; 

        private Builder() {
            super();
        } 

        private Builder(DetachClusterFromHubRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterIds = request.clusterIds;
            this.detachFromMesh = request.detachFromMesh;
        } 

        /**
         * The ID of the request.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DetachClusterFromHub**.
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * Example 1
         */
        public Builder detachFromMesh(Boolean detachFromMesh) {
            this.putQueryParameter("DetachFromMesh", detachFromMesh);
            this.detachFromMesh = detachFromMesh;
            return this;
        }

        @Override
        public DetachClusterFromHubRequest build() {
            return new DetachClusterFromHubRequest(this);
        } 

    } 

}
