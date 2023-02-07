// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachClusterFromHubRequest} extends {@link RequestModel}
 *
 * <p>DetachClusterFromHubRequest</p>
 */
public class DetachClusterFromHubRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private String clusterIds;

    @Query
    @NameInMap("DetachFromMesh")
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
         * The ID of the master instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * A JSON string that can be parsed into a string array. The string specifies the clusters that you want to disassociate from the master instance.
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * Specifies whether to only disassociate the clusters from Service Mesh (ASM) instances. Valid values: - true: only disassociates the clusters from ASM instances. - false: disassociates the clusters from the master instance and ASM instances.
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
