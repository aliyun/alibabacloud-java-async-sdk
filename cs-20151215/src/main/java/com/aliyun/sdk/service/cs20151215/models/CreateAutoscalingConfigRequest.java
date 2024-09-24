// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoscalingConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoscalingConfigRequest</p>
 */
public class CreateAutoscalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cool_down_duration")
    private String coolDownDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("daemonset_eviction_for_nodes")
    private Boolean daemonsetEvictionForNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expander")
    private String expander;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpu_utilization_threshold")
    private String gpuUtilizationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("max_graceful_termination_sec")
    private Integer maxGracefulTerminationSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("min_replica_count")
    private Integer minReplicaCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recycle_node_deletion_enabled")
    private Boolean recycleNodeDeletionEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scale_down_enabled")
    private Boolean scaleDownEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scale_up_from_zero")
    private Boolean scaleUpFromZero;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scan_interval")
    private String scanInterval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skip_nodes_with_local_storage")
    private Boolean skipNodesWithLocalStorage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skip_nodes_with_system_pods")
    private Boolean skipNodesWithSystemPods;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("unneeded_duration")
    private String unneededDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("utilization_threshold")
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The waiting time before the auto scaling feature performs a scale-in activity. It is an interval between the time when the scale-in threshold is reached and the time when the scale-in activity (reduce the number of pods) starts. Unit: minutes. Default value: 10.
         */
        public Builder coolDownDuration(String coolDownDuration) {
            this.putBodyParameter("cool_down_duration", coolDownDuration);
            this.coolDownDuration = coolDownDuration;
            return this;
        }

        /**
         * Specifies whether to evict pods created by DaemonSets when the cluster autoscaler performs a scale-in activity. Valid values:
         * <p>
         * 
         * *   `true`: evicts DaemonSet pods.
         * *   `false`: does not evict DaemonSet pods.
         */
        public Builder daemonsetEvictionForNodes(Boolean daemonsetEvictionForNodes) {
            this.putBodyParameter("daemonset_eviction_for_nodes", daemonsetEvictionForNodes);
            this.daemonsetEvictionForNodes = daemonsetEvictionForNodes;
            return this;
        }

        /**
         * The node pool scale-out policy. Valid values:
         * <p>
         * 
         * *   `least-waste`: the default policy. If multiple node pools meet the requirement, this policy selects the node pool that will have the least idle resources after the scale-out activity is completed.
         * *   `random`: the random policy. If multiple node pools meet the requirement, this policy selects a random node pool for the scale-out activity.
         * *   `priority`: the priority-based policy If multiple node pools meet the requirement, this policy selects the node pool with the highest priority for the scale-out activity. The priority setting is stored in the ConfigMap named `cluster-autoscaler-priority-expander` in the kube-system namespace. When a scale-out activity is triggered, the policy obtains the node pool priorities from the ConfigMap based on the node pool IDs and then selects the node pool with the highest priority for the scale-out activity.
         */
        public Builder expander(String expander) {
            this.putBodyParameter("expander", expander);
            this.expander = expander;
            return this;
        }

        /**
         * The scale-in threshold of GPU utilization. This threshold specifies the ratio of the GPU resources that are requested by pods to the total GPU resources on the node.
         * <p>
         * 
         * A scale-in activity is performed only when the CPU utilization, memory utilization, and GPU utilization of a GPU-accelerated node are lower than the scale-in threshold of GPU utilization.
         */
        public Builder gpuUtilizationThreshold(String gpuUtilizationThreshold) {
            this.putBodyParameter("gpu_utilization_threshold", gpuUtilizationThreshold);
            this.gpuUtilizationThreshold = gpuUtilizationThreshold;
            return this;
        }

        /**
         * The maximum amount of time to wait for pods on a node to terminate during a scale-in activity. Unit: seconds.
         */
        public Builder maxGracefulTerminationSec(Integer maxGracefulTerminationSec) {
            this.putBodyParameter("max_graceful_termination_sec", maxGracefulTerminationSec);
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        /**
         * The minimum number of pods allowed in each ReplicaSet before a scale-in activity is performed.
         */
        public Builder minReplicaCount(Integer minReplicaCount) {
            this.putBodyParameter("min_replica_count", minReplicaCount);
            this.minReplicaCount = minReplicaCount;
            return this;
        }

        /**
         * Specifies whether to delete the corresponding Kubernetes node objects after nodes are removed in swift mode. For more information about the swift mode, see [Scaling mode](~~119099~~). Default value: false. Valid values:
         * <p>
         * 
         * *   `true`: deletes the corresponding Kubernetes node objects after nodes are removed in swift mode. We recommend that you do not set the value to true because data inconsistency may occur in Kubernetes objects.
         * *   `false`: retains the corresponding Kubernetes node objects after nodes are removed in swift mode.
         */
        public Builder recycleNodeDeletionEnabled(Boolean recycleNodeDeletionEnabled) {
            this.putBodyParameter("recycle_node_deletion_enabled", recycleNodeDeletionEnabled);
            this.recycleNodeDeletionEnabled = recycleNodeDeletionEnabled;
            return this;
        }

        /**
         * Specifies whether to allow node scale-in activities. Valid values:
         * <p>
         * 
         * *   `true`: allows node scale-in activities.
         * *   `false`: does not allow node scale-in activities.
         */
        public Builder scaleDownEnabled(Boolean scaleDownEnabled) {
            this.putBodyParameter("scale_down_enabled", scaleDownEnabled);
            this.scaleDownEnabled = scaleDownEnabled;
            return this;
        }

        /**
         * Specifies whether the cluster autoscaler performs a scale-out activity when the number of ready nodes in the cluster is 0. Default value: true. Valid values:
         * <p>
         * 
         * *   `true`: performs a scale-out activity.
         * *   `false`: does not perform a scale-out activity.
         */
        public Builder scaleUpFromZero(Boolean scaleUpFromZero) {
            this.putBodyParameter("scale_up_from_zero", scaleUpFromZero);
            this.scaleUpFromZero = scaleUpFromZero;
            return this;
        }

        /**
         * The interval at which the system scans for events that trigger scaling activities. Unit: seconds. Default value: 60.
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("scan_interval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * Specifies whether the cluster autoscaler scales in nodes that host pods mounted with local volumes, such as EmptyDir or HostPath volumes. Valid values:
         * <p>
         * 
         * *   `true`: does not allow the cluster autoscaler to scale in these nodes.
         * *   `false`: allows the cluster autoscaler to scale in these nodes.
         */
        public Builder skipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
            this.putBodyParameter("skip_nodes_with_local_storage", skipNodesWithLocalStorage);
            this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        /**
         * Specifies whether the cluster autoscaler scales in nodes that host pods in the kube-system namespace. This parameter does not take effect on pods created by DaemonSets and mirror pods. Valid values:
         * <p>
         * 
         * *   `true`: does not allow the cluster autoscaler to scale in these nodes.
         * *   `false`: allows the cluster autoscaler to scale in these nodes.
         */
        public Builder skipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
            this.putBodyParameter("skip_nodes_with_system_pods", skipNodesWithSystemPods);
            this.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }

        /**
         * The cooldown period. After the autoscaler performs a scale-out activity, the autoscaler waits a cooldown period before it can perform a scale-in activity. Newly added nodes can be removed in scale-in activities only after the cooldown period ends. Unit: minutes.
         */
        public Builder unneededDuration(String unneededDuration) {
            this.putBodyParameter("unneeded_duration", unneededDuration);
            this.unneededDuration = unneededDuration;
            return this;
        }

        /**
         * The scale-in threshold. This threshold specifies the ratio of the resources that are requested by pods to the total resources on the node.
         * <p>
         * 
         * A scale-in activity is performed only when the CPU utilization and memory utilization of a node are lower than the scale-in threshold.
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
