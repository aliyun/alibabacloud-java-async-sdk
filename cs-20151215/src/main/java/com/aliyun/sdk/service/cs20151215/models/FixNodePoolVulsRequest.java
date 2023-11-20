// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixNodePoolVulsRequest} extends {@link RequestModel}
 *
 * <p>FixNodePoolVulsRequest</p>
 */
public class FixNodePoolVulsRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("nodepool_id")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("auto_restart")
    private Boolean autoRestart;

    @Body
    @NameInMap("nodes")
    private java.util.List < String > nodes;

    @Body
    @NameInMap("rollout_policy")
    private RolloutPolicy rolloutPolicy;

    @Body
    @NameInMap("vuls")
    private java.util.List < String > vuls;

    private FixNodePoolVulsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoRestart = builder.autoRestart;
        this.nodes = builder.nodes;
        this.rolloutPolicy = builder.rolloutPolicy;
        this.vuls = builder.vuls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixNodePoolVulsRequest create() {
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
     * @return rolloutPolicy
     */
    public RolloutPolicy getRolloutPolicy() {
        return this.rolloutPolicy;
    }

    /**
     * @return vuls
     */
    public java.util.List < String > getVuls() {
        return this.vuls;
    }

    public static final class Builder extends Request.Builder<FixNodePoolVulsRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Boolean autoRestart; 
        private java.util.List < String > nodes; 
        private RolloutPolicy rolloutPolicy; 
        private java.util.List < String > vuls; 

        private Builder() {
            super();
        } 

        private Builder(FixNodePoolVulsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.autoRestart = request.autoRestart;
            this.nodes = request.nodes;
            this.rolloutPolicy = request.rolloutPolicy;
            this.vuls = request.vuls;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The node pool ID.
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
         * The names of the nodes to be patched.
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * The batch patching policy.
         */
        public Builder rolloutPolicy(RolloutPolicy rolloutPolicy) {
            this.putBodyParameter("rollout_policy", rolloutPolicy);
            this.rolloutPolicy = rolloutPolicy;
            return this;
        }

        /**
         * The list of vulnerabilities.
         */
        public Builder vuls(java.util.List < String > vuls) {
            this.putBodyParameter("vuls", vuls);
            this.vuls = vuls;
            return this;
        }

        @Override
        public FixNodePoolVulsRequest build() {
            return new FixNodePoolVulsRequest(this);
        } 

    } 

    public static class RolloutPolicy extends TeaModel {
        @NameInMap("max_parallelism")
        private Long maxParallelism;

        private RolloutPolicy(Builder builder) {
            this.maxParallelism = builder.maxParallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolloutPolicy create() {
            return builder().build();
        }

        /**
         * @return maxParallelism
         */
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public static final class Builder {
            private Long maxParallelism; 

            /**
             * The maximum number of nodes that can be patched in parallel. The minimum value is 1. The maximum value equals the number of nodes in the node pool.
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            public RolloutPolicy build() {
                return new RolloutPolicy(this);
            } 

        } 

    }
}
