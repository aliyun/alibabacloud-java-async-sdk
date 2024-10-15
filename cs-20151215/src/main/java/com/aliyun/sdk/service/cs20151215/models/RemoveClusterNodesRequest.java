// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>RemoveClusterNodesRequest</p>
 */
public class RemoveClusterNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drain_node")
    private Boolean drainNode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > nodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("release_node")
    private Boolean releaseNode;

    private RemoveClusterNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.drainNode = builder.drainNode;
        this.nodes = builder.nodes;
        this.releaseNode = builder.releaseNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveClusterNodesRequest create() {
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
     * @return drainNode
     */
    public Boolean getDrainNode() {
        return this.drainNode;
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

    public static final class Builder extends Request.Builder<RemoveClusterNodesRequest, Builder> {
        private String clusterId; 
        private Boolean drainNode; 
        private java.util.List < String > nodes; 
        private Boolean releaseNode; 

        private Builder() {
            super();
        } 

        private Builder(RemoveClusterNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.drainNode = request.drainNode;
            this.nodes = request.nodes;
            this.releaseNode = request.releaseNode;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to evict all pods from the nodes that you want to remove.</p>
         */
        public Builder drainNode(Boolean drainNode) {
            this.putBodyParameter("drain_node", drainNode);
            this.drainNode = drainNode;
            return this;
        }

        /**
         * <p>The list of nodes to be removed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>Specifies whether to release the Elastic Compute Service (ECS) instances when they are removed from the cluster.</p>
         */
        public Builder releaseNode(Boolean releaseNode) {
            this.putBodyParameter("release_node", releaseNode);
            this.releaseNode = releaseNode;
            return this;
        }

        @Override
        public RemoveClusterNodesRequest build() {
            return new RemoveClusterNodesRequest(this);
        } 

    } 

}
