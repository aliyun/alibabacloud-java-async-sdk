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

    private DetachClusterFromHubRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterIds = builder.clusterIds;
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

    public static final class Builder extends Request.Builder<DetachClusterFromHubRequest, Builder> {
        private String clusterId; 
        private String clusterIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachClusterFromHubRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterIds = request.clusterIds;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterIds.
         */
        public Builder clusterIds(String clusterIds) {
            this.putBodyParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        @Override
        public DetachClusterFromHubRequest build() {
            return new DetachClusterFromHubRequest(this);
        } 

    } 

}
