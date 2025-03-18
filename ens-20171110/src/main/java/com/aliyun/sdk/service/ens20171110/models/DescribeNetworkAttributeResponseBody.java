// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAttributeResponseBody</p>
 */
public class DescribeNetworkAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("CloudResources")
    private CloudResources cloudResources;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.NameInMap("GatewayRouteTableId")
    private String gatewayRouteTableId;

    @com.aliyun.core.annotation.NameInMap("HaVipIds")
    private HaVipIds haVipIds;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private LoadBalancerIds loadBalancerIds;

    @com.aliyun.core.annotation.NameInMap("NatGatewayIds")
    private NatGatewayIds natGatewayIds;

    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    private String networkAclId;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
    private NetworkInterfaceIds networkInterfaceIds;

    @com.aliyun.core.annotation.NameInMap("NetworkName")
    private String networkName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    @com.aliyun.core.annotation.NameInMap("RouteTableIds")
    private RouteTableIds routeTableIds;

    @com.aliyun.core.annotation.NameInMap("RouterTableId")
    private String routerTableId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private VSwitchIds vSwitchIds;

    private DescribeNetworkAttributeResponseBody(Builder builder) {
        this.cidrBlock = builder.cidrBlock;
        this.cloudResources = builder.cloudResources;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.gatewayRouteTableId = builder.gatewayRouteTableId;
        this.haVipIds = builder.haVipIds;
        this.instanceIds = builder.instanceIds;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.natGatewayIds = builder.natGatewayIds;
        this.networkAclId = builder.networkAclId;
        this.networkId = builder.networkId;
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.networkName = builder.networkName;
        this.requestId = builder.requestId;
        this.routeTableId = builder.routeTableId;
        this.routeTableIds = builder.routeTableIds;
        this.routerTableId = builder.routerTableId;
        this.status = builder.status;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return cloudResources
     */
    public CloudResources getCloudResources() {
        return this.cloudResources;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return gatewayRouteTableId
     */
    public String getGatewayRouteTableId() {
        return this.gatewayRouteTableId;
    }

    /**
     * @return haVipIds
     */
    public HaVipIds getHaVipIds() {
        return this.haVipIds;
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return loadBalancerIds
     */
    public LoadBalancerIds getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return natGatewayIds
     */
    public NatGatewayIds getNatGatewayIds() {
        return this.natGatewayIds;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkInterfaceIds
     */
    public NetworkInterfaceIds getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * @return routeTableIds
     */
    public RouteTableIds getRouteTableIds() {
        return this.routeTableIds;
    }

    /**
     * @return routerTableId
     */
    public String getRouterTableId() {
        return this.routerTableId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchIds
     */
    public VSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder {
        private String cidrBlock; 
        private CloudResources cloudResources; 
        private String createdTime; 
        private String description; 
        private String ensRegionId; 
        private String gatewayRouteTableId; 
        private HaVipIds haVipIds; 
        private InstanceIds instanceIds; 
        private LoadBalancerIds loadBalancerIds; 
        private NatGatewayIds natGatewayIds; 
        private String networkAclId; 
        private String networkId; 
        private NetworkInterfaceIds networkInterfaceIds; 
        private String networkName; 
        private String requestId; 
        private String routeTableId; 
        private RouteTableIds routeTableIds; 
        private String routerTableId; 
        private String status; 
        private VSwitchIds vSwitchIds; 

        private Builder() {
        } 

        private Builder(DescribeNetworkAttributeResponseBody model) {
            this.cidrBlock = model.cidrBlock;
            this.cloudResources = model.cloudResources;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.ensRegionId = model.ensRegionId;
            this.gatewayRouteTableId = model.gatewayRouteTableId;
            this.haVipIds = model.haVipIds;
            this.instanceIds = model.instanceIds;
            this.loadBalancerIds = model.loadBalancerIds;
            this.natGatewayIds = model.natGatewayIds;
            this.networkAclId = model.networkAclId;
            this.networkId = model.networkId;
            this.networkInterfaceIds = model.networkInterfaceIds;
            this.networkName = model.networkName;
            this.requestId = model.requestId;
            this.routeTableId = model.routeTableId;
            this.routeTableIds = model.routeTableIds;
            this.routerTableId = model.routerTableId;
            this.status = model.status;
            this.vSwitchIds = model.vSwitchIds;
        } 

        /**
         * <p>The IPv4 CIDR block of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The list of resources in the network.</p>
         */
        public Builder cloudResources(CloudResources cloudResources) {
            this.cloudResources = cloudResources;
            return this;
        }

        /**
         * <p>The time when the network was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-01T00:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * GatewayRouteTableId.
         */
        public Builder gatewayRouteTableId(String gatewayRouteTableId) {
            this.gatewayRouteTableId = gatewayRouteTableId;
            return this;
        }

        /**
         * <p>List of HaVipIds.</p>
         */
        public Builder haVipIds(HaVipIds haVipIds) {
            this.haVipIds = haVipIds;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>List of ELB instances.</p>
         */
        public Builder loadBalancerIds(LoadBalancerIds loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>List of NAT Gateways.</p>
         */
        public Builder natGatewayIds(NatGatewayIds natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }

        /**
         * <p>The ID of the network access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0sp****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5***</p>
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>A list of multicast source IDs.</p>
         */
        public Builder networkInterfaceIds(NetworkInterfaceIds networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * <p>The name of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteTableId.
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * <p>List of routing table IDs.</p>
         */
        public Builder routeTableIds(RouteTableIds routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>rtb-5***</p>
         */
        public Builder routerTableId(String routerTableId) {
            this.routerTableId = routerTableId;
            return this;
        }

        /**
         * <p>The status of the network. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Available</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of vSwitches in the network.</p>
         */
        public Builder vSwitchIds(VSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        public DescribeNetworkAttributeResponseBody build() {
            return new DescribeNetworkAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class CloudResourceSetType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Integer resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CloudResourceSetType(Builder builder) {
            this.resourceCount = builder.resourceCount;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResourceSetType create() {
            return builder().build();
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Integer resourceCount; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(CloudResourceSetType model) {
                this.resourceCount = model.resourceCount;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The number of resources in the network.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * <p>The resource type. VSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public CloudResourceSetType build() {
                return new CloudResourceSetType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class CloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudResourceSetType")
        private java.util.List<CloudResourceSetType> cloudResourceSetType;

        private CloudResources(Builder builder) {
            this.cloudResourceSetType = builder.cloudResourceSetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResources create() {
            return builder().build();
        }

        /**
         * @return cloudResourceSetType
         */
        public java.util.List<CloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

        public static final class Builder {
            private java.util.List<CloudResourceSetType> cloudResourceSetType; 

            private Builder() {
            } 

            private Builder(CloudResources model) {
                this.cloudResourceSetType = model.cloudResourceSetType;
            } 

            /**
             * CloudResourceSetType.
             */
            public Builder cloudResourceSetType(java.util.List<CloudResourceSetType> cloudResourceSetType) {
                this.cloudResourceSetType = cloudResourceSetType;
                return this;
            }

            public CloudResources build() {
                return new CloudResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class HaVipIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HaVipId")
        private java.util.List<String> haVipId;

        private HaVipIds(Builder builder) {
            this.haVipId = builder.haVipId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVipIds create() {
            return builder().build();
        }

        /**
         * @return haVipId
         */
        public java.util.List<String> getHaVipId() {
            return this.haVipId;
        }

        public static final class Builder {
            private java.util.List<String> haVipId; 

            private Builder() {
            } 

            private Builder(HaVipIds model) {
                this.haVipId = model.haVipId;
            } 

            /**
             * HaVipId.
             */
            public Builder haVipId(java.util.List<String> haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            public HaVipIds build() {
                return new HaVipIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            private Builder() {
            } 

            private Builder(InstanceIds model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class LoadBalancerIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private java.util.List<String> loadBalancerId;

        private LoadBalancerIds(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerIds create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public java.util.List<String> getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private java.util.List<String> loadBalancerId; 

            private Builder() {
            } 

            private Builder(LoadBalancerIds model) {
                this.loadBalancerId = model.loadBalancerId;
            } 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(java.util.List<String> loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancerIds build() {
                return new LoadBalancerIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class NatGatewayIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private java.util.List<String> natGatewayId;

        private NatGatewayIds(Builder builder) {
            this.natGatewayId = builder.natGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayIds create() {
            return builder().build();
        }

        /**
         * @return natGatewayId
         */
        public java.util.List<String> getNatGatewayId() {
            return this.natGatewayId;
        }

        public static final class Builder {
            private java.util.List<String> natGatewayId; 

            private Builder() {
            } 

            private Builder(NatGatewayIds model) {
                this.natGatewayId = model.natGatewayId;
            } 

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(java.util.List<String> natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            public NatGatewayIds build() {
                return new NatGatewayIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class NetworkInterfaceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private java.util.List<String> networkInterfaceId;

        private NetworkInterfaceIds(Builder builder) {
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceId
         */
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private java.util.List<String> networkInterfaceId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceIds model) {
                this.networkInterfaceId = model.networkInterfaceId;
            } 

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(java.util.List<String> networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public NetworkInterfaceIds build() {
                return new NetworkInterfaceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class RouteTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private java.util.List<String> routeTableId;

        private RouteTableIds(Builder builder) {
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTableIds create() {
            return builder().build();
        }

        /**
         * @return routeTableId
         */
        public java.util.List<String> getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List<String> routeTableId; 

            private Builder() {
            } 

            private Builder(RouteTableIds model) {
                this.routeTableId = model.routeTableId;
            } 

            /**
             * RouteTableId.
             */
            public Builder routeTableId(java.util.List<String> routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteTableIds build() {
                return new RouteTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAttributeResponseBody</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List<String> vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List<String> vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
