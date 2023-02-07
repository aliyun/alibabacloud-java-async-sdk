// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClusterToHubRequest} extends {@link RequestModel}
 *
 * <p>AttachClusterToHubRequest</p>
 */
public class AttachClusterToHubRequest extends Request {
    @Query
    @NameInMap("AttachToMesh")
    private Boolean attachToMesh;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("ClusterIds")
    @Validation(required = true)
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
         * Specifies whether to associate the clusters with Service Mesh (ASM) instances. Valid values:
         */
        public Builder attachToMesh(Boolean attachToMesh) {
            this.putQueryParameter("AttachToMesh", attachToMesh);
            this.attachToMesh = attachToMesh;
            return this;
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
         * A JSON string that can be parsed into a string array. The string specifies the clusters that you want to associate with the master instance.
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
