// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterMemberRequest</p>
 */
public class DeleteClusterMemberRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ClusterMemberId")
    @Validation(required = true)
    private String clusterMemberId;

    private DeleteClusterMemberRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterMemberId = builder.clusterMemberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterMemberRequest create() {
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
     * @return clusterMemberId
     */
    public String getClusterMemberId() {
        return this.clusterMemberId;
    }

    public static final class Builder extends Request.Builder<DeleteClusterMemberRequest, Builder> {
        private String clusterId; 
        private String clusterMemberId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterMemberRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterMemberId = request.clusterMemberId;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The member ID of the ECS instance that you want to remove from the cluster.
         */
        public Builder clusterMemberId(String clusterMemberId) {
            this.putQueryParameter("ClusterMemberId", clusterMemberId);
            this.clusterMemberId = clusterMemberId;
            return this;
        }

        @Override
        public DeleteClusterMemberRequest build() {
            return new DeleteClusterMemberRequest(this);
        } 

    } 

}
