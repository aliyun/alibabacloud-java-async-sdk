// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoscalingConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoscalingConfigRequest</p>
 */
public class CreateAutoscalingConfigRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("cool_down_duration")
    private String coolDownDuration;

    @Body
    @NameInMap("daemonset_eviction_for_nodes")
    private Boolean daemonsetEvictionForNodes;

    @Body
    @NameInMap("expander")
    private String expander;

    @Body
    @NameInMap("gpu_utilization_threshold")
    private String gpuUtilizationThreshold;

    @Body
    @NameInMap("max_graceful_termination_sec")
    private Integer maxGracefulTerminationSec;

    @Body
    @NameInMap("min_replica_count")
    private Integer minReplicaCount;

    @Body
    @NameInMap("recycle_node_deletion_enabled")
    private Boolean recycleNodeDeletionEnabled;

    @Body
    @NameInMap("scale_down_enabled")
    private Boolean scaleDownEnabled;

    @Body
    @NameInMap("scale_up_from_zero")
    private Boolean scaleUpFromZero;

    @Body
    @NameInMap("scan_interval")
    private String scanInterval;

    @Body
    @NameInMap("skip_nodes_with_local_storage")
    private Boolean skipNodesWithLocalStorage;

    @Body
    @NameInMap("skip_nodes_with_system_pods")
    private Boolean skipNodesWithSystemPods;

    @Body
    @NameInMap("unneeded_duration")
    private String unneededDuration;

    @Body
    @NameInMap("utilization_threshold")
    private String utilizationThreshold;

    private CreateAutoscalingConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coolDownDuration = builder.coolDownDuration;
        this.daemonsetEvictionForNodes = builder.daemonsetEvictionForNodes;
        this.expander = builder.expander;
        this.gpuUtilizationThreshold = builder.gpuUtilizationThreshold;
        this.maxGracefulTerminationSec = builder.maxGracefulTerminationSec;
        this.minReplicaCount = builder.minReplicaCount;
        this.recycleNodeDeletionEnabled = builder.recycleNodeDeletionEnabled;
        this.scaleDownEnabled = builder.scaleDownEnabled;
        this.scaleUpFromZero = builder.scaleUpFromZero;
        this.scanInterval = builder.scanInterval;
        this.skipNodesWithLocalStorage = builder.skipNodesWithLocalStorage;
        this.skipNodesWithSystemPods = builder.skipNodesWithSystemPods;
        this.unneededDuration = builder.unneededDuration;
        this.utilizationThreshold = builder.utilizationThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoscalingConfigRequest create() {
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
     * @return coolDownDuration
     */
    public String getCoolDownDuration() {
        return this.coolDownDuration;
    }

    /**
     * @return daemonsetEvictionForNodes
     */
    public Boolean getDaemonsetEvictionForNodes() {
        return this.daemonsetEvictionForNodes;
    }

    /**
     * @return expander
     */
    public String getExpander() {
        return this.expander;
    }

    /**
     * @return gpuUtilizationThreshold
     */
    public String getGpuUtilizationThreshold() {
        return this.gpuUtilizationThreshold;
    }

    /**
     * @return maxGracefulTerminationSec
     */
    public Integer getMaxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    /**
     * @return minReplicaCount
     */
    public Integer getMinReplicaCount() {
        return this.minReplicaCount;
    }

    /**
     * @return recycleNodeDeletionEnabled
     */
    public Boolean getRecycleNodeDeletionEnabled() {
        return this.recycleNodeDeletionEnabled;
    }

    /**
     * @return scaleDownEnabled
     */
    public Boolean getScaleDownEnabled() {
        return this.scaleDownEnabled;
    }

    /**
     * @return scaleUpFromZero
     */
    public Boolean getScaleUpFromZero() {
        return this.scaleUpFromZero;
    }

    /**
     * @return scanInterval
     */
    public String getScanInterval() {
        return this.scanInterval;
    }

    /**
     * @return skipNodesWithLocalStorage
     */
    public Boolean getSkipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    /**
     * @return skipNodesWithSystemPods
     */
    public Boolean getSkipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    /**
     * @return unneededDuration
     */
    public String getUnneededDuration() {
        return this.unneededDuration;
    }

    /**
     * @return utilizationThreshold
     */
    public String getUtilizationThreshold() {
        return this.utilizationThreshold;
    }

    public static final class Builder extends Request.Builder<CreateAutoscalingConfigRequest, Builder> {
        private String clusterId; 
        private String coolDownDuration; 
        private Boolean daemonsetEvictionForNodes; 
        private String expander; 
        private String gpuUtilizationThreshold; 
        private Integer maxGracefulTerminationSec; 
        private Integer minReplicaCount; 
        private Boolean recycleNodeDeletionEnabled; 
        private Boolean scaleDownEnabled; 
        private Boolean scaleUpFromZero; 
        private String scanInterval; 
        private Boolean skipNodesWithLocalStorage; 
        private Boolean skipNodesWithSystemPods; 
        private String unneededDuration; 
        private String utilizationThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoscalingConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coolDownDuration = request.coolDownDuration;
            this.daemonsetEvictionForNodes = request.daemonsetEvictionForNodes;
            this.expander = request.expander;
            this.gpuUtilizationThreshold = request.gpuUtilizationThreshold;
            this.maxGracefulTerminationSec = request.maxGracefulTerminationSec;
            this.minReplicaCount = request.minReplicaCount;
            this.recycleNodeDeletionEnabled = request.recycleNodeDeletionEnabled;
            this.scaleDownEnabled = request.scaleDownEnabled;
            this.scaleUpFromZero = request.scaleUpFromZero;
            this.scanInterval = request.scanInterval;
            this.skipNodesWithLocalStorage = request.skipNodesWithLocalStorage;
            this.skipNodesWithSystemPods = request.skipNodesWithSystemPods;
            this.unneededDuration = request.unneededDuration;
            this.utilizationThreshold = request.utilizationThreshold;
        } 

        /**
         * c0XXXXXXX10
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * cool_down_duration.
         */
        public Builder coolDownDuration(String coolDownDuration) {
            this.putBodyParameter("cool_down_duration", coolDownDuration);
            this.coolDownDuration = coolDownDuration;
            return this;
        }

        /**
         * daemonset_eviction_for_nodes.
         */
        public Builder daemonsetEvictionForNodes(Boolean daemonsetEvictionForNodes) {
            this.putBodyParameter("daemonset_eviction_for_nodes", daemonsetEvictionForNodes);
            this.daemonsetEvictionForNodes = daemonsetEvictionForNodes;
            return this;
        }

        /**
         * expander.
         */
        public Builder expander(String expander) {
            this.putBodyParameter("expander", expander);
            this.expander = expander;
            return this;
        }

        /**
         * gpu_utilization_threshold.
         */
        public Builder gpuUtilizationThreshold(String gpuUtilizationThreshold) {
            this.putBodyParameter("gpu_utilization_threshold", gpuUtilizationThreshold);
            this.gpuUtilizationThreshold = gpuUtilizationThreshold;
            return this;
        }

        /**
         * max_graceful_termination_sec.
         */
        public Builder maxGracefulTerminationSec(Integer maxGracefulTerminationSec) {
            this.putBodyParameter("max_graceful_termination_sec", maxGracefulTerminationSec);
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        /**
         * min_replica_count.
         */
        public Builder minReplicaCount(Integer minReplicaCount) {
            this.putBodyParameter("min_replica_count", minReplicaCount);
            this.minReplicaCount = minReplicaCount;
            return this;
        }

        /**
         * recycle_node_deletion_enabled.
         */
        public Builder recycleNodeDeletionEnabled(Boolean recycleNodeDeletionEnabled) {
            this.putBodyParameter("recycle_node_deletion_enabled", recycleNodeDeletionEnabled);
            this.recycleNodeDeletionEnabled = recycleNodeDeletionEnabled;
            return this;
        }

        /**
         * scale_down_enabled.
         */
        public Builder scaleDownEnabled(Boolean scaleDownEnabled) {
            this.putBodyParameter("scale_down_enabled", scaleDownEnabled);
            this.scaleDownEnabled = scaleDownEnabled;
            return this;
        }

        /**
         * scale_up_from_zero.
         */
        public Builder scaleUpFromZero(Boolean scaleUpFromZero) {
            this.putBodyParameter("scale_up_from_zero", scaleUpFromZero);
            this.scaleUpFromZero = scaleUpFromZero;
            return this;
        }

        /**
         * scan_interval.
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("scan_interval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * skip_nodes_with_local_storage.
         */
        public Builder skipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
            this.putBodyParameter("skip_nodes_with_local_storage", skipNodesWithLocalStorage);
            this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        /**
         * skip_nodes_with_system_pods.
         */
        public Builder skipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
            this.putBodyParameter("skip_nodes_with_system_pods", skipNodesWithSystemPods);
            this.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }

        /**
         * unneeded_duration.
         */
        public Builder unneededDuration(String unneededDuration) {
            this.putBodyParameter("unneeded_duration", unneededDuration);
            this.unneededDuration = unneededDuration;
            return this;
        }

        /**
         * utilization_threshold.
         */
        public Builder utilizationThreshold(String utilizationThreshold) {
            this.putBodyParameter("utilization_threshold", utilizationThreshold);
            this.utilizationThreshold = utilizationThreshold;
            return this;
        }

        @Override
        public CreateAutoscalingConfigRequest build() {
            return new CreateAutoscalingConfigRequest(this);
        } 

    } 

}
