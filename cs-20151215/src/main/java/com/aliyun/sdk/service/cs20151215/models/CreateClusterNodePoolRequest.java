// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterNodePoolRequest</p>
 */
public class CreateClusterNodePoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @Body
    @NameInMap("count")
    private Long count;

    @Body
    @NameInMap("interconnect_config")
    private InterconnectConfig interconnectConfig;

    @Body
    @NameInMap("interconnect_mode")
    private String interconnectMode;

    @Body
    @NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @Body
    @NameInMap("management")
    private Management management;

    @Body
    @NameInMap("max_nodes")
    private Long maxNodes;

    @Body
    @NameInMap("node_config")
    private NodeConfig nodeConfig;

    @Body
    @NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @Body
    @NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @Body
    @NameInMap("tee_config")
    private TeeConfig teeConfig;

    private CreateClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.autoScaling = builder.autoScaling;
        this.count = builder.count;
        this.interconnectConfig = builder.interconnectConfig;
        this.interconnectMode = builder.interconnectMode;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.management = builder.management;
        this.maxNodes = builder.maxNodes;
        this.nodeConfig = builder.nodeConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.teeConfig = builder.teeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterNodePoolRequest create() {
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
     * @return autoScaling
     */
    public AutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return interconnectConfig
     */
    public InterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    /**
     * @return interconnectMode
     */
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    /**
     * @return kubernetesConfig
     */
    public KubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    /**
     * @return management
     */
    public Management getManagement() {
        return this.management;
    }

    /**
     * @return maxNodes
     */
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    /**
     * @return nodeConfig
     */
    public NodeConfig getNodeConfig() {
        return this.nodeConfig;
    }

    /**
     * @return nodepoolInfo
     */
    public NodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    /**
     * @return scalingGroup
     */
    public ScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    /**
     * @return teeConfig
     */
    public TeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static final class Builder extends Request.Builder<CreateClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private AutoScaling autoScaling; 
        private Long count; 
        private InterconnectConfig interconnectConfig; 
        private String interconnectMode; 
        private KubernetesConfig kubernetesConfig; 
        private Management management; 
        private Long maxNodes; 
        private NodeConfig nodeConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private TeeConfig teeConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.autoScaling = request.autoScaling;
            this.count = request.count;
            this.interconnectConfig = request.interconnectConfig;
            this.interconnectMode = request.interconnectMode;
            this.kubernetesConfig = request.kubernetesConfig;
            this.management = request.management;
            this.maxNodes = request.maxNodes;
            this.nodeConfig = request.nodeConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The configuration of auto scaling.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * This parameter is deprecated. Use the desired_size parameter instead.
         * <p>
         * 
         * The number of nodes in the node pool.
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * This parameter is deprecated.
         * <p>
         * 
         * The configuration of the edge node pool.
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.putBodyParameter("interconnect_config", interconnectConfig);
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * The network type of the edge node pool. This parameter takes effect only when you set the `type` parameter of the node pool to `edge`. Valid values:
         * <p>
         * 
         * *   `basic`: basic
         * *   `improved`: enhanced
         * *   `private`: dedicated Only Kubernetes 1.22 and later support this parameter.
         */
        public Builder interconnectMode(String interconnectMode) {
            this.putBodyParameter("interconnect_mode", interconnectMode);
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * The configuration of the cluster.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * The configuration of the managed node pool feature.
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
            return this;
        }

        /**
         * The maximum number of nodes that can be created in the edge node pool. You must specify a value that is equal to or larger than 0. A value of 0 indicates that the number of nodes in the node pool is limited only by the quota of nodes in the cluster. In most cases, this parameter is set to a value larger than 0 for edge node pools. This parameter is set to 0 for node pools of the ess type or default edge node pools.
         */
        public Builder maxNodes(Long maxNodes) {
            this.putBodyParameter("max_nodes", maxNodes);
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * node_config.
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.putBodyParameter("node_config", nodeConfig);
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * The configuration of the node pool.
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.putBodyParameter("nodepool_info", nodepoolInfo);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * The configuration of the scaling group that is used by the node pool.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.putBodyParameter("scaling_group", scalingGroup);
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * The configuration of confidential computing for the cluster.
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.putBodyParameter("tee_config", teeConfig);
            this.teeConfig = teeConfig;
            return this;
        }

        @Override
        public CreateClusterNodePoolRequest build() {
            return new CreateClusterNodePoolRequest(this);
        } 

    } 

    public static class AutoScaling extends TeaModel {
        @NameInMap("eip_bandwidth")
        private Long eipBandwidth;

        @NameInMap("eip_internet_charge_type")
        private String eipInternetChargeType;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("is_bond_eip")
        private Boolean isBondEip;

        @NameInMap("max_instances")
        private Long maxInstances;

        @NameInMap("min_instances")
        private Long minInstances;

        @NameInMap("type")
        private String type;

        private AutoScaling(Builder builder) {
            this.eipBandwidth = builder.eipBandwidth;
            this.eipInternetChargeType = builder.eipInternetChargeType;
            this.enable = builder.enable;
            this.isBondEip = builder.isBondEip;
            this.maxInstances = builder.maxInstances;
            this.minInstances = builder.minInstances;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoScaling create() {
            return builder().build();
        }

        /**
         * @return eipBandwidth
         */
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return eipInternetChargeType
         */
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return isBondEip
         */
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        /**
         * @return maxInstances
         */
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        /**
         * @return minInstances
         */
        public Long getMinInstances() {
            return this.minInstances;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long eipBandwidth; 
            private String eipInternetChargeType; 
            private Boolean enable; 
            private Boolean isBondEip; 
            private Long maxInstances; 
            private Long minInstances; 
            private String type; 

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The maximum bandwidth of the EIP. Unit: Mbit/s.
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The metering method of the EIP. Valid values:
             * 
             * *   `PayByBandwidth`: pay-by-bandwidth.
             * *   `PayByTraffic`: pay-by-data-transfer.
             * 
             * Default value: `PayByBandwidth`.
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * Specifies whether to enable auto scaling. Valid values:
             * <p>
             * 
             * *   `true`: enables auto scaling.
             * *   `false`: disables auto scaling. If you set this parameter to false, other parameters in the `auto_scaling` section do not take effect.
             * 
             * Default value: `false`.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * Specifies whether to associate an elastic IP address (EIP) with the node pool. Valid values:
             * 
             * *   `true`: associates an EIP with the node pool
             * *   `false`: does not associate an EIP with the node pool.
             * 
             * Default value: `false`.
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * The maximum number of Elastic Compute Service (ECS) instances that can be created in a node pool.
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * The minimum number of ECS instances that must be kept in a node pool.
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * The instance types that can be used for the auto scaling of the node pool. Valid values:
             * <p>
             * 
             * *   `cpu`: regular instance.
             * *   `gpu`: GPU-accelerated instance.
             * *   `gpushare`: shared GPU-accelerated instance.
             * *   `spot`: preemptible instance
             * 
             * Default value: `cpu`.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AutoScaling build() {
                return new AutoScaling(this);
            } 

        } 

    }
    public static class InterconnectConfig extends TeaModel {
        @NameInMap("bandwidth")
        private Long bandwidth;

        @NameInMap("ccn_id")
        private String ccnId;

        @NameInMap("ccn_region_id")
        private String ccnRegionId;

        @NameInMap("cen_id")
        private String cenId;

        @NameInMap("improved_period")
        private String improvedPeriod;

        private InterconnectConfig(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.ccnId = builder.ccnId;
            this.ccnRegionId = builder.ccnRegionId;
            this.cenId = builder.cenId;
            this.improvedPeriod = builder.improvedPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterconnectConfig create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return ccnId
         */
        public String getCcnId() {
            return this.ccnId;
        }

        /**
         * @return ccnRegionId
         */
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return improvedPeriod
         */
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

        public static final class Builder {
            private Long bandwidth; 
            private String ccnId; 
            private String ccnRegionId; 
            private String cenId; 
            private String improvedPeriod; 

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The bandwidth of the enhanced edge node pool. Unit: Mbit/s.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The region to which the CCN instance that is associated with the enhanced edge node pool belongs.
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * This parameter is deprecated.
             * <p>
             * 
             * The subscription duration of the enhanced edge node pool. The duration is measured in months.
             */
            public Builder improvedPeriod(String improvedPeriod) {
                this.improvedPeriod = improvedPeriod;
                return this;
            }

            public InterconnectConfig build() {
                return new InterconnectConfig(this);
            } 

        } 

    }
    public static class KubernetesConfig extends TeaModel {
        @NameInMap("cms_enabled")
        private Boolean cmsEnabled;

        @NameInMap("cpu_policy")
        private String cpuPolicy;

        @NameInMap("labels")
        private java.util.List < Tag > labels;

        @NameInMap("node_name_mode")
        private String nodeNameMode;

        @NameInMap("runtime")
        private String runtime;

        @NameInMap("runtime_version")
        private String runtimeVersion;

        @NameInMap("taints")
        private java.util.List < Taint > taints;

        @NameInMap("unschedulable")
        private Boolean unschedulable;

        @NameInMap("user_data")
        private String userData;

        private KubernetesConfig(Builder builder) {
            this.cmsEnabled = builder.cmsEnabled;
            this.cpuPolicy = builder.cpuPolicy;
            this.labels = builder.labels;
            this.nodeNameMode = builder.nodeNameMode;
            this.runtime = builder.runtime;
            this.runtimeVersion = builder.runtimeVersion;
            this.taints = builder.taints;
            this.unschedulable = builder.unschedulable;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KubernetesConfig create() {
            return builder().build();
        }

        /**
         * @return cmsEnabled
         */
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        /**
         * @return cpuPolicy
         */
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        /**
         * @return labels
         */
        public java.util.List < Tag > getLabels() {
            return this.labels;
        }

        /**
         * @return nodeNameMode
         */
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return runtimeVersion
         */
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /**
         * @return taints
         */
        public java.util.List < Taint > getTaints() {
            return this.taints;
        }

        /**
         * @return unschedulable
         */
        public Boolean getUnschedulable() {
            return this.unschedulable;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean cmsEnabled; 
            private String cpuPolicy; 
            private java.util.List < Tag > labels; 
            private String nodeNameMode; 
            private String runtime; 
            private String runtimeVersion; 
            private java.util.List < Taint > taints; 
            private Boolean unschedulable; 
            private String userData; 

            /**
             * Specifies whether to install the CloudMonitor agent on ECS nodes. After the CloudMonitor agent is installed on ECS nodes, you can view monitoring information about the instances in the CloudMonitor console. We recommend that you install the CloudMonitor agent. Valid values:
             * <p>
             * 
             * *   `true`: installs the CloudMonitor agent on ECS nodes.
             * *   `false`: does not install the CloudMonitor agent on ECS nodes.
             * 
             * Default value: `false`.
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * The CPU management policy of the nodes in a node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.
             * <p>
             * 
             * *   `static`: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.
             * *   `none`: specifies that the default CPU affinity is used.
             * 
             * Default value: `none`.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * The labels that you want to add to the nodes in the cluster.
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * A custom node name consists of a prefix, a node IP address, and a suffix.
             * <p>
             * 
             * *   The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.
             * *   The node IP address in a custom node name is the private IP address of the node.
             * 
             * Set the value in the customized,aliyun,ip,com format. The value consists of four parts that are separated by commas (,). customized and ip are fixed content. aliyun is the prefix and com is the suffix. Example: aliyun.192.168.xxx.xxx.com.
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * The container runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * The version of the container runtime.
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * The configuration of taints.
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * unschedulable.
             */
            public Builder unschedulable(Boolean unschedulable) {
                this.unschedulable = unschedulable;
                return this;
            }

            /**
             * The user-defined data on nodes.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public KubernetesConfig build() {
                return new KubernetesConfig(this);
            } 

        } 

    }
    public static class AutoRepairPolicy extends TeaModel {
        @NameInMap("restart_node")
        private Boolean restartNode;

        private AutoRepairPolicy(Builder builder) {
            this.restartNode = builder.restartNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRepairPolicy create() {
            return builder().build();
        }

        /**
         * @return restartNode
         */
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public static final class Builder {
            private Boolean restartNode; 

            /**
             * restart_node.
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            public AutoRepairPolicy build() {
                return new AutoRepairPolicy(this);
            } 

        } 

    }
    public static class AutoUpgradePolicy extends TeaModel {
        @NameInMap("auto_upgrade_kubelet")
        private Boolean autoUpgradeKubelet;

        private AutoUpgradePolicy(Builder builder) {
            this.autoUpgradeKubelet = builder.autoUpgradeKubelet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoUpgradePolicy create() {
            return builder().build();
        }

        /**
         * @return autoUpgradeKubelet
         */
        public Boolean getAutoUpgradeKubelet() {
            return this.autoUpgradeKubelet;
        }

        public static final class Builder {
            private Boolean autoUpgradeKubelet; 

            /**
             * auto_upgrade_kubelet.
             */
            public Builder autoUpgradeKubelet(Boolean autoUpgradeKubelet) {
                this.autoUpgradeKubelet = autoUpgradeKubelet;
                return this;
            }

            public AutoUpgradePolicy build() {
                return new AutoUpgradePolicy(this);
            } 

        } 

    }
    public static class AutoVulFixPolicy extends TeaModel {
        @NameInMap("restart_node")
        private Boolean restartNode;

        @NameInMap("vul_level")
        private String vulLevel;

        private AutoVulFixPolicy(Builder builder) {
            this.restartNode = builder.restartNode;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoVulFixPolicy create() {
            return builder().build();
        }

        /**
         * @return restartNode
         */
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        /**
         * @return vulLevel
         */
        public String getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private Boolean restartNode; 
            private String vulLevel; 

            /**
             * restart_node.
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * vul_level.
             */
            public Builder vulLevel(String vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public AutoVulFixPolicy build() {
                return new AutoVulFixPolicy(this);
            } 

        } 

    }
    public static class UpgradeConfig extends TeaModel {
        @NameInMap("auto_upgrade")
        private Boolean autoUpgrade;

        @NameInMap("max_unavailable")
        private Long maxUnavailable;

        @NameInMap("surge")
        private Long surge;

        @NameInMap("surge_percentage")
        private Long surgePercentage;

        private UpgradeConfig(Builder builder) {
            this.autoUpgrade = builder.autoUpgrade;
            this.maxUnavailable = builder.maxUnavailable;
            this.surge = builder.surge;
            this.surgePercentage = builder.surgePercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeConfig create() {
            return builder().build();
        }

        /**
         * @return autoUpgrade
         */
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        /**
         * @return maxUnavailable
         */
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        /**
         * @return surge
         */
        public Long getSurge() {
            return this.surge;
        }

        /**
         * @return surgePercentage
         */
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

        public static final class Builder {
            private Boolean autoUpgrade; 
            private Long maxUnavailable; 
            private Long surge; 
            private Long surgePercentage; 

            /**
             * Indicates whether auto update is enabled. Valid values:
             * <p>
             * 
             * *   `true`: enables auto upgrade.
             * *   `false`: disables auto update.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The maximum number of nodes that can be in the Unschedulable state. Valid values: 1 to 1000.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * The number of nodes that are temporarily added to the node pool during an auto update.
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * The percentage of additional nodes to the nodes in the node pool. You must set this parameter or `surge`.
             */
            public Builder surgePercentage(Long surgePercentage) {
                this.surgePercentage = surgePercentage;
                return this;
            }

            public UpgradeConfig build() {
                return new UpgradeConfig(this);
            } 

        } 

    }
    public static class Management extends TeaModel {
        @NameInMap("auto_repair")
        private Boolean autoRepair;

        @NameInMap("auto_repair_policy")
        private AutoRepairPolicy autoRepairPolicy;

        @NameInMap("auto_upgrade")
        private Boolean autoUpgrade;

        @NameInMap("auto_upgrade_policy")
        private AutoUpgradePolicy autoUpgradePolicy;

        @NameInMap("auto_vul_fix")
        private Boolean autoVulFix;

        @NameInMap("auto_vul_fix_policy")
        private AutoVulFixPolicy autoVulFixPolicy;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("upgrade_config")
        @Deprecated
        private UpgradeConfig upgradeConfig;

        private Management(Builder builder) {
            this.autoRepair = builder.autoRepair;
            this.autoRepairPolicy = builder.autoRepairPolicy;
            this.autoUpgrade = builder.autoUpgrade;
            this.autoUpgradePolicy = builder.autoUpgradePolicy;
            this.autoVulFix = builder.autoVulFix;
            this.autoVulFixPolicy = builder.autoVulFixPolicy;
            this.enable = builder.enable;
            this.upgradeConfig = builder.upgradeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Management create() {
            return builder().build();
        }

        /**
         * @return autoRepair
         */
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        /**
         * @return autoRepairPolicy
         */
        public AutoRepairPolicy getAutoRepairPolicy() {
            return this.autoRepairPolicy;
        }

        /**
         * @return autoUpgrade
         */
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        /**
         * @return autoUpgradePolicy
         */
        public AutoUpgradePolicy getAutoUpgradePolicy() {
            return this.autoUpgradePolicy;
        }

        /**
         * @return autoVulFix
         */
        public Boolean getAutoVulFix() {
            return this.autoVulFix;
        }

        /**
         * @return autoVulFixPolicy
         */
        public AutoVulFixPolicy getAutoVulFixPolicy() {
            return this.autoVulFixPolicy;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return upgradeConfig
         */
        public UpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

        public static final class Builder {
            private Boolean autoRepair; 
            private AutoRepairPolicy autoRepairPolicy; 
            private Boolean autoUpgrade; 
            private AutoUpgradePolicy autoUpgradePolicy; 
            private Boolean autoVulFix; 
            private AutoVulFixPolicy autoVulFixPolicy; 
            private Boolean enable; 
            private UpgradeConfig upgradeConfig; 

            /**
             * Specifies whether to enable auto repair. This parameter takes effect only when you specify `enable=true`. Valid values:
             * <p>
             * 
             * *   `true`: enables auto repair.
             * *   `false`: disables auto repair.
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * auto_repair_policy.
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * Indicates whether auto update is enabled. Valid values:
             * <p>
             * 
             * *   `true`: enables auto upgrade.
             * *   `false`: disables auto update.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * auto_upgrade_policy.
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * auto_vul_fix.
             */
            public Builder autoVulFix(Boolean autoVulFix) {
                this.autoVulFix = autoVulFix;
                return this;
            }

            /**
             * auto_vul_fix_policy.
             */
            public Builder autoVulFixPolicy(AutoVulFixPolicy autoVulFixPolicy) {
                this.autoVulFixPolicy = autoVulFixPolicy;
                return this;
            }

            /**
             * Specifies whether to enable the managed node pool feature. Valid values:
             * <p>
             * 
             * *   `true`: enables the managed node pool feature.
             * *   `false`: disables the managed node pool feature. Other parameters in this section take effect only when you specify enable=true.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The configuration of auto update. The configuration takes effect only when you specify `enable=true`.
             */
            public Builder upgradeConfig(UpgradeConfig upgradeConfig) {
                this.upgradeConfig = upgradeConfig;
                return this;
            }

            public Management build() {
                return new Management(this);
            } 

        } 

    }
    public static class NodeConfig extends TeaModel {
        @NameInMap("kubelet_configuration")
        private KubeletConfig kubeletConfiguration;

        private NodeConfig(Builder builder) {
            this.kubeletConfiguration = builder.kubeletConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeConfig create() {
            return builder().build();
        }

        /**
         * @return kubeletConfiguration
         */
        public KubeletConfig getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

        public static final class Builder {
            private KubeletConfig kubeletConfiguration; 

            /**
             * kubelet_configuration.
             */
            public Builder kubeletConfiguration(KubeletConfig kubeletConfiguration) {
                this.kubeletConfiguration = kubeletConfiguration;
                return this;
            }

            public NodeConfig build() {
                return new NodeConfig(this);
            } 

        } 

    }
    public static class NodepoolInfo extends TeaModel {
        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("resource_group_id")
        private String resourceGroupId;

        @NameInMap("type")
        private String type;

        private NodepoolInfo(Builder builder) {
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodepoolInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String resourceGroupId; 
            private String type; 

            /**
             * The name of the node pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the resource group to which the node pool belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of node pool. Valid values:
             * <p>
             * 
             * *   `ess`: node pool
             * *   `edge`: edge node pool
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NodepoolInfo build() {
                return new NodepoolInfo(this);
            } 

        } 

    }
    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("match_criteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String id; 
            private String matchCriteria; 

            /**
             * The ID of the private node pool.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of private node pool. This parameter specifies the type of private pool that you want to use to create instances. A private node pool is generated when an elasticity assurance or a capacity reservation service takes effect. The system selects a private node pool to launch instances. Valid values:
             * <p>
             * 
             * *   `Open`: open private pool. The system selects an open private node pool to launch instances. If no matching open private node pool is available, the resources in the public node pool are used.
             * *   `Target`: specific private pool. The system uses the resources of the specified private node pool to launch instances. If the specified private node pool is unavailable, instances cannot be launched.
             * *   `None`: no private pool is used. The resources of private node pools are not used to launch the instances.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class SpotPriceLimit extends TeaModel {
        @NameInMap("instance_type")
        private String instanceType;

        @NameInMap("price_limit")
        private String priceLimit;

        private SpotPriceLimit(Builder builder) {
            this.instanceType = builder.instanceType;
            this.priceLimit = builder.priceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotPriceLimit create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return priceLimit
         */
        public String getPriceLimit() {
            return this.priceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private String priceLimit; 

            /**
             * The instance type of preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum bid price of a preemptible instance.
             */
            public Builder priceLimit(String priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            public SpotPriceLimit build() {
                return new SpotPriceLimit(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of a label.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of a label.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ScalingGroup extends TeaModel {
        @NameInMap("auto_renew")
        private Boolean autoRenew;

        @NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @NameInMap("cis_enabled")
        private Boolean cisEnabled;

        @NameInMap("compensate_with_on_demand")
        private Boolean compensateWithOnDemand;

        @NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @NameInMap("deploymentset_id")
        private String deploymentsetId;

        @NameInMap("desired_size")
        private Long desiredSize;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("image_type")
        private String imageType;

        @NameInMap("instance_charge_type")
        @Validation(required = true)
        private String instanceChargeType;

        @NameInMap("instance_types")
        @Validation(required = true)
        private java.util.List < String > instanceTypes;

        @NameInMap("internet_charge_type")
        private String internetChargeType;

        @NameInMap("internet_max_bandwidth_out")
        private Long internetMaxBandwidthOut;

        @NameInMap("key_pair")
        private String keyPair;

        @NameInMap("login_as_non_root")
        private Boolean loginAsNonRoot;

        @NameInMap("login_password")
        private String loginPassword;

        @NameInMap("multi_az_policy")
        private String multiAzPolicy;

        @NameInMap("on_demand_base_capacity")
        private Long onDemandBaseCapacity;

        @NameInMap("on_demand_percentage_above_base_capacity")
        private Long onDemandPercentageAboveBaseCapacity;

        @NameInMap("period")
        private Long period;

        @NameInMap("period_unit")
        private String periodUnit;

        @NameInMap("platform")
        @Deprecated
        private String platform;

        @NameInMap("private_pool_options")
        private PrivatePoolOptions privatePoolOptions;

        @NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @NameInMap("scaling_policy")
        private String scalingPolicy;

        @NameInMap("security_group_id")
        private String securityGroupId;

        @NameInMap("security_group_ids")
        private java.util.List < String > securityGroupIds;

        @NameInMap("soc_enabled")
        private Boolean socEnabled;

        @NameInMap("spot_instance_pools")
        private Long spotInstancePools;

        @NameInMap("spot_instance_remedy")
        private Boolean spotInstanceRemedy;

        @NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("system_disk_bursting_enabled")
        private Boolean systemDiskBurstingEnabled;

        @NameInMap("system_disk_categories")
        private java.util.List < String > systemDiskCategories;

        @NameInMap("system_disk_category")
        private String systemDiskCategory;

        @NameInMap("system_disk_encrypt_algorithm")
        private String systemDiskEncryptAlgorithm;

        @NameInMap("system_disk_encrypted")
        private Boolean systemDiskEncrypted;

        @NameInMap("system_disk_kms_key_id")
        private String systemDiskKmsKeyId;

        @NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @NameInMap("system_disk_provisioned_iops")
        private Long systemDiskProvisionedIops;

        @NameInMap("system_disk_size")
        private Long systemDiskSize;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("vswitch_ids")
        @Validation(required = true)
        private java.util.List < String > vswitchIds;

        private ScalingGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.cisEnabled = builder.cisEnabled;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.dataDisks = builder.dataDisks;
            this.deploymentsetId = builder.deploymentsetId;
            this.desiredSize = builder.desiredSize;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceTypes = builder.instanceTypes;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.keyPair = builder.keyPair;
            this.loginAsNonRoot = builder.loginAsNonRoot;
            this.loginPassword = builder.loginPassword;
            this.multiAzPolicy = builder.multiAzPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.platform = builder.platform;
            this.privatePoolOptions = builder.privatePoolOptions;
            this.rdsInstances = builder.rdsInstances;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.socEnabled = builder.socEnabled;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDiskBurstingEnabled = builder.systemDiskBurstingEnabled;
            this.systemDiskCategories = builder.systemDiskCategories;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskEncryptAlgorithm = builder.systemDiskEncryptAlgorithm;
            this.systemDiskEncrypted = builder.systemDiskEncrypted;
            this.systemDiskKmsKeyId = builder.systemDiskKmsKeyId;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskProvisionedIops = builder.systemDiskProvisionedIops;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return cisEnabled
         */
        public Boolean getCisEnabled() {
            return this.cisEnabled;
        }

        /**
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        /**
         * @return dataDisks
         */
        public java.util.List < DataDisk > getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return deploymentsetId
         */
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        /**
         * @return desiredSize
         */
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List < String > getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return keyPair
         */
        public String getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return loginAsNonRoot
         */
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return multiAzPolicy
         */
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        /**
         * @return onDemandBaseCapacity
         */
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        /**
         * @return onDemandPercentageAboveBaseCapacity
         */
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return privatePoolOptions
         */
        public PrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        /**
         * @return rdsInstances
         */
        public java.util.List < String > getRdsInstances() {
            return this.rdsInstances;
        }

        /**
         * @return scalingPolicy
         */
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return socEnabled
         */
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        /**
         * @return spotInstancePools
         */
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        /**
         * @return spotInstanceRemedy
         */
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        /**
         * @return spotPriceLimit
         */
        public java.util.List < SpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return systemDiskBurstingEnabled
         */
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        /**
         * @return systemDiskCategories
         */
        public java.util.List < String > getSystemDiskCategories() {
            return this.systemDiskCategories;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskEncryptAlgorithm
         */
        public String getSystemDiskEncryptAlgorithm() {
            return this.systemDiskEncryptAlgorithm;
        }

        /**
         * @return systemDiskEncrypted
         */
        public Boolean getSystemDiskEncrypted() {
            return this.systemDiskEncrypted;
        }

        /**
         * @return systemDiskKmsKeyId
         */
        public String getSystemDiskKmsKeyId() {
            return this.systemDiskKmsKeyId;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskProvisionedIops
         */
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List < String > getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private Boolean cisEnabled; 
            private Boolean compensateWithOnDemand; 
            private java.util.List < DataDisk > dataDisks; 
            private String deploymentsetId; 
            private Long desiredSize; 
            private String imageId; 
            private String imageType; 
            private String instanceChargeType; 
            private java.util.List < String > instanceTypes; 
            private String internetChargeType; 
            private Long internetMaxBandwidthOut; 
            private String keyPair; 
            private Boolean loginAsNonRoot; 
            private String loginPassword; 
            private String multiAzPolicy; 
            private Long onDemandBaseCapacity; 
            private Long onDemandPercentageAboveBaseCapacity; 
            private Long period; 
            private String periodUnit; 
            private String platform; 
            private PrivatePoolOptions privatePoolOptions; 
            private java.util.List < String > rdsInstances; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private Boolean socEnabled; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private java.util.List < SpotPriceLimit> spotPriceLimit; 
            private String spotStrategy; 
            private Boolean systemDiskBurstingEnabled; 
            private java.util.List < String > systemDiskCategories; 
            private String systemDiskCategory; 
            private String systemDiskEncryptAlgorithm; 
            private Boolean systemDiskEncrypted; 
            private String systemDiskKmsKeyId; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Long systemDiskSize; 
            private java.util.List < Tags> tags; 
            private java.util.List < String > vswitchIds; 

            /**
             * Specifies whether to enable auto-renewal for nodes in the node pool. This parameter takes effect only when you set `instance_charge_type` to `PrePaid`. Valid values:
             * <p>
             * 
             * *   `true`: enables auto-renewal
             * *   `false`: disables auto-renewal.
             * 
             * Default value: `true`.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The duration of the auto-renewal. This parameter takes effect and is required only when you set instance_charge_type to PrePaid and auto_renew to true. If `PeriodUnit=Month` is configured, the valid values are 1, 2, 3, 6, and 12.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * cis_enabled.
             */
            public Builder cisEnabled(Boolean cisEnabled) {
                this.cisEnabled = cisEnabled;
                return this;
            }

            /**
             * Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as the cost or insufficient inventory. This parameter takes effect when you set `multi_az_policy` to `COST_OPTIMIZED`. Valid values:
             * <p>
             * 
             * *   `true`: automatically creates pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created.
             * *   `false`: does not create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created.
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * The configuration of the data disks that are mounted to the nodes in the node pool.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the deployment set to which the ECS instances in the node pool belong.
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * The expected number of nodes in the node pool.
             */
            public Builder desiredSize(Long desiredSize) {
                this.desiredSize = desiredSize;
                return this;
            }

            /**
             * The ID of a custom image. By default, the image provided by ACK is used.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of OS image. You must set this parameter or `platform`. Valid values:
             * <p>
             * 
             * *   `AliyunLinux`: Alinux2
             * *   `AliyunLinux3`: Alinux3
             * *   `AliyunLinux3Arm64`: Alinux3 ARM
             * *   `AliyunLinuxUEFI`: Alinux2 UEFI
             * *   `CentOS`: CentOS
             * *   `Windows`: Windows
             * *   `WindowsCore`: Windows Core
             * *   `ContainerOS`: ContainerOS
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The billing method of the nodes in the node pool. Valid values:
             * <p>
             * 
             * *   `PrePaid`: the subscription billing method.
             * *   `PostPaid`: the pay-as-you-go billing method.
             * 
             * Default value: `PostPaid`.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance type of the nodes in the node pool.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The metering method of the public IP address. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth.
             * *   PayByTraffic: pay-by-data-transfer.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum outbound bandwidth of the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The name of the key pair. You must set this parameter or the `login_password` parameter.
             * <p>
             * 
             * >  If you want to create a managed node pool, you must set `key_pair`.
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * login_as_non_root.
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            /**
             * The password for SSH logon. You must set this parameter or the `key_pair` parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * The ECS instance scaling policy for a multi-zone scaling group. Valid values:
             * <p>
             * 
             * *   `PRIORITY`: ECS instances are created based on the VSwitchIds.N parameter. If Auto Scaling fails to create ECS instances in the zone of the vSwitch with the highest priority, Auto Scaling attempts to create ECS instances in the zone of the vSwitch with a lower priority.
             * 
             * *   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configuration. You can set the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.
             * 
             *     **
             * 
             *     **Note** `COST_OPTIMIZED` is valid only when multiple instance types are specified or at least one preemptible instance type is specified.
             * 
             * *   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call [RebalanceInstances](~~71516~~) of Auto Scaling to balance the instance distribution among zones.
             * 
             * Default value: `PRIORITY`.
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by `on_demand_base_capacity`. Valid values: 0 to 100.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * The subscription duration of the nodes in the node pool. This parameter takes effect and is required only when you set `instance_charge_type` to `PrePaid`. If you set `period_unit` to Month, the valid values of `period` are 1, 2, 3, 6, and 12.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of the nodes in the node pool. This parameter is required if you set instance_charge_type to `PrePaid`. A value of Month indicates that the billing cycle is measured in months.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The release version of the operating system. Valid values:
             * <p>
             * 
             * *   `CentOS`
             * *   `AliyunLinux`
             * *   `Windows`
             * *   `WindowsCore`
             * 
             * Default value: `AliyunLinux`.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The configuration of the private node pool.
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * A list of ApsaraDB RDS instances.
             */
            public Builder rdsInstances(java.util.List < String > rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * The scaling mode of the scaling group. Valid values:
             * <p>
             * 
             * *   `release`: the standard mode. ECS instances are created and released based on resource usage.
             * *   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances attached with local disks.
             * 
             * Default value: `release`.
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * Specifies the ID of the security group to which you want to add the node pool. You must set this parameter or `security_group_ids`. We recommend that you set `security_group_ids`.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of security groups to which you want to add the node pool. You must set this parameter or `security_group_id`. We recommend that you set `security_group_ids`. If you set both `security_group_id` and `security_group_ids`, `security_group_ids` is used.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * soc_enabled.
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * The number of instance types that are available. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Specifies whether to supplement preemptible instances when the number of preemptible instances drops below the specified minimum number. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values:
             * <p>
             * 
             * *   `true`: enables the supplementation of preemptible instances.
             * *   `false`: disables the supplementation of preemptible instances.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * The instance type of preemptible instance and the maximum bid price.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding policy of preemptible instances. Valid values:
             * <p>
             * 
             * *   `NoSpot`: non-preemptible instance.
             * *   `SpotWithPriceLimit`: specifies the highest bid.
             * *   `SpotAsPriceGo`: automatically submits bids based on the up-to-date market price.
             * 
             * For more information, see [Preemptible instances](~~165053~~).
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Specifies whether to enable the burst feature for system disks. Valid values:
             * <p>
             * 
             * *   true: enables the burst feature.
             * *   false: disables the burst feature.
             * 
             * This parameter is supported only when `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * system_disk_categories.
             */
            public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * The type of system disk. Valid values:
             * <p>
             * 
             * *   `cloud_efficiency`: ultra disk.
             * *   `cloud_ssd`: standard SSD.
             * *   `cloud_essd`: enhanced SSD.
             * 
             * Default value: `cloud_efficiency`.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * system_disk_encrypt_algorithm.
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * system_disk_encrypted.
             */
            public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
                this.systemDiskEncrypted = systemDiskEncrypted;
                return this;
            }

            /**
             * system_disk_kms_key_id.
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for ESSDs.
             * <p>
             * 
             * *   PL0: moderate maximum concurrent I/O performance and low I/O latency
             * *   PL1: moderate maximum concurrent I/O performance and low I/O latency
             * *   PL2: high maximum concurrent I/O performance and low I/O latency
             * *   PL3: ultra-high maximum concurrent I/O performance and ultra-low I/O latency
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The predefined IOPS of a system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.
             * <p>
             * 
             * This parameter is supported only when `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * The system disk size of a node. Unit: GiB.
             * <p>
             * 
             * Valid values: 40 to 500.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The labels that you want to add to the ECS instances.
             * <p>
             * 
             * Each key must be unique and cannot exceed 128 characters in length. Neither keys nor values can start with aliyun or acs:. Neither keys nor values can contain https:// or http://.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The vSwitch IDs. Valid values: 1 to 8.
             * <p>
             * 
             * >  To ensure high availability, we recommend that you select vSwitches that reside in different zones.
             */
            public Builder vswitchIds(java.util.List < String > vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
    public static class TeeConfig extends TeaModel {
        @NameInMap("tee_enable")
        private Boolean teeEnable;

        private TeeConfig(Builder builder) {
            this.teeEnable = builder.teeEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TeeConfig create() {
            return builder().build();
        }

        /**
         * @return teeEnable
         */
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

        public static final class Builder {
            private Boolean teeEnable; 

            /**
             * Specifies whether to enable confidential computing for the cluster.
             */
            public Builder teeEnable(Boolean teeEnable) {
                this.teeEnable = teeEnable;
                return this;
            }

            public TeeConfig build() {
                return new TeeConfig(this);
            } 

        } 

    }
}
