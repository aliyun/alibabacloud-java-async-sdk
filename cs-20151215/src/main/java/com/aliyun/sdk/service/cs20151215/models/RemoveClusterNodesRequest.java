// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>RemoveClusterNodesRequest</p>
 */
public class RemoveClusterNodesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("drain_node")
    private Boolean drainNode;

    @Body
    @NameInMap("nodes")
    @Validation(required = true)
    private java.util.List < String > nodes;

    @Body
    @NameInMap("release_node")
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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 是否排空节点上的Pod。
         */
        public Builder drainNode(Boolean drainNode) {
            this.putBodyParameter("drain_node", drainNode);
            this.drainNode = drainNode;
            return this;
        }

        /**
         * 要移除的Node列表。
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * 是否同时释放ECS。
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
