// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ChangeNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeNodeGroupRequest</p>
 */
public class ChangeNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetNodeGroupId")
    private String targetNodeGroupId;

    private ChangeNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.nodes = builder.nodes;
        this.targetNodeGroupId = builder.targetNodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeNodeGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return targetNodeGroupId
     */
    public String getTargetNodeGroupId() {
        return this.targetNodeGroupId;
    }

    public static final class Builder extends Request.Builder<ChangeNodeGroupRequest, Builder> {
        private String regionId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List<String> nodes; 
        private String targetNodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.nodes = request.nodes;
            this.targetNodeGroupId = request.targetNodeGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * IgnoreFailedNodeTasks.
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putQueryParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List<String> nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "json");
            this.putBodyParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * TargetNodeGroupId.
         */
        public Builder targetNodeGroupId(String targetNodeGroupId) {
            this.putQueryParameter("TargetNodeGroupId", targetNodeGroupId);
            this.targetNodeGroupId = targetNodeGroupId;
            return this;
        }

        @Override
        public ChangeNodeGroupRequest build() {
            return new ChangeNodeGroupRequest(this);
        } 

    } 

}
