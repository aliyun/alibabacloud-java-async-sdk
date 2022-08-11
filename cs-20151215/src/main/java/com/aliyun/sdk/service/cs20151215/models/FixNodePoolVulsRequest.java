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
    @NameInMap("nodes")
    private java.util.List < String > nodes;

    @Body
    @NameInMap("rollout_policy")
    private RolloutPolicy rolloutPolicy;

    @Body
    @NameInMap("vul_list")
    private java.util.List < String > vulList;

    private FixNodePoolVulsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.nodes = builder.nodes;
        this.rolloutPolicy = builder.rolloutPolicy;
        this.vulList = builder.vulList;
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
     * @return vulList
     */
    public java.util.List < String > getVulList() {
        return this.vulList;
    }

    public static final class Builder extends Request.Builder<FixNodePoolVulsRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private java.util.List < String > nodes; 
        private RolloutPolicy rolloutPolicy; 
        private java.util.List < String > vulList; 

        private Builder() {
            super();
        } 

        private Builder(FixNodePoolVulsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.nodes = request.nodes;
            this.rolloutPolicy = request.rolloutPolicy;
            this.vulList = request.vulList;
        } 

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点池ID
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 待修复的节点名称列表
         */
        public Builder nodes(java.util.List < String > nodes) {
            this.putBodyParameter("nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * 轮转修复策略
         */
        public Builder rolloutPolicy(RolloutPolicy rolloutPolicy) {
            this.putBodyParameter("rollout_policy", rolloutPolicy);
            this.rolloutPolicy = rolloutPolicy;
            return this;
        }

        /**
         * 待修复的漏洞名称列表
         */
        public Builder vulList(java.util.List < String > vulList) {
            this.putBodyParameter("vul_list", vulList);
            this.vulList = vulList;
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
             * 轮转修复时的最大并行度
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
