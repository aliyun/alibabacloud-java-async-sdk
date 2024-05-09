// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterNodepoolRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterNodepoolRequest</p>
 */
public class UpgradeClusterNodepoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_id")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_names")
    private java.util.List < String > nodeNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime_type")
    private String runtimeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runtime_version")
    private String runtimeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("use_replace")
    private Boolean useReplace;

    private UpgradeClusterNodepoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.imageId = builder.imageId;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.nodeNames = builder.nodeNames;
        this.rollingPolicy = builder.rollingPolicy;
        this.runtimeType = builder.runtimeType;
        this.runtimeVersion = builder.runtimeVersion;
        this.useReplace = builder.useReplace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterNodepoolRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return nodeNames
     */
    public java.util.List < String > getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return rollingPolicy
     */
    public RollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    /**
     * @return runtimeVersion
     */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * @return useReplace
     */
    public Boolean getUseReplace() {
        return this.useReplace;
    }

    public static final class Builder extends Request.Builder<UpgradeClusterNodepoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String imageId; 
        private String kubernetesVersion; 
        private java.util.List < String > nodeNames; 
        private RollingPolicy rollingPolicy; 
        private String runtimeType; 
        private String runtimeVersion; 
        private Boolean useReplace; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterNodepoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.imageId = request.imageId;
            this.kubernetesVersion = request.kubernetesVersion;
            this.nodeNames = request.nodeNames;
            this.rollingPolicy = request.rollingPolicy;
            this.runtimeType = request.runtimeType;
            this.runtimeVersion = request.runtimeVersion;
            this.useReplace = request.useReplace;
        } 

        /**
         * The cluster ID.
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
         * The ID of the OS image that is used by the nodes.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The Kubernetes version that is used by the nodes.
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * node_names.
         */
        public Builder nodeNames(java.util.List < String > nodeNames) {
            this.putBodyParameter("node_names", nodeNames);
            this.nodeNames = nodeNames;
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
         * The runtime type. Valid values: containerd and docker.
         */
        public Builder runtimeType(String runtimeType) {
            this.putBodyParameter("runtime_type", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        /**
         * The version of the container runtime that is used by the nodes.
         */
        public Builder runtimeVersion(String runtimeVersion) {
            this.putBodyParameter("runtime_version", runtimeVersion);
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * use_replace.
         */
        public Builder useReplace(Boolean useReplace) {
            this.putBodyParameter("use_replace", useReplace);
            this.useReplace = useReplace;
            return this;
        }

        @Override
        public UpgradeClusterNodepoolRequest build() {
            return new UpgradeClusterNodepoolRequest(this);
        } 

    } 

    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batch_interval")
        private Integer batchInterval;

        @com.aliyun.core.annotation.NameInMap("max_parallelism")
        private Integer maxParallelism;

        @com.aliyun.core.annotation.NameInMap("pause_policy")
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
        public Integer getBatchInterval() {
            return this.batchInterval;
        }

        /**
         * @return maxParallelism
         */
        public Integer getMaxParallelism() {
            return this.maxParallelism;
        }

        /**
         * @return pausePolicy
         */
        public String getPausePolicy() {
            return this.pausePolicy;
        }

        public static final class Builder {
            private Integer batchInterval; 
            private Integer maxParallelism; 
            private String pausePolicy; 

            /**
             * batch_interval.
             */
            public Builder batchInterval(Integer batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * max_parallelism.
             */
            public Builder maxParallelism(Integer maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            /**
             * pause_policy.
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
