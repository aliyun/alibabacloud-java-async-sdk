// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodePoolNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolNodeConfigRequest</p>
 */
public class ModifyNodePoolNodeConfigRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("kubelet_config")
    private KubeletConfig kubeletConfig;

    @Body
    @NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    private ModifyNodePoolNodeConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.kubeletConfig = builder.kubeletConfig;
        this.rollingPolicy = builder.rollingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodePoolNodeConfigRequest create() {
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
     * @return kubeletConfig
     */
    public KubeletConfig getKubeletConfig() {
        return this.kubeletConfig;
    }

    /**
     * @return rollingPolicy
     */
    public RollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyNodePoolNodeConfigRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private KubeletConfig kubeletConfig; 
        private RollingPolicy rollingPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodePoolNodeConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.kubeletConfig = request.kubeletConfig;
            this.rollingPolicy = request.rollingPolicy;
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
         * The kubelet configuration.
         */
        public Builder kubeletConfig(KubeletConfig kubeletConfig) {
            this.putBodyParameter("kubelet_config", kubeletConfig);
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        /**
         * The rotation configuration.
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        @Override
        public ModifyNodePoolNodeConfigRequest build() {
            return new ModifyNodePoolNodeConfigRequest(this);
        } 

    } 

    public static class RollingPolicy extends TeaModel {
        @NameInMap("max_parallelism")
        private Long maxParallelism;

        private RollingPolicy(Builder builder) {
            this.maxParallelism = builder.maxParallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RollingPolicy create() {
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
             * The maximum number of nodes in the Unschedulable state.
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            public RollingPolicy build() {
                return new RollingPolicy(this);
            } 

        } 

    }
}
