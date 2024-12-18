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
 * {@link ShrinkClusterRequest} extends {@link RequestModel}
 *
 * <p>ShrinkClusterRequest</p>
 */
public class ShrinkClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    private java.util.List<NodeGroups> nodeGroups;

    private ShrinkClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.nodeGroups = builder.nodeGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShrinkClusterRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List<NodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    public static final class Builder extends Request.Builder<ShrinkClusterRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List<NodeGroups> nodeGroups; 

        private Builder() {
            super();
        } 

        private Builder(ShrinkClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.nodeGroups = request.nodeGroups;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * IgnoreFailedNodeTasks.
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * NodeGroups.
         */
        public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        @Override
        public ShrinkClusterRequest build() {
            return new ShrinkClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ShrinkClusterRequest} extends {@link TeaModel}
     *
     * <p>ShrinkClusterRequest</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Nodes(Builder builder) {
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String nodeId; 

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShrinkClusterRequest} extends {@link TeaModel}
     *
     * <p>ShrinkClusterRequest</p>
     */
    public static class NodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        private NodeGroups(Builder builder) {
            this.nodeGroupId = builder.nodeGroupId;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private String nodeGroupId; 
            private java.util.List<Nodes> nodes; 

            /**
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public NodeGroups build() {
                return new NodeGroups(this);
            } 

        } 

    }
}
