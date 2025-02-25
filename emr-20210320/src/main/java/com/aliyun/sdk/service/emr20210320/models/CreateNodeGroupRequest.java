// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeGroupRequest</p>
 */
public class CreateNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeGroupConfig nodeGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C-E525E04F3914****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about the node group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeGroup(NodeGroupConfig nodeGroup) {
            this.putQueryParameter("NodeGroup", nodeGroup);
            this.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
