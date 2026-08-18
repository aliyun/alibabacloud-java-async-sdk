// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeleteNodePoolComponentInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodePoolComponentInstanceRequest</p>
 */
public class DeleteNodePoolComponentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batch_interval")
    private Long batchInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("max_failed_nodes")
    private Long maxFailedNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("max_parallelism")
    private Long maxParallelism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("node_names")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pause_policy")
    private String pausePolicy;

    private DeleteNodePoolComponentInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.name = builder.name;
        this.batchInterval = builder.batchInterval;
        this.maxFailedNodes = builder.maxFailedNodes;
        this.maxParallelism = builder.maxParallelism;
        this.nodeNames = builder.nodeNames;
        this.pausePolicy = builder.pausePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodePoolComponentInstanceRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return batchInterval
     */
    public Long getBatchInterval() {
        return this.batchInterval;
    }

    /**
     * @return maxFailedNodes
     */
    public Long getMaxFailedNodes() {
        return this.maxFailedNodes;
    }

    /**
     * @return maxParallelism
     */
    public Long getMaxParallelism() {
        return this.maxParallelism;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return pausePolicy
     */
    public String getPausePolicy() {
        return this.pausePolicy;
    }

    public static final class Builder extends Request.Builder<DeleteNodePoolComponentInstanceRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String name; 
        private Long batchInterval; 
        private Long maxFailedNodes; 
        private Long maxParallelism; 
        private java.util.List<String> nodeNames; 
        private String pausePolicy; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodePoolComponentInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.name = request.name;
            this.batchInterval = request.batchInterval;
            this.maxFailedNodes = request.maxFailedNodes;
            this.maxParallelism = request.maxParallelism;
            this.nodeNames = request.nodeNames;
            this.pausePolicy = request.pausePolicy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c846d7d529e34413c9ab1****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np1855b102ac434f5990d87b77a****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>component-name</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * batch_interval.
         */
        public Builder batchInterval(Long batchInterval) {
            this.putQueryParameter("batch_interval", batchInterval);
            this.batchInterval = batchInterval;
            return this;
        }

        /**
         * max_failed_nodes.
         */
        public Builder maxFailedNodes(Long maxFailedNodes) {
            this.putQueryParameter("max_failed_nodes", maxFailedNodes);
            this.maxFailedNodes = maxFailedNodes;
            return this;
        }

        /**
         * max_parallelism.
         */
        public Builder maxParallelism(Long maxParallelism) {
            this.putQueryParameter("max_parallelism", maxParallelism);
            this.maxParallelism = maxParallelism;
            return this;
        }

        /**
         * node_names.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            String nodeNamesShrink = shrink(nodeNames, "node_names", "json");
            this.putQueryParameter("node_names", nodeNamesShrink);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * pause_policy.
         */
        public Builder pausePolicy(String pausePolicy) {
            this.putQueryParameter("pause_policy", pausePolicy);
            this.pausePolicy = pausePolicy;
            return this;
        }

        @Override
        public DeleteNodePoolComponentInstanceRequest build() {
            return new DeleteNodePoolComponentInstanceRequest(this);
        } 

    } 

}
