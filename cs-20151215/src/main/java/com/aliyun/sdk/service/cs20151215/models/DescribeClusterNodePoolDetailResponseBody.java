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
 * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNodePoolDetailResponseBody</p>
 */
public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.NameInMap("host_network")
    private Boolean hostNetwork;

    @com.aliyun.core.annotation.NameInMap("interconnect_config")
    private InterconnectConfig interconnectConfig;

    @com.aliyun.core.annotation.NameInMap("interconnect_mode")
    private String interconnectMode;

    @com.aliyun.core.annotation.NameInMap("intranet")
    private Boolean intranet;

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

    @com.aliyun.core.annotation.NameInMap("status")
    private Status status;

    @com.aliyun.core.annotation.NameInMap("tee_config")
    private TeeConfig teeConfig;

    private DescribeClusterNodePoolDetailResponseBody(Builder builder) {
        this.autoScaling = builder.autoScaling;
        this.hostNetwork = builder.hostNetwork;
        this.interconnectConfig = builder.interconnectConfig;
        this.interconnectMode = builder.interconnectMode;
        this.intranet = builder.intranet;
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

    public static DescribeClusterNodePoolDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScaling
     */
    public AutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    /**
     * @return hostNetwork
     */
    public Boolean getHostNetwork() {
        return this.hostNetwork;
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
     * @return intranet
     */
    public Boolean getIntranet() {
        return this.intranet;
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
        private Boolean hostNetwork; 
        private InterconnectConfig interconnectConfig; 
        private String interconnectMode; 
        private Boolean intranet; 
        private KubernetesConfig kubernetesConfig; 
        private Management management; 
        private Long maxNodes; 
        private NodeConfig nodeConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private Status status; 
        private TeeConfig teeConfig; 

        private Builder() {
        } 

        private Builder(DescribeClusterNodePoolDetailResponseBody model) {
            this.autoScaling = model.autoScaling;
            this.hostNetwork = model.hostNetwork;
            this.interconnectConfig = model.interconnectConfig;
            this.interconnectMode = model.interconnectMode;
            this.intranet = model.intranet;
            this.kubernetesConfig = model.kubernetesConfig;
            this.management = model.management;
            this.maxNodes = model.maxNodes;
            this.nodeConfig = model.nodeConfig;
            this.nodepoolInfo = model.nodepoolInfo;
            this.scalingGroup = model.scalingGroup;
            this.status = model.status;
            this.teeConfig = model.teeConfig;
        } 

        /**
         * <p>The auto scaling configuration of the node pool.</p>
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * <p>Indicates whether the pods in the edge node pool can use the host network.</p>
         * <p><code>true</code>: sets to host network.</p>
         * <p><code>false</code>: sets to container network.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * <p>The network configuration of the edge node pool. This parameter takes effect only for edge node pools.</p>
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * <p>The network type of the edge node pool. This parameter takes effect only if you set the type parameter of the node pool to edge. Valid values:</p>
         * <p><code>basic</code>: Internet.</p>
         * <p><code>private</code>: private network.</p>
         * 
         * <strong>example:</strong>
         * <p>improved</p>
         */
        public Builder interconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * <p>Specifies whether all nodes in the edge node pool can communicate with each other at Layer 3.</p>
         * <p><code>true</code>: The nodes in the edge node pool can communicate with each other at Layer 3.</p>
         * <p><code>false</code>: The nodes in the edge node pool cannot communicate with each other at Layer 3.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder intranet(Boolean intranet) {
            this.intranet = intranet;
            return this;
        }

        /**
         * <p>The configurations of the cluster in which the node pool is deployed.</p>
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>The configuration of the managed node pool feature.</p>
         */
        public Builder management(Management management) {
            this.management = management;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * <p>The maximum number of nodes allowed in an edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * <p>The node configurations.</p>
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * <p>The configuration of the node pool.</p>
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * <p>The configurations of the scaling group used by the node pool.</p>
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * <p>The status details about the node pool.</p>
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The configuration of confidential computing.</p>
         */
        public Builder teeConfig(TeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }

        public DescribeClusterNodePoolDetailResponseBody build() {
            return new DescribeClusterNodePoolDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class AutoScaling extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eip_bandwidth")
        private Long eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("eip_internet_charge_type")
        private String eipInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("is_bond_eip")
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

            private Builder() {
            } 

            private Builder(AutoScaling model) {
                this.eipBandwidth = model.eipBandwidth;
                this.eipInternetChargeType = model.eipInternetChargeType;
                this.enable = model.enable;
                this.isBondEip = model.isBondEip;
                this.maxInstances = model.maxInstances;
                this.minInstances = model.minInstances;
                this.type = model.type;
            } 

            /**
             * <p>The maximum bandwidth of the elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p>The metering method of the EIP. Valid values:</p>
             * <ul>
             * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
             * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * <p>Indicates whether auto scaling is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: auto scaling is enabled.</li>
             * <li><code>false</code>: auto scaling is disabled. If this parameter is set to false, other parameters in the <code>auto_scaling</code> section do not take effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Indicates whether an EIP is associated with the node pool. Valid values:</p>
             * <ul>
             * <li><code>true</code>: An EIP is associated with the node pool.</li>
             * <li><code>false</code>: No EIP is associated with the node pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * <p>The maximum number of Elastic Compute Service (ECS) instances that can be created in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>The minimum number of ECS instances that must be kept in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>The instance types that can be used for the auto scaling of the node pool. Valid values:</p>
             * <ul>
             * <li><code>cpu</code>: regular instance.</li>
             * <li><code>gpu</code>: GPU-accelerated instance.</li>
             * <li><code>gpushare</code>: shared GPU-accelerated instance.</li>
             * <li><code>spot</code>: preemptible instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InterconnectConfig model) {
                this.bandwidth = model.bandwidth;
                this.ccnId = model.ccnId;
                this.ccnRegionId = model.ccnRegionId;
                this.cenId = model.cenId;
                this.improvedPeriod = model.improvedPeriod;
            } 

            /**
             * <p>The bandwidth of the enhanced edge node pool. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the Cloud Connect Network (CCN) instance that is associated with the enhanced edge node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-qm5i0i0q9yi*******</p>
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * <p>The region to which the CCN instance that is associated with the enhanced edge node pool belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the enhanced edge node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-ey9k9nfhz0f*******</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The subscription duration of the enhanced edge node pool. The duration is measured in months.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class KubernetesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cms_enabled")
        private Boolean cmsEnabled;

        @com.aliyun.core.annotation.NameInMap("cpu_policy")
        private String cpuPolicy;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List<Tag> labels;

        @com.aliyun.core.annotation.NameInMap("node_name_mode")
        private String nodeNameMode;

        @com.aliyun.core.annotation.NameInMap("pre_user_data")
        private String preUserData;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("runtime_version")
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("taints")
        private java.util.List<Taint> taints;

        @com.aliyun.core.annotation.NameInMap("unschedulable")
        private Boolean unschedulable;

        @com.aliyun.core.annotation.NameInMap("user_data")
        private String userData;

        private KubernetesConfig(Builder builder) {
            this.cmsEnabled = builder.cmsEnabled;
            this.cpuPolicy = builder.cpuPolicy;
            this.labels = builder.labels;
            this.nodeNameMode = builder.nodeNameMode;
            this.preUserData = builder.preUserData;
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
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        /**
         * @return nodeNameMode
         */
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        /**
         * @return preUserData
         */
        public String getPreUserData() {
            return this.preUserData;
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
        public java.util.List<Taint> getTaints() {
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
            private java.util.List<Tag> labels; 
            private String nodeNameMode; 
            private String preUserData; 
            private String runtime; 
            private String runtimeVersion; 
            private java.util.List<Taint> taints; 
            private Boolean unschedulable; 
            private String userData; 

            private Builder() {
            } 

            private Builder(KubernetesConfig model) {
                this.cmsEnabled = model.cmsEnabled;
                this.cpuPolicy = model.cpuPolicy;
                this.labels = model.labels;
                this.nodeNameMode = model.nodeNameMode;
                this.preUserData = model.preUserData;
                this.runtime = model.runtime;
                this.runtimeVersion = model.runtimeVersion;
                this.taints = model.taints;
                this.unschedulable = model.unschedulable;
                this.userData = model.userData;
            } 

            /**
             * <p>Indicates whether the CloudMonitor agent is installed on ECS nodes in the cluster. After the CloudMonitor agent is installed, you can view monitoring information about the ECS instances in the CloudMonitor console. Installation is recommended. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The CloudMonitor agent is installed on ECS nodes.</li>
             * <li><code>false</code>: The CloudMonitor agent is not installed on ECS nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * <p>The CPU management policy of the nodes in the node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
             * <ul>
             * <li><code>static</code>: allows pods with specific resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
             * <li><code>none</code>: indicates that the default CPU affinity is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * <p>The labels that you want to add to the nodes in the cluster. You must add labels based on the following rules:</p>
             * <ul>
             * <li>A label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
             * <li>The key must be unique and cannot exceed 64 characters in length. The value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
             * </ul>
             */
            public Builder labels(java.util.List<Tag> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>A custom node name consists of a prefix, an IP substring, and a suffix.</p>
             * <ul>
             * <li>The prefix and suffix can contain multiple parts that are separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). A custom node name must start and end with a digit or lowercase letter.</li>
             * <li>The IP substring length specifies the number of digits to be truncated from the end of the node IP address. The IP substring length ranges from 5 to 12.</li>
             * </ul>
             * <p>For example, if the node IP address is 192.168.0.55, the prefix is aliyun.com, the IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.</p>
             * 
             * <strong>example:</strong>
             * <p>customized,test.,5,.com</p>
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * <p>The user-defined script that is executed before nodes are initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * <p>The name of the container runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>docker</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The version of the container runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>19.03.5</p>
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * <p>The taints that you want to add to nodes. Taints can be used together with tolerations to prevent pods from being scheduled to specific nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">taint-and-toleration</a>.</p>
             */
            public Builder taints(java.util.List<Taint> taints) {
                this.taints = taints;
                return this;
            }

            /**
             * <p>Whether the expanded node is schedulable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder unschedulable(Boolean unschedulable) {
                this.unschedulable = unschedulable;
                return this;
            }

            /**
             * <p>The custom script to be executed after nodes in the node pool are initialized. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>IyEvYmluL3NoCmVjaG8gIkhlbGxvIEFDSyEi</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AutoRepairPolicy model) {
                this.restartNode = model.restartNode;
            } 

            /**
             * <p>Whether to allow restarting nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AutoUpgradePolicy model) {
                this.autoUpgradeKubelet = model.autoUpgradeKubelet;
            } 

            /**
             * <p>Whether to allow automatic upgrading of kubelet.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AutoVulFixPolicy model) {
                this.restartNode = model.restartNode;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * <p>Whether to allow restarting nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * <p>The vulnerability levels allowed for auto-fixing, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>asap,nntf</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(UpgradeConfig model) {
                this.autoUpgrade = model.autoUpgrade;
                this.maxUnavailable = model.maxUnavailable;
                this.surge = model.surge;
                this.surgePercentage = model.surgePercentage;
            } 

            /**
             * <p>Indicates whether auto update is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Auto update is enabled.</li>
             * <li><code>false</code>: Auto update is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>The maximum number of nodes that can be in the Unavailable state. Valid values: 1 to 1000.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * <p>The number of additional nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * <p>The percentage of additional nodes to the nodes in the node pool. You must set this parameter or <code>surge</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Management model) {
                this.autoRepair = model.autoRepair;
                this.autoRepairPolicy = model.autoRepairPolicy;
                this.autoUpgrade = model.autoUpgrade;
                this.autoUpgradePolicy = model.autoUpgradePolicy;
                this.autoVulFix = model.autoVulFix;
                this.autoVulFixPolicy = model.autoVulFixPolicy;
                this.enable = model.enable;
                this.upgradeConfig = model.upgradeConfig;
            } 

            /**
             * <p>Indicates whether auto repair is enabled. This parameter takes effect only when <code>enable=true</code> is specified. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Auto repair is enabled.</li>
             * <li><code>false</code>: Auto repair is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * <p>Automatic repair node policy.</p>
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * <p>Whether to automatically upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>Automatic upgrade policy.</p>
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * <p>Whether to automatically fix CVEs.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoVulFix(Boolean autoVulFix) {
                this.autoVulFix = autoVulFix;
                return this;
            }

            /**
             * <p>Automatically repair CVE policies.</p>
             */
            public Builder autoVulFixPolicy(AutoVulFixPolicy autoVulFixPolicy) {
                this.autoVulFixPolicy = autoVulFixPolicy;
                return this;
            }

            /**
             * <p>Indicates whether the managed node pool feature is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The managed node pool feature is enabled.</li>
             * <li><code>false</code>: The managed node pool feature is disabled. Other parameters in this section take effect only when <code>enable=true</code> is specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The configuration of auto update. The configuration takes effect only when <code>enable=true</code> is specified.</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NodeConfig model) {
                this.kubeletConfiguration = model.kubeletConfiguration;
            } 

            /**
             * <p>The configurations of the kubelet.</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class NodepoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("is_default")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nodepool_id")
        private String nodepoolId;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
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

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.created = model.created;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.nodepoolId = model.nodepoolId;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The time when the node pool was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-27T19:14:09.156823496+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Indicates whether the node pool is a default node pool. A Container Service for Kubernetes (ACK) cluster usually has only one default node pool. Valid values: <code>true</code>: The node pool is a default node pool. <code>false</code>: The node pool is not a default node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The name of the node pool.</p>
             * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
             * 
             * <strong>example:</strong>
             * <p>default-nodepool</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np615c0e0966124216a0412e10afe0****</p>
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyvw3wjmb****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ess</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the node pool was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-27T20:37:46+08:00</p>
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
    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PrivatePoolOptions model) {
                this.id = model.id;
                this.matchCriteria = model.matchCriteria;
            } 

            /**
             * <p>The ID of the private node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of private node pool. This parameter specifies the type of private node pool that you want to use to create instances. A private node pool is generated when an elasticity assurance or a capacity reservation service takes effect. The system selects a private node pool to launch instances. Valid values:</p>
             * <ul>
             * <li><code>Open</code>: open private pool. The system selects an open private node pool to launch instances. If no matching open private node pool is available, the resources in the public node pool are used.</li>
             * <li><code>Target</code>: specific private pool. The system uses the resources of the specified private node pool to launch instances. If the specified private node pool is unavailable, instances cannot be launched.</li>
             * <li><code>None</code>: no private node pool is used. The resources of private node pools are not used to launch the instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SpotPriceLimit model) {
                this.instanceType = model.instanceType;
                this.priceLimit = model.priceLimit;
            } 

            /**
             * <p>The instance type of the preemptible instances.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The price cap of a preemptible instance of the type.</p>
             * <p>Unit: USD/hour.</p>
             * 
             * <strong>example:</strong>
             * <p>0.39</p>
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
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
        private java.util.List<DataDisk> dataDisks;

        @com.aliyun.core.annotation.NameInMap("deploymentset_id")
        private String deploymentsetId;

        @com.aliyun.core.annotation.NameInMap("desired_size")
        private Long desiredSize;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("instance_charge_type")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("instance_patterns")
        private java.util.List<InstancePatterns> instancePatterns;

        @com.aliyun.core.annotation.NameInMap("instance_types")
        private java.util.List<String> instanceTypes;

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
        private String platform;

        @com.aliyun.core.annotation.NameInMap("private_pool_options")
        private PrivatePoolOptions privatePoolOptions;

        @com.aliyun.core.annotation.NameInMap("ram_policy")
        private String ramPolicy;

        @com.aliyun.core.annotation.NameInMap("ram_role_name")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("rds_instances")
        private java.util.List<String> rdsInstances;

        @com.aliyun.core.annotation.NameInMap("scaling_group_id")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("scaling_policy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_ids")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("security_hardening_os")
        private Boolean securityHardeningOs;

        @com.aliyun.core.annotation.NameInMap("soc_enabled")
        private Boolean socEnabled;

        @com.aliyun.core.annotation.NameInMap("spot_instance_pools")
        private Long spotInstancePools;

        @com.aliyun.core.annotation.NameInMap("spot_instance_remedy")
        private Boolean spotInstanceRemedy;

        @com.aliyun.core.annotation.NameInMap("spot_price_limit")
        private java.util.List<SpotPriceLimit> spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("spot_strategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("system_disk_bursting_enabled")
        private Boolean systemDiskBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_categories")
        private java.util.List<String> systemDiskCategories;

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
        private java.util.List<Tag> tags;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        private java.util.List<String> vswitchIds;

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
            this.ramPolicy = builder.ramPolicy;
            this.ramRoleName = builder.ramRoleName;
            this.rdsInstances = builder.rdsInstances;
            this.scalingGroupId = builder.scalingGroupId;
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
        public java.util.List<DataDisk> getDataDisks() {
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
        public java.util.List<InstancePatterns> getInstancePatterns() {
            return this.instancePatterns;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
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
         * @return ramPolicy
         */
        public String getRamPolicy() {
            return this.ramPolicy;
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
        public java.util.List<String> getRdsInstances() {
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
        public java.util.List<String> getSecurityGroupIds() {
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
        public java.util.List<SpotPriceLimit> getSpotPriceLimit() {
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
        public java.util.List<String> getSystemDiskCategories() {
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
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private Boolean cisEnabled; 
            private Boolean compensateWithOnDemand; 
            private java.util.List<DataDisk> dataDisks; 
            private String deploymentsetId; 
            private Long desiredSize; 
            private String imageId; 
            private String imageType; 
            private String instanceChargeType; 
            private java.util.List<InstancePatterns> instancePatterns; 
            private java.util.List<String> instanceTypes; 
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
            private String ramPolicy; 
            private String ramRoleName; 
            private java.util.List<String> rdsInstances; 
            private String scalingGroupId; 
            private String scalingPolicy; 
            private String securityGroupId; 
            private java.util.List<String> securityGroupIds; 
            private Boolean securityHardeningOs; 
            private Boolean socEnabled; 
            private Long spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private java.util.List<SpotPriceLimit> spotPriceLimit; 
            private String spotStrategy; 
            private Boolean systemDiskBurstingEnabled; 
            private java.util.List<String> systemDiskCategories; 
            private String systemDiskCategory; 
            private String systemDiskEncryptAlgorithm; 
            private Boolean systemDiskEncrypted; 
            private String systemDiskKmsKeyId; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Long systemDiskSize; 
            private java.util.List<Tag> tags; 
            private java.util.List<String> vswitchIds; 

            private Builder() {
            } 

            private Builder(ScalingGroup model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.cisEnabled = model.cisEnabled;
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.dataDisks = model.dataDisks;
                this.deploymentsetId = model.deploymentsetId;
                this.desiredSize = model.desiredSize;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.instanceChargeType = model.instanceChargeType;
                this.instancePatterns = model.instancePatterns;
                this.instanceTypes = model.instanceTypes;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.keyPair = model.keyPair;
                this.loginAsNonRoot = model.loginAsNonRoot;
                this.loginPassword = model.loginPassword;
                this.multiAzPolicy = model.multiAzPolicy;
                this.onDemandBaseCapacity = model.onDemandBaseCapacity;
                this.onDemandPercentageAboveBaseCapacity = model.onDemandPercentageAboveBaseCapacity;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.platform = model.platform;
                this.privatePoolOptions = model.privatePoolOptions;
                this.ramPolicy = model.ramPolicy;
                this.ramRoleName = model.ramRoleName;
                this.rdsInstances = model.rdsInstances;
                this.scalingGroupId = model.scalingGroupId;
                this.scalingPolicy = model.scalingPolicy;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupIds = model.securityGroupIds;
                this.securityHardeningOs = model.securityHardeningOs;
                this.socEnabled = model.socEnabled;
                this.spotInstancePools = model.spotInstancePools;
                this.spotInstanceRemedy = model.spotInstanceRemedy;
                this.spotPriceLimit = model.spotPriceLimit;
                this.spotStrategy = model.spotStrategy;
                this.systemDiskBurstingEnabled = model.systemDiskBurstingEnabled;
                this.systemDiskCategories = model.systemDiskCategories;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskEncryptAlgorithm = model.systemDiskEncryptAlgorithm;
                this.systemDiskEncrypted = model.systemDiskEncrypted;
                this.systemDiskKmsKeyId = model.systemDiskKmsKeyId;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskProvisionedIops = model.systemDiskProvisionedIops;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>Indicates whether auto-renewal is enabled for the nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Auto-renewal is enabled.</li>
             * <li><code>false</code>: Auto-renewal is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The duration of the auto-renewal. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <p>If you specify <code>PeriodUnit=Month</code>, the valid values are 1, 2, 3, 6, and 12.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>【The field is deprecated】Please use the parameter security_hardening_os instead.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cisEnabled(Boolean cisEnabled) {
                this.cisEnabled = cisEnabled;
                return this;
            }

            /**
             * <p>Indicates whether pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created due to reasons such as cost or insufficient inventory. This parameter takes effect when <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Pay-as-you-go instances are automatically created to meet the required number of ECS instances if preemptible instances cannot be created.</li>
             * <li><code>false</code>: Pay-as-you-go instances are not automatically created to meet the required number of ECS instances if preemptible instances cannot be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * <p>The configurations of the data disks that are attached to the nodes in the node pool. The configurations include the disk category and disk size.</p>
             */
            public Builder dataDisks(java.util.List<DataDisk> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The ID of the deployment set to which the ECS instances in the node pool belong.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * <p>The expected number of nodes in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desiredSize(Long desiredSize) {
                this.desiredSize = desiredSize;
                return this;
            }

            /**
             * <p>The ID of the custom image. You can call the <code>DescribeKubernetesVersionMetadata</code> operation to query the images supported by ACK.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Operating system image type.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The billing method of the nodes in the node pool. Valid values:</p>
             * <ul>
             * <li><code>PrePaid</code>: the subscription billing method.</li>
             * <li><code>PostPaid</code>: the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance properties.</p>
             */
            public Builder instancePatterns(java.util.List<InstancePatterns> instancePatterns) {
                this.instancePatterns = instancePatterns;
                return this;
            }

            /**
             * <p>A list of instance types. You can select multiple instance types. When the system needs to create a node, it starts from the first instance type until the node is created. The instance type that is used to create the node varies based on the actual instance stock.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The billing method of the public IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The maximum outbound bandwidth of the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The name of the key pair. You must set this parameter or the <code>login_password</code> parameter. You must set <code>key_pair</code> if the node pool is a managed node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pro-nodepool</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>Whether the popped ECS instance uses a non-root user for login.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            /**
             * <p>The password for SSH logon. You must set this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
             * <p>For security purposes, the returned password is encrypted.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The ECS instance scaling policy for a multi-zone scaling group. Valid values:</p>
             * <ul>
             * <li><p><code>PRIORITY</code>: the scaling group is scaled based on the VSwitchIds.N parameter. If an ECS instance cannot be created in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates the ECS instance in the zone where the vSwitch that has the next highest priority resides.</p>
             * </li>
             * <li><p><code>COST_OPTIMIZED</code>: ECS instances are created based on the vCPU unit price in ascending order. Preemptible instances are preferably created when preemptible instance types are specified in the scaling configuration. You can set the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
             * <p>**</p>
             * <p><strong>Note</strong>The <code>COST_OPTIMIZED</code> setting takes effect only when multiple instance types are specified or at least one instance type is specified for preemptible instances.</p>
             * </li>
             * <li><p><code>BALANCE</code>: ECS instances are evenly distributed across multiple zones specified by the scaling group. If ECS instances become imbalanced among multiple zones due to insufficient inventory, you can call the RebalanceInstances operation of Auto Scaling to balance the instance distribution among zones. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>PRIORITY</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>BALANCE</p>
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances that must be kept in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferably creates pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the extra instances that exceed the number specified by <code>on_demand_base_capacity</code>. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The subscription duration of worker nodes. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <p>If <code>PeriodUnit=Month</code> is specified, the valid values are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The billing cycle of the nodes. This parameter is required if <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <p>Valid value: <code>Month</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The release version of the operating system. Valid values:</p>
             * <ul>
             * <li><code>CentOS</code></li>
             * <li><code>AliyunLinux</code></li>
             * <li><code>Windows</code></li>
             * <li><code>WindowsCore</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The configuration of the private node pool.</p>
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
             */
            public Builder ramPolicy(String ramPolicy) {
                this.ramPolicy = ramPolicy;
                return this;
            }

            /**
             * <p>Worker RAM role name.</p>
             * 
             * <strong>example:</strong>
             * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>After you specify the list of RDS instances, the ECS instances in the cluster are automatically added to the whitelist of the RDS instances.</p>
             */
            public Builder rdsInstances(java.util.List<String> rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-2zeieod8giqmov7z****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The scaling mode of the scaling group. Valid values:</p>
             * <ul>
             * <li><code>release</code>: the standard mode. ECS instances are created and released based on resource usage.</li>
             * <li><code>recycle</code>: the swift mode. ECS instances are created, stopped, or started during scaling events. This reduces the time required for the next scale-out event. When the instance is stopped, you are charged only for the storage service. This does not apply to ECS instances that are attached with local disks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>release</p>
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * <p>The ID of the security group to which the node pool is added. If the node pool is added to multiple security groups, the first ID in the value of <code>security_group_ids</code> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze60ockeekspl3d****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The IDs of the security groups to which the node pool is added.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>Alibaba Cloud OS security hardening. Values:</p>
             * <ul>
             * <li><code>true</code>: Enable Alibaba Cloud OS security hardening. </li>
             * <li><code>false</code>: Do not enable Alibaba Cloud OS security hardening.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>Indicates whether to enable security reinforcement compliant with the hardening standards. This option is available only when the system image is set to Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3. Alibaba Cloud provides baseline check standards and scanning programs compliant with Grade 3, Version 2.0 of the hardening standards for both Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 images.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>The number of instance types that are available for creating preemptible instances. Auto Scaling creates preemptible instances of multiple instance types that are available at the lowest cost. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Indicates whether preemptible instances are supplemented when the number of preemptible instances drops below the specified minimum number. If this parameter is set to true, when the scaling group receives a system message that a preemptible instance is to be reclaimed, the scaling group attempts to create a new instance to replace this instance. Valid values: Valid values:</p>
             * <ul>
             * <li><code>true</code>: Supplementation of preemptible instances is enabled.</li>
             * <li><code>false</code>: Supplementation of preemptible instances is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * <p>The bid configurations of preemptible instances.</p>
             */
            public Builder spotPriceLimit(java.util.List<SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The type of preemptible instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: a non-preemptible instance.</li>
             * <li>SpotWithPriceLimit: a preemptible instance that is configured with the highest bid price.</li>
             * <li>SpotAsPriceGo: a preemptible instance for which the system automatically bids based on the current market price.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Preemptible instances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>Whether to enable Burst (performance burst) for the node system disk, configured when the disk type is cloud_auto.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The categories of the system disk for nodes. The system attempts to create system disks of a disk category with a lower priority if the disk category with a higher priority is unavailable. Valid values: Valid values:</p>
             * <ul>
             * <li><code>cloud</code>: basic disk.</li>
             * <li><code>cloud_efficiency</code>: ultra disk.</li>
             * <li><code>cloud_ssd</code>: standard SSD.</li>
             * <li><code>cloud_essd</code>: Enterprise SSD (ESSD).</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
             * </ul>
             * <p>Default value: <code>cloud_efficiency</code>.</p>
             */
            public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * <p>The system disk type. Valid values:</p>
             * <ul>
             * <li><code>cloud</code>: basic disk</li>
             * <li><code>cloud_efficiency</code>: ultra disk</li>
             * <li><code>cloud_ssd</code>: standard SSD</li>
             * <li><code>cloud_essd</code>: Enterprise SSD (ESSD)</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL disk</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry disk</li>
             * </ul>
             * <p>Default value: <code>cloud_efficiency</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used to encrypt the system disk. Set the value to aes-256.</p>
             * 
             * <strong>example:</strong>
             * <p>aes-256</p>
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values: Valid values:</p>
             * <ul>
             * <li><code>true</code>: encrypts the system disk.</li>
             * <li><code>false</code>: does not encrypt the system disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
                this.systemDiskEncrypted = systemDiskEncrypted;
                return this;
            }

            /**
             * <p>System disk&quot;s KMS key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * <p>The performance level (PL) of the system disk that you want to use for the node. This parameter takes effect only for enhanced SSDs (ESSDs).</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>Pre-configured read and write IOPS for the system disk of the node, configured when the disk type is cloud_auto.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The system disk size of a node. Unit: GiB.</p>
             * <p>Valid values: 20 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The labels that you want to add only to ECS instances.</p>
             * <p>The label key must be unique and cannot exceed 128 characters in length. The label key and value cannot start with aliyun or acs: or contain https:// or http://.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The IDs of vSwitches. You can specify 1 to 20 vSwitches.</p>
             * <blockquote>
             * <p>We recommend that you select vSwitches in different zones to ensure high availability.</p>
             * </blockquote>
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
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
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failed_nodes")
        private Long failedNodes;

        @com.aliyun.core.annotation.NameInMap("healthy_nodes")
        private Long healthyNodes;

        @com.aliyun.core.annotation.NameInMap("initial_nodes")
        private Long initialNodes;

        @com.aliyun.core.annotation.NameInMap("offline_nodes")
        private Long offlineNodes;

        @com.aliyun.core.annotation.NameInMap("removing_nodes")
        private Long removingNodes;

        @com.aliyun.core.annotation.NameInMap("serving_nodes")
        private Long servingNodes;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("total_nodes")
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

            private Builder() {
            } 

            private Builder(Status model) {
                this.failedNodes = model.failedNodes;
                this.healthyNodes = model.healthyNodes;
                this.initialNodes = model.initialNodes;
                this.offlineNodes = model.offlineNodes;
                this.removingNodes = model.removingNodes;
                this.servingNodes = model.servingNodes;
                this.state = model.state;
                this.totalNodes = model.totalNodes;
            } 

            /**
             * <p>The number of failed nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedNodes(Long failedNodes) {
                this.failedNodes = failedNodes;
                return this;
            }

            /**
             * <p>The number of healthy nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthyNodes(Long healthyNodes) {
                this.healthyNodes = healthyNodes;
                return this;
            }

            /**
             * <p>The number of nodes that are being created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder initialNodes(Long initialNodes) {
                this.initialNodes = initialNodes;
                return this;
            }

            /**
             * <p>The number of offline nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder offlineNodes(Long offlineNodes) {
                this.offlineNodes = offlineNodes;
                return this;
            }

            /**
             * <p>The number of nodes that are being removed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder removingNodes(Long removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * <p>The number of running nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder servingNodes(Long servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * <p>The status of the node pool. Valid values:</p>
             * <ul>
             * <li><code>active</code>: The node pool is active.</li>
             * <li><code>scaling</code>: The node pool is being scaled.</li>
             * <li><code>removing</code>: Nodes are being removed from the node pool.</li>
             * <li><code>deleting</code>: The node pool is being deleted.</li>
             * <li><code>updating</code>: The node pool is being updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total number of nodes in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TeeConfig model) {
                this.teeEnable = model.teeEnable;
            } 

            /**
             * <p>Indicates whether confidential computing is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Confidential computing is enabled.</li>
             * <li><code>false</code>: Confidential computing is disabled.</li>
             * </ul>
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
