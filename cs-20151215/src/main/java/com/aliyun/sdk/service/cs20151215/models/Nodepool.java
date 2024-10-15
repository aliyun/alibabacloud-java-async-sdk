// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Nodepool} extends {@link TeaModel}
 *
 * <p>Nodepool</p>
 */
public class Nodepool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.NameInMap("count")
    @Deprecated
    private Long count;

    @com.aliyun.core.annotation.NameInMap("interconnect_config")
    @Deprecated
    private InterconnectConfig interconnectConfig;

    @com.aliyun.core.annotation.NameInMap("interconnect_mode")
    private String interconnectMode;

    @com.aliyun.core.annotation.NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @com.aliyun.core.annotation.NameInMap("management")
    private Management management;

    @com.aliyun.core.annotation.NameInMap("max_nodes")
    private Long maxNodes;

    @com.aliyun.core.annotation.NameInMap("node_config")
    private NodeConfig nodeConfig;

    @com.aliyun.core.annotation.NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @com.aliyun.core.annotation.NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @com.aliyun.core.annotation.NameInMap("tee_config")
    private TeeConfig teeConfig;

    private Nodepool(Builder builder) {
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

    public static Nodepool create() {
        return builder().build();
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

    public static final class Builder {
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

        /**
         * auto_scaling.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * interconnect_config.
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * interconnect_mode.
         */
        public Builder interconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * kubernetes_config.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * management.
         */
        public Builder management(Management management) {
            this.management = management;
            return this;
        }

        /**
         * max_nodes.
         */
        public Builder maxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * node_config.
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * nodepool_info.
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * scaling_group.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * tee_config.
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }

        public Nodepool build() {
            return new Nodepool(this);
        } 

    } 

    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class AutoScaling extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eip_bandwidth")
        @Deprecated
        private Long eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("eip_internet_charge_type")
        @Deprecated
        private String eipInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("enable")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("is_bond_eip")
        @Deprecated
        private Boolean isBondEip;

        @com.aliyun.core.annotation.NameInMap("max_instances")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxInstances;

        @com.aliyun.core.annotation.NameInMap("min_instances")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * eip_bandwidth.
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * eip_internet_charge_type.
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * is_bond_eip.
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * type.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class InterconnectConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bandwidth")
        @Deprecated
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("ccn_id")
        @Deprecated
        private String ccnId;

        @com.aliyun.core.annotation.NameInMap("ccn_region_id")
        @Deprecated
        private String ccnRegionId;

        @com.aliyun.core.annotation.NameInMap("cen_id")
        @Deprecated
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("improved_period")
        @Deprecated
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
             * bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * ccn_id.
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * ccn_region_id.
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * cen_id.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * improved_period.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("runtime_version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("taints")
        private java.util.List < Taint > taints;

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
            private String userData; 

            /**
             * cms_enabled.
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * cpu_policy.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * node_name_mode.
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>docker</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>19.03.5</p>
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * taints.
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * user_data.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class AutoUpgradePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_upgrade_kubelet")
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class UpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_upgrade")
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
             * auto_upgrade.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * max_unavailable.
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * surge.
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * surge_percentage.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
             * auto_repair.
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
             * auto_upgrade.
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * upgrade_config.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resource_group_id.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * type.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * match_criteria.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
             * instance_type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * price_limit.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_renew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

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
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_ids")
        private java.util.List < String > securityGroupIds;

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
            this.ramRoleName = builder.ramRoleName;
            this.rdsInstances = builder.rdsInstances;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
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
            private String ramRoleName; 
            private java.util.List < String > rdsInstances; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
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
             * auto_renew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * auto_renew_period.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * compensate_with_on_demand.
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * data_disks.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * deploymentset_id.
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * desired_size.
             */
            public Builder desiredSize(Long desiredSize) {
                this.desiredSize = desiredSize;
                return this;
            }

            /**
             * image_id.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * image_type.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * internet_charge_type.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * internet_max_bandwidth_out.
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * key_pair.
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
             * login_password.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * multi_az_policy.
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * on_demand_base_capacity.
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * on_demand_percentage_above_base_capacity.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * period.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * period_unit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * private_pool_options.
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * ram_role_name.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * rds_instances.
             */
            public Builder rdsInstances(java.util.List < String > rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * scaling_policy.
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * security_group_id.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * security_group_ids.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * spot_instance_pools.
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * spot_instance_remedy.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * spot_price_limit.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * spot_strategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * system_disk_bursting_enabled.
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
             * system_disk_category.
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
             * system_disk_performance_level.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * system_disk_provisioned_iops.
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * system_disk_size.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link Nodepool} extends {@link TeaModel}
     *
     * <p>Nodepool</p>
     */
    public static class TeeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tee_enable")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
