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
 * {@link InstallNodePoolComponentsRequest} extends {@link RequestModel}
 *
 * <p>InstallNodePoolComponentsRequest</p>
 */
public class InstallNodePoolComponentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodePoolId")
    private String nodePoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeNames")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rollingPolicy")
    private RollingPolicy rollingPolicy;

    private InstallNodePoolComponentsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodePoolId = builder.nodePoolId;
        this.components = builder.components;
        this.nodeNames = builder.nodeNames;
        this.rollingPolicy = builder.rollingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallNodePoolComponentsRequest create() {
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
     * @return nodePoolId
     */
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
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

    public static final class Builder extends Request.Builder<InstallNodePoolComponentsRequest, Builder> {
        private String clusterId; 
        private String nodePoolId; 
        private java.util.List<Components> components; 
        private java.util.List<String> nodeNames; 
        private RollingPolicy rollingPolicy; 

        private Builder() {
            super();
        } 

        private Builder(InstallNodePoolComponentsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodePoolId = request.nodePoolId;
            this.components = request.components;
            this.nodeNames = request.nodeNames;
            this.rollingPolicy = request.rollingPolicy;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>np7c4fa4a5f1ce412b849****</p>
         */
        public Builder nodePoolId(String nodePoolId) {
            this.putPathParameter("nodePoolId", nodePoolId);
            this.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * <p>A list of node components to be installed.</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * <p>A list of specific node names where the component should be installed. If not specified, the component will be installed on all nodes in the node pool.</p>
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.putBodyParameter("nodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * <p>Configuration for the rolling update process.</p>
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rollingPolicy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        @Override
        public InstallNodePoolComponentsRequest build() {
            return new InstallNodePoolComponentsRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallNodePoolComponentsRequest} extends {@link TeaModel}
     *
     * <p>InstallNodePoolComponentsRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customConfig")
        private java.util.Map<String, ?> customConfig;

        private Config(Builder builder) {
            this.customConfig = builder.customConfig;
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

        public static final class Builder {
            private java.util.Map<String, ?> customConfig; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
            } 

            /**
             * <p>Custom parameters for the component.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
             */
            public Builder customConfig(java.util.Map<String, ?> customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallNodePoolComponentsRequest} extends {@link TeaModel}
     *
     * <p>InstallNodePoolComponentsRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Components(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Config config; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.config = model.config;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The configuration details for the component.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the component.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>kubelet</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>1.28.9-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallNodePoolComponentsRequest} extends {@link TeaModel}
     *
     * <p>InstallNodePoolComponentsRequest</p>
     */
    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchInterval")
        private Long batchInterval;

        @com.aliyun.core.annotation.NameInMap("maxParallelism")
        private Long maxParallelism;

        @com.aliyun.core.annotation.NameInMap("pausePolicy")
        private String pausePolicy;

        private RollingPolicy(Builder builder) {
            this.batchInterval = builder.batchInterval;
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
            private Long maxParallelism; 
            private String pausePolicy; 

            private Builder() {
            } 

            private Builder(RollingPolicy model) {
                this.batchInterval = model.batchInterval;
                this.maxParallelism = model.maxParallelism;
                this.pausePolicy = model.pausePolicy;
            } 

            /**
             * <p>The time interval between update batches, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder batchInterval(Long batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * <p>The maximum number of nodes that can be updated concurrently in each batch. Default: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            /**
             * <p>The strategy for automatic pausing during the update process. Valid values: NotPause, FirstBatchPause, EveryBatchPause.</p>
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
