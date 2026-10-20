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
    @com.aliyun.core.annotation.NameInMap("auto_mode")
    private AutoMode autoMode;

    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.NameInMap("eflo_node_group")
    private EfloNodeGroup efloNodeGroup;

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

    @com.aliyun.core.annotation.NameInMap("node_components")
    private java.util.List<NodeComponents> nodeComponents;

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
        this.autoMode = builder.autoMode;
        this.autoScaling = builder.autoScaling;
        this.efloNodeGroup = builder.efloNodeGroup;
        this.hostNetwork = builder.hostNetwork;
        this.interconnectConfig = builder.interconnectConfig;
        this.interconnectMode = builder.interconnectMode;
        this.intranet = builder.intranet;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.management = builder.management;
        this.maxNodes = builder.maxNodes;
        this.nodeComponents = builder.nodeComponents;
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
     * @return autoMode
     */
    public AutoMode getAutoMode() {
        return this.autoMode;
    }

    /**
     * @return autoScaling
     */
    public AutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    /**
     * @return efloNodeGroup
     */
    public EfloNodeGroup getEfloNodeGroup() {
        return this.efloNodeGroup;
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
     * @return nodeComponents
     */
    public java.util.List<NodeComponents> getNodeComponents() {
        return this.nodeComponents;
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
        private AutoMode autoMode; 
        private AutoScaling autoScaling; 
        private EfloNodeGroup efloNodeGroup; 
        private Boolean hostNetwork; 
        private InterconnectConfig interconnectConfig; 
        private String interconnectMode; 
        private Boolean intranet; 
        private KubernetesConfig kubernetesConfig; 
        private Management management; 
        private Long maxNodes; 
        private java.util.List<NodeComponents> nodeComponents; 
        private NodeConfig nodeConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 
        private Status status; 
        private TeeConfig teeConfig; 

        private Builder() {
        } 

        private Builder(DescribeClusterNodePoolDetailResponseBody model) {
            this.autoMode = model.autoMode;
            this.autoScaling = model.autoScaling;
            this.efloNodeGroup = model.efloNodeGroup;
            this.hostNetwork = model.hostNetwork;
            this.interconnectConfig = model.interconnectConfig;
            this.interconnectMode = model.interconnectMode;
            this.intranet = model.intranet;
            this.kubernetesConfig = model.kubernetesConfig;
            this.management = model.management;
            this.maxNodes = model.maxNodes;
            this.nodeComponents = model.nodeComponents;
            this.nodeConfig = model.nodeConfig;
            this.nodepoolInfo = model.nodepoolInfo;
            this.scalingGroup = model.scalingGroup;
            this.status = model.status;
            this.teeConfig = model.teeConfig;
        } 

        /**
         * <p>The intelligent management configuration.</p>
         */
        public Builder autoMode(AutoMode autoMode) {
            this.autoMode = autoMode;
            return this;
        }

        /**
         * <p>The auto scaling configurations of the node pool.</p>
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * <p>The Lingjun node group information.</p>
         */
        public Builder efloNodeGroup(EfloNodeGroup efloNodeGroup) {
            this.efloNodeGroup = efloNodeGroup;
            return this;
        }

        /**
         * <p>Specifies whether the pod network uses the host network mode. Valid values:</p>
         * <ul>
         * <li>true: Host network. Pods directly use the network stack of the host and share the IP address and ports with the host.</li>
         * <li>false: Container network. Pods have independent network stacks and do not occupy host network ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The network configuration for edge node pools. This value is valid only for node pools of the edge type.</p>
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * <p>The network type of the edge node pool. This parameter takes effect only when type is set to edge. Valid values:</p>
         * <ul>
         * <li>basic: Public network. Nodes in cloud node pool interact with cloud nodes over the public network. Applications in cloud node pool cannot directly access the internal network of the cloud VPC.</li>
         * <li>private: Private network. Nodes in cloud node pool connect on-premises and cloud networks through Express Connect circuits, VPNs, or CEN. This provides higher cloud-edge communication quality and more effective security protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder interconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * <p>Specifies whether Layer 3 network connectivity is enabled among nodes in the edge node pool. Valid values:</p>
         * <ul>
         * <li>true: Connected. Layer 3 network connectivity is enabled among all nodes in the node pool.</li>
         * <li>false: Disconnected. Layer 3 network connectivity is disabled among all hosts in the node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder intranet(Boolean intranet) {
            this.intranet = intranet;
            return this;
        }

        /**
         * <p>The cluster-related configuration.</p>
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>The configurations of the managed node pool.</p>
         */
        public Builder management(Management management) {
            this.management = management;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The maximum number of nodes allowed in the edge node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * <p>The list of node components.</p>
         */
        public Builder nodeComponents(java.util.List<NodeComponents> nodeComponents) {
            this.nodeComponents = nodeComponents;
            return this;
        }

        /**
         * <p>The node configuration.</p>
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * <p>The node pool configurations.</p>
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * <p>The scaling group configuration of the node pool.</p>
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * <p>The status of the node pool.</p>
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The confidential computing cluster configuration.</p>
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
    public static class AutoMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private AutoMode(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoMode create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(AutoMode model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Specifies whether intelligent management is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AutoMode build() {
                return new AutoMode(this);
            } 

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
             * <p>The peak bandwidth of the EIP. Valid values: 1 to 100. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p>The billing method of the elastic IP address (EIP). Valid values:</p>
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
             * <li><code>true</code>: Auto scaling is enabled for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum numbers of instances. For clusters of Kubernetes 1.24 and later, just-in-time elasticity is enabled by default. For clusters earlier than Kubernetes 1.24, auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</li>
             * <li><code>false</code>: Auto scaling is disabled. ACK adjusts the number of nodes in the node pool based on the configured expected number of nodes to keep the number of nodes at the expected value.
             * If this parameter is set to <code>false</code>, other configuration parameters in auto_scaling do not take effect.</li>
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
             * <p>Indicates whether an EIP is bound. Valid values:</p>
             * <ul>
             * <li><code>true</code>: An EIP is bound.</li>
             * <li><code>false</code>: No EIP is bound.</li>
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
             * <p>The maximum number of scalable instances in the node pool, excluding existing instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>The minimum number of scalable instances in the node pool, excluding existing instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>The auto scaling type, which is classified by the type of auto scaling instances. Valid values:</p>
             * <ul>
             * <li><code>cpu</code>: standard instance.</li>
             * <li><code>gpu</code>: GPU-accelerated instance.</li>
             * <li><code>gpushare</code>: shared GPU-accelerated instance.</li>
             * <li><code>spot</code>: spot instance.</li>
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
    public static class EfloNodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_attach_enabled")
        private Boolean autoAttachEnabled;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("group_id")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("worker_ram_role_name")
        private String workerRamRoleName;

        private EfloNodeGroup(Builder builder) {
            this.autoAttachEnabled = builder.autoAttachEnabled;
            this.clusterId = builder.clusterId;
            this.groupId = builder.groupId;
            this.workerRamRoleName = builder.workerRamRoleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EfloNodeGroup create() {
            return builder().build();
        }

        /**
         * @return autoAttachEnabled
         */
        public Boolean getAutoAttachEnabled() {
            return this.autoAttachEnabled;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return workerRamRoleName
         */
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        public static final class Builder {
            private Boolean autoAttachEnabled; 
            private String clusterId; 
            private String groupId; 
            private String workerRamRoleName; 

            private Builder() {
            } 

            private Builder(EfloNodeGroup model) {
                this.autoAttachEnabled = model.autoAttachEnabled;
                this.clusterId = model.clusterId;
                this.groupId = model.groupId;
                this.workerRamRoleName = model.workerRamRoleName;
            } 

            /**
             * <p>Specifies whether automatic attachment to the Lingjun node pool is enabled.</p>
             */
            public Builder autoAttachEnabled(Boolean autoAttachEnabled) {
                this.autoAttachEnabled = autoAttachEnabled;
                return this;
            }

            /**
             * <p>The ID of the Lingjun cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>i113790071760688002461</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The ID of the Lingjun group.</p>
             * 
             * <strong>example:</strong>
             * <p>i128147721760688002463</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The worker RAM role used by the Lingjun node pool.</p>
             */
            public Builder workerRamRoleName(String workerRamRoleName) {
                this.workerRamRoleName = workerRamRoleName;
                return this;
            }

            public EfloNodeGroup build() {
                return new EfloNodeGroup(this);
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
             * <p><strong>[Deprecated]</strong> The network bandwidth of the edge-optimized node pool. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Connect Network (CCN) attached to the edge-optimized node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-qm5i0i0q9yi*******</p>
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The region of the CCN instance bound to the edge-optimized node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The instance ID of the Cloud Enterprise Network (CEN) attached to the edge-optimized node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-ey9k9nfhz0f*******</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The subscription duration of the edge-optimized node pool. Unit: months.</p>
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
             * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After installation, you can view the monitoring information of the created ECS instances in the CloudMonitor console. Recommended. Valid values:</p>
             * <ul>
             * <li>true: Install the CloudMonitor agent on ECS nodes.</li>
             * <li>false: Do not install the CloudMonitor agent on ECS nodes.</li>
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
             * <p>The CPU management policy for nodes. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
             * <ul>
             * <li>static: Allows pods with specific resource characteristics on the node to have enhanced CPU affinity and exclusivity.</li>
             * <li>none: Indicates that the existing default CPU affinity scheme is used.</li>
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
             * <p>The tag of the node.</p>
             */
            public Builder labels(java.util.List<Tag> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The custom node name.
             * A node name consists of three parts: prefix + node IP address substring + suffix.</p>
             * <ul>
             * <li>The prefix and suffix can each consist of one or more parts separated by periods (.). Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or a digit.</li>
             * <li>The IP address substring length refers to the number of digits truncated from the end of the node IP address. Valid values: 5 to 12.
             * For example, if the node IP address is 192.168.0.55, the specified prefix is aliyun.com, the IP address substring length is 5, and the suffix is test, the node name is aliyun.com00055test.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com192.XX.YY.55test</p>
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * <p>The pre-custom data for the node pool, which refers to the scripts that run before node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dGhpcyBpcyBhIGV4YW1wbGU</p>
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * <p>The name of the container runtime. ACK supports the following three container runtimes:</p>
             * <ul>
             * <li>containerd: Recommended. Supported by all cluster versions.</li>
             * <li>Sandboxed-Container.runv: Sandboxed container. Provides higher isolation. Supported by clusters of version 1.31 and earlier.</li>
             * <li>docker: Deprecated. Supported by clusters of version 1.22 and earlier.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The container runtime version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.6.38</p>
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * <p>The node taint information. Taints and tolerations work together to prevent pods from being scheduled onto inappropriate nodes. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">Taints and Tolerations</a>.</p>
             */
            public Builder taints(java.util.List<Taint> taints) {
                this.taints = taints;
                return this;
            }

            /**
             * <p>Specifies whether the scaled-out nodes are unschedulable. Valid values:</p>
             * <ul>
             * <li>true: Unschedulable.</li>
             * <li>false: Schedulable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder unschedulable(Boolean unschedulable) {
                this.unschedulable = unschedulable;
                return this;
            }

            /**
             * <p>The custom data for the node pool, which refers to the scripts that run after node initialization. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate instance user data</a>.</p>
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
        @com.aliyun.core.annotation.NameInMap("approval_required")
        private Boolean approvalRequired;

        @com.aliyun.core.annotation.NameInMap("auto_repair_policy_id")
        private String autoRepairPolicyId;

        @com.aliyun.core.annotation.NameInMap("max_parallel_repairing_nodes")
        private String maxParallelRepairingNodes;

        @com.aliyun.core.annotation.NameInMap("max_unhealthy_nodes_threshold")
        private String maxUnhealthyNodesThreshold;

        @com.aliyun.core.annotation.NameInMap("restart_node")
        private Boolean restartNode;

        private AutoRepairPolicy(Builder builder) {
            this.approvalRequired = builder.approvalRequired;
            this.autoRepairPolicyId = builder.autoRepairPolicyId;
            this.maxParallelRepairingNodes = builder.maxParallelRepairingNodes;
            this.maxUnhealthyNodesThreshold = builder.maxUnhealthyNodesThreshold;
            this.restartNode = builder.restartNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRepairPolicy create() {
            return builder().build();
        }

        /**
         * @return approvalRequired
         */
        public Boolean getApprovalRequired() {
            return this.approvalRequired;
        }

        /**
         * @return autoRepairPolicyId
         */
        public String getAutoRepairPolicyId() {
            return this.autoRepairPolicyId;
        }

        /**
         * @return maxParallelRepairingNodes
         */
        public String getMaxParallelRepairingNodes() {
            return this.maxParallelRepairingNodes;
        }

        /**
         * @return maxUnhealthyNodesThreshold
         */
        public String getMaxUnhealthyNodesThreshold() {
            return this.maxUnhealthyNodesThreshold;
        }

        /**
         * @return restartNode
         */
        public Boolean getRestartNode() {
            return this.restartNode;
        }

        public static final class Builder {
            private Boolean approvalRequired; 
            private String autoRepairPolicyId; 
            private String maxParallelRepairingNodes; 
            private String maxUnhealthyNodesThreshold; 
            private Boolean restartNode; 

            private Builder() {
            } 

            private Builder(AutoRepairPolicy model) {
                this.approvalRequired = model.approvalRequired;
                this.autoRepairPolicyId = model.autoRepairPolicyId;
                this.maxParallelRepairingNodes = model.maxParallelRepairingNodes;
                this.maxUnhealthyNodesThreshold = model.maxUnhealthyNodesThreshold;
                this.restartNode = model.restartNode;
            } 

            /**
             * <p>Indicates whether manual approval is required for node repair.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder approvalRequired(Boolean approvalRequired) {
                this.approvalRequired = approvalRequired;
                return this;
            }

            /**
             * <p>The ID of the auto-repair policy.</p>
             * 
             * <strong>example:</strong>
             * <p>r-xxxxxxxxxx</p>
             */
            public Builder autoRepairPolicyId(String autoRepairPolicyId) {
                this.autoRepairPolicyId = autoRepairPolicyId;
                return this;
            }

            /**
             * <p>The maximum number or percentage of nodes that can be repaired simultaneously when a large number of abnormal nodes exist in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxParallelRepairingNodes(String maxParallelRepairingNodes) {
                this.maxParallelRepairingNodes = maxParallelRepairingNodes;
                return this;
            }

            /**
             * <p>The circuit breaker threshold for auto-repair. When the number or percentage of faulty nodes exceeds this threshold, auto-repair enters the circuit breaker state and stops initiating new repair actions.</p>
             * 
             * <strong>example:</strong>
             * <p>10%</p>
             */
            public Builder maxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
                this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
                return this;
            }

            /**
             * <p>Indicates whether nodes can be restarted. This parameter takes effect only when auto_repair is set to <code>true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Nodes can be restarted.</li>
             * <li><code>false</code>: Nodes cannot be restarted.</li>
             * </ul>
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
             * <p>Specifies whether to allow automatic kubelet upgrades. This parameter takes effect only when <code>auto_upgrade</code> is set to <code>true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic kubelet upgrades.</li>
             * <li><code>false</code>: Does not allow automatic kubelet upgrades.</li>
             * </ul>
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
        @com.aliyun.core.annotation.NameInMap("exclude_packages")
        private String excludePackages;

        @com.aliyun.core.annotation.NameInMap("restart_node")
        private Boolean restartNode;

        @com.aliyun.core.annotation.NameInMap("vul_level")
        private String vulLevel;

        private AutoVulFixPolicy(Builder builder) {
            this.excludePackages = builder.excludePackages;
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
         * @return excludePackages
         */
        public String getExcludePackages() {
            return this.excludePackages;
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
            private String excludePackages; 
            private Boolean restartNode; 
            private String vulLevel; 

            private Builder() {
            } 

            private Builder(AutoVulFixPolicy model) {
                this.excludePackages = model.excludePackages;
                this.restartNode = model.restartNode;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * <p>The packages to be excluded during vulnerability repair.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel</p>
             */
            public Builder excludePackages(String excludePackages) {
                this.excludePackages = excludePackages;
                return this;
            }

            /**
             * <p>Specifies whether to allow node restarts. This parameter takes effect only when <code>auto_vul_fix</code> is set to <code>true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows node restarts.</li>
             * <li><code>false</code>: Does not allow node restarts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * <p>The vulnerability levels that are allowed for auto-repair, separated by commas. Valid values:</p>
             * <ul>
             * <li><code>asap</code>: High.</li>
             * <li><code>later</code>: Medium.</li>
             * <li><code>nntf</code>: Low.</li>
             * </ul>
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
             * <p>Specifies whether to enable automatic upgrades. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables automatic upgrades.</li>
             * <li><code>false</code>: Disables automatic upgrades.</li>
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
             * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000.</p>
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
             * <p>The number of surge nodes. This parameter and <code>surge_percentage</code> are mutually exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * <p>The percentage of surge nodes. This parameter and <code>surge</code> are mutually exclusive.</p>
             * <p>The number of surge nodes is calculated by multiplying the surge node percentage by the total number of nodes. For example, if the surge node percentage is set to 50% and the total number of nodes is 6, the number of surge nodes generated is 50% × 6 = 3.</p>
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
        @com.aliyun.core.annotation.NameInMap("auto_fault_diagnosis")
        private Boolean autoFaultDiagnosis;

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

        @com.aliyun.core.annotation.NameInMap("drift_enabled")
        private Boolean driftEnabled;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("upgrade_config")
        private UpgradeConfig upgradeConfig;

        private Management(Builder builder) {
            this.autoFaultDiagnosis = builder.autoFaultDiagnosis;
            this.autoRepair = builder.autoRepair;
            this.autoRepairPolicy = builder.autoRepairPolicy;
            this.autoUpgrade = builder.autoUpgrade;
            this.autoUpgradePolicy = builder.autoUpgradePolicy;
            this.autoVulFix = builder.autoVulFix;
            this.autoVulFixPolicy = builder.autoVulFixPolicy;
            this.driftEnabled = builder.driftEnabled;
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
         * @return autoFaultDiagnosis
         */
        public Boolean getAutoFaultDiagnosis() {
            return this.autoFaultDiagnosis;
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
         * @return driftEnabled
         */
        public Boolean getDriftEnabled() {
            return this.driftEnabled;
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
            private Boolean autoFaultDiagnosis; 
            private Boolean autoRepair; 
            private AutoRepairPolicy autoRepairPolicy; 
            private Boolean autoUpgrade; 
            private AutoUpgradePolicy autoUpgradePolicy; 
            private Boolean autoVulFix; 
            private AutoVulFixPolicy autoVulFixPolicy; 
            private Boolean driftEnabled; 
            private Boolean enable; 
            private UpgradeConfig upgradeConfig; 

            private Builder() {
            } 

            private Builder(Management model) {
                this.autoFaultDiagnosis = model.autoFaultDiagnosis;
                this.autoRepair = model.autoRepair;
                this.autoRepairPolicy = model.autoRepairPolicy;
                this.autoUpgrade = model.autoUpgrade;
                this.autoUpgradePolicy = model.autoUpgradePolicy;
                this.autoVulFix = model.autoVulFix;
                this.autoVulFixPolicy = model.autoVulFixPolicy;
                this.driftEnabled = model.driftEnabled;
                this.enable = model.enable;
                this.upgradeConfig = model.upgradeConfig;
            } 

            /**
             * <p>Specifies whether to enable ECS fault detection for node auto-repair.</p>
             */
            public Builder autoFaultDiagnosis(Boolean autoFaultDiagnosis) {
                this.autoFaultDiagnosis = autoFaultDiagnosis;
                return this;
            }

            /**
             * <p>Indicates whether auto repair is enabled. This parameter takes effect only when enable is set to <code>true</code>. Valid values:</p>
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
             * <p>The auto repair policy for nodes.</p>
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when <code>enable</code> is set to <code>true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables auto-upgrade.</li>
             * <li><code>false</code>: Disables auto-upgrade.</li>
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
             * <p>The policy for automatic upgrades.</p>
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically repair CVEs. This parameter takes effect only when <code>enable</code> is set to <code>true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Automatically repairs CVEs.</li>
             * <li><code>false</code>: Does not automatically repair CVEs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoVulFix(Boolean autoVulFix) {
                this.autoVulFix = autoVulFix;
                return this;
            }

            /**
             * <p>The policy for automatically repairing CVEs.</p>
             */
            public Builder autoVulFixPolicy(AutoVulFixPolicy autoVulFixPolicy) {
                this.autoVulFixPolicy = autoVulFixPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable node rotation. This feature is supported only by intelligent managed node pools and is enabled by default. It is not supported by regular node pools.</p>
             */
            public Builder driftEnabled(Boolean driftEnabled) {
                this.driftEnabled = driftEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the managed node pool is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The managed node pool is enabled.</li>
             * <li><code>false</code>: The managed node pool is disabled. Other related configurations take effect only when enable is set to <code>true</code>.</li>
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
             * <p>The configuration for automatic upgrades. This parameter takes effect only when <code>enable</code> is set to <code>true</code>.</p>
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
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Envs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>LOG_LEVEL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("custom_config")
        private java.util.Map<String, ?> customConfig;

        @com.aliyun.core.annotation.NameInMap("envs")
        private java.util.List<Envs> envs;

        private Config(Builder builder) {
            this.customConfig = builder.customConfig;
            this.envs = builder.envs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return customConfig
         */
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        /**
         * @return envs
         */
        public java.util.List<Envs> getEnvs() {
            return this.envs;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customConfig; 
            private java.util.List<Envs> envs; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
                this.envs = model.envs;
            } 

            /**
             * <p>The custom configuration of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpuManagerPolicy&quot;:&quot;static&quot;}</p>
             */
            public Builder customConfig(java.util.Map<String, ?> customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            /**
             * <p>The environment variables of the node component.</p>
             */
            public Builder envs(java.util.List<Envs> envs) {
                this.envs = envs;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class NodeComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("config_revision")
        private String configRevision;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private NodeComponents(Builder builder) {
            this.config = builder.config;
            this.configRevision = builder.configRevision;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeComponents create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return configRevision
         */
        public String getConfigRevision() {
            return this.configRevision;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Config config; 
            private String configRevision; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(NodeComponents model) {
                this.config = model.config;
                this.configRevision = model.configRevision;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The configuration of the node component.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The version number of the custom configuration for the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configRevision(String configRevision) {
                this.configRevision = configRevision;
                return this;
            }

            /**
             * <p>The name of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>kubelet</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>1.33.3-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public NodeComponents build() {
                return new NodeComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNodePoolDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodePoolDetailResponseBody</p>
     */
    public static class NodeOsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hugepage")
        private Hugepage hugepage;

        private NodeOsConfig(Builder builder) {
            this.hugepage = builder.hugepage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeOsConfig create() {
            return builder().build();
        }

        /**
         * @return hugepage
         */
        public Hugepage getHugepage() {
            return this.hugepage;
        }

        public static final class Builder {
            private Hugepage hugepage; 

            private Builder() {
            } 

            private Builder(NodeOsConfig model) {
                this.hugepage = model.hugepage;
            } 

            /**
             * <p>The Hugepage configuration.</p>
             */
            public Builder hugepage(Hugepage hugepage) {
                this.hugepage = hugepage;
                return this;
            }

            public NodeOsConfig build() {
                return new NodeOsConfig(this);
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

        @com.aliyun.core.annotation.NameInMap("node_os_config")
        private NodeOsConfig nodeOsConfig;

        private NodeConfig(Builder builder) {
            this.kubeletConfiguration = builder.kubeletConfiguration;
            this.nodeOsConfig = builder.nodeOsConfig;
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

        /**
         * @return nodeOsConfig
         */
        public NodeOsConfig getNodeOsConfig() {
            return this.nodeOsConfig;
        }

        public static final class Builder {
            private KubeletConfig kubeletConfiguration; 
            private NodeOsConfig nodeOsConfig; 

            private Builder() {
            } 

            private Builder(NodeConfig model) {
                this.kubeletConfiguration = model.kubeletConfiguration;
                this.nodeOsConfig = model.nodeOsConfig;
            } 

            /**
             * <p>The Kubelet parameter settings.</p>
             */
            public Builder kubeletConfiguration(KubeletConfig kubeletConfiguration) {
                this.kubeletConfiguration = kubeletConfiguration;
                return this;
            }

            /**
             * <p>The node operating system configuration.</p>
             */
            public Builder nodeOsConfig(NodeOsConfig nodeOsConfig) {
                this.nodeOsConfig = nodeOsConfig;
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
             * <p>2025-04-10T14:25:37.285530433+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Indicates whether the node pool is the default node pool. Typically, a cluster has only one default node pool. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The node pool is the default node pool.</li>
             * <li><code>false</code>: The node pool is not the default node pool.</li>
             * </ul>
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
             * <p>The type of the node pool. Valid values:</p>
             * <ul>
             * <li><code>ess</code>: standard node pool, which includes managed and automatic elastic scaling features.</li>
             * <li><code>edge</code>: edge node pool.</li>
             * <li><code>lingjun</code>: Lingjun node pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ess</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the node pool was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-15T15:39:45.41+08:00</p>
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
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nested_virtualization")
        private String nestedVirtualization;

        private CpuOptions(Builder builder) {
            this.nestedVirtualization = builder.nestedVirtualization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return nestedVirtualization
         */
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

        public static final class Builder {
            private String nestedVirtualization; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.nestedVirtualization = model.nestedVirtualization;
            } 

            /**
             * <p>Specifies whether nested virtualization is enabled. Valid values:</p>
             * <ul>
             * <li>disabled: Nested virtualization is disabled.</li>
             * <li>enabled: Nested virtualization is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder nestedVirtualization(String nestedVirtualization) {
                this.nestedVirtualization = nestedVirtualization;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
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
             * <p>The type of the private node pool and the private pool capacity matching criteria for instance startup. After the elasticity assurance or capacity reservation takes effect, private pool capacity is generated for you to select when you start instances. Valid values:</p>
             * <ul>
             * <li><p>Open: Open mode. The system automatically matches the capacity of open private pools. If no eligible private pool capacity is available, the system uses public pool resources to start the instance. In this mode, you do not need to specify the PrivatePoolOptions.Id parameter.</p>
             * </li>
             * <li><p>Target: Target mode. The system uses the specified private pool capacity to start the instance. If the specified private pool capacity is unavailable, the instance fails to start. In this mode, you must specify the private pool ID, which means the PrivatePoolOptions.Id parameter is required.</p>
             * </li>
             * <li><p>None: None mode. The system does not use private pool capacity to start the instance.</p>
             * </li>
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
    public static class ResourcePoolOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("private_pool_ids")
        private java.util.List<String> privatePoolIds;

        @com.aliyun.core.annotation.NameInMap("strategy")
        private String strategy;

        private ResourcePoolOptions(Builder builder) {
            this.privatePoolIds = builder.privatePoolIds;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePoolOptions create() {
            return builder().build();
        }

        /**
         * @return privatePoolIds
         */
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private java.util.List<String> privatePoolIds; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(ResourcePoolOptions model) {
                this.privatePoolIds = model.privatePoolIds;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The list of private pool IDs.</p>
             */
            public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>The resource pool strategy used when creating instances. Valid values:</p>
             * <ul>
             * <li>PrivatePoolFirst: Private pool first.</li>
             * <li>PrivatePoolOnly: Private pool only.</li>
             * <li>None: No resource pool strategy is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrivatePoolFirst</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public ResourcePoolOptions build() {
                return new ResourcePoolOptions(this);
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
             * <p>The instance type of the spot instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The market price per instance.</p>
             * <p>&lt;props=&quot;china&quot;&gt;Unit: CNY/hour.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;Unit: USD/hour.</p>
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

        @com.aliyun.core.annotation.NameInMap("cpu_options")
        private CpuOptions cpuOptions;

        @com.aliyun.core.annotation.NameInMap("data_disks")
        private java.util.List<DataDisk> dataDisks;

        @com.aliyun.core.annotation.NameInMap("deploymentset_id")
        private String deploymentsetId;

        @com.aliyun.core.annotation.NameInMap("desired_size")
        private Long desiredSize;

        @com.aliyun.core.annotation.NameInMap("disk_init")
        private java.util.List<DiskInit> diskInit;

        @com.aliyun.core.annotation.NameInMap("enable_high_density_mode")
        private Boolean enableHighDensityMode;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("instance_charge_type")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("instance_metadata_options")
        private InstanceMetadataOptions instanceMetadataOptions;

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

        @com.aliyun.core.annotation.NameInMap("resource_pool_options")
        private ResourcePoolOptions resourcePoolOptions;

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

        @com.aliyun.core.annotation.NameInMap("system_disk_snapshot_policy_id")
        private String systemDiskSnapshotPolicyId;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tag> tags;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        private java.util.List<String> vswitchIds;

        private ScalingGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.cisEnabled = builder.cisEnabled;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.cpuOptions = builder.cpuOptions;
            this.dataDisks = builder.dataDisks;
            this.deploymentsetId = builder.deploymentsetId;
            this.desiredSize = builder.desiredSize;
            this.diskInit = builder.diskInit;
            this.enableHighDensityMode = builder.enableHighDensityMode;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceMetadataOptions = builder.instanceMetadataOptions;
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
            this.resourcePoolOptions = builder.resourcePoolOptions;
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
            this.systemDiskSnapshotPolicyId = builder.systemDiskSnapshotPolicyId;
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
         * @return cpuOptions
         */
        public CpuOptions getCpuOptions() {
            return this.cpuOptions;
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
         * @return diskInit
         */
        public java.util.List<DiskInit> getDiskInit() {
            return this.diskInit;
        }

        /**
         * @return enableHighDensityMode
         */
        public Boolean getEnableHighDensityMode() {
            return this.enableHighDensityMode;
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
         * @return instanceMetadataOptions
         */
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
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
         * @return resourcePoolOptions
         */
        public ResourcePoolOptions getResourcePoolOptions() {
            return this.resourcePoolOptions;
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
         * @return systemDiskSnapshotPolicyId
         */
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
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
            private CpuOptions cpuOptions; 
            private java.util.List<DataDisk> dataDisks; 
            private String deploymentsetId; 
            private Long desiredSize; 
            private java.util.List<DiskInit> diskInit; 
            private Boolean enableHighDensityMode; 
            private String imageId; 
            private String imageType; 
            private String instanceChargeType; 
            private InstanceMetadataOptions instanceMetadataOptions; 
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
            private ResourcePoolOptions resourcePoolOptions; 
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
            private String systemDiskSnapshotPolicyId; 
            private java.util.List<Tag> tags; 
            private java.util.List<String> vswitchIds; 

            private Builder() {
            } 

            private Builder(ScalingGroup model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.cisEnabled = model.cisEnabled;
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.cpuOptions = model.cpuOptions;
                this.dataDisks = model.dataDisks;
                this.deploymentsetId = model.deploymentsetId;
                this.desiredSize = model.desiredSize;
                this.diskInit = model.diskInit;
                this.enableHighDensityMode = model.enableHighDensityMode;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceMetadataOptions = model.instanceMetadataOptions;
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
                this.resourcePoolOptions = model.resourcePoolOptions;
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
                this.systemDiskSnapshotPolicyId = model.systemDiskSnapshotPolicyId;
                this.tags = model.tags;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>Specifies whether to enable auto-renewal for nodes. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables auto-renewal.</li>
             * <li><code>false</code>: Disables auto-renewal.</li>
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
             * <p>The auto-renewal period. Valid values:</p>
             * <ul>
             * <li>When PeriodUnit is set to Week: 1, 2, and 3.</li>
             * <li>When PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the security_hardening_os parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cisEnabled(Boolean cisEnabled) {
                this.cisEnabled = cisEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances if sufficient spot instances cannot be created due to price or inventory reasons when multi_az_policy is set to COST_OPTIMIZED. Valid values:</p>
             * <ul>
             * <li>true: Allow automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
             * <li>false: Do not allow automatic creation of pay-as-you-go instances to meet the required number of ECS instances.</li>
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
             * <p>The CPU-related configuration options.</p>
             */
            public Builder cpuOptions(CpuOptions cpuOptions) {
                this.cpuOptions = cpuOptions;
                return this;
            }

            /**
             * <p>The combination of configurations such as the type and size of the data cloud disks for the node.</p>
             */
            public Builder dataDisks(java.util.List<DataDisk> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
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
             * <p>The block device initialization configuration.</p>
             */
            public Builder diskInit(java.util.List<DiskInit> diskInit) {
                this.diskInit = diskInit;
                return this;
            }

            /**
             * <p>Specifies whether to enable high-density cloud disk mode. This feature is supported only when the node pool uses instance types. After this feature is enabled, the total number of system cloud disks and data cloud disks does not exceed the maximum number of high-density cloud disks supported by the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableHighDensityMode(Boolean enableHighDensityMode) {
                this.enableHighDensityMode = enableHighDensityMode;
                return this;
            }

            /**
             * <p>The ID of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the operating system image. Valid values:</p>
             * <ul>
             * <li><code>AliyunLinux</code>: Alinux 2 image.</li>
             * <li><code>AliyunLinuxSecurity</code>: Alinux 2 UEFI image.</li>
             * <li><code>AliyunLinux3</code>: Alinux 3 image.</li>
             * <li><code>AliyunLinux3Arm64</code>: Alinux 3 ARM image.</li>
             * <li><code>AliyunLinux3Security</code>: Alinux 3 UEFI image.</li>
             * <li><code>CentOS</code>: CentOS image.</li>
             * <li><code>Windows</code>: Windows image.</li>
             * <li><code>WindowsCore</code>: Windows Core image.</li>
             * <li><code>ContainerOS</code>: Container-optimized image.</li>
             * <li><code>AliyunLinux3ContainerOptimized</code>: Alinux 3 container-optimized image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux3</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The billing method of nodes in the node pool. Valid values:</p>
             * <ul>
             * <li><code>PrePaid</code>: Subscription.</li>
             * <li><code>PostPaid</code>: Pay-as-you-go.</li>
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
             * <p>The metadata access configurations of the ECS instance.</p>
             */
            public Builder instanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
                this.instanceMetadataOptions = instanceMetadataOptions;
                return this;
            }

            /**
             * <p>The instance property configurations.</p>
             */
            public Builder instancePatterns(java.util.List<InstancePatterns> instancePatterns) {
                this.instancePatterns = instancePatterns;
                return this;
            }

            /**
             * <p>The list of instance types for nodes.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The billing method for the public IP address of the node. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: Pay-by-bandwidth.</li>
             * <li>PayByTraffic: Pay-by-traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The maximum outbound bandwidth for the public IP address of the node. Unit: Mbit/s. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The name of the key pair. You must specify either this parameter or login_password. If the node pool is a managed node pool, only key_pair is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>pro-nodepool</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>Specifies whether to log on to the created ECS instance as a non-root user. Valid values:</p>
             * <ul>
             * <li><p>true: Log on as a non-root user (ecs-user).</p>
             * </li>
             * <li><p>false: Log on as the root user.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder loginAsNonRoot(Boolean loginAsNonRoot) {
                this.loginAsNonRoot = loginAsNonRoot;
                return this;
            }

            /**
             * <p>The SSH logon password. You must specify either this parameter or key_pair. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
             * <p>For security reasons, the password in the query result is encrypted.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The scaling policy for ECS instances in a multi-zone scaling group. Valid values:</p>
             * <ul>
             * <li><p>PRIORITY: Scale based on the vSwitches (VSwitchIds.N) that you specify. If ECS instances cannot be created in the zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</p>
             * </li>
             * <li><p>COST_OPTIMIZED: Create instances based on the vCPU unit price in ascending order. If the scaling configuration specifies multiple instance types that use the spot billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically create pay-as-you-go instances if spot instances cannot be created due to insufficient inventory or other reasons.</p>
             * <blockquote>
             * <p>The COST_OPTIMIZED value takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
             * </blockquote>
             * </li>
             * <li><p>BALANCE: Evenly allocate ECS instances across the zones specified in the scaling group. If the instances are unevenly distributed across zones due to insufficient inventory or other reasons, you can call the RebalanceInstances operation to balance the resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
             * </li>
             * </ul>
             * <p>Default value: PRIORITY.</p>
             * 
             * <strong>example:</strong>
             * <p>BALANCE</p>
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances (on_demand_base_capacity). Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The subscription duration of nodes. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li>When <code>period_unit</code> is set to <code>Week</code>, valid values are 1, 2, 3, and 4.</li>
             * <li>When <code>period_unit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The billing period of nodes. This parameter is required when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li><code>Month</code>: Uses the month as the time unit.</li>
             * <li><code>Week</code>: Uses the week as the time unit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The operating system distribution. Valid values:</p>
             * <ul>
             * <li>CentOS</li>
             * <li>AliyunLinux</li>
             * <li>Windows</li>
             * <li>WindowsCore</li>
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
             * <p>The private node pool configurations.</p>
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the ram_role_name parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>KubernetesWorkerRole-021dc54f-929b-437a-8ae0-34c24d3e****</p>
             */
            public Builder ramPolicy(String ramPolicy) {
                this.ramPolicy = ramPolicy;
                return this;
            }

            /**
             * <p>The name of the worker RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>KubernetesWorkerRole-4a4fa089-80c1-48a5-b3c6-9349311f****</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>If ApsaraDB RDS instances are specified, the ECS instances of the cluster nodes are automatically added to the whitelist of the ApsaraDB RDS instances.</p>
             */
            public Builder rdsInstances(java.util.List<String> rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * <p>The resource pool and resource pool policies used when creating instances.</p>
             */
            public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
                this.resourcePoolOptions = resourcePoolOptions;
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
             * <p>The pattern of the scaling group. Valid values:</p>
             * <ul>
             * <li>release: Standard pattern. The scaling group scales by creating and releasing ECS instances based on the requested resource usage.</li>
             * <li>recycle: Swift pattern. The scaling group scales by creating, stopping, and starting instances to improve the speed of subsequent scaling operations. When an instance is stopped, you are not charged for compute resources, but you are still charged for storage resources, except for instances with local disks.</li>
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
             * <p>The security group ID of the node pool. If multiple security groups are bound to the node pool, this value is the first value in security_group_ids.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze60ockeekspl3d****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The list of security group IDs for the node pool.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
             * <ul>
             * <li>true: Enable Alibaba Cloud OS security hardening.</li>
             * <li>false: Do not enable Alibaba Cloud OS security hardening.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>Specifies whether to enable MLPS 2.0 security hardening. You can enable this feature for nodes only when the system image is Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3. Alibaba Cloud provides classified protection compliance baseline check standards and scanning programs for the Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 MLPS 2.0 Level 3 images.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>The number of available instance types specified. The scaling group evenly creates spot instances based on the most cost-effective instance types. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, if the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
             * <ul>
             * <li>true: Enable spot instance replenishment.</li>
             * <li>false: Disable spot instance replenishment.</li>
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
             * <p>The market price range configuration for spot instances.</p>
             */
            public Builder spotPriceLimit(java.util.List<SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The bidding strategy for spot instances. Valid values:</p>
             * <ul>
             * <li><code>NoSpot</code>: Regular pay-as-you-go instances.</li>
             * <li><code>SpotWithPriceLimit</code>: Sets a maximum price for spot instances.</li>
             * <li><code>SpotAsPriceGo</code>: Uses the current market price automatically.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>Specifies whether to enable burst mode for the system cloud disk of the node. This parameter is configured when the disk type is cloud_auto. Valid values:</p>
             * <ul>
             * <li>true: Enabled. After this feature is enabled, if the workload faces sudden data read and write pressure, the cloud disk temporarily improves its performance based on the actual workload conditions until the workload returns to a stable state.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>This parameter is supported only when system_disk_category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The categories of the system cloud disk. If a high-priority disk category is unavailable, the system automatically attempts to use the next priority disk category to create the system cloud disk.</p>
             */
            public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * <p>The category of the system cloud disk. Valid values:</p>
             * <ul>
             * <li><code>cloud_efficiency</code>: Ultra cloud disk.</li>
             * <li><code>cloud_ssd</code>: Standard SSD.</li>
             * <li><code>cloud_essd</code>: ESSD.</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The encryption algorithm used for the system cloud disk. Valid values: aes-256.</p>
             * 
             * <strong>example:</strong>
             * <p>aes-256</p>
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system cloud disk. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Encrypts the system cloud disk.</li>
             * <li><code>false</code>: Does not encrypt the system cloud disk.</li>
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
             * <p>The KMS key ID used for the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * <p>The performance level of the system cloud disk. This parameter takes effect only for ESSDs. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>. Valid values:</p>
             * <ul>
             * <li><code>PL0</code>: Medium concurrent I/O performance and relatively stable read/write latency.</li>
             * <li><code>PL1</code>: Medium concurrent I/O performance and relatively stable read/write latency.</li>
             * <li><code>PL2</code>: High concurrent I/O performance and stable read/write latency.</li>
             * <li><code>PL3</code>: Ultra-high concurrent I/O performance and ultra-stable read/write latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read and write IOPS for the system cloud disk of the node.</p>
             * <p>Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}. Baseline performance = min{1,800 + 50 × Capacity, 50000}.</p>
             * <p>This parameter is supported only when system_disk_category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB. Valid values: 20 to 2048.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The system cloud disk snapshot policy.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-bp11g8z59rawcud9****</p>
             */
            public Builder systemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
                this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The labels of the ECS instance.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs.</p>
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
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("last_transition_time")
        private String lastTransitionTime;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Conditions(Builder builder) {
            this.lastTransitionTime = builder.lastTransitionTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return lastTransitionTime
         */
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String lastTransitionTime; 
            private String message; 
            private String reason; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.lastTransitionTime = model.lastTransitionTime;
                this.message = model.message;
                this.reason = model.reason;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The time of the last status transition. The time is in the ISO 8601 format and includes time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>20**-**-30T10:39:00+08:00</p>
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * <p>The detailed information about the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>AutoUpgradeDisabled</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>UpgradeDisabled</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>ImageUpgradeReady</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
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
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

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
            this.conditions = builder.conditions;
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
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
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
            private java.util.List<Conditions> conditions; 
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
                this.conditions = model.conditions;
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
             * <p>The current conditions of the node pool, which indicate the status information of the node pool across different dimensions.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
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
             * <p>The number of working nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder servingNodes(Long servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * <p>The state of the node pool. Valid values:</p>
             * <ul>
             * <li><code>active</code>: The node pool is active.</li>
             * <li><code>scaling</code>: The node pool is scaling.</li>
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
             * <p>Specifies whether to enable the confidential computing cluster. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
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
