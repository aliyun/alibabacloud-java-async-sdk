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

    @NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @NameInMap("status")
    private Status status;

    @NameInMap("tee_config")
    private TeeConfig teeConfig;

    @NameInMap("management")
    private Management management;

    @NameInMap("interconnect_config")
    private InterconnectConfig interconnectConfig;

    @NameInMap("interconnect_mode")
    private String interconnectMode;

    @NameInMap("max_nodes")
    private Long maxNodes;

    private DescribeClusterNodePoolDetailResponseBody(Builder builder) {
        this.autoScaling = builder.autoScaling;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.status = builder.status;
        this.teeConfig = builder.teeConfig;
        this.management = builder.management;
        this.interconnectConfig = builder.interconnectConfig;
        this.interconnectMode = builder.interconnectMode;
        this.maxNodes = builder.maxNodes;
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
     * @return kubernetesConfig
     */
    public KubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
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

    /**
     * @return management
     */
    public Management getManagement() {
        return this.management;
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
     * @return maxNodes
     */
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public static final class Builder {
        private AutoScaling autoScaling; 
        private KubernetesConfig kubernetesConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private Status status; 
        private TeeConfig teeConfig; 
        private Management management; 
        private InterconnectConfig interconnectConfig; 
        private String interconnectMode; 
        private Long maxNodes; 

        /**
         * Configure the auto scaling node pool.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * Cluster-Related configurations.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * Configure the node pool.
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * Configure the scaling group.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * Node pool status configuration.
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Configure the cluster in the encrypted computing section.
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }

        /**
         * The configuration of the managed node pool.
         */
        public Builder management(Management management) {
            this.management = management;
            return this;
        }

        /**
         * The network configurations of the edge node pool. This value only applies to edge node pools.
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * The network type of the edge node pool. basic: basic; improved: enhanced. This value only applies to edge node pools.
         */
        public Builder interconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * The maximum number of nodes in the edge node pool. The maximum number of nodes in the node pool. This parameter is greater than or equal to 0. 0 indicates that there is no additional limit (only limited by the number of nodes that the cluster can accommodate, and the node pool itself has no additional limit). The parameter value of the edge node pool is usually greater than 0. The parameter value of the ess node pool and the default edge node pool is 0.
         */
        public Builder maxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
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
             * The peak bandwidth of the EIP.
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * The billing method of the EIP. Valid values:
             * <p>
             * 
             * -"PayByBandwidth": pay-by-bandwidth.
             * -"PayByTraffic": pay by traffic.
             * 
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * Specifies whether to enable auto scaling.
             * <p>
             * 
             * -"true": enables auto scaling for the node pool.
             * -"false": auto scaling is disabled. If the value is false, other configuration parameters in "auto_scaling "do not take effect.
             * 
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Specifies whether to bind an EIP. Valid values:
             * <p>
             * 
             * -"true": bind an EIP.
             * -"false": does not bind an EIP.
             * 
             * 
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * The maximum number of instances.
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * The minimum number of instances.
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * The auto scaling type, which is divided by auto scaling instance type. Valid values:
             * <p>
             * 
             * -"cpu": normal instance type.
             * -"gpu":GPU instance type.
             * -"gpushare": shared GPU type.
             * -"spot": preemptible instance type.
             * 
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

        @NameInMap("node_name_mode")
        private String nodeNameMode;

        private KubernetesConfig(Builder builder) {
            this.cmsEnabled = builder.cmsEnabled;
            this.cpuPolicy = builder.cpuPolicy;
            this.labels = builder.labels;
            this.runtime = builder.runtime;
            this.runtimeVersion = builder.runtimeVersion;
            this.taints = builder.taints;
            this.userData = builder.userData;
            this.nodeNameMode = builder.nodeNameMode;
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

        /**
         * @return nodeNameMode
         */
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public static final class Builder {
            private Boolean cmsEnabled; 
            private String cpuPolicy; 
            private java.util.List < Tag > labels; 
            private String runtime; 
            private String runtimeVersion; 
            private java.util.List < Taint > taints; 
            private String userData; 
            private String nodeNameMode; 

            /**
             * Whether to install cloudmonitor on the ECS node. After installation, you can view the monitoring information of the created ECS instance in the cloudmonitor console. We recommend that you enable cloudmonitor. Valid values:
             * <p>
             * 
             * -"true": install cloudmonitor on ECS nodes.
             * -"false": Do not install cloudmonitor on ECS nodes.
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * The CPU management policy of the node. When the cluster version is 1.12.6 or later, the following two policies are supported:
             * <p>
             * 
             * -"static": allows you to enhance CPU affinity and exclusiveness for pods with certain resource characteristics on nodes.
             * -"none": indicates that the existing default CPU affinity solution is enabled.
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * The label of the Kubernetes cluster node. Tag definition rules:
             * <p>
             * 
             * -A tag consists of case-sensitive key-value pairs. You can set up to 20 tags.
             * -The tag key cannot be repeated. It can be up to 64 characters in length. The tag value can be empty and can be up to 128 characters in length. The tag key and tag value cannot start with "aliyun", "acs:", "https://", or "http. For more information, see [Labels and Selectors](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set).
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
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
             * The runtime version of the container.
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * The taint information of the node. Taints and tolerance (Toleration) work together to prevent pods from being assigned to inappropriate nodes. For more information, see [taint-and-toleration](https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/).
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * The custom data of the node pool. For more information, see [generate instance Custom Data](~~ 49121 ~~).
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The node name consists of three parts: Prefix + node IP address substring + suffix:
             * <p>
             * 
             * -The prefix and suffix can be composed of one or more parts separated by ".". Each part can contain lowercase letters, numbers, and hyphens (-). The node name must start and end with lowercase letters and numbers;
             * -The length of the CIDR block refers to the number of digits at the end of the IP address of the truncated node. Valid values: 5 to 12.
             * 
             * For example, if the IP address of the node is 192.168.0.55, the prefix is aliyun.com, the CIDR block length is 5, and the suffix is test, the node name is aliyun.com00055test
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            public KubernetesConfig build() {
                return new KubernetesConfig(this);
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
             * Indicates whether the node pool is the default node pool. Generally, a cluster has only one default node pool. Valid values:
             * <p>
             * "true": the default node pool.
             * "false": the default node pool is not set.
             * 
             * 
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the node pool.
             * <p>
             * 
             * Naming rule: the name must be 1 to 63 characters in length and cannot start with a hyphen (-). It must be 1 to 63 characters in length.
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
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the node pool.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the node pool was updated.
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
             * The type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The market price of a single instance. Unit: yuan/hour.
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

        @NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("instance_charge_type")
        private String instanceChargeType;

        @NameInMap("instance_types")
        private java.util.List < String > instanceTypes;

        @NameInMap("multi_az_policy")
        private String multiAzPolicy;

        @NameInMap("on_demand_base_capacity")
        private Long onDemandBaseCapacity;

        @NameInMap("on_demand_percentage_above_base_capacity")
        private Long onDemandPercentageAboveBaseCapacity;

        @NameInMap("spot_instance_pools")
        private Long spotInstancePools;

        @NameInMap("spot_instance_remedy")
        private Boolean spotInstanceRemedy;

        @NameInMap("compensate_with_on_demand")
        private Boolean compensateWithOnDemand;

        @NameInMap("period")
        private Long period;

        @NameInMap("period_unit")
        private String periodUnit;

        @NameInMap("platform")
        private String platform;

        @NameInMap("ram_policy")
        private String ramPolicy;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

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

        @NameInMap("system_disk_category")
        private String systemDiskCategory;

        @NameInMap("system_disk_size")
        private Long systemDiskSize;

        @NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @NameInMap("tags")
        private java.util.List < Tag > tags;

        @NameInMap("vswitch_ids")
        private java.util.List < String > vswitchIds;

        @NameInMap("login_password")
        private String loginPassword;

        @NameInMap("key_pair")
        private String keyPair;

        @NameInMap("internet_charge_type")
        private String internetChargeType;

        @NameInMap("internet_max_bandwidth_out")
        private Long internetMaxBandwidthOut;

        @NameInMap("deploymentset_id")
        private String deploymentsetId;

        @NameInMap("desired_size")
        private Long desiredSize;

        private ScalingGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.dataDisks = builder.dataDisks;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceTypes = builder.instanceTypes;
            this.multiAzPolicy = builder.multiAzPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.platform = builder.platform;
            this.ramPolicy = builder.ramPolicy;
            this.spotStrategy = builder.spotStrategy;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.rdsInstances = builder.rdsInstances;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.tags = builder.tags;
            this.vswitchIds = builder.vswitchIds;
            this.loginPassword = builder.loginPassword;
            this.keyPair = builder.keyPair;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.deploymentsetId = builder.deploymentsetId;
            this.desiredSize = builder.desiredSize;
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
         * @return dataDisks
         */
        public java.util.List < DataDisk > getDataDisks() {
            return this.dataDisks;
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
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
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
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return spotPriceLimit
         */
        public java.util.List < SpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
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
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
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

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return keyPair
         */
        public String getKeyPair() {
            return this.keyPair;
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

        public static final class Builder {
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private java.util.List < DataDisk > dataDisks; 
            private String imageId; 
            private String instanceChargeType; 
            private java.util.List < String > instanceTypes; 
            private String multiAzPolicy; 
            private Long onDemandBaseCapacity; 
            private Long onDemandPercentageAboveBaseCapacity; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Boolean compensateWithOnDemand; 
            private Long period; 
            private String periodUnit; 
            private String platform; 
            private String ramPolicy; 
            private String spotStrategy; 
            private java.util.List < SpotPriceLimit> spotPriceLimit; 
            private java.util.List < String > rdsInstances; 
            private String scalingGroupId; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 
            private String systemDiskPerformanceLevel; 
            private java.util.List < Tag > tags; 
            private java.util.List < String > vswitchIds; 
            private String loginPassword; 
            private String keyPair; 
            private String internetChargeType; 
            private Long internetMaxBandwidthOut; 
            private String deploymentsetId; 
            private Long desiredSize; 

            /**
             * Specifies whether to enable automatic renewal for the node. This parameter takes effect only when the instance_charge_type parameter is set to prepaid". Valid values:
             * <p>
             * 
             * -"true": auto renewal.
             * -"false": does not automatically renew the instance.
             * 
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The automatic renewal cycle of the node. This parameter takes effect only when "instance_charge_type" is set to "PrePaid" and is required.
             * <p>
             * 
             * If "PeriodUnit = Month", the value range is {1, 2, 3, 6, 12}.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * The combination of the data disk type and size of the node.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the custom image. You can use "DescribeKubernetesVersionMetadata" to query the images that are supported by the system.
             * <p>
             * 
             * 
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The billing method of the node pool. Valid values:
             * <p>
             * 
             * -"PrePaid": subscription.
             * -"PostPaid": pay-as-you-go.
             * 
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance type list. You can select multiple instance types as an alternative. When you create a node, you will try to purchase the instance from the first instance type until it is created. The instance type may vary depending on the inventory.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The scaling policy for ECS instances in a multi-zone scaling group. Valid values:
             * <p>
             * 
             * -"PRIORITY": scale in the vSwitch (VSwitchIds.N) based on your definition. When an ECS instance cannot be created in the zone where the vSwitch with a higher priority is located, the ECS instance is automatically created using the vSwitch with the next priority.
             * 
             * -"Cost_optimized ": attempts to create a vCPU instance from low to high. When multiple instance types with preemptible billing method are configured for the scaling configuration, the corresponding preemptible instance is created first. You can use the "CompensateWithOnDemand" parameter to specify whether to automatically create a preemptible instance on a pay-as-you-go basis when the preemptible instance cannot be created due to inventory or other reasons.
             * 
             * > "cost_optimized "takes effect only when the scaling configuration has multiple instance types or preemptible instances are selected.
             * 
             * -"BALANCE": evenly allocate ECS instances among multiple zones specified by the scaling group. If the zones become unbalanced due to insufficient inventory, you can balance resources by API RebalanceInstances. For more information, see [RebalanceInstances](~~ 71516 ~~).
             * 
             * Default value: "PRIORITY ".
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances required by the scaling group. Valid values:[0,1000]. If the number of pay-as-you-go instances is less than this value, pay-as-you-go instances are created first.
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * The proportion of pay-as-you-go instances in the scaling group that meet the minimum number of pay-as-you-go instances ("on_demand_base_capacity "). Valid values: 0 to 100.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * The number of available instance types. The scaling group creates preemptible instances based on the lowest cost instance types. Valid values: 1 to 10.
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Specifies whether to enable preemptible instances. After this feature is enabled, when a system message is received that a preemptible instance will be reclaimed, the scaling group attempts to create a new instance and replaces the instance that will be reclaimed. Valid values:
             * <p>
             * 
             * -"true": enable preemptible instances.
             * -"false": does not enable preemptible instances.
             * 
             * 
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * If the value of "multi_az_policy" is "cost_optimized "and sufficient preemptible instances cannot be created due to price or inventory, whether to automatically create pay-as-you-go instances to meet the number of ECS instances. Valid values:
             * <p>
             * 
             * -"true": Allows you to automatically create pay-as-you-go instances to meet the number of ECS instances.
             * -"false": you cannot automatically create pay-as-you-go instances to meet the number of ECS instances.
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * The subscription duration of the node. This parameter is required only when the instance_charge_type parameter is set to prepaid.
             * <p>
             * 
             * If "PeriodUnit = Month", the value range is {1, 2 , 3, 6, 12, 24, 36, 48, 60}.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of the node. If the value of "instance_charge_type" is "PrePaid", you must specify the cycle.
             * <p>
             * 
             * "Month": Currently, only months are supported.
             * 
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The operating system release. Valid values:
             * <p>
             * 
             * -"CentOS"
             * -"AliyunLinux"
             * -"Windows"
             * -"WindowsCore"
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Worker RAM role name to authorize the ECS instance to be a cluster Woker node.
             */
            public Builder ramPolicy(String ramPolicy) {
                this.ramPolicy = ramPolicy;
                return this;
            }

            /**
             * The type of the preemptible instance. Valid values:
             * <p>
             * -NoSpot: a non-preemptible instance.
             * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
             * -SpotAsPriceGo: The system automatically bids based on the actual market price.
             * 
             * For more information, see [preemptible instances](~~ 157759 ~~).
             * 
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The price range of the preemptible instance.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * If the RDS instance list is specified, the cluster node ECS is automatically added to the RDS whitelist.
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
             * The scaling group mode. Valid values:
             * <p>
             * 
             * -"release": in standard mode, ECS instances are created and released based on the usage of the requested resource values.
             * -"recycle": indicates the fast mode. You can create, stop, and start scaling to increase the speed of re-scaling (no fees are charged for computing resources when stopped, and only storage fees are charged, except for local disks).
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The ID of the security group of the node pool. When multiple security groups are bound to the node pool, the ID is the first value in the "security_group_ids.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The system disk type of the node. Valid values:
             * <p>
             * 
             * -"Cloud_efficiency ": Ultra disk.
             * -"Cloud_ssd ":SSD cloud disk.
             * 
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The system disk size of the node. Unit: GiB.
             * <p>
             * 
             * Valid values:[20,500].
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The system disk performance of the node. This parameter takes effect only for ESSD disks.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * Add tags only for ECS instances.
             * <p>
             * 
             * The tag key must be a maximum of 128 characters in length and cannot start with aliyun or acs: or contain https:// or http://".
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch. Valid values: 1 to 20.
             * <p>
             * 
             * > to ensure high availability, we recommend that you select vswitches in different zones.
             */
            public Builder vswitchIds(java.util.List < String > vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * The SSH logon password. Select either the SSH logon password or the key_pair password. The password must be 8 to 30 characters in length and contain at least three characters (uppercase and lowercase letters, numbers, and special characters).
             * <p>
             * 
             * For security reasons, the password query results are encrypted.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * The name of the key pair, which must be either login_password or login_password. If the node pool is a managed node pool, only "key_pair" is supported ".
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * Billing Method of node public IP network
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum outbound bandwidth of the node public IP address. Unit: Mbit/s(Mega bit per second). Valid values: 1 to 100.
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
             * Expected number of nodes in the node pool
             */
            public Builder desiredSize(Long desiredSize) {
                this.desiredSize = desiredSize;
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
             * Health node points.
             */
            public Builder healthyNodes(Long healthyNodes) {
                this.healthyNodes = healthyNodes;
                return this;
            }

            /**
             * The number of nodes being created.
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
             * The number of nodes being removed.
             */
            public Builder removingNodes(Long removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * The number of working nodes.
             */
            public Builder servingNodes(Long servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * The status of the node pool. Valid values:
             * <p>
             * 
             * -"active": activated.
             * -"scaling": scaling.
             * -"removing": the node is being removed.
             * -"deleting": deleting.
             * -"updating": updating.
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
             * Specifies whether to enable the encrypted computing cluster. Valid values:
             * <p>
             * 
             * -"true": enabled.
             * -"false": disabled.
             * 
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
    public static class UpgradeConfig extends TeaModel {
        @NameInMap("auto_upgrade")
        private Boolean autoUpgrade;

        @NameInMap("surge")
        private Long surge;

        @NameInMap("surge_percentage")
        private Long surgePercentage;

        @NameInMap("max_unavailable")
        private Long maxUnavailable;

        private UpgradeConfig(Builder builder) {
            this.autoUpgrade = builder.autoUpgrade;
            this.surge = builder.surge;
            this.surgePercentage = builder.surgePercentage;
            this.maxUnavailable = builder.maxUnavailable;
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

        /**
         * @return maxUnavailable
         */
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public static final class Builder {
            private Boolean autoUpgrade; 
            private Long surge; 
            private Long surgePercentage; 
            private Long maxUnavailable; 

            /**
             * Specifies whether to enable automatic upgrade. Valid values:
             * <p>
             * 
             * -"true": enable automatic upgrade.
             * -"false": disable automatic upgrade.
             * 
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The number of additional nodes.
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * The ratio of additional nodes. You can select either surge" or surge.
             */
            public Builder surgePercentage(Long surgePercentage) {
                this.surgePercentage = surgePercentage;
                return this;
            }

            /**
             * The maximum number of unavailable nodes. Valid values:[1,1000].
             * <p>
             * 
             * Default value: 1.
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            public UpgradeConfig build() {
                return new UpgradeConfig(this);
            } 

        } 

    }
    public static class Management extends TeaModel {
        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("auto_repair")
        private Boolean autoRepair;

        @NameInMap("upgrade_config")
        private UpgradeConfig upgradeConfig;

        private Management(Builder builder) {
            this.enable = builder.enable;
            this.autoRepair = builder.autoRepair;
            this.upgradeConfig = builder.upgradeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Management create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return autoRepair
         */
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        /**
         * @return upgradeConfig
         */
        public UpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

        public static final class Builder {
            private Boolean enable; 
            private Boolean autoRepair; 
            private UpgradeConfig upgradeConfig; 

            /**
             * Specifies whether to enable the managed node pool. Valid values:
             * <p>
             * 
             * -"true": enable the managed node pool.
             * -"false": the managed node pool is not enabled. Other configurations take effect only when "enable = true.
             * 
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * This parameter is automatically fixed. This parameter takes effect only when "enable = true.
             * <p>
             * 
             * -"true": automatic repair.
             * -"false": not automatically fixed.
             * 
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * The configuration is automatically upgraded. This parameter takes effect only when "enable = true.
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
    public static class InterconnectConfig extends TeaModel {
        @NameInMap("cen_id")
        private String cenId;

        @NameInMap("ccn_id")
        private String ccnId;

        @NameInMap("ccn_region_id")
        private String ccnRegionId;

        @NameInMap("bandwidth")
        private Long bandwidth;

        @NameInMap("improved_period")
        private String improvedPeriod;

        private InterconnectConfig(Builder builder) {
            this.cenId = builder.cenId;
            this.ccnId = builder.ccnId;
            this.ccnRegionId = builder.ccnRegionId;
            this.bandwidth = builder.bandwidth;
            this.improvedPeriod = builder.improvedPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterconnectConfig create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
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
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return improvedPeriod
         */
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

        public static final class Builder {
            private String cenId; 
            private String ccnId; 
            private String ccnRegionId; 
            private Long bandwidth; 
            private String improvedPeriod; 

            /**
             * The ID of the CEN instance associated with the edge-enhanced node pool.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The ID of the CCN instance associated with the edge-enhanced node pool.
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * The region of the CCN instance bound to the edge enhanced node pool.
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * The network bandwidth of the edge-enhanced node pool. Unit: M.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The purchase duration of the edge-enhanced node pool. Unit: month.
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
}
