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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operations")
    private java.util.List < Operations> operations;

    private RepairClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoRestart = builder.autoRestart;
        this.nodes = builder.nodes;
        this.operations = builder.operations;
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

    /**
     * @return operations
     */
    public java.util.List < Operations> getOperations() {
        return this.operations;
    }

    public static final class Builder extends Request.Builder<RepairClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean autoRestart; 
        private java.util.List < String > nodes; 
        private java.util.List < Operations> operations; 

        private Builder() {
            super();
        } 

        private Builder(RepairClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.autoRestart = request.autoRestart;
            this.nodes = request.nodes;
            this.operations = request.operations;
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
         * Specifies whether to restart the instance of the node.
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

        /**
         * operations.
         */
        public Builder operations(java.util.List < Operations> operations) {
            this.putBodyParameter("operations", operations);
            this.operations = operations;
            return this;
        }

        @Override
        public RepairClusterNodePoolRequest build() {
            return new RepairClusterNodePoolRequest(this);
        } 

    } 

    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private java.util.List < String > args;

        @com.aliyun.core.annotation.NameInMap("operation_id")
        private String operationId;

        private Operations(Builder builder) {
            this.args = builder.args;
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private java.util.List < String > args; 
            private String operationId; 

            /**
             * args.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * operation_id.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
}
