// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UpdateQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaRequest</p>
 */
public class UpdateQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterSpec")
    private ClusterSpec clusterSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableGracefulUpgrade")
    private Boolean enableGracefulUpgrade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GracefulUpgradeConfig")
    private GracefulUpgradeConfig gracefulUpgradeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropagateDefaultGPUDriver")
    private Boolean propagateDefaultGPUDriver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaConfig")
    private QuotaConfig quotaConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    private UpdateQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.clusterSpec = builder.clusterSpec;
        this.description = builder.description;
        this.enableGracefulUpgrade = builder.enableGracefulUpgrade;
        this.gracefulUpgradeConfig = builder.gracefulUpgradeConfig;
        this.labels = builder.labels;
        this.propagateDefaultGPUDriver = builder.propagateDefaultGPUDriver;
        this.queueStrategy = builder.queueStrategy;
        this.quotaConfig = builder.quotaConfig;
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return clusterSpec
     */
    public ClusterSpec getClusterSpec() {
        return this.clusterSpec;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableGracefulUpgrade
     */
    public Boolean getEnableGracefulUpgrade() {
        return this.enableGracefulUpgrade;
    }

    /**
     * @return gracefulUpgradeConfig
     */
    public GracefulUpgradeConfig getGracefulUpgradeConfig() {
        return this.gracefulUpgradeConfig;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return propagateDefaultGPUDriver
     */
    public Boolean getPropagateDefaultGPUDriver() {
        return this.propagateDefaultGPUDriver;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    /**
     * @return quotaConfig
     */
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaRequest, Builder> {
        private String quotaId; 
        private ClusterSpec clusterSpec; 
        private String description; 
        private Boolean enableGracefulUpgrade; 
        private GracefulUpgradeConfig gracefulUpgradeConfig; 
        private java.util.List<Label> labels; 
        private Boolean propagateDefaultGPUDriver; 
        private String queueStrategy; 
        private QuotaConfig quotaConfig; 
        private String quotaName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.clusterSpec = request.clusterSpec;
            this.description = request.description;
            this.enableGracefulUpgrade = request.enableGracefulUpgrade;
            this.gracefulUpgradeConfig = request.gracefulUpgradeConfig;
            this.labels = request.labels;
            this.propagateDefaultGPUDriver = request.propagateDefaultGPUDriver;
            this.queueStrategy = request.queueStrategy;
            this.quotaConfig = request.quotaConfig;
            this.quotaName = request.quotaName;
        } 

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quota-20210126170216-mtl37ge7gkvdz</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The configurations of the compute cluster bound to the quota (RNQ Ray cluster). This parameter is only available for RNQ quotas and will be rejected for common quotas. It can only be modified when no operations are in progress on the quota. Unpassed sub-fields retain the current effective configurations.</p>
         */
        public Builder clusterSpec(ClusterSpec clusterSpec) {
            this.putBodyParameter("ClusterSpec", clusterSpec);
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>The description of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test quota</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to execute the current ClusterSpec change as a rolling upgrade (draining and migrating nodes one by one to the new cluster) instead of the default stop-and-rebuild method.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableGracefulUpgrade(Boolean enableGracefulUpgrade) {
            this.putBodyParameter("EnableGracefulUpgrade", enableGracefulUpgrade);
            this.enableGracefulUpgrade = enableGracefulUpgrade;
            return this;
        }

        /**
         * <p>The tuning parameters for the migration process. This parameter is only allowed when EnableGracefulUpgrade is set to true.</p>
         */
        public Builder gracefulUpgradeConfig(GracefulUpgradeConfig gracefulUpgradeConfig) {
            this.putBodyParameter("GracefulUpgradeConfig", gracefulUpgradeConfig);
            this.gracefulUpgradeConfig = gracefulUpgradeConfig;
            return this;
        }

        /**
         * <p>The list of user-defined labels.
         * This is a full update.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>Specifies whether to pass the default GPU driver configuration to child quotas.</p>
         */
        public Builder propagateDefaultGPUDriver(Boolean propagateDefaultGPUDriver) {
            this.putBodyParameter("PropagateDefaultGPUDriver", propagateDefaultGPUDriver);
            this.propagateDefaultGPUDriver = propagateDefaultGPUDriver;
            return this;
        }

        /**
         * <p>The queuing strategy for tasks on the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiStrategyIntelligent</p>
         */
        public Builder queueStrategy(String queueStrategy) {
            this.putBodyParameter("QueueStrategy", queueStrategy);
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * <p>The resource quota configuration.</p>
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.putBodyParameter("QuotaConfig", quotaConfig);
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * <p>The name of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder quotaName(String quotaName) {
            this.putBodyParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        @Override
        public UpdateQuotaRequest build() {
            return new UpdateQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateQuotaRequest} extends {@link TeaModel}
     *
     * <p>UpdateQuotaRequest</p>
     */
    public static class ClusterSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List<String> dataSources;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        private ClusterSpec(Builder builder) {
            this.clusterType = builder.clusterType;
            this.dataSources = builder.dataSources;
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterSpec create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return dataSources
         */
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        public static final class Builder {
            private String clusterType; 
            private java.util.List<String> dataSources; 
            private String image; 

            private Builder() {
            } 

            private Builder(ClusterSpec model) {
                this.clusterType = model.clusterType;
                this.dataSources = model.dataSources;
                this.image = model.image;
            } 

            /**
             * <p>The cluster type. Currently, only RayCluster is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>RayCluster</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The list of data sources mounted to the cluster. This parameter uses the overall replacement semantics: if it is not passed, the current state is maintained; if an empty array is passed, the list is cleared. Each element is a JSON object string that contains DataSourceId or Uri (one of them is required and they are mutually exclusive) and an optional MountPath.</p>
             */
            public Builder dataSources(java.util.List<String> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>The container image used by the Ray cluster. If this parameter is explicitly passed, the system switches to this image. If it is left empty and the data sources remain unchanged, and GetQuota returns UpgradeAvailable=true, this update is considered an upgrade to the platform default image. To keep the current image, explicitly pass the current value.</p>
             * 
             * <strong>example:</strong>
             * <p>dsw-registry-vpc.ap-southeast-1.cr.aliyuncs.com/pai-common/ray-runtime</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            public ClusterSpec build() {
                return new ClusterSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateQuotaRequest} extends {@link TeaModel}
     *
     * <p>UpdateQuotaRequest</p>
     */
    public static class GracefulUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrainTimeoutSeconds")
        private Long drainTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxUnavailable")
        private String maxUnavailable;

        @com.aliyun.core.annotation.NameInMap("TaskDrainReserveWorkers")
        private Long taskDrainReserveWorkers;

        private GracefulUpgradeConfig(Builder builder) {
            this.drainTimeoutSeconds = builder.drainTimeoutSeconds;
            this.maxUnavailable = builder.maxUnavailable;
            this.taskDrainReserveWorkers = builder.taskDrainReserveWorkers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GracefulUpgradeConfig create() {
            return builder().build();
        }

        /**
         * @return drainTimeoutSeconds
         */
        public Long getDrainTimeoutSeconds() {
            return this.drainTimeoutSeconds;
        }

        /**
         * @return maxUnavailable
         */
        public String getMaxUnavailable() {
            return this.maxUnavailable;
        }

        /**
         * @return taskDrainReserveWorkers
         */
        public Long getTaskDrainReserveWorkers() {
            return this.taskDrainReserveWorkers;
        }

        public static final class Builder {
            private Long drainTimeoutSeconds; 
            private String maxUnavailable; 
            private Long taskDrainReserveWorkers; 

            private Builder() {
            } 

            private Builder(GracefulUpgradeConfig model) {
                this.drainTimeoutSeconds = model.drainTimeoutSeconds;
                this.maxUnavailable = model.maxUnavailable;
                this.taskDrainReserveWorkers = model.taskDrainReserveWorkers;
            } 

            /**
             * <p>The timeout limit for Ray draining of a single node. After the timeout, the node is still directly scaled down, which does not cause the upgrade to fail.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder drainTimeoutSeconds(Long drainTimeoutSeconds) {
                this.drainTimeoutSeconds = drainTimeoutSeconds;
                return this;
            }

            /**
             * <p>The migration window width, which is the maximum number of workers in the old cluster that are simultaneously in an unavailable state (draining or drained and pending removal), that is, the number of nodes migrated in parallel.</p>
             * 
             * <strong>example:</strong>
             * <p>25%</p>
             */
            public Builder maxUnavailable(String maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * <p>The number of workers in the old cluster that are kept in a schedulable state while waiting for the remaining Ray tasks in the old cluster to complete.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder taskDrainReserveWorkers(Long taskDrainReserveWorkers) {
                this.taskDrainReserveWorkers = taskDrainReserveWorkers;
                return this;
            }

            public GracefulUpgradeConfig build() {
                return new GracefulUpgradeConfig(this);
            } 

        } 

    }
}
