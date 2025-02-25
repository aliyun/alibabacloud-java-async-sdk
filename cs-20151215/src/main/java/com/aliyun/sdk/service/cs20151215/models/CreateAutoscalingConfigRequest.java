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
    @com.aliyun.core.annotation.NameInMap("priorities")
    private java.util.Map<String, java.util.List<String>> priorities;

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
    @com.aliyun.core.annotation.NameInMap("scaler_type")
    private String scalerType;

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
        this.priorities = builder.priorities;
        this.recycleNodeDeletionEnabled = builder.recycleNodeDeletionEnabled;
        this.scaleDownEnabled = builder.scaleDownEnabled;
        this.scaleUpFromZero = builder.scaleUpFromZero;
        this.scalerType = builder.scalerType;
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
     * @return priorities
     */
    public java.util.Map<String, java.util.List<String>> getPriorities() {
        return this.priorities;
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
     * @return scalerType
     */
    public String getScalerType() {
        return this.scalerType;
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
        private java.util.Map<String, java.util.List<String>> priorities; 
        private Boolean recycleNodeDeletionEnabled; 
        private Boolean scaleDownEnabled; 
        private Boolean scaleUpFromZero; 
        private String scalerType; 
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
            this.priorities = request.priorities;
            this.recycleNodeDeletionEnabled = request.recycleNodeDeletionEnabled;
            this.scaleDownEnabled = request.scaleDownEnabled;
            this.scaleUpFromZero = request.scaleUpFromZero;
            this.scalerType = request.scalerType;
            this.scanInterval = request.scanInterval;
            this.skipNodesWithLocalStorage = request.skipNodesWithLocalStorage;
            this.skipNodesWithSystemPods = request.skipNodesWithSystemPods;
            this.unneededDuration = request.unneededDuration;
            this.utilizationThreshold = request.utilizationThreshold;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c0XXXXXXX10</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The waiting time before the auto scaling feature performs a scale-in activity. It is an interval between the time when the scale-in threshold is reached and the time when the scale-in activity (reduce the number of pods) starts. Unit: minutes. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10 m</p>
         */
        public Builder coolDownDuration(String coolDownDuration) {
            this.putBodyParameter("cool_down_duration", coolDownDuration);
            this.coolDownDuration = coolDownDuration;
            return this;
        }

        /**
         * <p>Specifies whether to evict pods created by DaemonSets when the cluster autoscaler performs a scale-in activity. Valid values:</p>
         * <ul>
         * <li><code>true</code>: evicts DaemonSet pods.</li>
         * <li><code>false</code>: does not evict DaemonSet pods.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder daemonsetEvictionForNodes(Boolean daemonsetEvictionForNodes) {
            this.putBodyParameter("daemonset_eviction_for_nodes", daemonsetEvictionForNodes);
            this.daemonsetEvictionForNodes = daemonsetEvictionForNodes;
            return this;
        }

        /**
         * <p>The node pool scale-out policy. Valid values:</p>
         * <ul>
         * <li><code>least-waste</code>: the default policy. If multiple node pools meet the requirement, this policy selects the node pool that will have the least idle resources after the scale-out activity is completed.</li>
         * <li><code>random</code>: the random policy. If multiple node pools meet the requirement, this policy selects a random node pool for the scale-out activity.</li>
         * <li><code>priority</code>: the priority-based policy If multiple node pools meet the requirement, this policy selects the node pool with the highest priority for the scale-out activity. The priority setting is stored in the ConfigMap named <code>cluster-autoscaler-priority-expander</code> in the kube-system namespace. When a scale-out activity is triggered, the policy obtains the node pool priorities from the ConfigMap based on the node pool IDs and then selects the node pool with the highest priority for the scale-out activity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>least-waste</p>
         */
        public Builder expander(String expander) {
            this.putBodyParameter("expander", expander);
            this.expander = expander;
            return this;
        }

        /**
         * <p>The scale-in threshold of GPU utilization. This threshold specifies the ratio of the GPU resources that are requested by pods to the total GPU resources on the node.</p>
         * <p>A scale-in activity is performed only when the CPU utilization, memory utilization, and GPU utilization of a GPU-accelerated node are lower than the scale-in threshold of GPU utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder gpuUtilizationThreshold(String gpuUtilizationThreshold) {
            this.putBodyParameter("gpu_utilization_threshold", gpuUtilizationThreshold);
            this.gpuUtilizationThreshold = gpuUtilizationThreshold;
            return this;
        }

        /**
         * <p>The maximum amount of time to wait for pods on a node to terminate during a scale-in activity. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>14400s</p>
         */
        public Builder maxGracefulTerminationSec(Integer maxGracefulTerminationSec) {
            this.putBodyParameter("max_graceful_termination_sec", maxGracefulTerminationSec);
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        /**
         * <p>The minimum number of pods allowed in each ReplicaSet before a scale-in activity is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minReplicaCount(Integer minReplicaCount) {
            this.putBodyParameter("min_replica_count", minReplicaCount);
            this.minReplicaCount = minReplicaCount;
            return this;
        }

        /**
         * <p>Auto-scaling priority configuration. After creating a node pool with elasticity enabled, you can choose whether to configure a priority strategy and priority settings through <a href="https://help.aliyun.com/document_detail/119099.html">Enabling Node Auto-scaling</a>. This allows you to set priorities for the specified auto-scaling node pool scaling group. The priority value range is [1, 100] and must be a positive integer.</p>
         */
        public Builder priorities(java.util.Map<String, java.util.List<String>> priorities) {
            this.putBodyParameter("priorities", priorities);
            this.priorities = priorities;
            return this;
        }

        /**
         * <p>Specifies whether to delete the corresponding Kubernetes node objects after nodes are removed in swift mode. For more information about the swift mode, see <a href="https://help.aliyun.com/document_detail/119099.html">Scaling mode</a>. Default value: false Valid values:</p>
         * <ul>
         * <li><code>true</code>: deletes the corresponding Kubernetes node objects after nodes are removed in swift mode. We recommend that you do not set the value to true because data inconsistency may occur in Kubernetes objects.</li>
         * <li><code>false</code>: retains the corresponding Kubernetes node objects after nodes are removed in swift mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder recycleNodeDeletionEnabled(Boolean recycleNodeDeletionEnabled) {
            this.putBodyParameter("recycle_node_deletion_enabled", recycleNodeDeletionEnabled);
            this.recycleNodeDeletionEnabled = recycleNodeDeletionEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to allow node scale-in activities. Valid values:</p>
         * <ul>
         * <li><code>true</code>: allows node scale-in activities.</li>
         * <li><code>false</code>: does not allow node scale-in activities.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scaleDownEnabled(Boolean scaleDownEnabled) {
            this.putBodyParameter("scale_down_enabled", scaleDownEnabled);
            this.scaleDownEnabled = scaleDownEnabled;
            return this;
        }

        /**
         * <p>Specifies whether the cluster autoscaler performs a scale-out activity when the number of ready nodes in the cluster is 0. Default value: true. Valid values:</p>
         * <ul>
         * <li><code>true</code>: performs a scale-out activity.</li>
         * <li><code>false</code>: does not perform a scale-out activity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scaleUpFromZero(Boolean scaleUpFromZero) {
            this.putBodyParameter("scale_up_from_zero", scaleUpFromZero);
            this.scaleUpFromZero = scaleUpFromZero;
            return this;
        }

        /**
         * <p>Elastic component type, default is goatscaler for cluster version 1.24 and above, and cluster-autoscaler below that. Values:</p>
         * <ul>
         * <li><code>goatscaler</code>: Instant elasticity. </li>
         * <li><code>cluster-autoscaler</code>: Auto-scaling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>goatscaler</p>
         */
        public Builder scalerType(String scalerType) {
            this.putBodyParameter("scaler_type", scalerType);
            this.scalerType = scalerType;
            return this;
        }

        /**
         * <p>The interval at which the system scans for events that trigger scaling activities. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30s</p>
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("scan_interval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>Specifies whether the cluster autoscaler scales in nodes that host pods mounted with local volumes, such as EmptyDir or HostPath volumes. Valid values:</p>
         * <ul>
         * <li><code>true</code>: does not allow the cluster autoscaler to scale in these nodes.</li>
         * <li><code>false</code>: allows the cluster autoscaler to scale in these nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
            this.putBodyParameter("skip_nodes_with_local_storage", skipNodesWithLocalStorage);
            this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        /**
         * <p>Specifies whether the cluster autoscaler scales in nodes that host pods in the kube-system namespace. This parameter does not take effect on pods created by DaemonSets and mirror pods. Valid values:</p>
         * <ul>
         * <li><code>true</code>: does not allow the cluster autoscaler to scale in these nodes.</li>
         * <li><code>false</code>: allows the cluster autoscaler to scale in these nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
            this.putBodyParameter("skip_nodes_with_system_pods", skipNodesWithSystemPods);
            this.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }

        /**
         * <p>The cooldown period. After the autoscaler performs a scale-out activity, the autoscaler waits a cooldown period before it can perform a scale-in activity. Newly added nodes can be removed in scale-in activities only after the cooldown period ends. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10 m</p>
         */
        public Builder unneededDuration(String unneededDuration) {
            this.putBodyParameter("unneeded_duration", unneededDuration);
            this.unneededDuration = unneededDuration;
            return this;
        }

        /**
         * <p>The scale-in threshold. This threshold specifies the ratio of the resources that are requested by pods to the total resources on the node.</p>
         * <p>A scale-in activity is performed only when the CPU utilization and memory utilization of a node are lower than the scale-in threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
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
