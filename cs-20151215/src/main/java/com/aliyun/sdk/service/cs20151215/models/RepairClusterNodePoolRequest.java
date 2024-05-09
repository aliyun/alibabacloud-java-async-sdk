// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepairClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>RepairClusterNodePoolRequest</p>
 */
public class RepairClusterNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_restart")
    private Boolean autoRestart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List < String > nodes;

    private RepairClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoRestart = builder.autoRestart;
        this.nodes = builder.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepairClusterNodePoolRequest create() {
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
     * @return autoRestart
     */
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    /**
     * @return nodes
     */
    public java.util.List < String > getNodes() {
        return this.nodes;
    }

    public static final class Builder extends Request.Builder<RepairClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean autoRestart; 
        private java.util.List < String > nodes; 

        private Builder() {
            super();
        } 

        private Builder(RepairClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.autoRestart = request.autoRestart;
            this.nodes = request.nodes;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the node pool that you want to manage.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * auto_restart.
         */
        public Builder autoRestart(Boolean autoRestart) {
            this.putBodyParameter("auto_restart", autoRestart);
            this.autoRestart = autoRestart;
            return this;
        }

        /**
         * The list of nodes. If you do not specify nodes, all nodes in the node pool are selected.
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        @Override
        public RepairClusterNodePoolRequest build() {
            return new RepairClusterNodePoolRequest(this);
        } 

    } 

}
