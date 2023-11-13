// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAutoScalingPolicyRequest} extends {@link RequestModel}
 *
 * <p>RemoveAutoScalingPolicyRequest</p>
 */
public class RemoveAutoScalingPolicyRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("NodeGroupId")
    @Validation(required = true)
    private String nodeGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RemoveAutoScalingPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodeGroupId = builder.nodeGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAutoScalingPolicyRequest create() {
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveAutoScalingPolicyRequest, Builder> {
        private String clusterId; 
        private String nodeGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAutoScalingPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodeGroupId = request.nodeGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the node group.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveAutoScalingPolicyRequest build() {
            return new RemoveAutoScalingPolicyRequest(this);
        } 

    } 

}
