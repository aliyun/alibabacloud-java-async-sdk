// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateRouteEntriesRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteEntriesRequest</p>
 */
public class CreateRouteEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RouteEntries> routeEntries;

    private CreateRouteEntriesRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntries = builder.routeEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return routeEntries
     */
    public java.util.List<RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static final class Builder extends Request.Builder<CreateRouteEntriesRequest, Builder> {
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<RouteEntries> routeEntries; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteEntriesRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntries = request.routeEntries;
        } 

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <p><strong>true</strong>: performs a dry run without creating routes. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</p>
         * <p><strong>false</strong> (default): performs a normal request and sends the request. If the check passes, a 2xx HTTP status code is returned and the routes are created.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the route table resides.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The list of route entry information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder routeEntries(java.util.List<RouteEntries> routeEntries) {
            this.putQueryParameter("RouteEntries", routeEntries);
            this.routeEntries = routeEntries;
            return this;
        }

        @Override
        public CreateRouteEntriesRequest build() {
            return new CreateRouteEntriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRouteEntriesRequest} extends {@link TeaModel}
     *
     * <p>CreateRouteEntriesRequest</p>
     */
    public static class RouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DstCidrBlock")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dstCidrBlock;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String routeTableId;

        private RouteEntries(Builder builder) {
            this.description = builder.description;
            this.dstCidrBlock = builder.dstCidrBlock;
            this.ipVersion = builder.ipVersion;
            this.name = builder.name;
            this.nextHop = builder.nextHop;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstCidrBlock
         */
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String description; 
            private String dstCidrBlock; 
            private Integer ipVersion; 
            private String name; 
            private String nextHop; 
            private String nextHopType; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(RouteEntries model) {
                this.description = model.description;
                this.dstCidrBlock = model.dstCidrBlock;
                this.ipVersion = model.ipVersion;
                this.name = model.name;
                this.nextHop = model.nextHop;
                this.nextHopType = model.nextHopType;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The description of the custom route entry. You can specify up to 50 descriptions.</p>
             * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block of the custom route entry. Both IPv4 and IPv6 destination CIDR blocks are supported. You can specify up to 50 destination CIDR blocks. The following requirements must be met:</p>
             * <ul>
             * <li><p>The destination CIDR block cannot point to 100.64.0.0/10 or be contained by 100.64.0.0/10.  </p>
             * </li>
             * <li><p>The destination CIDR blocks of different route entries in the same route table must be unique.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * <p>The version of the IP protocol. You can specify up to 50 IP protocol versions. Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: IPv4.</li>
             * <li><strong>6</strong>: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The name of the custom route entry to add. You can specify up to 50 names.</p>
             * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the next hop instance of the custom route entry. You can specify up to 50 instance IDs.</p>
             * <blockquote>
             * <p>If NextHopType is set to ECR, you can call the <a href="https://help.aliyun.com/document_detail/2712069.html">DescribeExpressConnectRouterAssociation</a> operation to obtain the AssociationId as the next hop ID.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-j6c2fp57q8rr4jlu****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The type of the next hop of the custom route entry. You can specify up to 50 next hop types. Valid values: </p>
             * <ul>
             * <li><p><strong>Instance</strong> (default): ECS instance.</p>
             * </li>
             * <li><p><strong>HaVip</strong>: high-availability virtual IP address.  </p>
             * </li>
             * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
             * </li>
             * <li><p><strong>NetworkInterface</strong>: elastic network interfaces (ENIs).</p>
             * </li>
             * <li><p><strong>VpnGateway</strong>: VPN gateway.</p>
             * </li>
             * <li><p><strong>IPv6Gateway</strong>: IPv6 gateway.</p>
             * </li>
             * <li><p><strong>NatGateway</strong>: NAT gateway.</p>
             * </li>
             * <li><p><strong>Attachment</strong>: forward router.</p>
             * </li>
             * <li><p><strong>VpcPeer</strong>: VPC peering connection.</p>
             * </li>
             * <li><p><strong>Ipv4Gateway</strong>: IPv4 gateway.</p>
             * </li>
             * <li><p><strong>GatewayEndpoint</strong>: gateway endpoint.</p>
             * </li>
             * <li><p><strong>CenBasic</strong>: CEN that does not support forward routers.</p>
             * </li>
             * <li><p><strong>Ecr</strong>: Express Connect Router (ECR).</p>
             * </li>
             * <li><p><strong>GatewayLoadBalancerEndpoint</strong>: Gateway Load Balancer endpoint (GWLBe).</p>
             * </li>
             * <li><p><strong>RouteTargetGroup</strong>: route target group.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RouterInterface</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The ID of the route table to which you want to add custom route entries. You can specify up to 50 route table IDs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzd****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteEntries build() {
                return new RouteEntries(this);
            } 

        } 

    }
}
