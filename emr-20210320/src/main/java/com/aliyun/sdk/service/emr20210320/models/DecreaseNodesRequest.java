// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecreaseNodesRequest} extends {@link RequestModel}
 *
 * <p>DecreaseNodesRequest</p>
 */
public class DecreaseNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DecreaseNodeCount")
    private Integer decreaseNodeCount;

    @Query
    @NameInMap("NodeGroupId")
    @Validation(required = true)
    private String nodeGroupId;

    @Query
    @NameInMap("NodeIds")
    private java.util.List < String > nodeIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DecreaseNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.decreaseNodeCount = builder.decreaseNodeCount;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeIds = builder.nodeIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecreaseNodesRequest create() {
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
     * @return decreaseNodeCount
     */
    public Integer getDecreaseNodeCount() {
        return this.decreaseNodeCount;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeIds
     */
    public java.util.List < String > getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DecreaseNodesRequest, Builder> {
        private String clusterId; 
        private Integer decreaseNodeCount; 
        private String nodeGroupId; 
        private java.util.List < String > nodeIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DecreaseNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.decreaseNodeCount = request.decreaseNodeCount;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeIds = request.nodeIds;
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
         * The number of nodes to scale in. The number of nodes to be scaled in. The value should be less than the number of surviving nodes in the current node group.
         */
        public Builder decreaseNodeCount(Integer decreaseNodeCount) {
            this.putQueryParameter("DecreaseNodeCount", decreaseNodeCount);
            this.decreaseNodeCount = decreaseNodeCount;
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
         * The array of node IDs. Valid values of array element N: 1 to 500.
         */
        public Builder nodeIds(java.util.List < String > nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * The ID of the region in which you want to create the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DecreaseNodesRequest build() {
            return new DecreaseNodesRequest(this);
        } 

    } 

}
