// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodePoolsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNodePoolsResponseBody</p>
 */
public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    @NameInMap("nodepools")
    private java.util.List < Nodepools> nodepools;

    private DescribeClusterNodePoolsResponseBody(Builder builder) {
        this.nodepools = builder.nodepools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodePoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodepools
     */
    public java.util.List < Nodepools> getNodepools() {
        return this.nodepools;
    }

    public static final class Builder {
        private java.util.List < Nodepools> nodepools; 

        /**
         * The list of the returned node pools.
         */
        public Builder nodepools(java.util.List < Nodepools> nodepools) {
            this.nodepools = nodepools;
            return this;
        }

        public DescribeClusterNodePoolsResponseBody build() {
            return new DescribeClusterNodePoolsResponseBody(this);
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
             * The peak bandwidth of the elastic IP address (EIP).
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * The billing method of the EIP. Valid values:
             * <p>
             * 
             * *   `PayByBandwidth`: pay-by-bandwidth
             * *   `PayByTraffic`: pay-by-data-transfer
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * Indicates whether auto scaling is enabled.
             * <p>
             * 
             * *   `true`: Auto scaling is enabled for the node pool.
             * *   `false`: Auto scaling is disabled for the node pool. If you set this parameter to `false`, other parameters in the `auto_scaling` section does not take effect.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Indicates whether an EIP is associated with the node pool. Valid values:
             * <p>
             * 
             * *   `true`: An EIP is associated with the node pool.
             * *   `false`: No EIP is associated with the node pool.
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * The maximum number of Elastic Compute Service (ECS) instances supported by the node pool.
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * The minimum number of ECS instances.
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * The minimum number of ECS instances that must be kept in the node pool. Valid values:
             * <p>
             * 
             * *   `cpu`: regular instance
             * *   `gpu`: GPU-accelerated instance
             * *   `gpushare`: shared GPU-accelerated instance
             * *   `spot`: preemptible instance
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
             * Indicates where the CloudMonitor agent is installed on ECS nodes of the cluster. After the CloudMonitor agent is installed, you can view monitoring information about the ECS instances in the CloudMonitor console. Installation is recommended. Valid values:
             * <p>
             * 
             * *   `true` The CloudMonitor agent is installed on ECS nodes.
             * *   `false`: The CloudMonitor agent is not installed on ECS nodes.
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * The CPU management policy. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.
             * <p>
             * 
             * *   `static`: This policy allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.
             * *   `none`: indicates that the default CPU affinity is used.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * The labels of the nodes. You can add labels to the nodes in the cluster. You must add labels based on the following rules:
             * <p>
             * 
             * *   Each label is a case-sensitive key-value pair. You can add up to 20 labels.
             * *   A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with `aliyun`, `acs:`, `https://`, or `http://`. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
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
             * The name of the container runtime.
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
             * The taints that are added to nodes. Taints are added to nodes to prevent pods from being scheduled to inappropriate nodes. However, toleration rules allow pods to be scheduled to nodes with matching taints. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * The user-defined data of the node pool. For more information, see [Generate user-defined data](~~49121~~).
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
             * Indicates whether auto upgrade is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Auto upgrade is enabled.
             * *   `true`: Auto upgrade is disabled.
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The maximum number of nodes that can be in the unschedulable state. Valid values: 1 to 1000.
             * <p>
             * 
             * Default value: 1
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * The number of nodes that are temporarily added to the node pool during an auto upgrade.
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * The percentage of temporary nodes to the nodes in the node pool. You must set this parameter or `surge`.
             * <p>
             * 
             * The number of extra nodes = The percentage of extra nodes × The number of nodes in the node pool. For example, the percentage of extra nodes is set to 50% and the number of nodes in the node pool is six. The number of extra nodes will be three.
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
             * Indicates whether auto repair is enabled. Auto repair is enabled only when `enable=true` is specified.
             * <p>
             * 
             * *   `true`: Auto repair is enabled.
             * *   `false`: Auto repair is disabled.
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * Indicates whether managed node pools are enabled. Valid values:
             * <p>
             * 
             * *   `true`: Managed node pools are enabled.
             * *   `false`: Managed node pools are disabled. Other parameters in this section take effect only when `enable=true` is specified.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The configurations of auto upgrade. The configurations take effect only when `enable=true` is specified.
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
        @NameInMap("created")
        private String created;

        @NameInMap("is_default")
        private Boolean isDefault;

        @NameInMap("name")
        private String name;

        @NameInMap("nodepool_id")
        private String nodepoolId;

        @NameInMap("region_id")
        private String regionId;

        @NameInMap("resource_group_id")
        private String resourceGroupId;

        @NameInMap("type")
        private String type;

        @NameInMap("updated")
        private String updated;

        private NodepoolInfo(Builder builder) {
            this.created = builder.created;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.nodepoolId = builder.nodepoolId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodepoolInfo create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String created; 
            private Boolean isDefault; 
            private String name; 
            private String nodepoolId; 
            private String regionId; 
            private String resourceGroupId; 
            private String type; 
            private String updated; 

            /**
             * The time when the node pool was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Indicates whether the node pool is a default node pool. An ACK cluster usually has only one default node pool. Valid values:
             * <p>
             * 
             * *   `true`: The node pool is a default node pool.
             * *   `false`: The node pool is not a default node pool.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the node pool.
             * <p>
             * 
             * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the node pool.
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * The ID of the region where the node pool is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * The type of the node pool. Valid values:
             * <p>
             * 
             * *   `edge`: edge node pools.
             * *   `ess`: cloud node pools.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the node pool was last updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
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
             * The instance type for preemptible instances.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The price limit of a preemptible instance. Unit: USD/hour.
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

        @NameInMap("deploymentset_id")
        private String deploymentsetId;

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

        @NameInMap("private_pool_options")
        private PrivatePoolOptions privatePoolOptions;

        @NameInMap("ram_policy")
        private String ramPolicy;

        @NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @NameInMap("scaling_group_id")
        private String scalingGroupId;

        @NameInMap("scaling_policy")
        private String scalingPolicy;

        @NameInMap("security_group_id")
        private String securityGroupId;

        @NameInMap("security_group_ids")
        private java.util.List < String > securityGroupIds;

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
            this.deploymentsetId = builder.deploymentsetId;
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
            this.privatePoolOptions = builder.privatePoolOptions;
            this.ramPolicy = builder.ramPolicy;
            this.rdsInstances = builder.rdsInstances;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
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
         * @return privatePoolOptions
         */
        public PrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        /**
         * @return ramPolicy
         */
        public String getRamPolicy() {
            return this.ramPolicy;
        }

        /**
         * @return rdsInstances
         */
        public java.util.List < String > getRdsInstances() {
            return this.rdsInstances;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
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
            private String deploymentsetId; 
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
            private PrivatePoolOptions privatePoolOptions; 
            private String ramPolicy; 
            private java.util.List < String > rdsInstances; 
            private String scalingGroupId; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
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
             * Indicates whether auto-renewal is enabled for the nodes in the node pool. This parameter takes effect only when `instance_charge_type` is set to `PrePaid`. Valid values:
             * <p>
             * 
             * *   `true`: Auto-renewal is enabled.
             * *   `false`: Auto-renewal is disabled.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The duration of the auto-renewal. This parameter takes effect and is required only when `instance_charge_type` is set to `PrePaid`.
             * <p>
             * 
             * If `PeriodUnit=Month` is specified, the valid values are 1, 2, 3, 6, and 12.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * Indicates whether pay-as-you-go instances are automatically created to meet the required number of ECS instances when the preemptible instances cannot be created due to reasons such as the cost or inventory availability. This parameter takes effect when `multi_az_policy` is set to `COST_OPTIMIZED`. Valid values:
             * <p>
             * 
             * *   `true`: Pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created.
             * *   `false`: Pay-as-you-go instances are not created to meet the required number of ECS instances if preemptible instances cannot be created.
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * The configurations of the data disks attached to the nodes in the node pool. The configurations include the disk type and disk size.
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
             * The ID of the custom image. You can call `DescribeKubernetesVersionMetadata` to query the images supported by ACK.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The billing method of the nodes in the node pool. Valid values:
             * <p>
             * 
             * *   `PrePaid`: subscription
             * *   `PostPaid`: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance types of the nodes in the node pool.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The billing method of the public IP address of the node.
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
             * You must set `key_pair` if the node pool is a managed node pool.
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * The password for SSH logon. You must set this parameter or the `key_pair` parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
             * <p>
             * 
             * For security purposes, the returned password is encrypted.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * The ECS instance scaling policy for a multi-zone scaling group. Valid values:
             * <p>
             * 
             * *   `PRIORITY`: the scaling group is scaled based on the VSwitchIds.N parameter. When an ECS instance cannot be created in the zone where the vSwitch with the highest priority resides, the system uses the vSwitch with the next highest priority to create the ECS instance.
             * 
             * *   `COST_OPTIMIZED`: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferentially created when multiple instance types are specified in the scaling configurations. You can set the `CompensateWithOnDemand` parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.
             * 
             *     **
             * 
             *     **Note** `COST_OPTIMIZED` is valid only when multiple instance types are specified or at least one preemptible instance type is specified.
             * 
             * *   `BALANCE`: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call `RebalanceInstances` of Auto Scaling (ESS) to balance the instance distribution among zones. For more information, see [RebalanceInstances](~~71516~~).
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. When the number of pay-as-you-go instances is lower than this value, pay-as-you-go instances are preferentially created to meet the required number.
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
             * The subscription duration of worker nodes. This parameter takes effect and is required only when `instance_charge_type` is set to `PrePaid`.
             * <p>
             * 
             * If `PeriodUnit=Month` is specified, the valid values are 1, 2, 3, 6, 12, 24, 36, 48, and 60.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of the nodes. This parameter takes effect only when `instance_charge_type` is set to `PrePaid`.
             * <p>
             * 
             * Valid value: `Month`
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
             * The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.
             */
            public Builder ramPolicy(String ramPolicy) {
                this.ramPolicy = ramPolicy;
                return this;
            }

            /**
             * The IDs of the ApsaraDB RDS instances.
             */
            public Builder rdsInstances(java.util.List < String > rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The scaling mode of the scaling group. Valid values:
             * <p>
             * 
             * *   `release`: the standard mode. ECS instances are created and released based on the resource usage.
             * *   `recycle`: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances attached with local disks.
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The ID of the security group to which the node pool is added. If the node pool is added to multiple security groups, the first ID in the value of `security_group_ids` is returned.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The IDs of the security groups to which the node pool is added.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The number of available instance types. The scaling group creates preemptible instances of multiple instance types at the lowest cost. Valid values: 1 to 10.
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Indicates whether preemptible instances are supplemented when the number of preemptible instances drops below the specified minimum number. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values:
             * <p>
             * 
             * *   `true`: Supplement to preemptible instances is enabled.
             * *   `false`: Supplement to preemptible instances is disabled.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * The bid configurations of preemptible instances.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bidding policy of preemptible instances. Valid values:
             * <p>
             * 
             * *   NoSpot: non-preemptible instance.
             * *   SpotWithPriceLimit: specifies the highest bid for the preemptible instance.
             * *   SpotAsPriceGo: automatically submits bids based on the up-to-date market price.
             * 
             * For more information, see [Preemptible instances](~~157759~~).
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The type of system disk. Valid values:
             * <p>
             * 
             * *   `cloud_efficiency`: ultra disk
             * *   `cloud_ssd`: standard SSD
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
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
             * The system disk size of a worker node. Unit: GiB.
             * <p>
             * 
             * Valid values: 20 to 500
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The labels that are added only to ECS instances.
             * <p>
             * 
             * A key must be unique and cannot exceed 128 characters in length. Neither keys nor values can start with aliyun or acs:. Neither keys nor values can contain https:// or http://.
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The IDs of vSwitches.
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
    public static class Status extends TeaModel {
        @NameInMap("failed_nodes")
        private Long failedNodes;

        @NameInMap("healthy_nodes")
        private Long healthyNodes;

        @NameInMap("initial_nodes")
        private Long initialNodes;

        @NameInMap("offline_nodes")
        private Long offlineNodes;

        @NameInMap("removing_nodes")
        private Long removingNodes;

        @NameInMap("serving_nodes")
        private Long servingNodes;

        @NameInMap("state")
        private String state;

        @NameInMap("total_nodes")
        private Long totalNodes;

        private Status(Builder builder) {
            this.failedNodes = builder.failedNodes;
            this.healthyNodes = builder.healthyNodes;
            this.initialNodes = builder.initialNodes;
            this.offlineNodes = builder.offlineNodes;
            this.removingNodes = builder.removingNodes;
            this.servingNodes = builder.servingNodes;
            this.state = builder.state;
            this.totalNodes = builder.totalNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return failedNodes
         */
        public Long getFailedNodes() {
            return this.failedNodes;
        }

        /**
         * @return healthyNodes
         */
        public Long getHealthyNodes() {
            return this.healthyNodes;
        }

        /**
         * @return initialNodes
         */
        public Long getInitialNodes() {
            return this.initialNodes;
        }

        /**
         * @return offlineNodes
         */
        public Long getOfflineNodes() {
            return this.offlineNodes;
        }

        /**
         * @return removingNodes
         */
        public Long getRemovingNodes() {
            return this.removingNodes;
        }

        /**
         * @return servingNodes
         */
        public Long getServingNodes() {
            return this.servingNodes;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalNodes
         */
        public Long getTotalNodes() {
            return this.totalNodes;
        }

        public static final class Builder {
            private Long failedNodes; 
            private Long healthyNodes; 
            private Long initialNodes; 
            private Long offlineNodes; 
            private Long removingNodes; 
            private Long servingNodes; 
            private String state; 
            private Long totalNodes; 

            /**
             * The number of failed nodes.
             */
            public Builder failedNodes(Long failedNodes) {
                this.failedNodes = failedNodes;
                return this;
            }

            /**
             * The number of healthy nodes.
             */
            public Builder healthyNodes(Long healthyNodes) {
                this.healthyNodes = healthyNodes;
                return this;
            }

            /**
             * The number of nodes that are being created.
             */
            public Builder initialNodes(Long initialNodes) {
                this.initialNodes = initialNodes;
                return this;
            }

            /**
             * The number of offline nodes.
             */
            public Builder offlineNodes(Long offlineNodes) {
                this.offlineNodes = offlineNodes;
                return this;
            }

            /**
             * The number of nodes that are being removed.
             */
            public Builder removingNodes(Long removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * The number of running nodes.
             */
            public Builder servingNodes(Long servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * The status of the node pool. Valid values:
             * <p>
             * 
             * *   `active`: The node pool is active.
             * *   `scaling`: The node pool is being scaled.
             * *   `removing`: Nodes are being removed from the node pool.
             * *   `deleting`: The node pool is being deleted.
             * *   `updating`: The node pool is being updated.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of nodes in the node pool.
             */
            public Builder totalNodes(Long totalNodes) {
                this.totalNodes = totalNodes;
                return this;
            }

            public Status build() {
                return new Status(this);
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
             * Indicates whether confidential computing is enabled. Valid values:
             * <p>
             * 
             * *   `true`: confidential computing is enabled.
             * *   `false`: confidential computing is disabled.
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
    public static class Nodepools extends TeaModel {
        @NameInMap("auto_scaling")
        private AutoScaling autoScaling;

        @NameInMap("interconnect_config")
        private InterconnectConfig interconnectConfig;

        @NameInMap("interconnect_mode")
        private String interconnectMode;

        @NameInMap("kubernetes_config")
        private KubernetesConfig kubernetesConfig;

        @NameInMap("management")
        private Management management;

        @NameInMap("max_nodes")
        private Long maxNodes;

        @NameInMap("node_config")
        private NodeConfig nodeConfig;

        @NameInMap("nodepool_info")
        private NodepoolInfo nodepoolInfo;

        @NameInMap("scaling_group")
        private ScalingGroup scalingGroup;

        @NameInMap("status")
        private Status status;

        @NameInMap("tee_config")
        private TeeConfig teeConfig;

        private Nodepools(Builder builder) {
            this.autoScaling = builder.autoScaling;
            this.interconnectConfig = builder.interconnectConfig;
            this.interconnectMode = builder.interconnectMode;
            this.kubernetesConfig = builder.kubernetesConfig;
            this.management = builder.management;
            this.maxNodes = builder.maxNodes;
            this.nodeConfig = builder.nodeConfig;
            this.nodepoolInfo = builder.nodepoolInfo;
            this.scalingGroup = builder.scalingGroup;
            this.status = builder.status;
            this.teeConfig = builder.teeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodepools create() {
            return builder().build();
        }

        /**
         * @return autoScaling
         */
        public AutoScaling getAutoScaling() {
            return this.autoScaling;
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
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return teeConfig
         */
        public TeeConfig getTeeConfig() {
            return this.teeConfig;
        }

        public static final class Builder {
            private AutoScaling autoScaling; 
            private InterconnectConfig interconnectConfig; 
            private String interconnectMode; 
            private KubernetesConfig kubernetesConfig; 
            private Management management; 
            private Long maxNodes; 
            private NodeConfig nodeConfig; 
            private NodepoolInfo nodepoolInfo; 
            private ScalingGroup scalingGroup; 
            private Status status; 
            private TeeConfig teeConfig; 

            /**
             * The configurations of auto scaling.
             */
            public Builder autoScaling(AutoScaling autoScaling) {
                this.autoScaling = autoScaling;
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
             * The configurations of the cluster.
             */
            public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
                this.kubernetesConfig = kubernetesConfig;
                return this;
            }

            /**
             * The configurations of managed node pools. Managed node pools are available only in professional managed Kubernetes clusters.
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
             * The information about the node pool.
             */
            public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
                this.nodepoolInfo = nodepoolInfo;
                return this;
            }

            /**
             * The configurations of the scaling group.
             */
            public Builder scalingGroup(ScalingGroup scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            /**
             * The status details about the node pool.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * The configurations of confidential computing.
             */
            public Builder teeConfig(TeeConfig teeConfig) {
                this.teeConfig = teeConfig;
                return this;
            }

            public Nodepools build() {
                return new Nodepools(this);
            } 

        } 

    }
}
