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
    @com.aliyun.core.annotation.NameInMap("auto_mode")
    private AutoMode autoMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("count")
    @Deprecated
    private Long count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eflo_node_group")
    private EfloNodeGroup efloNodeGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("host_network")
    private Boolean hostNetwork;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interconnect_config")
    @Deprecated
    private InterconnectConfig interconnectConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("interconnect_mode")
    private String interconnectMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("intranet")
    private Boolean intranet;

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
    @com.aliyun.core.annotation.NameInMap("node_components")
    private java.util.List<NodeComponents> nodeComponents;

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
        this.autoMode = builder.autoMode;
        this.autoScaling = builder.autoScaling;
        this.count = builder.count;
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
     * @return count
     */
    public Long getCount() {
        return this.count;
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
     * @return teeConfig
     */
    public TeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static final class Builder extends Request.Builder<CreateClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private AutoMode autoMode; 
        private AutoScaling autoScaling; 
        private Long count; 
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
        private TeeConfig teeConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.autoMode = request.autoMode;
            this.autoScaling = request.autoScaling;
            this.count = request.count;
            this.efloNodeGroup = request.efloNodeGroup;
            this.hostNetwork = request.hostNetwork;
            this.interconnectConfig = request.interconnectConfig;
            this.interconnectMode = request.interconnectMode;
            this.intranet = request.intranet;
            this.kubernetesConfig = request.kubernetesConfig;
            this.management = request.management;
            this.maxNodes = request.maxNodes;
            this.nodeComponents = request.nodeComponents;
            this.nodeConfig = request.nodeConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c61da77e8bfbc4c4c999af2b51b65****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The auto mode configuration of the node pool.</p>
         */
        public Builder autoMode(AutoMode autoMode) {
            this.putBodyParameter("auto_mode", autoMode);
            this.autoMode = autoMode;
            return this;
        }

        /**
         * <p>The elastic scaling configuration.</p>
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use desired_size instead.</p>
         * <p>The number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The Lingjun node pool configuration.</p>
         */
        public Builder efloNodeGroup(EfloNodeGroup efloNodeGroup) {
            this.putBodyParameter("eflo_node_group", efloNodeGroup);
            this.efloNodeGroup = efloNodeGroup;
            return this;
        }

        /**
         * <p>Specifies whether the pod network mode uses the host network mode. Valid values:</p>
         * <ul>
         * <li><code>true</code>: host network. Pods directly use the network stack of the host and share the IP address and ports with the host.</li>
         * <li><code>false</code>: container network. Pods have independent network stacks and do not occupy host network ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hostNetwork(Boolean hostNetwork) {
            this.putBodyParameter("host_network", hostNetwork);
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong></p>
         * <p>The configuration of the edge node pool.</p>
         */
        public Builder interconnectConfig(InterconnectConfig interconnectConfig) {
            this.putBodyParameter("interconnect_config", interconnectConfig);
            this.interconnectConfig = interconnectConfig;
            return this;
        }

        /**
         * <p>The network type of the edge node pool. This parameter takes effect only when <code>type</code> is set to <code>edge</code>. Valid values:</p>
         * <ul>
         * <li><code>basic</code>: Internet. Nodes in cloud node pool interact with cloud nodes over the Internet. Applications in cloud node pool cannot directly access the internal network of the cloud VPC.</li>
         * <li><code>private</code>: private network. Nodes in cloud node pool connect to the cloud network through Express Connect circuits, VPNs, or CEN, which provides higher cloud-edge communication quality and more effective security protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder interconnectMode(String interconnectMode) {
            this.putBodyParameter("interconnect_mode", interconnectMode);
            this.interconnectMode = interconnectMode;
            return this;
        }

        /**
         * <p>Specifies whether Layer 3 network connectivity is enabled between nodes in the edge node pool. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enabled. Layer 3 network connectivity is enabled between all nodes in the node pool.</li>
         * <li><code>false</code>: disabled. Layer 3 network connectivity is disabled between all hosts in the node pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder intranet(Boolean intranet) {
            this.putBodyParameter("intranet", intranet);
            this.intranet = intranet;
            return this;
        }

        /**
         * <p>The cluster configurations.</p>
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>The configurations for the managed node pool feature.</p>
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The maximum number of nodes that the edge node pool can accommodate.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder maxNodes(Long maxNodes) {
            this.putBodyParameter("max_nodes", maxNodes);
            this.maxNodes = maxNodes;
            return this;
        }

        /**
         * <p>The list of node components.</p>
         */
        public Builder nodeComponents(java.util.List<NodeComponents> nodeComponents) {
            this.putBodyParameter("node_components", nodeComponents);
            this.nodeComponents = nodeComponents;
            return this;
        }

        /**
         * <p>The node configuration.</p>
         */
        public Builder nodeConfig(NodeConfig nodeConfig) {
            this.putBodyParameter("node_config", nodeConfig);
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * <p>The node pool configuration.</p>
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            this.putBodyParameter("nodepool_info", nodepoolInfo);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * <p>The scaling group configuration of the node pool.</p>
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.putBodyParameter("scaling_group", scalingGroup);
            this.scalingGroup = scalingGroup;
            return this;
        }

        /**
         * <p>The confidential computing cluster configuration.</p>
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

    /**
     * 
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>Specifies whether to enable auto mode. Valid values:</p>
             * <ul>
             * <li>true: enables auto mode. This value is valid only when auto mode is enabled for the cluster.</li>
             * <li>false: disables auto mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
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
             * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
             * <p>The peak bandwidth of the EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder eipBandwidth(Long eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
             * <p>The billing method of the EIP. Valid values:</p>
             * <ul>
             * <li><code>PayByBandwidth</code>: pay-by-bandwidth.</li>
             * <li><code>PayByTraffic</code>: pay-by-data-transfer.</li>
             * </ul>
             * <p>Default value: <code>PayByBandwidth</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder eipInternetChargeType(String eipInternetChargeType) {
                this.eipInternetChargeType = eipInternetChargeType;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto scaling. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: enables auto scaling for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum numbers of instances. For clusters of version 1.24 and later, node instant elasticity is enabled by default. For clusters earlier than version 1.24, node auto scaling is enabled by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node auto scaling</a>.</p>
             * </li>
             * <li><p><code>false</code>: disables auto scaling. ACK adjusts the number of nodes in the node pool based on the configured expected number of nodes to keep the number of nodes at the expected value.</p>
             * </li>
             * </ul>
             * <p>If this parameter is set to false, other configuration parameters in <code>auto_scaling</code> do not take effect.</p>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead.</p>
             * <p>Specifies whether to associate an EIP. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: associates an EIP.</p>
             * </li>
             * <li><p><code>false</code>: does not associate an EIP.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder isBondEip(Boolean isBondEip) {
                this.isBondEip = isBondEip;
                return this;
            }

            /**
             * <p>The maximum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable</code> is set to true.</p>
             * <p>Valid values: [min_instances, 2000]. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxInstances(Long maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>The minimum number of scalable instances in the node pool, excluding existing instances. This parameter takes effect only when <code>enable</code> is set to true.</p>
             * <p>Valid values: [0, max_instances]. Default value: 0.</p>
             * <blockquote>
             * <ul>
             * <li>If the minimum number of instances is not 0, the automatic creation of the corresponding number of ECS instances occurs after the scaling group takes effect.</li>
             * <li>The recommended Settings for the maximum number of instances should not be less than the current number of nodes in the node pool. Otherwise, the elastic scaling feature scales in the nodes in the node pool immediately after it takes effect.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>The instance type for elastic scaling. This parameter takes effect only when <code>enable</code> is set to true. Valid values:</p>
             * <ul>
             * <li><p><code>cpu</code>: regular instance.</p>
             * </li>
             * <li><p><code>gpu</code>: GPU-accelerated instance.</p>
             * </li>
             * <li><p><code>gpushare</code>: GPU-shared instance.</p>
             * </li>
             * <li><p><code>spot</code>: spot instance.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>cpu</code>.</p>
             * <blockquote>
             * <p>Notice: This parameter cannot be modified after the node pool is created.</p>
             * </blockquote>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>Specifies whether to enable auto-attach for the Lingjun node pool.</p>
             */
            public Builder autoAttachEnabled(Boolean autoAttachEnabled) {
                this.autoAttachEnabled = autoAttachEnabled;
                return this;
            }

            /**
             * <p>The ID of the Lingjun cluster to associate when creating the Lingjun node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>i1169130516633730****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The ID of the Lingjun group in the Lingjun cluster to associate when creating the Lingjun node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-ec3c96ff0aa****</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p><strong>[Deprecated]</strong></p>
             * <p>The network bandwidth of the edge-enhanced node pool. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * <p>The instance ID of the Cloud Connect Network (CCN) attached to the edge-enhanced node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * <p>The region of the CCN instance associated with the edge-enhanced node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder ccnRegionId(String ccnRegionId) {
                this.ccnRegionId = ccnRegionId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * <p>The instance ID of the Cloud Enterprise Network (CEN) attached to the edge-enhanced node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong></p>
             * <p>The subscription duration of the edge-enhanced node pool. Unit: months.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After the agent is installed, you can view the monitoring information of the created ECS instances in the CloudMonitor console. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The CloudMonitor agent is installed on ECS nodes.</li>
             * <li><code>false</code>: The CloudMonitor agent is not installed on ECS nodes.
             * Default value: <code>false</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * <p>The CPU management policy for nodes. The following two policies are supported when the cluster version is 1.12.6 or later:</p>
             * <ul>
             * <li><code>static</code>: Allows you to enhance CPU affinity and exclusivity for pods with specific resource characteristics on the node.</li>
             * <li><code>none</code>: Uses the default CPU affinity scheme.
             * Default value: <code>none</code>.</li>
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
             * <p>The labels to be added to the nodes in the Kubernetes cluster.</p>
             */
            public Builder labels(java.util.List<Tag> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The custom node name. After you specify a custom node name, the node name, ECS instance name, and ECS instance hostname are changed accordingly.</p>
             * <blockquote>
             * <p>For Windows instances with custom node names enabled, the hostname is fixed to the IP address, with hyphens (-) replacing periods (.) in the IP address, and without prefixes or suffixes. </p>
             * </blockquote>
             * <p>The node name consists of a prefix, the node IP address, and a suffix:</p>
             * <ul>
             * <li>The total length is 2 to 64 characters. The node name must start and end with a lowercase letter or a digit.</li>
             * <li>The prefix and suffix can contain uppercase and lowercase letters, digits, hyphens (-), and periods (.). They must start with a letter and cannot start or end with a hyphen (-) or a period (.). Consecutive hyphens (-) or periods (.) are not allowed.</li>
             * <li>The prefix is required due to ECS limits, and the suffix is optional.</li>
             * <li>The node IP address is the complete private IP address of the node.</li>
             * </ul>
             * <p>For example, if the node IP address is 192.XX.YY.55, the prefix is aliyun.com, and the suffix is test:</p>
             * <ul>
             * <li>If the node is a Linux node, the node name, ECS instance name, and ECS instance hostname are all aliyun.com192.XX.YY.55test.</li>
             * <li>If the node is a Windows node, the ECS instance hostname is 192-XX-YY-55, and both the node name and ECS instance name are aliyun.com192.XX.YY.55test.</li>
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
             * <p>The pre-custom data of the instance. Before the node is added to the cluster, the specified pre-custom data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
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
             * <li><code>containerd</code>: Recommended. Supported by all cluster versions.</li>
             * <li><code>Sandboxed-Container.runv</code>: Secure sandboxed containers that provide higher isolation. Supported by clusters of version 1.31 and earlier.</li>
             * <li><code>docker</code>: Deprecated. Supported by clusters of version 1.22 and earlier.
             * Default value: <code>containerd</code>.</li>
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
             * <p>The taint configuration.</p>
             */
            public Builder taints(java.util.List<Taint> taints) {
                this.taints = taints;
                return this;
            }

            /**
             * <p>Specifies whether the scaled-out nodes are unschedulable. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The nodes are unschedulable.</li>
             * <li><code>false</code>: The nodes are schedulable.</li>
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
             * <p>The instance user data. After the node is added to the cluster, the specified instance user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dGhpcyBpcyBhIGV4YW1wbGU=</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>Specifies whether manual approval is required for node repair.</p>
             */
            public Builder approvalRequired(Boolean approvalRequired) {
                this.approvalRequired = approvalRequired;
                return this;
            }

            /**
             * <p>The ID of the auto-repair policy. If you do not specify this parameter or specify an empty string, no auto-healing rule is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>r-xxxxxxxxxx</p>
             */
            public Builder autoRepairPolicyId(String autoRepairPolicyId) {
                this.autoRepairPolicyId = autoRepairPolicyId;
                return this;
            }

            /**
             * <p>The maximum number of nodes or the percentage of nodes that can be repaired simultaneously when a large number of abnormal nodes exist in the node pool. You can specify a number (for example, 5, valid values: 1 to 100000) or a percentage (for example, 10%, valid values: 1% to 100%). Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxParallelRepairingNodes(String maxParallelRepairingNodes) {
                this.maxParallelRepairingNodes = maxParallelRepairingNodes;
                return this;
            }

            /**
             * <p>The circuit breaker threshold for auto-healing. When the number or percentage of faulty nodes exceeds this threshold, auto-healing enters the circuit breaker state and stops initiating new auto-healing repair actions. You can specify a number (for example, 10, valid values: 1 to 100000) or a percentage (for example, 20%, valid values: 1% to 100%). Default value: 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>20%</p>
             */
            public Builder maxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
                this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
                return this;
            }

            /**
             * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_repair is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows node restarts.</li>
             * <li><code>false</code>: Does not allow node restarts.
             * Default value: <code>true</code>.</li>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AutoUpgradePolicy model) {
                this.autoUpgradeKubelet = model.autoUpgradeKubelet;
                this.autoUpgradeOs = model.autoUpgradeOs;
                this.autoUpgradeRuntime = model.autoUpgradeRuntime;
            } 

            /**
             * <p>Specifies whether to allow automatic kubelet upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic kubelet upgrades.</li>
             * <li><code>false</code>: Does not allow automatic kubelet upgrades.
             * Default value: <code>true</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgradeKubelet(Boolean autoUpgradeKubelet) {
                this.autoUpgradeKubelet = autoUpgradeKubelet;
                return this;
            }

            /**
             * <p>Specifies whether to allow automatic operating system upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic operating system upgrades.</li>
             * <li><code>false</code>: Does not allow automatic operating system upgrades.
             * Default value: <code>false</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoUpgradeOs(Boolean autoUpgradeOs) {
                this.autoUpgradeOs = autoUpgradeOs;
                return this;
            }

            /**
             * <p>Specifies whether to allow automatic runtime upgrades. This parameter takes effect only when auto_upgrade is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic runtime upgrades.</li>
             * <li><code>false</code>: Does not allow automatic runtime upgrades.
             * Default value: <code>true</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The packages to be excluded during vulnerability repair. Default value: <code>kernel</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel</p>
             */
            public Builder excludePackages(String excludePackages) {
                this.excludePackages = excludePackages;
                return this;
            }

            /**
             * <p>Specifies whether to allow node restarts. This parameter takes effect only when auto_vul_fix is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows node restarts.</li>
             * <li><code>false</code>: Does not allow node restarts.
             * Default value: <code>true</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * <p>The vulnerability levels that are allowed for automatic repair, separated by commas. Example: <code>asap,later</code>. Valid values:</p>
             * <ul>
             * <li><code>asap</code>: High.</li>
             * <li><code>later</code>: Medium.</li>
             * <li><code>nntf</code>: Low.
             * Default value: <code>asap</code>.</li>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(UpgradeConfig model) {
                this.autoUpgrade = model.autoUpgrade;
                this.maxUnavailable = model.maxUnavailable;
                this.surge = model.surge;
                this.surgePercentage = model.surgePercentage;
            } 

            /**
             * <p><strong>[Deprecated]</strong> Use the auto_upgrade parameter at the upper level instead. Specifies whether to enable auto-upgrade. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables auto-upgrade.</li>
             * <li><code>false</code>: Disables auto-upgrade.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>The maximum number of unavailable nodes. Valid values: 1 to 1000. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxUnavailable(Long maxUnavailable) {
                this.maxUnavailable = maxUnavailable;
                return this;
            }

            /**
             * <p>The number of extra nodes. This parameter and surge_percentage are mutually exclusive. Nodes become unavailable during upgrades. You can create extra nodes to compensate for the cluster load.</p>
             * <blockquote>
             * <p>The number of extra nodes should not exceed the current number of nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * <p>The percentage of extra nodes. This parameter and surge are mutually exclusive. Number of extra nodes = Percentage of extra nodes × Number of nodes. For example, if the percentage of extra nodes is set to 50% and the current number of nodes is 6, the number of extra nodes generated is 50% × 6 = 3.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
        @Deprecated
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
             * <p>Specifies whether to enable ECS fault detection for node auto-healing.</p>
             */
            public Builder autoFaultDiagnosis(Boolean autoFaultDiagnosis) {
                this.autoFaultDiagnosis = autoFaultDiagnosis;
                return this;
            }

            /**
             * <p>Specifies whether to automatically repair nodes. This parameter takes effect only when enable is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Automatically repairs nodes.</li>
             * <li><code>false</code>: Does not automatically repair nodes.
             * Default value: <code>true</code>.</li>
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
             * <p>The auto-repair policy for nodes.</p>
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when enable is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables auto-upgrade.</li>
             * <li><code>false</code>: Disables auto-upgrade.
             * Default value: <code>true</code>.</li>
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
             * <p>The auto-upgrade policy for nodes.</p>
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically repair CVE vulnerabilities. This parameter takes effect only when enable is set to true. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic CVE repair.</li>
             * <li><code>false</code>: Does not allow automatic CVE repair.
             * Default value: <code>true</code>.</li>
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
             * <p>The auto-repair policy for CVE vulnerabilities.</p>
             */
            public Builder autoVulFixPolicy(AutoVulFixPolicy autoVulFixPolicy) {
                this.autoVulFixPolicy = autoVulFixPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the node rotation feature. This feature is supported only by intelligent managed node pools and is enabled by default. It is not supported by regular node pools.</p>
             */
            public Builder driftEnabled(Boolean driftEnabled) {
                this.driftEnabled = driftEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the managed node pool feature. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables the managed node pool feature.</li>
             * <li><code>false</code>: Disables the managed node pool feature. Other related configurations take effect only when this parameter is set to true.
             * Default value: <code>false</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the auto_upgrade parameter at the upper level instead. The auto-upgrade configuration. This parameter takes effect only when enable is set to true.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
    public static class NodeComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private NodeComponents(Builder builder) {
            this.config = builder.config;
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
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(NodeComponents model) {
                this.config = model.config;
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
    public static class NodeOsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hugepage")
        private Hugepage hugepage;

        @com.aliyun.core.annotation.NameInMap("sysctl")
        private java.util.Map<String, ?> sysctl;

        private NodeOsConfig(Builder builder) {
            this.hugepage = builder.hugepage;
            this.sysctl = builder.sysctl;
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

        /**
         * @return sysctl
         */
        public java.util.Map<String, ?> getSysctl() {
            return this.sysctl;
        }

        public static final class Builder {
            private Hugepage hugepage; 
            private java.util.Map<String, ?> sysctl; 

            private Builder() {
            } 

            private Builder(NodeOsConfig model) {
                this.hugepage = model.hugepage;
                this.sysctl = model.sysctl;
            } 

            /**
             * <p>The Transparent HugePages configuration.</p>
             */
            public Builder hugepage(Hugepage hugepage) {
                this.hugepage = hugepage;
                return this;
            }

            /**
             * <p>The sysctl kernel parameter settings. Only specific kernel parameters are supported, and the cluster version must be 1.28 or later.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fs.file-max&quot;:&quot;1048576&quot;}</p>
             */
            public Builder sysctl(java.util.Map<String, ?> sysctl) {
                this.sysctl = sysctl;
                return this;
            }

            public NodeOsConfig build() {
                return new NodeOsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The operating system configuration of the node.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.type = model.type;
            } 

            /**
             * <p>The name of the node pool.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>nodepool-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the node pool belongs. Instances added to the node pool belong to this resource group.</p>
             * <p>A resource can belong to only one resource group. You can map resource groups to concepts such as projects, applications, or organizations based on your business scenarios.</p>
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
             * <li><code>ess</code>: standard node pool, which supports managed features and automatic elastic scaling.</li>
             * <li><code>edge</code>: edge node pool.</li>
             * <li><code>lingjun</code>: Lingjun node pool.</li>
             * <li><code>hybrid</code>: hybrid cloud node pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ess</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>Specifies whether to enable nested virtualization. Valid values: disabled: disables nested virtualization. enabled: enables nested virtualization.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The ID of the private pool. When <code>match_criteria</code> is set to <code>Target</code>, you must specify the private pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The private pool capacity matching mode for instance startup. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for you to select when you start instances. Valid values:</p>
             * <ul>
             * <li><code>Open</code>: open mode. The system automatically matches the capacity of an open private pool. If no eligible private pool capacity is available, the system uses public pool resources to start the instances.</li>
             * <li><code>Target</code>: specified mode. The system uses the capacity of the specified private pool to start instances. If the specified private pool capacity is unavailable, the instances fail to start.</li>
             * <li><code>None</code>: no private pool mode. The system does not use private pool capacity to start instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Target</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The list of private pool IDs, which are the IDs of elasticity assurances or capacity reservations. You can specify only the IDs of private pools in Target mode. Valid values of N: 1 to 20.</p>
             */
            public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>The resource pool strategy used when creating instances. Resource pools include private pools generated after elasticity assurances or capacity reservations take effect, as well as public pools, which are available for selection during instance startup. Valid values:
             * PrivatePoolFirst: Private pool first. When this strategy is selected and resouce_pool_options.private_pool_ids is specified, the specified private pools are used first. If no private pool is specified or the specified private pools have insufficient capacity, open private pools are automatically matched. If no eligible private pool is available, the public pool is used to create the instance.
             * PrivatePoolOnly: Private pool only. When this strategy is selected, resouce_pool_options.private_pool_ids must be specified. If the specified private pools have insufficient capacity, the instance fails to start.
             * None: No resource pool strategy is used.
             * Default value: None.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The spot instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price per instance.
             * &lt;props=&quot;china&quot;&gt;Unit: CNY/hour.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>node-k-1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>node-v-1</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("instance_metadata_options")
        private InstanceMetadataOptions instanceMetadataOptions;

        @com.aliyun.core.annotation.NameInMap("instance_patterns")
        private java.util.List<InstancePatterns> instancePatterns;

        @com.aliyun.core.annotation.NameInMap("instance_types")
        @com.aliyun.core.annotation.Validation(required = true)
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
        @Deprecated
        private String platform;

        @com.aliyun.core.annotation.NameInMap("private_pool_options")
        private PrivatePoolOptions privatePoolOptions;

        @com.aliyun.core.annotation.NameInMap("ram_role_name")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("rds_instances")
        private java.util.List<String> rdsInstances;

        @com.aliyun.core.annotation.NameInMap("resource_pool_options")
        private ResourcePoolOptions resourcePoolOptions;

        @com.aliyun.core.annotation.NameInMap("scaling_policy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        @Deprecated
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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        @com.aliyun.core.annotation.Validation(required = true)
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
            this.ramRoleName = builder.ramRoleName;
            this.rdsInstances = builder.rdsInstances;
            this.resourcePoolOptions = builder.resourcePoolOptions;
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
        public java.util.List<Tags> getTags() {
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
            private String ramRoleName; 
            private java.util.List<String> rdsInstances; 
            private ResourcePoolOptions resourcePoolOptions; 
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
            private java.util.List<Tags> tags; 
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
                this.ramRoleName = model.ramRoleName;
                this.rdsInstances = model.rdsInstances;
                this.resourcePoolOptions = model.resourcePoolOptions;
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
             * <p>Specifies whether to enable auto-renewal for nodes in the node pool. This parameter takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enables auto-renewal.</li>
             * <li><code>false</code>: disables auto-renewal.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The duration of each auto-renewal cycle. Valid values:</p>
             * <ul>
             * <li>When PeriodUnit is set to Week: 1, 2, and 3.</li>
             * <li>When PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the <code>security_hardening_os</code> parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder cisEnabled(Boolean cisEnabled) {
                this.cisEnabled = cisEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when spot instances cannot be created due to price or inventory issues, provided that <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: automatically creates pay-as-you-go instances to meet the required number of ECS instances.</li>
             * <li><code>false</code>: does not automatically create pay-as-you-go instances.</li>
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
             * <p>The data cloud disk configuration for nodes in the node pool.</p>
             */
            public Builder dataDisks(java.util.List<DataDisk> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The ID of the deployment set. You can use a deployment set to distribute ECS instances created by the node pool across different physical servers to ensure high availability and underlying disaster recovery capabilities. When you create ECS instances in a deployment set, the instances are distributed and started in the specified region based on the predefined deployment policy.</p>
             * <blockquote>
             * <p>Notice: After you select a deployment set, the maximum number of nodes in the node pool is limited. By default, a deployment set supports a maximum of 20 × the number of zones nodes. The number of zones is determined by the vSwitches. Proceed with caution and ensure that the quota in the deployment set is sufficient to prevent node scale-out failures.</p>
             * </blockquote>
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
             * <p>This is the total number of nodes that the node pool should maintain. We recommend that you configure at least two nodes to ensure the normal operation of cluster components. You can scale out or scale in the node pool by adjusting the expected number of nodes.</p>
             * <p>If you do not need to create nodes, set this parameter to 0 and manually increase the number of nodes later.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Specifies whether to enable the high-density cloud disk mode. This mode is supported only when the node pool uses instance types. After this mode is enabled, the total number of system cloud disks and data cloud disks does not exceed the maximum number of high-density cloud disks supported by the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableHighDensityMode(Boolean enableHighDensityMode) {
                this.enableHighDensityMode = enableHighDensityMode;
                return this;
            }

            /**
             * <p>The ID of the custom image. By default, the system-provided image is used.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the operating system image. Valid values:</p>
             * <ul>
             * <li><code>AliyunLinux</code>: Alinux2 image.</li>
             * <li><code>AliyunLinuxSecurity</code>: Alinux2 UEFI image.</li>
             * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
             * <li><code>AliyunLinux3Arm64</code>: Alinux3 ARM image.</li>
             * <li><code>AliyunLinux3Security</code>: Alinux3 UEFI image.</li>
             * <li><code>CentOS</code>: CentOS image.</li>
             * <li><code>Windows</code>: Windows image.</li>
             * <li><code>WindowsCore</code>: Windows Core image.</li>
             * <li><code>ContainerOS</code>: container-optimized image.</li>
             * <li><code>AliyunLinux3ContainerOptimized</code>: Alinux3 container-optimized image.</li>
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
             * <li><p><code>PrePaid</code>: subscription.</p>
             * </li>
             * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>PostPaid</code>.</p>
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
             * <p>The instance metadata access configuration for ECS instances.</p>
             */
            public Builder instanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
                this.instanceMetadataOptions = instanceMetadataOptions;
                return this;
            }

            /**
             * <p>The instance property configuration.</p>
             */
            public Builder instancePatterns(java.util.List<InstancePatterns> instancePatterns) {
                this.instancePatterns = instancePatterns;
                return this;
            }

            /**
             * <p>The list of instance types for nodes in the node pool. When the node pool scales out nodes, it selects instance types that meet the requirements from the specified list to create instances.</p>
             * <p>Valid values for the number of instance types: 1 to 10.</p>
             * <blockquote>
             * <p>To ensure high availability, we recommend that you select multiple instance types.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The billing method for public IP addresses. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: pay-by-bandwidth.</li>
             * <li>PayByTraffic: pay-by-data-transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The maximum outbound bandwidth for public IP addresses of nodes. Unit: Mbit/s. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The name of the key pair used for password-free logon. You must specify either this parameter or <code>login_password</code>.</p>
             * <blockquote>
             * <p>If the node pool uses the ContainerOS operating system, only <code>key_pair</code> is supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>np-key-name</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>Specifies whether to log on to the created ECS instances as a non-root user.</p>
             * <ul>
             * <li><p>true: logs on as a non-root user (ecs-user).</p>
             * </li>
             * <li><p>false: logs on as the root user.</p>
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
             * <p>The SSH logon password. You must specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
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
             * <li><p><code>PRIORITY</code>: scales ECS instances based on the vSwitches (VSwitchIds.N) that you specify. If ECS instances cannot be created in the zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</p>
             * </li>
             * <li><p><code>COST_OPTIMIZED</code>: creates ECS instances based on the vCPU unit price in ascending order. When the scaling configuration specifies multiple instance types with the preemptible billing method, the system preferentially creates spot instances. You can use the <code>CompensateWithOnDemand</code> parameter to specify if it is to automatically create pay-as-you-go instances when spot instances cannot be created due to inventory shortages or other reasons.</p>
             * <blockquote>
             * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
             * </blockquote>
             * </li>
             * <li><p><code>BALANCE</code>: evenly allocates ECS instances across the zones specified in the scaling group. If the zones become unbalanced due to inventory shortages or other reasons, you can call the <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a> API operation to balance the resources.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>PRIORITY</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>COST_OPTIMIZED</p>
             */
            public Builder multiAzPolicy(String multiAzPolicy) {
                this.multiAzPolicy = multiAzPolicy;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances required by the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than this value, the system preferentially creates pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances (<code>on_demand_base_capacity</code>). Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The subscription duration of nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <ul>
             * <li>When <code>period_unit</code> is set to <code>Week</code>, valid values for <code>period</code> are 1, 2, 3, and 4.</li>
             * <li>When <code>period_unit</code> is set to <code>Month</code>, valid values for <code>period</code> are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The billing cycle of nodes in the node pool. This parameter is required and takes effect only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <ul>
             * <li><code>Month</code>: month.</li>
             * <li><code>Week</code>: week.</li>
             * </ul>
             * <p>Default value: <code>Month</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the <code>image_type</code> parameter instead.</p>
             * <p>The operating system distribution. Valid values:</p>
             * <ul>
             * <li><code>CentOS</code></li>
             * <li><code>AliyunLinux</code></li>
             * <li><code>Windows</code></li>
             * <li><code>WindowsCore</code></li>
             * </ul>
             * <p>Default value: <code>AliyunLinux</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The private pool configuration.</p>
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
                return this;
            }

            /**
             * <p>The name of the worker RAM role.</p>
             * <ul>
             * <li>If this parameter is left empty, the default worker RAM role created for the cluster is used.</li>
             * <li>If this parameter is specified, the RAM role must be a <strong>normal service role</strong> and its <strong>trusted service</strong> must be set to <strong>ECS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a normal service role</a>. If the specified RAM role is not the default worker RAM role created for the cluster, the role name cannot start with <code>KubernetesMasterRole-</code> or <code>KubernetesWorkerRole-</code>.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: This parameter is supported only by ACK managed clusters of version 1.22 and later.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example-role</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The list of ApsaraDB RDS instances.</p>
             */
            public Builder rdsInstances(java.util.List<String> rdsInstances) {
                this.rdsInstances = rdsInstances;
                return this;
            }

            /**
             * <p>The resource pool and resource pool policy used for instance creation. Take note of the following items when you configure this parameter:
             * This parameter takes effect only when you create pay-as-you-go instances.
             * This parameter cannot be specified together with private_pool_options.match_criteria or private_pool_options.id.</p>
             */
            public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
                this.resourcePoolOptions = resourcePoolOptions;
                return this;
            }

            /**
             * <p>The scaling group mode. Valid values:</p>
             * <ul>
             * <li><code>release</code>: Standard mode. Instances are scaled by creating and releasing ECS instances based on the requested resource usage.</li>
             * <li><code>recycle</code>: Extreme mode. Instances are scaled by creating, stopping, and starting instances to improve the speed of subsequent scaling operations. When an instance is stopped, compute resources are not billed, and only storage fees are charged, except for instances with local disks.
             * Default value: <code>release</code>.</li>
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
             * <p>The security group ID of the node pool. Specify either this parameter or security_group_ids. We recommend that you use security_group_ids.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz9a8g2mt6x5llu0****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The list of security group IDs. Specify either this parameter or security_group_id. We recommend that you use security_group_ids. If both security_group_id and security_group_ids are specified, security_group_ids takes precedence.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>Specifies whether to enable Alibaba Cloud OS security hardening. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables Alibaba Cloud OS security hardening.</li>
             * <li><code>false</code>: Does not enable Alibaba Cloud OS security hardening.
             * Default value: <code>false</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>Specifies whether to enable MLPS 2.0 security hardening. You can enable MLPS 2.0 security hardening for nodes only when the system image is Alibaba Cloud Linux 2 or Alibaba Cloud Linux 3. Alibaba Cloud provides baseline check standards and scanning programs for classified protection compliance for Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 MLPS 2.0 Level 3 images.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>The number of available instance types. The scaling group evenly creates spot instances across multiple instance types with the lowest costs. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Specifies whether to enable spot instance replenishment. After this feature is enabled, when the scaling group receives a system message that a spot instance will be reclaimed, it attempts to create a new instance to replace the spot instance to be reclaimed. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables spot instance replenishment.</li>
             * <li><code>false</code>: Does not enable spot instance replenishment.</li>
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
             * <p>The market price range configuration for a single spot instance type.</p>
             */
            public Builder spotPriceLimit(java.util.List<SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The spot instance strategy. Valid values:</p>
             * <ul>
             * <li><code>NoSpot</code>: Non-spot instance.</li>
             * <li><code>SpotWithPriceLimit</code>: Sets a maximum price for spot instances.</li>
             * <li><code>SpotAsPriceGo</code>: The system automatically bids based on the current market price.
             * For more information, see <a href="https://help.aliyun.com/document_detail/165053.html">Spot instances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>Specifies whether to enable performance burst for the node system disk. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.
             * This parameter is supported only when system_disk_category is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The categories of the system disk. If a higher-priority disk category is unavailable, the system automatically attempts to use the next priority disk category to create the system disk.</p>
             */
            public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * <p>The category of the node system disk. Valid values:</p>
             * <ul>
             * <li><code>cloud_efficiency</code>: Ultra cloud disk.</li>
             * <li><code>cloud_ssd</code>: Standard SSD.</li>
             * <li><code>cloud_essd</code>: ESSD.</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.
             * Default value: <code>cloud_efficiency</code>.</li>
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
             * <p>The encryption algorithm used for the system disk. Valid values: aes-256.</p>
             * 
             * <strong>example:</strong>
             * <p>aes-256</p>
             */
            public Builder systemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
                this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the system disk. Valid values:</p>
             * <ul>
             * <li>true: Encrypts the system disk.</li>
             * <li>false: Does not encrypt the system disk.</li>
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
             * <p>The ID of the KMS key used for the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * <p>The performance level of the node system disk. This parameter takes effect only for ESSD cloud disks. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>. Valid values:</p>
             * <ul>
             * <li>PL0: Medium concurrent I/O performance and relatively stable read/write latency.</li>
             * <li>PL1: Medium concurrent I/O performance and relatively stable read/write latency.</li>
             * <li>PL2: High concurrent I/O performance and stable read/write latency.</li>
             * <li>PL3: Extremely high concurrent I/O performance and highly stable read/write latency.</li>
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
             * <p>The provisioned read/write IOPS for the node system disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50000}.
             * This parameter is supported only when system_disk_category is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the node system disk. Unit: GiB. Valid values: 20 to 2048.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The snapshot policy for the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-0jl6xnmme8v7o935****</p>
             */
            public Builder systemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
                this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
                return this;
            }

            /**
             * <p>Adds tags only to ECS instances. Tag keys must be unique and can be up to 128 characters in length. Neither tag keys nor tag values can start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs. Valid values: 1 to 8.</p>
             * <blockquote>
             * <p>To ensure high availability, we recommend that you select vSwitches in different zones.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <li>true: Enables confidential computing.</li>
             * <li>false: Does not enable confidential computing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
