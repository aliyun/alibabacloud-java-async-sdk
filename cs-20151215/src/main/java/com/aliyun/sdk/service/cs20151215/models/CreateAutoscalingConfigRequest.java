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
         * <p>cdde1f21ae22e483ebcb068a6eb7f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The delay for triggering scale-in. This is the time interval between detecting a scale-in requirement (reaching the scale-in threshold) and actually executing the scale-in operation (reducing the number of pods). Valid values: 1 to 60. Unit: minutes. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder coolDownDuration(String coolDownDuration) {
            this.putBodyParameter("cool_down_duration", coolDownDuration);
            this.coolDownDuration = coolDownDuration;
            return this;
        }

        /**
         * <p>Specifies whether cluster-autoscaler evicts DaemonSet pods on nodes during scale-in. Valid values:</p>
         * <ul>
         * <li>true: The pods are evicted.</li>
         * <li>false: The pods are not evicted.</li>
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
         * <p>The node pool scale-out order policy. Valid values:</p>
         * <ul>
         * <li>least-waste: the default policy. If multiple node pools can be scaled out, the system selects the node pool that wastes the least resources.</li>
         * <li>random: the random policy. If multiple node pools can be scaled out, the system randomly selects a node pool.</li>
         * <li>priority: the priority policy. If multiple node pools can be scaled out, the system selects the node pool with the highest priority based on the custom scaling group order. The node pool priority is defined by the priorities parameter.</li>
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
         * <p>The GPU scale-in threshold, which is the ratio of requested resources to total resources on a node. A GPU node can be scaled in only when this ratio is lower than the configured threshold, meaning that the CPU, memory, and GPU utilization of the node are all lower than the GPU scale-in threshold. Valid values: 0.1 to 1. Default value: 0.3, which indicates 30%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        public Builder gpuUtilizationThreshold(String gpuUtilizationThreshold) {
            this.putBodyParameter("gpu_utilization_threshold", gpuUtilizationThreshold);
            this.gpuUtilizationThreshold = gpuUtilizationThreshold;
            return this;
        }

        /**
         * <p>The timeout period for cluster-autoscaler to wait for pod termination during node draining in a scale-in scenario. Unit: seconds. Default value: 14400.</p>
         * 
         * <strong>example:</strong>
         * <p>14400</p>
         */
        public Builder maxGracefulTerminationSec(Integer maxGracefulTerminationSec) {
            this.putBodyParameter("max_graceful_termination_sec", maxGracefulTerminationSec);
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        /**
         * <p>The minimum number of pods allowed in each ReplicaSet before a node is scaled in. Default value: 0.</p>
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
         * <p>The auto scaling priority configuration. After you create a node pool with auto scaling enabled, you can choose whether to configure the priority policy and priority configuration by referring to <a href="https://help.aliyun.com/document_detail/119099.html">Enable auto scaling for nodes</a>. This allows you to configure priorities for the scaling groups of specified auto scaling node pools. Valid values: 1 to 100. The value must be a positive integer. A larger value indicates a higher priority.</p>
         */
        public Builder priorities(java.util.Map<String, java.util.List<String>> priorities) {
            this.putBodyParameter("priorities", priorities);
            this.priorities = priorities;
            return this;
        }

        /**
         * <p>Specifies whether to delete the corresponding Kubernetes node objects after nodes are successfully scaled in fast mode. For more information about fast mode, see <a href="https://help.aliyun.com/document_detail/119099.html">Scaling modes</a>. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Kubernetes node objects are also deleted after nodes are stopped in fast mode. Do not set this parameter to true because it may cause data inconsistency of Kubernetes objects.</li>
         * <li>false: Kubernetes node objects are retained after nodes are stopped in fast mode.</li>
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
         * <p>Specifies whether to allow node scale-in. Valid values:</p>
         * <ul>
         * <li>true: Scale-in is allowed.</li>
         * <li>false: Scale-in is prohibited.</li>
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
         * <p>Specifies whether cluster-autoscaler performs scale-out when the number of ready nodes in the cluster is 0. Default value: true. Valid values:</p>
         * <ul>
         * <li>true: Scale-out is performed.</li>
         * <li>false: Scale-out is not performed.</li>
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
         * <p>The auto scaling component type. For clusters of version 1.24 and later, the default value is goatscaler. For clusters of earlier versions, the default value is cluster-autoscaler. Valid values:</p>
         * <ul>
         * <li>goatscaler: instant elasticity.</li>
         * <li>cluster-autoscaler: auto scaling.</li>
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
         * <p>The auto scaling sensitivity, which is used to adjust the interval at which the system evaluates scaling. Valid values: 15, 30, 60, 120, 180, and 300. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder scanInterval(String scanInterval) {
            this.putBodyParameter("scan_interval", scanInterval);
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>Specifies whether cluster-autoscaler scales in nodes that contain pods with local storage, such as EmptyDir or HostPath. Valid values:</p>
         * <ul>
         * <li>true: The nodes are not scaled in.</li>
         * <li>false: The nodes are scaled in.</li>
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
         * <p>Specifies whether cluster-autoscaler scales in nodes that run pods in the kube-system namespace. This feature does not take effect for DaemonSet pods and mirror pods. Valid values:</p>
         * <ul>
         * <li>true: The nodes are not scaled in.</li>
         * <li>false: The nodes are scaled in.</li>
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
         * <p>The cool-down period. This is the time interval during which the auto scaling component does not perform scale-in after the most recent scale-out is completed. Scaled-out nodes can be evaluated for scale-in only after the cool-down period ends. Valid values: 1 to 60. Unit: minutes. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder unneededDuration(String unneededDuration) {
            this.putBodyParameter("unneeded_duration", unneededDuration);
            this.unneededDuration = unneededDuration;
            return this;
        }

        /**
         * <p>The scale-in threshold, which is the ratio of requested resources to total resources on a node. A node can be scaled in only when this ratio is lower than the configured threshold, meaning that the utilization of both CPU and memory resources on the node is lower than the scale-in threshold. Valid values: 0.1 to 1. Default value: 0.5, which indicates 50%.</p>
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
