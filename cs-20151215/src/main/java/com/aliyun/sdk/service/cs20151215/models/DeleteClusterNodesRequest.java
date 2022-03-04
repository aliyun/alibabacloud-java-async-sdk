// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterNodesRequest</p>
 */
public class DeleteClusterNodesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("drain_node")
    private Boolean drainNode;

    @Body
    @NameInMap("release_node")
    private Boolean releaseNode;

    @Body
    @NameInMap("nodes")
    private java.util.List < String > nodes;

    private DeleteClusterNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.drainNode = builder.drainNode;
        this.releaseNode = builder.releaseNode;
        this.nodes = builder.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodesRequest create() {
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
     * @return releaseNode
     */
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

    /**
     * @return nodes
     */
    public java.util.List < String > getNodes() {
        return this.nodes;
    }

    public static final class Builder extends Request.Builder<DeleteClusterNodesRequest, Builder> {
        private String clusterId; 
        private Boolean drainNode; 
        private Boolean releaseNode; 
        private java.util.List < String > nodes; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.drainNode = request.drainNode;
            this.releaseNode = request.releaseNode;
            this.nodes = request.nodes;
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
         * Indicates whether the pods on the node are automatically emptied. Valid values:
         * <p>
         * -"true": The pods on the node are automatically emptied.
         * -"false": The pods on the node are not automatically emptied.
         * 
         * Default value: "false ".
         */
        public Builder drainNode(Boolean drainNode) {
            this.putBodyParameter("drain_node", drainNode);
            this.drainNode = drainNode;
            return this;
        }

        /**
         * Specifies whether to remove ECS instances at the same time. Valid values:
         * <p>
         * 
         * -"true": removes ECS instances at the same time.
         * -"false": removes ECS instances.
         * 
         * Default value: "false ".
         * 
         * > if the node is a subscription instance, you cannot remove ECS instances at the same time.
         */
        public Builder releaseNode(Boolean releaseNode) {
            this.putBodyParameter("release_node", releaseNode);
            this.releaseNode = releaseNode;
            return this;
        }

        /**
         * Remove the node list. The node name must be the node name in the cluster, for example, "cn-hangzhou.192.168.0.70 ".
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        @Override
        public DeleteClusterNodesRequest build() {
            return new DeleteClusterNodesRequest(this);
        } 

    } 

}
