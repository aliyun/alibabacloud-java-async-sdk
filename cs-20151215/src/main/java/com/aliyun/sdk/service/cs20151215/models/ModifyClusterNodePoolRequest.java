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
 * {@link ModifyClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterNodePoolRequest</p>
 */
public class ModifyClusterNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_scaling")
    private AutoScaling autoScaling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("concurrency")
    private Boolean concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("eflo_node_group")
    private EfloNodeGroup efloNodeGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubernetes_config")
    private KubernetesConfig kubernetesConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("management")
    private Management management;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_info")
    private NodepoolInfo nodepoolInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scaling_group")
    private ScalingGroup scalingGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tee_config")
    private TeeConfig teeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("update_nodes")
    private Boolean updateNodes;

    private ModifyClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.autoScaling = builder.autoScaling;
        this.concurrency = builder.concurrency;
        this.efloNodeGroup = builder.efloNodeGroup;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.management = builder.management;
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
     * @return concurrency
     */
    public Boolean getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return efloNodeGroup
     */
    public EfloNodeGroup getEfloNodeGroup() {
        return this.efloNodeGroup;
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
        private Boolean concurrency; 
        private EfloNodeGroup efloNodeGroup; 
        private KubernetesConfig kubernetesConfig; 
        private Management management; 
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
            this.concurrency = request.concurrency;
            this.efloNodeGroup = request.efloNodeGroup;
            this.kubernetesConfig = request.kubernetesConfig;
            this.management = request.management;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
            this.teeConfig = request.teeConfig;
            this.updateNodes = request.updateNodes;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c23421cfa74454bc8b37163fd19af****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p31da1b38983f4511b490fc62108a****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The auto scaling configuration.</p>
         */
        public Builder autoScaling(AutoScaling autoScaling) {
            this.putBodyParameter("auto_scaling", autoScaling);
            this.autoScaling = autoScaling;
            return this;
        }

        /**
         * <p>Specifies whether to enable concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder concurrency(Boolean concurrency) {
            this.putBodyParameter("concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The Lingjun AI Computing Service node pool configuration. (Not effective)</p>
         */
        public Builder efloNodeGroup(EfloNodeGroup efloNodeGroup) {
            this.putBodyParameter("eflo_node_group", efloNodeGroup);
            this.efloNodeGroup = efloNodeGroup;
            return this;
        }

        /**
         * <p>The cluster-related configuration.</p>
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            this.putBodyParameter("kubernetes_config", kubernetesConfig);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>The managed node pool configuration.</p>
         */
        public Builder management(Management management) {
            this.putBodyParameter("management", management);
            this.management = management;
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

        /**
         * <p>Specifies whether to synchronously update node labels and taints.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

    /**
     * 
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
        @Deprecated
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
             * <p><strong>[Deprecated]</strong> Use internet_charge_type and internet_max_bandwidth_out instead. The peak bandwidth of the EIP.</p>
             * <p>Valid values: [1, 100]. Unit: Mbit/s.</p>
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
             * <li><code>PayByBandwidth</code>: Pay-by-bandwidth.</li>
             * <li><code>PayByTraffic</code>: Pay-by-traffic.</li>
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
             * <li><p><code>true</code>: Enables the auto scaling feature for the node pool. When the capacity planning of the cluster cannot meet the scheduling requirements of application pods, ACK automatically scales node resources based on the configured minimum and maximum instance counts. Clusters of version 1.24 or later use instant node scaling by default. Clusters of versions earlier than 1.24 use auto scaling by default. For more information, see <a href="https://help.aliyun.com/document_detail/2746785.html">Node scaling</a>.</p>
             * </li>
             * <li><p><code>false</code>: Disables auto scaling. ACK adjusts the number of nodes in the node pool based on the configured desired node count and maintains the node count at the desired value.</p>
             * </li>
             * </ul>
             * <p>When this parameter is set to false, other configuration parameters in <code>auto_scaling</code> do not take effect.</p>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated. Use internet_charge_type and internet_max_bandwidth_out instead.</p>
             * <ul>
             * <li><code>true</code>: Associates an EIP.</li>
             * <li><code>false</code>: Does not associate an EIP.</li>
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
             * <p>The maximum number of scalable instances in the node pool, excluding your existing instances. This parameter takes effect only when <code>enable=true</code>.</p>
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
             * <p>The minimum number of scalable instances in the node pool, excluding your existing instances. This parameter takes effect only when <code>enable=true</code>.</p>
             * <p>Valid values: [0, max_instances]. Default value: 0.</p>
             * <blockquote>
             * <ul>
             * <li>If the minimum number of instances is not 0, the corresponding number of ECS instances are automatically created after the scaling group takes effect.</li>
             * <li>Set the maximum number of instances to a value that is not less than the current number of nodes in the node pool. Otherwise, nodes in the node pool are scaled in after the elastic scaling feature takes effect.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minInstances(Long minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>The auto scaling type, classified by instance type. Valid values:</p>
             * <ul>
             * <li><code>cpu</code>: Regular instance type.</li>
             * <li><code>gpu</code>: GPU instance type.</li>
             * <li><code>gpushare</code>: GPU sharing type.</li>
             * <li><code>spot</code>: Spot instance type.</li>
             * </ul>
             * <p>Default value: <code>cpu</code>.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
     */
    public static class EfloNodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_attach_enabled")
        private String autoAttachEnabled;

        private EfloNodeGroup(Builder builder) {
            this.autoAttachEnabled = builder.autoAttachEnabled;
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
        public String getAutoAttachEnabled() {
            return this.autoAttachEnabled;
        }

        public static final class Builder {
            private String autoAttachEnabled; 

            private Builder() {
            } 

            private Builder(EfloNodeGroup model) {
                this.autoAttachEnabled = model.autoAttachEnabled;
            } 

            /**
             * <p>Specifies whether to enable automatic addition of the Lingjun AI Computing Service node pool. (Not effective)</p>
             */
            public Builder autoAttachEnabled(String autoAttachEnabled) {
                this.autoAttachEnabled = autoAttachEnabled;
                return this;
            }

            public EfloNodeGroup build() {
                return new EfloNodeGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>Specifies whether to install the CloudMonitor agent on ECS nodes. After installation, you can view monitoring information about the created ECS instances in the CloudMonitor console. We recommend that you enable this feature. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Installs the CloudMonitor agent on ECS nodes.</li>
             * <li><code>false</code>: Does not install the CloudMonitor agent on ECS nodes.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cmsEnabled(Boolean cmsEnabled) {
                this.cmsEnabled = cmsEnabled;
                return this;
            }

            /**
             * <p>The CPU management policy for nodes. The following two policies are supported for clusters of version 1.12.6 and later:</p>
             * <ul>
             * <li><code>static</code>: Allows pods with certain resource characteristics on the node to be granted enhanced CPU affinity and exclusivity.</li>
             * <li><code>none</code>: Enables the existing default CPU affinity scheme.</li>
             * </ul>
             * <p>Default value: <code>none</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * <p>The node labels. You can add labels to the nodes in the Kubernetes cluster. Label definition rules:</p>
             * <ul>
             * <li>Labels are case-sensitive key-value pairs. You can set up to 20 labels.</li>
             * <li>Label keys must be unique and can be up to 64 characters in length. Label values can be empty and can be up to 128 characters in length. Label keys and label values cannot start with <code>aliyun</code>, <code>acs:</code>, <code>https://</code>, or <code>http://</code>. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
             * </ul>
             */
            public Builder labels(java.util.List<Tag> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The custom node name parameter. A node name consists of three parts: prefix + node IP + suffix.</p>
             * <p>Both the prefix and suffix can consist of one or more parts separated by &quot;.&quot;. Each part can contain lowercase letters, digits, and hyphens (-). The node name must start and end with a lowercase letter or digit. The node IP is the complete private IP address of the node.</p>
             * <p>The parameter contains four parts separated by commas. For example, if you pass in the string &quot;customized,aliyun,ip,com&quot; (where &quot;customized&quot; and &quot;ip&quot; are fixed strings, &quot;aliyun&quot; is the prefix, and &quot;com&quot; is the suffix), the node name is: aliyun.192.168.xxx.xxx.com.</p>
             * 
             * <strong>example:</strong>
             * <p>customized,aliyun,ip,com</p>
             */
            public Builder nodeNameMode(String nodeNameMode) {
                this.nodeNameMode = nodeNameMode;
                return this;
            }

            /**
             * <p>The pre-user data of the instance. Before a node joins the cluster, the specified pre-user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * <p>The container runtime name. ACK supports the following three container runtimes:</p>
             * <ul>
             * <li>containerd: Recommended. Supported by all cluster versions.</li>
             * <li>Sandboxed-Container.runv: Sandboxed container that provides higher isolation. Supported by clusters of version 1.31 and earlier.</li>
             * <li>docker: No longer maintained. Supported by clusters of version 1.22 and earlier.</li>
             * </ul>
             * <p>Default value: containerd.</p>
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
             * <p>The taint configuration for nodes.</p>
             */
            public Builder taints(java.util.List<Taint> taints) {
                this.taints = taints;
                return this;
            }

            /**
             * <p>Specifies whether the nodes added after the scale-out are unschedulable.</p>
             * <ul>
             * <li><p>true: Unschedulable.</p>
             * </li>
             * <li><p>false: Schedulable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder unschedulable(Boolean unschedulable) {
                this.unschedulable = unschedulable;
                return this;
            }

            /**
             * <p>The instance user data. After a node joins the cluster, the specified instance user data script is run. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">User data scripts</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFDSyEi</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>The ID of the auto repair policy.</p>
             * 
             * <strong>example:</strong>
             * <p>r-xxxxxxxxxx</p>
             */
            public Builder autoRepairPolicyId(String autoRepairPolicyId) {
                this.autoRepairPolicyId = autoRepairPolicyId;
                return this;
            }

            /**
             * <p>The maximum number of parallel repairs. When a large number of unhealthy nodes exist in the node pool, this specifies the maximum number or percentage of nodes that can be repaired simultaneously. You can specify a quantity (such as 5, valid range: 1 to 100000) or a percentage (such as 10%, valid range: 1% to 100%). Default value on the backend: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxParallelRepairingNodes(String maxParallelRepairingNodes) {
                this.maxParallelRepairingNodes = maxParallelRepairingNodes;
                return this;
            }

            /**
             * <p>The self-healing circuit breaker condition. When the number or percentage of faulty nodes exceeds this threshold, self-healing enters a circuit breaker state and stops initiating new repair actions. You can specify a quantity (such as 10, valid range: 1 to 100000) or a percentage (such as 20%, valid range: 1% to 100%). Default circuit breaker condition on the backend: 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>20%</p>
             */
            public Builder maxUnhealthyNodesThreshold(String maxUnhealthyNodesThreshold) {
                this.maxUnhealthyNodesThreshold = maxUnhealthyNodesThreshold;
                return this;
            }

            /**
             * <p>Specifies whether to allow node restarts. This parameter takes effect only when <code>auto_repair=true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows node restarts.</li>
             * <li><code>false</code>: Does not allow node restarts.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>Specifies whether to allow automatic kubelet upgrade. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic kubelet upgrade.</li>
             * <li><code>false</code>: Does not allow automatic kubelet upgrade.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgradeKubelet(Boolean autoUpgradeKubelet) {
                this.autoUpgradeKubelet = autoUpgradeKubelet;
                return this;
            }

            /**
             * <p>Specifies whether to allow automatic operating system upgrade. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic operating system upgrade.</li>
             * <li><code>false</code>: Does not allow automatic operating system upgrade.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoUpgradeOs(Boolean autoUpgradeOs) {
                this.autoUpgradeOs = autoUpgradeOs;
                return this;
            }

            /**
             * <p>Specifies whether to allow automatic runtime upgrade. This parameter takes effect only when <code>auto_upgrade=true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows automatic runtime upgrade.</li>
             * <li><code>false</code>: Does not allow automatic runtime upgrade.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>The packages to exclude during vulnerability fix.</p>
             * <p>Default value: <code>kernel</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel</p>
             */
            public Builder excludePackages(String excludePackages) {
                this.excludePackages = excludePackages;
                return this;
            }

            /**
             * <p>Specifies whether to allow node restarts. This parameter takes effect only when <code>auto_vul_fix=true</code>. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows node restarts.</li>
             * <li><code>false</code>: Does not allow node restarts.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restartNode(Boolean restartNode) {
                this.restartNode = restartNode;
                return this;
            }

            /**
             * <p>The vulnerability levels allowed for automatic fix, separated by commas. Example: <code>asap,later</code>. Supported vulnerability levels:</p>
             * <ul>
             * <li><code>asap</code>: high</li>
             * <li><code>later</code>: medium</li>
             * <li><code>nntf</code>: low</li>
             * </ul>
             * <p>Default value: <code>asap</code>.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p><strong>[Deprecated]</strong> Use the <code>auto_upgrade</code> parameter at the upper level instead.</p>
             * <p>Specifies whether to enable automatic upgrade:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>The maximum number of unavailable nodes.</p>
             * <p>Valid values: [1,1000\]</p>
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
             * <p>The number of extra nodes. Specify either this parameter or <code>surge_percentage</code>.</p>
             * <p>Nodes become unavailable during an upgrade. You can create extra nodes to compensate for the cluster load.</p>
             * <blockquote>
             * <p>The number of extra nodes should not exceed the current number of nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder surge(Long surge) {
                this.surge = surge;
                return this;
            }

            /**
             * <p>The percentage of extra nodes. Specify either this parameter or <code>surge</code>.</p>
             * <p>Number of extra nodes = percentage of extra nodes × number of nodes. For example, if the percentage of extra nodes is set to 50% and 6 nodes exist, the number of extra nodes = 50% × 6 = 3.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>Specifies whether to enable ECS fault detection for node self-healing.</p>
             */
            public Builder autoFaultDiagnosis(Boolean autoFaultDiagnosis) {
                this.autoFaultDiagnosis = autoFaultDiagnosis;
                return this;
            }

            /**
             * <p>Specifies whether to automatically repair nodes. This parameter takes effect only when <code>enable=true</code>.</p>
             * <ul>
             * <li><p><code>true</code>: Enables automatic repair.</p>
             * </li>
             * <li><p><code>false</code>: Disables automatic repair.</p>
             * </li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRepair(Boolean autoRepair) {
                this.autoRepair = autoRepair;
                return this;
            }

            /**
             * <p>The auto repair node policy.</p>
             */
            public Builder autoRepairPolicy(AutoRepairPolicy autoRepairPolicy) {
                this.autoRepairPolicy = autoRepairPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically upgrade nodes. This parameter takes effect only when <code>enable=true</code>.</p>
             * <ul>
             * <li><code>true</code>: Enables automatic upgrade.</li>
             * <li><code>false</code>: Disables automatic upgrade.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoUpgrade(Boolean autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>The auto upgrade policy.</p>
             */
            public Builder autoUpgradePolicy(AutoUpgradePolicy autoUpgradePolicy) {
                this.autoUpgradePolicy = autoUpgradePolicy;
                return this;
            }

            /**
             * <p>Specifies whether to automatically fix CVE vulnerabilities. This parameter takes effect only when <code>enable=true</code>.</p>
             * <ul>
             * <li><code>true</code>: Allows automatic CVE fixes.</li>
             * <li><code>false</code>: Does not allow automatic CVE fixes.</li>
             * </ul>
             * <p>Default value: <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoVulFix(Boolean autoVulFix) {
                this.autoVulFix = autoVulFix;
                return this;
            }

            /**
             * <p>The auto CVE fix policy.</p>
             */
            public Builder autoVulFixPolicy(AutoVulFixPolicy autoVulFixPolicy) {
                this.autoVulFixPolicy = autoVulFixPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable node rotation. Only intelligent managed node pools support this feature, and it is enabled by default. Common node pools do not support this feature.</p>
             */
            public Builder driftEnabled(Boolean driftEnabled) {
                this.driftEnabled = driftEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the managed node pool. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables the managed node pool.</li>
             * <li><code>false</code>: Disables the managed node pool. Other related configurations take effect only when <code>enable=true</code>.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Use the <code>auto_upgrade</code> parameter at the upper level instead.</p>
             * <p>The auto upgrade configuration. This parameter takes effect only when <code>enable=true</code>.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
     */
    public static class NodepoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
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

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The node pool name.</p>
             * <p>Naming rules: The name must be 1 to 63 characters in length and can contain digits, Chinese characters, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
             * 
             * <strong>example:</strong>
             * <p>default-nodepool</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource group ID of the node pool. Instances scaled out from the node pool belong to this resource group.</p>
             * <p>A resource can belong to only one resource group. You can map resource groups to concepts such as projects, applications, or organizations based on different business scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyvw3wjm****</p>
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
    /**
     * 
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>The private node pool ID. When <code>match_criteria</code> is set to <code>Target</code>, you must specify the private pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp67acfmxazb4****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The private node pool type, which specifies the private pool capacity option for launching instances. After an elasticity assurance or capacity reservation takes effect, a private pool is generated for instance launches. Valid values:</p>
             * <ul>
             * <li><code>Open</code>: Open mode. The system automatically matches open private pool capacity. If no matching private pool capacity is available, public pool resources are used.</li>
             * <li><code>Target</code>: Targeted mode. The instance is launched using the specified private pool capacity. If the specified private pool capacity is unavailable, the instance fails to launch.</li>
             * <li><code>None</code>: No private pool. The instance launch does not use private pool capacity.</li>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>The list of private pool IDs, which are elasticity assurance IDs or capacity reservation IDs. Only Target mode private pool IDs can be specified. Valid values of N: 1 to 20.</p>
             */
            public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
                this.privatePoolIds = privatePoolIds;
                return this;
            }

            /**
             * <p>The resource pool strategy used when creating instances. Resource pools include private pools generated after an elasticity assurance or capacity reservation takes effect, as well as public pools, for instance launches. Valid values:
             * PrivatePoolFirst: private pool first. When this strategy is selected, if resouce_pool_options.private_pool_ids is specified, the specified private pools are used first. If no private pool is specified or the specified private pool capacity is insufficient, open private pools are automatically matched. If no matching private pool is available, public pool resources are used to create instances.
             * PrivatePoolOnly: private pool only. When this strategy is selected, you must specify resouce_pool_options.private_pool_ids. If the specified private pool capacity is insufficient, the instance fails to launch.
             * None: no resource pool strategy is used.
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>The price limit per instance.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
     */
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_renew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("compensate_with_on_demand")
        private Boolean compensateWithOnDemand;

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

        @com.aliyun.core.annotation.NameInMap("rds_instances")
        private java.util.List<String> rdsInstances;

        @com.aliyun.core.annotation.NameInMap("resource_pool_options")
        private ResourcePoolOptions resourcePoolOptions;

        @com.aliyun.core.annotation.NameInMap("scaling_policy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("security_group_ids")
        private java.util.List<String> securityGroupIds;

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
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.dataDisks = builder.dataDisks;
            this.deploymentsetId = builder.deploymentsetId;
            this.desiredSize = builder.desiredSize;
            this.diskInit = builder.diskInit;
            this.enableHighDensityMode = builder.enableHighDensityMode;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.instanceChargeType = builder.instanceChargeType;
            this.instancePatterns = builder.instancePatterns;
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
            this.rdsInstances = builder.rdsInstances;
            this.resourcePoolOptions = builder.resourcePoolOptions;
            this.scalingPolicy = builder.scalingPolicy;
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
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
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
            private Boolean compensateWithOnDemand; 
            private java.util.List<DataDisk> dataDisks; 
            private String deploymentsetId; 
            private Long desiredSize; 
            private java.util.List<DiskInit> diskInit; 
            private Boolean enableHighDensityMode; 
            private String imageId; 
            private String imageType; 
            private String instanceChargeType; 
            private java.util.List<InstancePatterns> instancePatterns; 
            private java.util.List<String> instanceTypes; 
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
            private java.util.List<String> rdsInstances; 
            private ResourcePoolOptions resourcePoolOptions; 
            private String scalingPolicy; 
            private java.util.List<String> securityGroupIds; 
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
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.dataDisks = model.dataDisks;
                this.deploymentsetId = model.deploymentsetId;
                this.desiredSize = model.desiredSize;
                this.diskInit = model.diskInit;
                this.enableHighDensityMode = model.enableHighDensityMode;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.instanceChargeType = model.instanceChargeType;
                this.instancePatterns = model.instancePatterns;
                this.instanceTypes = model.instanceTypes;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.keyPair = model.keyPair;
                this.loginPassword = model.loginPassword;
                this.multiAzPolicy = model.multiAzPolicy;
                this.onDemandBaseCapacity = model.onDemandBaseCapacity;
                this.onDemandPercentageAboveBaseCapacity = model.onDemandPercentageAboveBaseCapacity;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.platform = model.platform;
                this.privatePoolOptions = model.privatePoolOptions;
                this.rdsInstances = model.rdsInstances;
                this.resourcePoolOptions = model.resourcePoolOptions;
                this.scalingPolicy = model.scalingPolicy;
                this.securityGroupIds = model.securityGroupIds;
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
             * <li><code>true</code>: Auto-renewal is enabled.</li>
             * <li><code>false</code>: Auto-renewal is disabled.</li>
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
             * <p>The auto-renewal period for a single renewal. Valid values:</p>
             * <ul>
             * <li>When PeriodUnit=Week: 1, 2, and 3.</li>
             * <li>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
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
             * <p>When <code>multi_az_policy</code> is set to <code>COST_OPTIMIZED</code>, specifies whether to allow the system to automatically create pay-as-you-go instances to meet the required number of ECS instances if spot instances cannot be created due to cost or inventory reasons. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Allows the system to automatically create pay-as-you-go instances to meet the required number of ECS instances.</li>
             * <li><code>false</code>: Does not allow the system to automatically create pay-as-you-go instances to meet the required number of ECS instances.</li>
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
             * <p>The data cloud disk configurations for nodes. Valid values: 0 to 10. You can attach up to 10 data cloud disks.</p>
             */
            public Builder dataDisks(java.util.List<DataDisk> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The deployment set to which the ECS instances created by the node pool belong. This setting takes effect only for new nodes. The deployment set of existing nodes is not changed.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp1d19mmbsv3jf6xxxxx</p>
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * <p>The desired number of nodes in the node pool.</p>
             * <p>The total number of nodes that the node pool should maintain. Configure at least 2 nodes to ensure that cluster components run properly. You can scale the node pool in or out by adjusting the desired number of nodes.</p>
             * <p>If you do not need to create nodes, set this parameter to 0 and manually adjust the value later to add nodes.</p>
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
             * <p>Specifies whether to enable high-density cloud disk mode. This is supported only when the node pool uses instance types. When enabled, the total number of system cloud disks and data cloud disks does not exceed the high-density cloud disk count supported by the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableHighDensityMode(Boolean enableHighDensityMode) {
                this.enableHighDensityMode = enableHighDensityMode;
                return this;
            }

            /**
             * <p>The custom image ID. You can call <code>DescribeKubernetesVersionMetadata</code> to query the images supported by the system. By default, the latest system image is used.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The operating system distribution type. We recommend that you use this field to specify the node operating system. Valid values:</p>
             * <ul>
             * <li><code>AliyunLinux</code>: Alinux2 image.</li>
             * <li><code>AliyunLinuxSecurity</code>: Alinux2 UEFI image.</li>
             * <li><code>AliyunLinux3</code>: Alinux3 image.</li>
             * <li><code>AliyunLinux3Arm64</code>: Alinux3 ARM image.</li>
             * <li><code>AliyunLinux3Security</code>: Alinux3 UEFI image.</li>
             * <li><code>CentOS</code>: CentOS image.</li>
             * <li><code>Windows</code>: Windows image.</li>
             * <li><code>WindowsCore</code>: WindowsCore image.</li>
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
             * <li><code>PrePaid</code>: subscription.</li>
             * <li><code>PostPaid</code>: pay-as-you-go.</li>
             * </ul>
             * <p>Default value: <code>PostPaid</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance attribute configuration.</p>
             */
            public Builder instancePatterns(java.util.List<InstancePatterns> instancePatterns) {
                this.instancePatterns = instancePatterns;
                return this;
            }

            /**
             * <p>The list of node instance types. You can select multiple instance types as alternatives. When each node is created, the system attempts to purchase instances starting from the first instance type until the creation succeeds. The actual instance type purchased may vary depending on inventory availability.</p>
             * <p>Number of supported instance types: [1,10].</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The billing method for public IP addresses. Valid values:</p>
             * <ul>
             * <li><code>PayByBandwidth</code>: billed by fixed bandwidth.</li>
             * <li><code>PayByTraffic</code>: billed by traffic usage.</li>
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
             * <p>The maximum outbound public bandwidth for nodes, in Mbps (Mega bit per second). Valid values: [1,100\].</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The key pair name. Specify either this parameter or <code>login_password</code>. If the node pool is a managed node pool, only <code>key_pair</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>pro-nodepool</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>The SSH logon password. Specify either this parameter or <code>key_pair</code>. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello1234</p>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The multi-zone scaling policy for ECS instances in the scaling group. Valid values:</p>
             * <ul>
             * <li><p><code>PRIORITY</code>: scales in or out based on the vSwitches (VSwitchIds.N) that you define. When ECS instances cannot be created in the zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</p>
             * </li>
             * <li><p><code>COST_OPTIMIZED</code>: attempts to create instances in ascending order of vCPU unit price. When the scaling configuration sets multiple instance types with the spot billable methods, spot instances are created first. You can use the <code>CompensateWithOnDemand</code> parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory.</p>
             * <blockquote>
             * <p><code>COST_OPTIMIZED</code> takes effect only when the scaling configuration sets multiple instance types or uses spot instances.</p>
             * </blockquote>
             * </li>
             * <li><p><code>BALANCE</code>: evenly allocates ECS instances across the multiple active zones specified in the scaling group. If the zones become unbalanced due to insufficient inventory, you can call the <code>RebalanceInstances</code> API operation to rebalance resources. For more information, see <a href="https://help.aliyun.com/document_detail/71516.html">RebalanceInstances</a>.</p>
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
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: [0,1000\]. Pay-as-you-go instances are created first when the number of pay-as-you-go instances is less than this value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandBaseCapacity(Long onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the excess instances after the minimum number of pay-as-you-go instances (<code>on_demand_base_capacity</code>) is met. Valid values: [0,100\].</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The subscription duration of nodes in the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <ul>
             * <li>When <code>period_unit=Week</code>, valid values of <code>period</code>: 1, 2, 3, and 4.</li>
             * <li>When <code>period_unit=Month</code>, valid values of <code>period</code>: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
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
             * <p>The billing cycle of nodes in the node pool. This parameter takes effect and is required only when <code>instance_charge_type</code> is set to <code>PrePaid</code>.</p>
             * <ul>
             * <li><code>Month</code>: the billing cycle is measured in months.</li>
             * <li><code>Week</code>: the billing cycle is measured in weeks.</li>
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
             * <p>The operating system platform. Valid values:</p>
             * <ul>
             * <li><code>AliyunLinux</code></li>
             * <li><code>CentOS</code></li>
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
             * <p>The private node pool configuration.</p>
             */
            public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
                this.privatePoolOptions = privatePoolOptions;
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
             * <p>The resource pool and resource pool strategy used when creating instances. After you set this parameter, note the following:
             * This parameter takes effect only when creating pay-as-you-go instances.
             * This parameter cannot be set together with private_pool_options.match_criteria or private_pool_options.id.</p>
             */
            public Builder resourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
                this.resourcePoolOptions = resourcePoolOptions;
                return this;
            }

            /**
             * <p>The scaling group mode. Valid values:</p>
             * <ul>
             * <li><code>release</code>: standard mode. Scales in or out by creating or releasing ECS instances based on resource usage.</li>
             * <li><code>recycle</code>: swift mode. Scales in or out by creating, stopping, or starting ECS instances, which improves the speed of subsequent scaling operations. Stopped instances are not charged for compute resources, but storage fees still apply, except for instances with local disks.</li>
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
             * <p>The list of security group IDs.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The number of available instance types. The scaling group creates spot instances of multiple types at the lowest cost. Valid values: [1,10\].</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Long spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Specifies whether to enable spot instance supplementation. If enabled, when a system message is received indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance that is to be reclaimed. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enables spot instance supplementation.</li>
             * <li><code>false</code>: Disables spot instance supplementation.</li>
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
             * <p>The price limit configurations for spot instances.</p>
             */
            public Builder spotPriceLimit(java.util.List<SpotPriceLimit> spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The type of spot instance. Valid values:</p>
             * <ul>
             * <li><code>NoSpot</code>: non-spot instance.</li>
             * <li><code>SpotWithPriceLimit</code>: spot instance with a price limit.</li>
             * <li><code>SpotAsPriceGo</code>: spot instance priced at the market price at the time of purchase.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157759.html">Spot instances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>SpotWithPriceLimit</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>Specifies whether to enable burst (performance bursting) for the node system cloud disk. Valid values:</p>
             * <ul>
             * <li>true: Enabled. After burst is enabled, the cloud disk temporarily improves its performance to handle sudden data read/write pressure from fluctuating workloads until the workload returns to a steady state.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The multiple cloud disk types for the system cloud disk. If the cloud disk type with a higher priority cannot be used, the system automatically attempts the next priority cloud disk type to create the system cloud disk.</p>
             */
            public Builder systemDiskCategories(java.util.List<String> systemDiskCategories) {
                this.systemDiskCategories = systemDiskCategories;
                return this;
            }

            /**
             * <p>The type of the node system cloud disk. Valid values:</p>
             * <ul>
             * <li><code>cloud_efficiency</code>: ultra cloud disk.</li>
             * <li><code>cloud_ssd</code>: standard SSD.</li>
             * <li><code>cloud_essd</code>: ESSD.</li>
             * <li><code>cloud_auto</code>: ESSD AutoPL cloud disk.</li>
             * <li><code>cloud_essd_entry</code>: ESSD Entry cloud disk.</li>
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
             * <p>The encryption algorithm used by the system cloud disk. Valid value: aes-256.</p>
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
             * <li><p>true: Encrypted.</p>
             * </li>
             * <li><p>false: Not encrypted.</p>
             * </li>
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
             * <p>The KMS key ID used by the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
             */
            public Builder systemDiskKmsKeyId(String systemDiskKmsKeyId) {
                this.systemDiskKmsKeyId = systemDiskKmsKeyId;
                return this;
            }

            /**
             * <p>The performance level of the node system cloud disk. This parameter takes effect only for ESSD cloud disks. The performance level varies based on the cloud disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
             * <ul>
             * <li>PL0: moderate maximum concurrent I/O performance with relatively stable read/write latency.</li>
             * <li>PL1: moderate maximum concurrent I/O performance with relatively stable read/write latency.</li>
             * <li>PL2: high maximum concurrent I/O performance with stable read/write latency.</li>
             * <li>PL3: ultra-high maximum concurrent I/O performance with extremely stable read/write latency.</li>
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
             * <p>The provisioned read/write IOPS of the node system cloud disk.</p>
             * <p>Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}. Baseline performance = min{1,800 + 50 × capacity, 50000}.</p>
             * <p>This parameter is supported only when <code>system_disk_category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the node system cloud disk, in GiB.</p>
             * <p>Valid values: [20,2048\].</p>
             * <p>The value of this parameter must be greater than or equal to max{20, ImageSize}.</p>
             * <p>Default value: max{40, image size corresponding to the ImageId parameter}.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The snapshot policy for the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-0jl6xnmme8v7o935****</p>
             */
            public Builder systemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
                this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
                return this;
            }

            /**
             * <p>The tags that are added only to ECS instances.</p>
             * <p>Tag keys cannot be duplicated and can be up to 128 characters in length. Tag keys and tag values cannot start with &quot;aliyun&quot; or &quot;acs:&quot;, or contain &quot;https://&quot; or &quot;http://&quot;.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs. Valid values: 1 to 8.</p>
             * <blockquote>
             * <p>To ensure high availability, select vSwitches in different zones.</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
             * <p>Specifies whether to enable confidential computing for the cluster. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Enabled.</li>
             * <li><code>false</code>: Disabled.</li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
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
