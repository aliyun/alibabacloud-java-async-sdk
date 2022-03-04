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
    @NameInMap("count")
    private Long count;

    @Body
    @NameInMap("interconnect_mode")
    private String interconnectMode;

    @Body
    @NameInMap("interconnect_config")
    private InterconnectConfig interconnectConfig;

    @Body
    @NameInMap("max_nodes")
    private Long maxNodes;

    private CreateClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.autoScaling = builder.autoScaling;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
        this.teeConfig = builder.teeConfig;
        this.management = builder.management;
        this.count = builder.count;
        this.interconnectMode = builder.interconnectMode;
        this.interconnectConfig = builder.interconnectConfig;
        this.maxNodes = builder.maxNodes;
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
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return interconnectMode
     */
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    /**
     * @return interconnectConfig
     */
    public InterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    /**
     * @return maxNodes
     */
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public static final class Builder extends Request.Builder<CreateClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private AutoScaling autoScaling; 
        private KubernetesConfig kubernetesConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private TeeConfig teeConfig; 
        private Management management; 
        private Long count; 
        private String interconnectMode; 
        private InterconnectConfig interconnectConfig; 
        private Long maxNodes; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.autoScaling = request.autoScaling;
            this.kubernetesConfig = request.kubernetesConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
            this.management = request.management;
            this.count = request.count;
            this.interconnectMode = request.interconnectMode;
            this.interconnectConfig = request.interconnectConfig;
            this.maxNodes = request.maxNodes;
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
         * Auto Scaling configuration.
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * Cluster-Related configurations.
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
         * Configure the scaling Group of the node pool.
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
         * The number of nodes in the node pool.
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * The network type of the edge node pool. Valid values:
         * <p>
         * 
         * -"basic": Basic type.
         * -"improved": enhanced.
         */
        public Builder interconnectMode(String interconnectMode) {
            this.putBodyParameter("interconnect_mode", interconnectMode);
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * Configure the edge node pool.
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.putBodyParameter("interconnect_config", interconnectConfig);
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * The maximum number of nodes allowed by the edge node pool.. This parameter is greater than or equal to 0. 0 indicates that there is no additional limit (only limited by the number of nodes that the cluster can accommodate, and the node pool itself has no additional limit). The parameter value of the edge node pool is usually greater than 0. The parameter value of the ess node pool and the default edge node pool is 0.
         */
        public Builder maxNodes(Long maxNodes) {
            this.putBodyParameter("max_nodes", maxNodes);
            this.maxNodes = maxNodes;
            return this;
        }

        @Override
        public CreateClusterNodePoolRequest build() {
            return new CreateClusterNodePoolRequest(this);
        } 

    } 

    public static class AutoScaling extends TeaModel {
        @NameInMap("enable")
        @Validation(required = true)
        private Boolean enable;

        @NameInMap("max_instances")
        @Validation(required = true)
        private Long maxInstances;

        @NameInMap("min_instances")
        @Validation(required = true)
        private Long minInstances;

        @NameInMap("type")
        private String type;

        @NameInMap("is_bond_eip")
        private Boolean isBondEip;

        @NameInMap("eip_internet_charge_type")
        private String eipInternetChargeType;

        @NameInMap("eip_bandwidth")
        private Long eipBandwidth;

        private AutoScaling(Builder builder) {
            this.enable = builder.enable;
            this.maxInstances = builder.maxInstances;
            this.minInstances = builder.minInstances;
            this.type = builder.type;
            this.isBondEip = builder.isBondEip;
            this.eipInternetChargeType = builder.eipInternetChargeType;
            this.eipBandwidth = builder.eipBandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoScaling create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
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

        /**
         * @return isBondEip
         */
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        /**
         * @return eipInternetChargeType
         */
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        /**
         * @return eipBandwidth
         */
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public static final class Builder {
            private Boolean enable; 
            private Long maxInstances; 
            private Long minInstances; 
            private String type; 
            private Boolean isBondEip; 
            private String eipInternetChargeType; 
            private Long eipBandwidth; 

            /**
             * Specifies whether to enable auto scaling. Valid values:
             * <p>
             * -"true": enables auto scaling for the node pool.
             * -"false": auto scaling is disabled. If the value is false, other "auto_scaling "configuration parameters will not take effect.
             * 
             * Default value: "false ".
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The maximum number of instances in the auto scaling group.
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * The minimum number of instances in the auto scaling group.
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
             * 
             * -"gpu":GPU instance type.
             * 
             * -"gpushare": shared GPU type.
             * 
             * -"spot": preemptible instance type.
             * 
             * Default value: "cpu ".
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Indicates whether to bind an EIP. Valid values:
             * <p>
             * 
             * -"true": bind an EIP.
             * 
             * -"false": does not bind an EIP.
             * 
             * Default value: "false ".
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * The billing method of the EIP. Valid values:
             * <p>
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
             * The peak bandwidth of the EIP.
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
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
        @Validation(required = true)
        private String runtime;

        @NameInMap("runtime_version")
        @Validation(required = true)
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
             * 
             * -"false": Do not install cloudmonitor on ECS nodes.
             * 
             * Default value: "false ".
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
             * 
             * Default value: "none ".
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * The label of the Kubernetes cluster node.
             */
            public Builder labels(java.util.List < Tag > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Container Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * The runtime version of the container.
             * <p>
             * 
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * Taint configuration.
             */
            public Builder taints(java.util.List < Taint > taints) {
                this.taints = taints;
                return this;
            }

            /**
             * Custom node data.
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
             * -The length of the cidr block refers to the number of digits at the end of the ip address of the truncated node. Valid values: 5 to 12.
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
             * The ID of the resource to which the node pool belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the node pool. Valid values:
             * <p>
             * 
             * -"ess": the node pool.
             * -"edge": edge node pool.
             * 
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
             * The maximum price per instance. Unit: USD/hour.
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
             * The name of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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

        @NameInMap("data_disks")
        private java.util.List < DataDisk > dataDisks;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("instance_charge_type")
        @Validation(required = true)
        private String instanceChargeType;

        @NameInMap("instance_types")
        @Validation(required = true)
        private java.util.List < String > instanceTypes;

        @NameInMap("key_pair")
        private String keyPair;

        @NameInMap("login_password")
        private String loginPassword;

        @NameInMap("period")
        private Long period;

        @NameInMap("period_unit")
        private String periodUnit;

        @NameInMap("platform")
        private String platform;

        @NameInMap("rds_instances")
        private java.util.List < String > rdsInstances;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("spot_price_limit")
        private java.util.List < SpotPriceLimit> spotPriceLimit;

        @NameInMap("scaling_policy")
        private String scalingPolicy;

        @NameInMap("security_group_id")
        private String securityGroupId;

        @NameInMap("security_group_ids")
        private java.util.List < String > securityGroupIds;

        @NameInMap("system_disk_category")
        @Validation(required = true)
        private String systemDiskCategory;

        @NameInMap("system_disk_size")
        @Validation(required = true)
        private Long systemDiskSize;

        @NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("vswitch_ids")
        @Validation(required = true)
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

        @NameInMap("image_type")
        private String imageType;

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
            this.keyPair = builder.keyPair;
            this.loginPassword = builder.loginPassword;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.platform = builder.platform;
            this.rdsInstances = builder.rdsInstances;
            this.spotStrategy = builder.spotStrategy;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.scalingPolicy = builder.scalingPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupIds = builder.securityGroupIds;
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
            this.imageType = builder.imageType;
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
        public java.util.List < Tags> getTags() {
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
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
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
            private String keyPair; 
            private String loginPassword; 
            private Long period; 
            private String periodUnit; 
            private String platform; 
            private java.util.List < String > rdsInstances; 
            private String spotStrategy; 
            private java.util.List < SpotPriceLimit> spotPriceLimit; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List < String > securityGroupIds; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 
            private String systemDiskPerformanceLevel; 
            private java.util.List < Tags> tags; 
            private java.util.List < String > vswitchIds; 
            private String multiAzPolicy; 
            private Long onDemandBaseCapacity; 
            private Long onDemandPercentageAboveBaseCapacity; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Boolean compensateWithOnDemand; 
            private String internetChargeType; 
            private Long internetMaxBandwidthOut; 
            private String imageType; 
            private String deploymentsetId; 
            private Long desiredSize; 

            /**
             * Specifies whether to enable automatic renewal for nodes in the node pool. This parameter takes effect only when the value of "instance_charge_type" is "PrePaid. Valid values:
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
             * The auto-renewal period of the node pool. This parameter takes effect only when you select subscription and auto-renewal. This parameter is required. If "PeriodUnit = Month", the value range is {1, 2, 3, 6, 12}.
             * <p>
             * 
             * Default value: 1.
             * 
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * Node pool node data disk configuration.
             */
            public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The ID of the custom image. The system-provided image is used by default.
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
             * 
             * -"PostPaid": pay-as-you-go.
             * 
             * Default value: "PostPaid ".
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance type of the node pool.
             */
            public Builder instanceTypes(java.util.List < String > instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * The name of the password-free logon key pair, which must be either login_password or login_password.
             * <p>
             * 
             * > If you create a managed node pool, only "key_pair" is supported ".
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
             * The subscription period of a node in the node pool. This parameter takes effect only when the value of instance_charge_type is set to prepaid". This parameter is required. Valid values: "renew_unit". Valid values:{ 1, 2, 3,6,12}.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * The billing cycle of nodes in the node pool. You must specify the billing cycle when you set the value to "PrePaid. Month.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The operating system release. Valid values:
             * <p>
             * -"CentOS"
             * -"AliyunLinux"
             * -"Windows"
             * -"WindowsCore"
             * 
             * Default value: "AliyunLinux ".
             */
            public Builder platform(String platform) {
                this.platform = platform;
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
             * The type of the preemptible instance. Valid values:
             * <p>
             * 
             * -"NoSpot": non-preemptible instance.
             * 
             * -"Spotwithpricelime": sets the maximum price for preemptible instances.
             * 
             * -"SpotAsPriceGo": the system automatically bids based on the actual market price.
             * 
             * For more information, see [preemptible instances](~~ 165053 ~~).
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The price range of a preemptible instance.
             */
            public Builder spotPriceLimit(java.util.List < SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The scaling group mode. Valid values:
             * <p>
             * 
             * -"release": in standard mode, ECS instances are created and released based on the usage of the requested resource values.
             * -"recycle": indicates the fast mode. You can create, stop, and start scaling to increase the speed of re-scaling (no fees are charged for computing resources when stopped, and only storage fees are charged, except for local disks).
             * 
             * Default value: "release ".
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The ID of the security group of the node pool. Select either security_group_ids or security_group_ids. We recommend that you use security_group_ids ".
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The list of security group ids. We recommend that you use "security_group_ids "if you specify both "security_group_id" and "security_group_ids".
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
             * -"Cloud_essd": ESSD.
             * 
             * Default value: cloud_efficiency"
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The system disk size of the node. Unit: GiB.
             * <p>
             * 
             * Valid values: [40,500].
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
            public Builder tags(java.util.List < Tags> tags) {
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
             * The scaling policy for ECS instances in a multi-zone scaling group. Valid values:
             * <p>
             * 
             * -"PRIORITY": scale in the vSwitch (VSwitchIds.N) based on your definition. When an ECS instance cannot be created in the zone where the vSwitch with a higher priority is located, the ECS instance is automatically created using the vSwitch with the next priority.
             * 
             * -"Cost_optimized ": attempts to create a vCPU instance from low to high. When multiple instance types with preemptible billing method are configured for the scaling configuration, the corresponding preemptible instance is created first. You can use the "CompensateWithOnDemand" parameter to specify whether to automatically create a preemptible instance on a pay-as-you-go basis when the preemptible instance cannot be created due to inventory or other reasons.
             * 
             * > "cost_optimized "takes effect only when the scaling configuration has multiple instance types or preemptible instances are selected.
             * 
             * -"BALANCE": evenly allocate ECS instances among multiple zones specified by the scaling group. If the zones become unbalanced due to insufficient inventory, you can use the API [RebalanceInstance](~~ 71516 ~~) to balance resources.
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
             * The billing method of the public IP address.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The bandwidth of the public IP address.
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The image type of the operating system. Valid values:
             * <p>
             * 
             * -"AliyunLinux":Alinux2 image.
             * -"AliyunLinux3":Alinux3 image.
             * -"AliyunLinux3Arm64":Alinux3 Image ARM version.
             * -"AliyunLinuxUEFI":Alinux2 Image UEFI.
             * -"CentOS":CentOS image.
             * -"Windows":Windows image.
             * -"WindowsCore":WindowsCore image.
             * -"ContainerOS": container optimized image.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
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
             * Expected number of nodes in sister pool
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
        @Validation(required = true)
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
             * Specifies whether to enable encrypted computing clusters.
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
        @Validation(required = true)
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
             * 
             * -"false": disable automatic upgrade.
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
             * The maximum number of unavailable nodes.
             * <p>
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
        @Validation(required = true)
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
             * 
             * -"false": the managed node pool is not enabled. Other configurations take effect only when enable = true.
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
             * 
             * -"false": not automatically fixed.
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
             * The region of the CCN instance associated with the edge-enhanced node pool.
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
             * The purchase period of the edge-enhanced node pool. Unit: month.
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
