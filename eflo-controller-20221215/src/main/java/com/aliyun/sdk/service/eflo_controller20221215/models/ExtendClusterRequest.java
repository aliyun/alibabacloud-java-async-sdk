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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i15b480fbd2fcdbc2869cd80</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to allow skipping failed nodes. Default value: False.</p>
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
         * <p>The combined policies for assigning IP addresses: Only one policy type can be selected for each policy, and multiple policies can be combined.</p>
         */
        public Builder ipAllocationPolicy(java.util.List<IpAllocationPolicy> ipAllocationPolicy) {
            String ipAllocationPolicyShrink = shrink(ipAllocationPolicy, "IpAllocationPolicy", "json");
            this.putBodyParameter("IpAllocationPolicy", ipAllocationPolicyShrink);
            this.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }

        /**
         * <p>The node groups.</p>
         */
        public Builder nodeGroups(java.util.List<NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        public Builder vSwitchZoneId(String vSwitchZoneId) {
            this.putBodyParameter("VSwitchZoneId", vSwitchZoneId);
            this.vSwitchZoneId = vSwitchZoneId;
            return this;
        }

        /**
         * <p>The subnets of the cluster.</p>
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

            private Builder() {
            } 

            private Builder(Bonds model) {
                this.name = model.name;
                this.subnet = model.subnet;
            } 

            /**
             * <p>The bond name.</p>
             * 
             * <strong>example:</strong>
             * <p>Bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cluster subnet from which the IP address originates.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-3od2fe</p>
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

            private Builder() {
            } 

            private Builder(BondPolicy model) {
                this.bondDefaultSubnet = model.bondDefaultSubnet;
                this.bonds = model.bonds;
            } 

            /**
             * <p>The default bond subnet for the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-3od2fe</p>
             */
            public Builder bondDefaultSubnet(String bondDefaultSubnet) {
                this.bondDefaultSubnet = bondDefaultSubnet;
                return this;
            }

            /**
             * <p>The bonds.</p>
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

            private Builder() {
            } 

            private Builder(MachineTypePolicyBonds model) {
                this.name = model.name;
                this.subnet = model.subnet;
            } 

            /**
             * <p>The bond name.</p>
             * 
             * <strong>example:</strong>
             * <p>Bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cluster subnet from which the IP address originates.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-fdo3dv</p>
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

            private Builder() {
            } 

            private Builder(MachineTypePolicy model) {
                this.bonds = model.bonds;
                this.machineType = model.machineType;
            } 

            /**
             * <p>The bonds.</p>
             */
            public Builder bonds(java.util.List<MachineTypePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1</p>
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

            private Builder() {
            } 

            private Builder(NodePolicyBonds model) {
                this.name = model.name;
                this.subnet = model.subnet;
            } 

            /**
             * <p>The bond name.</p>
             * 
             * <strong>example:</strong>
             * <p>Bond0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cluster subnet from which the IP address originates.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-fdo3dv</p>
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

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodePolicy(Builder builder) {
            this.bonds = builder.bonds;
            this.hostname = builder.hostname;
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
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private java.util.List<NodePolicyBonds> bonds; 
            private String hostname; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(NodePolicy model) {
                this.bonds = model.bonds;
                this.hostname = model.hostname;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The bonds.</p>
             */
            public Builder bonds(java.util.List<NodePolicyBonds> bonds) {
                this.bonds = bonds;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>i22c11282.eu95sqa</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-3fdodw2</p>
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

            private Builder() {
            } 

            private Builder(IpAllocationPolicy model) {
                this.bondPolicy = model.bondPolicy;
                this.machineTypePolicy = model.machineTypePolicy;
                this.nodePolicy = model.nodePolicy;
            } 

            /**
             * <p>The bond policy that you specify the cluster subnet ID based on the bond name.</p>
             */
            public Builder bondPolicy(BondPolicy bondPolicy) {
                this.bondPolicy = bondPolicy;
                return this;
            }

            /**
             * <p>The allocation policies for the instance type.</p>
             */
            public Builder machineTypePolicy(java.util.List<MachineTypePolicy> machineTypePolicy) {
                this.machineTypePolicy = machineTypePolicy;
                return this;
            }

            /**
             * <p>The node allocation policies.</p>
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
    public static class NodeTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private NodeTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTag create() {
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

            private Builder(NodeTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>my_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>my_value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeTag build() {
                return new NodeTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithNode")
        private Boolean deleteWithNode;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.deleteWithNode = builder.deleteWithNode;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithNode
         */
        public Boolean getDeleteWithNode() {
            return this.deleteWithNode;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithNode; 
            private String performanceLevel; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.deleteWithNode = model.deleteWithNode;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithNode.
             */
            public Builder deleteWithNode(Boolean deleteWithNode) {
                this.deleteWithNode = deleteWithNode;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
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
        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

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
            this.dataDisk = builder.dataDisk;
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
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
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
            private java.util.List<DataDisk> dataDisk; 
            private String hostname; 
            private String loginPassword; 
            private String nodeId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.dataDisk = model.dataDisk;
                this.hostname = model.hostname;
                this.loginPassword = model.loginPassword;
                this.nodeId = model.nodeId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>d044d220-33fd-11ed-86a6</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The logon password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-zvp2zdpy601</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp169pi5fj151rrms4sia</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
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
     * {@link ExtendClusterRequest} extends {@link TeaModel}
     *
     * <p>ExtendClusterRequest</p>
     */
    public static class NodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List<String> hostnames;

        @com.aliyun.core.annotation.NameInMap("LoginPassword")
        private String loginPassword;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeTag")
        private java.util.List<NodeTag> nodeTag;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NodeGroups(Builder builder) {
            this.amount = builder.amount;
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.hostnames = builder.hostnames;
            this.loginPassword = builder.loginPassword;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeTag = builder.nodeTag;
            this.nodes = builder.nodes;
            this.period = builder.period;
            this.userData = builder.userData;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return hostnames
         */
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeTag
         */
        public java.util.List<NodeTag> getNodeTag() {
            return this.nodeTag;
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long amount; 
            private Boolean autoRenew; 
            private String chargeType; 
            private java.util.List<String> hostnames; 
            private String loginPassword; 
            private String nodeGroupId; 
            private java.util.List<NodeTag> nodeTag; 
            private java.util.List<Nodes> nodes; 
            private Long period; 
            private String userData; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(NodeGroups model) {
                this.amount = model.amount;
                this.autoRenew = model.autoRenew;
                this.chargeType = model.chargeType;
                this.hostnames = model.hostnames;
                this.loginPassword = model.loginPassword;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeTag = model.nodeTag;
                this.nodes = model.nodes;
                this.period = model.period;
                this.userData = model.userData;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of nodes to be purchased. Valid values: 0 to 500. If you set the value of the Amount parameter to 0, you do not want to purchase nodes and scale out the cluster by using existing nodes. If you set the value of the Amount parameter to a value ranging from 1 to 500, you want to purchase a certain number of nodes for cluster scale-out. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-renewal for the purchased nodes. This parameter takes effect only when the Amount parameter is not set to 0 and the ChargeType parameter is set to PrePaid. Valid values: true and false. Default value: False.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The billing method of the node. This parameter does not take effect if you set the Amount parameter to 0. Valid values: PrePaid (subscription) and PostPaid (pay-as-you-go). Default value: PrePaid.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The hostname for the purchased node. This parameter does not take effect if you set the Amount parameter to 0.</p>
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The logon password of the purchased node. This parameter does not take effect if you set the Amount parameter to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>Addk(*78</p>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i16d4883a46cbadeb4bc9</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder nodeTag(java.util.List<NodeTag> nodeTag) {
                this.nodeTag = nodeTag;
                return this;
            }

            /**
             * <p>The nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The duration of the purchased node. Unit: months. Valid values: 1, 6, 12, 24, 36, and 48. This parameter takes effect only when the Amount parameter is not set to 0 and the ChargeType parameter is set to PrePaid.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The user data.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/sh
             * echo &quot;Hello World. The time is now $(date -R)!&quot; | tee /root/userdata_test.txt</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0jly2d537ejphyq6h13ke</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-zq1econyv63tvyci5hefw</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
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
}
