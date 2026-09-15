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
 * {@link CreateRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateRouteEntryRequest</p>
 */
public class CreateRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopId")
    private String nextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopList")
    private java.util.List<NextHopList> nextHopList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHopType")
    private String nextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    private String routeEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeTableId;

    private CreateRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.dryRun = builder.dryRun;
        this.nextHopId = builder.nextHopId;
        this.nextHopList = builder.nextHopList;
        this.nextHopType = builder.nextHopType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeEntryName = builder.routeEntryName;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return nextHopId
     */
    public String getNextHopId() {
        return this.nextHopId;
    }

    /**
     * @return nextHopList
     */
    public java.util.List<NextHopList> getNextHopList() {
        return this.nextHopList;
    }

    /**
     * @return nextHopType
     */
    public String getNextHopType() {
        return this.nextHopType;
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

    public static final class Builder extends Request.Builder<CreateRouteEntryRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String destinationCidrBlock; 
        private Boolean dryRun; 
        private String nextHopId; 
        private java.util.List<NextHopList> nextHopList; 
        private String nextHopType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeEntryName; 
        private String routeTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.dryRun = request.dryRun;
            this.nextHopId = request.nextHopId;
            this.nextHopList = request.nextHopList;
            this.nextHopType = request.nextHopType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntryName = request.routeEntryName;
            this.routeTableId = request.routeTableId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client. Make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the custom route entry.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block of the custom route entry. IPv4 CIDR blocks, IPv6 CIDR blocks, destination CIDR blocks of prefix lists, and instance IDs of prefix lists are supported. The following requirements must be met:</p>
         * <ul>
         * <li><p>The destination CIDR block cannot point to or be contained by 100.64.0.0/10.  </p>
         * </li>
         * <li><p>The destination CIDR blocks of different route entries in the same route table must be unique.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <ul>
         * <li><strong>true</strong>: performs a dry run without creating the route entry. The system checks required parameters, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. After the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the next hop instance of the custom route entry.</p>
         * <blockquote>
         * <h2>If you set NextHopType to ECR, you can call the <a href="https://help.aliyun.com/document_detail/2712069.html">DescribeExpressConnectRouterAssociation</a> operation to obtain the AssociationId as the next hop ID.</h2>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-j6c2fp57q8rr4jlu****</p>
         */
        public Builder nextHopId(String nextHopId) {
            this.putQueryParameter("NextHopId", nextHopId);
            this.nextHopId = nextHopId;
            return this;
        }

        /**
         * <p>The information about the next hop.</p>
         */
        public Builder nextHopList(java.util.List<NextHopList> nextHopList) {
            this.putQueryParameter("NextHopList", nextHopList);
            this.nextHopList = nextHopList;
            return this;
        }

        /**
         * <p>The type of next hop for the custom route entry. Valid values: </p>
         * <ul>
         * <li><p><strong>Instance</strong> (default): ECS instance.</p>
         * </li>
         * <li><p><strong>HaVip</strong>: high-availability virtual IP address.  </p>
         * </li>
         * <li><p><strong>RouterInterface</strong>: vRouter interface.</p>
         * </li>
         * <li><p><strong>NetworkInterface</strong>: network interface controller (NIC).</p>
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
         * <p>RouterInterface</p>
         */
        public Builder nextHopType(String nextHopType) {
            this.putQueryParameter("NextHopType", nextHopType);
            this.nextHopType = nextHopType;
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
         * <p>The region ID of the route table.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The name of the custom route entry to add.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        /**
         * <p>The ID of the route table to which you want to add a custom route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzd****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.putQueryParameter("RouteTableId", routeTableId);
            this.routeTableId = routeTableId;
            return this;
        }

        @Override
        public CreateRouteEntryRequest build() {
            return new CreateRouteEntryRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRouteEntryRequest} extends {@link TeaModel}
     *
     * <p>CreateRouteEntryRequest</p>
     */
    public static class NextHopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private NextHopList(Builder builder) {
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHopList create() {
            return builder().build();
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String nextHopId; 
            private String nextHopType; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(NextHopList model) {
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the next hop instance of the ECMP route.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-2zeo3xzyf3cd8r4****</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>The type of next hop for the ECMP route. Set the value to <strong>RouterInterface</strong> (router interface).</p>
             * 
             * <strong>example:</strong>
             * <p>RouterInterface</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The weight of the next hop for the ECMP route.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public NextHopList build() {
                return new NextHopList(this);
            } 

        } 

    }
}
