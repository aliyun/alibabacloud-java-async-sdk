// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterNodePoolRequest</p>
 */
public class CreateClusterNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("count")
    @Deprecated
    private Long count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interconnect_config")
    @Deprecated
    private InterconnectConfig interconnectConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interconnect_mode")
    private String interconnectMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("management")
    private Management management;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("max_nodes")
    @Deprecated
    private Long maxNodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("node_config")
    private NodeConfig nodeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tee_config")
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
         * The configurations of auto scaling.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * This parameter is deprecated. Use desired_size instead.
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
         * The configurations of the edge node pool.
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.putBodyParameter("interconnect_config", interconnectConfig);
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * The network type of the edge node pool. This parameter takes effect only if you set the `type` of the node pool to `edge`. Valid values:
         * <p>
         * 
         * *   `basic`: basic
         * *   `private`: dedicated Only Kubernetes 1.22 and later support this value.
         */
        public Builder interconnectMode(String interconnectMode) {
            this.putBodyParameter("interconnect_mode", interconnectMode);
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * The configurations of the cluster.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * The configurations of the managed node pool feature.
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
            return this;
        }

        /**
         * The maximum number of nodes that can be contained in the edge node pool. The value of this parameter must be greater than or equal to 0. A value of 0 indicates that the number of nodes in the node pool is limited only by the quota of nodes in the cluster.
         * <p>
         * 
         * *   In most cases, this parameter is set to a value greater than 0 for edge node pools.
         * *   This parameter is set to 0 for node pools whose types are ess or default edge node pools.
         */
        public Builder maxNodes(Long maxNodes) {
            this.putBodyParameter("max_nodes", maxNodes);
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * The node configurations.
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.putBodyParameter("node_config", nodeConfig);
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * The configurations of the node pool.
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.putBodyParameter("nodepool_info", nodepoolInfo);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * The configurations of the scaling group that is used by the node pool.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.putBodyParameter("scaling_group", scalingGroup);
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * The configurations of confidential computing for the cluster.
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
        @com.aliyun.core.annotation.NameInMap("eip_bandwidth")
        @Deprecated
        private Long eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("eip_internet_charge_type")
        @Deprecated
        private String eipInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("is_bond_eip")
        @Deprecated
        private Boolean isBondEip;

        @com.aliyun.core.annotation.NameInMap("max_instances")
        private Long maxInstances;

        @com.aliyun.core.annotation.NameInMap("min_instances")
        private Long minInstances;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * 
             * **
             * 
             * **Important** This parameter is deprecated. Use internet_charge_type and internet_max_bandwidth_out.
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
             * 
             * **
             * 
             * **Important** This parameter is deprecated. Use internet_charge_type and internet_max_bandwidth_out.
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * Specifies whether to enable auto scaling for the node pool. Valid values:
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
             * *   `true`: associates an EIP with the node pool.
             * *   `false`: does not associate an EIP with the node pool.
             * 
             * Default value: `false`.
             * 
             * **
             * 
             * **Important** This parameter is deprecated. Use internet_charge_type and internet_max_bandwidth_out.
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * The maximum number to which the Elastic Compute Service (ECS) instances in the node pool can be scaled. The number of nodes in the node pool cannot be greater than this value. This parameter takes effect only if `enable` is set to true. Valid values: \[min_instances, 2000]. Default value: 0.
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * The minimum number to which the ECS instances in the node pool can be scaled. The number of nodes in the node pool cannot be smaller than this value. This parameter takes effect only if `enable` is set to true. Valid values: \[0, max_instances]. Default value: 0.
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * The instance type that is used for auto scaling. This parameter takes effect only if `enable` is set to true. Valid values:
             * <p>
             * 
             * *   `cpu`: regular instance.
             * *   `gpu`: GPU-accelerated instance.
             * *   `gpushare`: shared GPU-accelerated instance.
             * *   `spot`: preemptible instance.
             * 
             * Default value: `cpu`.
             * 
             * >  You cannot modify this parameter after the node pool is created.
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
        @com.aliyun.core.annotation.NameInMap("bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("ccn_id")
        private String ccnId;

        @com.aliyun.core.annotation.NameInMap("ccn_region_id")
        private String ccnRegionId;

        @com.aliyun.core.annotation.NameInMap("cen_id")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("improved_period")
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
        @com.aliyun.core.annotation.NameInMap("cms_enabled")
        private Boolean cmsEnabled;

        @com.aliyun.core.annotation.NameInMap("cpu_policy")
        private String cpuPolicy;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List < Tag > labels;

        @com.aliyun.core.annotation.NameInMap("node_name_mode")
        private String nodeNameMode;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("runtime_version")
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("taints")
        private java.util.List < Taint > taints;

        @com.aliyun.core.annotation.NameInMap("unschedulable")
        private Boolean unschedulable;

        @com.aliyun.core.annotation.NameInMap("user_data")
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
             * The CPU management policy of nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later:
             * <p>
             * 
             * *   `static`: allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.
             * *   `none`: specifies that the default CPU affinity is used.
             * 
             * Default value: `none`.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * The labels that you want to add to nodes in the cluster.
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The custom node name. A custom node name consists of a prefix, a node IP address, and a suffix.
             * <p>
             * 
             * *   The prefix and the suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.
             * *   The node IP address in a custom node name is the private IP address of the node.
             * 
             * Set the parameter to a value in the customized,aliyun,ip,com format. The value consists of four parts that are separated by commas (,). customized and ip are fixed content. aliyun is the prefix and com is the suffix. Example: aliyun.192.168.xxx.xxx.com.
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * The name of the container runtime. The following types of runtime are supported by Container Service for Kubernetes (ACK):
             * <p>
             * 
             * *   containerd: containerd is the recommended runtime and supports all Kubernetes versions.
             * *   Sandboxed-Container.runv: The Sandbox-Container runtime provides improved isolation and supports Kubernetes 1.24 and earlier.
             * *   docker: The Docker runtime supports Kubernetes 1.22 and earlier.
             * 
             * Default value: containerd.
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
             * The taints.
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * Specifies whether the nodes are schedulable after a scale-out operation is performed.
             */
            public Builder unschedulable(Boolean unschedulable) {
                this.unschedulable = unschedulable;
                return this;
            }

            /**
             * The user data on the node.
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
        @com.aliyun.core.annotation.NameInMap("restart_node")
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
             * Specifies whether to allow node restart. This parameter takes effect only if `auto_repair` is set to true. Valid values:
             * <p>
             * 
             * *   `true`: allows node restart.
             * *   `false`: does not allow node restart.
             * 
             * If `auto_repair` is set to true, the default value of this parameter is `true`. If `auto_repair` is set to false, the default value of this parameter is `false`.
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
        @com.aliyun.core.annotation.NameInMap("auto_upgrade_kubelet")
        private Boolean autoUpgradeKubelet;

        @com.aliyun.core.annotation.NameInMap("auto_upgrade_os")
        private Boolean autoUpgradeOs;

        @com.aliyun.core.annotation.NameInMap("auto_upgrade_runtime")
        private Boolean autoUpgradeRuntime;

        private AutoUpgradePolicy(Builder builder) {
            this.autoUpgradeKubelet = builder.autoUpgradeKubelet;
            this.autoUpgradeOs = builder.autoUpgradeOs;
            this.autoUpgradeRuntime = builder.autoUpgradeRuntime;
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

        /**
         * @return autoUpgradeOs
         */
        public Boolean getAutoUpgradeOs() {
            return this.autoUpgradeOs;
        }

        /**
         * @return autoUpgradeRuntime
         */
        public Boolean getAutoUpgradeRuntime() {
            return this.autoUpgradeRuntime;
        }

        public static final class Builder {
            private Boolean autoUpgradeKubelet; 
            private Boolean autoUpgradeOs; 
            private Boolean autoUpgradeRuntime; 

            /**
             * Specifies whether to allow auto update of the kubelet. This parameter takes effect only if `auto_upgrade` is set to true. Valid values:
             * <p>
             * 
             * *   `true`: allows auto update of the kubelet.
             * *   `false`: does not allow auto update of the kubelet.
             * 
             * If `auto_upgrade` is set to true, the default value of this parameter is `true`. If `auto_upgrade` is set to false, the default value of this parameter is `false`.
             */
            public Builder autoUpgradeKubelet(Boolean autoUpgradeKubelet) {
                this.autoUpgradeKubelet = autoUpgradeKubelet;
                return this;
            }

            /**
             * Specifies whether to allow auto update of the OS. This parameter takes effect only if `auto_upgrade` is set to true. Valid values:
             * <p>
             * 
             * *   `true`: allows auto update of the OS.
             * *   `false`: does not allow auto update of the OS.
             * 
             * Default value: `false`.
             */
            public Builder autoUpgradeOs(Boolean autoUpgradeOs) {
                this.autoUpgradeOs = autoUpgradeOs;
                return this;
            }

            /**
             * Specifies whether to allow auto update of the runtime. This parameter takes effect only if `auto_upgrade` is set to true. Valid values:
             * <p>
             * 
             * *   `true`: allows auto update of the runtime.
             * *   `false`: does not allow auto update of the runtime.
             * 
             * Default value: `false`.
             */
            public Builder autoUpgradeRuntime(Boolean autoUpgradeRuntime) {
                this.autoUpgradeRuntime = autoUpgradeRuntime;
                return this;
            }

            public AutoUpgradePolicy build() {
                return new AutoUpgradePolicy(this);
            } 

        } 

    }
    public static class AutoVulFixPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("restart_node")
        private Boolean restartNode;

        @com.aliyun.core.annotation.NameInMap("vul_level")
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
             * Specifies whether to allow node restart. This parameter takes effect only if `auto_vul_fix` is set to true. Valid values:
             * <p>
             * 
             * *   `true`: allows node restart.
             * *   `false`: does not allow node restart. If `auto_vul_fix` is set to true, the default value of this parameter is `false`. If `auto_vul_fix` is set to false, the default value of this parameter is `false`.
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * The severity levels of CVEs that can be automatically patched. Separate multiple levels with commas (,). Example: `asap,later`. Valid values:
             * <p>
             * 
             * *   `asap`: high.
             * *   `later`: medium.
             * *   `nntf`: low.
             * 
             * If `auto_vul_fix` is set to true, the default value of this parameter is `asap`.
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
        @com.aliyun.core.annotation.NameInMap("auto_upgrade")
        @Deprecated
        private Boolean autoUpgrade;

        @com.aliyun.core.annotation.NameInMap("max_unavailable")
        private Long maxUnavailable;

        @com.aliyun.core.annotation.NameInMap("surge")
        private Long surge;

        @com.aliyun.core.annotation.NameInMap("surge_percentage")
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
             * Specifies whether to enable auto update. Valid values:
             * <p>
             * 
             * *   `true`: enables auto update.
             * *   `false`: disables auto update.
             * 
             * **
             * 
             * **Caution** This parameter is deprecated. Use the preceding auto_upgrade parameter.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The maximum number of unavailable nodes. Valid values: 1 to 1000.
             * <p>
             * 
             * Default value: 1
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * The number of additional nodes that are temporarily added to the node pool during an auto update.
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * The percentage of additional nodes that are temporarily added to the node pool during an auto update. You must set this parameter or `surge`.
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
        @com.aliyun.core.annotation.NameInMap("auto_repair")
        private Boolean autoRepair;

        @com.aliyun.core.annotation.NameInMap("auto_repair_policy")
        private AutoRepairPolicy autoRepairPolicy;

        @com.aliyun.core.annotation.NameInMap("auto_upgrade")
        private Boolean autoUpgrade;

        @com.aliyun.core.annotation.NameInMap("auto_upgrade_policy")
        private AutoUpgradePolicy autoUpgradePolicy;

        @com.aliyun.core.annotation.NameInMap("auto_vul_fix")
        private Boolean autoVulFix;

        @com.aliyun.core.annotation.NameInMap("auto_vul_fix_policy")
        private AutoVulFixPolicy autoVulFixPolicy;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("upgrade_config")
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
             * Specifies whether to enable auto node repair. This parameter takes effect only if `enable` is set to true.
             * <p>
             * 
             * *   `true`: enables auto node repair.
             * *   `false`: disables auto node repair.
             * 
             * If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * The auto node repair policy.
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * Specifies whether to enable auto node update. This parameter takes effect only if `enable` is set to true.
             * <p>
             * 
             * *   `true`: enables auto node update.
             * *   `false`: disables auto node update.
             * 
             * If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The auto node update policy.
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * Specifies whether to enable auto Common Vulnerabilities and Exposures (CVE) patching. This parameter takes effect only if `enable` is set to true.
             * <p>
             * 
             * *   `true`: enables auto CVE patching.
             * *   `false`: disables auto CVE patching.
             * 
             * If `enable` is set to true, the default value of this parameter is `true`. If `enable` is set to false, the default value of this parameter is `false`.
             */
            public Builder autoVulFix(Boolean autoVulFix) {
                this.autoVulFix = autoVulFix;
                return this;
            }

            /**
             * The auto CVE patching policy.
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
             * *   `false`: disables the managed node pool feature. Other parameters in this section take effect only if enable is set to true.
             * 
             * Default value: false
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The configurations of auto update. The configurations take effects only if `enable` is set to true.
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
        @com.aliyun.core.annotation.NameInMap("kubelet_configuration")
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
             * The configurations of the kubelet.
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
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * The ID of the resource group to which the node pool belongs. Instances that are added to the node pool belong to this resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of node pool. Valid values:
             * <p>
             * 
             * *   `ess`: regular node pool, which supports the managed node pool feature and the auto scaling feature.
             * *   `edge`: edge node pool.
             * *   `lingjun`: Lingjun node pool.
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
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("match_criteria")
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
             * The private node pool ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of private node pool. This parameter specifies the type of private pool that you want to use to create instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. The system selects a private pool to start instances. Valid values:
             * <p>
             * 
             * *   `Open`: open private node pool. The system selects an open private pool to start instances. If no matching open private pools are available, the resources in the public pool are used.
             * *   `Target`: private node pool. The system uses the resources of the specified private pool to start instances. If the specified private pool is unavailable, instances cannot be started.
             * *   `None`: does not use private pools. The resources of private node pools are not used to launch instances.
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
        @com.aliyun.core.annotation.NameInMap("instance_type")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("price_limit")
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
             * The instance type of preemptible instances.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The price cap of a preemptible instance.
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
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * The label key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The label value.
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
        @com.aliyun.core.annotation.NameInMap("auto_renew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("cis_enabled")
        @Deprecated
        private Boolean cisEnabled;

        @com.aliyun.core.annotation.NameInMap("compensate_with_on_demand")
        private Boolean compensateWithOnDemand;

        @com.aliyun.core.annotation.NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @com.aliyun.core.annotation.NameInMap("deploymentset_id")
        private String deploymentsetId;

        @com.aliyun.core.annotation.NameInMap("desired_size")
        private Long desiredSize;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("instance_charge_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("instance_patterns")
        private java.util.List < InstancePatterns > instancePatterns;

        @com.aliyun.core.annotation.NameInMap("instance_types")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > instanceTypes;

        @com.aliyun.core.annotation.NameInMap("internet_charge_type")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("internet_max_bandwidth_out")
        private Long internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("key_pair")
        private String keyPair;

        @com.aliyun.core.annotation.NameInMap("login_as_non_root")
        private Boolean loginAsNonRoot;

        @com.aliyun.core.annotation.NameInMap("login_password")
        private String loginPassword;

        @com.aliyun.core.annotation.NameInMap("multi_az_policy")
        private String multiAzPolicy;

        @com.aliyun.core.annotation.NameInMap("on_demand_base_capacity")
        private Long onDemandBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("on_demand_percentage_above_base_capacity")
        private Long onDemandPercentageAboveBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("period_unit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("platform")
        @Deprecated
        private String platform;

        @com.aliyun.core.annotation.NameInMap("private_pool_options")
        private PrivatePoolOptions privatePoolOptions;

        @com.aliyun.core.annotation.NameInMap("ram_role_name")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @com.aliyun.core.annotation.NameInMap("scaling_policy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        @Deprecated
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_ids")
        private java.util.List < String > securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("security_hardening_os")
        private Boolean securityHardeningOs;

        @com.aliyun.core.annotation.NameInMap("soc_enabled")
        private Boolean socEnabled;

        @com.aliyun.core.annotation.NameInMap("spot_instance_pools")
        private Long spotInstancePools;

        @com.aliyun.core.annotation.NameInMap("spot_instance_remedy")
        private Boolean spotInstanceRemedy;

        @com.aliyun.core.annotation.NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("spot_strategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("system_disk_bursting_enabled")
        private Boolean systemDiskBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_categories")
        private java.util.List < String > systemDiskCategories;

        @com.aliyun.core.annotation.NameInMap("system_disk_category")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("system_disk_encrypt_algorithm")
        private String systemDiskEncryptAlgorithm;

        @com.aliyun.core.annotation.NameInMap("system_disk_encrypted")
        private Boolean systemDiskEncrypted;

        @com.aliyun.core.annotation.NameInMap("system_disk_kms_key_id")
        private String systemDiskKmsKeyId;

        @com.aliyun.core.annotation.NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("system_disk_provisioned_iops")
        private Long systemDiskProvisionedIops;

        @com.aliyun.core.annotation.NameInMap("system_disk_size")
        private Long systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        @com.aliyun.core.annotation.Validation(required = true)
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
            this.instancePatterns = builder.instancePatterns;
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
            this.ramRoleName = builder.ramRoleName;
            this.rdsInstances = builder.rdsInstances;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.securityHardeningOs = builder.securityHardeningOs;
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
         * @return instancePatterns
         */
        public java.util.List < InstancePatterns > getInstancePatterns() {
            return this.instancePatterns;
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
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
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
         * @return securityHardeningOs
         */
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
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
            private java.util.List < InstancePatterns > instancePatterns; 
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
            private String ramRoleName; 
            private java.util.List < String > rdsInstances; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private Boolean securityHardeningOs; 
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
             * *   `true`: enables auto-renewal.
             * *   `false`: disables auto-renewal.
             * 
             * Default value: `false`.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The auto-renewal duration of nodes in the node pool. This parameter is available and required only if you set instance_charge_type to PrePaid and auto_renew to true. If `PeriodUnit=Month` is configured, the valid values are 1, 2, 3, 6, and 12.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * This parameter is deprecated. Use security_hardening_os instead.
             */
            public Builder cisEnabled(Boolean cisEnabled) {
                this.cisEnabled = cisEnabled;
                return this;
            }

            /**
             * Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as the price or insufficient inventory. This parameter takes effect when you set `multi_az_policy` to `COST_OPTIMIZED`. Valid values:
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
             * The configurations of the data disks that are mounted to nodes in the node pool.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the deployment set.
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
             * The custom image ID. By default, the image provided by ACK is used.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of the OS image. You must specify this parameter or `platform`. Valid values:
             * <p>
             * 
             * *   `AliyunLinux`: Alibaba Cloud Linux 2.
             * *   `AliyunLinuxSecurity`: Alibaba Cloud Linux 2 (UEFI).
             * *   `AliyunLinux3`: Alibaba Cloud Linux 3.
             * *   `AliyunLinux3Arm64`: Alibaba Cloud Linux 3 (ARM).
             * *   `AliyunLinux3Security`: Alibaba Cloud Linux 3 (UEFI).
             * *   `CentOS`: CentOS.
             * *   `Windows`: Windows.
             * *   `WindowsCore`: Windows Core.
             * *   `ContainerOS`: ContainerOS.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The billing method of nodes in the node pool. Valid values:
             * <p>
             * 
             * *   `PrePaid`: subscription.
             * *   `PostPaid`: pay-as-you-go.
             * 
             * Default value: `PostPaid`.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance attributes.
             */
            public Builder instancePatterns(java.util.List < InstancePatterns > instancePatterns) {
                this.instancePatterns = instancePatterns;
                return this;
            }

            /**
             * The instance types of nodes in the node pool. When the system adds a node to the node pool, the system selects the most appropriate one from the specified instance types for the node. You can specify 1 to 10 instance types.
             * <p>
             * 
             * >  To ensure high availability, we recommend that you specify multiple instance types.
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
             * The maximum outbound bandwidth of the public IP address. Unit: Mbit/s. Valid values: 1 to 100.
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The name of the key pair used to log on to nodes in the node pool. You must set this parameter or `login_password`.
             * <p>
             * 
             * >  If you select ContainerOS as the OS of nodes in the node pool, you must specify `key_pair`.
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * Specifies whether to allow a non-root user to log on to an ECS instance that is added to the node pool.
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            /**
             * The password for SSH logon. You must specify this parameter or `key_pair`. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * The ECS instance scaling policy for the multi-zone scaling group. Valid values:
             * <p>
             * 
             * *   `PRIORITY`: ECS instances are scaled based on the value of VSwitchIds.N. If an ECS instance cannot be created in the zone where the vSwitch that has the highest priority resides, the system creates the ECS instance in the zone where the vSwitch that has the next highest priority resides.
             * 
             * *   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configurations. You can set `CompensateWithOnDemand` to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient inventory.
             * 
             *     **
             * 
             *     **Note** `COST_OPTIMIZED` is valid only when multiple instance types are specified or at least one preemptible instance type is specified.
             * 
             * *   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call the [RebalanceInstances](~~71516~~) operation of Auto Scaling to evenly distribute the ECS instances among zones.
             * 
             * Default value: `PRIORITY`.
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is smaller than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.
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
             * The subscription duration of nodes in the node pool. This parameter takes effect and is required if you set `instance_charge_type` to `PrePaid`.
             * <p>
             * 
             * *   If `period_unit` is set to Week, the valid values of `period` are 1, 2, 3, and 4.
             * *   If `period_unit` is set to Month, the valid values of `period` are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of nodes in the node pool. This parameter takes effect and is required if you set `instance_charge_type` to `PrePaid`. Valid values:
             * <p>
             * 
             * *   `Month`: The subscription duration is measured in months.
             * *   `Week`: The subscription duration is measured in weeks.
             * 
             * Default value: `Month`.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The OS distribution that is used. Valid values:
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
             * The configurations of the private node pool.
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * The name of the worker Resource Access Management (RAM) role.
             * <p>
             * 
             * *   If you do not specify this parameter, the default worker RAM role created by the cluster is used.
             * *   The specified RAM role must be a **regular service role** and the **Select Trusted Service** parameter must be set to **Elastic Compute Service**. For more information, see [Create a normal service role](~~116800~~). If the specified RAM role is not the default worker RAM role created by the cluster, the name of the RAM role cannot start with `KubernetesMasterRole-` or `KubernetesWorkerRole-`.
             * 
             * This parameter is available only to users in the whitelist. To use this parameter, submit a ticket.
             * 
             * >  This parameter is available only for ACK managed clusters that run Kubernetes 1.22 or later.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
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
             * *   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.
             * 
             * Default value: `release`.
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The ID of the security group to which you want to add the node pool. You must specify this parameter or the `security_group_ids` parameter. We recommend that you specify `security_group_ids`.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of security groups. You must specify this parameter or `security_group_id`. We recommend that you specify `security_group_ids`. If you specify both `security_group_id` and `security_group_ids`, `security_group_ids` is used.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * Specifies whether to enable Alibaba Cloud Linux Security Hardening. Valid values:
             * <p>
             * 
             * *   `true`: enables Alibaba Cloud Linux Security Hardening.
             * *   `false`: disables Alibaba Cloud Linux Security Hardening.
             * 
             * Default value: `false`.
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * Specifies whether to enable MLPS Security Hardening. You can enable MLPS Security Hardening only when Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3 is installed on nodes. Alibaba Cloud provides standards for baseline checks and a scanner to ensure the compliance of Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images with the level 3 standards of MLPS 2.0.
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Specifies whether to supplement preemptible instances. If you set this parameter to true, when the scaling group receives a system message indicating that a preemptible instance is to be reclaimed, the scaling group creates a new instance to replace this instance. Valid values:
             * <p>
             * 
             * *   `true`: supplements preemptible instances.
             * *   `false`: does not supplement preemptible instances.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * The instance type of preemptible instances and the price cap for the instance type.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding policy of preemptible instances. Valid values:
             * <p>
             * 
             * *   `NoSpot`: non-preemptible.
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
             * Specifies whether to enable the burst feature for the system disk. Valid values:
             * <p>
             * 
             * *   true: enables the burst feature.
             * *   false: disables the burst feature.
             * 
             * This parameter is available only when `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * The system disk types. The system creates system disks of a disk type with a lower priority if the disk type with a higher priority is unavailable. Valid values:
             * <p>
             * 
             * *   `cloud`: basic disk.
             * *   `cloud_efficiency`: ultra disk.
             * *   `cloud_ssd`: standard SSD.
             * *   `cloud_essd`: ESSD.
             * *   `cloud_auto`: ESSD AutoPL disk.
             * *   `cloud_essd_entry`: ESSD Entry disk.
             */
            public Builder systemDiskCategories(java.util.List < String > systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * The system disk type. Valid values:
             * <p>
             * 
             * *   `cloud`: basic disk.
             * *   `cloud_efficiency`: ultra disk.
             * *   `cloud_ssd`: standard SSD.
             * *   `cloud_essd`: Enterprise SSD (ESSD).
             * *   `cloud_auto`: ESSD AutoPL disk.
             * *   `cloud_essd_entry`: ESSD Entry disk.
             * 
             * Default value: `cloud_efficiency`.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The encryption algorithm that is used to encrypt the system disk. Set the value to aes-256.
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * Specifies whether to encrypt the system disk. Valid values: true: encrypts the system disk. false: does not encrypt the system disk.
             */
            public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
                this.systemDiskEncrypted = systemDiskEncrypted;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used to encrypt the system disk.
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * The performance level (PL) of the system disk. This parameter takes effect only for an ESSD.
             * <p>
             * 
             * *   PL0: moderate maximum concurrent I/O performance and low I/O latency.
             * *   PL1: moderate maximum concurrent I/O performance and low I/O latency.
             * *   PL2: high maximum concurrent I/O performance and low I/O latency.
             * *   PL3: ultra-high maximum concurrent I/O performance and ultra-low I/O latency.
             * 
             * >  Disks support all of the preceding PLs. However, when you create a disk, the available PLs vary based on the ECS instance type that you selected. For more information, see [Overview of ECS instance families](~~25378~~).
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The preset read/write IOPS of the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS} Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.
             * <p>
             * 
             * This parameter is available only when `SystemDiskCategory` is set to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             * <p>
             * 
             * Valid values: 20 to 20248.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The labels that you want to add only to ECS instances.
             * <p>
             * 
             * The label key must be unique and cannot exceed 128 characters in length. The label key and value cannot start with aliyun or acs: and cannot contain https:// or http://.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The vSwitch IDs. You can specify one to eight vSwitch IDs.
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
        @com.aliyun.core.annotation.NameInMap("tee_enable")
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
