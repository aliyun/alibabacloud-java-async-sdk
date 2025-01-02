// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterDescription")
    private String clusterDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Networks")
    private Networks networks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NimizVSwitches")
    private java.util.List<String> nimizVSwitches;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    private java.util.List<NodeGroups> nodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenEniJumboFrame")
    private Boolean openEniJumboFrame;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterDescription = builder.clusterDescription;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.components = builder.components;
        this.hpnZone = builder.hpnZone;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.networks = builder.networks;
        this.nimizVSwitches = builder.nimizVSwitches;
        this.nodeGroups = builder.nodeGroups;
        this.openEniJumboFrame = builder.openEniJumboFrame;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterDescription
     */
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return networks
     */
    public Networks getNetworks() {
        return this.networks;
    }

    /**
     * @return nimizVSwitches
     */
    public java.util.List<String> getNimizVSwitches() {
        return this.nimizVSwitches;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List<NodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return openEniJumboFrame
     */
    public Boolean getOpenEniJumboFrame() {
        return this.openEniJumboFrame;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String regionId; 
        private String clusterDescription; 
        private String clusterName; 
        private String clusterType; 
        private java.util.List<Components> components; 
        private String hpnZone; 
        private Boolean ignoreFailedNodeTasks; 
        private Networks networks; 
        private java.util.List<String> nimizVSwitches; 
        private java.util.List<NodeGroups> nodeGroups; 
        private Boolean openEniJumboFrame; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterDescription = request.clusterDescription;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.components = request.components;
            this.hpnZone = request.hpnZone;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.networks = request.networks;
            this.nimizVSwitches = request.nimizVSwitches;
            this.nodeGroups = request.nodeGroups;
            this.openEniJumboFrame = request.openEniJumboFrame;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Cluster description</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster description</p>
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putBodyParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>Standard_Cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Cluster type</p>
         * 
         * <strong>example:</strong>
         * <p>Lite</p>
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Components (software instances)</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * <p>Cluster number</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.putBodyParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>Whether to allow skipping failed nodes, default value is False</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * <p>Network information</p>
         */
        public Builder networks(Networks networks) {
            String networksShrink = shrink(networks, "Networks", "json");
            this.putBodyParameter("Networks", networksShrink);
            this.networks = networks;
            return this;
        }

        /**
         * <p>Node VSwitches</p>
         */
        public Builder nimizVSwitches(java.util.List<String> nimizVSwitches) {
            String nimizVSwitchesShrink = shrink(nimizVSwitches, "NimizVSwitches", "json");
            this.putBodyParameter("NimizVSwitches", nimizVSwitchesShrink);
            this.nimizVSwitches = nimizVSwitches;
            return this;
        }

        /**
         * <p>Node group list</p>
         */
        public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * <p>Open Eni Jumbo Frame</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openEniJumboFrame(Boolean openEniJumboFrame) {
            this.putBodyParameter("OpenEniJumboFrame", openEniJumboFrame);
            this.openEniJumboFrame = openEniJumboFrame;
            return this;
        }

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2xdkc6icwfha</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource tags</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class ComponentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicArgs")
        private Object basicArgs;

        @com.aliyun.core.annotation.NameInMap("NodeUnits")
        private java.util.List<?> nodeUnits;

        private ComponentConfig(Builder builder) {
            this.basicArgs = builder.basicArgs;
            this.nodeUnits = builder.nodeUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentConfig create() {
            return builder().build();
        }

        /**
         * @return basicArgs
         */
        public Object getBasicArgs() {
            return this.basicArgs;
        }

        /**
         * @return nodeUnits
         */
        public java.util.List<?> getNodeUnits() {
            return this.nodeUnits;
        }

        public static final class Builder {
            private Object basicArgs; 
            private java.util.List<?> nodeUnits; 

            /**
             * <p>Basic component parameters</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;EndpointPublicAccess&quot;: false,
             *       &quot;ContainerCidr&quot;: &quot;10.4.0.0/24&quot;,
             *       &quot;KeyPair&quot;: &quot;test&quot;,
             *       &quot;NodeCidrMask&quot;: &quot;25&quot;,
             *       &quot;ResourceGroupId&quot;: &quot;rg-axsadm3sdzsdvdsndstdisd&quot;,
             *       &quot;WorkerSystemDiskCategory&quot;: &quot;da&quot;,
             *       &quot;WorkerSystemDiskSize&quot;: 40,
             *       &quot;DeletionProtection&quot;: false,
             *       &quot;KubeProxy&quot;: &quot;iptables&quot;,
             *       &quot;Name&quot;: &quot;da&quot;,
             *       &quot;LoadBalancerSpec&quot;: &quot;slb.s1.small&quot;,
             *       &quot;Runtime&quot;: {
             *             &quot;Version&quot;: &quot;19.03.15&quot;,
             *             &quot;Name&quot;: &quot;docker&quot;
             *       },
             *       &quot;IsEnterpriseSecurityGroup&quot;: true,
             *       &quot;Vpcid&quot;: &quot;192.168.23.0/24&quot;,
             *       &quot;NumOfNodes&quot;: 1,
             *       &quot;VswitchIds&quot;: [
             *             &quot;dad&quot;
             *       ],
             *       &quot;ServiceCidr&quot;: &quot;10.0.0.0/16&quot;,
             *       &quot;SnatEntry&quot;: false,
             *       &quot;kubernetesVersion&quot;: &quot;1.20.11-aliyunedge.1&quot;,
             *       &quot;WorkerInstanceTypes&quot;: [
             *             &quot;da&quot;
             *       ]
             * }</p>
             */
            public Builder basicArgs(Object basicArgs) {
                this.basicArgs = basicArgs;
                return this;
            }

            /**
             * <p>Node pool configuration, used to establish the correspondence between node groups and node pools. Required when ComponentType is &quot;ACKEdge&quot;, otherwise it can be empty.</p>
             */
            public Builder nodeUnits(java.util.List<?> nodeUnits) {
                this.nodeUnits = nodeUnits;
                return this;
            }

            public ComponentConfig build() {
                return new ComponentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentConfig")
        private ComponentConfig componentConfig;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        private Components(Builder builder) {
            this.componentConfig = builder.componentConfig;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentConfig
         */
        public ComponentConfig getComponentConfig() {
            return this.componentConfig;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private ComponentConfig componentConfig; 
            private String componentType; 

            /**
             * <p>Component configuration</p>
             */
            public Builder componentConfig(ComponentConfig componentConfig) {
                this.componentConfig = componentConfig;
                return this;
            }

            /**
             * <p>Component type</p>
             * 
             * <strong>example:</strong>
             * <p>ACKEdge</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Bonds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        private Bonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * <p>Bond name</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>IP source cluster subnet</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public Bonds build() {
                return new Bonds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class BondPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondDefaultSubnet")
        private String bondDefaultSubnet;

        @com.aliyun.core.annotation.NameInMap("Bonds")
        private java.util.List<Bonds> bonds;

        private BondPolicy(Builder builder) {
            this.bondDefaultSubnet = builder.bondDefaultSubnet;
            this.bonds = builder.bonds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BondPolicy create() {
            return builder().build();
        }

        /**
         * @return bondDefaultSubnet
         */
        public String getBondDefaultSubnet() {
            return this.bondDefaultSubnet;
        }

        /**
         * @return bonds
         */
        public java.util.List<Bonds> getBonds() {
            return this.bonds;
        }

        public static final class Builder {
            private String bondDefaultSubnet; 
            private java.util.List<Bonds> bonds; 

            /**
             * <p>Default bond cluster subnet</p>
             * 
             * <strong>example:</strong>
             * <p>172.168.0.0/24</p>
             */
            public Builder bondDefaultSubnet(String bondDefaultSubnet) {
                this.bondDefaultSubnet = bondDefaultSubnet;
                return this;
            }

            /**
             * <p>Bond information</p>
             */
            public Builder bonds(java.util.List<Bonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            public BondPolicy build() {
                return new BondPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class MachineTypePolicyBonds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        private MachineTypePolicyBonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineTypePolicyBonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * <p>Bond name</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>IP source cluster subnet</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public MachineTypePolicyBonds build() {
                return new MachineTypePolicyBonds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class MachineTypePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bonds")
        private java.util.List<MachineTypePolicyBonds> bonds;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        private MachineTypePolicy(Builder builder) {
            this.bonds = builder.bonds;
            this.machineType = builder.machineType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineTypePolicy create() {
            return builder().build();
        }

        /**
         * @return bonds
         */
        public java.util.List<MachineTypePolicyBonds> getBonds() {
            return this.bonds;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        public static final class Builder {
            private java.util.List<MachineTypePolicyBonds> bonds; 
            private String machineType; 

            /**
             * <p>Bond information</p>
             */
            public Builder bonds(java.util.List<MachineTypePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * <p>Machine type</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga8n</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            public MachineTypePolicy build() {
                return new MachineTypePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class NodePolicyBonds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        private NodePolicyBonds(Builder builder) {
            this.name = builder.name;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePolicyBonds create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String name; 
            private String subnet; 

            /**
             * <p>Bond name</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>IP source cluster subnet</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public NodePolicyBonds build() {
                return new NodePolicyBonds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class NodePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bonds")
        private java.util.List<NodePolicyBonds> bonds;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodePolicy(Builder builder) {
            this.bonds = builder.bonds;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePolicy create() {
            return builder().build();
        }

        /**
         * @return bonds
         */
        public java.util.List<NodePolicyBonds> getBonds() {
            return this.bonds;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List<NodePolicyBonds> bonds; 
            private String nodeId; 

            /**
             * <p>Bond information</p>
             */
            public Builder bonds(java.util.List<NodePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-2r42vq62001</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodePolicy build() {
                return new NodePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class IpAllocationPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondPolicy")
        private BondPolicy bondPolicy;

        @com.aliyun.core.annotation.NameInMap("MachineTypePolicy")
        private java.util.List<MachineTypePolicy> machineTypePolicy;

        @com.aliyun.core.annotation.NameInMap("NodePolicy")
        private java.util.List<NodePolicy> nodePolicy;

        private IpAllocationPolicy(Builder builder) {
            this.bondPolicy = builder.bondPolicy;
            this.machineTypePolicy = builder.machineTypePolicy;
            this.nodePolicy = builder.nodePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAllocationPolicy create() {
            return builder().build();
        }

        /**
         * @return bondPolicy
         */
        public BondPolicy getBondPolicy() {
            return this.bondPolicy;
        }

        /**
         * @return machineTypePolicy
         */
        public java.util.List<MachineTypePolicy> getMachineTypePolicy() {
            return this.machineTypePolicy;
        }

        /**
         * @return nodePolicy
         */
        public java.util.List<NodePolicy> getNodePolicy() {
            return this.nodePolicy;
        }

        public static final class Builder {
            private BondPolicy bondPolicy; 
            private java.util.List<MachineTypePolicy> machineTypePolicy; 
            private java.util.List<NodePolicy> nodePolicy; 

            /**
             * <p>Bond policy</p>
             */
            public Builder bondPolicy(BondPolicy bondPolicy) {
                this.bondPolicy = bondPolicy;
                return this;
            }

            /**
             * <p>Machine type allocation policy</p>
             */
            public Builder machineTypePolicy(java.util.List<MachineTypePolicy> machineTypePolicy) {
                this.machineTypePolicy = machineTypePolicy;
                return this;
            }

            /**
             * <p>Node allocation policy</p>
             */
            public Builder nodePolicy(java.util.List<NodePolicy> nodePolicy) {
                this.nodePolicy = nodePolicy;
                return this;
            }

            public IpAllocationPolicy build() {
                return new IpAllocationPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class VpdSubnets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubnetCidr")
        private String subnetCidr;

        @com.aliyun.core.annotation.NameInMap("SubnetType")
        private String subnetType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VpdSubnets(Builder builder) {
            this.subnetCidr = builder.subnetCidr;
            this.subnetType = builder.subnetType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdSubnets create() {
            return builder().build();
        }

        /**
         * @return subnetCidr
         */
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        /**
         * @return subnetType
         */
        public String getSubnetType() {
            return this.subnetType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String subnetCidr; 
            private String subnetType; 
            private String zoneId; 

            /**
             * <p>Subnet CIDR</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.8/24</p>
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * <p>Subnet type</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.2.8/24</p>
             */
            public Builder subnetType(String subnetType) {
                this.subnetType = subnetType;
                return this;
            }

            /**
             * <p>Zone ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VpdSubnets build() {
                return new VpdSubnets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class NewVpdInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CloudLinkCidr")
        private String cloudLinkCidr;

        @com.aliyun.core.annotation.NameInMap("CloudLinkId")
        private String cloudLinkId;

        @com.aliyun.core.annotation.NameInMap("MonitorVpcId")
        private String monitorVpcId;

        @com.aliyun.core.annotation.NameInMap("MonitorVswitchId")
        private String monitorVswitchId;

        @com.aliyun.core.annotation.NameInMap("VpdCidr")
        private String vpdCidr;

        @com.aliyun.core.annotation.NameInMap("VpdSubnets")
        private java.util.List<VpdSubnets> vpdSubnets;

        private NewVpdInfo(Builder builder) {
            this.cenId = builder.cenId;
            this.cloudLinkCidr = builder.cloudLinkCidr;
            this.cloudLinkId = builder.cloudLinkId;
            this.monitorVpcId = builder.monitorVpcId;
            this.monitorVswitchId = builder.monitorVswitchId;
            this.vpdCidr = builder.vpdCidr;
            this.vpdSubnets = builder.vpdSubnets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewVpdInfo create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cloudLinkCidr
         */
        public String getCloudLinkCidr() {
            return this.cloudLinkCidr;
        }

        /**
         * @return cloudLinkId
         */
        public String getCloudLinkId() {
            return this.cloudLinkId;
        }

        /**
         * @return monitorVpcId
         */
        public String getMonitorVpcId() {
            return this.monitorVpcId;
        }

        /**
         * @return monitorVswitchId
         */
        public String getMonitorVswitchId() {
            return this.monitorVswitchId;
        }

        /**
         * @return vpdCidr
         */
        public String getVpdCidr() {
            return this.vpdCidr;
        }

        /**
         * @return vpdSubnets
         */
        public java.util.List<VpdSubnets> getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String cenId; 
            private String cloudLinkCidr; 
            private String cloudLinkId; 
            private String monitorVpcId; 
            private String monitorVswitchId; 
            private String vpdCidr; 
            private java.util.List<VpdSubnets> vpdSubnets; 

            /**
             * <p>Cloud Enterprise Network ID</p>
             * 
             * <strong>example:</strong>
             * <p>cen-1gb1eftc5qp2ao75fo</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>Cloud link CIDR</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder cloudLinkCidr(String cloudLinkCidr) {
                this.cloudLinkCidr = cloudLinkCidr;
                return this;
            }

            /**
             * <p>Cloud link ID</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-c4dtycm5i08</p>
             */
            public Builder cloudLinkId(String cloudLinkId) {
                this.cloudLinkId = cloudLinkId;
                return this;
            }

            /**
             * <p>VPC</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jl2x45apm6odc2c10h25</p>
             */
            public Builder monitorVpcId(String monitorVpcId) {
                this.monitorVpcId = monitorVpcId;
                return this;
            }

            /**
             * <p>VPC switch</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0jl2w3ffbghkss0x2foff</p>
             */
            public Builder monitorVswitchId(String monitorVswitchId) {
                this.monitorVswitchId = monitorVswitchId;
                return this;
            }

            /**
             * <p>Cluster Network Segment</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder vpdCidr(String vpdCidr) {
                this.vpdCidr = vpdCidr;
                return this;
            }

            /**
             * <p>Cluster subnets</p>
             */
            public Builder vpdSubnets(java.util.List<VpdSubnets> vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public NewVpdInfo build() {
                return new NewVpdInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class VpdInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdSubnets")
        private java.util.List<String> vpdSubnets;

        private VpdInfo(Builder builder) {
            this.vpdId = builder.vpdId;
            this.vpdSubnets = builder.vpdSubnets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdInfo create() {
            return builder().build();
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdSubnets
         */
        public java.util.List<String> getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String vpdId; 
            private java.util.List<String> vpdSubnets; 

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-vfuz6ejv</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>List of cluster subnet IDs</p>
             */
            public Builder vpdSubnets(java.util.List<String> vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public VpdInfo build() {
                return new VpdInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAllocationPolicy")
        private java.util.List<IpAllocationPolicy> ipAllocationPolicy;

        @com.aliyun.core.annotation.NameInMap("NewVpdInfo")
        private NewVpdInfo newVpdInfo;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TailIpVersion")
        private String tailIpVersion;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchZoneId")
        private String vSwitchZoneId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpdInfo")
        private VpdInfo vpdInfo;

        private Networks(Builder builder) {
            this.ipAllocationPolicy = builder.ipAllocationPolicy;
            this.newVpdInfo = builder.newVpdInfo;
            this.securityGroupId = builder.securityGroupId;
            this.tailIpVersion = builder.tailIpVersion;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchZoneId = builder.vSwitchZoneId;
            this.vpcId = builder.vpcId;
            this.vpdInfo = builder.vpdInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return ipAllocationPolicy
         */
        public java.util.List<IpAllocationPolicy> getIpAllocationPolicy() {
            return this.ipAllocationPolicy;
        }

        /**
         * @return newVpdInfo
         */
        public NewVpdInfo getNewVpdInfo() {
            return this.newVpdInfo;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return tailIpVersion
         */
        public String getTailIpVersion() {
            return this.tailIpVersion;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchZoneId
         */
        public String getVSwitchZoneId() {
            return this.vSwitchZoneId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpdInfo
         */
        public VpdInfo getVpdInfo() {
            return this.vpdInfo;
        }

        public static final class Builder {
            private java.util.List<IpAllocationPolicy> ipAllocationPolicy; 
            private NewVpdInfo newVpdInfo; 
            private String securityGroupId; 
            private String tailIpVersion; 
            private String vSwitchId; 
            private String vSwitchZoneId; 
            private String vpcId; 
            private VpdInfo vpdInfo; 

            /**
             * <p>IP allocation policy</p>
             */
            public Builder ipAllocationPolicy(java.util.List<IpAllocationPolicy> ipAllocationPolicy) {
                this.ipAllocationPolicy = ipAllocationPolicy;
                return this;
            }

            /**
             * <p>Vpd configuration information</p>
             */
            public Builder newVpdInfo(NewVpdInfo newVpdInfo) {
                this.newVpdInfo = newVpdInfo;
                return this;
            }

            /**
             * <p>Security group ID</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1d3dvbh9by7j5rujax</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>IP version</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder tailIpVersion(String tailIpVersion) {
                this.tailIpVersion = tailIpVersion;
                return this;
            }

            /**
             * <p>VSwitch ID</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-asjdfklj</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VSwitch Zone ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder vSwitchZoneId(String vSwitchZoneId) {
                this.vSwitchZoneId = vSwitchZoneId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jl36lqzmc06qogy0t5ll</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Reuse VPD information</p>
             */
            public Builder vpdInfo(VpdInfo vpdInfo) {
                this.vpdInfo = vpdInfo;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("LoginPassword")
        private String loginPassword;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Nodes(Builder builder) {
            this.hostname = builder.hostname;
            this.loginPassword = builder.loginPassword;
            this.nodeId = builder.nodeId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String hostname; 
            private String loginPassword; 
            private String nodeId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * <p>Hostname</p>
             * 
             * <strong>example:</strong>
             * <p>8d13b784-17a9-11ed-bc7b-acde48001122</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Login password</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01poc-cn-i7m2wnivf0d</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Virtual switch ID</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp169pi5fj151rrms4sia</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jlasms92fdxqd3wlf8ny</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class NodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("NodeGroupDescription")
        private String nodeGroupDescription;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NodeGroups(Builder builder) {
            this.imageId = builder.imageId;
            this.machineType = builder.machineType;
            this.nodeGroupDescription = builder.nodeGroupDescription;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodes = builder.nodes;
            this.userData = builder.userData;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return nodeGroupDescription
         */
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String imageId; 
            private String machineType; 
            private String nodeGroupDescription; 
            private String nodeGroupName; 
            private java.util.List<Nodes> nodes; 
            private String userData; 
            private String zoneId; 

            /**
             * <p>System image ID</p>
             * 
             * <strong>example:</strong>
             * <p>i190297201634099844192</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Machine type</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Node group description</p>
             * 
             * <strong>example:</strong>
             * <p>Node group description</p>
             */
            public Builder nodeGroupDescription(String nodeGroupDescription) {
                this.nodeGroupDescription = nodeGroupDescription;
                return this;
            }

            /**
             * <p>Node group name</p>
             * 
             * <strong>example:</strong>
             * <p>emr-default</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>Node list</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>Instance custom data. It needs to be Base64 encoded, and the original data should not exceed 16 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>Zone ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodeGroups build() {
                return new NodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>Key</p>
             * 
             * <strong>example:</strong>
             * <p>env-name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
