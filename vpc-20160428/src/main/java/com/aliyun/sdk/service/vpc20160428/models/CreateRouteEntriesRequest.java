// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RouteEntries> routeEntries;

    private CreateRouteEntriesRequest(Builder builder) {
        super(builder);
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
    public java.util.List < RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static final class Builder extends Request.Builder<CreateRouteEntriesRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < RouteEntries> routeEntries; 

        private Builder() {
            super();
        } 

        private Builder(CreateRouteEntriesRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeEntries = request.routeEntries;
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The routes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
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

            /**
             * <p>The description of the custom route. You can specify at most 50 descriptions.</p>
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
             * <p>The destination CIDR block of the custom route. IPv4 CIDR blocks, IPv6 CIDR blocks, and prefix lists are supported. You can enter up to 50 destination CIDR blocks. Make sure that the following requirements are met:</p>
             * <ul>
             * <li>The destination CIDR block cannot point to 100.64.0.0/10 or belong to 100.64.0.0/10.</li>
             * <li>The destination CIDR block of each route in the route table is unique.</li>
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
             * <p>The IP version. Valid values: You can specify at most 50 IP versions. Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: IPv4</li>
             * <li><strong>6</strong>: IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The name of the custom route that you want to add. You can specify at most 50 names.</p>
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
             * <p>The ID of the next hop for the custom route. You can specify at most 50 instance IDs.</p>
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
             * <p>The type of next hop. You can specify at most 50 next hop types. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong>: Elastic Compute Service (ECS) instance. This is the default value.</li>
             * <li><strong>HaVip</strong>: high-availability virtual IP address (HAVIP).</li>
             * <li><strong>RouterInterface</strong>: router interface.</li>
             * <li><strong>NetworkInterface</strong>: elastic network interface (ENI).</li>
             * <li><strong>VpnGateway</strong>: VPN gateway.</li>
             * <li><strong>IPv6Gateway</strong>: IPv6 gateway.</li>
             * <li><strong>NatGateway</strong>: NAT gateway.</li>
             * <li><strong>Attachment</strong>: transit router.</li>
             * <li><strong>VpcPeer</strong>: VPC peering connection.</li>
             * <li><strong>Ipv4Gateway</strong>: IPv4 gateway.</li>
             * <li><strong>GatewayEndpoint</strong>: gateway endpoint.</li>
             * <li><strong>CenBasic</strong>: CEN does not support transfer routers.</li>
             * <li><strong>Ecr</strong>: Express Connect Router (ECR).</li>
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
             * <p>The ID of the route table to which you want to add custom route s. You can specify at most 50 route table IDs.</p>
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
