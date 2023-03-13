// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ClusterDescription")
    private String clusterDescription;

    @Body
    @NameInMap("ClusterName")
    private String clusterName;

    @Body
    @NameInMap("ClusterType")
    private String clusterType;

    @Body
    @NameInMap("Components")
    private java.util.List < Components> components;

    @Body
    @NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @Body
    @NameInMap("Networks")
    private Networks networks;

    @Body
    @NameInMap("NodeGroups")
    private java.util.List < NodeGroups> nodeGroups;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterDescription = builder.clusterDescription;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.components = builder.components;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.networks = builder.networks;
        this.nodeGroups = builder.nodeGroups;
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
    public java.util.List < Components> getComponents() {
        return this.components;
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
     * @return nodeGroups
     */
    public java.util.List < NodeGroups> getNodeGroups() {
        return this.nodeGroups;
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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String regionId; 
        private String clusterDescription; 
        private String clusterName; 
        private String clusterType; 
        private java.util.List < Components> components; 
        private Boolean ignoreFailedNodeTasks; 
        private Networks networks; 
        private java.util.List < NodeGroups> nodeGroups; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

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
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.networks = request.networks;
            this.nodeGroups = request.nodeGroups;
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
         * 集群描述
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putBodyParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * 集群名称
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * 集群类型
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 组件（软件实例）
         */
        public Builder components(java.util.List < Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * 是否允许跳过失败节点，默认值为Flase
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * 网络信息
         */
        public Builder networks(Networks networks) {
            String networksShrink = shrink(networks, "Networks", "json");
            this.putBodyParameter("Networks", networksShrink);
            this.networks = networks;
            return this;
        }

        /**
         * 节点组列表
         */
        public Builder nodeGroups(java.util.List < NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * 资源组id
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 资源标签
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class ComponentConfig extends TeaModel {
        @NameInMap("BasicArgs")
        private Object basicArgs;

        @NameInMap("NodeUnits")
        private java.util.List < ? > nodeUnits;

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
        public java.util.List < ? > getNodeUnits() {
            return this.nodeUnits;
        }

        public static final class Builder {
            private Object basicArgs; 
            private java.util.List < ? > nodeUnits; 

            /**
             * BasicArgs.
             */
            public Builder basicArgs(Object basicArgs) {
                this.basicArgs = basicArgs;
                return this;
            }

            /**
             * 节点池配置， 并用于建立节点组和节点池的对应关系。 当
             * <p>
             * ComponentType=”ACKEdge“时必填，其他为空。
             */
            public Builder nodeUnits(java.util.List < ? > nodeUnits) {
                this.nodeUnits = nodeUnits;
                return this;
            }

            public ComponentConfig build() {
                return new ComponentConfig(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("ComponentConfig")
        private ComponentConfig componentConfig;

        @NameInMap("ComponentType")
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
             * 组件配置
             */
            public Builder componentConfig(ComponentConfig componentConfig) {
                this.componentConfig = componentConfig;
                return this;
            }

            /**
             * 组件类型：  "ACKEdge"(ACK边缘集群)
             * <p>
             * "ARMS"（ARMS监控）
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
    public static class VpdSubnets extends TeaModel {
        @NameInMap("SubnetCidr")
        private String subnetCidr;

        @NameInMap("SubnetType")
        private String subnetType;

        @NameInMap("ZoneId")
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
             * 子网cidr
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * 子网类型
             */
            public Builder subnetType(String subnetType) {
                this.subnetType = subnetType;
                return this;
            }

            /**
             * 可用区id
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
    public static class NewVpdInfo extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CloudLinkCidr")
        private String cloudLinkCidr;

        @NameInMap("CloudLinkId")
        private String cloudLinkId;

        @NameInMap("MonitorVpcId")
        private String monitorVpcId;

        @NameInMap("MonitorVswitchId")
        private String monitorVswitchId;

        @NameInMap("VpdCidr")
        private String vpdCidr;

        @NameInMap("VpdSubnets")
        private java.util.List < VpdSubnets> vpdSubnets;

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
        public java.util.List < VpdSubnets> getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String cenId; 
            private String cloudLinkCidr; 
            private String cloudLinkId; 
            private String monitorVpcId; 
            private String monitorVswitchId; 
            private String vpdCidr; 
            private java.util.List < VpdSubnets> vpdSubnets; 

            /**
             * 云企业网id
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * 云链cidr
             */
            public Builder cloudLinkCidr(String cloudLinkCidr) {
                this.cloudLinkCidr = cloudLinkCidr;
                return this;
            }

            /**
             * 云链id
             */
            public Builder cloudLinkId(String cloudLinkId) {
                this.cloudLinkId = cloudLinkId;
                return this;
            }

            /**
             * 专有网络
             */
            public Builder monitorVpcId(String monitorVpcId) {
                this.monitorVpcId = monitorVpcId;
                return this;
            }

            /**
             * 专有网络交换机
             */
            public Builder monitorVswitchId(String monitorVswitchId) {
                this.monitorVswitchId = monitorVswitchId;
                return this;
            }

            /**
             * 集群网段
             */
            public Builder vpdCidr(String vpdCidr) {
                this.vpdCidr = vpdCidr;
                return this;
            }

            /**
             * vpd子网信息
             */
            public Builder vpdSubnets(java.util.List < VpdSubnets> vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public NewVpdInfo build() {
                return new NewVpdInfo(this);
            } 

        } 

    }
    public static class VpdInfo extends TeaModel {
        @NameInMap("VpdId")
        private String vpdId;

        @NameInMap("VpdSubnets")
        private java.util.List < String > vpdSubnets;

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
        public java.util.List < String > getVpdSubnets() {
            return this.vpdSubnets;
        }

        public static final class Builder {
            private String vpdId; 
            private java.util.List < String > vpdSubnets; 

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * vpd子网信息
             */
            public Builder vpdSubnets(java.util.List < String > vpdSubnets) {
                this.vpdSubnets = vpdSubnets;
                return this;
            }

            public VpdInfo build() {
                return new VpdInfo(this);
            } 

        } 

    }
    public static class Networks extends TeaModel {
        @NameInMap("NewVpdInfo")
        private NewVpdInfo newVpdInfo;

        @NameInMap("VpdInfo")
        private VpdInfo vpdInfo;

        private Networks(Builder builder) {
            this.newVpdInfo = builder.newVpdInfo;
            this.vpdInfo = builder.vpdInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return newVpdInfo
         */
        public NewVpdInfo getNewVpdInfo() {
            return this.newVpdInfo;
        }

        /**
         * @return vpdInfo
         */
        public VpdInfo getVpdInfo() {
            return this.vpdInfo;
        }

        public static final class Builder {
            private NewVpdInfo newVpdInfo; 
            private VpdInfo vpdInfo; 

            /**
             * NewVpdInfo.
             */
            public Builder newVpdInfo(NewVpdInfo newVpdInfo) {
                this.newVpdInfo = newVpdInfo;
                return this;
            }

            /**
             * VpdInfo.
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
    public static class Nodes extends TeaModel {
        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("LoginPassword")
        private String loginPassword;

        @NameInMap("NodeId")
        private String nodeId;

        private Nodes(Builder builder) {
            this.hostname = builder.hostname;
            this.loginPassword = builder.loginPassword;
            this.nodeId = builder.nodeId;
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

        public static final class Builder {
            private String hostname; 
            private String loginPassword; 
            private String nodeId; 

            /**
             * 主机名
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * 登录密码
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * 节点id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class NodeGroups extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("NodeGroupDescription")
        private String nodeGroupDescription;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("ZoneId")
        private String zoneId;

        private NodeGroups(Builder builder) {
            this.imageId = builder.imageId;
            this.machineType = builder.machineType;
            this.nodeGroupDescription = builder.nodeGroupDescription;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodes = builder.nodes;
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
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
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
            private java.util.List < Nodes> nodes; 
            private String zoneId; 

            /**
             * 系统镜像id
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * 机型
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * 节点组描述
             */
            public Builder nodeGroupDescription(String nodeGroupDescription) {
                this.nodeGroupDescription = nodeGroupDescription;
                return this;
            }

            /**
             * 节点组名称
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * 节点列表
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * 可用区id
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * 键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 值
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
