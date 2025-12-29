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
 * {@link UpdateNodePoolComponentRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodePoolComponentRequest</p>
 */
public class UpdateNodePoolComponentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepoolId")
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disableRolling")
    private Boolean disableRolling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeNames")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rollingPolicy")
    private RollingPolicy rollingPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private UpdateNodePoolComponentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.config = builder.config;
        this.disableRolling = builder.disableRolling;
        this.name = builder.name;
        this.nodeNames = builder.nodeNames;
        this.rollingPolicy = builder.rollingPolicy;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodePoolComponentRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<UpdateNodePoolComponentRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private Config config; 
        private Boolean disableRolling; 
        private String name; 
        private java.util.List<String> nodeNames; 
        private RollingPolicy rollingPolicy; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodePoolComponentRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.config = request.config;
            this.disableRolling = request.disableRolling;
            this.name = request.name;
            this.nodeNames = request.nodeNames;
            this.rollingPolicy = request.rollingPolicy;
            this.version = request.version;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * nodepoolId.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * config.
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * disableRolling.
         */
        public Builder disableRolling(Boolean disableRolling) {
            this.putBodyParameter("disableRolling", disableRolling);
            this.disableRolling = disableRolling;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * nodeNames.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            this.putBodyParameter("nodeNames", nodeNames);
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * rollingPolicy.
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rollingPolicy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateNodePoolComponentRequest build() {
            return new UpdateNodePoolComponentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNodePoolComponentRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodePoolComponentRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customConfig")
        private java.util.Map<String, String> customConfig;

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
        public java.util.Map<String, String> getCustomConfig() {
            return this.customConfig;
        }

        public static final class Builder {
            private java.util.Map<String, String> customConfig; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
            } 

            /**
             * customConfig.
             */
            public Builder customConfig(java.util.Map<String, String> customConfig) {
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
     * {@link UpdateNodePoolComponentRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodePoolComponentRequest</p>
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
             * batchInterval.
             */
            public Builder batchInterval(Long batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * maxParallelism.
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            /**
             * pausePolicy.
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
