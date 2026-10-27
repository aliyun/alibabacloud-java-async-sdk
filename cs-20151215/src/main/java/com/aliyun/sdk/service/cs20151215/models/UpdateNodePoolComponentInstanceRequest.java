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
 * {@link UpdateNodePoolComponentInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodePoolComponentInstanceRequest</p>
 */
public class UpdateNodePoolComponentInstanceRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_rolling")
    private Boolean disableRolling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_names")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private UpdateNodePoolComponentInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.name = builder.name;
        this.config = builder.config;
        this.disableRolling = builder.disableRolling;
        this.nodeNames = builder.nodeNames;
        this.rollingPolicy = builder.rollingPolicy;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodePoolComponentInstanceRequest create() {
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
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return disableRolling
     */
    public Boolean getDisableRolling() {
        return this.disableRolling;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return rollingPolicy
     */
    public RollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateNodePoolComponentInstanceRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String name; 
        private Config config; 
        private Boolean disableRolling; 
        private java.util.List<String> nodeNames; 
        private RollingPolicy rollingPolicy; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodePoolComponentInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.name = request.name;
            this.config = request.config;
            this.disableRolling = request.disableRolling;
            this.nodeNames = request.nodeNames;
            this.rollingPolicy = request.rollingPolicy;
            this.version = request.version;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2230fxxxxx</p>
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
         * <p>np8d8c9c2cd0f64e89884f82a5fbcd****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The component name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The node component configuration.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to disable rolling updates. Default value: false. Updating the baseline configuration triggers a rolling update of the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableRolling(Boolean disableRolling) {
            this.putBodyParameter("disable_rolling", disableRolling);
            this.disableRolling = disableRolling;
            return this;
        }

        /**
         * <p>The list of nodes to be updated in a rolling manner. Default value: all nodes.</p>
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.putBodyParameter("node_names", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * <p>The rolling update configuration.</p>
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        /**
         * <p>The node component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.33.3-aliyun.1</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateNodePoolComponentInstanceRequest build() {
            return new UpdateNodePoolComponentInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNodePoolComponentInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodePoolComponentInstanceRequest</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Envs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>LOG_LEVEL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateNodePoolComponentInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodePoolComponentInstanceRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("custom_config")
        private java.util.Map<String, ?> customConfig;

        @com.aliyun.core.annotation.NameInMap("envs")
        private java.util.List<Envs> envs;

        private Config(Builder builder) {
            this.customConfig = builder.customConfig;
            this.envs = builder.envs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return customConfig
         */
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        /**
         * @return envs
         */
        public java.util.List<Envs> getEnvs() {
            return this.envs;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customConfig; 
            private java.util.List<Envs> envs; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
                this.envs = model.envs;
            } 

            /**
             * <p>The custom configuration of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
             */
            public Builder customConfig(java.util.Map<String, ?> customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            /**
             * <p>The environment variables of the node component.</p>
             */
            public Builder envs(java.util.List<Envs> envs) {
                this.envs = envs;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateNodePoolComponentInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodePoolComponentInstanceRequest</p>
     */
    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batch_interval")
        private Long batchInterval;

        @com.aliyun.core.annotation.NameInMap("max_failed_nodes")
        private Long maxFailedNodes;

        @com.aliyun.core.annotation.NameInMap("max_parallelism")
        private Long maxParallelism;

        @com.aliyun.core.annotation.NameInMap("pause_policy")
        private String pausePolicy;

        private RollingPolicy(Builder builder) {
            this.batchInterval = builder.batchInterval;
            this.maxFailedNodes = builder.maxFailedNodes;
            this.maxParallelism = builder.maxParallelism;
            this.pausePolicy = builder.pausePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RollingPolicy create() {
            return builder().build();
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
         * @return pausePolicy
         */
        public String getPausePolicy() {
            return this.pausePolicy;
        }

        public static final class Builder {
            private Long batchInterval; 
            private Long maxFailedNodes; 
            private Long maxParallelism; 
            private String pausePolicy; 

            private Builder() {
            } 

            private Builder(RollingPolicy model) {
                this.batchInterval = model.batchInterval;
                this.maxFailedNodes = model.maxFailedNodes;
                this.maxParallelism = model.maxParallelism;
                this.pausePolicy = model.pausePolicy;
            } 

            /**
             * <p>The upgrade interval between batches, in seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder batchInterval(Long batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * <p>The maximum number of nodes allowed to fail during the rolling update. Default value: 0. A value of 0 indicates that the task fails if any node fails. A value greater than 0 indicates that the task fails and stops if the cumulative number of failed nodes exceeds this value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxFailedNodes(Long maxFailedNodes) {
                this.maxFailedNodes = maxFailedNodes;
                return this;
            }

            /**
             * <p>The maximum number of parallel nodes per batch. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            /**
             * <p>The automatic pause policy during node upgrades. Valid values: NotPause, FirstBatch, and EveryBatch. Default value: NotPause.</p>
             * 
             * <strong>example:</strong>
             * <p>NotPause</p>
             */
            public Builder pausePolicy(String pausePolicy) {
                this.pausePolicy = pausePolicy;
                return this;
            }

            public RollingPolicy build() {
                return new RollingPolicy(this);
            } 

        } 

    }
}
