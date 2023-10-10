// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveNodePoolNodesRequest} extends {@link RequestModel}
 *
 * <p>RemoveNodePoolNodesRequest</p>
 */
public class RemoveNodePoolNodesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Query
    @NameInMap("drain_node")
    private Boolean drainNode;

    @Query
    @NameInMap("instance_ids")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("nodes")
    private java.util.List < String > nodes;

    @Query
    @NameInMap("release_node")
    private Boolean releaseNode;

    private RemoveNodePoolNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.drainNode = builder.drainNode;
        this.instanceIds = builder.instanceIds;
        this.nodes = builder.nodes;
        this.releaseNode = builder.releaseNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveNodePoolNodesRequest create() {
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
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return drainNode
     */
    public Boolean getDrainNode() {
        return this.drainNode;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return nodes
     */
    public java.util.List < String > getNodes() {
        return this.nodes;
    }

    /**
     * @return releaseNode
     */
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

    public static final class Builder extends Request.Builder<RemoveNodePoolNodesRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean drainNode; 
        private java.util.List < String > instanceIds; 
        private java.util.List < String > nodes; 
        private Boolean releaseNode; 

        private Builder() {
            super();
        } 

        private Builder(RemoveNodePoolNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.drainNode = request.drainNode;
            this.instanceIds = request.instanceIds;
            this.nodes = request.nodes;
            this.releaseNode = request.releaseNode;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * Specifies whether to drain the nodes that you want to remove. Valid values:
         * <p>
         * 
         * *   true: drain the nodes that you want to remove.
         * *   false: do not drain the nodes that you want to remove.
         */
        public Builder drainNode(Boolean drainNode) {
            this.putQueryParameter("drain_node", drainNode);
            this.drainNode = drainNode;
            return this;
        }

        /**
         * A list of instances that you want to remove.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "instance_ids", "json");
            this.putQueryParameter("instance_ids", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * A list of nodes that you want to remove.
         */
        public Builder nodes(java.util.List < String > nodes) {
            String nodesShrink = shrink(nodes, "nodes", "json");
            this.putQueryParameter("nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * Specifies whether to release the nodes after they are removed. Valid values:
         * <p>
         * 
         * *   true: release the nodes after they are removed.
         * *   false: do not release the nodes after they are removed.
         */
        public Builder releaseNode(Boolean releaseNode) {
            this.putQueryParameter("release_node", releaseNode);
            this.releaseNode = releaseNode;
            return this;
        }

        @Override
        public RemoveNodePoolNodesRequest build() {
            return new RemoveNodePoolNodesRequest(this);
        } 

    } 

}
