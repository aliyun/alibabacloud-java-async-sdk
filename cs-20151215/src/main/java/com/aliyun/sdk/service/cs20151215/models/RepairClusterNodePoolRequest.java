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
    @Deprecated
    private Boolean autoRestart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operations")
    private java.util.List<Operations> operations;

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
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return operations
     */
    public java.util.List<Operations> getOperations() {
        return this.operations;
    }

    public static final class Builder extends Request.Builder<RepairClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean autoRestart; 
        private java.util.List<String> nodes; 
        private java.util.List<Operations> operations; 

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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2273b7f4a30d4ef6b43e0926cd******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np613940c3593c4bea96faa8600c******</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to restart the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder autoRestart(Boolean autoRestart) {
            this.putBodyParameter("auto_restart", autoRestart);
            this.autoRestart = autoRestart;
            return this;
        }

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(java.util.List<String> nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The repair operations to be performed. If you do not specify this parameter, all repair operations are performed by default. You do not need to specify this parameter in common scenarios.</p>
         */
        public Builder operations(java.util.List<Operations> operations) {
            this.putBodyParameter("operations", operations);
            this.operations = operations;
            return this;
        }

        @Override
        public RepairClusterNodePoolRequest build() {
            return new RepairClusterNodePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link RepairClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>RepairClusterNodePoolRequest</p>
     */
    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private java.util.List<String> args;

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
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private java.util.List<String> args; 
            private String operationId; 

            private Builder() {
            } 

            private Builder(Operations model) {
                this.args = model.args;
                this.operationId = model.operationId;
            } 

            /**
             * <p>The list of repair operation parameters.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The repair operation ID. Valid values:</p>
             * <ul>
             * <li>restart.kubelet: Restarts kubelet.</li>
             * <li>restart.docker: Restarts Docker.</li>
             * <li>restart.containerd: Restarts Containerd.</li>
             * <li>restart.ntp: Restarts ntpd or chronyd.</li>
             * <li>remove.containerdContainerInSandbox: Deletes the specified sandbox container in Containerd.</li>
             * <li>remove.dockerContainerInSandbox: Deletes the specified sandbox container in Docker.</li>
             * <li>remove.containerdContainer: Deletes the specified container in Containerd.</li>
             * <li>remove.dockerContainer: Deletes the specified container in Docker.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remove.containerdContainer</p>
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
