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
 * {@link ModifyRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyRouteEntryRequest</p>
 */
public class ModifyRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewNextHopId")
    private String newNextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewNextHopType")
    private String newNextHopType;

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
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    private String routeEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    private ModifyRouteEntryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.dryRun = builder.dryRun;
        this.newNextHopId = builder.newNextHopId;
        this.newNextHopType = builder.newNextHopType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryId = builder.routeEntryId;
        this.routeEntryName = builder.routeEntryName;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return newNextHopId
     */
    public String getNewNextHopId() {
        return this.newNextHopId;
    }

    /**
     * @return newNextHopType
     */
    public String getNewNextHopType() {
        return this.newNextHopType;
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    /**
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder extends Request.Builder<ModifyRouteEntryRequest, Builder> {
        private String description; 
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String newNextHopId; 
        private String newNextHopType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryId; 
        private String routeEntryName; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRouteEntryRequest request) {
            super(request);
            this.description = request.description;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.dryRun = request.dryRun;
            this.newNextHopId = request.newNextHopId;
            this.newNextHopType = request.newNextHopType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryId = request.routeEntryId;
            this.routeEntryName = request.routeEntryName;
            this.routeTableId = request.routeTableId;
        } 

        /**
         * <p>The description of the route entry.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>EntryDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IPv4 CIDR block of the route entry. IPv4 and IPv6 CIDR blocks are supported.</p>
         * <blockquote>
         * <p>If the <strong>RouteEntryId</strong> parameter is not specified, the <strong>DestinationCidrBlock</strong> and <strong>RouteTableId</strong> parameters are required.
         * To change the IPv4 CIDR block of a route to a <strong>prefix list</strong>, you must specify the <strong>RouteEntryId</strong> parameter. The <strong>DestinationCidrBlock</strong> parameter does not support prefix list CIDR blocks or prefix list instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <p><strong>true</strong>: performs a dry run without modifying the route. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
         * <p><strong>false</strong> (default): sends a normal request. If the check succeeds, a 2xx HTTP status code is returned and the route is modified.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID of the new next hop of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp17y37ytsenqyim****</p>
         */
        public Builder newNextHopId(String newNextHopId) {
            this.putQueryParameter("NewNextHopId", newNextHopId);
            this.newNextHopId = newNextHopId;
            return this;
        }

        /**
         * <p>The new next hop type of the route entry. Valid values:</p>
         * <ul>
         * <li><p><strong>Instance</strong>: ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: high-availability virtual IP address.  </p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: elastic network interface (ENI).</p>
         * </li>
         * <li><p><strong>VpnGateway</strong>: VPN gateway.</p>
         * </li>
         * <li><p><strong>IPv6Gateway</strong>: IPv6 gateway.</p>
         * </li>
         * <li><p><strong>NatGateway</strong>: NAT gateway.</p>
         * </li>
         * <li><p><strong>Attachment</strong>: transit router.</p>
         * </li>
         * <li><p><strong>VpcPeer</strong>: VPC peering connection.</p>
         * </li>
         * <li><p><strong>Ipv4Gateway</strong>: IPv4 gateway.</p>
         * </li>
         * <li><p><strong>GatewayEndpoint</strong>: gateway endpoint.</p>
         * </li>
         * <li><p><strong>Ecr</strong>: Express Connect Router (ECR).</p>
         * </li>
         * <li><p><strong>GatewayLoadBalancerEndpoint</strong>: Gateway Load Balancer endpoint (GWLBe).</p>
         * </li>
         * <li><p><strong>RouteTargetGroup</strong>: route target group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        public Builder newNextHopType(String newNextHopType) {
            this.putQueryParameter("NewNextHopType", newNextHopType);
            this.newNextHopType = newNextHopType;
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
         * <p>The region ID of the route entry.</p>
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
         * <p>The ID of the custom route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-acfvgfsghfdd****</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * <p>The name of the route entry.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>EntryName</p>
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * <p>The route table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1nk7zk65du3pni8z9td</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public ModifyRouteEntryRequest build() {
            return new ModifyRouteEntryRequest(this);
        } 

    } 

}
