// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterNodePoolRequest</p>
 */
public class ModifyClusterNodePoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @Body
    @NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @Body
    @NameInMap("management")
    private Management management;

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

    @Body
    @NameInMap("update_nodes")
    private Boolean updateNodes;

    private ModifyClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoScaling = builder.autoScaling;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.management = builder.management;
        this.nodeConfig = builder.nodeConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.teeConfig = builder.teeConfig;
        this.updateNodes = builder.updateNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterNodePoolRequest create() {
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
     * @return autoScaling
     */
    public AutoScaling getAutoScaling() {
        return this.autoScaling;
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

    /**
     * @return updateNodes
     */
    public Boolean getUpdateNodes() {
        return this.updateNodes;
    }

    public static final class Builder extends Request.Builder<ModifyClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private AutoScaling autoScaling; 
        private KubernetesConfig kubernetesConfig; 
        private Management management; 
        private NodeConfig nodeConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private TeeConfig teeConfig; 
        private Boolean updateNodes; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.autoScaling = request.autoScaling;
            this.kubernetesConfig = request.kubernetesConfig;
            this.management = request.management;
            this.nodeConfig = request.nodeConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
            this.updateNodes = request.updateNodes;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点池ID。
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 自动伸缩节点池配置。
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * 集群配置。
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * 托管版节点池配置。
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
            return this;
        }

        /**
         * 节点配置。
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.putBodyParameter("node_config", nodeConfig);
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * 节点池配置。
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.putBodyParameter("nodepool_info", nodepoolInfo);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * 扩容组配置。
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.putBodyParameter("scaling_group", scalingGroup);
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * 加密计算配置。
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.putBodyParameter("tee_config", teeConfig);
            this.teeConfig = teeConfig;
            return this;
        }

        /**
         * 是否同步更新节点标签及污点。
         */
        public Builder updateNodes(Boolean updateNodes) {
            this.putBodyParameter("update_nodes", updateNodes);
            this.updateNodes = updateNodes;
            return this;
        }

        @Override
        public ModifyClusterNodePoolRequest build() {
            return new ModifyClusterNodePoolRequest(this);
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
             * 带宽峰值。
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * EIP计费类型。
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * 是否开启自动伸缩。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 是否绑定EIP。
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * 最大实例数。
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * 最小实例数。
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * 自动伸缩节点类型。
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
    public static class KubernetesConfig extends TeaModel {
        @NameInMap("cms_enabled")
        private Boolean cmsEnabled;

        @NameInMap("cpu_policy")
        private String cpuPolicy;

        @NameInMap("labels")
        private java.util.List < Tag > labels;

        @NameInMap("runtime")
        private String runtime;

        @NameInMap("runtime_version")
        private String runtimeVersion;

        @NameInMap("taints")
        private java.util.List < Taint > taints;

        @NameInMap("user_data")
        private String userData;

        private KubernetesConfig(Builder builder) {
            this.cmsEnabled = builder.cmsEnabled;
            this.cpuPolicy = builder.cpuPolicy;
            this.labels = builder.labels;
            this.runtime = builder.runtime;
            this.runtimeVersion = builder.runtimeVersion;
            this.taints = builder.taints;
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
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private Boolean cmsEnabled; 
            private String cpuPolicy; 
            private java.util.List < Tag > labels; 
            private String runtime; 
            private String runtimeVersion; 
            private java.util.List < Taint > taints; 
            private String userData; 

            /**
             * 是否开启云监控。
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * CPU管理策略。
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * 节点标签。
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * 容器运行时。
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * 容器运行时版本。
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * 污点配置。
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * 实例自定义数据。
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
             * 是否启用自动升级，自修复。
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * 最大不可用节点数量。
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * 额外节点数量。
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * 额外节点比例， 和surge 二选一。
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

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("upgrade_config")
        private UpgradeConfig upgradeConfig;

        private Management(Builder builder) {
            this.autoRepair = builder.autoRepair;
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
            private Boolean enable; 
            private UpgradeConfig upgradeConfig; 

            /**
             * 是否开启自动修复。
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * 是否启用托管节点池。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 自动升级配置。
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
    public static class KubeletConfiguration extends TeaModel {
        @NameInMap("cpuManagerPolicy")
        private String cpuManagerPolicy;

        @NameInMap("eventBurst")
        private Long eventBurst;

        @NameInMap("eventRecordQPS")
        private Long eventRecordQPS;

        @NameInMap("evictionHard")
        private java.util.Map < String, ? > evictionHard;

        @NameInMap("evictionSoft")
        private java.util.Map < String, ? > evictionSoft;

        @NameInMap("evictionSoftGracePeriod")
        private java.util.Map < String, ? > evictionSoftGracePeriod;

        @NameInMap("kubeAPIBurst")
        private Long kubeAPIBurst;

        @NameInMap("kubeAPIQPS")
        private Long kubeAPIQPS;

        @NameInMap("kubeReserved")
        private java.util.Map < String, ? > kubeReserved;

        @NameInMap("registryBurst")
        private Long registryBurst;

        @NameInMap("registryPullQPS")
        private Long registryPullQPS;

        @NameInMap("serializeImagePulls")
        private Boolean serializeImagePulls;

        @NameInMap("systemReserved")
        private java.util.Map < String, ? > systemReserved;

        private KubeletConfiguration(Builder builder) {
            this.cpuManagerPolicy = builder.cpuManagerPolicy;
            this.eventBurst = builder.eventBurst;
            this.eventRecordQPS = builder.eventRecordQPS;
            this.evictionHard = builder.evictionHard;
            this.evictionSoft = builder.evictionSoft;
            this.evictionSoftGracePeriod = builder.evictionSoftGracePeriod;
            this.kubeAPIBurst = builder.kubeAPIBurst;
            this.kubeAPIQPS = builder.kubeAPIQPS;
            this.kubeReserved = builder.kubeReserved;
            this.registryBurst = builder.registryBurst;
            this.registryPullQPS = builder.registryPullQPS;
            this.serializeImagePulls = builder.serializeImagePulls;
            this.systemReserved = builder.systemReserved;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KubeletConfiguration create() {
            return builder().build();
        }

        /**
         * @return cpuManagerPolicy
         */
        public String getCpuManagerPolicy() {
            return this.cpuManagerPolicy;
        }

        /**
         * @return eventBurst
         */
        public Long getEventBurst() {
            return this.eventBurst;
        }

        /**
         * @return eventRecordQPS
         */
        public Long getEventRecordQPS() {
            return this.eventRecordQPS;
        }

        /**
         * @return evictionHard
         */
        public java.util.Map < String, ? > getEvictionHard() {
            return this.evictionHard;
        }

        /**
         * @return evictionSoft
         */
        public java.util.Map < String, ? > getEvictionSoft() {
            return this.evictionSoft;
        }

        /**
         * @return evictionSoftGracePeriod
         */
        public java.util.Map < String, ? > getEvictionSoftGracePeriod() {
            return this.evictionSoftGracePeriod;
        }

        /**
         * @return kubeAPIBurst
         */
        public Long getKubeAPIBurst() {
            return this.kubeAPIBurst;
        }

        /**
         * @return kubeAPIQPS
         */
        public Long getKubeAPIQPS() {
            return this.kubeAPIQPS;
        }

        /**
         * @return kubeReserved
         */
        public java.util.Map < String, ? > getKubeReserved() {
            return this.kubeReserved;
        }

        /**
         * @return registryBurst
         */
        public Long getRegistryBurst() {
            return this.registryBurst;
        }

        /**
         * @return registryPullQPS
         */
        public Long getRegistryPullQPS() {
            return this.registryPullQPS;
        }

        /**
         * @return serializeImagePulls
         */
        public Boolean getSerializeImagePulls() {
            return this.serializeImagePulls;
        }

        /**
         * @return systemReserved
         */
        public java.util.Map < String, ? > getSystemReserved() {
            return this.systemReserved;
        }

        public static final class Builder {
            private String cpuManagerPolicy; 
            private Long eventBurst; 
            private Long eventRecordQPS; 
            private java.util.Map < String, ? > evictionHard; 
            private java.util.Map < String, ? > evictionSoft; 
            private java.util.Map < String, ? > evictionSoftGracePeriod; 
            private Long kubeAPIBurst; 
            private Long kubeAPIQPS; 
            private java.util.Map < String, ? > kubeReserved; 
            private Long registryBurst; 
            private Long registryPullQPS; 
            private Boolean serializeImagePulls; 
            private java.util.Map < String, ? > systemReserved; 

            /**
             * CPU管理器策略。
             */
            public Builder cpuManagerPolicy(String cpuManagerPolicy) {
                this.cpuManagerPolicy = cpuManagerPolicy;
                return this;
            }

            /**
             * 事件记录的个数的突发峰值上限。
             */
            public Builder eventBurst(Long eventBurst) {
                this.eventBurst = eventBurst;
                return this;
            }

            /**
             * 每秒可生成的事件数量。
             */
            public Builder eventRecordQPS(Long eventRecordQPS) {
                this.eventRecordQPS = eventRecordQPS;
                return this;
            }

            /**
             * 触发Pod驱逐操作的一组硬性门限。
             */
            public Builder evictionHard(java.util.Map < String, ? > evictionHard) {
                this.evictionHard = evictionHard;
                return this;
            }

            /**
             * 设置一组驱逐阈值。
             */
            public Builder evictionSoft(java.util.Map < String, ? > evictionSoft) {
                this.evictionSoft = evictionSoft;
                return this;
            }

            /**
             * 设置一组驱逐宽限期。
             */
            public Builder evictionSoftGracePeriod(java.util.Map < String, ? > evictionSoftGracePeriod) {
                this.evictionSoftGracePeriod = evictionSoftGracePeriod;
                return this;
            }

            /**
             * 每秒发送到apiserver的突发请求数量上限。
             */
            public Builder kubeAPIBurst(Long kubeAPIBurst) {
                this.kubeAPIBurst = kubeAPIBurst;
                return this;
            }

            /**
             * 与apiserver通信的每秒查询个数。
             */
            public Builder kubeAPIQPS(Long kubeAPIQPS) {
                this.kubeAPIQPS = kubeAPIQPS;
                return this;
            }

            /**
             * kubernetes系统预留的资源配置。
             */
            public Builder kubeReserved(java.util.Map < String, ? > kubeReserved) {
                this.kubeReserved = kubeReserved;
                return this;
            }

            /**
             * 突发性镜像拉取的个数上限。
             */
            public Builder registryBurst(Long registryBurst) {
                this.registryBurst = registryBurst;
                return this;
            }

            /**
             * 镜像仓库的qps上限。
             */
            public Builder registryPullQPS(Long registryPullQPS) {
                this.registryPullQPS = registryPullQPS;
                return this;
            }

            /**
             * 逐一拉取镜像。
             */
            public Builder serializeImagePulls(Boolean serializeImagePulls) {
                this.serializeImagePulls = serializeImagePulls;
                return this;
            }

            /**
             * 系统预留的资源配置。
             */
            public Builder systemReserved(java.util.Map < String, ? > systemReserved) {
                this.systemReserved = systemReserved;
                return this;
            }

            public KubeletConfiguration build() {
                return new KubeletConfiguration(this);
            } 

        } 

    }
    public static class RolloutPolicy extends TeaModel {
        @NameInMap("max_unavailable")
        private Long maxUnavailable;

        private RolloutPolicy(Builder builder) {
            this.maxUnavailable = builder.maxUnavailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolloutPolicy create() {
            return builder().build();
        }

        /**
         * @return maxUnavailable
         */
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public static final class Builder {
            private Long maxUnavailable; 

            /**
             * 最大不可用节点数。
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            public RolloutPolicy build() {
                return new RolloutPolicy(this);
            } 

        } 

    }
    public static class NodeConfig extends TeaModel {
        @NameInMap("kubelet_configuration")
        private KubeletConfiguration kubeletConfiguration;

        @NameInMap("rollout_policy")
        private RolloutPolicy rolloutPolicy;

        private NodeConfig(Builder builder) {
            this.kubeletConfiguration = builder.kubeletConfiguration;
            this.rolloutPolicy = builder.rolloutPolicy;
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
        public KubeletConfiguration getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

        /**
         * @return rolloutPolicy
         */
        public RolloutPolicy getRolloutPolicy() {
            return this.rolloutPolicy;
        }

        public static final class Builder {
            private KubeletConfiguration kubeletConfiguration; 
            private RolloutPolicy rolloutPolicy; 

            /**
             * kubelet参数配置。
             */
            public Builder kubeletConfiguration(KubeletConfiguration kubeletConfiguration) {
                this.kubeletConfiguration = kubeletConfiguration;
                return this;
            }

            /**
             * 轮转配置。
             */
            public Builder rolloutPolicy(RolloutPolicy rolloutPolicy) {
                this.rolloutPolicy = rolloutPolicy;
                return this;
            }

            public NodeConfig build() {
                return new NodeConfig(this);
            } 

        } 

    }
    public static class NodepoolInfo extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("resource_group_id")
        private String resourceGroupId;

        private NodepoolInfo(Builder builder) {
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
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

        public static final class Builder {
            private String name; 
            private String resourceGroupId; 

            /**
             * 节点池名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 资源组ID。
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public NodepoolInfo build() {
                return new NodepoolInfo(this);
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
             * 抢占式实例规格
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 单台实例上限价格，单位：元/小时。
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
    public static class ScalingGroup extends TeaModel {
        @NameInMap("auto_renew")
        private Boolean autoRenew;

        @NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @NameInMap("compensate_with_on_demand")
        private Boolean compensateWithOnDemand;

        @NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @NameInMap("desired_size")
        private Long desiredSize;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("instance_charge_type")
        private String instanceChargeType;

        @NameInMap("instance_types")
        private java.util.List < String > instanceTypes;

        @NameInMap("internet_charge_type")
        private String internetChargeType;

        @NameInMap("internet_max_bandwidth_out")
        private Long internetMaxBandwidthOut;

        @NameInMap("key_pair")
        private String keyPair;

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
        private String platform;

        @NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @NameInMap("scaling_policy")
        private String scalingPolicy;

        @NameInMap("spot_instance_pools")
        private Long spotInstancePools;

        @NameInMap("spot_instance_remedy")
        private Boolean spotInstanceRemedy;

        @NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("system_disk_category")
        private String systemDiskCategory;

        @NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @NameInMap("system_disk_size")
        private Long systemDiskSize;

        @NameInMap("tags")
        private java.util.List < Tag > tags;

        @NameInMap("vswitch_ids")
        private java.util.List < String > vswitchIds;

        private ScalingGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.dataDisks = builder.dataDisks;
            this.desiredSize = builder.desiredSize;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceTypes = builder.instanceTypes;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.keyPair = builder.keyPair;
            this.loginPassword = builder.loginPassword;
            this.multiAzPolicy = builder.multiAzPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.platform = builder.platform;
            this.rdsInstances = builder.rdsInstances;
            this.scalingPolicy = builder.scalingPolicy;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
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
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
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
        public java.util.List < Tag > getTags() {
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
            private Boolean compensateWithOnDemand; 
            private java.util.List < DataDisk > dataDisks; 
            private Long desiredSize; 
            private String imageId; 
            private String instanceChargeType; 
            private java.util.List < String > instanceTypes; 
            private String internetChargeType; 
            private Long internetMaxBandwidthOut; 
            private String keyPair; 
            private String loginPassword; 
            private String multiAzPolicy; 
            private Long onDemandBaseCapacity; 
            private Long onDemandPercentageAboveBaseCapacity; 
            private Long period; 
            private String periodUnit; 
            private String platform; 
            private java.util.List < String > rdsInstances; 
            private String scalingPolicy; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private java.util.List < SpotPriceLimit> spotPriceLimit; 
            private String spotStrategy; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskSize; 
            private java.util.List < Tag > tags; 
            private java.util.List < String > vswitchIds; 

            /**
             * 节点池节点是启用自动续费
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * 节点池节点自动续费周期
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * 当MultiAZPolicy取值为COST_OPTIMIZED时，如果因价格、库存等原因无法创建足够的抢占式实例，是否允许自动尝试创建按量实例满足ECS实例数量要求。取值范围：true：允许。false：不允许。默认值：true
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * 数据盘配置。
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * 节点池期望节点数
             */
            public Builder desiredSize(Long desiredSize) {
                this.desiredSize = desiredSize;
                return this;
            }

            /**
             * 自定义镜像
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * 节点付费类型。
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * 节点实例规格。
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * 节点公网IP网络计费类型
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * 节点公网IP出带宽最大值，单位为Mbps（Mega bit per second），取值范围：1~100
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * 密钥对名称，和login_password二选一。
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * SSH登录密码，和key_pari二选一。
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * 多可用区伸缩组ECS实例扩缩容策略
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * 伸缩组所需要按量实例个数的最小值，取值范围：0~1000。当按量实例个数少于该值时，将优先创建按量实例。
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * 伸缩组满足最小按量实例数（OnDemandBaseCapacity）要求后，超出的实例中按量实例应占的比例，取值范围：0～100。
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * 包年包月时长
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * 付费周期
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * 操作系统发行版。
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * RDS实例列表。
             */
            public Builder rdsInstances(java.util.List < String > rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * 扩容策略。
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * 指定可用实例规格的个数，伸缩组将按成本最低的多个规格均衡创建抢占式实例。取值范围：1~10。
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * 是否开启补齐抢占式实例。开启后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * 抢占实例价格上限配置
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * 抢占式实例类型
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * 节点系统盘类型。
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * 节点系统盘磁盘性能，只针对ESSD磁盘生效
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * 节点系统盘大小。
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * ECS标签。
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 节点使用的虚拟交换机ID。
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
             * 是否为加密计算节点池。
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
