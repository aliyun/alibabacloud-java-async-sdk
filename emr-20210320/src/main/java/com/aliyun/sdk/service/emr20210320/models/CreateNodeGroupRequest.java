// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeGroupRequest</p>
 */
public class CreateNodeGroupRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("NodeGroup")
    @Validation(required = true)
    private NodeGroupConfig nodeGroup;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateNodeGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodeGroup = builder.nodeGroup;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeGroupRequest create() {
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
     * @return nodeGroup
     */
    public NodeGroupConfig getNodeGroup() {
        return this.nodeGroup;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateNodeGroupRequest, Builder> {
        private String clusterId; 
        private NodeGroupConfig nodeGroup; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodeGroup = request.nodeGroup;
            this.regionId = request.regionId;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点组信息。
         */
        public Builder nodeGroup(NodeGroupConfig nodeGroup) {
            this.putQueryParameter("NodeGroup", nodeGroup);
            this.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateNodeGroupRequest build() {
            return new CreateNodeGroupRequest(this);
        } 

    } 

}
