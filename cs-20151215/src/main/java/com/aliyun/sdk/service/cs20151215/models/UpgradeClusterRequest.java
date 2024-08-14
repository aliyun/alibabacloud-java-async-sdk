// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterRequest</p>
 */
public class UpgradeClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("component_name")
    @Deprecated
    private String componentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("master_only")
    private Boolean masterOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("next_version")
    private String nextVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @Deprecated
    private String version;

    private UpgradeClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentName = builder.componentName;
        this.masterOnly = builder.masterOnly;
        this.nextVersion = builder.nextVersion;
        this.rollingPolicy = builder.rollingPolicy;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterRequest create() {
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
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return masterOnly
     */
    public Boolean getMasterOnly() {
        return this.masterOnly;
    }

    /**
     * @return nextVersion
     */
    public String getNextVersion() {
        return this.nextVersion;
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

    public static final class Builder extends Request.Builder<UpgradeClusterRequest, Builder> {
        private String clusterId; 
        private String componentName; 
        private Boolean masterOnly; 
        private String nextVersion; 
        private RollingPolicy rollingPolicy; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentName = request.componentName;
            this.masterOnly = request.masterOnly;
            this.nextVersion = request.nextVersion;
            this.rollingPolicy = request.rollingPolicy;
            this.version = request.version;
        } 

        /**
         * The ID of the cluster that you want to upgrade.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * This parameter is discontinued.
         */
        public Builder componentName(String componentName) {
            this.putBodyParameter("component_name", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * Specifies whether to update only the master nodes. Valid values:
         * <p>
         * 
         * *   true: Updates only the master nodes.
         * *   false: Updates the master nodes and worker nodes.
         */
        public Builder masterOnly(Boolean masterOnly) {
            this.putBodyParameter("master_only", masterOnly);
            this.masterOnly = masterOnly;
            return this;
        }

        /**
         * The Kubernetes version to which you want to update the cluster.
         */
        public Builder nextVersion(String nextVersion) {
            this.putBodyParameter("next_version", nextVersion);
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * rolling_policy.
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        /**
         * This parameter is discontinued. Specify the Kubernetes version by using the next_version parameter.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpgradeClusterRequest build() {
            return new UpgradeClusterRequest(this);
        } 

    } 

    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max_parallelism")
        private Integer maxParallelism;

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
        public Integer getMaxParallelism() {
            return this.maxParallelism;
        }

        public static final class Builder {
            private Integer maxParallelism; 

            /**
             * max_parallelism.
             */
            public Builder maxParallelism(Integer maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            public RollingPolicy build() {
                return new RollingPolicy(this);
            } 

        } 

    }
}
