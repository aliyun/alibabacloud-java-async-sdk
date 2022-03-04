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
    @NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @Body
    @NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @Body
    @NameInMap("tee_config")
    private TeeConfig teeConfig;

    @Body
    @NameInMap("management")
    private Management management;

    @Body
    @NameInMap("update_nodes")
    private Boolean updateNodes;

    private ModifyClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoScaling = builder.autoScaling;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.teeConfig = builder.teeConfig;
        this.management = builder.management;
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
     * @return management
     */
    public Management getManagement() {
        return this.management;
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
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private TeeConfig teeConfig; 
        private Management management; 
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
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
            this.management = request.management;
            this.updateNodes = request.updateNodes;
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
         * The ID of the node pool.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * Auto Scaling configuration.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * Cluster-related configurations.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * Configure the node pool.
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.putBodyParameter("nodepool_info", nodepoolInfo);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * Configure the scaling group.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.putBodyParameter("scaling_group", scalingGroup);
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * Configure the encrypted computing cluster.
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.putBodyParameter("tee_config", teeConfig);
            this.teeConfig = teeConfig;
            return this;
        }

        /**
         * The configuration of the managed node pool.
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
            return this;
        }

        /**
         * Update node labels and taints simultaneously.
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
             * Default value: "PayByBandwidth ".
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * Specifies whether to enable auto scaling. Valid values:
             * <p>
             * 
             * -"true": enables auto scaling for the node pool.
             * -"false": auto scaling is disabled. If the value is false, other configuration parameters in "auto_scaling "do not take effect.
             * 
             * Default value: "false ".
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
             * Default value: "false ".
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
             * Default value: "cpu ".
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
             * Whether to install cloudmonitor on the ECS node. After installation, you can view the monitoring information of the created ECS instance in the cloudmonitor console. We recommend that you enable cloudmonitor. Valid values:
             * <p>
             * 
             * -"true": install cloudmonitor on ECS nodes.
             * -"false": Do not install cloudmonitor on ECS nodes.
             * 
             * Default value: ""false "".
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * The CPU management policy of the node. When the cluster version is 1.12.6 or later, the following two policies are supported:
             * <p>
             * 
             * -"static": Allows you to enhance CPU affinity and exclusiveness for pods with certain resource characteristics on nodes.
             * -"none": indicates that the existing default CPU affinity solution is enabled.
             * 
             * Default value: "none ".
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
             * Configure tainted nodes.
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

            public KubernetesConfig build() {
                return new KubernetesConfig(this);
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
             * The ID of the resource group.
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
             * The type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum price per instance. Unit: CNY/hour.
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
        @NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @NameInMap("instance_charge_type")
        private String instanceChargeType;

        @NameInMap("period")
        private Long period;

        @NameInMap("period_unit")
        private String periodUnit;

        @NameInMap("auto_renew")
        private Boolean autoRenew;

        @NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @NameInMap("platform")
        private String platform;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        @NameInMap("instance_types")
        private java.util.List < String > instanceTypes;

        @NameInMap("key_pair")
        private String keyPair;

        @NameInMap("login_password")
        private String loginPassword;

        @NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @NameInMap("scaling_policy")
        private String scalingPolicy;

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

        @NameInMap("internet_charge_type")
        private String internetChargeType;

        @NameInMap("internet_max_bandwidth_out")
        private Long internetMaxBandwidthOut;

        @NameInMap("desired_size")
        private Long desiredSize;

        private ScalingGroup(Builder builder) {
            this.dataDisks = builder.dataDisks;
            this.instanceChargeType = builder.instanceChargeType;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.platform = builder.platform;
            this.imageId = builder.imageId;
            this.spotStrategy = builder.spotStrategy;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.instanceTypes = builder.instanceTypes;
            this.keyPair = builder.keyPair;
            this.loginPassword = builder.loginPassword;
            this.rdsInstances = builder.rdsInstances;
            this.scalingPolicy = builder.scalingPolicy;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.tags = builder.tags;
            this.vswitchIds = builder.vswitchIds;
            this.multiAzPolicy = builder.multiAzPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.desiredSize = builder.desiredSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
            return builder().build();
        }

        /**
         * @return dataDisks
         */
        public java.util.List < DataDisk > getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return instanceTypes
         */
        public java.util.List < String > getInstanceTypes() {
            return this.instanceTypes;
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
         * @return desiredSize
         */
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public static final class Builder {
            private java.util.List < DataDisk > dataDisks; 
            private String instanceChargeType; 
            private Long period; 
            private String periodUnit; 
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private String platform; 
            private String imageId; 
            private String spotStrategy; 
            private java.util.List < SpotPriceLimit> spotPriceLimit; 
            private java.util.List < String > instanceTypes; 
            private String keyPair; 
            private String loginPassword; 
            private java.util.List < String > rdsInstances; 
            private String scalingPolicy; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 
            private String systemDiskPerformanceLevel; 
            private java.util.List < Tag > tags; 
            private java.util.List < String > vswitchIds; 
            private String multiAzPolicy; 
            private Long onDemandBaseCapacity; 
            private Long onDemandPercentageAboveBaseCapacity; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Boolean compensateWithOnDemand; 
            private String internetChargeType; 
            private Long internetMaxBandwidthOut; 
            private Long desiredSize; 

            /**
             * The configuration of the node data disk. Valid values: 0 to 10. You can add up to 10 data disks.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The billing method of the node pool. Valid values:
             * <p>
             * 
             * -"PrePaid": Subscription
             * -"PostPaid": pay-as-you-go
             * 
             * Default value: "PostPaid ".
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * Node annual commitment monthly length, when instance_charge_type "value for "prepaid" when entry into force and required value.
             * <p>
             * 
             * When "periodunit = month" when value range:{1, 2 , 3, 6, 12, 24, 36, 48, 60}.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of the node. If the value of "instance_charge_type" is "PrePaid", you must specify the cycle.
             * <p>
             * 
             * Currently, only months are supported.
             * 
             * Default value: "Month ".
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * Specifies whether to enable automatic renewal for the node. This parameter takes effect only when the instance_charge_type parameter is set to prepaid. Valid values:
             * <p>
             * 
             * -"true": auto renewal.
             * -"false": does not automatically renew the instance.
             * 
             * Default value: "true ".
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The automatic renewal cycle of the node. This parameter takes effect only when "instance_charge_type" is set to "PrePaid" and is required.
             * <p>
             * 
             * If "PeriodUnit = Month", the value range is {1, 2 , 3, 6, 12}.
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * The operating system platform. Valid values:
             * <p>
             * 
             * -"AliyunLinux"
             * -"CentOS"
             * -"Windows"
             * -"WindowsCore"
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The ID of the custom image. You can call the "DescribeKubernetesVersionMetadata" operation to query the system images. The latest system images are used by default.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Preemptive instance type, value:
             * <p>
             * 
             * -"NoSpot": Non-preemptible instance.
             * -"spotwithpricelimit": Setting the preemption instance price limit.
             * -"spotaspricego": System automatic bids, follow current actual market prices.
             * 
             * For more information, see [preemptible instances](~~ 157759 ~~).
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
             * Node instance specifications list, you can select multiple instance dimension as options, each node when created, from the first dimension began to try to buy until created successfully. Final purchase instance dimension may inventory changes.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
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
             * The SSH logon password. Select either the SSH logon password or the key_pair password. The password must be 8 to 30 characters in length and contain at least three characters (uppercase and lowercase letters, numbers, and special characters).
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * The list of RDS instances.
             */
            public Builder rdsInstances(java.util.List < String > rdsInstances) {
                this.rdsInstances = rdsInstances;
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
             * The system disk type of the node. Valid values:
             * <p>
             * 
             * -"Cloud_efficiency ": Ultra disk.
             * -"Cloud_ssd ":SSD cloud disk.
             * 
             * Default value: cloud_ssd ".
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The system disk size of the node. Unit: GiB.
             * <p>
             * 
             * Value range:[20,500].
             * 
             * The value of this parameter must be greater than or equal to max{20, ImageSize}.
             * 
             * Default value: max{40, the size of the image corresponding to the parameter ImageId}.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The disk performance level of the node system disk. This parameter takes effect only for ESSD disks. The disk performance level depends on the disk size. For more information, see [ESSD](~~ 122389 ~~)
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * Only ECS instance add labels.
             * <p>
             * 
             * Tag key can"t repeat, the maximum length is 128 characters; Labels keys and label value can"t to "aliyun", "acs:" Beginning or contains "https://", "http://".
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The list of vSwitch ids. Valid values: 1 to 20.
             * <p>
             * 
             * > to ensure high availability, we recommend that you select vswitches in different zones.
             */
            public Builder vswitchIds(java.util.List < String > vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * The scaling policy for ECS instances in a multi-zone scaling group. Valid values:
             * <p>
             * 
             * -"PRIORITY": scale in the vSwitch (VSwitchIds.N) based on your definition. When higher priority Virtual Switches available area cannot create ECS instance, automatically use the next priority virtual switch create the ECS instance.
             * 
             * -"Cost_optimized ": attempts to create a vCPU instance from low to high. When telescopic configuration settings. Preemptive billing way of multi-instance dimension when priority create corresponding preemptive instance. You can continue to pass "compensatewithondemand" parameter specifies when preemptive instance because inventory etc. reason cannot create when, whether to automatically try to quantity pay create.
             * 
             * > "cost_optimized "takes effect only when the scaling configuration has multiple instance types or preemptible instances are selected.
             * 
             * -"BALANCE": evenly allocate ECS instances among multiple zones specified by the scaling group. If the zones become unbalanced due to insufficient inventory, you can use the "RebalanceInstance" API to balance resources. For more information, see [RebalanceInstance](~~ 71516 ~~).
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
             * The proportion of pay-as-you-go instances in the scaling group that meet the minimum number of pay-as-you-go instances ("on_demand_base_capacity "). Value range:[0,100].
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
             * -"true": open completion preemptive instance.
             * -"false": does not enable preemptible instances.
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
             * The billing method of the public IP address. Valid values:
             * <p>
             * 
             * -"PayByBandwidth": pay-by-bandwidth.
             * -"PayByTraffic": pay by traffic.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum outbound bandwidth of the node public IP address. Unit: Mbit/s(Mega bit per second). Value range:[1,100].
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The expected number of nodes in the node pool.
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
             * Specifies whether to enable encrypted computing clusters. Valid values:.
             * <p>
             * 
             * -"true": enabled.
             * -"false": disabled.
             * 
             * Default value: "false ".
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
             * Whether to enable automatic upgrade:
             * <p>
             * 
             * -true: enabled.
             * -false: disabled.
             * 
             * Default value: "true ".
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * The number of additional nodes. Nodes are unavailable during upgrade. You can create additional nodes to compensate for the load on the cluster.
             * <p>
             * 
             * > We recommend that you create a maximum of nodes.
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
             * The maximum number of unavailable nodes.
             * <p>
             * 
             * Valid values: 1 to 1000.
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
             * -"false": the managed node pool is disabled. Other configurations take effect only when "enble = true.
             * 
             * Default value: "false ".
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Indicates whether to fix the problem automatically. This parameter takes effect only when "enble = true. Valid values:
             * <p>
             * 
             * -"true": automatic repair.
             * -"false": not automatically fixed.
             * 
             * Default value: "true ".
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * The configuration is automatically upgraded. This parameter takes effect only when "enble = true.
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
}
