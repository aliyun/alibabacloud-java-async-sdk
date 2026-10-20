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
    @Deprecated
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder componentName(String componentName) {
            this.putBodyParameter("component_name", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>Specifies whether to upgrade only the control plane.</p>
         * <ul>
         * <li>true: Upgrades only the control plane.</li>
         * <li>false: Upgrades both the control plane and worker nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder masterOnly(Boolean masterOnly) {
            this.putBodyParameter("master_only", masterOnly);
            this.masterOnly = masterOnly;
            return this;
        }

        /**
         * <p>The target version for the cluster upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        public Builder nextVersion(String nextVersion) {
            this.putBodyParameter("next_version", nextVersion);
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * <p>The rolling upgrade configuration.</p>
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use the <code>next_version</code> parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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

    /**
     * 
     * {@link UpgradeClusterRequest} extends {@link TeaModel}
     *
     * <p>UpgradeClusterRequest</p>
     */
    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max_parallelism")
        @Deprecated
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

            private Builder() {
            } 

            private Builder(RollingPolicy model) {
                this.maxParallelism = model.maxParallelism;
            } 

            /**
             * <p>The maximum number of worker nodes that can be upgraded in parallel per batch.</p>
             * <p>During the worker node upgrade, nodes are upgraded in batches based on the specified maximum parallelism. The number of nodes upgraded in each batch increases as follows: 1, 2, 4, 8, and so on until the maximum parallelism is reached. After the maximum parallelism is reached, each subsequent batch upgrades the maximum number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
