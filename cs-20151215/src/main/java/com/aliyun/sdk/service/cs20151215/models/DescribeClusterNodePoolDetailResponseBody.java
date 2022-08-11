// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNodePoolDetailResponseBody</p>
 */
public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
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

    @NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @NameInMap("status")
    private Status status;

    @NameInMap("tee_config")
    private TeeConfig teeConfig;

    private DescribeClusterNodePoolDetailResponseBody(Builder builder) {
        this.autoScaling = builder.autoScaling;
        this.interconnectConfig = builder.interconnectConfig;
        this.interconnectMode = builder.interconnectMode;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.management = builder.management;
        this.maxNodes = builder.maxNodes;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.status = builder.status;
        this.teeConfig = builder.teeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodePoolDetailResponseBody create() {
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
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private Status status; 
        private TeeConfig teeConfig; 

        /**
         * 节点池自动伸缩信息。
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * 边缘节点池网络相关的配置。该值只对edge类型的节点池有意义
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * 边缘节点池的网络类型。basic：基础型；improved：增强型。该值只对edge类型的节点池有意义
         */
        public Builder interconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * 节点池所属集群配置。
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * 托管版节点池配置。
         */
        public Builder management(Management management) {
            this.management = management;
            return this;
        }

        /**
         * 边缘节点池允许容纳的最大节点数量. 节点池内可以容纳的最大节点数量，该参数大于等于0。0表示无额外限制(仅受限于集群整体可以容纳的节点数，节点池本身无额外限制)。边缘节点池该参数值往往大于0；ess类型节点池和默认的edge类型节点池该参数值为0
         */
        public Builder maxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * 节点池详情。
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * 节点池扩容组信息。
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * 节点池状态。
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * 加密计算节点池信息。
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }

        public DescribeClusterNodePoolDetailResponseBody build() {
            return new DescribeClusterNodePoolDetailResponseBody(this);
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
             * EIP带宽峰值。
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * EIP实例付费类型。
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * 是否启用自动伸缩。
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
             * 扩容组类型
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
             * 边缘增强型节点池的网络带宽，单位M
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * 边缘增强型节点池绑定的云连接网实例ID(CCNID)
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * 边缘增强型节点池绑定的云连接网实例所属的区域
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * 边缘增强型节点池绑定的云企业网实例ID(CENID)
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * 边缘增强型节点池的购买时长，单位月
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
             * 是否开启云监控
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * CPU管理策略
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
             * 自定义节点名称
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * 容器运行时
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
             * 节点自定义数据
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
             * 自动修复。
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * 是否开启托管版节点池。
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
             * 节点池创建时间。
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * 是否为默认节点池。
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * 节点池名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 节点池ID。
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * 节点池所属地域ID。
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 节点池所属资源组ID。
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 节点池类型。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 节点池更新时间。
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
             * 抢占式实例规格。
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
             * 节点是否开启自动续费。
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * 节点自动续费周期。
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
             * 部署集ID。
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
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
             * 自定义镜像ID。
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
             * 节点ECS规格类型。
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
             * 密钥对名称
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * 登录密码
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
             * 节点包年包月时长。
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * 节点付费周期。
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * 操作系统发行版。取值： CentOS，AliyunLinux，Windows，WindowsCore。
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * 节点RAM 角色名称。
             */
            public Builder ramPolicy(String ramPolicy) {
                this.ramPolicy = ramPolicy;
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
             * 扩容组ID。
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
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
             * 节点所属安全组ID。
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 节点池所属安全组ID列表。
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
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
             * 抢占式实例价格上限配置。
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
             * 系统盘类型
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
             * 系统盘大小
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * ECS标签
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 虚拟交换机ID。
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
             * 失败节点数。
             */
            public Builder failedNodes(Long failedNodes) {
                this.failedNodes = failedNodes;
                return this;
            }

            /**
             * 处于健康状态节点数。
             */
            public Builder healthyNodes(Long healthyNodes) {
                this.healthyNodes = healthyNodes;
                return this;
            }

            /**
             * 正在初始化节点数。
             */
            public Builder initialNodes(Long initialNodes) {
                this.initialNodes = initialNodes;
                return this;
            }

            /**
             * 离线节点数量。
             */
            public Builder offlineNodes(Long offlineNodes) {
                this.offlineNodes = offlineNodes;
                return this;
            }

            /**
             * 正在被移除节点数。
             */
            public Builder removingNodes(Long removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * 工作节点数量。
             */
            public Builder servingNodes(Long servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * 节点池状态。
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * 总节点数。
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
