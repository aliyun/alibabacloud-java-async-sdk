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
 * {@link ExtendClusterRequest} extends {@link RequestModel}
 *
 * <p>ExtendClusterRequest</p>
 */
public class ExtendClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpAllocationPolicy")
    private java.util.List<IpAllocationPolicy> ipAllocationPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroups")
    private java.util.List<NodeGroups> nodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchZoneId")
    private String vSwitchZoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdSubnets")
    private java.util.List<String> vpdSubnets;

    private ExtendClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.ipAllocationPolicy = builder.ipAllocationPolicy;
        this.nodeGroups = builder.nodeGroups;
        this.vSwitchZoneId = builder.vSwitchZoneId;
        this.vpdSubnets = builder.vpdSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendClusterRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return ipAllocationPolicy
     */
    public java.util.List<IpAllocationPolicy> getIpAllocationPolicy() {
        return this.ipAllocationPolicy;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List<NodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return vSwitchZoneId
     */
    public String getVSwitchZoneId() {
        return this.vSwitchZoneId;
    }

    /**
     * @return vpdSubnets
     */
    public java.util.List<String> getVpdSubnets() {
        return this.vpdSubnets;
    }

    public static final class Builder extends Request.Builder<ExtendClusterRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List<IpAllocationPolicy> ipAllocationPolicy; 
        private java.util.List<NodeGroups> nodeGroups; 
        private String vSwitchZoneId; 
        private java.util.List<String> vpdSubnets; 

        private Builder() {
            super();
        } 

        private Builder(ExtendClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.ipAllocationPolicy = request.ipAllocationPolicy;
            this.nodeGroups = request.nodeGroups;
            this.vSwitchZoneId = request.vSwitchZoneId;
            this.vpdSubnets = request.vpdSubnets;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * IgnoreFailedNodeTasks.
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * IpAllocationPolicy.
         */
        public Builder ipAllocationPolicy(java.util.List<IpAllocationPolicy> ipAllocationPolicy) {
            String ipAllocationPolicyShrink = shrink(ipAllocationPolicy, "IpAllocationPolicy", "json");
            this.putBodyParameter("IpAllocationPolicy", ipAllocationPolicyShrink);
            this.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }

        /**
         * NodeGroups.
         */
        public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * VSwitchZoneId.
         */
        public Builder vSwitchZoneId(String vSwitchZoneId) {
            this.putBodyParameter("VSwitchZoneId", vSwitchZoneId);
            this.vSwitchZoneId = vSwitchZoneId;
            return this;
        }

        /**
         * VpdSubnets.
         */
        public Builder vpdSubnets(java.util.List<String> vpdSubnets) {
            String vpdSubnetsShrink = shrink(vpdSubnets, "VpdSubnets", "json");
            this.putBodyParameter("VpdSubnets", vpdSubnetsShrink);
            this.vpdSubnets = vpdSubnets;
            return this;
        }

        @Override
        public ExtendClusterRequest build() {
            return new ExtendClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * BondDefaultSubnet.
             */
            public Builder bondDefaultSubnet(String bondDefaultSubnet) {
                this.bondDefaultSubnet = bondDefaultSubnet;
                return this;
            }

            /**
             * Bonds.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Bonds.
             */
            public Builder bonds(java.util.List<MachineTypePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * MachineType.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Subnet.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Bonds.
             */
            public Builder bonds(java.util.List<NodePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * NodeId.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * BondPolicy.
             */
            public Builder bondPolicy(BondPolicy bondPolicy) {
                this.bondPolicy = bondPolicy;
                return this;
            }

            /**
             * MachineTypePolicy.
             */
            public Builder machineTypePolicy(java.util.List<MachineTypePolicy> machineTypePolicy) {
                this.machineTypePolicy = machineTypePolicy;
                return this;
            }

            /**
             * NodePolicy.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
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
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * LoginPassword.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
     */
    public static class NodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NodeGroups(Builder builder) {
            this.nodeGroupId = builder.nodeGroupId;
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
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
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
            private String nodeGroupId; 
            private java.util.List<Nodes> nodes; 
            private String userData; 
            private String zoneId; 

            /**
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * ZoneId.
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
}
